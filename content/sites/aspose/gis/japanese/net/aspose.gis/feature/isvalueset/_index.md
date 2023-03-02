---
title: Feature.IsValueSet
second_title: Aspose.GIS for .NET API リファレンス
description: Feature 方法. この機能に属性値が設定されているかどうかを確認します
type: docs
weight: 90
url: /ja/net/aspose.gis/feature/isvalueset/
---
## Feature.IsValueSet method

この機能に属性値が設定されているかどうかを確認します。

```csharp
public bool IsValueSet(string attributeName)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| attributeName | String | 属性の名前。 |

### 戻り値

`true`指定された属性の値が設定されている場合。さもないと、`false` .

### 例外

| 例外 | 調子 |
| --- | --- |
| InvalidOperationException | 属性はロックされていません。 |
| ArgumentException | この名前の属性は、このレイヤーには存在しません。 |
| ArgumentNullException | 属性名は`null`. |

### 関連項目

* class [Feature](../)
* 名前空間 [Aspose.Gis](../../feature/)
* 組み立て [Aspose.GIS](../../../)


