---
title: "System::String::IndexOfAny metode"
linktitle: "IndexOfAny"
second_title: "Aspose.Page untuk C++"
description: "System::String::IndexOfAny metode. Pencarian maju karakter dalam C++."
type: docs
weight: 1600
url: /id/cpp/system/string/indexofany/
---
## String::IndexOfAny(char_t, int) const method


Pencarian maju karakter.

```cpp
int System::String::IndexOfAny(char_t c, int startIndex=0) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| c | char_t | Karakter yang dicari. |
| startIndex | int | Indeks untuk memulai pencarian. |

### ReturnValue

Indeks posisi karakter pertama sejak startIndex atau -1 jika tidak ditemukan.

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&) const method


Mencari salah satu karakter yang diberikan melalui seluruh string. Membandingkan karakter pertama string dengan semua karakter di anyOf, kemudian membandingkan yang kedua dan seterusnya. Mengembalikan indeks dari yang pertama yang cocok dengan salah satu karakter target.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) karakter yang dicari. Urutan tidak penting. |

### ReturnValue

Indeks karakter pertama yang cocok atau -1 jika tidak ditemukan.

## Lihat Juga

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


Mencari salah satu karakter yang diberikan melalui substring. Membandingkan karakter pertama string dengan semua karakter di anyOf, kemudian membandingkan yang kedua dan seterusnya. Mengembalikan indeks dari yang pertama yang cocok dengan salah satu karakter target.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) karakter yang dicari. Urutan tidak penting. |
| startindex | int32_t | Indeks untuk memulai pencarian dari. |

### ReturnValue

Indeks karakter pertama yang cocok atau -1 jika tidak ditemukan.

## Lihat Juga

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


Mencari salah satu karakter yang diberikan melalui substring. Membandingkan karakter pertama string dengan semua karakter di anyOf, kemudian membandingkan yang kedua dan seterusnya. Mengembalikan indeks dari yang pertama yang cocok dengan salah satu karakter target.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) karakter yang dicari. Urutan tidak penting. |
| startindex | int32_t | Indeks untuk memulai pencarian dari. |
| count | int32_t | Jumlah karakter yang akan diperiksa. |

### ReturnValue

Indeks karakter pertama yang cocok atau -1 jika tidak ditemukan.

## Lihat Juga

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const String\&, int) const method


Secara konsekuen mencari semua karakter dari str dalam ini. Jika karakter pertama ditemukan, posisinya dikembalikan, jika tidak mencari karakter kedua dan seterusnya.

```cpp
int System::String::IndexOfAny(const String &str, int startIndex=0) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | const String\& | [String](../) karakter yang akan dicari. Urutan karakter penting. |
| startIndex | int | Posisi untuk memulai pencarian. |

### ReturnValue

Indeks karakter pertama yang ditemukan atau -1 jika tidak ada yang ditemukan.

## Lihat Juga

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
