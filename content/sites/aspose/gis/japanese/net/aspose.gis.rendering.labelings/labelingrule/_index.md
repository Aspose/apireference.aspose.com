---
title: Class LabelingRule
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Rendering.Labelings.LabelingRule クラス. のユーザー定義ルールRuleBasedLabeling .
type: docs
weight: 1630
url: /ja/net/aspose.gis.rendering.labelings/labelingrule/
---
## LabelingRule class

のユーザー定義ルール[`RuleBasedLabeling`](../rulebasedlabeling/) .

```csharp
public class LabelingRule
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Filter](../../aspose.gis.rendering.labelings/labelingrule/filter/) { get; } | 「filter-rule」が機能にラベリングを適用するかどうかを決定します。 が返される場合`true`ラベル付けが使用されます。それ以外の場合、機能はスキップされます. |
| [IsElseRule](../../aspose.gis.rendering.labelings/labelingrule/iselserule/) { get; } | このルールが「else-rule」かどうかを示す値を取得します。 |
| [IsFilterRule](../../aspose.gis.rendering.labelings/labelingrule/isfilterrule/) { get; } | このルールが「filter-rule」であるかどうかを示す値を取得します。 |
| [Labeling](../../aspose.gis.rendering.labelings/labelingrule/labeling/) { get; } | 機能に適用するラベリング。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.labelings/labelingrule/createelserule/)(Labeling) | どのフィルター ルールとも一致しない場合にフィーチャにラベルを適用する新しいルールを作成します。 |
| static [CreateFilterRule](../../aspose.gis.rendering.labelings/labelingrule/createfilterrule/)(Func&lt;Feature, bool&gt;, Labeling) | フィルターを通過するたびにフィーチャにラベリングを適用する新しいルールを作成します。 |

### 関連項目

* 名前空間 [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* 組み立て [Aspose.GIS](../../)


