---
title: Camera
second_title: Aspose.3D for .NET API Reference
description: 
type: docs
weight: 250
url: /net/aspose.threed.entities/camera/
---
## Camera class

The camera describes the eye point of the viewer looking at the scene.

```csharp
public class Camera : Frustum
```

## Constructors

| Name | Description |
| --- | --- |
| [Camera](camera)() | Initializes a new instance of the [`Camera`](../camera) class. |
| [Camera](camera)(ProjectionType) | Initializes a new instance of the [`Camera`](../camera) class. |
| [Camera](camera)(string) | Initializes a new instance of the [`Camera`](../camera) class. |
| [Camera](camera)(string, ProjectionType) | Initializes a new instance of the [`Camera`](../camera) class. |

## Properties

| Name | Description |
| --- | --- |
| [ApertureMode](../../aspose.threed.entities/camera/aperturemode) { get; set; } | Gets or sets the camera's aperture mode |
| [Aspect](../../aspose.threed.entities/frustum/aspect) { get; set; } | Gets or sets the aspect ratio of the frustum |
| [AspectRatio](../../aspose.threed.entities/camera/aspectratio) { get; set; } | Gets or sets the view plane aspect ratio. |
| [Direction](../../aspose.threed.entities/frustum/direction) { get; set; } | Gets or sets the direction that the camera is looking at. Changes on this property will also affects the [`LookAt`](../frustum/lookat) and [`Target`](../frustum/target). |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Gets or sets whether to exclude this entity during exporting. |
| [FarPlane](../../aspose.threed.entities/frustum/farplane) { get; set; } | Gets or sets the frustum's far plane distance. |
| [FieldOfView](../../aspose.threed.entities/camera/fieldofview) { get; set; } | Gets or sets the camera's field of view in degrees, this property is used only when ApertureMode is Horizontal or Vertical |
| [FieldOfViewX](../../aspose.threed.entities/camera/fieldofviewx) { get; set; } | Gets or sets the camera's horizontal field of view in degrees, this property is used only when ApertureMode is HorizAndVert |
| [FieldOfViewY](../../aspose.threed.entities/camera/fieldofviewy) { get; set; } | Gets or sets the camera's vertical field of view in degrees, this property is used only when ApertureMode is HorizAndVert |
| [Height](../../aspose.threed.entities/camera/height) { get; set; } | Gets or sets the view plane's height measured in inches |
| [LookAt](../../aspose.threed.entities/frustum/lookat) { get; set; } | Gets or sets the the interested position that the camera is looking at. |
| [Magnification](../../aspose.threed.entities/camera/magnification) { get; set; } | Gets or sets the magnification used in orthographic camera |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Gets or sets the name. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane) { get; set; } | Gets or sets the frustum's near plane distance. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight) { get; set; } | Gets or sets the height when frustum in orthographic projection. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [ProjectionType](../../aspose.threed.entities/camera/projectiontype) { get; set; } | Gets or sets the camera's projection type. By default the perspective projection is used. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Gets the collection of all properties. |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode) { get; set; } | Gets or sets the frustum's orientation mode This property only works when the [`Target`](../frustum/target) is null. If the value is FixedTarget, the direction is always calculated by the property [`LookAt`](../frustum/lookat) Otherwise the [`LookAt`](../frustum/lookat) is always calculated by the [`Direction`](../frustum/direction) |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Gets the scene that this object belongs to |
| [Target](../../aspose.threed.entities/frustum/target) { get; set; } | Gets or sets the target that the camera is looking at. If the user supports this property, it should be prior to [`LookAt`](../frustum/lookat) property. |
| [Up](../../aspose.threed.entities/frustum/up) { get; set; } | Gets or sets the up direction of the camera |
| [Width](../../aspose.threed.entities/camera/width) { get; set; } | Gets or sets the view plane's width measured in inches |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Gets the bounding box of current entity in its object space coordinate system. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Gets the key of the entity renderer registered in the renderer |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Get the value of specified property |
| [MoveForward](../../aspose.threed.entities/camera/moveforward)(double) | Move camera forward towards its direction or target. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Remove the specified property identified by name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Sets the value of specified property |

### See Also

* class [Frustum](../frustum)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* assembly [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
