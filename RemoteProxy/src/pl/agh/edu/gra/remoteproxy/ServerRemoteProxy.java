package pl.agh.edu.gra.remoteproxy;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeoutException;

import pl.agh.edu.gra.remoteproxy.exceptions.NoRoomException;

public class ServerRemoteProxy {
	public List<Controller> initialise(GameMap map) throws TimeoutException {
		return null;
	}
	
	public Move moveRequest(Controller controller, Set<Move> availableMoves) {
		return null;
	}
	
	public void broadcast(ControllerState state) {
		
	}
	
	GameMap handleConnect(ClientType type) throws NoRoomException {
		return null;
	}
}
