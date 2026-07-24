---
title: "Aspose::Page::XPS::XpsModel::XpsFillRule enum"
linktitle: "XpsFillRule"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsModel::XpsFillRule enum. Nilai yang valid untuk properti FillRule elemen PathGeometry dalam C++."
type: docs
weight: 4900
url: /id/cpp/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enum


Nilai valid properti FillRule elemen PathGeometry.

```cpp
enum class XpsFillRule
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| EvenOdd | 0 | Aturan ini menentukan “insideness” (keberadaan di dalam) sebuah titik pada kanvas dengan menggambar sinar dari titik tersebut ke tak terhingga dalam arah apa pun dan menghitung jumlah segmen dari bentuk yang diberikan yang dilalui sinar. Jika jumlah ini ganjil, titik berada di dalam; jika genap, titik berada di luar. |
| NonZero | 1 | Aturan ini menentukan “insideness” sebuah titik pada kanvas dengan menggambar sinar dari titik ke tak terhingga dalam arah apa pun dan kemudian memeriksa tempat di mana segmen bentuk memotong sinar. Mulai dengan hitungan nol, tambahkan satu setiap kali segmen memotong sinar dari kiri ke kanan dan kurangi satu setiap kali segmen jalur memotong sinar dari kanan ke kiri. Setelah menghitung perpotongan, jika hasilnya nol maka titik berada di luar jalur; jika tidak, titik berada di dalam. |

## Lihat Juga

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
