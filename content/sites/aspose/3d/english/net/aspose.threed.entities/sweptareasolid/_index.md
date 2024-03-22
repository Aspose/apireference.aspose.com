---
title: Class SweptAreaSolid
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.SweptAreaSolid class. A SweptAreaSolid constructs a geometry by sweeping a profile along a directrix
type: docs
weight: 2370
url: /net/aspose.threed.entities/sweptareasolid/
---
## SweptAreaSolid class

A `SweptAreaSolid` constructs a geometry by sweeping a profile along a directrix.

```csharp
public class SweptAreaSolid : Entity, IMeshConvertible
```

## Constructors

| Name | Description |
| --- | --- |
| [SweptAreaSolid](sweptareasolid/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Directrix](../../aspose.threed.entities/sweptareasolid/directrix/) { get; set; } | The directrix that the swept area sweeping along with. |
| [EndPoint](../../aspose.threed.entities/sweptareasolid/endpoint/) { get; set; } | The end point of the directrix. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to(Inherited from [`SceneObject`](../../aspose.threed/sceneobject/).) |
| [Shape](../../aspose.threed.entities/sweptareasolid/shape/) { get; set; } | The base profile to construct the geometry. |
| [StartPoint](../../aspose.threed.entities/sweptareasolid/startpoint/) { get; set; } | The start point of the directrix. |

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
| [ToMesh](../../aspose.threed.entities/sweptareasolid/tomesh/)() | Convert current object to mesh |

### Examples

The following code shows how to modeling an solid entity by sweeping a C-shape on a circle

```csharp
var directrix = new Circle(20);
var shape = new CShape();

var swept = new SweptAreaSolid()
{
  Shape = shape,
  Directrix = directrix,
  StartPoint = EndPoint.FromDegree(0),
  EndPoint = EndPoint.FromDegree(130)
};

var scene = new Scene();
scene.RootNode.CreateChildNode(swept);
scene.Save("swept.obj");
```

### See Also

* class [Entity](../../aspose.threed/entity/)
* interface [IMeshConvertible](../imeshconvertible/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


