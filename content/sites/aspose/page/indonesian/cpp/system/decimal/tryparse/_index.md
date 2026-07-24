---
title: "metode System::Decimal::TryParse"
linktitle: "TryParse"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Decimal::TryParse. Mengonversi string yang ditentukan yang berisi representasi string dari sebuah angka menjadi nilai Decimal yang setara dalam C++."
type: docs
weight: 5800
url: /id/cpp/system/decimal/tryparse/
---
## Decimal::TryParse(const String\&, Decimal\&) method


Mengonversi string yang ditentukan yang berisi representasi string dari sebuah angka menjadi nilai [Decimal](../) yang setara.

```cpp
static bool System::Decimal::TryParse(const String &value, Decimal &result)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const String\& | String yang akan dikonversi |
| result | Decimal\& | Referensi ke variabel [Decimal](../) tempat hasil konversi ditempatkan |

### ReturnValue

Benar jika konversi berhasil, jika tidak - salah

## Lihat Juga

* Class [String](../../string/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) method


Mengonversi string yang ditentukan yang berisi representasi string dari sebuah angka menjadi nilai [Decimal](../) yang setara menggunakan informasi format dan gaya angka yang disediakan.

```cpp
static bool System::Decimal::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, Decimal &result)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const String\& | String yang akan dikonversi |
| styles | Globalization::NumberStyles | Kombinasi bitwise dari nilai enum NumberStyles yang menentukan gaya yang diizinkan untuk representasi string dari sebuah angka |
| penyedia | const SharedPtr\<IFormatProvider\>\& | Pointer ke objek yang berisi informasi format string |
| hasil | Decimal\& | Argumen keluaran; berisi hasil konversi |

### ReturnValue

Benar jika konversi berhasil, jika tidak - salah

## Lihat Juga

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
