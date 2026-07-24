---
title: "System::BitConverter::ToString metode"
linktitle: "ToString"
second_title: "Aspose.Page untuk C++"
description: "System::BitConverter::ToString metode. Mengonversi semua nilai dari array byte yang ditentukan menjadi representasi string heksadesimal mereka. Kasus huruf yang digunakan dalam notasi heksadesimal dan pemisah yang disisipkan antara setiap pasangan byte bersebelahan ditentukan melalui argumen yang sesuai dalam C++."
type: docs
weight: 1200
url: /id/cpp/system/bitconverter/tostring/
---
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, bool, const String\&) method


Mengonversi semua nilai dari array byte yang ditentukan menjadi representasi string heksadesimal mereka. Huruf kapital/kecil yang digunakan dalam notasi heksadesimal serta pemisah yang disisipkan antara setiap pasangan byte berdekatan ditentukan melalui argumen yang bersangkutan.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, bool uppercase=true, const String &separator=u"-")
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) yang berisi byte untuk dikonversi |
| huruf besar | bool | Menentukan kasus huruf yang digunakan dalam representasi heksadesimal yang dihasilkan |
| pemisah | const String\& | String yang digunakan sebagai pemisah yang disisipkan antara setiap pasangan byte bersebelahan dalam string hasil |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified byte array

## Lihat Juga

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int) method


Mengonversi nilai-nilai dari array byte yang ditentukan menjadi representasi string heksadesimal mereka mulai pada indeks yang ditentukan.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) yang berisi byte untuk dikonversi |
| startIndex | int | Indeks dalam array yang ditentukan di mana memulai konversi |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## Lihat Juga

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int, int) method


Mengonversi rentang nilai dari array byte yang ditentukan menjadi representasi string heksadesimal mereka.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex, int length)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) yang berisi byte untuk dikonversi |
| startIndex | int | Indeks dalam array yang ditentukan di mana rentang elemen array byte yang akan dikonversi dimulai |
| length | int | Panjang rentang elemen array byte yang akan dikonversi |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## Lihat Juga

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
