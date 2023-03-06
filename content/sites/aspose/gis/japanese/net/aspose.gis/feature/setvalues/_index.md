---
title: Feature.SetValues
second_title: Aspose.GIS for .NET API リファレンス
description: Feature 方法. すべての属性に新しい値を設定します の使用も検討してくださいCopyValues 1回の呼び出しで設定値を効率化するメソッド.
type: docs
weight: 120
url: /ja/net/aspose.gis/feature/setvalues/
---
## Feature.SetValues method

すべての属性に新しい値を設定します。 の使用も検討してください。[`CopyValues`](../copyvalues/) 1回の呼び出しで設定値を効率化するメソッド.

```csharp
public int SetValues(object[] values)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| values | Object[] | 新しい値の配列。 |

### 戻り値

設定された属性値の数。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数を指定できません`null`. |
| ArgumentException | この名前の属性は、このレイヤーには存在しません。 |
| InvalidOperationException | 属性はロックされていません。 |
| InvalidCastException | 値の型が実装されていませんIConvertible. |
| FormatException | 値の形式が正しくないため、変換に失敗しました。 |
| OverflowException | オーバーフローのため変換に失敗しました。 |

### 備考

このメソッドは、各値を自動的に属性の型に変換します。  値の配列の長さは、フィーチャの属性の数と一致する必要はありません。 配列の長さが属性の数よりも大きい場合、すべての配列値が属性にコピーされます。 小さい場合は、 序数 0. の属性値から始まる、配列長の数の値のみが属性 にコピーされます。

### 関連項目

* class [Feature](../)
* 名前空間 [Aspose.Gis](../../feature/)
* 組み立て [Aspose.GIS](../../../)


