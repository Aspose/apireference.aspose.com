---
title: "System::String::LastIndexOf metode"
linktitle: "LastIndexOf"
second_title: "Aspose.Page untuk C++"
description: "System::String::LastIndexOf metode. Pencarian karakter mundur dalam C++."
type: docs
weight: 2400
url: /id/cpp/system/string/lastindexof/
---
## String::LastIndexOf(char_t) const method


Pencarian mundur karakter.

```cpp
int System::String::LastIndexOf(char_t value) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | char_t | Karakter yang dicari. |

### ReturnValue

Indeks posisi karakter terakhir atau -1 jika tidak ditemukan.

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t) const method


Pencarian mundur karakter.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | char_t | Karakter yang dicari. |
| startIndex | int32_t | Indeks untuk memulai pencarian. |

### ReturnValue

Indeks posisi karakter terakhir sejak startIndex atau -1 jika tidak ditemukan.

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t, int32_t) const method


Pencarian mundur karakter.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex, int32_t count) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | char_t | Karakter yang dicari. |
| startIndex | int32_t | Indeks untuk memulai pencarian. |
| count | int32_t | Jumlah karakter yang akan diperiksa |

### ReturnValue

Indeks posisi karakter terakhir sejak startIndex atau -1 jika tidak ditemukan.

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, System::StringComparison) const method


Pencarian mundur substring.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex, System::StringComparison comparison_type) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | const String\& | Substring yang dicari. |
| startIndex | int | Posisi dalam string sumber untuk memulai pencarian. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) mode. |

### ReturnValue

Indeks substring terakhir yang ditemukan atau -1 jika tidak ditemukan. Untuk string pencarian kosong, selalu mengembalikan panjang string.

## Lihat Juga

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int) const method


Pencarian mundur substring.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex=INT32_MAX) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | const String\& | Substring yang dicari. |
| startIndex | int | Posisi dalam string sumber untuk memulai pencarian. |

### ReturnValue

Indeks substring terakhir yang ditemukan atau -1 jika tidak ditemukan. Untuk string pencarian kosong, selalu mengembalikan panjang string.

## Lihat Juga

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, System::StringComparison) const method


Pencarian mundur substring.

```cpp
int System::String::LastIndexOf(const String &str, System::StringComparison comparison_type) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | const String\& | Substring yang dicari. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) mode. |

### ReturnValue

Indeks substring terakhir yang ditemukan atau -1 jika tidak ditemukan. Untuk string pencarian kosong, selalu mengembalikan panjang string.

## Lihat Juga

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, int, StringComparison) const method


Pencarian mundur substring.

```cpp
int System::String::LastIndexOf(const String &value, int startIndex, int count, StringComparison comparisonType) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const String\& | Substring yang dicari. |
| startIndex | int | Posisi dalam string sumber untuk memulai pencarian. |
| count | int | Jumlah karakter yang akan diperiksa. |
| comparisonType | StringComparison | [Comparison](../../comparison/) mode. |

### ReturnValue

Indeks substring terakhir yang ditemukan atau -1 jika tidak ditemukan. Untuk string pencarian kosong, selalu mengembalikan startIndex+count.

## Lihat Juga

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
