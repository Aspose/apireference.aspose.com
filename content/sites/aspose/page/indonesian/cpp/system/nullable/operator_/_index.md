---
title: "System::Nullable::operator< method"
linktitle: "operator<"
second_title: "Aspose.Page untuk C++"
description: "System::Nullable::operator< method. Menentukan apakah nilai yang direpresentasikan oleh objek saat ini lebih kecil daripada nilai yang direpresentasikan oleh objek Nullable yang ditentukan dengan menerapkan operator<() pada nilai-nilai ini dalam C++."
type: docs
weight: 1600
url: /id/cpp/system/nullable/operator_/
---
## Nullable::operator<(const Nullable\<T1\>\&) const method


Menentukan apakah nilai yang direpresentasikan oleh objek saat ini lebih kecil daripada nilai yang direpresentasikan oleh objek [Nullable](../) yang ditentukan dengan menerapkan [operator<()](./) pada nilai-nilai ini.

```cpp
template<typename T1> bool System::Nullable<T>::operator<(const Nullable<T1> &other) const
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Tipe dasar dari objek [Nullable](../) untuk dibandingkan dengan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Referensi konstan ke objek [Nullable](../) untuk dibandingkan dengan |

### ReturnValue

True jika nilai yang direpresentasikan oleh objek saat ini lebih kecil daripada nilai yang direpresentasikan oleh objek [Nullable](../) yang ditentukan, jika tidak - false

## Lihat Juga

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<(const T1\&) const method


Menentukan apakah nilai yang direpresentasikan oleh objek saat ini lebih kecil daripada nilai yang ditentukan dengan menerapkan [operator<()](./) pada nilai-nilai ini.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<(const T1 &other) const
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Tipe nilai untuk dibandingkan dengan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lain | const T1\& | Referensi konstan ke nilai untuk dibandingkan dengan |

### ReturnValue

True jika nilai yang direpresentasikan oleh objek saat ini lebih kecil daripada nilai yang ditentukan, jika tidak - false

## Lihat Juga

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<(std::nullptr_t) const method


Selalu mengembalikan false.

```cpp
bool System::Nullable<T>::operator<(std::nullptr_t) const
```

## Lihat Juga

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
judul: System::Nullable::operator> method
judul tautan: operator>
judul_kedua: Aspose.Page for C++
deskripsi: 'System::Nullable::operator> method. Menentukan apakah nilai yang direpresentasikan oleh objek saat ini lebih besar daripada nilai yang direpresentasikan oleh objek Nullable yang ditentukan dengan menerapkan operator>() pada nilai-nilai ini dalam C++.'
tipe: docs
bobot: 2000
url: /cpp/system/nullable/operator_/
---
## Nullable::operator>(const Nullable\<T1\>\&) const method


Menentukan apakah nilai yang direpresentasikan oleh objek saat ini lebih besar daripada nilai yang direpresentasikan oleh objek [Nullable](../) yang ditentukan dengan menerapkan [operator>()](./) pada nilai-nilai ini.

```cpp
template<typename T1> bool System::Nullable<T>::operator>(const Nullable<T1> &other) const
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Tipe dasar dari objek [Nullable](../) untuk dibandingkan dengan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Referensi konstan ke objek [Nullable](../) untuk dibandingkan dengan |

### ReturnValue

True jika nilai yang direpresentasikan oleh objek saat ini lebih besar daripada nilai yang direpresentasikan oleh objek [Nullable](../) yang ditentukan, jika tidak - false

## Lihat Juga

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>(const T1\&) const method


Menentukan apakah nilai yang direpresentasikan oleh objek saat ini lebih besar daripada nilai yang ditentukan dengan menerapkan [operator>()](./) pada nilai-nilai ini.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>(const T1 &other) const
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Tipe nilai untuk dibandingkan dengan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lain | const T1\& | Referensi konstan ke nilai untuk dibandingkan dengan |

### ReturnValue

Benar jika nilai yang direpresentasikan oleh objek saat ini lebih besar daripada nilai yang ditentukan, jika tidak - salah

## Lihat Juga

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>(std::nullptr_t) const method


Selalu mengembalikan false.

```cpp
bool System::Nullable<T>::operator>(std::nullptr_t) const
```

## Lihat Juga

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
