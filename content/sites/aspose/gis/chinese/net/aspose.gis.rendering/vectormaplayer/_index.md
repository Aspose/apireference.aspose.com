---
title: Class VectorMapLayer
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.Rendering.VectorMapLayer 班级. 里面一层Map表示向量层数据.
type: docs
weight: 2000
url: /zh/net/aspose.gis.rendering/vectormaplayer/
---
## VectorMapLayer class

里面一层[`Map`](../map/)表示向量层数据.

```csharp
public class VectorMapLayer : MapLayer
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [VectorMapLayer](vectormaplayer/#constructor)(FeaturesSequence) | 使用默认符号器创建新实例。 |
| [VectorMapLayer](vectormaplayer/#constructor_1)(FeaturesSequence, VectorSymbolizer) | 使用默认符号器创建新实例。 |
| [VectorMapLayer](vectormaplayer/#constructor_5)(VectorLayer, bool) | 使用默认符号器创建新实例。 |
| [VectorMapLayer](vectormaplayer/#constructor_2)(FeaturesSequence, VectorSymbolizer, Labeling) | 使用默认符号器创建新实例。 |
| [VectorMapLayer](vectormaplayer/#constructor_4)(VectorLayer, VectorSymbolizer, bool) | 创建新实例。 |
| [VectorMapLayer](vectormaplayer/#constructor_3)(VectorLayer, VectorSymbolizer, Labeling, bool) | 创建新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [FeaturesSequence](../../aspose.gis.rendering/vectormaplayer/featuressequence/) { get; } | 这个表示的特征序列`矢量地图图层`. |
| [Labeling](../../aspose.gis.rendering/vectormaplayer/labeling/) { get; set; } | 指定地图图层的变形选项。 |
| [Opacity](../../aspose.gis.rendering/maplayer/opacity/) { get; set; } | 层的不透明度。 |
| [Symbolizer](../../aspose.gis.rendering/vectormaplayer/symbolizer/) { get; set; } | 用于渲染图层特征的符号器。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| override [Dispose](../../aspose.gis.rendering/vectormaplayer/dispose/)() | 处置资源。 |
| [ImportSld](../../aspose.gis.rendering/vectormaplayer/importsld/#importsld)(AbstractPath, SldImportOptions) | 从位于指定路径的样式层描述符文件导入样式。 |
| [ImportSld](../../aspose.gis.rendering/vectormaplayer/importsld/#importsld_1)(string, SldImportOptions) | 从位于指定路径的样式层描述符文件导入样式。 |
| [ImportSldFromString](../../aspose.gis.rendering/vectormaplayer/importsldfromstring/)(string, SldImportOptions) | 从指定的样式层描述符字符串中导入样式。 |

### 也可以看看

* class [MapLayer](../maplayer/)
* 命名空间 [Aspose.Gis.Rendering](../../aspose.gis.rendering/)
* 部件 [Aspose.GIS](../../)


