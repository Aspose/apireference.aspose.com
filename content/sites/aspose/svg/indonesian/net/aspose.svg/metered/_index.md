---
title: Class Metered
second_title: Aspose.SVG untuk Referensi .NET API
description: Aspose.Svg.Metered kelas. Menyediakan metode untuk menyetel kunci terukur.
type: docs
weight: 2200
url: /id/net/aspose.svg/metered/
---
## Metered class

Menyediakan metode untuk menyetel kunci terukur.

```csharp
public class Metered
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Metered](metered/)() | Menginisialisasi instance baru dari kelas ini. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [SetMeteredKey](../../aspose.svg/metered/setmeteredkey/)(string, string) | Mengatur kunci publik dan pribadi terukur. Jika Anda membeli lisensi terukur, saat memulai aplikasi, API ini harus dipanggil, biasanya, ini sudah cukup. Namun, jika selalu gagal mengunggah data konsumsi dan melebihi 24 jam, lisensi akan disetel ke status evaluasi, untuk menghindari kasus tersebut, Anda harus memeriksa status lisensi secara berkala, jika status evaluasi, hubungi API ini lagi. |
| static [GetConsumptionCredit](../../aspose.svg/metered/getconsumptioncredit/)() | Mendapat kredit konsumsi |
| static [GetConsumptionQuantity](../../aspose.svg/metered/getconsumptionquantity/)() | Mendapat ukuran file konsumsi |

### Contoh

Dalam contoh ini, upaya akan dilakukan untuk menyetel kunci publik dan pribadi terukur

```csharp
[C#]

Metered matered = new Metered();
matered.SetMeteredKey("PublicKey", "PrivateKey");


[Visual Basic]

Dim matered As Metered = New Metered
matered.SetMeteredKey("PublicKey", "PrivateKey")
```

file jar komponen:

```csharp
Metered matered = new Metered();
matered.setMeteredKey("PublicKey", "PrivateKey");
```

### Lihat juga

* ruang nama [Aspose.Svg](../../aspose.svg/)
* perakitan [Aspose.SVG](../../)


