---
title: Class License
second_title: Aspose.OMR untuk Referensi .NET API
description: Aspose.OMR.License kelas. Menyediakan metode untuk melisensikan komponen.
type: docs
weight: 770
url: /id/net/aspose.omr/license/
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
| [Embedded](../../aspose.omr/license/embedded/) { get; set; } | Nomor lisensi ditambahkan sebagai sumber tersemat. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [SetLicense](../../aspose.omr/license/setlicense/#setlicense)(Stream) | Lisensi komponen. |
| [SetLicense](../../aspose.omr/license/setlicense/#setlicense_1)(string) | Lisensi komponen. |

### Contoh

Dalam contoh ini, upaya akan dilakukan untuk menemukan file lisensi bernama MyLicense.lic di folder yang berisi komponen, di folder yang berisi rakitan pemanggil, di folder rakitan entri dan kemudian di folder yang disematkan sumber daya rakitan pemanggil.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

### Lihat juga

* ruang nama [Aspose.OMR](../../aspose.omr/)
* perakitan [Aspose.OMR](../../)


