package example;

import java.util.HashMap;

public class WebSiteFactory {
    private HashMap<String, WebSite> webSites = new HashMap<>();

    /**
     * 获得网站分类
     *
     * @param key
     * @return
     */
    public WebSite getWebSiteCategory(String key) {
        WebSite webSite = webSites.get(key);
        if (webSite == null) {
            webSite = new ConcreteWebSite(key);
            webSites.put(key, webSite);
        }
        return webSite;
    } // getWebSiteCategory

    /**
     * 获得网站分类总数
     * @return
     */
    public int getWebSiteCount() {
        return webSites.size();
    } // getWebSiteCount
} // WebSiteFactory
