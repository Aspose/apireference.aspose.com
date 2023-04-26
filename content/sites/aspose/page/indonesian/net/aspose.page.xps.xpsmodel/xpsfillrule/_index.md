---
title: Enum XpsFillRule
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.XPS.XpsModel.XpsFillRule enum. Nilai yang valid dari properti FillRule elemen PathGeometry.
type: docs
weight: 3080
url: /id/net/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enumeration

Nilai yang valid dari properti FillRule elemen PathGeometry.

```csharp
public enum XpsFillRule
```

### Nilai

| Nama | Nilai | Keterangan |
| --- | --- | --- |
| EvenOdd | `0` | Aturan ini menentukan "sisi dalam" suatu titik di kanvas dengan menggambar sinar dari titik hingga tak terhingga ke segala arah dan menghitung jumlah segmen dari bentuk tertentu yang dilintasi sinar. Jika angka ini ganjil, intinya adalah di dalam; jika genap, titiknya di luar. |
| NonZero | `1` | Aturan ini menentukan "sisi dalam" suatu titik di kanvas dengan menggambar sinar dari titik hingga tak terhingga ke segala arah dan kemudian memeriksa tempat di mana suatu segmen bentuk melintasi sinar. Dimulai dengan hitungan nol, tambahkan satu setiap kali segmen melintasi sinar dari kiri ke kanan dan kurangi satu setiap kali segmen jalur melintasi sinar dari kanan ke kiri. Setelah menghitung penyeberangan, jika hasilnya nol maka titik tersebut berada di luar lintasan; jika tidak, itu ada di dalam. |

### Lihat juga

* ruang nama [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* perakitan [Aspose.Page](../../)


