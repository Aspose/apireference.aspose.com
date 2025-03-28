---
title: Class ArbitraryProfile
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Profiles.ArbitraryProfile class. This class allows you to construct a 2D profile directly from arbitrary curve
type: docs
weight: 1570
url: /net/aspose.threed.profiles/arbitraryprofile/
---
## ArbitraryProfile class

This class allows you to construct a 2D profile directly from arbitrary curve.

```csharp
public class ArbitraryProfile : Profile
```

## Constructors

| Name | Description |
| --- | --- |
| [ArbitraryProfile](arbitraryprofile/#constructor)() | Constructor of `ArbitraryProfile` |
| [ArbitraryProfile](arbitraryprofile/#constructor_1)(Curve) | Constructor of `ArbitraryProfile` with an initial curve. |

## Properties

| Name | Description |
| --- | --- |
| [Curve](../../aspose.threed.profiles/arbitraryprofile/curve/) { get; set; } | The Curve used to construct the profile |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system. |
| override [GetEntityRendererKey](../../aspose.threed.profiles/profile/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property |

### See Also

* class [Profile](../profile/)
* namespace [Aspose.ThreeD.Profiles](../../aspose.threed.profiles/)
* assembly [Aspose.3D](../../)


