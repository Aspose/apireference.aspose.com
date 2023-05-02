---
title: Class StringFormat
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.StringFormat kelas. Merangkum informasi tata letak teks seperti perataan orientasi dan perhentian tab manipulasi tampilan seperti penyisipan elipsis dan substitusi digit nasional dan fitur OpenType. Kelas ini tidak dapat diwariskan.
type: docs
weight: 1130
url: /id/net/system.drawing/stringformat/
---
## StringFormat class

Merangkum informasi tata letak teks (seperti perataan, orientasi, dan perhentian tab) manipulasi tampilan (seperti penyisipan elipsis dan substitusi digit nasional) dan fitur OpenType. Kelas ini tidak dapat diwariskan.

```csharp
public sealed class StringFormat : IDisposable
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [StringFormat](stringformat/#constructor)() | Menginisialisasi instance baru dari`StringFormat` kelas. |
| [StringFormat](stringformat/#constructor_1)(StringFormat) | Menginisialisasi instance baru dari`StringFormat` class dari yang ditentukan yang adaStringFormat objek. |
| [StringFormat](stringformat/#constructor_2)(StringFormatFlags) | Menginisialisasi instance baru dari`StringFormat`kelas dengan yang ditentukan StringFormatFlags pencacahan. |
| [StringFormat](stringformat/#constructor_3)(StringFormatFlags, int) | Menginisialisasi instance baru dari`StringFormat` kelas dengan yang ditentukan[`StringFormatFlags`](../stringformatflags/) pencacahan dan bahasa. |

## Properti

| Nama | Keterangan |
| --- | --- |
| static [GenericDefault](../../system.drawing/stringformat/genericdefault/) { get; } | Mendapat default umumStringFormat objek. |
| static [GenericTypographic](../../system.drawing/stringformat/generictypographic/) { get; } | Mendapat tipografi umumStringFormat objek. |
| [Alignment](../../system.drawing/stringformat/alignment/) { get; set; } | Mendapat atau menyetel informasi perataan teks pada bidang vertikal. |
| [DigitSubstitutionLanguage](../../system.drawing/stringformat/digitsubstitutionlanguage/) { get; } | Mendapatkan bahasa yang digunakan saat digit lokal diganti dengan digit barat. |
| [DigitSubstitutionMethod](../../system.drawing/stringformat/digitsubstitutionmethod/) { get; } | Mendapat metode yang akan digunakan untuk penggantian digit. |
| [FormatFlags](../../system.drawing/stringformat/formatflags/) { get; set; } | Mendapat atau menyetel aStringFormatFlags pencacahan yang berisi informasi pemformatan. |
| [HotkeyPrefix](../../system.drawing/stringformat/hotkeyprefix/) { get; set; } | Mendapat atau menyetelHotkeyPrefixkeberatan untuk iniStringFormat objek. |
| [LineAlignment](../../system.drawing/stringformat/linealignment/) { get; set; } | Mendapat atau mengatur perataan garis pada bidang horizontal. |
| [Trimming](../../system.drawing/stringformat/trimming/) { get; set; } | Mendapat atau menyetelStringTrimming pencacahan untuk iniStringFormat objek. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Clone](../../system.drawing/stringformat/clone/)() | Membuat salinan yang tepat dari ini`StringFormat` obyek. |
| [Dispose](../../system.drawing/stringformat/dispose/)() | Merilis semua sumber daya yang digunakan oleh iniStringFormat objek. |
| [GetTabStops](../../system.drawing/stringformat/gettabstops/)(out float) | Menghentikan tab untuk iniStringFormat objek. |
| [SetDigitSubstitution](../../system.drawing/stringformat/setdigitsubstitution/)(int, StringDigitSubstitute) | Menentukan bahasa dan metode yang akan digunakan saat digit lokal diganti dengan digit barat. |
| [SetMeasurableCharacterRanges](../../system.drawing/stringformat/setmeasurablecharacterranges/)(CharacterRange[]) | Menentukan array dariCharacterRange struktur yang mewakili rentang karakter diukur dengan panggilan keMeasureCharacterRanges metode. |
| [SetTabStops](../../system.drawing/stringformat/settabstops/)(float, float[]) | Menyetel perhentian tab untuk iniStringFormat objek. |

### Lihat juga

* ruang nama [System.Drawing](../../system.drawing/)
* perakitan [Aspose.Drawing](../../)


