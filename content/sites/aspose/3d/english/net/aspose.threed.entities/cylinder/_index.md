---
title: Class Cylinder
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.Cylinder class. Parameterized Cylinder. It can also be used to represent the cone when one of radiusTop/radiusBottom is zero
type: docs
weight: 2250
url: /net/aspose.threed.entities/cylinder/
---
## Cylinder class

Parameterized Cylinder. It can also be used to represent the cone when one of radiusTop/radiusBottom is zero.

```csharp
public class Cylinder : Primitive
```

## Constructors

| Name | Description |
| --- | --- |
| [Cylinder](cylinder/#constructor)() | Initializes a new instance of the `Cylinder` class. |
| [Cylinder](cylinder/#constructor_1)(double, double) | Initializes a new instance of the `Cylinder` class. |
| [Cylinder](cylinder/#constructor_2)(double, double, double) | Initializes a new instance of the `Cylinder` class. |
| [Cylinder](cylinder/#constructor_3)(double, double, double, int, int, bool) | Initializes a new instance of the `Cylinder` class. |
| [Cylinder](cylinder/#constructor_4)(string, double, double, double, int, int, bool, double, double) | Initializes a new instance of the `Cylinder` class. |

## Properties

| Name | Description |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/primitive/castshadows/) { get; set; } | Gets or sets whether this geometry can cast shadow(Inherited from [`Primitive`](../primitive/).) |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [GenerateFanCylinder](../../aspose.threed.entities/cylinder/generatefancylinder/) { get; set; } | Gets or sets whether to generate the fan-style cylinder when the ThetaLength is less than 2*PI, otherwise the model will not be cut. |
| [Height](../../aspose.threed.entities/cylinder/height/) { get; set; } | Gets or sets the height of the cylinder. |
| [HeightSegments](../../aspose.threed.entities/cylinder/heightsegments/) { get; set; } | Gets or sets the height segments. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [OffsetBottom](../../aspose.threed.entities/cylinder/offsetbottom/) { get; set; } | Gets or sets the vertices transformation offset of the bottom side. |
| [OffsetTop](../../aspose.threed.entities/cylinder/offsettop/) { get; set; } | Gets or sets the vertices transformation offset of the top side. |
| [OpenEnded](../../aspose.threed.entities/cylinder/openended/) { get; set; } | Gets or sets a value indicating whether this `Cylinder` open ended. The default value is false. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RadialSegments](../../aspose.threed.entities/cylinder/radialsegments/) { get; set; } | Gets or sets the radial segments. |
| [RadiusBottom](../../aspose.threed.entities/cylinder/radiusbottom/) { get; set; } | Gets or sets the radius of cylinder's bottom cap. |
| [RadiusTop](../../aspose.threed.entities/cylinder/radiustop/) { get; set; } | Gets or sets the radius of cylinder's top cap. |
| [ReceiveShadows](../../aspose.threed.entities/primitive/receiveshadows/) { get; set; } | Gets or sets whether this geometry can receive shadow.(Inherited from [`Primitive`](../primitive/).) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to(Inherited from [`SceneObject`](../../aspose.threed/sceneobject/).) |
| [ShearBottom](../../aspose.threed.entities/cylinder/shearbottom/) { get; set; } | Gets or sets of the shear transform of the bottom side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0) |
| [ShearTop](../../aspose.threed.entities/cylinder/sheartop/) { get; set; } | Gets or sets of the shear transform of the top side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0) |
| [ThetaLength](../../aspose.threed.entities/cylinder/thetalength/) { get; set; } | Gets or sets the length of the theta. The default value is 2π. |
| [ThetaStart](../../aspose.threed.entities/cylinder/thetastart/) { get; set; } | Gets or sets the theta start. The default value is 0. |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| override [ToMesh](../../aspose.threed.entities/cylinder/tomesh/)() | Convert current object to mesh |

### See Also

* class [Primitive](../primitive/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


