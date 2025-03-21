---
title: Class UShape
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Profiles.UShape class. IFC compatible Ushape defined by parameters
type: docs
weight: 1740
url: /net/aspose.threed.profiles/ushape/
---
## UShape class

IFC compatible U-shape defined by parameters.

```csharp
public class UShape : ParameterizedProfile
```

## Constructors

| Name | Description |
| --- | --- |
| [UShape](ushape/)() | Constructor of `UShape` |

## Properties

| Name | Description |
| --- | --- |
| [Depth](../../aspose.threed.profiles/ushape/depth/) { get; set; } | Gets or sets the length of web. |
| [EdgeRadius](../../aspose.threed.profiles/ushape/edgeradius/) { get; set; } | Gets or sets the radius of edge in flange's edge. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting. |
| [FilletRadius](../../aspose.threed.profiles/ushape/filletradius/) { get; set; } | Gets or sets the radius of fillet between flange and web. |
| [FlangeThickness](../../aspose.threed.profiles/ushape/flangethickness/) { get; set; } | Gets or sets the thickness of flange. |
| [FlangeWidth](../../aspose.threed.profiles/ushape/flangewidth/) { get; set; } | Gets or sets the length of flange. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to |
| [WebThickness](../../aspose.threed.profiles/ushape/webthickness/) { get; set; } | Gets or sets the thickness of web. |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system. |
| override [GetEntityRendererKey](../../aspose.threed.profiles/profile/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer |
| override [GetExtent](../../aspose.threed.profiles/ushape/getextent/)() | Gets the extent in x and y dimension. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property |

### See Also

* class [ParameterizedProfile](../parameterizedprofile/)
* namespace [Aspose.ThreeD.Profiles](../../aspose.threed.profiles/)
* assembly [Aspose.3D](../../)


