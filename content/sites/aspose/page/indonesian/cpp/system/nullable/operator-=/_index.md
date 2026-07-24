---
title: "System::Nullable::operator-= method"
linktitle: "operator-="
second_title: "Aspose.Page untuk C++"
description: "System::Nullable::operator-= method. Menerapkan operator-=() pada nilai yang direpresentasikan oleh objek saat ini menggunakan nilai yang direpresentasikan oleh objek Nullable yang ditentukan sebagai argumen sisi kanan dalam C++."
type: docs
weight: 1500
url: /id/cpp/system/nullable/operator-=/
---
## Nullable::operator-=(const Nullable\<T1\>\&) method


Menerapkan [operator-=()](./) pada nilai yang direpresentasikan oleh objek saat ini menggunakan nilai yang direpresentasikan oleh objek [Nullable](../) yang ditentukan sebagai argumen sisi kanan.

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator-=(const Nullable<T1> &other)
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Tipe dasar dari objek [Nullable](../) yang nilai yang direpresentasikannya digunakan sebagai argumen sisi kanan dari [operator-=()](./) |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Referensi konstan ke objek [Nullable](../) yang nilai yang direpresentasikannya digunakan sebagai argumen sisi kanan dari [operator-=()](./) yang diterapkan pada nilai yang direpresentasikan oleh objek saat ini. |

### ReturnValue

Referensi ke diri sendiri

## Lihat Juga

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-=(const T1\&) method


Menerapkan [operator-=()](./) pada nilai yang direpresentasikan oleh objek saat ini menggunakan nilai yang ditentukan sebagai argumen sisi kanan.

```cpp
template<typename T1,typename> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator-=(const T1 &other)
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Tipe nilai yang digunakan sebagai nilai sisi kanan dari [operator-=()](./) |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| other | const T1\& | Referensi konstan ke nilai yang digunakan sebagai nilai sisi kanan dari [operator-=()](./) yang diterapkan pada nilai yang direpresentasikan oleh objek saat ini. |

### ReturnValue

Referensi ke diri sendiri

## Lihat Juga

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-=(T1) method


Mengembalikan sebuah instance dari kelas [Nullable](../) yang merepresentasikan nilai null.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-=(T1)
```

## Lihat Juga

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
