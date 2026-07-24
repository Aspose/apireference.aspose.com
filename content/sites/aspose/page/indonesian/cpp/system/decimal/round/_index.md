---
title: "System::Decimal::Round metode"
linktitle: "Pembulatan"
second_title: "Aspose.Page untuk C++"
description: "System::Decimal::Round metode. Membulatkan nilai yang ditentukan ke nilai terdekat dengan jumlah digit pecahan yang ditentukan. Sebuah parameter menentukan perilaku fungsi jika nilai yang ditentukan sama dekatnya dengan dua angka terdekat dalam C++."
type: docs
weight: 4400
url: /id/cpp/system/decimal/round/
---
## Decimal::Round(const Decimal\&, int, MidpointRounding) method


Membulatkan nilai yang ditentukan ke nilai terdekat dengan jumlah digit pecahan yang ditentukan. Sebuah parameter menentukan perilaku fungsi jika nilai yang ditentukan sama dekatnya dengan dua nilai terdekat.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, int digits, MidpointRounding mode=MidpointRounding::ToEven)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| d | const Decimal\& | Nilai yang akan dibulatkan |
| digit | int | Jumlah digit pecahan dalam nilai yang dibulatkan |
| mode | MidpointRounding | Menentukan cara melakukan pembulatan jika **value** sama dekatnya dengan dua angka terdekat. |

### ReturnValue

Angka dengan jumlah digit yang ditentukan terdekat dengan **value**

## Lihat Juga

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::Round(const Decimal\&, MidpointRounding) method


Membulatkan nilai yang ditentukan ke bilangan bulat terdekat. Sebuah parameter menentukan perilaku fungsi jika nilai yang ditentukan sama dekatnya dengan dua bilangan terdekat.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, MidpointRounding mode=MidpointRounding::ToEven)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| d | const Decimal\& | Nilai yang akan dibulatkan |
| mode | MidpointRounding | Menentukan cara melakukan pembulatan jika **value** sama dekatnya dengan dua angka terdekat. |

### ReturnValue

**d** rounded to the nearest integral value

## Lihat Juga

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
