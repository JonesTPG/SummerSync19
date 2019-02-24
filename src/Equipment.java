/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joonas
 */
public class Equipment {
    
    boolean isDocCamera;
    boolean isPc;
    int hdmiAdapters;
    boolean isPresentationScreen;
    int microphoneAmount;

    public Equipment(boolean isDocCamera, boolean isPc, int hdmiAdapters, boolean isPresentationScreen, int microphoneAmount) {
        this.isDocCamera = isDocCamera;
        this.isPc = isPc;
        this.hdmiAdapters = hdmiAdapters;
        this.isPresentationScreen = isPresentationScreen;
        this.microphoneAmount = microphoneAmount;
    }
    
    public String showInformation() {
        return "Information...";
    }
}
