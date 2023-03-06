---
title: Map.Add
second_title: Aspose.GIS for .NET API 参考
description: Map 方法. 创建一个VectorMapLayer使用默认符号器并将其添加到地图中图层按附加顺序呈现
type: docs
weight: 110
url: /zh/net/aspose.gis.rendering/map/add/
---
## Add(VectorLayer, bool) {#add_7}

创建一个[`VectorMapLayer`](../../vectormaplayer/)使用默认符号器并将其添加到地图中。图层按附加顺序呈现。

```csharp
public void Add(VectorLayer layer, bool keepOpen = false)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| layer | VectorLayer | 一个向量层来表示[`VectorMapLayer`](../../vectormaplayer/). |
| keepOpen | Boolean | `true`在之后保持矢量图层打开[`Map`](../)对象被处置； `false`处理图层. |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 图层是`null`. |

### 也可以看看

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [Map](../)
* 命名空间 [Aspose.Gis.Rendering](../../map/)
* 部件 [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, bool) {#add_6}

创建并添加一个[`VectorMapLayer`](../../vectormaplayer/)到地图。图层按附加顺序呈现。

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = false)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| layer | VectorLayer | 一个向量层来表示[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | 用于渲染的符号器。如果`null`使用默认符号。 |
| keepOpen | Boolean | `true`在之后保持矢量图层打开[`Map`](../)对象被处置； `false`处理图层. |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 图层是`null`. |

### 也可以看看

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* 命名空间 [Aspose.Gis.Rendering](../../map/)
* 部件 [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, Labeling, bool) {#add_5}

创建并添加一个[`VectorMapLayer`](../../vectormaplayer/)到地图。图层按附加顺序呈现。

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = false)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| layer | VectorLayer | 一个向量层来表示[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | 用于渲染的符号器。如果`null`使用默认符号。 |
| labeling | Labeling | 用于标记层中要素的标记。如果`null`， 默认[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/)将被使用. |
| keepOpen | Boolean | `true`在之后保持图层打开[`Map`](../)对象被处置；否则，`false`. |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 图层是`null`. |

### 也可以看看

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* 命名空间 [Aspose.Gis.Rendering](../../map/)
* 部件 [Aspose.GIS](../../../)

---

## Add(FeaturesSequence) {#add}

创建并添加一个[`VectorMapLayer`](../../vectormaplayer/)到地图。图层按附加顺序呈现。

```csharp
public void Add(FeaturesSequence featuresSequence)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 一个特征序列来表示[`VectorMapLayer`](../../vectormaplayer/). |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 特征序列是`null`. |

### 也可以看看

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [Map](../)
* 命名空间 [Aspose.Gis.Rendering](../../map/)
* 部件 [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer) {#add_1}

创建并添加一个[`VectorMapLayer`](../../vectormaplayer/)到地图。图层按附加顺序呈现。

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 一个特征序列来表示[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | 用于渲染的符号器。如果`null`使用默认符号。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 特征序列是`null`. |

### 也可以看看

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* 命名空间 [Aspose.Gis.Rendering](../../map/)
* 部件 [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer, Labeling) {#add_2}

创建并添加一个[`VectorMapLayer`](../../vectormaplayer/)到地图。图层按附加顺序呈现。

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, Labeling labeling)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 一个特征序列来表示[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | 用于渲染的符号器。 |
| labeling | Labeling | 用于标记层中要素的标记。如果`null`,[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/)将被使用. |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 特征序列是`null`. |

### 也可以看看

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* 命名空间 [Aspose.Gis.Rendering](../../map/)
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
| ArgumentNullException | 参数是`null`. |

### 也可以看看

* class [MapLayer](../../maplayer/)
* class [Map](../)
* 命名空间 [Aspose.Gis.Rendering](../../map/)
* 部件 [Aspose.GIS](../../../)

---

## Add(RasterLayer, RasterColorizer, bool) {#add_3}

创建一个[`RasterMapLayer`](../../rastermaplayer/)使用默认着色器并将其添加到地图中。

```csharp
public void Add(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| layer | RasterLayer | 一个向量层来表示[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/). |
| colorizer | RasterColorizer | 用于渲染的着色器。如果`null`使用默认着色器。 |
| keepOpen | Boolean | `true`在之后保持栅格图层打开[`Map`](../)对象被处置； `false`处理图层. |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 图层是`null`. |

### 也可以看看

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer/)
* class [Map](../)
* 命名空间 [Aspose.Gis.Rendering](../../map/)
* 部件 [Aspose.GIS](../../../)


