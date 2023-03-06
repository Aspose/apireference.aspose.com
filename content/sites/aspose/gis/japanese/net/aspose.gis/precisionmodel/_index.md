---
title: Class PrecisionModel
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.PrecisionModel クラス. PrecisionModel座標の有効桁数を指定します.
type: docs
weight: 1310
url: /ja/net/aspose.gis/precisionmodel/
---
## PrecisionModel class

`PrecisionModel`座標の有効桁数を指定します.

```csharp
public abstract class PrecisionModel : IEquatable<PrecisionModel>
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| static [Exact](../../aspose.gis/precisionmodel/exact/) { get; } | 正確な精度モデルを返します. 正確な精度モデルによれば、double 値のすべての桁が有効です. |
| [IsExact](../../aspose.gis/precisionmodel/isexact/) { get; } | この精度モデルが正確かどうかを示す値を取得します。 |
| [IsRounding](../../aspose.gis/precisionmodel/isrounding/) { get; } | この精度モデルが丸められているかどうかを示す値を取得します。 |
| abstract [SignificantDigits](../../aspose.gis/precisionmodel/significantdigits/) { get; } | 丸めの場合、精度モデルの有効桁数を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [Rounding](../../aspose.gis/precisionmodel/rounding/)(int) | 丸め精度モデルを返します。 丸め精度モデルによると、有効な桁数は限られています。 |
| override [Equals](../../aspose.gis/precisionmodel/equals/#equals_1)(object) | 現在のオブジェクトが同じ型の別のオブジェクトと等しいかどうかを示します。 |
| [Equals](../../aspose.gis/precisionmodel/equals/#equals)(PrecisionModel) | 現在のオブジェクトが同じ型の別のオブジェクトと等しいかどうかを示します。 |
| override [GetHashCode](../../aspose.gis/precisionmodel/gethashcode/)() | デフォルトのハッシュ関数として機能します。 |
| [operator ==](../../aspose.gis/precisionmodel/op_equality/) | 演算子 ==. を実装します |
| [operator !=](../../aspose.gis/precisionmodel/op_inequality/) | 演算子 !=. を実装します |

### 備考

PrecisionModel には 2 つのタイプがあります: ちょうど`PrecisionModel`(すべての数字は有効です);丸みを帯びた`PrecisionModel`(一部の桁数は有効です)。 A`PrecisionModel`に設定できます[`VectorLayer`](../vectorlayer/)経由[`DriverOptions`](../driveroptions/) ジオメトリの書き込みまたは読み取り時に座標を丸めるため。

### 関連項目

* property [XYPrecisionModel](../driveroptions/xyprecisionmodel/)
* property [ZPrecisionModel](../driveroptions/zprecisionmodel/)
* property [MPrecisionModel](../driveroptions/mprecisionmodel/)
* 名前空間 [Aspose.Gis](../../aspose.gis/)
* 組み立て [Aspose.GIS](../../)


