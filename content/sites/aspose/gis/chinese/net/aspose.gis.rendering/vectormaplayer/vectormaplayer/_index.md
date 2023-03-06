---
title: VectorMapLayer.VectorMapLayer
second_title: Aspose.GIS for .NET API 参考
description: VectorMapLayer 构造函数. 使用默认符号器创建新实例
type: docs
weight: 10
url: /zh/net/aspose.gis.rendering/vectormaplayer/vectormaplayer/
---
## VectorMapLayer(FeaturesSequence) {#constructor}

使用默认符号器创建新实例。

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 特征序列。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |

### 也可以看看

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorMapLayer](../)
* 命名空间 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 部件 [Aspose.GIS](../../../)

---

## VectorMapLayer(FeaturesSequence, VectorSymbolizer) {#constructor_1}

使用默认符号器创建新实例。

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 特征序列。 |
| symbolizer | VectorSymbolizer | 用于渲染图层的符号器。如果`null`，将使用默认符号。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |

### 也可以看看

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [VectorMapLayer](../)
* 命名空间 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 部件 [Aspose.GIS](../../../)

---

## VectorMapLayer(FeaturesSequence, VectorSymbolizer, Labeling) {#constructor_2}

使用默认符号器创建新实例。

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, 
    Labeling labeling)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 特征序列。 |
| symbolizer | VectorSymbolizer | 用于渲染图层的符号器。如果`null`，将使用默认符号。 |
| labeling | Labeling | 用于标记层中要素的标记。如果`null`， 默认[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/)将被使用. |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |

### 也可以看看

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [VectorMapLayer](../)
* 命名空间 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 部件 [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, bool) {#constructor_5}

使用默认符号器创建新实例。

```csharp
public VectorMapLayer(VectorLayer layer, bool keepOpen = true)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| layer | VectorLayer | 矢量层。 |
| keepOpen | Boolean | `true`在之后保持图层打开[`VectorMapLayer`](../)对象被处置；否则，`false`. |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 图层是`null`. |

### 也可以看看

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorMapLayer](../)
* 命名空间 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 部件 [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, VectorSymbolizer, bool) {#constructor_4}

创建新实例。

```csharp
public VectorMapLayer(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = true)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| layer | VectorLayer | 矢量层。 |
| symbolizer | VectorSymbolizer | 用于渲染图层的符号器。如果`null`，将使用默认符号。 |
| keepOpen | Boolean | `true`在之后保持图层打开[`VectorMapLayer`](../)对象被处置；否则，`false`. |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 图层是`null`. |

### 也可以看看

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [VectorMapLayer](../)
* 命名空间 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 部件 [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, VectorSymbolizer, Labeling, bool) {#constructor_3}

创建新实例。

```csharp
public VectorMapLayer(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = true)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| layer | VectorLayer | 矢量层。 |
| symbolizer | VectorSymbolizer | 用于渲染图层的符号器。如果`null`，将使用默认符号。 |
| labeling | Labeling | 用于标记层中要素的标记。如果`null`， 默认[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/)将被使用. |
| keepOpen | Boolean | `true`在之后保持图层打开[`VectorMapLayer`](../)对象被处置；否则，`false`. |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 图层是`null`. |

### 也可以看看

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [VectorMapLayer](../)
* 命名空间 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 部件 [Aspose.GIS](../../../)


