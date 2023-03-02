---
title: Class SimpleLabeling
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.Rendering.Labelings.SimpleLabeling 班级. 一个简单的标签在每个特征上放置标签
type: docs
weight: 1700
url: /zh/net/aspose.gis.rendering.labelings/simplelabeling/
---
## SimpleLabeling class

一个简单的标签在每个特征上放置标签。

```csharp
public class SimpleLabeling : Labeling
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [SimpleLabeling](simplelabeling/#constructor)() | 初始化一个新的实例`SimpleLabeling`类. |
| [SimpleLabeling](simplelabeling/#constructor_1)(SimpleLabeling) | 初始化一个新的实例`SimpleLabeling`类. |
| [SimpleLabeling](simplelabeling/#constructor_2)(string) | 初始化一个新的实例`SimpleLabeling`类. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [FeatureBasedConfiguration](../../aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/) { get; set; } | 用于在处理功能之前配置此标签的回调。 |
| [FontColor](../../aspose.gis.rendering.labelings/simplelabeling/fontcolor/) { get; set; } | 确定文本的颜色。 |
| [FontFamily](../../aspose.gis.rendering.labelings/simplelabeling/fontfamily/) { get; set; } | 用于呈现文本的字体系列。默认值是系统相关值。 |
| [FontSize](../../aspose.gis.rendering.labelings/simplelabeling/fontsize/) { get; set; } | 文本的大小。 |
| [FontStyle](../../aspose.gis.rendering.labelings/simplelabeling/fontstyle/) { get; set; } | 应用于文本的样式。 |
| [GeometryExpression](../../aspose.gis.rendering.labelings/simplelabeling/geometryexpression/) { get; set; } | 提供一种方法来用修改过的标记替换要素几何。 此回调在之后的第一个调用[`FeatureBasedConfiguration`](./featurebasedconfiguration/). 默认为`null`（按原样使用要素几何）. |
| [HaloColor](../../aspose.gis.rendering.labelings/simplelabeling/halocolor/) { get; set; } | 文本周围的光晕（描边）的颜色。 |
| [HaloSize](../../aspose.gis.rendering.labelings/simplelabeling/halosize/) { get; set; } | 文本周围光晕（描边）的大小。 |
| [LabelAttribute](../../aspose.gis.rendering.labelings/simplelabeling/labelattribute/) { get; set; } | 用作标签源的属性名称。如果忽略[`LabelExpression`](./labelexpression/)已设置。 要么[`LabelAttribute`](./labelattribute/)或者[`LabelExpression`](./labelexpression/)必须在渲染前设置； InvalidOperationException否则抛出. |
| [LabelExpression](../../aspose.gis.rendering.labelings/simplelabeling/labelexpression/) { get; set; } | 提供一种自定义和格式化标签文本的方法。如果设置，覆盖[`LabelAttribute`](./labelattribute/). 要么[`LabelAttribute`](./labelattribute/)或者[`LabelExpression`](./labelexpression/)必须在渲染前设置； InvalidOperationException否则抛出. |
| [MultipartMode](../../aspose.gis.rendering.labelings/simplelabeling/multipartmode/) { get; set; } | 指定多部分几何体的渲染行为。默认是All. |
| [Placement](../../aspose.gis.rendering.labelings/simplelabeling/placement/) { get; set; } | 标签放置指定标签相对于要素几何的放置方式。 |
| [Priority](../../aspose.gis.rendering.labelings/simplelabeling/priority/) { get; set; } | 指示此标签的优先级，以防它与另一个标签重叠。优先级较低的标签不被渲染。 默认为 1000. |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Clone](../../aspose.gis.rendering.labelings/simplelabeling/clone/)() | 克隆此实例。 |

### 也可以看看

* class [Labeling](../labeling/)
* 命名空间 [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* 部件 [Aspose.GIS](../../)


