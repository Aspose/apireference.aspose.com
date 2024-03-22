---
title: Class TransformedCurve
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.TransformedCurve class. A TransformedCurve gives a curve a placement by using a transformation matrix. This allows to perform a transformation inside a TrimmedCurve or CompositeCurve
type: docs
weight: 1980
url: /net/aspose.threed.entities/transformedcurve/
---
## TransformedCurve class

A `TransformedCurve` gives a curve a placement by using a transformation matrix. This allows to perform a transformation inside a [`TrimmedCurve`](../trimmedcurve/) or [`CompositeCurve`](../compositecurve/).

```csharp
public class TransformedCurve : Curve
```

## Constructors

| Name | Description |
| --- | --- |
| [TransformedCurve](transformedcurve/#constructor)() | The constructor of `TransformedCurve` |
| [TransformedCurve](transformedcurve/#constructor_1)(Curve, Matrix4) | The constructor of `TransformedCurve` |

## Properties

| Name | Description |
| --- | --- |
| [BasisCurve](../../aspose.threed.entities/transformedcurve/basiscurve/) { get; set; } | The basis curve. |
| [Color](../../aspose.threed.entities/curve/color/) { get; set; } | Gets or sets the color of the line, default value is white(1, 1, 1)(Inherited from [`Curve`](../curve/).) |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to(Inherited from [`SceneObject`](../../aspose.threed/sceneobject/).) |
| [TransformMatrix](../../aspose.threed.entities/transformedcurve/transformmatrix/) { get; set; } | The transformation matrix. |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| override [GetEntityRendererKey](../../aspose.threed.entities/curve/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer(Inherited from [`Curve`](../curve/).) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |

### See Also

* class [Curve](../curve/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


