---
title: Class BooleanOperator
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.BooleanOperator class. Boolean operator allows you to apply Boolean operation on two IMeshConvertible instances
type: docs
weight: 280
url: /net/aspose.threed.entities/booleanoperator/
---
## BooleanOperator class

Boolean operator allows you to apply Boolean operation on two [`IMeshConvertible`](../imeshconvertible/) instances.

```csharp
public class BooleanOperator : Entity, IMeshConvertible
```

## Constructors

| Name | Description |
| --- | --- |
| [BooleanOperator](booleanoperator/#constructor)() | Constructor of `BooleanOperator` |
| [BooleanOperator](booleanoperator/#constructor_1)(BooleanOperation, A3DObject, A3DObject) | Constructs a new instance of `BooleanOperator` with two operands |

## Properties

| Name | Description |
| --- | --- |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting. |
| [First](../../aspose.threed.entities/booleanoperator/first/) { get; set; } | The first operand of the Boolean operator |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [Operator](../../aspose.threed.entities/booleanoperator/operator/) { get; set; } | The Boolean operator used in the operation to create the result mesh. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to |
| [Second](../../aspose.threed.entities/booleanoperator/second/) { get; set; } | The second operand of the Boolean operator |

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
| [ToMesh](../../aspose.threed.entities/booleanoperator/tomesh/)() | Perform the Boolean operation on two operands |

### See Also

* class [Entity](../../aspose.threed/entity/)
* interface [IMeshConvertible](../imeshconvertible/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


