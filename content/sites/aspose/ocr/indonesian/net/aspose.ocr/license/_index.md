---
title: Class License
second_title: Aspose.OCR untuk .NET API Referensi
description: Aspose.OCR.License kelas. Menyediakan metode untuk melisensikan komponen.
type: docs
weight: 120
url: /id/net/aspose.ocr/license/
---
## License class

Menyediakan metode untuk melisensikan komponen.

```csharp
public class License
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [License](license/)() | Konstruktor default. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [IsLicensed](../../aspose.ocr/license/islicensed/) { get; } | Mendapat nilai yang menunjukkan apakah produk berlisensi. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense)(Stream) | Lisensi komponen. |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense_1)(string) | Lisensi komponen. |

### Contoh

Dalam contoh ini, upaya akan dilakukan untuk menemukan file lisensi bernama MyLicense.lic di folder yang berisi komponen, di folder yang berisi rakitan pemanggil, di folder rakitan entri lalu di sumber daya tersemat dari rakitan pemanggil.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");
```

### Lihat juga

* ruang nama [Aspose.OCR](../../aspose.ocr/)
* perakitan [Aspose.OCR](../../)


