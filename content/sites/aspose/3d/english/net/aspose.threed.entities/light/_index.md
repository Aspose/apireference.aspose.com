---
title: Class Light
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.Light class. The light illuminates the scene
type: docs
weight: 430
url: /net/aspose.threed.entities/light/
---
## Light class

The light illuminates the scene.

The formula to calculate the total attenuation of light is: `A = ConstantAttenuation + (Dist * LinearAttenuation) + ((Dist^2) * QuadraticAttenuation)`

```csharp
public class Light : Frustum
```

## Constructors

| Name | Description |
| --- | --- |
| [Light](light/#constructor)() | Initializes a new instance of the `Light` class. |
| [Light](light/#constructor_1)(string) | Initializes a new instance of the `Light` class. |
| [Light](light/#constructor_2)(string, LightType) | Initializes a new instance of the `Light` class. |

## Properties

| Name | Description |
| --- | --- |
| [Aspect](../../aspose.threed.entities/frustum/aspect/) { get; set; } | Gets or sets the aspect ratio of the frustum(Inherited from [`Frustum`](../frustum/).) |
| [CastLight](../../aspose.threed.entities/light/castlight/) { get; set; } | Gets or sets if the current light instance can illuminate other objects. |
| [CastShadows](../../aspose.threed.entities/light/castshadows/) { get; set; } | Gets or sets if the light can cast shadows on other objects. |
| [Color](../../aspose.threed.entities/light/color/) { get; set; } | Gets or sets the light's color |
| [ConstantAttenuation](../../aspose.threed.entities/light/constantattenuation/) { get; set; } | Gets or sets the constant attenuation to calculate the total attenuation of the light |
| [Direction](../../aspose.threed.entities/frustum/direction/) { get; set; } | Gets or sets the direction that the camera is looking at. Changes on this property will also affects the [`LookAt`](../frustum/lookat/) and [`Target`](../frustum/target/).(Inherited from [`Frustum`](../frustum/).) |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Falloff](../../aspose.threed.entities/light/falloff/) { get; set; } | Gets or sets the falloff cone angle (in degrees). |
| [FarPlane](../../aspose.threed.entities/frustum/farplane/) { get; set; } | Gets or sets the frustum's far plane distance.(Inherited from [`Frustum`](../frustum/).) |
| [HotSpot](../../aspose.threed.entities/light/hotspot/) { get; set; } | Gets or sets the hot spot cone angle(in degrees). |
| [Intensity](../../aspose.threed.entities/light/intensity/) { get; set; } | Gets or sets the light's intensity, default value is 100 |
| [LightType](../../aspose.threed.entities/light/lighttype/) { get; set; } | Gets or sets the light's type |
| [LinearAttenuation](../../aspose.threed.entities/light/linearattenuation/) { get; set; } | Gets or sets the linear attenuation to calculate the total attenuation of the light |
| [LookAt](../../aspose.threed.entities/frustum/lookat/) { get; set; } | Gets or sets the the interested position that the camera is looking at.(Inherited from [`Frustum`](../frustum/).) |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane/) { get; set; } | Gets or sets the frustum's near plane distance.(Inherited from [`Frustum`](../frustum/).) |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight/) { get; set; } | Gets or sets the height when frustum in orthographic projection.(Inherited from [`Frustum`](../frustum/).) |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [QuadraticAttenuation](../../aspose.threed.entities/light/quadraticattenuation/) { get; set; } | Gets or sets the quadratic attenuation to calculate the total attenuation of the light |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode/) { get; set; } | Gets or sets the frustum's orientation mode This property only works when the [`Target`](../frustum/target/) is null. If the value is FixedTarget, the direction is always calculated by the property [`LookAt`](../frustum/lookat/) Otherwise the [`LookAt`](../frustum/lookat/) is always calculated by the [`Direction`](../frustum/direction/)(Inherited from [`Frustum`](../frustum/).) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to(Inherited from [`SceneObject`](../../aspose.threed/sceneobject/).) |
| [ShadowColor](../../aspose.threed.entities/light/shadowcolor/) { get; set; } | Gets or sets the shadow's color. |
| [Target](../../aspose.threed.entities/frustum/target/) { get; set; } | Gets or sets the target that the camera is looking at. If the user supports this property, it should be prior to [`LookAt`](../frustum/lookat/) property.(Inherited from [`Frustum`](../frustum/).) |
| [Up](../../aspose.threed.entities/frustum/up/) { get; set; } | Gets or sets the up direction of the camera(Inherited from [`Frustum`](../frustum/).) |

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

* class [Frustum](../frustum/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)
* [Tutorial - Illuminate a box in a scene](https://products.aspose.com/3d/tutorial/lighten-box-scene/)


