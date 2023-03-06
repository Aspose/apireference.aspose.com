---
title: Feature.GetValuesDump
second_title: Aspose.GIS for .NET API リファレンス
description: Feature 方法. 配列内のすべての属性の値を返します 使用を検討してくださいGetValues追加のメモリ割り当てを回避する方法.
type: docs
weight: 60
url: /ja/net/aspose.gis/feature/getvaluesdump/
---
## Feature.GetValuesDump method

配列内のすべての属性の値を返します。 使用を検討してください[`GetValues`](../getvalues/)追加のメモリ割り当てを回避する方法.

```csharp
public object[] GetValuesDump(object defaultValue = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| defaultValue | Object | 属性値が欠落している (設定されていない) 場合に返される値。デフォルト値は`null`. ' の使用を検討してくださいDBNull'unset' と ' を分離するための .Value'`null`値. |

### 戻り値

属性値をコピーする新しい配列。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| InvalidOperationException | 属性はロックされていません。 |

### 備考

機能の値の属性は、パラメーターとして渡される値の配列にコピーされます。 値が設定されていない属性の場合、指定された「unsetValue」パラメーターが返されます。

### 関連項目

* class [Feature](../)
* 名前空間 [Aspose.Gis](../../feature/)
* 組み立て [Aspose.GIS](../../../)


