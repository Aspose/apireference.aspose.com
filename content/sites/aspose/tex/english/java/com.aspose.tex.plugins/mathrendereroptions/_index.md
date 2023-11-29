---
title: MathRendererOptions
second_title: Aspose.TeX for Java API Reference
description: The options for the MathRenderer plugin.
type: docs
weight: 14
url: /java/com.aspose.tex.plugins/mathrendereroptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.tex.FigureRendererOptions](../../com.aspose.tex/figurerendereroptions), [com.aspose.tex.MathRendererOptions](../../com.aspose.tex/mathrendereroptions)

**All Implemented Interfaces:**
[com.aspose.tex.plugins.IPluginOptions](../../com.aspose.tex.plugins/ipluginoptions)
```
public abstract class MathRendererOptions extends MathRendererOptions implements IPluginOptions
```

The options for the  MathRenderer  plugin.
## Methods

| Method | Description |
| --- | --- |
| [getInputDataCollection()](#getInputDataCollection--) | Gets the collection of data sources. |
| [addInputDataSource(IDataSource dataSource)](#addInputDataSource-com.aspose.tex.plugins.IDataSource-) | Adds a new data source to the collection. |
| [getOutputDataCollection()](#getOutputDataCollection--) | Gets the collection of targets for saving operation results. |
| [addOutputDataTarget(IDataSource dataTarget)](#addOutputDataTarget-com.aspose.tex.plugins.IDataSource-) | Adds a new input data target to the collection. |
| [getOperationName()](#getOperationName--) | Returns the operation name. |
### getInputDataCollection() {#getInputDataCollection--}
```
public List<IDataSource> getInputDataCollection()
```


Gets the collection of data sources.

**Returns:**
java.util.List<com.aspose.tex.plugins.IDataSource> - The collection of data sources.
### addInputDataSource(IDataSource dataSource) {#addInputDataSource-com.aspose.tex.plugins.IDataSource-}
```
public void addInputDataSource(IDataSource dataSource)
```


Adds a new data source to the collection.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.tex.plugins/idatasource) | The data source. |

### getOutputDataCollection() {#getOutputDataCollection--}
```
public List<IDataSource> getOutputDataCollection()
```


Gets the collection of targets for saving operation results.

**Returns:**
java.util.List<com.aspose.tex.plugins.IDataSource> - The collection of targets for saving operation results.
### addOutputDataTarget(IDataSource dataTarget) {#addOutputDataTarget-com.aspose.tex.plugins.IDataSource-}
```
public void addOutputDataTarget(IDataSource dataTarget)
```


Adds a new input data target to the collection.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dataTarget | [IDataSource](../../com.aspose.tex.plugins/idatasource) | The data target. |

### getOperationName() {#getOperationName--}
```
public String getOperationName()
```


Returns the operation name.

**Returns:**
java.lang.String - The operation name.
