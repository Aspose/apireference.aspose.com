---
title: "System::Threading::WaitHandle::WaitOne metode"
linktitle: "WaitOne"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::WaitHandle::WaitOne metode. Menunggu handle untuk dipicu selama periode tak terbatas dalam C++."
type: docs
weight: 600
url: /id/cpp/system.threading/waithandle/waitone/
---
## WaitHandle::WaitOne() method


Menunggu pegangan untuk dipicu selama periode tak terbatas.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne()
```


### ReturnValue

Selalu mengembalikan true karena tidak ada batas waktu yang terjadi.

## Lihat Juga

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int) method


Menunggu pegangan untuk dipicu.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) untuk menunggu, dalam milidetik; -1 berarti menunggu tak terbatas, 0 berarti periksa-dan-kembali, nilai positif adalah batas waktu. |

### ReturnValue

Benar jika handle dipicu, salah jika batas waktu terlampaui.

## Lihat Juga

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int, bool) method


Menunggu pegangan untuk dipicu.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout, bool exitContext)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) untuk menunggu, dalam milidetik; -1 berarti menunggu tak terbatas, 0 berarti periksa-dan-kembali, nilai positif adalah batas waktu. |
| exitContext | bool | Jika true, penantian harus melepaskan kunci pada handle sebelum menunggu. |

### ReturnValue

Benar jika handle dipicu, salah jika batas waktu terlampaui.

## Lihat Juga

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(TimeSpan) method


Menunggu pegangan untuk dipicu.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(TimeSpan timeout)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| timeout | TimeSpan | Sebuah [System::TimeSpan](../../../system/timespan/) yang mewakili jumlah milidetik untuk menunggu, atau sebuah [System::TimeSpan](../../../system/timespan/) yang mewakili -1 milidetik untuk menunggu tanpa batas. |

### ReturnValue

Benar jika handle dipicu, salah jika batas waktu terlampaui.

## Lihat Juga

* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
