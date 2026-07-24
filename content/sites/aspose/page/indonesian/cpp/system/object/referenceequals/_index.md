---
title: "Metode System::Object::ReferenceEquals"
linktitle: "ReferenceEquals"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Object::ReferenceEquals. Spesialisasi dari Object::ReferenceEquals untuk kasus string dan nullptr di C++."
type: docs
weight: 1200
url: /id/cpp/system/object/referenceequals/
---
## Object::ReferenceEquals(String const\&, std::nullptr_t) method


Spesialisasi dari [Object::ReferenceEquals](./) untuk kasus string dan nullptr.

```cpp
bool System::Object::ReferenceEquals(String const &str, std::nullptr_t)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | String const\& | [String](../../string/) untuk dibandingkan dengan nullptr. |

### ReturnValue

true jika string null, false sebaliknya.

## Lihat Juga

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(String const\&, String const\&) method


Spesialisasi dari [Object::ReferenceEquals](./) untuk kasus string.

```cpp
bool System::Object::ReferenceEquals(String const &str1, String const &str2)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str1 | String const\& | String pertama untuk dibandingkan. |
| str2 | String const\& | String kedua untuk dibandingkan. |

### ReturnValue

true jika string cocok, false jika tidak.

## Lihat Juga

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(ptr const\&, ptr const\&) method


Membandingkan objek berdasarkan referensi.

```cpp
static bool System::Object::ReferenceEquals(ptr const &objA, ptr const &objB)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| objA | ptr const\\& | Pointer pertama untuk dibandingkan. |
| objB | ptr const\\& | Pointer kedua untuk dibandingkan. |

### ReturnValue

Benar jika pointer cocok dan salah sebaliknya.

## Lihat Juga

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(T const\&, std::nullptr_t) method


Reference-membandingkan objek tipe nilai dengan nullptr.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, std::nullptr_t)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek untuk dibandingkan. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| objA | T const\\& | Objek pertama untuk dibandingkan. |

### ReturnValue

Selalu mengembalikan false karena tipe nilai tidak dapat bernilai null.

## Lihat Juga

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(T const\&, T const\&) method


Membandingkan objek berdasarkan referensi.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, T const &objB)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek-objek untuk dibandingkan. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| objA | T const\\& | Objek pertama untuk dibandingkan. |
| objB | T const\\& | Objek kedua untuk dibandingkan. |

### ReturnValue

Benar jika alamat objek cocok dan salah sebaliknya.

## Lihat Juga

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
