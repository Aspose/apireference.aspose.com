---
title: Rule.CreateFilterRule
second_title: Aspose.GIS for .NET API リファレンス
description: Rule 方法. フィルターを通過するたびにシンボライザーを機能に適用する新しいルールを作成します
type: docs
weight: 20
url: /ja/net/aspose.gis.rendering.symbolizers/rule/createfilterrule/
---
## Rule.CreateFilterRule method

フィルターを通過するたびにシンボライザーを機能に適用する新しいルールを作成します。

```csharp
public static Rule CreateFilterRule(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| filter | Func`2 | シンボライザーをいつ使用するかを決定します。 |
| symbolizer | VectorSymbolizer | 適用するシンボライザー。 |

### 戻り値

新しいルール オブジェクト。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | フィルターは`null`. |

### 関連項目

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [Rule](../)
* 名前空間 [Aspose.Gis.Rendering.Symbolizers](../../rule/)
* 組み立て [Aspose.GIS](../../../)


