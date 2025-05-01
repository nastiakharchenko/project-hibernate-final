package com.javarush.redis;

import java.math.BigDecimal;
import java.util.Objects;

public class Language {
    private String language;
    private Boolean isOfficial;
    private BigDecimal percentage;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getOfficial() {
        return isOfficial;
    }

    public void setOfficial(Boolean official) {
        isOfficial = official;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Language language1)) return false;
        return Objects.equals(language, language1.language) && Objects.equals(isOfficial, language1.isOfficial) && Objects.equals(percentage, language1.percentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, isOfficial, percentage);
    }
}
