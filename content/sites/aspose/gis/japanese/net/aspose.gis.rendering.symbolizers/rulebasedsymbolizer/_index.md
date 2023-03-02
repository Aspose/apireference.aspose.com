---
title: Class RuleBasedSymbolizer
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Rendering.Symbolizers.RuleBasedSymbolizer クラス. ユーザー定義のルールに従ってフィーチャ ジオメトリにシンボライザーを適用します
type: docs
weight: 1930
url: /ja/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/
---
## RuleBasedSymbolizer class

ユーザー定義のルールに従って、フィーチャ ジオメトリにシンボライザーを適用します。

```csharp
public class RuleBasedSymbolizer : VectorSymbolizer, IReadOnlyList<Rule>
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [RuleBasedSymbolizer](rulebasedsymbolizer/)() | デフォルトのコンストラクター。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Count](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/count/) { get; } | ルールの数を取得します。 |
| [Item](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/item/) { get; } | 指定された index のルールを取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/#add)(Rule) | ルールを追加します。 |
| [Add](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/#add_1)(Func&lt;Feature, bool&gt;, VectorSymbolizer) | 新規追加[`Rule`](../rule/) . |
| [AddElseRule](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/addelserule/)(VectorSymbolizer) | フィルタリング ルールに一致しない機能に適用されるシンボライザーを追加します。 |
| [GetEnumerator](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/getenumerator/)() | ルールを反復処理する列挙子を返します。 |

### 関連項目

* class [VectorSymbolizer](../vectorsymbolizer/)
* class [Rule](../rule/)
* 名前空間 [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* 組み立て [Aspose.GIS](../../)


