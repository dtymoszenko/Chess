public abstract class Tile {

    int tileLocation;

    Tile(int tileLocation) {
        this.tileLocation = tileLocation;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();

    public static final class EmptyTile extends Tile{
        EmptyTile(int location) {
            super(location);
        }
        @Override
        public boolean isTileOccupied() {
            return false; //Since the tile is empty, it must not be occupied
        }
        @Override
        public Piece getPiece() {
            return null; //Since the tile is empty, there is no piece on that tile.
        }
    }
    public static final class occupiedTile extends Tile{
        Piece pieceOnTile;
        occupiedTile(int tileLocation, Piece pieceOnTile) {
            super(tileLocation);
            this.pieceOnTile = pieceOnTile;
        }
        @Override
        public boolean isTileOccupied() {
            return true; //The tile is occupied, always return true.
        }
        @Override
        public Piece getPiece() {
            return this.pieceOnTile; //Return the piece that is on the occupied tile.
        }
    }
}
