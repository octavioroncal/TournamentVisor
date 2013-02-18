package swingtournamentvisor.controller;

public abstract class ActionsFactory {
    
    public Action getAction(String action) {
        return factoryMethod(action);
    }

    protected abstract Action factoryMethod(String action);
    
}
