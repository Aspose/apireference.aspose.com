---
title: Class HShape
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Profiles.HShape class. The HShape provides the defining parameters of an H or I shape
type: docs
weight: 1110
url: /net/aspose.threed.profiles/hshape/
---
## HShape class

The `HShape` provides the defining parameters of an 'H' or 'I' shape.

```csharp
public class HShape : ParameterizedProfile
```

## Constructors

| Name | Description |
| --- | --- |
| [HShape](hshape/)() | Constructor of `HShape` |

## Properties

| Name | Description |
| --- | --- |
| [BottomFlangeEdgeRadius](../../aspose.threed.profiles/hshape/bottomflangeedgeradius/) { get; set; } | Gets or sets the radius of the upper edges of the bottom flange. |
| [BottomFlangeFilletRadius](../../aspose.threed.profiles/hshape/bottomflangefilletradius/) { get; set; } | Gets or sets the radius of fillet between the web and the bottom flange. |
| [BottomFlangeThickness](../../aspose.threed.profiles/hshape/bottomflangethickness/) { get; set; } | Gets or sets the flange thickness of H-shape. |
| [BottomFlangeWidth](../../aspose.threed.profiles/hshape/bottomflangewidth/) { get; set; } | Gets or sets the extent of the width. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [OverallDepth](../../aspose.threed.profiles/hshape/overalldepth/) { get; set; } | Gets or sets the extent of the depth. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to(Inherited from [`SceneObject`](../../aspose.threed/sceneobject/).) |
| [TopFlangeEdgeRadius](../../aspose.threed.profiles/hshape/topflangeedgeradius/) { get; set; } | Gets or sets the radius of the lower edges of the top flange. |
| [TopFlangeFilletRadius](../../aspose.threed.profiles/hshape/topflangefilletradius/) { get; set; } | Gets or sets the radius of fillet between the web and the top flange. |
| [TopFlangeThickness](../../aspose.threed.profiles/hshape/topflangethickness/) { get; set; } | Gets or sets the thickness of the top flange. |
| [TopFlangeWidth](../../aspose.threed.profiles/hshape/topflangewidth/) { get; set; } | Gets or sets the width of the top flange. |
| [WebThickness](../../aspose.threed.profiles/hshape/webthickness/) { get; set; } | Gets or sets the thickness of the web of the H-shape. |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| override [GetEntityRendererKey](../../aspose.threed.profiles/profile/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer(Inherited from [`Profile`](../profile/).) |
| override [GetExtent](../../aspose.threed.profiles/hshape/getextent/)() | Gets the extent in x and y dimension. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |

### See Also

* class [ParameterizedProfile](../parameterizedprofile/)
* namespace [Aspose.ThreeD.Profiles](../../aspose.threed.profiles/)
* assembly [Aspose.3D](../../)


