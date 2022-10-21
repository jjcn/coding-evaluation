package com.aa.act.interview.org;

import java.util.*;

/**
 * A class for the structure of an organization.
 */
public abstract class Organization {

	/**
	 * The leader position of an organization.
	 */
	private Position root;

	public Organization() {
		root = createOrganization();
	}

	/**
	 * Find a position by its title.
	 * @param title
	 */
	protected Optional<Position> findPosition(Position p, String title) {
		if (p.getTitle().equals(title)) {
			return Optional.of(p);
		}
		Optional<Position> res = Optional.empty();
		Collection<Position> directs = p.getDirectReports();
		for (Position dir : directs) {
			res = findPosition(dir, title);
			if (res.isPresent()) {
				break;
			}
		}
		return res;
	}

	protected abstract Position createOrganization();
	
	/**
	 * hire the given person as an employee in the position that has that title
	 * 
	 * @param person
	 * @param title
	 * @return the newly filled position or empty if no position has that title
	 */
	public Optional<Position> hire(Name person, String title) {
		//your code here
		Optional<Position> optPosition = findPosition(root, title);
		optPosition.ifPresent(position -> {
			position.setEmployee(Optional.of(new Employee(person)));
		});
		return Optional.empty();
	}

	@Override
	public String toString() {
		return printOrganization(root, "");
	}
	
	private String printOrganization(Position pos, String prefix) {
		StringBuffer sb = new StringBuffer(prefix + "+-" + pos.toString() + "\n");
		for(Position p : pos.getDirectReports()) {
			sb.append(printOrganization(p, prefix + "\t"));
		}
		return sb.toString();
	}
}
