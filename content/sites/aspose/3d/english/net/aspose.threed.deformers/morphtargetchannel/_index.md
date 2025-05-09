---
title: Class MorphTargetChannel
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Deformers.MorphTargetChannel class. A MorphTargetChannel is used by MorphTargetDeformer to organize the target geometries. Some file formats like FBX support multiple channels in parallel
type: docs
weight: 220
url: /net/aspose.threed.deformers/morphtargetchannel/
---
## MorphTargetChannel class

A MorphTargetChannel is used by [`MorphTargetDeformer`](../morphtargetdeformer/) to organize the target geometries. Some file formats like FBX support multiple channels in parallel.

```csharp
public class MorphTargetChannel : A3DObject
```

## Constructors

| Name | Description |
| --- | --- |
| [MorphTargetChannel](morphtargetchannel/#constructor)() | Initializes a new instance of the `MorphTargetChannel` class. |
| [MorphTargetChannel](morphtargetchannel/#constructor_1)(string) | Initializes a new instance of the `MorphTargetChannel` class. |

## Properties

| Name | Description |
| --- | --- |
| [ChannelWeight](../../aspose.threed.deformers/morphtargetchannel/channelweight/) { get; set; } | Gets or sets the deformer weight of this channel. The weight is between 0.0 and 1.0 |
| [Item](../../aspose.threed.deformers/morphtargetchannel/item/) { get; set; } |  |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [Targets](../../aspose.threed.deformers/morphtargetchannel/targets/) { get; } | Gets all targets associated with the channel. |
| [Weights](../../aspose.threed.deformers/morphtargetchannel/weights/) { get; } | Gets the full weight values of target geometries. |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property |
| [GetWeight](../../aspose.threed.deformers/morphtargetchannel/getweight/)(Shape) | Gets the weight for the specified target, if the target is not belongs to this channel, default value 0 is returned. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property |
| [SetWeight](../../aspose.threed.deformers/morphtargetchannel/setweight/)(Shape, double) | Sets the weight for the specified target, default value is 1, range should between 0~1 |

## Fields

| Name | Description |
| --- | --- |
| const [DefaultWeight](../../aspose.threed.deformers/morphtargetchannel/defaultweight/) | Default weight for morph target. |

## Remarks

Weight is between 0 and 1.0, and default weight for target is 0.0;

### See Also

* class [A3DObject](../../aspose.threed/a3dobject/)
* namespace [Aspose.ThreeD.Deformers](../../aspose.threed.deformers/)
* assembly [Aspose.3D](../../)


