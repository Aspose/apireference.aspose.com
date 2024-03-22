---
title: Class Bone
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Deformers.Bone class. A bone defines the subset of the geometrys control point and defined blend weight for each control point. The Bone object cannot be used directly a SkinDeformer instance is used to deform the geometry and SkinDeformer comes with a set of bones each bone linked to a node. NOTE A control point of a geometry can be bounded to more than one Bones
type: docs
weight: 2660
url: /net/aspose.threed.deformers/bone/
---
## Bone class

A bone defines the subset of the geometry's control point, and defined blend weight for each control point. The `Bone` object cannot be used directly, a [`SkinDeformer`](../skindeformer/) instance is used to deform the geometry, and [`SkinDeformer`](../skindeformer/) comes with a set of bones, each bone linked to a node. NOTE: A control point of a geometry can be bounded to more than one Bones.

```csharp
public class Bone : A3DObject
```

## Constructors

| Name | Description |
| --- | --- |
| [Bone](bone/#constructor)() | Initializes a new instance of the `Bone` class. |
| [Bone](bone/#constructor_1)(string) | Initializes a new instance of the `Bone` class. |

## Properties

| Name | Description |
| --- | --- |
| [BoneTransform](../../aspose.threed.deformers/bone/bonetransform/) { get; set; } | Gets or sets the transform matrix of the bone. |
| [Item](../../aspose.threed.deformers/bone/item/) { get; set; } |  |
| [LinkMode](../../aspose.threed.deformers/bone/linkmode/) { get; set; } | A bone's link mode refers to the way in which a bone is connected or linked to its parent bone within a hierarchical structure. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Node](../../aspose.threed.deformers/bone/node/) { get; set; } | Gets or sets the node. The bone node is the bone which skin attached to, the [`SkinDeformer`](../skindeformer/) will use bone node to influence the displacement of the control points. Bone node usually has a [`Skeleton`](../../aspose.threed.entities/skeleton/) attached, but it's not required. Attached [`Skeleton`](../../aspose.threed.entities/skeleton/) is usually used by DCC software to show skeleton to user. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Transform](../../aspose.threed.deformers/bone/transform/) { get; set; } | Gets or sets the transform matrix of the node containing the bone. |
| [WeightCount](../../aspose.threed.deformers/bone/weightcount/) { get; } | Gets the count of weight, this is automatically extended by [`SetWeight`](./setweight/) |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetWeight](../../aspose.threed.deformers/bone/getweight/)(int) | Gets the weight for control point specified by index |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetWeight](../../aspose.threed.deformers/bone/setweight/)(int, double) | Sets the weight for control point specified by index |

### See Also

* class [A3DObject](../../aspose.threed/a3dobject/)
* namespace [Aspose.ThreeD.Deformers](../../aspose.threed.deformers/)
* assembly [Aspose.3D](../../)


