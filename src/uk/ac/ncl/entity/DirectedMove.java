/**
 * @author Kostiantyn Potomkin
 * @version 0.9
 * @since 05-03-2020
 */
package uk.ac.ncl.entity;


/**
 * This is representing a directed move
 */
public class DirectedMove {

    private Cell cell;

    private int[] direction;


    /**
     * This is a constructor for the DirectedMove object
     * @param cell
     * @param direction
     */
    public DirectedMove(Cell cell, int[] direction) {
        this.cell = cell;
        this.direction = direction;
    }

    public Cell getCell() {
        return cell;
    }

    public int[] getDirection() {
        return direction;
    }
}
