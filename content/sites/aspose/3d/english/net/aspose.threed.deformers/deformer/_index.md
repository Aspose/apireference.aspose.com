---
title: Class Deformer
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Deformers.Deformer class. Base class for SkinDeformer and MorphTargetDeformer
type: docs
weight: 210
url: /net/aspose.threed.deformers/deformer/
---
## Deformer class

Base class for [`SkinDeformer`](../skindeformer/) and [`MorphTargetDeformer`](../morphtargetdeformer/)

```csharp
public abstract class Deformer : A3DObject
```

## Constructors

| Name | Description |
| --- | --- |
| [Deformer](deformer/)(string) | Initializes a new instance of the `Deformer` class. |

## Properties

| Name | Description |
| --- | --- |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Owner](../../aspose.threed.deformers/deformer/owner/) { get; } | Gets the geometry which owns this deformer |
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

* class [A3DObject](../../aspose.threed/a3dobject/)
* namespace [Aspose.ThreeD.Deformers](../../aspose.threed.deformers/)
* assembly [Aspose.3D](../../)


