---
title: "metode System::GetHashCode"
linktitle: "DapatkanKodeHash"
second_title: "Aspose.Page untuk C++"
description: "metode System::GetHashCode. Spesialisasi untuk std::thread::id; Mengembalikan kode hash untuk objek thread yang ditentukan dalam C++."
type: docs
weight: 21200
url: /id/cpp/system/gethashcode/
---
## System::GetHashCode(const std::thread::id\&) method


Spesialisasi untuk std::thread::id; Mengembalikan kode hash untuk objek thread yang ditentukan.

```cpp
int System::GetHashCode(const std::thread::id &id)
```

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


Mengembalikan kode hash untuk nilai skalar yang ditentukan.

```cpp
template<typename T> std::enable_if<std::is_scalar<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe nilai yang untuknya fungsi menghasilkan kode hash |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const T\& | Nilai yang akan dihasilkan kode hashnya |

### ReturnValue

Kode hash yang dihasilkan untuk nilai yang ditentukan

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


Mengembalikan kode hash untuk objek yang ditentukan.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&System::IsSmartPtr<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek yang fungsi menghasilkan kode hashnya. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const T\& | [SmartPtr](../smartptr/) yang menunjuk ke objek untuk menghasilkan kode hash. |

### ReturnValue

Kode hash yang dihasilkan untuk objek yang ditentukan.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


Mengembalikan kode hash untuk objek yang ditentukan yang merupakan pengecualian.

```cpp
template<typename T> std::enable_if<System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek yang fungsi menghasilkan kode hashnya. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const T\& | Pembungkus [Exception](../exception/) yang berisi objek untuk menghasilkan kode hash. |

### ReturnValue

Kode hash yang dihasilkan untuk objek yang ditentukan.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


Mengembalikan kode hash untuk objek yang ditentukan yang bukan smart pointer maupun pengecualian.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&!System::IsSmartPtr<T>::value &&!System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek yang fungsi menghasilkan kode hashnya. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const T\& | Referensi const ke objek untuk menghasilkan kode hash. |

### ReturnValue

Kode hash yang dihasilkan untuk objek yang ditentukan.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
