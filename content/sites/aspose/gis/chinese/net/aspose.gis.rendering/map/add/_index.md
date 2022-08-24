---
title: Add
second_title: Aspose.GIS for .NET API 参考
description: 创建一个VectorMapLayeraspose.gis.rendering/vectormaplayer使用默认符号并将其添加到地图中图层按附加顺序渲染
type: docs
weight: 110
url: /zh/net/aspose.gis.rendering/map/add/
---
## Add(VectorLayer, bool) {#add_7}

创建一个[`VectorMapLayer`](../../vectormaplayer)使用默认符号并将其添加到地图中。图层按附加顺序渲染。

```csharp
public void Add(VectorLayer layer, bool keepOpen = false)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| layer | VectorLayer | 要表示的矢量图层[`VectorMapLayer`](../../vectormaplayer). |
| keepOpen | Boolean | `true`离开矢量图层后打开[`Map`](../../map)对象已处置； `false`处置层。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 层是`null`. |

### 也可以看看

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [Map](../../map)
* 命名空间 [Aspose.Gis.Rendering](../../map)
* 部件 [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, bool) {#add_6}

创建并添加一个[`VectorMapLayer`](../../vectormaplayer)到地图。图层按附加顺序渲染。

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = false)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| layer | VectorLayer | 要表示的矢量图层[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | 用于渲染的符号器。如果`null`使用默认符号。 |
| keepOpen | Boolean | `true`离开矢量图层后打开[`Map`](../../map)对象已处置； `false`处置层。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 层是`null`. |

### 也可以看看

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Map](../../map)
* 命名空间 [Aspose.Gis.Rendering](../../map)
* 部件 [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, Labeling, bool) {#add_5}

创建并添加一个[`VectorMapLayer`](../../vectormaplayer)到地图。图层按附加顺序渲染。

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = false)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| layer | VectorLayer | 要表示的矢量图层[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | 用于渲染的符号器。如果`null`使用默认符号。 |
| labeling | Labeling | 用于标记图层中的特征的标签。如果`null`， 默认[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling)将被使用。 |
| keepOpen | Boolean | `true`之后让图层保持打开状态[`Map`](../../map)对象被处置；否则，`false`. |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 层是`null`. |

### 也可以看看

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling)
* class [Map](../../map)
* 命名空间 [Aspose.Gis.Rendering](../../map)
* 部件 [Aspose.GIS](../../../)

---

## Add(FeaturesSequence) {#add}

创建并添加一个[`VectorMapLayer`](../../vectormaplayer)到地图。图层按附加顺序渲染。

```csharp
public void Add(FeaturesSequence featuresSequence)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 要表示的特征序列[`VectorMapLayer`](../../vectormaplayer). |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 特征序列是`null`. |

### 也可以看看

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [Map](../../map)
* 命名空间 [Aspose.Gis.Rendering](../../map)
* 部件 [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer) {#add_1}

创建并添加一个[`VectorMapLayer`](../../vectormaplayer)到地图。图层按附加顺序渲染。

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 要表示的特征序列[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | 用于渲染的符号器。如果`null`使用默认符号。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 特征序列是`null`. |

### 也可以看看

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Map](../../map)
* 命名空间 [Aspose.Gis.Rendering](../../map)
* 部件 [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer, Labeling) {#add_2}

创建并添加一个[`VectorMapLayer`](../../vectormaplayer)到地图。图层按附加顺序渲染。

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, Labeling labeling)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 要表示的特征序列[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | 用于渲染的符号器。 |
| labeling | Labeling | 用于标记图层中的特征的标签。如果`null`,[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling)将被使用。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 特征序列是`null`. |

### 也可以看看

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling)
* class [Map](../../map)
* 命名空间 [Aspose.Gis.Rendering](../../map)
* 部件 [Aspose.GIS](../../../)

---

## Add(MapLayer) {#add_4}

向地图添加图层。图层按附加顺序渲染。

```csharp
public void Add(MapLayer mapLayer)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| mapLayer | MapLayer | 要添加的图层。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 论据是`null`. |

### 也可以看看

* class [MapLayer](../../maplayer)
* class [Map](../../map)
* 命名空间 [Aspose.Gis.Rendering](../../map)
* 部件 [Aspose.GIS](../../../)

---

## Add(RasterLayer, RasterColorizer, bool) {#add_3}

创建一个[`RasterMapLayer`](../../rastermaplayer)使用默认着色器并将其添加到地图中。

```csharp
public void Add(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| layer | RasterLayer | 要表示的矢量图层[`RasterLayer`](../../../aspose.gis.raster/rasterlayer). |
| colorizer | RasterColorizer | 用于渲染的着色器。如果`null`使用默认着色器。 |
| keepOpen | Boolean | `true`之后保持栅格图层打开[`Map`](../../map)对象已处置； `false`处置层。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 层是`null`. |

### 也可以看看

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer)
* class [Map](../../map)
* 命名空间 [Aspose.Gis.Rendering](../../map)
* 部件 [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
