---
title: Feature.SetValue
second_title: Aspose.GIS for .NET API リファレンス
description: Feature 方法. 属性の新しい値を設定します
type: docs
weight: 100
url: /ja/net/aspose.gis/feature/setvalue/
---
## Feature.SetValue&lt;T&gt; method

属性の新しい値を設定します。

```csharp
public void SetValue<T>(string attributeName, T value)
```

| パラメータ | 説明 |
| --- | --- |
| T | 値の型。 |
| attributeName | 属性の名前。 |
| value | 属性の値。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 属性名は`null`. |
| ArgumentException | この名前の属性は、このレイヤーには存在しません。 |
| InvalidOperationException | 属性はロックされていません。 |
| InvalidCastException | 値の型が実装されていませんIConvertible. |
| FormatException | 値の形式が正しくないため、変換に失敗しました。 |
| OverflowException | オーバーフローのため変換に失敗しました。 |

### 備考

このメソッドは、値を属性のタイプに自動的に変換します。

### 関連項目

* class [Feature](../)
* 名前空間 [Aspose.Gis](../../feature/)
* 組み立て [Aspose.GIS](../../../)


