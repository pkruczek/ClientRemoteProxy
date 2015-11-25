package pl.agh.edu.gra.remoteproxy;

import java.util.Set;
import java.util.concurrent.TimeoutException;

public class ClientService {
	private ClientActionHandler handler;
	
	public Move moveRequest(Controller controller, Set<Move> availableMoves) throws TimeoutException {
		return null;
	}
	
	void brodcast(ControllerState state) {
		
	}
}
