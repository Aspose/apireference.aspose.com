---
title: "System::Threading::WaitHandle::WaitAll metode"
linktitle: "WaitAll"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::WaitHandle::WaitAll metode. Menunggu semua handle untuk dipicu dalam C++."
type: docs
weight: 100
url: /id/cpp/system.threading/waithandle/waitall/
---
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


Menunggu semua handle untuk aktif.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handle untuk ditunggu. |

### ReturnValue

Benar ketika setiap elemen dalam waitHandles telah menerima sinyal; jika tidak, metode tidak pernah kembali.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


Informasi RTTI.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handle untuk ditunggu. |
| millisecondsTimeout | int | [Timeout](../../timeout/) untuk menunggu, dalam milidetik; -1 berarti menunggu tak terbatas, 0 berarti periksa-dan-kembali, nilai positif adalah batas waktu. |

### ReturnValue

Benar jika semua handle dipicu, salah jika batas waktu terlampaui.
## Catatan


Menunggu semua handle untuk aktif.
## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


Menunggu semua handle untuk aktif.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handle untuk ditunggu. |
| timeout | TimeSpan | Sebuah [System::TimeSpan](../../../system/timespan/) yang mewakili jumlah milidetik untuk menunggu, atau sebuah [System::TimeSpan](../../../system/timespan/) yang mewakili -1 milidetik untuk menunggu tanpa batas. |

### ReturnValue

Benar jika semua handle dipicu, salah jika batas waktu terlampaui.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
