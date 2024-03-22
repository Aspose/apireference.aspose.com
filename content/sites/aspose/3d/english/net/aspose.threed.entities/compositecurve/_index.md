---
title: Class CompositeCurve
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.CompositeCurve class. A CompositeCurve is consisting of several curve segments
type: docs
weight: 1950
url: /net/aspose.threed.entities/compositecurve/
---
## CompositeCurve class

A `CompositeCurve` is consisting of several curve segments.

```csharp
public class CompositeCurve : Curve
```

## Constructors

| Name | Description |
| --- | --- |
| [CompositeCurve](compositecurve/)() | Constructor of `CompositeCurve` |

## Properties

| Name | Description |
| --- | --- |
| [Color](../../aspose.threed.entities/curve/color/) { get; set; } | Gets or sets the color of the line, default value is white(1, 1, 1)(Inherited from [`Curve`](../curve/).) |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to(Inherited from [`SceneObject`](../../aspose.threed/sceneobject/).) |
| [Segments](../../aspose.threed.entities/compositecurve/segments/) { get; } | The segments of the curve. |

## Methods

| Name | Description |
| --- | --- |
| [AddSegment](../../aspose.threed.entities/compositecurve/addsegment/)(Curve, bool) | The |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| override [GetEntityRendererKey](../../aspose.threed.entities/curve/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer(Inherited from [`Curve`](../curve/).) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |

## Other Members

| Name | Description |
| --- | --- |
| class [Segment](../../aspose.threed.entities/compositecurve.segment) |  |

### See Also

* class [Curve](../curve/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


