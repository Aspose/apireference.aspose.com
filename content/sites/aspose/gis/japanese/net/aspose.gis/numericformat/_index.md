---
title: Class NumericFormat
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.NumericFormat クラス. NumericFormat text. の一般的な数値型をフォーマットするために使用されます
type: docs
weight: 1290
url: /ja/net/aspose.gis/numericformat/
---
## NumericFormat class

`NumericFormat` text. の一般的な数値型をフォーマットするために使用されます

```csharp
public abstract class NumericFormat
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| static [RoundTrip](../../aspose.gis/numericformat/roundtrip/) { get; } | 変換し、 文字列に変換された数値が解析されて同じ数値に戻されるようにします。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [Flat](../../aspose.gis/numericformat/flat/)(int) | 数値を指数表記なしの固定小数点テキストに変換します。 |
| static [General](../../aspose.gis/numericformat/general/)(int) | 数値の型と精度指定子が存在するかどうかに応じて、数値をよりコンパクトな固定小数点または指数表記の に変換します。使用することをお勧めします. |

### 備考

の 3 種類があります。`NumericFormat` : 一般 - 固定小数点または指数表記。一部の桁数は有効です。 RoundTrip - 固定小数点または指数表記。最大桁数は有効です。フラット - 固定小数点表記。一部の桁数は有効です。 A`NumericFormat`に設定できます[`IGeometry`](../../aspose.gis.geometries/igeometry/)経由[`AsText`](../../aspose.gis.geometries/igeometry/astext/) ジオメトリを Well-Known Text (WKT) 表現に変換するときに数値形式を指定するため。

### 関連項目

* 名前空間 [Aspose.Gis](../../aspose.gis/)
* 組み立て [Aspose.GIS](../../)


