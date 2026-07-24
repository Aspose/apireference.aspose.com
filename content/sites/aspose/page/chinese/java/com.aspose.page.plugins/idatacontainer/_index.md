---
title: "IDataContainer"
second_title: "Aspose.Page for Java API 参考"
description: "通用数据容器接口，定义具体数据容器插件选项应实现的常用方法。"
type: docs
weight: 20
url: /zh/java/com.aspose.page.plugins/idatacontainer/
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
