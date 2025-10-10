---
title: Class Group
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Group class. A Group represents the logical relationships of Node
type: docs
weight: 1570
url: /net/aspose.threed/group/
---
## Group class

A `Group` represents the logical relationships of [`Node`](../node/).

```csharp
public class Group : A3DObject
```

## Constructors

| Name | Description |
| --- | --- |
| [Group](group/)(string) | Construct a new instance of `Group` |

## Properties

| Name | Description |
| --- | --- |
| [Groups](../../aspose.threed/group/groups/) { get; } | Sub-groups |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [Nodes](../../aspose.threed/group/nodes/) { get; } | The nodes in this group |
| [Parent](../../aspose.threed/group/parent/) { get; } | Parent group of current group |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property |
| override [ToString](../../aspose.threed/group/tostring/)() | Gets the string representation of `Group` |

### See Also

* class [A3DObject](../a3dobject/)
* namespace [Aspose.ThreeD](../../aspose.threed/)
* assembly [Aspose.3D](../../)


