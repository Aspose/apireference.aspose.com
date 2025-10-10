---
title: Class HalfSpace
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.HalfSpace class. HalfSpace represents a infinity space which is split by a plane this can be used with BooleanOperator
type: docs
weight: 420
url: /net/aspose.threed.entities/halfspace/
---
## HalfSpace class

`HalfSpace` represents a infinity space which is split by a plane, this can be used with [`BooleanOperator`](../booleanoperator/)

```csharp
public class HalfSpace : Entity
```

## Constructors

| Name | Description |
| --- | --- |
| [HalfSpace](halfspace/#constructor)() | Constructs a new instance of `HalfSpace` |
| [HalfSpace](halfspace/#constructor_1)(Vector3, Vector3) | Constructs a new instance of `HalfSpace` with given normal vector and a position on the cutter plane; |

## Properties

| Name | Description |
| --- | --- |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [Normal](../../aspose.threed.entities/halfspace/normal/) { get; set; } | The normal of the split plane, the plane is defined as N * P + D = 0 where N is Normal and P is any point on the plane. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [Position](../../aspose.threed.entities/halfspace/position/) { get; set; } | The any point on the split plane, the plane is defined as N * P + D = 0 where N is Normal and P is any point on the plane. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property |

### See Also

* class [Entity](../../aspose.threed/entity/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


