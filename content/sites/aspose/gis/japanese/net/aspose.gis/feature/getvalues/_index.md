---
title: Feature.GetValues
second_title: Aspose.GIS for .NET API リファレンス
description: Feature 方法. 配列内のすべての属性の値を返します
type: docs
weight: 50
url: /ja/net/aspose.gis/feature/getvalues/
---
## Feature.GetValues method

配列内のすべての属性の値を返します。

```csharp
public int GetValues(object[] values, object defaultValue = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| values | Object[] | 属性値のコピー先の配列。 |
| defaultValue | Object | 属性値が欠落している (設定されていない) 場合に返される値。デフォルト値は`null`. ' の使用を検討してくださいDBNull'unset' と ' を分離するための .Value'`null`値. |

### 戻り値

いくつかの属性がコピーされました。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| InvalidOperationException | 属性はロックされていません。 |

### 備考

機能の値の属性は、パラメーターとして渡される値の配列にコピーされます。 値が設定されていない属性の場合、指定された「unsetValue」パラメーターが返されます。 値の配列の長さは、フィーチャの属性の数と一致する必要はありません。 配列の長さが属性の数よりも大きい場合、すべての属性値が配列にコピーされます。 小さい場合は、 序数が 0. の属性値から始まる配列長数の属性値のみが配列、 にコピーされます。

### 関連項目

* class [Feature](../)
* 名前空間 [Aspose.Gis](../../feature/)
* 組み立て [Aspose.GIS](../../../)


