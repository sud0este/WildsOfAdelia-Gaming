package br.com.silva.gaming.profile;

public interface ProfileObserver {
    enum ProfileEvent {
        PROFILE_LOADED,
        SAVING_PROFILE,
        CLEAR_CURRENT_PROFILE
    }

    void onNotify(final ProfileManager profileManager, ProfileEvent event);
}
