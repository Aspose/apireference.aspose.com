---
title: Class JoinOptions
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Relationship.Joins.JoinOptions class. Options for layers joining
type: docs
weight: 3930
url: /net/aspose.gis.relationship.joins/joinoptions/
---
## JoinOptions class

Options for layers joining.

```csharp
public class JoinOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [JoinOptions](joinoptions/)() | Create a new instance. |

## Properties

| Name | Description |
| --- | --- |
| [ConditionComparer](../../aspose.gis.relationship.joins/joinoptions/conditioncomparer/) { get; set; } | Defines the way the features of two layers are related in a query by specifying a logic to be used in comparing values from the features. |
| [JoinAttributeName](../../aspose.gis.relationship.joins/joinoptions/joinattributename/) { get; set; } | Specifies an attribute name of the joined layer which value will be used into [`ConditionComparer`](./conditioncomparer/). |
| [JoinAttributeNames](../../aspose.gis.relationship.joins/joinoptions/joinattributenames/) { get; set; } | Specifies a list of attribute names to be joined. If it is `null` or empty, all attributes of the joined layer will be joined. |
| [JoinedAttributesPrefix](../../aspose.gis.relationship.joins/joinoptions/joinedattributesprefix/) { get; set; } | Specifies a prefix string for the joined attribute's names. Default is "joined_". |
| [TargetAttributeName](../../aspose.gis.relationship.joins/joinoptions/targetattributename/) { get; set; } | Specifies an attribute name of the main layer which value will be used into [`ConditionComparer`](./conditioncomparer/). |

### See Also

* namespace [Aspose.Gis.Relationship.Joins](../../aspose.gis.relationship.joins/)
* assembly [Aspose.GIS](../../)


