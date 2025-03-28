---
title: Class ZShape
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Profiles.ZShape class. IFC compatible Zshape profile defined by parameters
type: docs
weight: 1750
url: /net/aspose.threed.profiles/zshape/
---
## ZShape class

IFC compatible Z-shape profile defined by parameters.

```csharp
public class ZShape : ParameterizedProfile
```

## Constructors

| Name | Description |
| --- | --- |
| [ZShape](zshape/)() | Constructor of `ZShape` |

## Properties

| Name | Description |
| --- | --- |
| [Depth](../../aspose.threed.profiles/zshape/depth/) { get; set; } | Gets or sets the length of web. |
| [EdgeRadius](../../aspose.threed.profiles/zshape/edgeradius/) { get; set; } | Gets or sets the radius of flange edge. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting. |
| [FilletRadius](../../aspose.threed.profiles/zshape/filletradius/) { get; set; } | Gets or sets the radius of fillet between flange and web. |
| [FlangeThickness](../../aspose.threed.profiles/zshape/flangethickness/) { get; set; } | Gets or sets the thickness of flange. |
| [FlangeWidth](../../aspose.threed.profiles/zshape/flangewidth/) { get; set; } | Gets or sets the length of flange. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to |
| [WebThickness](../../aspose.threed.profiles/zshape/webthickness/) { get; set; } | Gets or sets the thickness of wall. |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system. |
| override [GetEntityRendererKey](../../aspose.threed.profiles/profile/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer |
| override [GetExtent](../../aspose.threed.profiles/zshape/getextent/)() | Gets the extent in x and y dimension. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property |

### See Also

* class [ParameterizedProfile](../parameterizedprofile/)
* namespace [Aspose.ThreeD.Profiles](../../aspose.threed.profiles/)
* assembly [Aspose.3D](../../)


