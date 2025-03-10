---
title: Class EllipseShape
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Profiles.EllipseShape class. IFC compatible ellipse shape that defined by parameters. The center position of the profile is in the center of the bounding box
type: docs
weight: 1610
url: /net/aspose.threed.profiles/ellipseshape/
---
## EllipseShape class

IFC compatible ellipse shape that defined by parameters. The center position of the profile is in the center of the bounding box.

```csharp
public class EllipseShape : ParameterizedProfile
```

## Constructors

| Name | Description |
| --- | --- |
| [EllipseShape](ellipseshape/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to |
| [SemiAxis1](../../aspose.threed.profiles/ellipseshape/semiaxis1/) { get; set; } | Gets or sets the first radius of the ellipse that measured in the direction of x axis. |
| [SemiAxis2](../../aspose.threed.profiles/ellipseshape/semiaxis2/) { get; set; } | Gets or sets the second radius of the ellipse that measured in the direction of y axis. |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system. |
| override [GetEntityRendererKey](../../aspose.threed.profiles/profile/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer |
| override [GetExtent](../../aspose.threed.profiles/ellipseshape/getextent/)() | Gets the extent in x and y dimension. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property |

### See Also

* class [ParameterizedProfile](../parameterizedprofile/)
* namespace [Aspose.ThreeD.Profiles](../../aspose.threed.profiles/)
* assembly [Aspose.3D](../../)


