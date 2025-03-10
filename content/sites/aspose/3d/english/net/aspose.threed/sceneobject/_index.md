---
title: Class SceneObject
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.SceneObject class. The root class of objects that will be stored inside a scene
type: docs
weight: 2410
url: /net/aspose.threed/sceneobject/
---
## SceneObject class

The root class of objects that will be stored inside a scene.

```csharp
public abstract class SceneObject : A3DObject
```

## Constructors

| Name | Description |
| --- | --- |
| [SceneObject](sceneobject/#constructor)() | Initialize an SceneObject. |
| [SceneObject](sceneobject/#constructor_1)(string) | Initialize an SceneObject with a default name |

## Properties

| Name | Description |
| --- | --- |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property |

### See Also

* class [A3DObject](../a3dobject/)
* namespace [Aspose.ThreeD](../../aspose.threed/)
* assembly [Aspose.3D](../../)


