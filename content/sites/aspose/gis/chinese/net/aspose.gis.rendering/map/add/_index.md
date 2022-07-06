---
title: Add
second_title: Aspose.GIS for .NET API 参考
description: 使用默认符号创建VectorMapLayeraspose.gis.rendering/vectormaplayer并将其添加到地图中图层按附加顺序呈现
type: docs
weight: 110
url: /zh/net/aspose.gis.rendering/map/add/
---
## Add(VectorLayer, bool) {#add_7}

使用默认符号创建[`VectorMapLayer`](../../vectormaplayer)并将其添加到地图中。图层按附加顺序呈现。

```csharp
public void Add(VectorLayer layer, bool keepOpen = false)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| layer | VectorLayer | 由[`VectorMapLayer`](../../vectormaplayer)表示的矢量图层。 |
| keepOpen | Boolean | `true`在Map之后保持矢量图层打开对象被处置； `false`配置图层。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 层是`null`。 |

### 也可以看看

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [Map](../../map)
* 命名空间 [Aspose.Gis.Rendering](../../map)
* 部件 [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, bool) {#add_6}

创建并添加[`VectorMapLayer`](../../vectormaplayer)到地图。图层按附加顺序呈现。

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = false)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| layer | VectorLayer | 由[`VectorMapLayer`](../../vectormaplayer)表示的矢量图层。 |
| symbolizer | VectorSymbolizer | 用于渲染的符号器。如果`null`，则使用默认符号。 |
| keepOpen | Boolean | `true`在Map之后保持矢量图层打开对象被处置； `false`配置图层。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 层是`null`。 |

### 也可以看看

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Map](../../map)
* 命名空间 [Aspose.Gis.Rendering](../../map)
* 部件 [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, Labeling, bool) {#add_5}

创建并添加[`VectorMapLayer`](../../vectormaplayer)到地图。图层按附加顺序呈现。

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = false)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| layer | VectorLayer | 由[`VectorMapLayer`](../../vectormaplayer)表示的矢量图层。 |
| symbolizer | VectorSymbolizer | 用于渲染的符号器。如果`null`，则使用默认符号。 |
| labeling | Labeling | 用于标记图层中的特征的标签。如果`null`，默认[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling)将被使用。 |
| keepOpen | Boolean | `true`在Map对象被释放；否则，`false`。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 层是`null`。 |

### 也可以看看

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling)
* class [Map](../../map)
* 命名空间 [Aspose.Gis.Rendering](../../map)
* 部件 [Aspose.GIS](../../../)

---

## Add(FeaturesSequence) {#add}

创建并添加[`VectorMapLayer`](../../vectormaplayer)到地图。图层按附加顺序呈现。

```csharp
public void Add(FeaturesSequence featuresSequence)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 由[`VectorMapLayer`](../../vectormaplayer)表示的特征序列。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 特征序列是`null`。 |

### 也可以看看

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [Map](../../map)
* 命名空间 [Aspose.Gis.Rendering](../../map)
* 部件 [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer) {#add_1}

创建并添加[`VectorMapLayer`](../../vectormaplayer)到地图。图层按附加顺序呈现。

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 由[`VectorMapLayer`](../../vectormaplayer)表示的特征序列。 |
| symbolizer | VectorSymbolizer | 用于渲染的符号器。如果`null`，则使用默认符号。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 特征序列是`null`。 |

### 也可以看看

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Map](../../map)
* 命名空间 [Aspose.Gis.Rendering](../../map)
* 部件 [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer, Labeling) {#add_2}

创建并添加[`VectorMapLayer`](../../vectormaplayer)到地图。图层按附加顺序呈现。

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, Labeling labeling)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 由[`VectorMapLayer`](../../vectormaplayer)表示的特征序列。 |
| symbolizer | VectorSymbolizer | 用于渲染的符号器。 |
| labeling | Labeling | 用于标记图层中的特征的标签。如果`null`，[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling)将被使用。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 特征序列为`null`。 |

### 也可以看看

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling)
* class [Map](../../map)
* 命名空间 [Aspose.Gis.Rendering](../../map)
* 部件 [Aspose.GIS](../../../)

---

## Add(MapLayer) {#add_4}

向地图添加图层。图层按附加顺序呈现。

```csharp
public void Add(MapLayer mapLayer)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| mapLayer | MapLayer | 要添加的图层。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`。 |

### 也可以看看

* class [MapLayer](../../maplayer)
* class [Map](../../map)
* 命名空间 [Aspose.Gis.Rendering](../../map)
* 部件 [Aspose.GIS](../../../)

---

## Add(RasterLayer, RasterColorizer, bool) {#add_3}

使用默认着色器创建[`RasterMapLayer`](../../rastermaplayer)并将其添加到地图中。

```csharp
public void Add(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| layer | RasterLayer | 由[`RasterLayer`](../../../aspose.gis.raster/rasterlayer)表示的矢量图层。 |
| colorizer | RasterColorizer | 用于渲染的着色器。如果`null`，则使用默认着色器。 |
| keepOpen | Boolean | `true`在Map之后保持栅格图层打开对象被处置； `false`配置图层。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 层是`null`。 |

### 也可以看看

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer)
* class [Map](../../map)
* 命名空间 [Aspose.Gis.Rendering](../../map)
* 部件 [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
