---
title: RuleBasedSymbolizer.Add
second_title: Aspose.GIS for .NET API 参考
description: RuleBasedSymbolizer 方法. 添加新的Rule.
type: docs
weight: 40
url: /zh/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/
---
## Add(Func&lt;Feature, bool&gt;, VectorSymbolizer) {#add_1}

添加新的[`Rule`](../../rule/).

```csharp
public void Add(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| filter | Func`2 | 确定何时应将符号器应用于要素。 |
| symbolizer | VectorSymbolizer | 应用于特征的符号器*filter*返回真。 |

### 也可以看看

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [RuleBasedSymbolizer](../)
* 命名空间 [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* 部件 [Aspose.GIS](../../../)

---

## Add(Rule) {#add}

添加规则。

```csharp
public void Add(Rule rule)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| rule | Rule | 要添加的规则。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |

### 也可以看看

* class [Rule](../../rule/)
* class [RuleBasedSymbolizer](../)
* 命名空间 [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* 部件 [Aspose.GIS](../../../)


