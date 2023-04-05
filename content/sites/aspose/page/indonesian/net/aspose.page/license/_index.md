---
title: Class License
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.License kelas. Menyediakan metode untuk melisensikan komponen.
type: docs
weight: 270
url: /id/net/aspose.page/license/
---
## License class

Menyediakan metode untuk melisensikan komponen.

```csharp
public class License
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [License](license/)() | Menginisialisasi instance baru dari kelas ini. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Embedded](../../aspose.page/license/embedded/) { get; set; } | Nomor lisensi ditambahkan sebagai sumber tersemat. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [SetLicense](../../aspose.page/license/setlicense/#setlicense)(Stream) | Lisensi komponen. |
| [SetLicense](../../aspose.page/license/setlicense/#setlicense_1)(string) | Lisensi komponen. |

### Contoh

Dalam contoh ini, upaya akan dilakukan untuk menemukan file lisensi bernama MyLicense.lic di folder yang berisi  komponen, di folder yang berisi rakitan pemanggil, di folder rakitan entri, lalu di sumber daya tertanam rakitan pemanggil.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

file jar komponen:

```csharp
License license = new License();
license.setLicense("MyLicense.lic");
```

### Lihat juga

* ruang nama [Aspose.Page](../../aspose.page/)
* perakitan [Aspose.Page](../../)


