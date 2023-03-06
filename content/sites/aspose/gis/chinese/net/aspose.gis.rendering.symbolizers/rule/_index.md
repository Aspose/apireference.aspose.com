---
title: Class Rule
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.Rendering.Symbolizers.Rule 班级. 用户定义的规则RuleBasedSymbolizer.
type: docs
weight: 1920
url: /zh/net/aspose.gis.rendering.symbolizers/rule/
---
## Rule class

用户定义的规则[`RuleBasedSymbolizer`](../rulebasedsymbolizer/).

```csharp
public class Rule
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Filter](../../aspose.gis.rendering.symbolizers/rule/filter/) { get; } | 确定“过滤规则”是否应将符号化器应用于特征。 如果返回`true`使用符号；否则，功能将被跳过。 |
| [IsElseRule](../../aspose.gis.rendering.symbolizers/rule/iselserule/) { get; } | 获取一个值，指示此规则是否为“else-rule”。 |
| [IsFilterRule](../../aspose.gis.rendering.symbolizers/rule/isfilterrule/) { get; } | 获取一个值，指示此规则是否为“filter-rule”。 |
| [Symbolizer](../../aspose.gis.rendering.symbolizers/rule/symbolizer/) { get; } | 应用于特征的符号器。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.symbolizers/rule/createelserule/)(VectorSymbolizer) | 创建新规则，在不匹配任何过滤规则时将符号器应用于要素。 |
| static [CreateFilterRule](../../aspose.gis.rendering.symbolizers/rule/createfilterrule/)(Func&lt;Feature, bool&gt;, VectorSymbolizer) | 创建新规则，每当它通过过滤器时将符号器应用于特征。 |

### 也可以看看

* 命名空间 [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* 部件 [Aspose.GIS](../../)


