---
title: "Aspose::Page::Metered kelas"
linktitle: "Berbasis meter"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::Metered kelas. Menyediakan metode untuk mengatur kunci berlisensi metered dalam C++."
type: docs
weight: 1400
url: /id/cpp/aspose.page/metered/
---
## Metered class


Menyediakan metode untuk mengatur kunci bermeter.

```cpp
class Metered : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [GetConsumptionCredit](./getconsumptioncredit/)() | Mendapatkan kredit konsumsi. |
| static [GetConsumptionQuantity](./getconsumptionquantity/)() | Mendapatkan ukuran file konsumsi. |
| [Metered](./metered/)() | Menginisialisasi instance baru dari kelas ini. |
| [SetMeteredKey](./setmeteredkey/)(System::String, System::String) | Menetapkan kunci publik dan privat berlisensi metered. Jika Anda membeli lisensi metered, saat memulai aplikasi, API ini harus dipanggil, biasanya, ini sudah cukup. Namun, jika selalu gagal mengunggah data konsumsi dan melebihi 24 jam, lisensi akan diatur ke status evaluasi; untuk menghindari hal tersebut, Anda harus secara teratur memeriksa status lisensi, jika berada dalam status evaluasi, panggil API ini lagi. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
