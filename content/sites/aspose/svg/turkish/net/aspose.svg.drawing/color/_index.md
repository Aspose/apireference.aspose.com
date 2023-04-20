---
title: Class Color
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.Drawing.Color sınıf. Color sınıfı renkleri KırmızıYeşilMavi RGB değerleri TonDoygunlukParlaklık HSL değerleri TonDoygunlukDeğeri HSV değerleri TonBeyazlıkSiyahlık HWB olarak belirlemenizi sağlar  değerleri açıklıkAB LAB değerleri LuminanceChromaHue LCH değerleri CyanMagentaYellowKey CMYK değerleri Doğal renkler NCOL değerleri veya bir renk adıyla . Şeffaflığı belirtmek için bir Alfa kanalı da mevcuttur.
type: docs
weight: 1390
url: /tr/net/aspose.svg.drawing/color/
---
## Color class

Color sınıfı, renkleri Kırmızı-Yeşil-Mavi (RGB) değerleri, Ton-Doygunluk-Parlaklık (HSL) değerleri, Ton-Doygunluk-Değeri (HSV) değerleri, Ton-Beyazlık-Siyahlık (HWB) olarak belirlemenizi sağlar ) değerleri, açıklık-AB (LAB) değerleri, Luminance-Chroma-Hue (LCH) değerleri, Cyan-Magenta-Yellow-Key (CMYK) değerleri, Doğal renkler (NCOL) değerleri, veya bir renk adıyla . Şeffaflığı belirtmek için bir Alfa kanalı da mevcuttur.

```csharp
public class Color
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Color](color/#constructor)() | Yeni bir örneğini başlatır.`Color` class. Varsayılan renk siyahtır. |
| [Color](color/#constructor_1)(byte, byte, byte) | Yeni bir örneğini başlatır.`Color`class. Tüm renk bileşenleri 0-255. aralığında olmalıdır. |
| [Color](color/#constructor_5)(float, float, float) | Yeni bir örneğini başlatır.`Color` class. Tüm renk bileşenleri 0-1. aralığında olmalıdır. |
| [Color](color/#constructor_3)(int, int, int) | Yeni bir örneğini başlatır.`Color`class. Tüm renk bileşenleri 0-255. aralığında olmalıdır. |
| [Color](color/#constructor_2)(byte, byte, byte, byte) | Yeni bir örneğini başlatır.`Color`class. Tüm renk bileşenleri 0-255. aralığında olmalıdır. |
| [Color](color/#constructor_6)(float, float, float, float) | Yeni bir örneğini başlatır.`Color` class. Tüm renk bileşenleri 0-1. aralığında olmalıdır. |
| [Color](color/#constructor_4)(int, int, int, int) | Yeni bir örneğini başlatır.`Color`class. Tüm renk bileşenleri 0-255. aralığında olmalıdır. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Alpha](../../aspose.svg.drawing/color/alpha/) { get; } | Rengin alfa bileşenini temsil eder. |
| [Blue](../../aspose.svg.drawing/color/blue/) { get; } | Rengin mavi bileşenini temsil eder. |
| [Green](../../aspose.svg.drawing/color/green/) { get; } | Rengin yeşil bileşenini temsil eder. |
| [Red](../../aspose.svg.drawing/color/red/) { get; } | color öğesinin kırmızı bileşenini temsil eder |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [FromCmyk](../../aspose.svg.drawing/color/fromcmyk/)(float, float, float, float) | İstenen cam göbeği, macenta, sarı, anahtar (siyah) değerleriyle yeni bir Renk döndürür. |
| static [FromCmyka](../../aspose.svg.drawing/color/fromcmyka/)(float, float, float, float, float) | İstenen cam göbeği, macenta, sarı, anahtar (siyah), alfa değerleri ile yeni bir Renk döndürür. |
| static [FromGray](../../aspose.svg.drawing/color/fromgray/)(float) | İstenen gri değeriyle yeni bir Renk döndürür. |
| static [FromHsl](../../aspose.svg.drawing/color/fromhsl/)(float, float, float) | İstenen ton, doygunluk, doygunluk değerleri ile yeni bir Renk döndürür. |
| static [FromHsla](../../aspose.svg.drawing/color/fromhsla/)(float, float, float, float) | İstenen ton, doygunluk, doygunluk, alfa değerleri ile yeni bir Renk döndürür. |
| static [FromHsv](../../aspose.svg.drawing/color/fromhsv/)(float, float, float) | İstenen ton, doygunluk ve değere sahip yeni bir Renk döndürür. |
| static [FromHsva](../../aspose.svg.drawing/color/fromhsva/)(float, float, float, float) | İstenen ton, doygunluk, değer, alfa ile yeni bir Renk döndürür. |
| static [FromHwb](../../aspose.svg.drawing/color/fromhwb/)(float, float, float) | İstenen ton, beyazlık, siyahlık değerleri ile yeni bir Renk döndürür. |
| static [FromHwba](../../aspose.svg.drawing/color/fromhwba/)(float, float, float, float) | İstenen ton, beyazlık, siyahlık değerleri ile yeni bir Renk döndürür. |
| static [FromInt](../../aspose.svg.drawing/color/fromint/)(int) | İstenen ARGB değerine sahip yeni bir Renk döndürür. |
| static [FromLab](../../aspose.svg.drawing/color/fromlab/)(float, float, float) | İstenen açıklık, A, B değerleri ile yeni bir Renk döndürür. |
| static [FromLaba](../../aspose.svg.drawing/color/fromlaba/)(float, float, float, float) | İstenen açıklık, A, B, alfa değerleri ile yeni bir Renk döndürür. |
| static [FromLch](../../aspose.svg.drawing/color/fromlch/)(float, float, float) | İstenen parlaklık, kroma, ton değerleri ile yeni bir Renk döndürür. |
| static [FromLcha](../../aspose.svg.drawing/color/fromlcha/)(float, float, float, float) | İstenen parlaklık, kroma, ton, alfa değerleri ile yeni bir Renk döndürür. |
| static [FromOklab](../../aspose.svg.drawing/color/fromoklab/)(float, float, float) | OKLAB modeli için istenen açıklık, A, B değerleri ile yeni bir Renk döndürür. |
| static [FromOklaba](../../aspose.svg.drawing/color/fromoklaba/)(float, float, float, float) | OKLAB modeli için istenen açıklık, A, B, alfa değerleri ile yeni bir Renk döndürür. |
| static [FromOklch](../../aspose.svg.drawing/color/fromoklch/)(float, float, float) | OKLAB modeli için istenen parlaklık, kroma, ton değerleri ile yeni bir Renk döndürür. |
| static [FromOklcha](../../aspose.svg.drawing/color/fromoklcha/)(float, float, float, float) | OKLAB modeli için istenen parlaklık, kroma, ton, alfa değerleri ile yeni bir Renk döndürür. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb/#fromrgb)(byte, byte, byte) | İstenen ged, green, blue değerleri ile yeni bir Renk döndürür. Tüm renk bileşenleri 0-255. aralığında olmalıdır. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb/#fromrgb_2)(float, float, float) | İstenen ged, green, blue değerleri ile yeni bir Renk döndürür. Tüm renk bileşenleri 0-1. aralığında olmalıdır. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb/#fromrgb_1)(int, int, int) | İstenen ged, green, blue değerleri ile yeni bir Renk döndürür. Tüm renk bileşenleri 0-255. aralığında olmalıdır. |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba/#fromrgba)(byte, byte, byte, byte) | İstenen ged, green, blue, alpha değerleri ile yeni bir Renk döndürür. Tüm renk bileşenleri 0-255. aralığında olmalıdır. |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba/#fromrgba_2)(float, float, float, float) | İstenen ged, green, blue, alpha değerleri ile yeni bir Renk döndürür. Tüm renk bileşenleri 0-1. aralığında olmalıdır |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba/#fromrgba_1)(int, int, int, int) | İstenen ged, green, blue, alpha değerleri ile yeni bir Renk döndürür. Tüm renk bileşenleri 0-255. aralığında olmalıdır. |
| static [FromString](../../aspose.svg.drawing/color/fromstring/)(string) | CSS rengini içeren dizeyi ayrıştırır ve yeni bir Renk döndürür. |
| static [FromUint](../../aspose.svg.drawing/color/fromuint/)(uint) | İstenen ARGB değerine sahip yeni bir Renk döndürür. |
| [AddLuminosity](../../aspose.svg.drawing/color/addluminosity/)(float) | Parlaklığının ve delta değerinin toplamı ile Rengin kopyasını oluşturur. |
| [Convert](../../aspose.svg.drawing/color/convert/)(ColorModel) | Belirtilen renk modelinin biçiminde bir renk bileşeni döndürür. |
| override [Equals](../../aspose.svg.drawing/color/equals/)(object) | Belirtilenin olup olmadığını belirler.`Color` bu örneğe eşittir. |
| [GetComplementary](../../aspose.svg.drawing/color/getcomplementary/)() | Orijinal rengin renk tekerleğinin karşı tarafında olan yeni bir renk verir. |
| override [GetHashCode](../../aspose.svg.drawing/color/gethashcode/)() | Bir karma kodu döndürür. |
| [GetHue](../../aspose.svg.drawing/color/gethue/)() | Bir Renk Tonu döndürür. |
| [GetLuminosity](../../aspose.svg.drawing/color/getluminosity/)() | Rengin parlaklığını döndürür. |
| [GetSaturation](../../aspose.svg.drawing/color/getsaturation/)() | Rengin doygunluğunu döndürür. |
| [ToInt](../../aspose.svg.drawing/color/toint/)() | Renkli ARGB bileşenlerini int. olarak kodlar |
| [ToName](../../aspose.svg.drawing/color/toname/)() | CSS adlı renkler listesindeki bir renkle veya boş bir dizeyle eşleşirse, rengin adını döndürür. |
| [ToNaturalColorString](../../aspose.svg.drawing/color/tonaturalcolorstring/)(int) | Renkten mesafeyi (yüzde olarak) belirtmek için bir sayıyla birlikte bir renk harfi kullanarak belirtilen bir Doğal renkler (NCol) rengi döndürür. |
| [ToRgbaHexString](../../aspose.svg.drawing/color/torgbahexstring/)() | Şununla belirtilen Onaltılık rengi döndürür: #RRGGBBAA. |
| [ToRgbaString](../../aspose.svg.drawing/color/torgbastring/)() | Belirtilen RGBA rengini içeren bir dize döndürür: rgba(R, G, B, A). |
| [ToRgbHexString](../../aspose.svg.drawing/color/torgbhexstring/)() | Belirtilen onaltılık rengi döndürür: #RRGGBB. |
| [ToRgbString](../../aspose.svg.drawing/color/torgbstring/)() | Belirtilen RGB rengini içeren bir dize döndürür: rgb(R, G, B). |
| override [ToString](../../aspose.svg.drawing/color/tostring/)() | RGBA bileşen değerlerinden oluşan bir dize döndürür. |
| [ToUint](../../aspose.svg.drawing/color/touint/)() | Renkli ARGB bileşenlerini imzasız int. olarak kodlar |
| [WithAlpha](../../aspose.svg.drawing/color/withalpha/)(float) | Belirtilen alfa bileşeniyle Rengin kopyasını oluşturur. |
| [WithHue](../../aspose.svg.drawing/color/withhue/)(float) | Belirtilen Ton ile Rengin bir kopyasını oluşturur. |
| [WithLuminosity](../../aspose.svg.drawing/color/withluminosity/)(float) | Belirtilen parlaklıkta Rengin kopyasını oluşturur. |
| [WithSaturation](../../aspose.svg.drawing/color/withsaturation/)(float) | Belirtilen doygunluğa sahip Rengin kopyasını oluşturur. |

### Ayrıca bakınız

* ad alanı [Aspose.Svg.Drawing](../../aspose.svg.drawing/)
* toplantı [Aspose.SVG](../../)


