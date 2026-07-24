---
title: "System::Uri::Compare metode"
linktitle: "Compare"
second_title: "Aspose.Page untuk C++"
description: "System::Uri::Compare metode. Membandingkan objek Uri yang ditentukan menggunakan aturan perbandingan yang ditentukan dalam C++."
type: docs
weight: 3500
url: /id/cpp/system/uri/compare/
---
## Uri::Compare method


Membandingkan objek [Uri](../) yang ditentukan menggunakan aturan perbandingan yang ditentukan.

```cpp
static int32_t System::Uri::Compare(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2, UriComponents partsToCompare, UriFormat compareFormat, StringComparison comparisonType)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | Pembanding pertama |
| uri2 | const SharedPtr\<Uri\>\& | Pembanding kedua |
| partsToCompare | UriComponents | Menentukan bagian-bagian **uri1** dan **uri2** untuk dibandingkan |
| compareFormat | UriFormat | Menentukan pelolosan karakter yang digunakan saat komponen URI dibandingkan |
| comparisonType | StringComparison | Salah satu nilai [StringComparison](../../stringcomparison/) |

### ReturnValue

Nilai negatif jika **uri1** lebih kecil dari **uri2**; 0 jika uri1 dan uri2 sama; nilai positif jika **uri1** lebih besar dari **uri2**

## Lihat Juga

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Enum [UriComponents](../../uricomponents/)
* Enum [UriFormat](../../uriformat/)
* Enum [StringComparison](../../stringcomparison/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
