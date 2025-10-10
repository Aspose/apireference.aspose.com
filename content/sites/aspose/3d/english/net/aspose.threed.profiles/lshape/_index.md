---
title: Class LShape
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Profiles.LShape class. IFC compatible Lshape profile that defined by parameters
type: docs
weight: 1760
url: /net/aspose.threed.profiles/lshape/
---
## LShape class

IFC compatible L-shape profile that defined by parameters.

```csharp
public class LShape : ParameterizedProfile
```

## Constructors

| Name | Description |
| --- | --- |
| [LShape](lshape/)() | Constructor of `LShape` |

## Properties

| Name | Description |
| --- | --- |
| [Depth](../../aspose.threed.profiles/lshape/depth/) { get; set; } | Gets or sets the depth of the profile. |
| [EdgeRadius](../../aspose.threed.profiles/lshape/edgeradius/) { get; set; } | Gets or sets the radius of the edge. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting. |
| [FilletRadius](../../aspose.threed.profiles/lshape/filletradius/) { get; set; } | Gets or sets the radius of the fillet. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to |
| [Thickness](../../aspose.threed.profiles/lshape/thickness/) { get; set; } | Gets or sets the thickness of the constant wall. |
| [Width](../../aspose.threed.profiles/lshape/width/) { get; set; } | Gets or sets the width of the profile. |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system. |
| override [GetEntityRendererKey](../../aspose.threed.profiles/profile/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer |
| override [GetExtent](../../aspose.threed.profiles/lshape/getextent/)() | Gets the extent in x and y dimension. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property |

### See Also

* class [ParameterizedProfile](../parameterizedprofile/)
* namespace [Aspose.ThreeD.Profiles](../../aspose.threed.profiles/)
* assembly [Aspose.3D](../../)


