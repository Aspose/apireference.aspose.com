---
title: "System::String::Join metode"
linktitle: "Join"
second_title: "Aspose.Page untuk C++"
description: "System::String::Join metode. Menggabungkan array menggunakan string sebagai pemisah dalam C++."
type: docs
weight: 7300
url: /id/cpp/system/string/join/
---
## String::Join(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) method


Menggabungkan array menggunakan string sebagai pemisah.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<SharedPtr<Object>> &parts)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| separator | const String\& | [String](../) untuk diletakkan di antara elemen array saat menggabungkannya. |
| parts | const ArrayPtr\<SharedPtr\<Object\>\>\& | [Array](../../array/) dari bagian-bagian yang akan digabung. |

### ReturnValue

[String](../) representing joint elements.

## Lihat Juga

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const ArrayPtr\<String\>\&, int, int) method


Menggabungkan array menggunakan string sebagai pemisah.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<String> &parts, int startIndex=0, int count=-1)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| separator | const String\& | [String](../) untuk diletakkan di antara elemen array saat menggabungkannya. |
| parts | const ArrayPtr\<String\>\& | [Array](../../array/) dari bagian-bagian yang akan digabung. |
| startIndex | int | Indeks pertama dalam array untuk memulai penggabungan. |
| count | int | Jumlah elemen array yang akan digabung. -1 berarti 'sampai array berakhir'. |

### ReturnValue

[String](../) representing joint array elements.

## Lihat Juga

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) method


Menggabungkan array menggunakan string sebagai pemisah.

```cpp
static String System::String::Join(const String &separator, const SharedPtr<System::Collections::Generic::IEnumerable<String>> &parts)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| separator | const String\& | [String](../) untuk diletakkan di antara elemen array saat menggabungkannya. |
| bagian | const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\& | - objek enumerable bagian |

### ReturnValue

[String](../) representing joint elements.

## Lihat Juga

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const System::Details::ArrayView\<String\>\&, int, int) method


Menggabungkan array menggunakan string sebagai pemisah.

```cpp
static String System::String::Join(const String &separator, const System::Details::ArrayView<String> &parts, int startIndex=0, int count=-1)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| separator | const String\& | [String](../) untuk diletakkan di antara elemen array saat menggabungkannya. |
| bagian | const System::Details::ArrayView\<String\>\& | ArrayView dari bagian-bagian yang akan digabung. |
| startIndex | int | Indeks pertama dalam array untuk memulai penggabungan. |
| count | int | Jumlah elemen array yang akan digabung. -1 berarti 'sampai array berakhir'. |

### ReturnValue

[String](../) representing joint array elements.

## Lihat Juga

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
