---
title: Class MorphTargetDeformer
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Deformers.MorphTargetDeformer class. MorphTargetDeformer provides pervertex animation. MorphTargetDeformer organize all targets via MorphTargetChannel each channel can organize multiple targets. A common use of morph target deformer is to apply facial expression to a character. More details can be found at https//en.wikipedia.org/wiki/Morph_target_animation
type: docs
weight: 230
url: /net/aspose.threed.deformers/morphtargetdeformer/
---
## MorphTargetDeformer class

MorphTargetDeformer provides per-vertex animation. MorphTargetDeformer organize all targets via [`MorphTargetChannel`](../morphtargetchannel/), each channel can organize multiple targets. A common use of morph target deformer is to apply facial expression to a character. More details can be found at https://en.wikipedia.org/wiki/Morph_target_animation

```csharp
public class MorphTargetDeformer : Deformer
```

## Constructors

| Name | Description |
| --- | --- |
| [MorphTargetDeformer](morphtargetdeformer/#constructor)() | Initializes a new instance of the `MorphTargetDeformer` class. |
| [MorphTargetDeformer](morphtargetdeformer/#constructor_1)(string) | Initializes a new instance of the `MorphTargetDeformer` class. |

## Properties

| Name | Description |
| --- | --- |
| [Channels](../../aspose.threed.deformers/morphtargetdeformer/channels/) { get; } | Gets all channels contained in this deformer |
| [Item](../../aspose.threed.deformers/morphtargetdeformer/item/) { get; set; } |  |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Owner](../../aspose.threed.deformers/deformer/owner/) { get; } | Gets the geometry which owns this deformer(Inherited from [`Deformer`](../deformer/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |

### See Also

* class [Deformer](../deformer/)
* namespace [Aspose.ThreeD.Deformers](../../aspose.threed.deformers/)
* assembly [Aspose.3D](../../)


