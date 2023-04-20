---
title: Class Color
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Drawing.Color クラス. Color クラスでは色を 赤緑青 RGB 値 色相彩度明度 HSL 値 色相彩度値 HSV 値 色相白度黒度 HWB として指定できます  値 明度AB LAB 値 輝度彩度色相 LCH 値 シアンマゼンタイエローキー CMYK 値 ナチュラル カラー NCOL 値 または色名付き. 透明度を示すアルファチャンネルも利用できます.
type: docs
weight: 1390
url: /ja/net/aspose.svg.drawing/color/
---
## Color class

Color クラスでは、色を 赤緑青 (RGB) 値、 色相彩度明度 (HSL) 値、 色相彩度値 (HSV) 値、 色相白度黒度 (HWB) として指定できます。 ) 値、 明度-AB (LAB) 値、 輝度-彩度-色相 (LCH) 値、 シアン-マゼンタ-イエロー-キー (CMYK) 値、 ナチュラル カラー (NCOL) 値、 または色名付き. 透明度を示すアルファチャンネルも利用できます.

```csharp
public class Color
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Color](color/#constructor)() | の新しいインスタンスを初期化します`Color` class. デフォルトの色は黒です. |
| [Color](color/#constructor_1)(byte, byte, byte) | の新しいインスタンスを初期化します`Color`class. すべてのカラー コンポーネントは 0 ～ 255 の範囲内である必要があります。 |
| [Color](color/#constructor_5)(float, float, float) | の新しいインスタンスを初期化します`Color` class. すべての色成分は 0 ～ 1 の範囲内である必要があります。 |
| [Color](color/#constructor_3)(int, int, int) | の新しいインスタンスを初期化します`Color`class. すべてのカラー コンポーネントは 0 ～ 255 の範囲内である必要があります。 |
| [Color](color/#constructor_2)(byte, byte, byte, byte) | の新しいインスタンスを初期化します`Color`class. すべてのカラー コンポーネントは 0 ～ 255 の範囲内である必要があります。 |
| [Color](color/#constructor_6)(float, float, float, float) | の新しいインスタンスを初期化します`Color` class. すべての色成分は 0 ～ 1 の範囲内である必要があります。 |
| [Color](color/#constructor_4)(int, int, int, int) | の新しいインスタンスを初期化します`Color`class. すべてのカラー コンポーネントは 0 ～ 255 の範囲内である必要があります。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Alpha](../../aspose.svg.drawing/color/alpha/) { get; } | 色のアルファ成分を表します. |
| [Blue](../../aspose.svg.drawing/color/blue/) { get; } | 色の青の成分を表します. |
| [Green](../../aspose.svg.drawing/color/green/) { get; } | 色の緑の成分を表します. |
| [Red](../../aspose.svg.drawing/color/red/) { get; } | color の赤のコンポーネントを表します |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [FromCmyk](../../aspose.svg.drawing/color/fromcmyk/)(float, float, float, float) | 要求されたシアン、マゼンタ、イエロー、キー (黒) の値を持つ新しい Color を返します。 |
| static [FromCmyka](../../aspose.svg.drawing/color/fromcmyka/)(float, float, float, float, float) | 要求されたシアン、マゼンタ、イエロー、キー (黒)、アルファ値を持つ新しい Color を返します。 |
| static [FromGray](../../aspose.svg.drawing/color/fromgray/)(float) | 要求されたグレー値で新しい Color を返します。 |
| static [FromHsl](../../aspose.svg.drawing/color/fromhsl/)(float, float, float) | 要求された色相、彩度、彩度の値を持つ新しい Color を返します。 |
| static [FromHsla](../../aspose.svg.drawing/color/fromhsla/)(float, float, float, float) | 要求された色相、彩度、彩度、アルファ値を持つ新しい Color を返します。 |
| static [FromHsv](../../aspose.svg.drawing/color/fromhsv/)(float, float, float) | 要求された色相、彩度、値を持つ新しい Color を返します。 |
| static [FromHsva](../../aspose.svg.drawing/color/fromhsva/)(float, float, float, float) | 要求された色相、彩度、値、アルファを持つ新しい Color を返します。 |
| static [FromHwb](../../aspose.svg.drawing/color/fromhwb/)(float, float, float) | 要求された色相、白さ、黒さの値を持つ新しい Color を返します。 |
| static [FromHwba](../../aspose.svg.drawing/color/fromhwba/)(float, float, float, float) | 要求された色相、白さ、黒さの値を持つ新しい Color を返します。 |
| static [FromInt](../../aspose.svg.drawing/color/fromint/)(int) | 要求された ARGB 値を持つ新しい Color を返します. |
| static [FromLab](../../aspose.svg.drawing/color/fromlab/)(float, float, float) | 要求された明度、A、B 値を持つ新しい Color を返します。 |
| static [FromLaba](../../aspose.svg.drawing/color/fromlaba/)(float, float, float, float) | 要求された明度、A、B、アルファ値を持つ新しい Color を返します。 |
| static [FromLch](../../aspose.svg.drawing/color/fromlch/)(float, float, float) | 要求された輝度、彩度、色相の値を持つ新しい Color を返します。 |
| static [FromLcha](../../aspose.svg.drawing/color/fromlcha/)(float, float, float, float) | 要求された輝度、彩度、色相、アルファ値を持つ新しい Color を返します。 |
| static [FromOklab](../../aspose.svg.drawing/color/fromoklab/)(float, float, float) | OKLAB モデルの要求された明度、A、B 値を持つ新しい色を返します。 |
| static [FromOklaba](../../aspose.svg.drawing/color/fromoklaba/)(float, float, float, float) | OKLAB モデルの要求された明度、A、B、アルファ値を持つ新しい色を返します。 |
| static [FromOklch](../../aspose.svg.drawing/color/fromoklch/)(float, float, float) | OKLAB モデルの要求された輝度、彩度、色相の値を持つ新しい色を返します。 |
| static [FromOklcha](../../aspose.svg.drawing/color/fromoklcha/)(float, float, float, float) | OKLAB モデルの要求された輝度、彩度、色相、アルファ値を持つ新しい色を返します。 |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb/#fromrgb)(byte, byte, byte) | 要求された ged、green、blue 値を持つ新しい Color を返します。 すべての色成分は 0 ～ 255 の範囲内である必要があります。 |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb/#fromrgb_2)(float, float, float) | 要求された ged、green、blue の値を持つ新しい Color を返します。 すべてのカラー コンポーネントは 0 ～ 1 の範囲内である必要があります。 |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb/#fromrgb_1)(int, int, int) | 要求された ged、green、blue 値を持つ新しい Color を返します。 すべての色成分は 0 ～ 255 の範囲内である必要があります。 |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba/#fromrgba)(byte, byte, byte, byte) | 要求された ged、green、blue、alpha 値を持つ新しい Color を返します。 すべてのカラー コンポーネントは 0 ～ 255 の範囲内である必要があります。 |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba/#fromrgba_2)(float, float, float, float) | 要求された ged、green、blue、alpha 値を持つ新しい Color を返します。 すべてのカラー コンポーネントは 0 ～ 1 の範囲内である必要があります。 |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba/#fromrgba_1)(int, int, int, int) | 要求された ged、green、blue、alpha 値を持つ新しい Color を返します。 すべてのカラー コンポーネントは 0 ～ 255 の範囲内である必要があります。 |
| static [FromString](../../aspose.svg.drawing/color/fromstring/)(string) | CSS カラーを含む文字列を解析し、新しい Color. を返します。 |
| static [FromUint](../../aspose.svg.drawing/color/fromuint/)(uint) | 要求された ARGB 値を持つ新しい Color を返します. |
| [AddLuminosity](../../aspose.svg.drawing/color/addluminosity/)(float) | 明るさとデルタ値の合計で色のコピーを作成します. |
| [Convert](../../aspose.svg.drawing/color/convert/)(ColorModel) | 指定されたカラー モデルの形式でカラー コンポーネントを返します。 |
| override [Equals](../../aspose.svg.drawing/color/equals/)(object) | 指定された`Color`このインスタンスと等しい. |
| [GetComplementary](../../aspose.svg.drawing/color/getcomplementary/)() | 元のカラー ホイールの反対側にある新しい色を返します。 |
| override [GetHashCode](../../aspose.svg.drawing/color/gethashcode/)() | ハッシュコードを返します. |
| [GetHue](../../aspose.svg.drawing/color/gethue/)() | 色の色相を返します. |
| [GetLuminosity](../../aspose.svg.drawing/color/getluminosity/)() | Color の明度を返します。 |
| [GetSaturation](../../aspose.svg.drawing/color/getsaturation/)() | Color の彩度を返します。 |
| [ToInt](../../aspose.svg.drawing/color/toint/)() | Color ARGB コンポーネントを int. にエンコードします。 |
| [ToName](../../aspose.svg.drawing/color/toname/)() | CSS の名前付き色のリスト内の色、または空の文字列に一致する場合は、色の名前を返します。 |
| [ToNaturalColorString](../../aspose.svg.drawing/color/tonaturalcolorstring/)(int) | 色からの距離 (パーセント) を指定する数値を含む色文字を使用して、自然色 (NCol) で指定された色を返します。 |
| [ToRgbaHexString](../../aspose.svg.drawing/color/torgbahexstring/)() | #RRGGBBAA. で指定された 16 進数の色を返します。 |
| [ToRgbaString](../../aspose.svg.drawing/color/torgbastring/)() | rgba(R, G, B, A). で指定された RGBA カラーを含む文字列を返します。 |
| [ToRgbHexString](../../aspose.svg.drawing/color/torgbhexstring/)() | #RRGGBB. で指定された 16 進数の色を返します。 |
| [ToRgbString](../../aspose.svg.drawing/color/torgbstring/)() | rgb(R, G, B). で指定された RGB カラーを含む文字列を返します。 |
| override [ToString](../../aspose.svg.drawing/color/tostring/)() | RGBA コンポーネント値で構成される文字列を返します。 |
| [ToUint](../../aspose.svg.drawing/color/touint/)() | Color ARGB コンポーネントを unsigned int. にエンコードします。 |
| [WithAlpha](../../aspose.svg.drawing/color/withalpha/)(float) | 指定されたアルファ コンポーネントで Color のコピーを作成します。 |
| [WithHue](../../aspose.svg.drawing/color/withhue/)(float) | 指定された色相で色のコピーを作成します。 |
| [WithLuminosity](../../aspose.svg.drawing/color/withluminosity/)(float) | 指定された明度で色のコピーを作成します. |
| [WithSaturation](../../aspose.svg.drawing/color/withsaturation/)(float) | 指定された彩度で Color のコピーを作成します。 |

### 関連項目

* 名前空間 [Aspose.Svg.Drawing](../../aspose.svg.drawing/)
* 組み立て [Aspose.SVG](../../)


