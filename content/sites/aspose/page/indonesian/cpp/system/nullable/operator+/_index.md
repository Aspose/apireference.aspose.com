---
title: "Metode System::Nullable::operator+"
linktitle: "operator+"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Nullable::operator+. Menjumlahkan nilai nullable dalam C++."
type: docs
weight: 1200
url: /id/cpp/system/nullable/operator+/
---
## Nullable::operator+(const Nullable\<T1\>\&) const method


Menjumlahkan nilai nullable.

```cpp
template<typename T1> System::Nullable<decltype(get_Value()+other.get_Value())> System::Nullable<T>::operator+(const Nullable<T1> &other) const
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Tipe operand kanan. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lain | const Nullable\<T1\>\& | nilai yang akan ditambahkan. |

### ReturnValue

Hasil penjumlahan.

## Lihat Juga

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+(const T1\&) const method


Menjumlahkan nilai nullable dan non-nullable.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value()+other)> System::Nullable<T>::operator+(const T1 &other) const
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Tipe operand kanan. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lain | const T1\& | nilai yang akan ditambahkan. |

### ReturnValue

Hasil penjumlahan.

## Lihat Juga

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+(std::nullptr_t) const method


Mengembalikan instance yang dibangun secara default dari kelas Nullable<T>.

```cpp
Nullable<T> System::Nullable<T>::operator+(std::nullptr_t) const
```

## Lihat Juga

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
