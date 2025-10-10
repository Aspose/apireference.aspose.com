---
title: Class LinearExtrusion
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.LinearExtrusion class. Linear extrusion takes a 2D shape as input and extends the shape in the 3rd dimension
type: docs
weight: 490
url: /net/aspose.threed.entities/linearextrusion/
---
## LinearExtrusion class

Linear extrusion takes a 2D shape as input and extends the shape in the 3rd dimension.

```csharp
public class LinearExtrusion : Entity, IMeshConvertible
```

## Constructors

| Name | Description |
| --- | --- |
| [LinearExtrusion](linearextrusion/#constructor)() | Constructor of instance `LinearExtrusion`. |
| [LinearExtrusion](linearextrusion/#constructor_1)(Profile, double) | Constructor of instance `LinearExtrusion`. |

## Properties

| Name | Description |
| --- | --- |
| [Center](../../aspose.threed.entities/linearextrusion/center/) { get; set; } | If this value is false, the linear extrusion Z range is from 0 to height, otherwise the range is from -height/2 to height/2. |
| [Direction](../../aspose.threed.entities/linearextrusion/direction/) { get; set; } | The direction of extrusion, default value is (0, 0, 1) |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting. |
| [Height](../../aspose.threed.entities/linearextrusion/height/) { get; set; } | The height of the extruded geometry, default value is 1.0 |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to |
| [Shape](../../aspose.threed.entities/linearextrusion/shape/) { get; set; } | The base shape to be extruded. |
| [Slices](../../aspose.threed.entities/linearextrusion/slices/) { get; set; } | The slices of the twisted extruded geometry, default value is 1. |
| [Twist](../../aspose.threed.entities/linearextrusion/twist/) { get; set; } | The number of degrees of through which the shape is extruded. |
| [TwistOffset](../../aspose.threed.entities/linearextrusion/twistoffset/) { get; set; } | The offset that used in twisting, default value is (0, 0, 0). |

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
| [ToMesh](../../aspose.threed.entities/linearextrusion/tomesh/)() | Convert the extrusion to mesh. |

## Examples

The following code shows how to use LinearExtrusion to extrude a shape into a solid model.

```csharp
using Aspose.ThreeD;
using Aspose.ThreeD.Entities;
using Aspose.ThreeD.Utilities;
using Aspose.ThreeD.Profiles;

//Create a new 3D scene
Scene scene = new Scene();

// Initialize the base profile to be extruded
var profile = new RectangleShape()
{
	RoundingRadius = 0.3
};

// Create left node
var left = scene.RootNode.CreateChildNode();
left.CreateChildNode(new Box(0.01, 3, 3));

// Create right node
var right = scene.RootNode.CreateChildNode();
right.CreateChildNode(new Box(0.01, 3, 3));
right.Transform.Translation = new Vector3(5, 0, 0);

//Perform linear extrusion on left node using center and slices property
left.CreateChildNode(new LinearExtrusion(profile, 10) { Center = false, Slices = 3, Twist = 20.0 });

// Perform linear extrusion on left node using center and slices property
right.CreateChildNode(new LinearExtrusion(profile, 10) { Center = true, Slices = 3, Twist = 90.0 });

scene
```

### See Also

* class [Entity](../../aspose.threed/entity/)
* interface [IMeshConvertible](../imeshconvertible/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


