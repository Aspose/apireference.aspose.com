---
title: LabelingRule.CreateFilterRule
second_title: Aspose.GIS for .NET API 参考
description: LabelingRule 方法. 创建新规则在特征通过过滤器时对其应用标签
type: docs
weight: 20
url: /zh/net/aspose.gis.rendering.labelings/labelingrule/createfilterrule/
---
## LabelingRule.CreateFilterRule method

创建新规则，在特征通过过滤器时对其应用标签。

```csharp
public static LabelingRule CreateFilterRule(Func<Feature, bool> filter, Labeling labeling)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| filter | Func`2 | 确定何时应使用标签。 |
| labeling | Labeling | 标签应用。 |

### 返回值

新的 LabelingRule 对象。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 过滤器是`null`. |

### 也可以看看

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [LabelingRule](../)
* 命名空间 [Aspose.Gis.Rendering.Labelings](../../labelingrule/)
* 部件 [Aspose.GIS](../../../)


