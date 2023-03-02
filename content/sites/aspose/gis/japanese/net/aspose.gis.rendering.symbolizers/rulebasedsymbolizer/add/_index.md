---
title: RuleBasedSymbolizer.Add
second_title: Aspose.GIS for .NET API リファレンス
description: RuleBasedSymbolizer 方法. 新規追加Rule .
type: docs
weight: 40
url: /ja/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/
---
## Add(Func&lt;Feature, bool&gt;, VectorSymbolizer) {#add_1}

新規追加[`Rule`](../../rule/) .

```csharp
public void Add(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| filter | Func`2 | シンボライザーをフィーチャにいつ適用するかを決定します。 |
| symbolizer | VectorSymbolizer | 機能に適用するシンボライザー*filter*true を返します。 |

### 関連項目

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [RuleBasedSymbolizer](../)
* 名前空間 [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* 組み立て [Aspose.GIS](../../../)

---

## Add(Rule) {#add}

ルールを追加します。

```csharp
public void Add(Rule rule)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| rule | Rule | 追加するルール。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |

### 関連項目

* class [Rule](../../rule/)
* class [RuleBasedSymbolizer](../)
* 名前空間 [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* 組み立て [Aspose.GIS](../../../)


