---
title: Class Frustum
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.Frustum class. The base class of Camera and Light
type: docs
weight: 2020
url: /net/aspose.threed.entities/frustum/
---
## Frustum class

The base class of [`Camera`](../camera/) and [`Light`](../light/)

```csharp
public abstract class Frustum : Entity, IOrientable
```

## Properties

| Name | Description |
| --- | --- |
| [Aspect](../../aspose.threed.entities/frustum/aspect/) { get; set; } | Gets or sets the aspect ratio of the frustum |
| [Direction](../../aspose.threed.entities/frustum/direction/) { get; set; } | Gets or sets the direction that the camera is looking at. Changes on this property will also affects the [`LookAt`](./lookat/) and [`Target`](./target/). |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [FarPlane](../../aspose.threed.entities/frustum/farplane/) { get; set; } | Gets or sets the frustum's far plane distance. |
| [LookAt](../../aspose.threed.entities/frustum/lookat/) { get; set; } | Gets or sets the the interested position that the camera is looking at. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane/) { get; set; } | Gets or sets the frustum's near plane distance. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight/) { get; set; } | Gets or sets the height when frustum in orthographic projection. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode/) { get; set; } | Gets or sets the frustum's orientation mode This property only works when the [`Target`](./target/) is null. If the value is FixedTarget, the direction is always calculated by the property [`LookAt`](./lookat/) Otherwise the [`LookAt`](./lookat/) is always calculated by the [`Direction`](./direction/) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to(Inherited from [`SceneObject`](../../aspose.threed/sceneobject/).) |
| [Target](../../aspose.threed.entities/frustum/target/) { get; set; } | Gets or sets the target that the camera is looking at. If the user supports this property, it should be prior to [`LookAt`](./lookat/) property. |
| [Up](../../aspose.threed.entities/frustum/up/) { get; set; } | Gets or sets the up direction of the camera |

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

### See Also

* class [Entity](../../aspose.threed/entity/)
* interface [IOrientable](../iorientable/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


