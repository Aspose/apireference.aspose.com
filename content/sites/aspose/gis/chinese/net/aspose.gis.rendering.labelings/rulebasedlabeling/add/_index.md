---
title: RuleBasedLabeling.Add
second_title: Aspose.GIS for .NET API 参考
description: RuleBasedLabeling 方法. 添加新的LabelingRule.
type: docs
weight: 40
url: /zh/net/aspose.gis.rendering.labelings/rulebasedlabeling/add/
---
## Add(Func&lt;Feature, bool&gt;, Labeling) {#add_1}

添加新的[`LabelingRule`](../../labelingrule/).

```csharp
public void Add(Func<Feature, bool> filter, Labeling labeling)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| filter | Func`2 | 确定何时应将标签应用于要素。 |
| labeling | Labeling | 在以下情况下应用于要素的标签*filter*返回真。 |

### 也可以看看

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [RuleBasedLabeling](../)
* 命名空间 [Aspose.Gis.Rendering.Labelings](../../rulebasedlabeling/)
* 部件 [Aspose.GIS](../../../)

---

## Add(LabelingRule) {#add}

添加规则。

```csharp
public void Add(LabelingRule rule)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| rule | LabelingRule | 要添加的规则。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |

### 也可以看看

* class [LabelingRule](../../labelingrule/)
* class [RuleBasedLabeling](../)
* 命名空间 [Aspose.Gis.Rendering.Labelings](../../rulebasedlabeling/)
* 部件 [Aspose.GIS](../../../)


