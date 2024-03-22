---
title: Class Property
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Property class. Class to hold userdefined properties
type: docs
weight: 40
url: /net/aspose.threed/property/
---
## Property class

Class to hold user-defined properties.

```csharp
public abstract class Property : A3DObject
```

## Properties

| Name | Description |
| --- | --- |
| override [Name](../../aspose.threed/property/name/) { set; } |  |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../a3dobject/).) |
| abstract [Value](../../aspose.threed/property/value/) { get; set; } | Gets or sets the value. |
| abstract [ValueType](../../aspose.threed/property/valuetype/) { get; } | Gets the type of the property value. |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../a3dobject/).) |
| [GetBindPoint](../../aspose.threed/property/getbindpoint/)(AnimationNode, bool) | Gets the property bind point on specified animation instance. |
| [GetKeyframeSequence](../../aspose.threed/property/getkeyframesequence/)(AnimationNode, bool) | Gets the keyframe sequence on specified animation instance. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../a3dobject/).) |
| override [ToString](../../aspose.threed/property/tostring/)() | Returns a string that represents the current `Property`. |

### See Also

* class [A3DObject](../a3dobject/)
* namespace [Aspose.ThreeD](../../aspose.threed/)
* assembly [Aspose.3D](../../)


