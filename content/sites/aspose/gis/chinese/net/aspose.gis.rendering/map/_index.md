---
title: Class Map
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.Rendering.Map 班级. Map 是层的集合可以通过Renderer.
type: docs
weight: 1720
url: /zh/net/aspose.gis.rendering/map/
---
## Map class

Map 是层的集合，可以通过[`Renderer`](../renderer/).

```csharp
public class Map : IDisposable, IReadOnlyList<MapLayer>
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [Map](map/)(Measurement, Measurement) | 创建新的实例`地图`类. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [BackgroundColor](../../aspose.gis.rendering/map/backgroundcolor/) { get; set; } | 地图的背景颜色。默认为Transparent. |
| [Count](../../aspose.gis.rendering/map/count/) { get; } | 获取地图中的层数。 |
| [Extent](../../aspose.gis.rendering/map/extent/) { get; set; } | 指定要渲染的地图边界。 如果设置为`null`，在渲染期间计算范围以包括所有图层中的所有几何图形。 |
| [Height](../../aspose.gis.rendering/map/height/) { get; set; } | 地图的视觉高度。 |
| [Item](../../aspose.gis.rendering/map/item/) { get; } | 获取指定索引处的图层。 |
| [Padding](../../aspose.gis.rendering/map/padding/) { get; set; } | 指定要添加到范围的填充。 |
| [Resolution](../../aspose.gis.rendering/map/resolution/) { get; set; } | 用于渲染此地图并在两者之间进行转换的分辨率[`Measurement`](../measurement/).默认为 96。 |
| [SpatialReferenceSystem](../../aspose.gis.rendering/map/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](./spatialreferencesystem/)的地图。 |
| [Width](../../aspose.gis.rendering/map/width/) { get; set; } | 地图的视觉宽度。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Add](../../aspose.gis.rendering/map/add/#add)(FeaturesSequence) | 创建并添加一个[`VectorMapLayer`](../vectormaplayer/)到地图。图层按附加顺序呈现。 |
| [Add](../../aspose.gis.rendering/map/add/#add_4)(MapLayer) | 向地图添加图层。图层按附加顺序呈现。 |
| [Add](../../aspose.gis.rendering/map/add/#add_1)(FeaturesSequence, VectorSymbolizer) | 创建并添加一个[`VectorMapLayer`](../vectormaplayer/)到地图。图层按附加顺序呈现。 |
| [Add](../../aspose.gis.rendering/map/add/#add_7)(VectorLayer, bool) | 创建一个[`VectorMapLayer`](../vectormaplayer/)使用默认符号器并将其添加到地图中。图层按附加顺序呈现。 |
| [Add](../../aspose.gis.rendering/map/add/#add_2)(FeaturesSequence, VectorSymbolizer, Labeling) | 创建并添加一个[`VectorMapLayer`](../vectormaplayer/)到地图。图层按附加顺序呈现。 |
| [Add](../../aspose.gis.rendering/map/add/#add_3)(RasterLayer, RasterColorizer, bool) | 创建一个[`RasterMapLayer`](../rastermaplayer/)使用默认着色器并将其添加到地图中。 |
| [Add](../../aspose.gis.rendering/map/add/#add_6)(VectorLayer, VectorSymbolizer, bool) | 创建并添加一个[`VectorMapLayer`](../vectormaplayer/)到地图。图层按附加顺序呈现。 |
| [Add](../../aspose.gis.rendering/map/add/#add_5)(VectorLayer, VectorSymbolizer, Labeling, bool) | 创建并添加一个[`VectorMapLayer`](../vectormaplayer/)到地图。图层按附加顺序呈现。 |
| [Dispose](../../aspose.gis.rendering/map/dispose/)() | 处置资源。 |
| [GetEnumerator](../../aspose.gis.rendering/map/getenumerator/)() | 返回一个遍历地图中各层的枚举器。 |
| [Render](../../aspose.gis.rendering/map/render/#render)(AbstractPath, Renderer) | 将地图渲染到文件中。 |
| [Render](../../aspose.gis.rendering/map/render/#render_1)(string, Renderer) | 将地图渲染到文件中。 |

### 也可以看看

* class [MapLayer](../maplayer/)
* 命名空间 [Aspose.Gis.Rendering](../../aspose.gis.rendering/)
* 部件 [Aspose.GIS](../../)


