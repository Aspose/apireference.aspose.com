---
title: "System::Threading::Mutex::WaitOne metode"
linktitle: "WaitOne"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::Mutex::WaitOne metode. Mengunci mutex. Melakukan penantian tak terbatas jika diperlukan dalam C++."
type: docs
weight: 500
url: /id/cpp/system.threading/mutex/waitone/
---
## Mutex::WaitOne() method


Mengunci mutex. Melakukan penunggu tak terbatas jika diperlukan.

```cpp
virtual bool System::Threading::Mutex::WaitOne() override
```


### ReturnValue

Selalu mengembalikan true karena tidak mengembalikan hingga mutex terkunci.

## Lihat Juga

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(int) method


Mengunci mutex. Melakukan penunggu jika diperlukan.

```cpp
virtual bool System::Threading::Mutex::WaitOne(int millisecondsTimeout) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| millisecondsTimeout | int | Batas waktu menunggu dalam milidetik. |

### ReturnValue

Mengembalikan true jika mutex terkunci atau false jika batas waktu terlampaui.

## Lihat Juga

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(TimeSpan) method


Mengunci mutex. Melakukan penunggu jika diperlukan.

```cpp
virtual bool System::Threading::Mutex::WaitOne(TimeSpan timeout) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| timeout | TimeSpan | Sebuah [System::TimeSpan](../../../system/timespan/) yang mewakili jumlah milidetik untuk menunggu, atau sebuah [System::TimeSpan](../../../system/timespan/) yang mewakili -1 milidetik untuk menunggu tanpa batas. |

### ReturnValue

Mengembalikan true jika mutex terkunci atau false jika batas waktu terlampaui.

## Lihat Juga

* Class [TimeSpan](../../../system/timespan/)
* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
