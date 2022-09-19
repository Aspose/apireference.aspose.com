---
title: CSSPrimitiveValue
second_title: Aspose.SVG for .NET API 参考
description: CSSPrimitiveValue 接口表示单个 CSS 值此接口可用于确定当前在块中设置的特定样式属性的值或在块中显式设置特定样式属性这个接口的一个实例可以从 CSSStyleDeclaration 接口的 getPropertyCSSValue 方法中获得 CSSPrimitiveValue 对象仅出现在 CSS 属性的上下文中
type: docs
weight: 480
url: /zh/net/aspose.svg.dom.css/cssprimitivevalue/
---
## CSSPrimitiveValue class

CSSPrimitiveValue 接口表示单个 CSS 值。此接口可用于确定当前在块中设置的特定样式属性的值或在块中显式设置特定样式属性。这个接口的一个实例可以从 CSSStyleDeclaration 接口的 getPropertyCSSValue 方法中获得。 CSSPrimitiveValue 对象仅出现在 CSS 属性的上下文中。

```csharp
public abstract class CSSPrimitiveValue : CSSValue
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| abstract [CSSText](../../aspose.svg.dom.css/cssvalue/csstext) { get; set; } | 当前值的字符串表示形式。 |
| [CSSValueType](../../aspose.svg.dom.css/cssvalue/cssvaluetype) { get; } | 定义值类型的代码。 |
| [PrimitiveType](../../aspose.svg.dom.css/cssprimitivevalue/primitivetype) { get; } | 由上面指定的常量定义的值的类型。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| override [Equals](../../aspose.svg.dom.css/cssvalue/equals)(object) | 判断是否指定Object等于这个实例。 |
| abstract [GetCounterValue](../../aspose.svg.dom.css/cssprimitivevalue/getcountervalue)() | 该方法用于获取Counter值。如果此 CSS 值不包含计数器值，则会引发 DOMException。可以使用Counter接口来修改对应的style属性。 |
| abstract [GetFloatValue](../../aspose.svg.dom.css/cssprimitivevalue/getfloatvalue)(ushort) | 该方法用于获取指定单位的浮点值。如果此 CSS 值不包含浮点值或无法转换为指定单位，则会引发 DOMException。 |
| override [GetHashCode](../../aspose.svg.dom.css/cssvalue/gethashcode)() | 返回此实例的哈希码。 |
| abstract [GetIntValue](../../aspose.svg.dom.css/cssprimitivevalue/getintvalue)(ushort) | 此方法用于获取指定单位的 int 值。如果此 CSS 值不包含 int 值或无法转换为指定单位，则会引发 DOMException。 |
| override [GetPlatformType](../../aspose.svg.dom.css/cssvalue/getplatformtype)() | 此方法用于检索 ECMAScript 对象Type . |
| abstract [GetRectValue](../../aspose.svg.dom.css/cssprimitivevalue/getrectvalue)() | 此方法用于获取 Rect 值。如果此 CSS 值不包含 rect 值，则会引发 DOMException。可以使用Rect接口来修改对应的style属性。 |
| abstract [GetRGBColorValue](../../aspose.svg.dom.css/cssprimitivevalue/getrgbcolorvalue)() | 此方法用于获取 RGB 颜色。如果此 CSS 值不包含 RGB 颜色值，则会引发 DOMException。可以使用RGBColor接口来修改对应的style属性。 |
| abstract [GetStringValue](../../aspose.svg.dom.css/cssprimitivevalue/getstringvalue)() | 该方法用于获取字符串值。如果 CSS 值不包含字符串值，则会引发 DOMException。 |
| abstract [SetFloatValue](../../aspose.svg.dom.css/cssprimitivevalue/setfloatvalue)(ushort, float) | 一种以指定单位设置浮点值的方法。如果附加此值的属性不能接受指定的单位或浮点值，则该值将保持不变并引发 DOMException。 |
| abstract [SetIntValue](../../aspose.svg.dom.css/cssprimitivevalue/setintvalue)(ushort, int) | 一种以指定单位设置 int 值的方法。如果附加此值的属性不能接受指定的单位或 int 值，则该值将保持不变并引发 DOMException。 |
| abstract [SetStringValue](../../aspose.svg.dom.css/cssprimitivevalue/setstringvalue)(ushort, string) | 以指定单位设置字符串值的方法。如果附加到该值的属性不能接受指定的单位或字符串值，则该值将保持不变并引发 DOMException。 |
| override [ToString](../../aspose.svg.dom.css/cssvalue/tostring)() | 返回一个String代表这个实例。 |

## 字段

| 姓名 | 描述 |
| --- | --- |
| const [CSS_ATTR](../../aspose.svg.dom.css/cssprimitivevalue/css_attr) | 该值是一个属性函数。可以使用getStringValue方法获取值。 |
| const [CSS_CH](../../aspose.svg.dom.css/cssprimitivevalue/css_ch) | 该值为长度（ch）。该值可以通过getFloatValue方法获取。 |
| const [CSS_CM](../../aspose.svg.dom.css/cssprimitivevalue/css_cm) | 该值为长度（厘米）。该值可以通过getFloatValue方法获取。 |
| const [CSS_COUNTER](../../aspose.svg.dom.css/cssprimitivevalue/css_counter) | 该值是一个或多个计数器函数。可以使用GetCounterValue方法获取该值。 |
| const [CSS_DEG](../../aspose.svg.dom.css/cssprimitivevalue/css_deg) | 该值为角度（度）。该值可以通过getFloatValue方法获取。 |
| const [CSS_DIMENSION](../../aspose.svg.dom.css/cssprimitivevalue/css_dimension) | 该值是一个未知维度的数字。该值可以通过getFloatValue方法获取。 |
| const [CSS_DPCM](../../aspose.svg.dom.css/cssprimitivevalue/css_dpcm) | 该值是每厘米点数 (dpcm)。 |
| const [CSS_DPI](../../aspose.svg.dom.css/cssprimitivevalue/css_dpi) | 该值是每英寸点数 (dpi)。 |
| const [CSS_DPPX](../../aspose.svg.dom.css/cssprimitivevalue/css_dppx) | 该值是每 'px' 单位的点数 (dppx)。 |
| const [CSS_EMS](../../aspose.svg.dom.css/cssprimitivevalue/css_ems) | 该值为长度（ems）。该值可以通过getFloatValue方法获取。 |
| const [CSS_EXS](../../aspose.svg.dom.css/cssprimitivevalue/css_exs) | 该值为长度（exs）。该值可以通过getFloatValue方法获取。 |
| const [CSS_GRAD](../../aspose.svg.dom.css/cssprimitivevalue/css_grad) | 该值是一个角度（梯度）。该值可以通过getFloatValue方法获取。 |
| const [CSS_HZ](../../aspose.svg.dom.css/cssprimitivevalue/css_hz) | 该值为频率 (Hz)。该值可以通过getFloatValue方法获取。 |
| const [CSS_IDENT](../../aspose.svg.dom.css/cssprimitivevalue/css_ident) | 该值是一个标识符。可以使用getStringValue方法获取值。 |
| const [CSS_IN](../../aspose.svg.dom.css/cssprimitivevalue/css_in) | 该值为长度（英寸）。该值可以通过getFloatValue方法获取。 |
| const [CSS_KHZ](../../aspose.svg.dom.css/cssprimitivevalue/css_khz) | 该值为频率 (kHz)。该值可以通过getFloatValue方法获取。 |
| const [CSS_MM](../../aspose.svg.dom.css/cssprimitivevalue/css_mm) | 该值为长度 (mm)。该值可以通过getFloatValue方法获取。 |
| const [CSS_MS](../../aspose.svg.dom.css/cssprimitivevalue/css_ms) | 该值为时间（毫秒）。该值可以通过getFloatValue方法获取。 |
| const [CSS_NUMBER](../../aspose.svg.dom.css/cssprimitivevalue/css_number) | 该值是一个简单的数字。该值可以通过getFloatValue方法获取。 |
| const [CSS_PC](../../aspose.svg.dom.css/cssprimitivevalue/css_pc) | 该值为长度（pc）。该值可以通过getFloatValue方法获取。 |
| const [CSS_PERCENTAGE](../../aspose.svg.dom.css/cssprimitivevalue/css_percentage) | 该值是一个百分比。该值可以通过getFloatValue方法获取。 |
| const [CSS_PT](../../aspose.svg.dom.css/cssprimitivevalue/css_pt) | 该值为长度 (pt)。该值可以通过getFloatValue方法获取。 |
| const [CSS_PX](../../aspose.svg.dom.css/cssprimitivevalue/css_px) | 该值为长度 (px)。该值可以通过getFloatValue方法获取。 |
| const [CSS_RAD](../../aspose.svg.dom.css/cssprimitivevalue/css_rad) | 该值是一个角度 (rad)。该值可以通过getFloatValue方法获取。 |
| const [CSS_RECT](../../aspose.svg.dom.css/cssprimitivevalue/css_rect) | 该值是一个矩形函数。可以使用GetRectValue方法获取该值。 |
| const [CSS_REM](../../aspose.svg.dom.css/cssprimitivevalue/css_rem) | 该值为长度（rem）。该值可以通过getFloatValue方法获取。 |
| const [CSS_RGBCOLOR](../../aspose.svg.dom.css/cssprimitivevalue/css_rgbcolor) | 该值为 RGB 颜色。该值可以通过GetRGBColorValue方法获取。 |
| const [CSS_S](../../aspose.svg.dom.css/cssprimitivevalue/css_s) | 该值为时间（s）。该值可以通过getFloatValue方法获取。 |
| const [CSS_STRING](../../aspose.svg.dom.css/cssprimitivevalue/css_string) | 该值是一个字符串。可以使用getStringValue方法获取值。 |
| const [CSS_UNKNOWN](../../aspose.svg.dom.css/cssprimitivevalue/css_unknown) | 该值不是可识别的 CSS2 值。该值只能通过cssText属性获取。 |
| const [CSS_URI](../../aspose.svg.dom.css/cssprimitivevalue/css_uri) | 该值是一个 URI。可以使用getStringValue方法获取值。 |
| const [CSS_VH](../../aspose.svg.dom.css/cssprimitivevalue/css_vh) | 该值是整个视口高度的百分比。 |
| const [CSS_VMAX](../../aspose.svg.dom.css/cssprimitivevalue/css_vmax) | 该值是视口宽度或高度的百分比，以较大者为准。 |
| const [CSS_VMIN](../../aspose.svg.dom.css/cssprimitivevalue/css_vmin) | 该值是视口宽度或高度的百分比，以较小者为准。 |
| const [CSS_VW](../../aspose.svg.dom.css/cssprimitivevalue/css_vw) | 该值是整个视口宽度的百分比。 |

### 也可以看看

* class [CSSValue](../cssvalue)
* 命名空间 [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css)
* 部件 [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
