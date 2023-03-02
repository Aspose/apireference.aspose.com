---
title: NumericFormat.Flat
second_title: Aspose.GIS for .NET API リファレンス
description: NumericFormat 方法. 数値を指数表記なしの固定小数点テキストに変換します
type: docs
weight: 20
url: /ja/net/aspose.gis/numericformat/flat/
---
## NumericFormat.Flat method

数値を指数表記なしの固定小数点テキストに変換します。

```csharp
public static NumericFormat Flat(int significantDigits)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| significantDigits | Int32 | 有効桁数。利用可能な最大精度は「308」です |

### 戻り値

丸め精度指定子。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentOutOfRangeException | 有効桁数が 0 未満または 308 を超えています。 |

### 備考

内部コードは、次の方法で WKT の数値文字列を生成しています。

### 関連項目

* class [NumericFormat](../)
* 名前空間 [Aspose.Gis](../../numericformat/)
* 組み立て [Aspose.GIS](../../../)


