package pl.agh.edu.gra.remoteproxy;

import pl.agh.edu.gra.remoteproxy.exceptions.NoRoomException;

public class RPServerService {
	private ServerRemoteProxy proxy;
	public GameMap connect(ClientType type) throws NoRoomException {
		return proxy.handleConnect(ClientType.CONTROLLER);
		
	}
}
