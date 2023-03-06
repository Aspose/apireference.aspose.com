---
title: Class RuleBasedLabeling
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Rendering.Labelings.RuleBasedLabeling クラス. ユーザー定義のルールに従ってフィーチャにラベリングを適用します
type: docs
weight: 1690
url: /ja/net/aspose.gis.rendering.labelings/rulebasedlabeling/
---
## RuleBasedLabeling class

ユーザー定義のルールに従って、フィーチャにラベリングを適用します。

```csharp
public class RuleBasedLabeling : Labeling, IReadOnlyList<LabelingRule>
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [RuleBasedLabeling](rulebasedlabeling/)() | デフォルトのコンストラクター。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Count](../../aspose.gis.rendering.labelings/rulebasedlabeling/count/) { get; } | ルールの数を取得します。 |
| [Item](../../aspose.gis.rendering.labelings/rulebasedlabeling/item/) { get; } | 指定された index のルールを取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add](../../aspose.gis.rendering.labelings/rulebasedlabeling/add/#add)(LabelingRule) | ルールを追加します。 |
| [Add](../../aspose.gis.rendering.labelings/rulebasedlabeling/add/#add_1)(Func&lt;Feature, bool&gt;, Labeling) | 新規追加[`LabelingRule`](../labelingrule/) . |
| [AddElseRule](../../aspose.gis.rendering.labelings/rulebasedlabeling/addelserule/)(Labeling) | フィルタリング ルールに一致しないフィーチャに適用されるラベルを追加します。 |
| [GetEnumerator](../../aspose.gis.rendering.labelings/rulebasedlabeling/getenumerator/)() | ルールを反復処理する列挙子を返します。 |

### 関連項目

* class [Labeling](../labeling/)
* class [LabelingRule](../labelingrule/)
* 名前空間 [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* 組み立て [Aspose.GIS](../../)


