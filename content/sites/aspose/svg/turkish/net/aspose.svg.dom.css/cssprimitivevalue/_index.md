---
title: Class CSSPrimitiveValue
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.Dom.Css.CSSPrimitiveValue sınıf. CSSPrimitiveValue arabirimi tek bir CSS değerini temsil eder. Bu arayüz o anda bir blokta ayarlanan belirli bir stil özelliğinin değerini belirlemek veya blok içinde açıkça belirli bir stil özelliğini ayarlamak için kullanılabilir. Bu arabirimin bir örneği CSSStyleDeclaration arabiriminin getPropertyCSSValue yönteminden elde edilebilir. Bir CSSPrimitiveValue nesnesi yalnızca bir CSS özelliği bağlamında oluşur.
type: docs
weight: 480
url: /tr/net/aspose.svg.dom.css/cssprimitivevalue/
---
## CSSPrimitiveValue class

CSSPrimitiveValue arabirimi, tek bir CSS değerini temsil eder. Bu arayüz, o anda bir blokta ayarlanan belirli bir stil özelliğinin değerini belirlemek veya blok içinde açıkça belirli bir stil özelliğini ayarlamak için kullanılabilir. Bu arabirimin bir örneği, CSSStyleDeclaration arabiriminin getPropertyCSSValue yönteminden elde edilebilir. Bir CSSPrimitiveValue nesnesi yalnızca bir CSS özelliği bağlamında oluşur.

```csharp
public abstract class CSSPrimitiveValue : CSSValue
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| abstract [CSSText](../../aspose.svg.dom.css/cssvalue/csstext/) { get; set; } | Geçerli değerin dize gösterimi. |
| [CSSValueType](../../aspose.svg.dom.css/cssvalue/cssvaluetype/) { get; } | Değerin türünü tanımlayan bir kod. |
| [PrimitiveType](../../aspose.svg.dom.css/cssprimitivevalue/primitivetype/) { get; } | Yukarıda belirtilen sabitler tarafından tanımlanan değerin türü. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| override [Equals](../../aspose.svg.dom.css/cssvalue/equals/)(object) | Belirtilenin olup olmadığını belirler.Object bu örneğe eşittir. |
| abstract [GetCounterValue](../../aspose.svg.dom.css/cssprimitivevalue/getcountervalue/)() | Bu metod Sayaç değerini almak için kullanılır. Bu CSS değeri bir sayaç değeri içermiyorsa, bir DOMException oluşturulur. Karşılık gelen stil özelliğinde değişiklik, Sayaç arabirimi kullanılarak gerçekleştirilebilir. |
| abstract [GetFloatValue](../../aspose.svg.dom.css/cssprimitivevalue/getfloatvalue/)(ushort) | Bu yöntem, belirtilen birimde bir kayan değer elde etmek için kullanılır. Bu CSS değeri bir değişken değer içermiyorsa veya belirtilen birime dönüştürülemiyorsa, bir DOMException oluşturulur. |
| override [GetHashCode](../../aspose.svg.dom.css/cssvalue/gethashcode/)() | Bu örnek için bir karma kod döndürür. |
| abstract [GetIntValue](../../aspose.svg.dom.css/cssprimitivevalue/getintvalue/)(ushort) | Bu yöntem, belirtilen birimde bir int değeri elde etmek için kullanılır. Bu CSS değeri bir int değeri içermiyorsa veya belirtilen birime dönüştürülemiyorsa, bir DOMException oluşturulur. |
| override [GetPlatformType](../../aspose.svg.dom.css/cssvalue/getplatformtype/)() | Bu yöntem ECMAScript nesnesini almak için kullanılır.Type . |
| abstract [GetRectValue](../../aspose.svg.dom.css/cssprimitivevalue/getrectvalue/)() | Bu metod Rect değerini almak için kullanılır. Bu CSS değeri bir rect değeri içermiyorsa, bir DOMException oluşturulur. Karşılık gelen stil özelliğinde değişiklik, Rect arabirimi kullanılarak gerçekleştirilebilir. |
| abstract [GetRGBColorValue](../../aspose.svg.dom.css/cssprimitivevalue/getrgbcolorvalue/)() | Bu yöntem, RGB rengini elde etmek için kullanılır. Bu CSS değeri bir RGB renk değeri içermiyorsa, bir DOMException oluşturulur. Karşılık gelen stil özelliğinde değişiklik, RGBColor arabirimi kullanılarak gerçekleştirilebilir. |
| abstract [GetStringValue](../../aspose.svg.dom.css/cssprimitivevalue/getstringvalue/)() | Bu yöntem, dize değerini almak için kullanılır. CSS değeri bir dize değeri içermiyorsa, bir DOMException oluşturulur. |
| abstract [SetFloatValue](../../aspose.svg.dom.css/cssprimitivevalue/setfloatvalue/)(ushort, float) | Float değerini belirtilen birimle ayarlamak için bir yöntem. Bu değerle eklenen özellik, belirtilen birimi veya kayan değeri kabul edemezse, değer değişmez ve bir DOMException yükseltilir. |
| abstract [SetIntValue](../../aspose.svg.dom.css/cssprimitivevalue/setintvalue/)(ushort, int) | Belirtilen birimle int değerini ayarlamak için bir yöntem. Bu değerle eklenen özellik, belirtilen birimi veya int değerini kabul edemezse, değer değişmez ve bir DOMException yükseltilir. |
| abstract [SetStringValue](../../aspose.svg.dom.css/cssprimitivevalue/setstringvalue/)(ushort, string) | Dizi değerini belirtilen birimle ayarlamak için bir yöntem. Bu değere eklenen özellik, belirtilen birimi veya dize değerini kabul edemezse, değer değişmeyecek ve bir DOMException oluşturulacaktır. |
| override [ToString](../../aspose.svg.dom.css/cssvalue/tostring/)() | a döndürürString bu örneği temsil eder. |

## Alanlar

| İsim | Tanım |
| --- | --- |
| const [CSS_ATTR](../../aspose.svg.dom.css/cssprimitivevalue/css_attr/) | Değer, bir öznitelik işlevidir. Değer, getStringValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_CH](../../aspose.svg.dom.css/cssprimitivevalue/css_ch/) | Değer bir uzunluktur (ch). Değer, getFloatValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_CM](../../aspose.svg.dom.css/cssprimitivevalue/css_cm/) | Değer bir uzunluktur (cm). Değer, getFloatValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_COUNTER](../../aspose.svg.dom.css/cssprimitivevalue/css_counter/) | Değer, bir sayaç veya sayaç işlevidir. Değer, GetCounterValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_DEG](../../aspose.svg.dom.css/cssprimitivevalue/css_deg/) | Değer bir açıdır (derece). Değer, getFloatValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_DIMENSION](../../aspose.svg.dom.css/cssprimitivevalue/css_dimension/) | Değer, boyutu bilinmeyen bir sayıdır. Değer, getFloatValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_DPCM](../../aspose.svg.dom.css/cssprimitivevalue/css_dpcm/) | Değer, santimetre başına nokta sayısıdır (dpcm). |
| const [CSS_DPI](../../aspose.svg.dom.css/cssprimitivevalue/css_dpi/) | Değer, inç başına nokta sayısıdır (dpi). |
| const [CSS_DPPX](../../aspose.svg.dom.css/cssprimitivevalue/css_dppx/) | Değer, 'px' birimi başına nokta sayısıdır (dppx). |
| const [CSS_EMS](../../aspose.svg.dom.css/cssprimitivevalue/css_ems/) | Değer bir uzunluktur (ems). Değer, getFloatValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_EXS](../../aspose.svg.dom.css/cssprimitivevalue/css_exs/) | Değer bir uzunluktur (exs). Değer, getFloatValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_GRAD](../../aspose.svg.dom.css/cssprimitivevalue/css_grad/) | Değer bir açıdır (grad). Değer, getFloatValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_HZ](../../aspose.svg.dom.css/cssprimitivevalue/css_hz/) | Değer bir frekanstır (Hz). Değer, getFloatValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_IDENT](../../aspose.svg.dom.css/cssprimitivevalue/css_ident/) | Değer bir tanımlayıcıdır. Değer, getStringValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_IN](../../aspose.svg.dom.css/cssprimitivevalue/css_in/) | Değer bir uzunluktur (inç). Değer, getFloatValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_KHZ](../../aspose.svg.dom.css/cssprimitivevalue/css_khz/) | Değer bir frekanstır (kHz). Değer, getFloatValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_MM](../../aspose.svg.dom.css/cssprimitivevalue/css_mm/) | Değer bir uzunluktur (mm). Değer, getFloatValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_MS](../../aspose.svg.dom.css/cssprimitivevalue/css_ms/) | Değer bir zamandır (ms). Değer, getFloatValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_NUMBER](../../aspose.svg.dom.css/cssprimitivevalue/css_number/) | Değer basit bir sayıdır. Değer, getFloatValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_PC](../../aspose.svg.dom.css/cssprimitivevalue/css_pc/) | Değer bir uzunluktur (pc). Değer, getFloatValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_PERCENTAGE](../../aspose.svg.dom.css/cssprimitivevalue/css_percentage/) | Değer bir yüzdedir. Değer, getFloatValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_PT](../../aspose.svg.dom.css/cssprimitivevalue/css_pt/) | Değer bir uzunluktur (pt). Değer, getFloatValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_PX](../../aspose.svg.dom.css/cssprimitivevalue/css_px/) | Değer bir uzunluktur (px). Değer, getFloatValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_RAD](../../aspose.svg.dom.css/cssprimitivevalue/css_rad/) | Değer bir açıdır (rad). Değer, getFloatValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_RECT](../../aspose.svg.dom.css/cssprimitivevalue/css_rect/) | Değer bir rect işlevidir. Değer, GetRectValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_REM](../../aspose.svg.dom.css/cssprimitivevalue/css_rem/) | Değer bir uzunluktur (uzun). Değer, getFloatValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_RGBCOLOR](../../aspose.svg.dom.css/cssprimitivevalue/css_rgbcolor/) | Değer bir RGB rengidir. Değer, GetRGBColorValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_S](../../aspose.svg.dom.css/cssprimitivevalue/css_s/) | Değer bir zamandır (s). Değer, getFloatValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_STRING](../../aspose.svg.dom.css/cssprimitivevalue/css_string/) | Değer bir STRING'dir. Değer, getStringValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_UNKNOWN](../../aspose.svg.dom.css/cssprimitivevalue/css_unknown/) | Değer tanınan bir CSS2 değeri değil. Değer yalnızca cssText özniteliği kullanılarak elde edilebilir. |
| const [CSS_URI](../../aspose.svg.dom.css/cssprimitivevalue/css_uri/) | Değer bir URI'dir. Değer, getStringValue yöntemi kullanılarak elde edilebilir. |
| const [CSS_VH](../../aspose.svg.dom.css/cssprimitivevalue/css_vh/) | Değer, tam görüntü alanı yüksekliğinin yüzdesidir. |
| const [CSS_VMAX](../../aspose.svg.dom.css/cssprimitivevalue/css_vmax/) | Değer, hangisi daha büyükse, görüntü alanı genişliğinin veya yüksekliğinin yüzdesidir. |
| const [CSS_VMIN](../../aspose.svg.dom.css/cssprimitivevalue/css_vmin/) | Değer, görüntü alanı genişliğinin veya yüksekliğinin (hangisi daha küçükse) yüzdesidir. |
| const [CSS_VW](../../aspose.svg.dom.css/cssprimitivevalue/css_vw/) | Değer, tam görünüm alanı genişliğinin yüzdesidir. |

### Ayrıca bakınız

* class [CSSValue](../cssvalue/)
* ad alanı [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* toplantı [Aspose.SVG](../../)


