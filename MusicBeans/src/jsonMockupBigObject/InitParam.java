package jsonMockupBigObject;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class InitParam {

@SerializedName("configGlossary:installationAt")
@Expose
private String configGlossaryInstallationAt;
@SerializedName("configGlossary:adminEmail")
@Expose
private String configGlossaryAdminEmail;
@SerializedName("configGlossary:poweredBy")
@Expose
private String configGlossaryPoweredBy;
@SerializedName("configGlossary:poweredByIcon")
@Expose
private String configGlossaryPoweredByIcon;
@SerializedName("configGlossary:staticPath")
@Expose
private String configGlossaryStaticPath;
@SerializedName("templateProcessorClass")
@Expose
private String templateProcessorClass;
@SerializedName("templateLoaderClass")
@Expose
private String templateLoaderClass;
@SerializedName("templatePath")
@Expose
private String templatePath;
@SerializedName("templateOverridePath")
@Expose
private String templateOverridePath;
@SerializedName("defaultListTemplate")
@Expose
private String defaultListTemplate;
@SerializedName("defaultFileTemplate")
@Expose
private String defaultFileTemplate;
@SerializedName("useJSP")
@Expose
private Boolean useJSP;
@SerializedName("jspListTemplate")
@Expose
private String jspListTemplate;
@SerializedName("jspFileTemplate")
@Expose
private String jspFileTemplate;
@SerializedName("cachePackageTagsTrack")
@Expose
private Integer cachePackageTagsTrack;
@SerializedName("cachePackageTagsStore")
@Expose
private Integer cachePackageTagsStore;
@SerializedName("cachePackageTagsRefresh")
@Expose
private Integer cachePackageTagsRefresh;
@SerializedName("cacheTemplatesTrack")
@Expose
private Integer cacheTemplatesTrack;
@SerializedName("cacheTemplatesStore")
@Expose
private Integer cacheTemplatesStore;
@SerializedName("cacheTemplatesRefresh")
@Expose
private Integer cacheTemplatesRefresh;
@SerializedName("cachePagesTrack")
@Expose
private Integer cachePagesTrack;
@SerializedName("cachePagesStore")
@Expose
private Integer cachePagesStore;
@SerializedName("cachePagesRefresh")
@Expose
private Integer cachePagesRefresh;
@SerializedName("cachePagesDirtyRead")
@Expose
private Integer cachePagesDirtyRead;
@SerializedName("searchEngineListTemplate")
@Expose
private String searchEngineListTemplate;
@SerializedName("searchEngineFileTemplate")
@Expose
private String searchEngineFileTemplate;
@SerializedName("searchEngineRobotsDb")
@Expose
private String searchEngineRobotsDb;
@SerializedName("useDataStore")
@Expose
private Boolean useDataStore;
@SerializedName("dataStoreClass")
@Expose
private String dataStoreClass;
@SerializedName("redirectionClass")
@Expose
private String redirectionClass;
@SerializedName("dataStoreName")
@Expose
private String dataStoreName;
@SerializedName("dataStoreDriver")
@Expose
private String dataStoreDriver;
@SerializedName("dataStoreUrl")
@Expose
private String dataStoreUrl;
@SerializedName("dataStoreUser")
@Expose
private String dataStoreUser;
@SerializedName("dataStorePassword")
@Expose
private String dataStorePassword;
@SerializedName("dataStoreTestQuery")
@Expose
private String dataStoreTestQuery;
@SerializedName("dataStoreLogFile")
@Expose
private String dataStoreLogFile;
@SerializedName("dataStoreInitConns")
@Expose
private Integer dataStoreInitConns;
@SerializedName("dataStoreMaxConns")
@Expose
private Integer dataStoreMaxConns;
@SerializedName("dataStoreConnUsageLimit")
@Expose
private Integer dataStoreConnUsageLimit;
@SerializedName("dataStoreLogLevel")
@Expose
private String dataStoreLogLevel;
@SerializedName("maxUrlLength")
@Expose
private Integer maxUrlLength;
@SerializedName("mailHost")
@Expose
private String mailHost;
@SerializedName("mailHostOverride")
@Expose
private String mailHostOverride;
@SerializedName("log")
@Expose
private Integer log;
@SerializedName("logLocation")
@Expose
private String logLocation;
@SerializedName("logMaxSize")
@Expose
private String logMaxSize;
@SerializedName("dataLog")
@Expose
private Integer dataLog;
@SerializedName("dataLogLocation")
@Expose
private String dataLogLocation;
@SerializedName("dataLogMaxSize")
@Expose
private String dataLogMaxSize;
@SerializedName("removePageCache")
@Expose
private String removePageCache;
@SerializedName("removeTemplateCache")
@Expose
private String removeTemplateCache;
@SerializedName("fileTransferFolder")
@Expose
private String fileTransferFolder;
@SerializedName("lookInContext")
@Expose
private Integer lookInContext;
@SerializedName("adminGroupID")
@Expose
private Integer adminGroupID;
@SerializedName("betaServer")
@Expose
private Boolean betaServer;

public String getConfigGlossaryInstallationAt() {
return configGlossaryInstallationAt;
}

public void setConfigGlossaryInstallationAt(String configGlossaryInstallationAt) {
this.configGlossaryInstallationAt = configGlossaryInstallationAt;
}

public String getConfigGlossaryAdminEmail() {
return configGlossaryAdminEmail;
}

public void setConfigGlossaryAdminEmail(String configGlossaryAdminEmail) {
this.configGlossaryAdminEmail = configGlossaryAdminEmail;
}

public String getConfigGlossaryPoweredBy() {
return configGlossaryPoweredBy;
}

public void setConfigGlossaryPoweredBy(String configGlossaryPoweredBy) {
this.configGlossaryPoweredBy = configGlossaryPoweredBy;
}

public String getConfigGlossaryPoweredByIcon() {
return configGlossaryPoweredByIcon;
}

public void setConfigGlossaryPoweredByIcon(String configGlossaryPoweredByIcon) {
this.configGlossaryPoweredByIcon = configGlossaryPoweredByIcon;
}

public String getConfigGlossaryStaticPath() {
return configGlossaryStaticPath;
}

public void setConfigGlossaryStaticPath(String configGlossaryStaticPath) {
this.configGlossaryStaticPath = configGlossaryStaticPath;
}

public String getTemplateProcessorClass() {
return templateProcessorClass;
}

public void setTemplateProcessorClass(String templateProcessorClass) {
this.templateProcessorClass = templateProcessorClass;
}

public String getTemplateLoaderClass() {
return templateLoaderClass;
}

public void setTemplateLoaderClass(String templateLoaderClass) {
this.templateLoaderClass = templateLoaderClass;
}

public String getTemplatePath() {
return templatePath;
}

public void setTemplatePath(String templatePath) {
this.templatePath = templatePath;
}

public String getTemplateOverridePath() {
return templateOverridePath;
}

public void setTemplateOverridePath(String templateOverridePath) {
this.templateOverridePath = templateOverridePath;
}

public String getDefaultListTemplate() {
return defaultListTemplate;
}

public void setDefaultListTemplate(String defaultListTemplate) {
this.defaultListTemplate = defaultListTemplate;
}

public String getDefaultFileTemplate() {
return defaultFileTemplate;
}

public void setDefaultFileTemplate(String defaultFileTemplate) {
this.defaultFileTemplate = defaultFileTemplate;
}

public Boolean getUseJSP() {
return useJSP;
}

public void setUseJSP(Boolean useJSP) {
this.useJSP = useJSP;
}

public String getJspListTemplate() {
return jspListTemplate;
}

public void setJspListTemplate(String jspListTemplate) {
this.jspListTemplate = jspListTemplate;
}

public String getJspFileTemplate() {
return jspFileTemplate;
}

public void setJspFileTemplate(String jspFileTemplate) {
this.jspFileTemplate = jspFileTemplate;
}

public Integer getCachePackageTagsTrack() {
return cachePackageTagsTrack;
}

public void setCachePackageTagsTrack(Integer cachePackageTagsTrack) {
this.cachePackageTagsTrack = cachePackageTagsTrack;
}

public Integer getCachePackageTagsStore() {
return cachePackageTagsStore;
}

public void setCachePackageTagsStore(Integer cachePackageTagsStore) {
this.cachePackageTagsStore = cachePackageTagsStore;
}

public Integer getCachePackageTagsRefresh() {
return cachePackageTagsRefresh;
}

public void setCachePackageTagsRefresh(Integer cachePackageTagsRefresh) {
this.cachePackageTagsRefresh = cachePackageTagsRefresh;
}

public Integer getCacheTemplatesTrack() {
return cacheTemplatesTrack;
}

public void setCacheTemplatesTrack(Integer cacheTemplatesTrack) {
this.cacheTemplatesTrack = cacheTemplatesTrack;
}

public Integer getCacheTemplatesStore() {
return cacheTemplatesStore;
}

public void setCacheTemplatesStore(Integer cacheTemplatesStore) {
this.cacheTemplatesStore = cacheTemplatesStore;
}

public Integer getCacheTemplatesRefresh() {
return cacheTemplatesRefresh;
}

public void setCacheTemplatesRefresh(Integer cacheTemplatesRefresh) {
this.cacheTemplatesRefresh = cacheTemplatesRefresh;
}

public Integer getCachePagesTrack() {
return cachePagesTrack;
}

public void setCachePagesTrack(Integer cachePagesTrack) {
this.cachePagesTrack = cachePagesTrack;
}

public Integer getCachePagesStore() {
return cachePagesStore;
}

public void setCachePagesStore(Integer cachePagesStore) {
this.cachePagesStore = cachePagesStore;
}

public Integer getCachePagesRefresh() {
return cachePagesRefresh;
}

public void setCachePagesRefresh(Integer cachePagesRefresh) {
this.cachePagesRefresh = cachePagesRefresh;
}

public Integer getCachePagesDirtyRead() {
return cachePagesDirtyRead;
}

public void setCachePagesDirtyRead(Integer cachePagesDirtyRead) {
this.cachePagesDirtyRead = cachePagesDirtyRead;
}

public String getSearchEngineListTemplate() {
return searchEngineListTemplate;
}

public void setSearchEngineListTemplate(String searchEngineListTemplate) {
this.searchEngineListTemplate = searchEngineListTemplate;
}

public String getSearchEngineFileTemplate() {
return searchEngineFileTemplate;
}

public void setSearchEngineFileTemplate(String searchEngineFileTemplate) {
this.searchEngineFileTemplate = searchEngineFileTemplate;
}

public String getSearchEngineRobotsDb() {
return searchEngineRobotsDb;
}

public void setSearchEngineRobotsDb(String searchEngineRobotsDb) {
this.searchEngineRobotsDb = searchEngineRobotsDb;
}

public Boolean getUseDataStore() {
return useDataStore;
}

public void setUseDataStore(Boolean useDataStore) {
this.useDataStore = useDataStore;
}

public String getDataStoreClass() {
return dataStoreClass;
}

public void setDataStoreClass(String dataStoreClass) {
this.dataStoreClass = dataStoreClass;
}

public String getRedirectionClass() {
return redirectionClass;
}

public void setRedirectionClass(String redirectionClass) {
this.redirectionClass = redirectionClass;
}

public String getDataStoreName() {
return dataStoreName;
}

public void setDataStoreName(String dataStoreName) {
this.dataStoreName = dataStoreName;
}

public String getDataStoreDriver() {
return dataStoreDriver;
}

public void setDataStoreDriver(String dataStoreDriver) {
this.dataStoreDriver = dataStoreDriver;
}

public String getDataStoreUrl() {
return dataStoreUrl;
}

public void setDataStoreUrl(String dataStoreUrl) {
this.dataStoreUrl = dataStoreUrl;
}

public String getDataStoreUser() {
return dataStoreUser;
}

public void setDataStoreUser(String dataStoreUser) {
this.dataStoreUser = dataStoreUser;
}

public String getDataStorePassword() {
return dataStorePassword;
}

public void setDataStorePassword(String dataStorePassword) {
this.dataStorePassword = dataStorePassword;
}

public String getDataStoreTestQuery() {
return dataStoreTestQuery;
}

public void setDataStoreTestQuery(String dataStoreTestQuery) {
this.dataStoreTestQuery = dataStoreTestQuery;
}

public String getDataStoreLogFile() {
return dataStoreLogFile;
}

public void setDataStoreLogFile(String dataStoreLogFile) {
this.dataStoreLogFile = dataStoreLogFile;
}

public Integer getDataStoreInitConns() {
return dataStoreInitConns;
}

public void setDataStoreInitConns(Integer dataStoreInitConns) {
this.dataStoreInitConns = dataStoreInitConns;
}

public Integer getDataStoreMaxConns() {
return dataStoreMaxConns;
}

public void setDataStoreMaxConns(Integer dataStoreMaxConns) {
this.dataStoreMaxConns = dataStoreMaxConns;
}

public Integer getDataStoreConnUsageLimit() {
return dataStoreConnUsageLimit;
}

public void setDataStoreConnUsageLimit(Integer dataStoreConnUsageLimit) {
this.dataStoreConnUsageLimit = dataStoreConnUsageLimit;
}

public String getDataStoreLogLevel() {
return dataStoreLogLevel;
}

public void setDataStoreLogLevel(String dataStoreLogLevel) {
this.dataStoreLogLevel = dataStoreLogLevel;
}

public Integer getMaxUrlLength() {
return maxUrlLength;
}

public void setMaxUrlLength(Integer maxUrlLength) {
this.maxUrlLength = maxUrlLength;
}

public String getMailHost() {
return mailHost;
}

public void setMailHost(String mailHost) {
this.mailHost = mailHost;
}

public String getMailHostOverride() {
return mailHostOverride;
}

public void setMailHostOverride(String mailHostOverride) {
this.mailHostOverride = mailHostOverride;
}

public Integer getLog() {
return log;
}

public void setLog(Integer log) {
this.log = log;
}

public String getLogLocation() {
return logLocation;
}

public void setLogLocation(String logLocation) {
this.logLocation = logLocation;
}

public String getLogMaxSize() {
return logMaxSize;
}

public void setLogMaxSize(String logMaxSize) {
this.logMaxSize = logMaxSize;
}

public Integer getDataLog() {
return dataLog;
}

public void setDataLog(Integer dataLog) {
this.dataLog = dataLog;
}

public String getDataLogLocation() {
return dataLogLocation;
}

public void setDataLogLocation(String dataLogLocation) {
this.dataLogLocation = dataLogLocation;
}

public String getDataLogMaxSize() {
return dataLogMaxSize;
}

public void setDataLogMaxSize(String dataLogMaxSize) {
this.dataLogMaxSize = dataLogMaxSize;
}

public String getRemovePageCache() {
return removePageCache;
}

public void setRemovePageCache(String removePageCache) {
this.removePageCache = removePageCache;
}

public String getRemoveTemplateCache() {
return removeTemplateCache;
}

public void setRemoveTemplateCache(String removeTemplateCache) {
this.removeTemplateCache = removeTemplateCache;
}

public String getFileTransferFolder() {
return fileTransferFolder;
}

public void setFileTransferFolder(String fileTransferFolder) {
this.fileTransferFolder = fileTransferFolder;
}

public Integer getLookInContext() {
return lookInContext;
}

public void setLookInContext(Integer lookInContext) {
this.lookInContext = lookInContext;
}

public Integer getAdminGroupID() {
return adminGroupID;
}

public void setAdminGroupID(Integer adminGroupID) {
this.adminGroupID = adminGroupID;
}

public Boolean getBetaServer() {
return betaServer;
}

public void setBetaServer(Boolean betaServer) {
this.betaServer = betaServer;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("configGlossaryInstallationAt", configGlossaryInstallationAt).append("configGlossaryAdminEmail", configGlossaryAdminEmail).append("configGlossaryPoweredBy", configGlossaryPoweredBy).append("configGlossaryPoweredByIcon", configGlossaryPoweredByIcon).append("configGlossaryStaticPath", configGlossaryStaticPath).append("templateProcessorClass", templateProcessorClass).append("templateLoaderClass", templateLoaderClass).append("templatePath", templatePath).append("templateOverridePath", templateOverridePath).append("defaultListTemplate", defaultListTemplate).append("defaultFileTemplate", defaultFileTemplate).append("useJSP", useJSP).append("jspListTemplate", jspListTemplate).append("jspFileTemplate", jspFileTemplate).append("cachePackageTagsTrack", cachePackageTagsTrack).append("cachePackageTagsStore", cachePackageTagsStore).append("cachePackageTagsRefresh", cachePackageTagsRefresh).append("cacheTemplatesTrack", cacheTemplatesTrack).append("cacheTemplatesStore", cacheTemplatesStore).append("cacheTemplatesRefresh", cacheTemplatesRefresh).append("cachePagesTrack", cachePagesTrack).append("cachePagesStore", cachePagesStore).append("cachePagesRefresh", cachePagesRefresh).append("cachePagesDirtyRead", cachePagesDirtyRead).append("searchEngineListTemplate", searchEngineListTemplate).append("searchEngineFileTemplate", searchEngineFileTemplate).append("searchEngineRobotsDb", searchEngineRobotsDb).append("useDataStore", useDataStore).append("dataStoreClass", dataStoreClass).append("redirectionClass", redirectionClass).append("dataStoreName", dataStoreName).append("dataStoreDriver", dataStoreDriver).append("dataStoreUrl", dataStoreUrl).append("dataStoreUser", dataStoreUser).append("dataStorePassword", dataStorePassword).append("dataStoreTestQuery", dataStoreTestQuery).append("dataStoreLogFile", dataStoreLogFile).append("dataStoreInitConns", dataStoreInitConns).append("dataStoreMaxConns", dataStoreMaxConns).append("dataStoreConnUsageLimit", dataStoreConnUsageLimit).append("dataStoreLogLevel", dataStoreLogLevel).append("maxUrlLength", maxUrlLength).append("mailHost", mailHost).append("mailHostOverride", mailHostOverride).append("log", log).append("logLocation", logLocation).append("logMaxSize", logMaxSize).append("dataLog", dataLog).append("dataLogLocation", dataLogLocation).append("dataLogMaxSize", dataLogMaxSize).append("removePageCache", removePageCache).append("removeTemplateCache", removeTemplateCache).append("fileTransferFolder", fileTransferFolder).append("lookInContext", lookInContext).append("adminGroupID", adminGroupID).append("betaServer", betaServer).toString();
}

}
