---
title: Class SimpleLabeling
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Rendering.Labelings.SimpleLabeling class. A simple labeling places label on every feature
type: docs
weight: 4150
url: /net/aspose.gis.rendering.labelings/simplelabeling/
---
## SimpleLabeling class

A simple labeling places label on every feature.

```csharp
public class SimpleLabeling : Labeling
```

## Constructors

| Name | Description |
| --- | --- |
| [SimpleLabeling](simplelabeling/#constructor)() | Initializes a new instance of the `SimpleLabeling` class. |
| [SimpleLabeling](simplelabeling/#constructor_1)(SimpleLabeling) | Initializes a new instance of the `SimpleLabeling` class. |
| [SimpleLabeling](simplelabeling/#constructor_2)(string) | Initializes a new instance of the `SimpleLabeling` class. |

## Properties

| Name | Description |
| --- | --- |
| [FeatureBasedConfiguration](../../aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/) { get; set; } | A callback that is used to configure this labeling before handling a feature. |
| [FontColor](../../aspose.gis.rendering.labelings/simplelabeling/fontcolor/) { get; set; } | Determines color of text. |
| [FontFamily](../../aspose.gis.rendering.labelings/simplelabeling/fontfamily/) { get; set; } | Font family to use to render text. The default is system dependent value. |
| [FontSize](../../aspose.gis.rendering.labelings/simplelabeling/fontsize/) { get; set; } | Size of the text. |
| [FontStyle](../../aspose.gis.rendering.labelings/simplelabeling/fontstyle/) { get; set; } | Style to apply to text. |
| [GeometryExpression](../../aspose.gis.rendering.labelings/simplelabeling/geometryexpression/) { get; set; } | Provides a way to substitute the feature geometry with a one modified for labeling. This callback is invoked the first after [`FeatureBasedConfiguration`](./featurebasedconfiguration/) . Default is `null` (use feature geometry as-is). |
| [HaloColor](../../aspose.gis.rendering.labelings/simplelabeling/halocolor/) { get; set; } | Color of the halo (stroke) around text. |
| [HaloSize](../../aspose.gis.rendering.labelings/simplelabeling/halosize/) { get; set; } | Size of the halo (stroke) around text. |
| [LabelAttribute](../../aspose.gis.rendering.labelings/simplelabeling/labelattribute/) { get; set; } | Attribute name to use as a source of labels. Ignored if [`LabelExpression`](./labelexpression/) is set. Either [`LabelAttribute`](./labelattribute/) or [`LabelExpression`](./labelexpression/) must be set before rendering; InvalidOperationException is thrown otherwise. |
| [LabelExpression](../../aspose.gis.rendering.labelings/simplelabeling/labelexpression/) { get; set; } | Provides a way to customize and format label text. If set, overrides [`LabelAttribute`](./labelattribute/). Either [`LabelAttribute`](./labelattribute/) or [`LabelExpression`](./labelexpression/) must be set before rendering; InvalidOperationException is thrown otherwise. |
| [MultipartMode](../../aspose.gis.rendering.labelings/simplelabeling/multipartmode/) { get; set; } | Specifies rendering behavior for multipart geometries. Default is All. |
| [Placement](../../aspose.gis.rendering.labelings/simplelabeling/placement/) { get; set; } | Label placement specifies how labels are placed relatively to feature's geometries. |
| [Priority](../../aspose.gis.rendering.labelings/simplelabeling/priority/) { get; set; } | Indicates priority of this label in case if it overlaps with another label. The label with lower priority is not rendered. Default is 1000. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.gis.rendering.labelings/simplelabeling/clone/)() | Clones this instance. |

### See Also

* class [Labeling](../labeling/)
* namespace [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* assembly [Aspose.GIS](../../)


