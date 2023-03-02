---
title: LabelingRule.CreateFilterRule
second_title: Aspose.GIS for .NET API リファレンス
description: LabelingRule 方法. フィルターを通過するたびにフィーチャにラベリングを適用する新しいルールを作成します
type: docs
weight: 20
url: /ja/net/aspose.gis.rendering.labelings/labelingrule/createfilterrule/
---
## LabelingRule.CreateFilterRule method

フィルターを通過するたびにフィーチャにラベリングを適用する新しいルールを作成します。

```csharp
public static LabelingRule CreateFilterRule(Func<Feature, bool> filter, Labeling labeling)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| filter | Func`2 | いつラベリングを使用するかを決定します。 |
| labeling | Labeling | 適用するラベリング。 |

### 戻り値

新しい LabelingRule オブジェクト。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | フィルターは`null`. |

### 関連項目

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [LabelingRule](../)
* 名前空間 [Aspose.Gis.Rendering.Labelings](../../labelingrule/)
* 組み立て [Aspose.GIS](../../../)


