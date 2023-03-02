---
title: Class Rule
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Rendering.Symbolizers.Rule クラス. のユーザー定義ルールRuleBasedSymbolizer .
type: docs
weight: 1920
url: /ja/net/aspose.gis.rendering.symbolizers/rule/
---
## Rule class

のユーザー定義ルール[`RuleBasedSymbolizer`](../rulebasedsymbolizer/) .

```csharp
public class Rule
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Filter](../../aspose.gis.rendering.symbolizers/rule/filter/) { get; } | 「filter-rule」が機能にシンボライザーを適用するかどうかを決定します。 が返される場合`true`シンボライザーが使用されます。それ以外の場合、機能はスキップされます. |
| [IsElseRule](../../aspose.gis.rendering.symbolizers/rule/iselserule/) { get; } | このルールが「else-rule」かどうかを示す値を取得します。 |
| [IsFilterRule](../../aspose.gis.rendering.symbolizers/rule/isfilterrule/) { get; } | このルールが「filter-rule」であるかどうかを示す値を取得します。 |
| [Symbolizer](../../aspose.gis.rendering.symbolizers/rule/symbolizer/) { get; } | 機能に適用するシンボライザー。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.symbolizers/rule/createelserule/)(VectorSymbolizer) | フィルター ルールに一致しない場合はいつでもシンボライザーを機能に適用する新しいルールを作成します。 |
| static [CreateFilterRule](../../aspose.gis.rendering.symbolizers/rule/createfilterrule/)(Func&lt;Feature, bool&gt;, VectorSymbolizer) | フィルターを通過するたびにシンボライザーを機能に適用する新しいルールを作成します。 |

### 関連項目

* 名前空間 [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* 組み立て [Aspose.GIS](../../)


