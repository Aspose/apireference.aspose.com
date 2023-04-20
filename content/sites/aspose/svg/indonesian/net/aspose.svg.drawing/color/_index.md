---
title: Class Color
second_title: Aspose.SVG untuk Referensi .NET API
description: Aspose.Svg.Drawing.Color kelas. Kelas Color memungkinkan Anda menentukan warna sebagai nilai RedGreenBlue RGB nilai HueSaturationLuminosity HSL nilai HueSaturationValue HSV HueWhitenessBlackness HWB  nilai nilai lightnessAB LAB nilai LuminanceChromaHue LCH nilai CyanMagentaYellowKey CMYK Nilai warna natural NCOL atau dengan nama warna . Saluran Alfa juga tersedia untuk menunjukkan transparansi.
type: docs
weight: 1390
url: /id/net/aspose.svg.drawing/color/
---
## Color class

Kelas Color memungkinkan Anda menentukan warna sebagai nilai Red-Green-Blue (RGB), nilai Hue-Saturation-Luminosity (HSL), nilai Hue-Saturation-Value (HSV), Hue-Whiteness-Blackness (HWB ) nilai, nilai lightness-AB (LAB), nilai Luminance-Chroma-Hue (LCH), nilai Cyan-Magenta-Yellow-Key (CMYK), Nilai warna natural (NCOL), atau dengan nama warna . Saluran Alfa juga tersedia untuk menunjukkan transparansi.

```csharp
public class Color
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Color](color/#constructor)() | Menginisialisasi instance baru dari`Color` class. Secara default warna hitam. |
| [Color](color/#constructor_1)(byte, byte, byte) | Menginisialisasi instance baru dari`Color`class. Semua komponen warna harus berada dalam rentang 0-255. |
| [Color](color/#constructor_5)(float, float, float) | Menginisialisasi instance baru dari`Color` class. Semua komponen warna harus berada dalam rentang 0-1. |
| [Color](color/#constructor_3)(int, int, int) | Menginisialisasi instance baru dari`Color`class. Semua komponen warna harus berada dalam rentang 0-255. |
| [Color](color/#constructor_2)(byte, byte, byte, byte) | Menginisialisasi instance baru dari`Color`class. Semua komponen warna harus berada dalam rentang 0-255. |
| [Color](color/#constructor_6)(float, float, float, float) | Menginisialisasi instance baru dari`Color` class. Semua komponen warna harus berada dalam rentang 0-1. |
| [Color](color/#constructor_4)(int, int, int, int) | Menginisialisasi instance baru dari`Color`class. Semua komponen warna harus berada dalam rentang 0-255. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Alpha](../../aspose.svg.drawing/color/alpha/) { get; } | Merupakan komponen alfa dari warna. |
| [Blue](../../aspose.svg.drawing/color/blue/) { get; } | Mewakili komponen warna biru. |
| [Green](../../aspose.svg.drawing/color/green/) { get; } | Merupakan komponen warna hijau. |
| [Red](../../aspose.svg.drawing/color/red/) { get; } | Mewakili komponen warna merah |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [FromCmyk](../../aspose.svg.drawing/color/fromcmyk/)(float, float, float, float) | Mengembalikan Warna baru dengan nilai cyan, magenta, kuning, kunci (hitam) yang diminta. |
| static [FromCmyka](../../aspose.svg.drawing/color/fromcmyka/)(float, float, float, float, float) | Mengembalikan Warna baru dengan nilai cyan, magenta, kuning, kunci (hitam), alfa yang diminta. |
| static [FromGray](../../aspose.svg.drawing/color/fromgray/)(float) | Mengembalikan Warna baru dengan nilai abu-abu yang diminta. |
| static [FromHsl](../../aspose.svg.drawing/color/fromhsl/)(float, float, float) | Mengembalikan Warna baru dengan nilai rona, saturasi, saturasi yang diminta. |
| static [FromHsla](../../aspose.svg.drawing/color/fromhsla/)(float, float, float, float) | Mengembalikan Warna baru dengan nilai rona, saturasi, saturasi, alfa yang diminta. |
| static [FromHsv](../../aspose.svg.drawing/color/fromhsv/)(float, float, float) | Mengembalikan Warna baru dengan rona, saturasi, nilai yang diminta. |
| static [FromHsva](../../aspose.svg.drawing/color/fromhsva/)(float, float, float, float) | Mengembalikan Warna baru dengan rona, saturasi, nilai, alfa yang diminta. |
| static [FromHwb](../../aspose.svg.drawing/color/fromhwb/)(float, float, float) | Mengembalikan Warna baru dengan nilai hue, whiteness, blackness yang diminta. |
| static [FromHwba](../../aspose.svg.drawing/color/fromhwba/)(float, float, float, float) | Mengembalikan Warna baru dengan nilai hue, whiteness, blackness yang diminta. |
| static [FromInt](../../aspose.svg.drawing/color/fromint/)(int) | Mengembalikan Warna baru dengan nilai ARGB yang diminta. |
| static [FromLab](../../aspose.svg.drawing/color/fromlab/)(float, float, float) | Mengembalikan Warna baru dengan nilai kecerahan, A, B yang diminta. |
| static [FromLaba](../../aspose.svg.drawing/color/fromlaba/)(float, float, float, float) | Mengembalikan Warna baru dengan nilai kecerahan, A, B, alfa yang diminta. |
| static [FromLch](../../aspose.svg.drawing/color/fromlch/)(float, float, float) | Mengembalikan Warna baru dengan nilai luminance, chroma, hue yang diminta. |
| static [FromLcha](../../aspose.svg.drawing/color/fromlcha/)(float, float, float, float) | Mengembalikan Warna baru dengan nilai luminance, chroma, hue, alpha yang diminta. |
| static [FromOklab](../../aspose.svg.drawing/color/fromoklab/)(float, float, float) | Mengembalikan Warna baru dengan nilai kecerahan, A, B yang diminta untuk model OKLAB. |
| static [FromOklaba](../../aspose.svg.drawing/color/fromoklaba/)(float, float, float, float) | Mengembalikan Warna baru dengan nilai kecerahan, A, B, alfa yang diminta untuk model OKLAB. |
| static [FromOklch](../../aspose.svg.drawing/color/fromoklch/)(float, float, float) | Mengembalikan Warna baru dengan nilai luminance, chroma, hue yang diminta untuk model OKLAB. |
| static [FromOklcha](../../aspose.svg.drawing/color/fromoklcha/)(float, float, float, float) | Mengembalikan Warna baru dengan luminance, chroma, hue, nilai alpha yang diminta untuk model OKLAB. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb/#fromrgb)(byte, byte, byte) | Mengembalikan Warna baru dengan nilai ged, green, blue yang diminta. Semua komponen warna harus dalam kisaran 0-255. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb/#fromrgb_2)(float, float, float) | Mengembalikan Warna baru dengan nilai ged, hijau, biru yang diminta. Semua komponen warna harus dalam kisaran 0-1. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb/#fromrgb_1)(int, int, int) | Mengembalikan Warna baru dengan nilai ged, green, blue yang diminta. Semua komponen warna harus dalam kisaran 0-255. |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba/#fromrgba)(byte, byte, byte, byte) | Mengembalikan Warna baru dengan nilai ged, hijau, biru, alfa yang diminta. Semua komponen warna harus dalam kisaran 0-255. |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba/#fromrgba_2)(float, float, float, float) | Mengembalikan Warna baru dengan nilai ged, hijau, biru, alfa yang diminta. Semua komponen warna harus dalam kisaran 0-1. |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba/#fromrgba_1)(int, int, int, int) | Mengembalikan Warna baru dengan nilai ged, hijau, biru, alfa yang diminta. Semua komponen warna harus dalam kisaran 0-255. |
| static [FromString](../../aspose.svg.drawing/color/fromstring/)(string) | Mem-parsing string yang berisi warna CSS dan mengembalikan Color. baru |
| static [FromUint](../../aspose.svg.drawing/color/fromuint/)(uint) | Mengembalikan Warna baru dengan nilai ARGB yang diminta. |
| [AddLuminosity](../../aspose.svg.drawing/color/addluminosity/)(float) | Membuat salinan Warna dengan Jumlah luminositasnya dan nilai delta. |
| [Convert](../../aspose.svg.drawing/color/convert/)(ColorModel) | Mengembalikan komponen warna dalam format model warna yang ditentukan. |
| override [Equals](../../aspose.svg.drawing/color/equals/)(object) | Menentukan apakah yang ditentukan`Color` sama dengan instance ini. |
| [GetComplementary](../../aspose.svg.drawing/color/getcomplementary/)() | Mengembalikan warna baru yang berseberangan dengan roda warna aslinya. |
| override [GetHashCode](../../aspose.svg.drawing/color/gethashcode/)() | Mengembalikan kode hash. |
| [GetHue](../../aspose.svg.drawing/color/gethue/)() | Mengembalikan Rona Warna. |
| [GetLuminosity](../../aspose.svg.drawing/color/getluminosity/)() | Mengembalikan luminositas Warna. |
| [GetSaturation](../../aspose.svg.drawing/color/getsaturation/)() | Mengembalikan saturasi Warna. |
| [ToInt](../../aspose.svg.drawing/color/toint/)() | Mengkodekan komponen Color ARGB ke dalam int. |
| [ToName](../../aspose.svg.drawing/color/toname/)() | Mengembalikan nama warna jika cocok dengan warna dalam daftar warna bernama CSS, atau string kosong. |
| [ToNaturalColorString](../../aspose.svg.drawing/color/tonaturalcolorstring/)(int) | Mengembalikan warna Natural colors (NCol) yang ditentukan menggunakan huruf warna dengan angka untuk menentukan jarak (dalam persen) dari warna. |
| [ToRgbaHexString](../../aspose.svg.drawing/color/torgbahexstring/)() | Mengembalikan warna Heksadesimal ditentukan dengan: #RRGGBBAA. |
| [ToRgbaString](../../aspose.svg.drawing/color/torgbastring/)() | Mengembalikan string yang berisi warna RGBA yang ditentukan oleh: rgba(R, G, B, A). |
| [ToRgbHexString](../../aspose.svg.drawing/color/torgbhexstring/)() | Mengembalikan warna heksadesimal yang ditentukan dengan: #RRGGBB. |
| [ToRgbString](../../aspose.svg.drawing/color/torgbstring/)() | Mengembalikan string yang berisi warna RGB yang ditentukan oleh: rgb(R, G, B). |
| override [ToString](../../aspose.svg.drawing/color/tostring/)() | Mengembalikan string yang terdiri dari nilai komponen RGBA. |
| [ToUint](../../aspose.svg.drawing/color/touint/)() | Mengkodekan komponen Color ARGB ke int. yang tidak ditandatangani |
| [WithAlpha](../../aspose.svg.drawing/color/withalpha/)(float) | Membuat salinan Warna dengan komponen alfa yang ditentukan. |
| [WithHue](../../aspose.svg.drawing/color/withhue/)(float) | Membuat salinan Warna dengan Hue. yang ditentukan |
| [WithLuminosity](../../aspose.svg.drawing/color/withluminosity/)(float) | Membuat salinan Warna dengan luminositas yang ditentukan. |
| [WithSaturation](../../aspose.svg.drawing/color/withsaturation/)(float) | Membuat salinan Warna dengan saturasi yang ditentukan. |

### Lihat juga

* ruang nama [Aspose.Svg.Drawing](../../aspose.svg.drawing/)
* perakitan [Aspose.SVG](../../)


