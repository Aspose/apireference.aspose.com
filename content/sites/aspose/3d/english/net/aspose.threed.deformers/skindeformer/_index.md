---
title: Class SkinDeformer
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Deformers.SkinDeformer class. A skin deformer contains multiple bones to work each bone blends a part of the geometry by control points weights
type: docs
weight: 240
url: /net/aspose.threed.deformers/skindeformer/
---
## SkinDeformer class

A skin deformer contains multiple bones to work, each bone blends a part of the geometry by control point's weights.

```csharp
public class SkinDeformer : Deformer
```

## Constructors

| Name | Description |
| --- | --- |
| [SkinDeformer](skindeformer/#constructor)() | Initializes a new instance of the `SkinDeformer` class. |
| [SkinDeformer](skindeformer/#constructor_1)(string) | Initializes a new instance of the `SkinDeformer` class. |

## Properties

| Name | Description |
| --- | --- |
| [Bones](../../aspose.threed.deformers/skindeformer/bones/) { get; } | Gets all bones that the skin deformer contains |
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


