---
title: "System::Nullable::operator= method"
linktitle: "operator="
second_title: "Aspose.Page untuk C++"
description: "System::Nullable::operator= method. Mengganti nilai yang saat ini diwakili oleh objek dengan nilai yang ditentukan dalam C++."
type: docs
weight: 1800
url: /id/cpp/system/nullable/operator=/
---
## Nullable::operator=(const Nullable\<T1\>\&) method


Mengganti nilai yang saat ini direpresentasikan oleh objek dengan nilai yang ditentukan.

```cpp
template<typename T1> Nullable<T> & System::Nullable<T>::operator=(const Nullable<T1> &x)
```


| Parameter | Deskripsi |
| --- | --- |
| The | tipe nilai baru yang akan diwakili oleh objek saat ini |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | const Nullable\<T1\>\& | Nilai baru yang akan diwakili oleh objek saat ini |

### ReturnValue

Referensi ke diri sendiri

## Lihat Juga

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator=(const T1\&) method


Mengganti nilai yang saat ini direpresentasikan oleh objek dengan nilai yang ditentukan.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value &&!std::is_null_pointer<T1>::value, Nullable<T> &>::type System::Nullable<T>::operator=(const T1 &x)
```


| Parameter | Deskripsi |
| --- | --- |
| The | tipe nilai baru yang akan diwakili oleh objek saat ini |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | const T1\& | Nilai baru yang akan diwakili oleh objek saat ini |

### ReturnValue

Referensi ke diri sendiri

## Lihat Juga

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator=(std::nullptr_t) method


Menetapkan null ke objek saat ini.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator=(std::nullptr_t)
```


### ReturnValue

Sebuah objek [Nullable](../) yang mewakili nilai null.

## Lihat Juga

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
