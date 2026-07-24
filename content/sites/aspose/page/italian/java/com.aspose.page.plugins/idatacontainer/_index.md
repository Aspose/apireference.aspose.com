---
title: "IDataContainer"
second_title: "Aspose.Page per Java API Reference"
description: "Interfaccia generale del contenitore dati che definisce i metodi comuni che le opzioni concrete del plugin contenitore dati dovrebbero implementare."
type: docs
weight: 20
url: /it/java/com.aspose.page.plugins/idatacontainer/
---```
public interface IDataContainer
```

General data container interface that defines common methods that concrete data container (plugin options) should implement.
## Methods

| Method | Description |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Adds new data source to the collection |
| [getDataCollection()](#getDataCollection--) | Gets collection of data sources |
### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public abstract void addDataSource(IDataSource dataSource)
```


Adds new data source to the collection

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) |  |

### getDataCollection() {#getDataCollection--}
```
public abstract List<IDataSource> getDataCollection()
```


Gets collection of data sources

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
