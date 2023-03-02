---
title: Rule.CreateFilterRule
second_title: Aspose.GIS for .NET API 参考
description: Rule 方法. 创建新规则每当它通过过滤器时将符号器应用于特征
type: docs
weight: 20
url: /zh/net/aspose.gis.rendering.symbolizers/rule/createfilterrule/
---
## Rule.CreateFilterRule method

创建新规则，每当它通过过滤器时将符号器应用于特征。

```csharp
public static Rule CreateFilterRule(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| filter | Func`2 | 确定何时应使用符号器。 |
| symbolizer | VectorSymbolizer | 要应用的符号器。 |

### 返回值

新规则对象。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 过滤器是`null`. |

### 也可以看看

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [Rule](../)
* 命名空间 [Aspose.Gis.Rendering.Symbolizers](../../rule/)
* 部件 [Aspose.GIS](../../../)


