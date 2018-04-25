package com.ramotion.paperonboarding;

import android.graphics.Typeface;

import java.io.Serializable;

/**
 * Represents content for one page of Paper Onboarding
 */
public class PaperOnboardingPage implements Serializable {

    private String titleText;
    private int titleColor;
    private String descriptionText;
    private int descriptionColor;
    private int bgColor;
    private int contentIconRes;
    private int bottomBarIconRes;
    private Typeface textFont;
    private Typeface descriptionFont;

    public PaperOnboardingPage() {
    }

    public PaperOnboardingPage(
            int contentIconRes,
            String titleText,
            String descriptionText,
            int bottomBarIconRes,
            int bgColor,
            int titleColor,
            int descriptionColor,
            Typeface textFont,
            Typeface descriptionFont
    ) {
        this.contentIconRes = contentIconRes;
        this.titleText = titleText;
        this.descriptionText = descriptionText;
        this.bottomBarIconRes = bottomBarIconRes;
        this.bgColor = bgColor;
        this.titleColor = titleColor;
        this.descriptionColor = descriptionColor;
        this.textFont = textFont;
        this.descriptionFont = descriptionFont;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public int getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(int titleColor) {
        this.titleColor = titleColor;
    }

    public int getDescriptionColor() {
        return descriptionColor;
    }

    public void setDescriptionColor(int descriptionColor) {
        this.descriptionColor = descriptionColor;
    }

    public Typeface getTextFont() {
        return textFont;
    }

    public void setTextFont(Typeface textFont) {
        this.textFont = textFont;
    }

    public Typeface getDescriptionFont() {
        return descriptionFont;
    }

    public void setDescriptionFont(Typeface descriptionFont) {
        this.descriptionFont = descriptionFont;
    }

    public String getDescriptionText() {
        return descriptionText;
    }

    public void setDescriptionText(String descriptionText) {
        this.descriptionText = descriptionText;
    }

    public int getContentIconRes() {
        return contentIconRes;
    }

    public void setContentIconRes(int contentIconRes) {
        this.contentIconRes = contentIconRes;
    }

    public int getBottomBarIconRes() {
        return bottomBarIconRes;
    }

    public void setBottomBarIconRes(int bottomBarIconRes) {
        this.bottomBarIconRes = bottomBarIconRes;
    }

    public int getBgColor() {
        return bgColor;
    }

    public void setBgColor(int bgColor) {
        this.bgColor = bgColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaperOnboardingPage that = (PaperOnboardingPage) o;

        if (bgColor != that.bgColor) return false;
        if (contentIconRes != that.contentIconRes) return false;
        if (bottomBarIconRes != that.bottomBarIconRes) return false;
        if (titleText != null ? !titleText.equals(that.titleText) : that.titleText != null)
            return false;
        return descriptionText != null ? descriptionText.equals(that.descriptionText) : that.descriptionText == null;

    }

    @Override
    public int hashCode() {
        int result = titleText != null ? titleText.hashCode() : 0;
        result = 31 * result + (descriptionText != null ? descriptionText.hashCode() : 0);
        result = 31 * result + bgColor;
        result = 31 * result + contentIconRes;
        result = 31 * result + bottomBarIconRes;
        return result;
    }

    @Override
    public String toString() {
        return "PaperOnboardingPage{" +
                "titleText='" + titleText + '\'' +
                ", descriptionText='" + descriptionText + '\'' +
                ", bgColor=" + bgColor +
                ", contentIconRes=" + contentIconRes +
                ", bottomBarIconRes=" + bottomBarIconRes +
                '}';
    }
}
