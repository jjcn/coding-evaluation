package com.aa.act.interview.org;

import javafx.geometry.Pos;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Helper class that traverse through a position tree.
 */
public class PositionTraverser {

    /**
     * Helper function that traverses through all positions through directReports.
     * @return a Set of positions
     */
    protected Set<Position> traversePosition(Position p) {
        Set<Position> positions = new HashSet<>();
        positions.add(p);
        Collection<Position> directReports = p.getDirectReports();
        if (!directReports.isEmpty()) {
            for (Position directReport : directReports) {
                positions.addAll(traversePosition(directReport));
            }
        }
        return positions;
    }

}
