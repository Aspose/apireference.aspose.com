---
title: "ISaveInstruction"
second_title: "Java için Aspose.Page API Referansı"
description: "Somut eklenti seçeneğinin uygulaması gereken ortak üyeleri tanımlayan genel kaydetme talimatı arayüzü."
type: docs
weight: 25
url: /tr/java/com.aspose.page.plugins/isaveinstruction/
---```
public interface ISaveInstruction
```

General save instruction interface that defines common members that concrete plugin option should implement.
## Methods

| Method | Description |
| --- | --- |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Adds new result save target |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Gets the collection of added targets (file or stream data sources) for saving operation results. |
### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public abstract void addSaveDataSource(IDataSource saveDataSource)
```


Adds new result save target

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Target (file or stream data source) for saving operation results. |

### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public abstract List<IDataSource> getSaveTargetsCollection()
```


Gets the collection of added targets (file or stream data sources) for saving operation results.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
