package ViewModel;

import androidx.lifecycle.ViewModel;

import Model.ComparisonModel;

public class ComparisonViewModel extends ViewModel {
    private ComparisonModel comparisonModel = new ComparisonModel();

    public boolean compareStrings(String str1, String str2) {
        return comparisonModel.compareStrings(str1, str2);
    }
}