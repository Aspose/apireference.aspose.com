---
title: Class License
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.License kelas. Menyediakan metode untuk melisensikan komponen.
type: docs
weight: 1270
url: /id/net/aspose.gis/license/
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

## Metode

| Nama | Keterangan |
| --- | --- |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense)(Stream) | Lisensi komponen. |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense_1)(string) | Lisensi komponen. |

### Contoh

Dalam contoh ini, upaya akan dilakukan untuk menemukan file lisensi bernama MyLicense.lic di folder yang berisi komponen, di folder yang berisi rakitan pemanggil, di folder rakitan entri lalu di folder sumber daya tersemat dari rakitan pemanggil.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

### Lihat juga

* ruang nama [Aspose.Gis](../../aspose.gis/)
* perakitan [Aspose.GIS](../../)


