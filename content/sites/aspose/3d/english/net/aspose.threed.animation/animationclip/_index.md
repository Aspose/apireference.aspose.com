---
title: Class AnimationClip
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Animation.AnimationClip class. The Animation clip is a collection of animations. The scene can have one or more animation clips
type: docs
weight: 2720
url: /net/aspose.threed.animation/animationclip/
---
## AnimationClip class

The Animation clip is a collection of animations. The scene can have one or more animation clips.

```csharp
public class AnimationClip : SceneObject
```

## Constructors

| Name | Description |
| --- | --- |
| [AnimationClip](animationclip/#constructor)() | Initializes a new instance of the `AnimationClip` class. |
| [AnimationClip](animationclip/#constructor_1)(string) | Initializes a new instance of the `AnimationClip` class. |

## Properties

| Name | Description |
| --- | --- |
| [Animations](../../aspose.threed.animation/animationclip/animations/) { get; } | Gets the animations contained inside the clip. |
| [Description](../../aspose.threed.animation/animationclip/description/) { get; set; } | Gets or sets the description of this animation clip |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to(Inherited from [`SceneObject`](../../aspose.threed/sceneobject/).) |
| [Start](../../aspose.threed.animation/animationclip/start/) { get; set; } | Gets or sets the time in seconds of the beginning of the clip. |
| [Stop](../../aspose.threed.animation/animationclip/stop/) { get; set; } | Gets or sets the time in seconds of the end of the clip. |

## Methods

| Name | Description |
| --- | --- |
| [CreateAnimationNode](../../aspose.threed.animation/animationclip/createanimationnode/)(string) | A shorthand function to create and register the animation node on current clip. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |

### See Also

* class [SceneObject](../../aspose.threed/sceneobject/)
* namespace [Aspose.ThreeD.Animation](../../aspose.threed.animation/)
* assembly [Aspose.3D](../../)


