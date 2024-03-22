---
title: Class CShape
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Profiles.CShape class. IFC compatible Cshape profile that defined by parameters. The center position of the profile is in the center of the bounding box
type: docs
weight: 1060
url: /net/aspose.threed.profiles/cshape/
---
## CShape class

IFC compatible C-shape profile that defined by parameters. The center position of the profile is in the center of the bounding box.

```csharp
public class CShape : ParameterizedProfile
```

## Constructors

| Name | Description |
| --- | --- |
| [CShape](cshape/)() | Constructor of `CShape` |

## Properties

| Name | Description |
| --- | --- |
| [Depth](../../aspose.threed.profiles/cshape/depth/) { get; set; } | Gets or sets the depth of the profile. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Girth](../../aspose.threed.profiles/cshape/girth/) { get; set; } | Gets or sets the length of girth. |
| [InternalFilletRadius](../../aspose.threed.profiles/cshape/internalfilletradius/) { get; set; } | Gets or sets the internal fillet radius. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to(Inherited from [`SceneObject`](../../aspose.threed/sceneobject/).) |
| [WallThickness](../../aspose.threed.profiles/cshape/wallthickness/) { get; set; } | Gets or sets the thickness of the wall. |
| [Width](../../aspose.threed.profiles/cshape/width/) { get; set; } | Gets or sets the width of the profile. |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| override [GetEntityRendererKey](../../aspose.threed.profiles/profile/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer(Inherited from [`Profile`](../profile/).) |
| override [GetExtent](../../aspose.threed.profiles/cshape/getextent/)() | Gets the extent in x and y dimension. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |

### See Also

* class [ParameterizedProfile](../parameterizedprofile/)
* namespace [Aspose.ThreeD.Profiles](../../aspose.threed.profiles/)
* assembly [Aspose.3D](../../)


