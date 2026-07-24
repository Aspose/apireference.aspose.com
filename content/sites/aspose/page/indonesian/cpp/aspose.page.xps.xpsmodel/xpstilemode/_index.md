---
title: "enum Aspose::Page::XPS::XpsModel::XpsTileMode"
linktitle: "XpsTileMode"
second_title: "Aspose.Page untuk C++"
description: "enum Aspose::Page::XPS::XpsModel::XpsTileMode. Nilai yang valid untuk properti TileMode pada kuas ubin dalam C++."
type: docs
weight: 5500
url: /id/cpp/aspose.page.xps.xpsmodel/xpstilemode/
---
## XpsTileMode enum


Nilai valid properti TileMode kuas ubin.

```cpp
enum class XpsTileMode
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| None | 0 | Dalam mode ini, hanya ubin dasar tunggal yang digambar. Area yang tersisa dibiarkan transparan. |
| Tile | 1 | Dalam mode ini, ubin dasar digambar dan area yang tersisa diisi dengan mengulang ubin dasar sehingga tepi kanan setiap ubin bersebelahan dengan tepi kiri ubin berikutnya, dan tepi bawah setiap ubin bersebelahan dengan tepi atas ubin berikutnya. |
| FlipX | 2 | Pengaturan ubin mirip dengan mode ubin Tile, tetapi kolom ubin alternatif dibalik secara horizontal. Ubin dasar diposisikan sesuai yang ditentukan oleh viewport. Ubin di kolom kiri dan kanan ubin ini dibalik secara horizontal. |
| FlipY | 3 | Pengaturan ubin mirip dengan mode ubin Tile, tetapi baris ubin alternatif dibalik secara vertikal. Ubin dasar diposisikan sesuai yang ditentukan oleh viewport. Baris di atas dan di bawah dibalik secara vertikal. |
| FlipXY | 4 | Pengaturan ubin mirip dengan mode Tile tile, tetapi kolom ubin alternatif dibalik secara horizontal dan baris ubin alternatif dibalik secara vertikal. Ubin dasar diposisikan seperti yang ditentukan oleh viewport. |

## Lihat Juga

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
