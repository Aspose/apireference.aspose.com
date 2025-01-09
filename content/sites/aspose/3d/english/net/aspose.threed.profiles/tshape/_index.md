---
title: Class TShape
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Profiles.TShape class. IFC compatible Tshape defined by parameters
type: docs
weight: 1710
url: /net/aspose.threed.profiles/tshape/
---
## TShape class

IFC compatible T-shape defined by parameters.

```csharp
public class TShape : ParameterizedProfile
```

## Constructors

| Name | Description |
| --- | --- |
| [TShape](tshape/)() | Constructor of `TShape` |

## Properties

| Name | Description |
| --- | --- |
| [Depth](../../aspose.threed.profiles/tshape/depth/) { get; set; } | Gets or sets the length of the web. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [FilletRadius](../../aspose.threed.profiles/tshape/filletradius/) { get; set; } | Gets or sets the radius of fillet between web and flange. |
| [FlangeEdgeRadius](../../aspose.threed.profiles/tshape/flangeedgeradius/) { get; set; } | Gets or sets the radius of the flange edge. |
| [FlangeThickness](../../aspose.threed.profiles/tshape/flangethickness/) { get; set; } | Gets or sets the wall thickness of flange. |
| [FlangeWidth](../../aspose.threed.profiles/tshape/flangewidth/) { get; set; } | Gets or sets the length of the flange. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to(Inherited from [`SceneObject`](../../aspose.threed/sceneobject/).) |
| [WebEdgeRadius](../../aspose.threed.profiles/tshape/webedgeradius/) { get; set; } | Gets or sets the radius of web edge. |
| [WebThickness](../../aspose.threed.profiles/tshape/webthickness/) { get; set; } | Gets or sets the wall thickness of web. |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| override [GetEntityRendererKey](../../aspose.threed.profiles/profile/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer(Inherited from [`Profile`](../profile/).) |
| override [GetExtent](../../aspose.threed.profiles/tshape/getextent/)() | Gets the extent in x and y dimension. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |

### See Also

* class [ParameterizedProfile](../parameterizedprofile/)
* namespace [Aspose.ThreeD.Profiles](../../aspose.threed.profiles/)
* assembly [Aspose.3D](../../)


