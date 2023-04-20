---
title: Class CSSPrimitiveValue
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Dom.Css.CSSPrimitiveValue クラス. CSSPrimitiveValue インターフェイスは単一の CSS 値を表しますこのインターフェイスを使用して現在ブロックに設定されている特定のスタイル プロパティの値を決定したりブロック内で特定のスタイル プロパティを明示的に設定したりできますこのインターフェースのインスタンスはCSSStyleDeclaration インターフェースの getPropertyCSSValue メソッドから取得できます CSSPrimitiveValue オブジェクトはCSS プロパティのコンテキストでのみ発生します.
type: docs
weight: 480
url: /ja/net/aspose.svg.dom.css/cssprimitivevalue/
---
## CSSPrimitiveValue class

CSSPrimitiveValue インターフェイスは、単一の CSS 値を表します。このインターフェイスを使用して、現在ブロックに設定されている特定のスタイル プロパティの値を決定したり、ブロック内で特定のスタイル プロパティを明示的に設定したりできます。このインターフェースのインスタンスは、CSSStyleDeclaration インターフェースの getPropertyCSSValue メソッドから取得できます。 CSSPrimitiveValue オブジェクトは、CSS プロパティのコンテキストでのみ発生します.

```csharp
public abstract class CSSPrimitiveValue : CSSValue
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| abstract [CSSText](../../aspose.svg.dom.css/cssvalue/csstext/) { get; set; } | 現在の値の文字列表現. |
| [CSSValueType](../../aspose.svg.dom.css/cssvalue/cssvaluetype/) { get; } | 値の型を定義するコード. |
| [PrimitiveType](../../aspose.svg.dom.css/cssprimitivevalue/primitivetype/) { get; } | 上記で指定された定数によって定義された値のタイプ。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| override [Equals](../../aspose.svg.dom.css/cssvalue/equals/)(object) | 指定されたObjectこのインスタンスと等しい. |
| abstract [GetCounterValue](../../aspose.svg.dom.css/cssprimitivevalue/getcountervalue/)() | このメソッドは、カウンター値を取得するために使用されます。この CSS 値にカウンター値が含まれていない場合、DOMException が発生します。 Counter インターフェイスを使用して、対応するスタイル プロパティを変更できます。 |
| abstract [GetFloatValue](../../aspose.svg.dom.css/cssprimitivevalue/getfloatvalue/)(ushort) | このメソッドは、指定された単位で float 値を取得するために使用されます。この CSS 値に float 値が含まれていない場合、または指定された単位に変換できない場合は、DOMException が発生します。 |
| override [GetHashCode](../../aspose.svg.dom.css/cssvalue/gethashcode/)() | このインスタンスのハッシュ コードを返します。 |
| abstract [GetIntValue](../../aspose.svg.dom.css/cssprimitivevalue/getintvalue/)(ushort) | このメソッドは、指定された単位で int 値を取得するために使用されます。この CSS 値に int 値が含まれていない場合、または指定された単位に変換できない場合は、DOMException が発生します。 |
| override [GetPlatformType](../../aspose.svg.dom.css/cssvalue/getplatformtype/)() | このメソッドは、ECMAScript オブジェクトを取得するために使用されますType . |
| abstract [GetRectValue](../../aspose.svg.dom.css/cssprimitivevalue/getrectvalue/)() | このメソッドは、Rect 値を取得するために使用されます。この CSS 値に rect 値が含まれていない場合、DOMException が発生します。 Rect インターフェイスを使用して、対応するスタイル プロパティを変更できます。 |
| abstract [GetRGBColorValue](../../aspose.svg.dom.css/cssprimitivevalue/getrgbcolorvalue/)() | このメソッドは、RGB カラーを取得するために使用されます。この CSS 値に RGB カラー値が含まれていない場合、DOMException が発生します。 RGBColor インターフェイスを使用して、対応するスタイル プロパティを変更できます。 |
| abstract [GetStringValue](../../aspose.svg.dom.css/cssprimitivevalue/getstringvalue/)() | このメソッドは、文字列値を取得するために使用されます。 CSS 値に文字列値が含まれていない場合、DOMException が発生します。 |
| abstract [SetFloatValue](../../aspose.svg.dom.css/cssprimitivevalue/setfloatvalue/)(ushort, float) | 指定した単位で float 値を設定するメソッド。この値に関連付けられたプロパティが、指定された単位または float 値を受け入れることができない場合、値は変更されず、DOMException が発生します。 |
| abstract [SetIntValue](../../aspose.svg.dom.css/cssprimitivevalue/setintvalue/)(ushort, int) | 指定した単位で int 値を設定するメソッド。この値に関連付けられたプロパティが指定された単位または int 値を受け入れることができない場合、値は変更されず、DOMException が発生します。 |
| abstract [SetStringValue](../../aspose.svg.dom.css/cssprimitivevalue/setstringvalue/)(ushort, string) | 指定した単位で文字列値を設定するメソッド。この値に関連付けられたプロパティが指定された単位または文字列値を受け入れることができない場合、値は変更されず、DOMException が発生します。 |
| override [ToString](../../aspose.svg.dom.css/cssvalue/tostring/)() | を返しますStringこのインスタンスを表す. |

## 田畑

| 名前 | 説明 |
| --- | --- |
| const [CSS_ATTR](../../aspose.svg.dom.css/cssprimitivevalue/css_attr/) | 値は属性関数です。値は getStringValue メソッドを使用して取得できます。 |
| const [CSS_CH](../../aspose.svg.dom.css/cssprimitivevalue/css_ch/) | 値は長さ (ch) です。値は getFloatValue メソッドを使用して取得できます。 |
| const [CSS_CM](../../aspose.svg.dom.css/cssprimitivevalue/css_cm/) | 値は長さ(cm)です。値は getFloatValue メソッドを使用して取得できます。 |
| const [CSS_COUNTER](../../aspose.svg.dom.css/cssprimitivevalue/css_counter/) | 値はカウンターまたはカウンター関数です。値は、GetCounterValue メソッドを使用して取得できます。 |
| const [CSS_DEG](../../aspose.svg.dom.css/cssprimitivevalue/css_deg/) | 値は角度 (deg) です。値は getFloatValue メソッドを使用して取得できます。 |
| const [CSS_DIMENSION](../../aspose.svg.dom.css/cssprimitivevalue/css_dimension/) | 値は次元が不明な数値です。値は getFloatValue メソッドを使用して取得できます。 |
| const [CSS_DPCM](../../aspose.svg.dom.css/cssprimitivevalue/css_dpcm/) | 値はドット/センチメートル (dpcm) です。 |
| const [CSS_DPI](../../aspose.svg.dom.css/cssprimitivevalue/css_dpi/) | 値は 1 インチあたりのドット数 (dpi) です。 |
| const [CSS_DPPX](../../aspose.svg.dom.css/cssprimitivevalue/css_dppx/) | 値は「px」単位 (dppx) あたりのドットです。 |
| const [CSS_EMS](../../aspose.svg.dom.css/cssprimitivevalue/css_ems/) | 値は長さ (ems) です。値は getFloatValue メソッドを使用して取得できます。 |
| const [CSS_EXS](../../aspose.svg.dom.css/cssprimitivevalue/css_exs/) | 値は長さ (exs) です。値は getFloatValue メソッドを使用して取得できます。 |
| const [CSS_GRAD](../../aspose.svg.dom.css/cssprimitivevalue/css_grad/) | 値は角度 (grad) です。値は getFloatValue メソッドを使用して取得できます。 |
| const [CSS_HZ](../../aspose.svg.dom.css/cssprimitivevalue/css_hz/) | 値は周波数 (Hz) です。値は getFloatValue メソッドを使用して取得できます。 |
| const [CSS_IDENT](../../aspose.svg.dom.css/cssprimitivevalue/css_ident/) | 値は識別子です。値は getStringValue メソッドを使用して取得できます。 |
| const [CSS_IN](../../aspose.svg.dom.css/cssprimitivevalue/css_in/) | 値は長さ (インチ) です。値は getFloatValue メソッドを使用して取得できます。 |
| const [CSS_KHZ](../../aspose.svg.dom.css/cssprimitivevalue/css_khz/) | 値は周波数 (kHz) です。値は getFloatValue メソッドを使用して取得できます。 |
| const [CSS_MM](../../aspose.svg.dom.css/cssprimitivevalue/css_mm/) | 値は長さ(mm)です。値は getFloatValue メソッドを使用して取得できます。 |
| const [CSS_MS](../../aspose.svg.dom.css/cssprimitivevalue/css_ms/) | 値は時間 (ms) です。値は getFloatValue メソッドを使用して取得できます。 |
| const [CSS_NUMBER](../../aspose.svg.dom.css/cssprimitivevalue/css_number/) | 値は単純な数値です。値は getFloatValue メソッドを使用して取得できます。 |
| const [CSS_PC](../../aspose.svg.dom.css/cssprimitivevalue/css_pc/) | 値は長さ (pc) です。値は getFloatValue メソッドを使用して取得できます。 |
| const [CSS_PERCENTAGE](../../aspose.svg.dom.css/cssprimitivevalue/css_percentage/) | 値はパーセンテージです。値は getFloatValue メソッドを使用して取得できます。 |
| const [CSS_PT](../../aspose.svg.dom.css/cssprimitivevalue/css_pt/) | 値は長さ (pt) です。値は getFloatValue メソッドを使用して取得できます。 |
| const [CSS_PX](../../aspose.svg.dom.css/cssprimitivevalue/css_px/) | 値は長さ (px) です。値は getFloatValue メソッドを使用して取得できます。 |
| const [CSS_RAD](../../aspose.svg.dom.css/cssprimitivevalue/css_rad/) | 値は角度 (rad) です。値は getFloatValue メソッドを使用して取得できます。 |
| const [CSS_RECT](../../aspose.svg.dom.css/cssprimitivevalue/css_rect/) | 値は rect 関数です。値は、GetRectValue メソッドを使用して取得できます。 |
| const [CSS_REM](../../aspose.svg.dom.css/cssprimitivevalue/css_rem/) | 値は長さ (rem) です。値は getFloatValue メソッドを使用して取得できます。 |
| const [CSS_RGBCOLOR](../../aspose.svg.dom.css/cssprimitivevalue/css_rgbcolor/) | 値は RGB カラーです。値は、GetRGBColorValue メソッドを使用して取得できます。 |
| const [CSS_S](../../aspose.svg.dom.css/cssprimitivevalue/css_s/) | 値は時間 (秒) です。値は getFloatValue メソッドを使用して取得できます。 |
| const [CSS_STRING](../../aspose.svg.dom.css/cssprimitivevalue/css_string/) | 値は STRING です。値は getStringValue メソッドを使用して取得できます。 |
| const [CSS_UNKNOWN](../../aspose.svg.dom.css/cssprimitivevalue/css_unknown/) | 値は認識された CSS2 値ではありません。この値は、cssText 属性を使用してのみ取得できます。 |
| const [CSS_URI](../../aspose.svg.dom.css/cssprimitivevalue/css_uri/) | 値は URI です。値は getStringValue メソッドを使用して取得できます。 |
| const [CSS_VH](../../aspose.svg.dom.css/cssprimitivevalue/css_vh/) | 値は、ビューポート全体の高さのパーセンテージです. |
| const [CSS_VMAX](../../aspose.svg.dom.css/cssprimitivevalue/css_vmax/) | 値は、ビューポートの幅または高さのどちらか大きい方のパーセンテージです。 |
| const [CSS_VMIN](../../aspose.svg.dom.css/cssprimitivevalue/css_vmin/) | 値は、ビューポートの幅または高さのいずれか小さい方の割合です。 |
| const [CSS_VW](../../aspose.svg.dom.css/cssprimitivevalue/css_vw/) | 値は、ビューポートの全幅に対するパーセンテージです。 |

### 関連項目

* class [CSSValue](../cssvalue/)
* 名前空間 [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* 組み立て [Aspose.SVG](../../)


