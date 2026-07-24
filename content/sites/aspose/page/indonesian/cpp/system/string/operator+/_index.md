---
title: "Metode System::String::operator+"
linktitle: "operator+"
second_title: "Aspose.Page untuk C++"
description: "Metode System::String::operator+. Menambahkan karakter ke akhir string dalam C++."
type: docs
weight: 2800
url: /id/cpp/system/string/operator+/
---
## String::operator+(char_t) const method


Menambahkan karakter ke akhir string.

```cpp
String System::String::operator+(char_t x) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | char_t | Karakter yang akan ditambahkan. |

### ReturnValue

[String](../) concatenation result.

## Lihat Juga

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const String\&) const method


[String](../) concatenation operator.

```cpp
String System::String::operator+(const String &str) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | const String\& | [String](../) untuk ditambahkan ke akhir string saat ini. |

### ReturnValue

String yang digabungkan.

## Lihat Juga

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


[String](../) concatenation with string literal or character string pointer.

```cpp
template<typename T,std::enable_if_t< IsStringLiteral< T, char_t >::value > *> String System::String::operator+(const T &arg) const
```


| Parameter | Deskripsi |
| --- | --- |
| T | Salah satu bentuk literal string atau pointer string karakter. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arg | const T\& | Entitas untuk digabungkan dengan string saat ini. |

### ReturnValue

String yang digabungkan.

## Lihat Juga

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


Menambahkan representasi string objek tipe referensi ke akhir string.

```cpp
template<typename T,std::enable_if_t< IsSmartPtr< T >::value > *> String System::String::operator+(const T &value) const
```


| Parameter | Deskripsi |
| --- | --- |
| T | tipe pointer. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) untuk mengonversi ke string menggunakan pemanggilan [ToString()](../tostring/) dan menambahkannya ke string saat ini. |

### ReturnValue

[String](../) concatenation result.

## Lihat Juga

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


Menambahkan representasi string objek tipe nilai ke akhir string.

```cpp
template<typename T,std::enable_if_t<!IsSmartPtr< T >::value &&!std::is_scalar< T >::value &&!std::is_array< T >::value > *> String System::String::operator+(const T &value) const
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe nilai untuk memanggil [ToString()](../tostring/). |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) untuk mengonversi ke string menggunakan pemanggilan [ToString()](../tostring/) dan menambahkannya ke string saat ini. |

### ReturnValue

[String](../) concatenation result.

## Lihat Juga

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(double) const method


Menambahkan representasi string nilai titik mengambang ke akhir string.

```cpp
String System::String::operator+(double d) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| d | double | Nilai untuk dikonversi ke string dan ditambahkan. |

### ReturnValue

[String](../) concatenation result.

## Lihat Juga

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int) const method


Menambahkan representasi string nilai integer ke akhir string.

```cpp
String System::String::operator+(int i) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| i | int | Nilai integer untuk dikonversi ke string dan ditambahkan. |

### ReturnValue

[String](../) concatenation result.

## Lihat Juga

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int64_t) const method


Menambahkan representasi string nilai integer ke akhir string.

```cpp
String System::String::operator+(int64_t v) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| v | int64_t | Nilai untuk dikonversi ke string dan ditambahkan lagi. |

### ReturnValue

[String](../) concatenation result.

## Lihat Juga

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(T) const method


Menambahkan representasi string nilai boolean ke akhir string.

```cpp
template<typename T,std::enable_if_t< std::is_same< T, bool >::value > *> String System::String::operator+(T arg) const
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe nilai untuk digabungkan dengan string. Harus berupa bool |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arg | T | [Boolean](../../boolean/) nilai untuk dikonversi ke string dan ditambahkan. |

### ReturnValue

[String](../) concatenation result.

## Lihat Juga

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(uint32_t) const method


Menambahkan representasi string nilai integer tak bertanda ke akhir string.

```cpp
String System::String::operator+(uint32_t i) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| i | uint32_t | Nilai untuk dikonversi ke string dan ditambahkan. |

### ReturnValue

[String](../) concatenation result.

## Lihat Juga

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
