---
title: "IDataContainer"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Interfaz de contenedor de datos general que define los métodos comunes que las opciones de plugin de contenedor de datos concretas deben implementar."
type: docs
weight: 20
url: /es/java/com.aspose.page.plugins/idatacontainer/
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
