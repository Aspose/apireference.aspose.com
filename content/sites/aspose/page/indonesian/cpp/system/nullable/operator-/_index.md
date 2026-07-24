---
title: "Metode System::Nullable::operator-"
linktitle: "operator-"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Nullable::operator-. Mengurangi nilai nullable dalam C++."
type: docs
weight: 1400
url: /id/cpp/system/nullable/operator-/
---
## Nullable::operator-(const Nullable\<T1\>\&) const method


Mengurangkan nilai nullable.

```cpp
template<typename T1> System::Nullable<decltype(get_Value() - other.get_Value())> System::Nullable<T>::operator-(const Nullable<T1> &other) const
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Tipe operand kanan. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lain | const Nullable\<T1\>\& | nilai yang akan dikurangkan. |

### ReturnValue

Hasil pengurangan.

## Lihat Juga

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-(const T1\&) const method


Mengurangkan nilai nullable dan non-nullable.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value() - other)> System::Nullable<T>::operator-(const T1 &other) const
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Tipe operand kanan. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lain | const T1\& | nilai yang akan dikurangkan. |

### ReturnValue

Hasil pengurangan.

## Lihat Juga

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-(T1) const method


Mengurangkan nilai nullable dan nilai yang menunjuk ke null.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-(T1) const
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Tipe operand kanan, harus berupa nullptr_t. |

### ReturnValue

Objek [Nullable](../) kosong.

## Lihat Juga

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
