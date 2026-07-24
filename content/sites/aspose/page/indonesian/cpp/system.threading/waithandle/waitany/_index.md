---
title: "metode System::Threading::WaitHandle::WaitAny"
linktitle: "WaitAny"
second_title: "Aspose.Page untuk C++"
description: "metode System::Threading::WaitHandle::WaitAny. Menunggu salah satu handle untuk dipicu dalam C++."
type: docs
weight: 200
url: /id/cpp/system.threading/waithandle/waitany/
---
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


Menunggu salah satu handle untuk aktif.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
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
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


Menunggu salah satu handle untuk aktif.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handle untuk ditunggu. |
| millisecondsTimeout | int | [Timeout](../../timeout/) untuk menunggu, dalam milidetik; -1 berarti menunggu tak terbatas, 0 berarti periksa-dan-kembali, nilai positif adalah batas waktu. |

### ReturnValue

True jika ada handle yang dipicu, false jika batas waktu terlampaui.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


Menunggu salah satu handle untuk aktif.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handle untuk ditunggu. |
| timeout | TimeSpan | Sebuah [System::TimeSpan](../../../system/timespan/) yang mewakili jumlah milidetik untuk menunggu, atau sebuah [System::TimeSpan](../../../system/timespan/) yang mewakili -1 milidetik untuk menunggu tanpa batas. |

### ReturnValue

True jika ada handle yang dipicu, false jika batas waktu terlampaui.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
