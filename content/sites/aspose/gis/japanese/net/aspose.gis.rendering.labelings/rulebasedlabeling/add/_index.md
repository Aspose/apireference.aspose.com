---
title: RuleBasedLabeling.Add
second_title: Aspose.GIS for .NET API リファレンス
description: RuleBasedLabeling 方法. 新規追加LabelingRule .
type: docs
weight: 40
url: /ja/net/aspose.gis.rendering.labelings/rulebasedlabeling/add/
---
## Add(Func&lt;Feature, bool&gt;, Labeling) {#add_1}

新規追加[`LabelingRule`](../../labelingrule/) .

```csharp
public void Add(Func<Feature, bool> filter, Labeling labeling)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| filter | Func`2 | フィーチャにラベリングをいつ適用するかを決定します。 |
| labeling | Labeling | フィーチャに適用するラベリング*filter*true を返します。 |

### 関連項目

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [RuleBasedLabeling](../)
* 名前空間 [Aspose.Gis.Rendering.Labelings](../../rulebasedlabeling/)
* 組み立て [Aspose.GIS](../../../)

---

## Add(LabelingRule) {#add}

ルールを追加します。

```csharp
public void Add(LabelingRule rule)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| rule | LabelingRule | 追加するルール。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |

### 関連項目

* class [LabelingRule](../../labelingrule/)
* class [RuleBasedLabeling](../)
* 名前空間 [Aspose.Gis.Rendering.Labelings](../../rulebasedlabeling/)
* 組み立て [Aspose.GIS](../../../)


