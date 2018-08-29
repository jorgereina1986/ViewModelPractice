package com.jorgereina.viewmodelpractice;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class CustomViewModel extends ViewModel {

    private DataRepository dataRepository = new DataRepository();

    private final MutableLiveData<String> selectedPlayer = new MutableLiveData<>();

    public void selectedPlayer(String playerName) {
        selectedPlayer.setValue(playerName);
    }

    public MutableLiveData<String> getSelectedPlayer() {
        return selectedPlayer;
    }

    public String[] getPlayerList() {
        return dataRepository.getPlayers();
    }

    public Player getPlayerDetails(String name) {
        return dataRepository.getPlayerDetails(name);
    }
}
