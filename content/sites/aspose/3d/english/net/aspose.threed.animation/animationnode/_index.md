---
title: Class AnimationNode
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Animation.AnimationNode class. Aspose.3Ds supports animation hierarchy each animation can be composed by several animations and animations keyframe definition. AnimationNode defines the transformation of a property value over time for example animation node can be used to control a nodes transformation or other A3DObject objects numerical properties
type: docs
weight: 40
url: /net/aspose.threed.animation/animationnode/
---
## AnimationNode class

Aspose.3D's supports animation hierarchy, each animation can be composed by several animations and animation's key-frame definition. `AnimationNode` defines the transformation of a property value over time, for example, animation node can be used to control a node's transformation or other [`A3DObject`](../../aspose.threed/a3dobject/) object's numerical properties.

```csharp
public class AnimationNode : A3DObject
```

## Constructors

| Name | Description |
| --- | --- |
| [AnimationNode](animationnode/#constructor)() | Initializes a new instance of the `AnimationNode` class. |
| [AnimationNode](animationnode/#constructor_1)(string) | Initializes a new instance of the `AnimationNode` class. |

## Properties

| Name | Description |
| --- | --- |
| [BindPoints](../../aspose.threed.animation/animationnode/bindpoints/) { get; } | Gets the current property bind points |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SubAnimations](../../aspose.threed.animation/animationnode/subanimations/) { get; } | Gets the sub-animation nodes under current animations |

## Methods

| Name | Description |
| --- | --- |
| [CreateBindPoint](../../aspose.threed.animation/animationnode/createbindpoint/)(A3DObject, string) | Creates a BindPoint based on the property data type. |
| [FindBindPoint](../../aspose.threed.animation/animationnode/findbindpoint/)(A3DObject, string) | Finds the bind point by target and name. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetBindPoint](../../aspose.threed.animation/animationnode/getbindpoint/)(A3DObject, string, bool) | Gets the animation bind point on given property. |
| [GetKeyframeSequence](../../aspose.threed.animation/animationnode/getkeyframesequence/#getkeyframesequence)(A3DObject, string, bool) | Gets the keyframe sequence on given property. |
| [GetKeyframeSequence](../../aspose.threed.animation/animationnode/getkeyframesequence/#getkeyframesequence_1)(A3DObject, string, string, bool) | Gets the keyframe sequence on given property and channel. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |

### See Also

* class [A3DObject](../../aspose.threed/a3dobject/)
* namespace [Aspose.ThreeD.Animation](../../aspose.threed.animation/)
* assembly [Aspose.3D](../../)


