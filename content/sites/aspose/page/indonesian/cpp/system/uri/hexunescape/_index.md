---
title: "System::Uri::HexUnescape metode"
linktitle: "HexUnescape"
second_title: "Aspose.Page untuk C++"
description: "System::Uri::HexUnescape metode. Mengonversi representasi heksadesimal yang ditentukan dari sebuah karakter menjadi karakter dalam C++."
type: docs
weight: 4000
url: /id/cpp/system/uri/hexunescape/
---
## Uri::HexUnescape method


Mengonversi representasi heksadesimal yang ditentukan dari sebuah karakter menjadi karakter.

```cpp
static char16_t System::Uri::HexUnescape(const String &pattern, int32_t &index)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| pola | const String\& | String yang berisi representasi heksadesimal dari sebuah karakter |
| indeks | int32_t\& | Posisi dalam **pattern** di mana representasi heksadesimal dari sebuah karakter dimulai |

### ReturnValue

Karakter yang direpresentasikan oleh enkoding heksadesimal pada posisi **index**. Jika karakter pada **index** tidak dienkode secara heksadesimal, karakter pada **index** dikembalikan. Nilai **index** dinaikkan untuk menunjuk ke karakter setelah karakter yang dikembalikan.

## Lihat Juga

* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
