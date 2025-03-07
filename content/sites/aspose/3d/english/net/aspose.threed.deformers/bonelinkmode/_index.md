---
title: Enum BoneLinkMode
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Deformers.BoneLinkMode enum. A bones link mode refers to the way in which a bone is connected or linked to its parent bone within a hierarchical structure
type: docs
weight: 200
url: /net/aspose.threed.deformers/bonelinkmode/
---
## BoneLinkMode enumeration

A bone's link mode refers to the way in which a bone is connected or linked to its parent bone within a hierarchical structure.

```csharp
public enum BoneLinkMode
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Normalize | `0` | In this mode, the transformations of child bones are normalized concerning their parent bone's transformations. |
| Additive | `1` | Additive mode calculates the transformations of child bones by adding their own local transformations to those of their parent bones. |
| TotalOne | `2` | Total One ensures that combined transformations of the parent and child bones result in a combined transformation that scales to an overall length of one unit. |

### See Also

* namespace [Aspose.ThreeD.Deformers](../../aspose.threed.deformers/)
* assembly [Aspose.3D](../../)


