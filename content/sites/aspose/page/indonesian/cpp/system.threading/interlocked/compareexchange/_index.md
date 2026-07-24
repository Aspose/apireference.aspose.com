---
title: "System::Threading::Interlocked::CompareExchange method"
linktitle: "CompareExchange"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::Interlocked::CompareExchange method. Membandingkan dan menukar nilai pada variabel: memeriksa apakah variabel sama dengan nilai tertentu dan menyimpan nilai baru hanya jika nilai yang disimpan cocok dengan yang diharapkan dalam C++."
type: docs
weight: 200
url: /id/cpp/system.threading/interlocked/compareexchange/
---
## Interlocked::CompareExchange(int32_t\&, int32_t, int32_t, bool\&) method


Membandingkan dan menukar nilai pada variabel: memeriksa apakah variabel sama dengan nilai tertentu dan menyimpan nilai baru hanya jika nilai yang disimpan cocok dengan yang diharapkan.

```cpp
static int32_t System::Threading::Interlocked::CompareExchange(int32_t &location1, int32_t value, int32_t comparand, bool &succeeded)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| location1 | int32_t\& | Referensi variabel untuk diubah. |
| value | int32_t | Nilai untuk disimpan. |
| comparand | int32_t | Nilai untuk membandingkan nilai variabel sebelum menukar. |
| berhasil | bool\& | Referensi ke variabel yang diatur menjadi true jika pertukaran terjadi dan false sebaliknya. |

### ReturnValue

Nilai variabel pada awal operasi terlepas apakah telah diubah atau tidak.

## Lihat Juga

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Membandingkan dan menukar nilai pada variabel: memeriksa apakah variabel sama dengan nilai tertentu dan menyimpan nilai baru hanya jika nilai yang disimpan cocok dengan yang diharapkan.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe variabel. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| location1 | T\\& | Referensi variabel untuk diubah. |
| value | T | Nilai untuk disimpan. |
| comparand | T | Nilai untuk membandingkan nilai variabel sebelum menukar. |

### ReturnValue

Nilai variabel pada awal operasi terlepas apakah telah diubah atau tidak.

## Lihat Juga

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Membandingkan dan menukar nilai pada variabel: memeriksa apakah variabel sama dengan nilai tertentu dan menyimpan nilai baru hanya jika nilai yang disimpan cocok dengan yang diharapkan. Tidak diimplementasikan.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe variabel. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| location1 | T\\& | Referensi variabel untuk diubah. |
| value | T | Nilai untuk disimpan. |
| comparand | T | Nilai untuk membandingkan nilai variabel sebelum menukar. |

### ReturnValue

Nilai variabel pada awal operasi terlepas apakah telah diubah atau tidak.

## Lihat Juga

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
