package example;

/**
 * 联合国安全理事会
 */
public class UnitedNationSecurityCouncil implements UnitedNation {
    private USA usa;
    private Iraq iraq;

    @Override
    public void declare(String message, Country country) {
        if (country == usa) {
            iraq.getMessage(message);
        } else {
            usa.getMessage(message);
        }
    }

    public void setUsa(USA usa) {
        this.usa = usa;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }
} // UnitedNationSecurityCouncil
