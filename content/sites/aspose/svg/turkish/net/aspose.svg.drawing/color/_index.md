---
title: Color
second_title: Aspose.SVG for .NET API Referansı
description: Color sınıfı renkleri KırmızıYeşilMavi RGB değerleri TonDoygunlukParlaklık HSL değerleri TonDoygunlukDeğeri HSV değerleri TonBeyazlıkSiyahlık HWB olarak belirlemenizi sağlar  değerler aydınlıkAB LAB değerleri ParlaklıkKromaTon LCH değerleri CamgöbeğiMacentaYellowKey CMYK değerleri Doğal renkler NCOL değerleri veya bir renk adıyla . Şeffaflığı belirtmek için bir Alfa kanalı da mevcuttur.
type: docs
weight: 1390
url: /tr/net/aspose.svg.drawing/color/
---
## Color class

Color sınıfı, renkleri Kırmızı-Yeşil-Mavi (RGB) değerleri, Ton-Doygunluk-Parlaklık (HSL) değerleri, Ton-Doygunluk-Değeri (HSV) değerleri, Ton-Beyazlık-Siyahlık (HWB) olarak belirlemenizi sağlar ) değerler, aydınlık-AB (LAB) değerleri, Parlaklık-Kroma-Ton (LCH) değerleri, Camgöbeği-Macenta-Yellow-Key (CMYK) değerleri, Doğal renkler (NCOL) değerleri, veya bir renk adıyla . Şeffaflığı belirtmek için bir Alfa kanalı da mevcuttur.

```csharp
public class Color
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Color](color#constructor)() | Yeni bir örneğini başlatır[`Color`](../color) class. Varsayılan renk siyahtır. |
| [Color](color#constructor_1)(byte, byte, byte) | Yeni bir örneğini başlatır[`Color`](../color)class. Tüm renk bileşenleri 0-255. aralığında olmalıdır |
| [Color](color#constructor_5)(float, float, float) | Yeni bir örneğini başlatır[`Color`](../color) class. Tüm renk bileşenleri 0-1. aralığında olmalıdır |
| [Color](color#constructor_3)(int, int, int) | Yeni bir örneğini başlatır[`Color`](../color)class. Tüm renk bileşenleri 0-255. aralığında olmalıdır |
| [Color](color#constructor_2)(byte, byte, byte, byte) | Yeni bir örneğini başlatır[`Color`](../color)class. Tüm renk bileşenleri 0-255. aralığında olmalıdır |
| [Color](color#constructor_6)(float, float, float, float) | Yeni bir örneğini başlatır[`Color`](../color) class. Tüm renk bileşenleri 0-1. aralığında olmalıdır |
| [Color](color#constructor_4)(int, int, int, int) | Yeni bir örneğini başlatır[`Color`](../color)class. Tüm renk bileşenleri 0-255. aralığında olmalıdır |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Alpha](../../aspose.svg.drawing/color/alpha) { get; } | Rengin alfa bileşenini temsil eder. |
| [Blue](../../aspose.svg.drawing/color/blue) { get; } | Rengin mavi bileşenini temsil eder. |
| [Green](../../aspose.svg.drawing/color/green) { get; } | Rengin yeşil bileşenini temsil eder. |
| [Red](../../aspose.svg.drawing/color/red) { get; } | color öğesinin kırmızı bileşenini temsil eder |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [FromCmyk](../../aspose.svg.drawing/color/fromcmyk)(float, float, float, float) | İstenen camgöbeği, macenta, sarı, anahtar (siyah) değerleriyle yeni bir Renk döndürür. |
| static [FromCmyka](../../aspose.svg.drawing/color/fromcmyka)(float, float, float, float, float) | İstenen camgöbeği, macenta, sarı, anahtar (siyah), alfa değerleriyle yeni bir Renk döndürür. |
| static [FromGray](../../aspose.svg.drawing/color/fromgray)(float) | İstenen gri değeriyle yeni bir Renk döndürür. |
| static [FromHsl](../../aspose.svg.drawing/color/fromhsl)(float, float, float) | İstenen ton, doygunluk, doygunluk değerleriyle yeni bir Renk döndürür. |
| static [FromHsla](../../aspose.svg.drawing/color/fromhsla)(float, float, float, float) | İstenen renk tonu, doygunluk, doygunluk, alfa değerleriyle yeni bir Renk döndürür. |
| static [FromHsv](../../aspose.svg.drawing/color/fromhsv)(float, float, float) | İstenen renk tonu, doygunluk, değer ile yeni bir Renk döndürür. |
| static [FromHsva](../../aspose.svg.drawing/color/fromhsva)(float, float, float, float) | İstenen renk tonu, doygunluk, değer, alfa ile yeni bir Renk döndürür. |
| static [FromHwb](../../aspose.svg.drawing/color/fromhwb)(float, float, float) | İstenen renk tonu, beyazlık, siyahlık değerleriyle yeni bir Renk döndürür. |
| static [FromHwba](../../aspose.svg.drawing/color/fromhwba)(float, float, float, float) | İstenen renk tonu, beyazlık, siyahlık değerleriyle yeni bir Renk döndürür. |
| static [FromInt](../../aspose.svg.drawing/color/fromint)(int) | İstenen ARGB değeriyle yeni bir Renk döndürür. |
| static [FromLab](../../aspose.svg.drawing/color/fromlab)(float, float, float) | İstenen hafiflik, A, B değerleriyle yeni bir Renk döndürür. |
| static [FromLaba](../../aspose.svg.drawing/color/fromlaba)(float, float, float, float) | İstenen hafiflik, A, B, alfa değerleriyle yeni bir Renk döndürür. |
| static [FromLch](../../aspose.svg.drawing/color/fromlch)(float, float, float) | İstenen parlaklık, renk, ton değerleriyle yeni bir Renk döndürür. |
| static [FromLcha](../../aspose.svg.drawing/color/fromlcha)(float, float, float, float) | İstenen parlaklık, renk, ton, alfa değerleriyle yeni bir Renk döndürür. |
| static [FromOklab](../../aspose.svg.drawing/color/fromoklab)(float, float, float) | OKLAB modeli için istenen açıklık, A, B değerleriyle yeni bir Renk döndürür. |
| static [FromOklaba](../../aspose.svg.drawing/color/fromoklaba)(float, float, float, float) | OKLAB modeli için istenen açıklık, A, B, alfa değerleriyle yeni bir Renk döndürür. |
| static [FromOklch](../../aspose.svg.drawing/color/fromoklch)(float, float, float) | OKLAB modeli için istenen parlaklık, kroma, ton değerleriyle yeni bir Renk döndürür. |
| static [FromOklcha](../../aspose.svg.drawing/color/fromoklcha)(float, float, float, float) | OKLAB modeli için istenen parlaklık, renk, ton, alfa değerleriyle yeni bir Renk döndürür. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb#fromrgb)(byte, byte, byte) | İstenen ged, green, blue değerleriyle yeni bir Renk döndürür. Tüm renk bileşenleri 0-255 aralığında olmalıdır. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb#fromrgb_2)(float, float, float) | İstenen ged, green, blue değerlerine sahip yeni bir Renk döndürür. Tüm renk bileşenleri 0-1 aralığında olmalıdır. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb#fromrgb_1)(int, int, int) | İstenen ged, green, blue değerleriyle yeni bir Renk döndürür. Tüm renk bileşenleri 0-255 aralığında olmalıdır. |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba#fromrgba)(byte, byte, byte, byte) | İstenen ged, green, blue, alpha değerleriyle yeni bir Renk döndürür. Tüm renk bileşenleri 0-255. aralığında olmalıdır |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba#fromrgba_2)(float, float, float, float) | İstenen ged, green, blue, alpha değerleriyle yeni bir Renk döndürür. Tüm renk bileşenleri 0-1. aralığında olmalıdır |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba#fromrgba_1)(int, int, int, int) | İstenen ged, green, blue, alpha değerleriyle yeni bir Renk döndürür. Tüm renk bileşenleri 0-255. aralığında olmalıdır |
| static [FromString](../../aspose.svg.drawing/color/fromstring)(string) | CSS rengini içeren dizeyi ayrıştırır ve yeni bir Color döndürür. |
| static [FromUint](../../aspose.svg.drawing/color/fromuint)(uint) | İstenen ARGB değeriyle yeni bir Renk döndürür. |
| [AddLuminosity](../../aspose.svg.drawing/color/addluminosity)(float) | Parlaklığının ve delta değerinin toplamı ile Rengin kopyasını oluşturur. |
| [Convert](../../aspose.svg.drawing/color/convert)(ColorModel) | Belirtilen renk modeli biçiminde bir renk bileşeni döndürür. |
| override [Equals](../../aspose.svg.drawing/color/equals)(object) | Belirtilen[`Color`](../color) bu örneğe eşittir. |
| [GetComplementary](../../aspose.svg.drawing/color/getcomplementary)() | Orijinal rengin renk tekerleğinin karşı tarafında bulunan yeni bir renk döndürür. |
| override [GetHashCode](../../aspose.svg.drawing/color/gethashcode)() | Bir karma kod döndürür. |
| [GetHue](../../aspose.svg.drawing/color/gethue)() | Rengin Bir Tonunu Döndürür. |
| [GetLuminosity](../../aspose.svg.drawing/color/getluminosity)() | Rengin parlaklığını verir. |
| [GetSaturation](../../aspose.svg.drawing/color/getsaturation)() | Rengin doygunluğunu döndürür. |
| [ToInt](../../aspose.svg.drawing/color/toint)() | Color ARGB bileşenlerini int. olarak kodlar |
| [ToName](../../aspose.svg.drawing/color/toname)() | CSS adlı renkler listesindeki bir renkle veya boş bir dizeyle eşleşiyorsa rengin adını döndürür. |
| [ToNaturalColorString](../../aspose.svg.drawing/color/tonaturalcolorstring)(int) | Renge olan uzaklığı (yüzde olarak) belirtmek için bir sayı içeren bir renk harfi kullanarak Doğal renkler (NCol) belirtilen rengi döndürür. |
| [ToRgbaHexString](../../aspose.svg.drawing/color/torgbahexstring)() | Şununla belirtilen Onaltılık bir renk döndürür: #RRGBBBAA. |
| [ToRgbaString](../../aspose.svg.drawing/color/torgbastring)() | Tarafından belirtilen RGBA rengini içeren bir dize döndürür: rgba(R, G, B, A). |
| [ToRgbHexString](../../aspose.svg.drawing/color/torgbhexstring)() | Şununla belirtilen onaltılık bir renk döndürür: #RRGGBB. |
| [ToRgbString](../../aspose.svg.drawing/color/torgbstring)() | Tarafından belirtilen RGB rengini içeren bir dize döndürür: rgb(R, G, B). |
| override [ToString](../../aspose.svg.drawing/color/tostring)() | RGBA bileşen değerlerinden oluşan bir dize döndürür. |
| [ToUint](../../aspose.svg.drawing/color/touint)() | Color ARGB bileşenlerini unsigned int. olarak kodlar. |
| [WithAlpha](../../aspose.svg.drawing/color/withalpha)(float) | Belirtilen alfa bileşeniyle Rengin kopyasını oluşturur. |
| [WithHue](../../aspose.svg.drawing/color/withhue)(float) | Belirtilen Hue ile Rengin kopyasını oluşturur. |
| [WithLuminosity](../../aspose.svg.drawing/color/withluminosity)(float) | Belirtilen parlaklık ile Rengin kopyasını oluşturur. |
| [WithSaturation](../../aspose.svg.drawing/color/withsaturation)(float) | Belirtilen doygunluğa sahip Rengin kopyasını oluşturur. |

### Ayrıca bakınız

* ad alanı [Aspose.Svg.Drawing](../../aspose.svg.drawing)
* toplantı [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
