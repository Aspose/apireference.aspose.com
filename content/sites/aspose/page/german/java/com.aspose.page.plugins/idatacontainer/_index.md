---
title: "IDataContainer"
second_title: "Aspose.Page for Java API-Referenz"
description: "Allgemeine Datencontainer-Schnittstelle, die gemeinsame Methoden definiert, die konkrete Datencontainer-Plugin-Optionen implementieren sollten."
type: docs
weight: 20
url: /de/java/com.aspose.page.plugins/idatacontainer/
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
