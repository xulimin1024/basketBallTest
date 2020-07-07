package com.example.basketscoretest;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> aTeamScore;
    private MutableLiveData<Integer> bTeamScore;
    private int aBack, bBack;

    public MutableLiveData<Integer> getaTeamScore() {
        if (aTeamScore == null) {
            aTeamScore = new MutableLiveData<>();
            aTeamScore.setValue(0);
        }
        return aTeamScore;
    }

    public MutableLiveData<Integer> getbTeamScore() {
        if (bTeamScore == null) {
            bTeamScore = new MutableLiveData<>();
            bTeamScore.setValue(0);
        }
        return bTeamScore;
    }

    public void aTeamAdd(int n) {
        aBack = aTeamScore.getValue();
        bBack = bTeamScore.getValue();
        aTeamScore.setValue(aTeamScore.getValue() + n);
    }

    public void bTeamAdd(int n) {
        aBack = aTeamScore.getValue();
        bBack = bTeamScore.getValue();
        bTeamScore.setValue(bTeamScore.getValue() + n);
    }

    public void reset() {
        aBack = aTeamScore.getValue();
        bBack = bTeamScore.getValue();
        aTeamScore.setValue(0);
        bTeamScore.setValue(0);
    }
    //
    public void unDo(){
        aTeamScore.setValue(aBack);
        bTeamScore.setValue(bBack);
    }
}
