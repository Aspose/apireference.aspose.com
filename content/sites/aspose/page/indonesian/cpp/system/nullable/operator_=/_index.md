---
title: "System::Nullable::operator<= method"
linktitle: "operator<="
second_title: "Aspose.Page untuk C++"
description: "System::Nullable::operator<= method. Menentukan apakah nilai yang diwakili oleh objek saat ini kurang atau sama dengan nilai yang diwakili oleh objek Nullable yang ditentukan dengan menerapkan operator<=() pada nilai-nilai ini dalam C++."
type: docs
weight: 1700
url: /id/cpp/system/nullable/operator_=/
---
## Nullable::operator<=(const Nullable\<T1\>\&) const method


Menentukan apakah nilai yang diwakili oleh objek saat ini kurang atau sama dengan nilai yang diwakili oleh objek [Nullable](../) yang ditentukan dengan menerapkan [operator<=()](./) pada nilai-nilai ini.

```cpp
template<typename T1> bool System::Nullable<T>::operator<=(const Nullable<T1> &other) const
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Tipe dasar dari objek [Nullable](../) untuk dibandingkan dengan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Referensi konstan ke objek [Nullable](../) untuk dibandingkan dengan |

### ReturnValue

Benar jika nilai yang diwakili oleh objek saat ini kurang atau sama dengan nilai yang diwakili oleh objek [Nullable](../) yang ditentukan, jika tidak - salah

## Lihat Juga

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<=(const T1\&) const method


Menentukan apakah nilai yang diwakili oleh objek saat ini kurang atau sama dengan nilai yang ditentukan dengan menerapkan [operator<=()](./) pada nilai-nilai ini.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<=(const T1 &other) const
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Tipe nilai untuk dibandingkan dengan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lain | const T1\& | Referensi konstan ke nilai untuk dibandingkan dengan |

### ReturnValue

Benar jika nilai yang diwakili oleh objek saat ini kurang atau sama dengan nilai yang ditentukan, jika tidak - salah

## Lihat Juga

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<=(std::nullptr_t) const method


Selalu mengembalikan false.

```cpp
bool System::Nullable<T>::operator<=(std::nullptr_t) const
```

## Lihat Juga

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
judul: System::Nullable::operator>= method
judultautan: operator>=
judul_kedua: Aspose.Page for C++
deskripsi: 'System::Nullable::operator>= method. Menentukan apakah nilai yang diwakili oleh objek saat ini lebih besar atau sama dengan nilai yang diwakili oleh objek Nullable yang ditentukan dengan menerapkan operator>=() pada nilai-nilai ini dalam C++.'
tipe: docs
bobot: 2100
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator>=(const Nullable\<T1\>\&) const method


Menentukan apakah nilai yang direpresentasikan oleh objek saat ini lebih besar atau sama dengan nilai yang direpresentasikan oleh objek [Nullable](../) yang ditentukan dengan menerapkan [operator>=()](./) pada nilai-nilai ini.

```cpp
template<typename T1> bool System::Nullable<T>::operator>=(const Nullable<T1> &other) const
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Tipe dasar dari objek [Nullable](../) untuk dibandingkan dengan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Referensi konstan ke objek [Nullable](../) untuk dibandingkan dengan |

### ReturnValue

Benar jika nilai yang direpresentasikan oleh objek saat ini lebih besar atau sama dengan nilai yang direpresentasikan oleh objek [Nullable](../) yang ditentukan, jika tidak - salah

## Lihat Juga

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>=(const T1\&) const method


Menentukan apakah nilai yang direpresentasikan oleh objek saat ini lebih besar atau sama dengan nilai yang direpresentasikan oleh objek yang ditentukan dengan menerapkan [operator>=()](./) pada nilai-nilai ini.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>=(const T1 &other) const
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Tipe dasar dari nilai untuk membandingkan nilai yang direpresentasikan oleh objek saat ini dengan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lain | const T1\& | Referensi konstan ke sebuah objek untuk membandingkan objek saat ini dengan |

### ReturnValue

Benar jika nilai yang direpresentasikan oleh objek saat ini lebih besar atau sama dengan nilai yang direpresentasikan oleh objek yang ditentukan, jika tidak - salah

## Lihat Juga

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>=(std::nullptr_t) const method


Selalu mengembalikan false.

```cpp
bool System::Nullable<T>::operator>=(std::nullptr_t) const
```


### ReturnValue

Selalu - salah

## Lihat Juga

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
judul: System::Nullable::operator|= method
judul tautan: operator|=
judul_kedua: Aspose.Page for C++
deskripsi: 'System::Nullable::operator|= method. Menerapkan operator|=() pada nilai yang direpresentasikan oleh objek saat ini menggunakan nilai yang ditentukan sebagai argumen sisi kanan dalam C++.'
tipe: docs
bobot: 2200
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator|= method


Menerapkan [operator|=()](./) pada nilai yang direpresentasikan oleh objek saat ini menggunakan nilai yang ditentukan sebagai argumen sisi kanan.

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator|=(bool other)
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Parameter templat untuk membuat SFINAE berfungsi. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lain | bool | Nilai boolean yang digunakan sebagai nilai sisi kanan dari [operator | =()](./) diterapkan pada nilai yang direpresentasikan oleh objek saat ini. |

### ReturnValue

Referensi ke diri sendiri.

## Lihat Juga

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
