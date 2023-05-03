---
title: StringFormat.SetDigitSubstitution
second_title: Aspose.Drawing untuk Referensi .NET API
description: StringFormat metode. Menentukan bahasa dan metode yang akan digunakan saat digit lokal diganti dengan digit barat.
type: docs
weight: 140
url: /id/net/system.drawing/stringformat/setdigitsubstitution/
---
## StringFormat.SetDigitSubstitution method

Menentukan bahasa dan metode yang akan digunakan saat digit lokal diganti dengan digit barat.

```csharp
public void SetDigitSubstitution(int language, StringDigitSubstitute substitute)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| language | Int32 | Pengidentifikasi bahasa Dukungan Bahasa Nasional (NLS) yang mengidentifikasi bahasa yang akan digunakan saat digit lokal diganti dengan digit barat. Anda dapat melewatiLCID milik a CultureInfo objek sebagai pengidentifikasi bahasa NLS. Misalnya, misalkan Anda membuatCultureInfo objek by melewati string`"ar-EG"` ke aCultureInfo constructor. Jika Anda lulusLCID milik that CultureInfo objek bersama dengan Traditional ke Int32,StringDigitSubstitute) metode, maka digit Arab-Indikasi akan diganti dengan digit barat pada waktu tampilan. |
| substitute | StringDigitSubstitute | Sebuah elemen dariStringDigitSubstitute pencacahan yang menentukan bagaimana digit ditampilkan. |

### Lihat juga

* enum [StringDigitSubstitute](../../stringdigitsubstitute/)
* class [StringFormat](../)
* ruang nama [System.Drawing](../../stringformat/)
* perakitan [Aspose.Drawing](../../../)


