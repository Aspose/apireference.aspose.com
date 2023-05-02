---
title: Class EncoderParameter
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Imaging.EncoderParameter クラス. 値または値の配列をイメージ エンコーダーに渡すために使用されます
type: docs
weight: 700
url: /ja/net/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class

値または値の配列をイメージ エンコーダーに渡すために使用されます。

```csharp
public sealed class EncoderParameter : IDisposable
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [EncoderParameter](encoderparameter/#constructor)(Encoder, byte) | の新しいインスタンスを初期化します`EncoderParameter`指定されたクラスEncoder object と 1 つの符号なし 8 ビット整数。を設定しますValueTypeproperty からValueTypeByte、および設定しますNumberOfValues プロパティを 1. に |
| [EncoderParameter](encoderparameter/#constructor_2)(Encoder, byte[]) | の新しいインスタンスを初期化します`EncoderParameter`指定された を持つクラスEncoderオブジェクトと符号なし 8 ビット整数の配列. ValueTypeプロパティへValueTypeByte, を設定し、NumberOfValues配列内の要素数へのプロパティ. |
| [EncoderParameter](encoderparameter/#constructor_11)(Encoder, long) | の新しいインスタンスを初期化します`EncoderParameter`指定された を持つクラスEncoderオブジェクトと 1 つの 64 ビット整数。を設定しますValueTypeproperty からValueTypeLong(32 ビット)、および the を設定します。NumberOfValuesプロパティを 1. に |
| [EncoderParameter](encoderparameter/#constructor_13)(Encoder, long[]) | の新しいインスタンスを初期化します`EncoderParameter`指定された を持つクラスEncoderオブジェクトと 64 ビット整数の配列。を設定しますValueType プロパティへValueTypeLong(32 ビット)、sets NumberOfValues配列内の要素数へのプロパティ. |
| [EncoderParameter](encoderparameter/#constructor_4)(Encoder, short) | の新しいインスタンスを初期化します`EncoderParameter`指定された を持つクラスEncoderオブジェクトと 1 つの 16 ビット整数。を設定しますValueTypeproperty からValueTypeShort、および設定しますNumberOfValues プロパティを 1. に |
| [EncoderParameter](encoderparameter/#constructor_5)(Encoder, short[]) | の新しいインスタンスを初期化します`EncoderParameter`指定された を持つクラスEncoderオブジェクトと 16 ビット整数の配列。を設定しますValueType プロパティへValueTypeShort、および the を設定しますNumberOfValues配列内の要素数へのプロパティ. |
| [EncoderParameter](encoderparameter/#constructor_15)(Encoder, string) | の新しいインスタンスを初期化します`EncoderParameter`指定された を持つクラスEncoderオブジェクトと文字列。文字列は、 に格納される前に、null で終わる ASCII 文字列に変換されます。EncoderParameter物体。を設定しますValueType プロパティへValueTypeAscii 、sets NumberOfValuesプロパティを NULL ターミネータを含む ASCII 文字列の長さにします。 |
| [EncoderParameter](encoderparameter/#constructor_1)(Encoder, byte, bool) | の新しいインスタンスを初期化します`EncoderParameter`指定された を持つクラスEncoderオブジェクトと 1 つの 8 ビット値。を設定しますValueTypeproperty からValueTypeUndefinedまたValueTypeByte, を設定し、NumberOfValuesプロパティを 1. に |
| [EncoderParameter](encoderparameter/#constructor_3)(Encoder, byte[], bool) | の新しいインスタンスを初期化します`EncoderParameter`指定された を持つクラスEncoderオブジェクトとバイト配列。を設定しますValueType プロパティへValueTypeUndefinedor ValueTypeByte、および設定しますNumberOfValues プロパティを配列の要素数に変更します。 |
| [EncoderParameter](encoderparameter/#constructor_6)(Encoder, int, int) | の新しいインスタンスを初期化します`EncoderParameter`指定された を持つクラスEncoderオブジェクトと 32 ビット整数のペア。整数のペアは分数を表します 最初の整数が分子で、2 番目の整数が分母です. ValueTypeプロパティへValueTypeRational, を設定し、NumberOfValuesプロパティを 1. に |
| [EncoderParameter](encoderparameter/#constructor_9)(Encoder, int[], int[]) | の新しいインスタンスを初期化します`EncoderParameter`指定された を持つクラスEncoderオブジェクトと 32 ビット整数の 2 つの配列。 2 つの配列は分数の配列を表します。 ValueTypeプロパティへValueTypeRational, を設定し、NumberOfValuesプロパティを要素の数 に*numerator*配列の elements の数と同じでなければなりません。*denominator*配列。 |
| [EncoderParameter](encoderparameter/#constructor_12)(Encoder, long, long) | の新しいインスタンスを初期化します`EncoderParameter`指定された を持つクラスEncoderオブジェクトと 64 ビット整数のペア。整数のペアは、整数の範囲を表します。 最初の整数は範囲内の最小の数値で、2 番目の整数は範囲内の最大の数値です。 を設定しますValueTypeプロパティへValueTypeLongRange, を設定し、NumberOfValuesプロパティを 1. に |
| [EncoderParameter](encoderparameter/#constructor_14)(Encoder, long[], long[]) | の新しいインスタンスを初期化します`EncoderParameter`指定された を持つクラスEncoderオブジェクトと 64 ビット整数の 2 つの配列。 2 つの配列は、配列の整数範囲を表します。 ValueTypeプロパティへValueTypeLongRange, を設定し、NumberOfValuesプロパティを要素の数 に*rangebegin*配列の elements の数と同じでなければなりません。*rangeend*配列. |
| [EncoderParameter](encoderparameter/#constructor_7)(Encoder, int, int, int) | の新しいインスタンスを初期化します`EncoderParameter`指定された を持つクラスEncoderオブジェクトと、値の数を指定する 3 つの整数、値のデータ型、 、およびオブジェクトに格納されている値へのポインターEncoderParameterobject. |
| [EncoderParameter](encoderparameter/#constructor_8)(Encoder, int, int, int, int) | の新しいインスタンスを初期化します`EncoderParameter`指定された を持つクラスEncoderオブジェクトと 4 つの 32 ビット整数。 4 つの整数は分数の範囲を表します。 最初の 2 つの整数は範囲内の最小の分数を表し、残りの 2 つの整数は範囲内の 最大の分数を表します。を設定しますValueTypeプロパティ to ValueTypeRationalRange 、sets NumberOfValuesプロパティを 1. に |
| [EncoderParameter](encoderparameter/#constructor_10)(Encoder, int[], int[], int[], int[]) | の新しいインスタンスを初期化します`EncoderParameter`指定された を持つクラスEncoderオブジェクトと 32 ビット整数の 4 つの配列。 4 つの配列は、配列の有理範囲を表します。 有理範囲は、最小小数値から最大小数値までのすべての小数値のセットです。 ValueTypeプロパティへValueTypeRationalRange, を設定し、NumberOfValuesプロパティを要素数 in に*numerator1*この配列は、他の 3 つの配列の要素数と同じでなければなりません. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Encoder](../../system.drawing.imaging/encoderparameter/encoder/) { get; set; } | を取得または設定しますEncoderこれに関連付けられたオブジェクトEncoderParameterobject. のEncoderオブジェクトは、category を指定するグローバル一意識別子 (GUID) をカプセル化します (たとえば、Quality 、ColorDepth , またはCompression に格納されているパラメータのEncoderParameterobject. |
| [NumberOfValues](../../system.drawing.imaging/encoderparameter/numberofvalues/) { get; } | これに格納されている値の配列の要素数を取得しますEncoderParameterobject. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Dispose](../../system.drawing.imaging/encoderparameter/dispose/)() | これによって使用されたすべてのリソースを解放しますEncoderParameterobject. |

### 関連項目

* 名前空間 [System.Drawing.Imaging](../../system.drawing.imaging/)
* 組み立て [Aspose.Drawing](../../)


