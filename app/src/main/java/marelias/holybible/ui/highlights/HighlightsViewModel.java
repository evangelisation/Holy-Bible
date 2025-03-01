package marelias.holybible.ui.highlights;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HighlightsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HighlightsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Here are the highlights");
    }

    public LiveData<String> getText() {
        return mText;
    }
}