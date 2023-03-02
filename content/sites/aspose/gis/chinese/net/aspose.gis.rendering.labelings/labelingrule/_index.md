---
title: Class LabelingRule
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.Rendering.Labelings.LabelingRule 班级. 用户定义的规则RuleBasedLabeling.
type: docs
weight: 1630
url: /zh/net/aspose.gis.rendering.labelings/labelingrule/
---
## LabelingRule class

用户定义的规则[`RuleBasedLabeling`](../rulebasedlabeling/).

```csharp
public class LabelingRule
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Filter](../../aspose.gis.rendering.labelings/labelingrule/filter/) { get; } | 确定“过滤规则”是否应将标签应用到特征。 如果返回`true`使用标签；否则，功能将被跳过。 |
| [IsElseRule](../../aspose.gis.rendering.labelings/labelingrule/iselserule/) { get; } | 获取一个值，指示此规则是否为“else-rule”。 |
| [IsFilterRule](../../aspose.gis.rendering.labelings/labelingrule/isfilterrule/) { get; } | 获取一个值，指示此规则是否为“filter-rule”。 |
| [Labeling](../../aspose.gis.rendering.labelings/labelingrule/labeling/) { get; } | 应用于特征的标签。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.labelings/labelingrule/createelserule/)(Labeling) | 创建新规则，在不匹配任何过滤规则时将标签应用于要素。 |
| static [CreateFilterRule](../../aspose.gis.rendering.labelings/labelingrule/createfilterrule/)(Func&lt;Feature, bool&gt;, Labeling) | 创建新规则，在特征通过过滤器时对其应用标签。 |

### 也可以看看

* 命名空间 [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* 部件 [Aspose.GIS](../../)


