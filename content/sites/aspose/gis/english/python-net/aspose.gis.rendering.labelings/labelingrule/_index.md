---
title: LabelingRule Class
type: docs
weight: 30
url: /python-net/aspose.gis.rendering.labelings/labelingrule/
---

**Summary:** A user-defined rule for [RuleBasedLabeling](/psd/python-net/aspose.gis.rendering.labelings/rulebasedlabeling/).

**Module:** [aspose.gis.rendering.labelings](/psd/python-net/aspose.gis.rendering.labelings/)

**Full Name:** aspose.gis.rendering.labelings.LabelingRule

**Aspose.PSD Version:** 25.9.0

## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| is_else_rule | bool | r | Gets a value indicating whether this rule is "else-rule". |
| is_filter_rule | bool | r | Gets a value indicating whether this rule is "filter-rule". |
| labeling | [Labeling](/psd/python-net/aspose.gis.rendering.labelings/labeling) | r | Labeling to apply to the feature. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [create_else_rule(labeling)](#create_else_rule_labeling_1) | Creates new rule that applies a labeling to feature whenever it doesn't match any filter rule. |


### Method: create_else_rule(labeling)  [static] {#create_else_rule_labeling_1}


```
 create_else_rule(labeling) 
```

Creates new rule that applies a labeling to feature whenever it doesn't match any filter rule.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| labeling | [Labeling](/psd/python-net/aspose.gis.rendering.labelings/labeling) | Labeling to apply. |

**Returns**

| Type | Description |
| :- | :- |
| [LabelingRule](/psd/python-net/aspose.gis.rendering.labelings/labelingrule) | New LabelingRule object. |


