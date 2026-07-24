---
title: "IDataContainer"
second_title: "Aspose.Page용 Java API 참조"
description: "구체적인 데이터 컨테이너 플러그인 옵션이 구현해야 하는 공통 메서드를 정의하는 일반 데이터 컨테이너 인터페이스입니다."
type: docs
weight: 20
url: /ko/java/com.aspose.page.plugins/idatacontainer/
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
