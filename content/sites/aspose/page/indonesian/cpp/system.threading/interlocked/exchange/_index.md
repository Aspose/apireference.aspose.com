---
title: "System::Threading::Interlocked::Exchange method"
linktitle: "Tukar"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::Interlocked::Exchange method. Menukar nilai pada variabel: menyimpan nilai baru dan mengembalikan nilai yang dimiliki variabel tepat sebelum penyimpanan dalam C++."
type: docs
weight: 400
url: /id/cpp/system.threading/interlocked/exchange/
---
## Interlocked::Exchange(T\&, T) method


Menukar nilai pada variabel: menyimpan nilai baru dan mengembalikan nilai yang dimiliki variabel tepat sebelum penyimpanan.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe variabel. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| location1 | T\\& | Referensi variabel untuk diubah. |
| value | T | Nilai untuk disimpan. |

### ReturnValue

Nilai variabel tepat sebelum diubah.

## Lihat Juga

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::Exchange(T\&, T) method


Menukar nilai pada variabel: menyimpan nilai baru dan mengembalikan nilai yang dimiliki variabel tepat sebelum penyimpanan. Tidak diimplementasikan.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe variabel. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| location1 | T\\& | Referensi variabel untuk diubah. |
| value | T | Nilai untuk disimpan. |

### ReturnValue

Nilai variabel tepat sebelum diubah.

## Lihat Juga

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
