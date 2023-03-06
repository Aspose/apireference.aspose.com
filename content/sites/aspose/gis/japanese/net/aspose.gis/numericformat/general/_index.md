---
title: NumericFormat.General
second_title: Aspose.GIS for .NET API リファレンス
description: NumericFormat 方法. 数値の型と精度指定子が存在するかどうかに応じて数値をよりコンパクトな固定小数点または指数表記の に変換します使用することをお勧めします.
type: docs
weight: 30
url: /ja/net/aspose.gis/numericformat/general/
---
## NumericFormat.General method

数値の型と精度指定子が存在するかどうかに応じて、数値をよりコンパクトな固定小数点または指数表記の に変換します。使用することをお勧めします.

```csharp
public static NumericFormat General(int precision = 0)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| precision | Int32 | 精度は、結果の文字列に表示される最大有効桁数を定義します。 精度がゼロの場合、値「15」が使用されます。利用可能な最大精度は「17」です。 |

### 戻り値

一般形式指定子。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentOutOfRangeException | 有効桁数が 0 未満または 17 を超えています。 |

### 備考

内部コードは、coordinate.ToString("G", CultureInfo.InvariantCulture). を介して WKT の数値文字列を生成しています。

### 関連項目

* class [NumericFormat](../)
* 名前空間 [Aspose.Gis](../../numericformat/)
* 組み立て [Aspose.GIS](../../../)


