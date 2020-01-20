package chess;

import boardgame.BoardExeception;

public class ChessExecption extends BoardExeception{
	private static final long serialVersionUID = 1L;

	public ChessExecption(String msg) {
		super(msg);
	}
}
