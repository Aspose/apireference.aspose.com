---
title: "Metode System::Threading::Semaphore::WaitOne"
linktitle: "WaitOne"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Threading::Semaphore::WaitOne. Mengunci semaphore. Melakukan penunggu tak terbatas jika diperlukan di C++."
type: docs
weight: 500
url: /id/cpp/system.threading/semaphore/waitone/
---
## Semaphore::WaitOne() method


Mengunci semaphore. Melakukan penunggu tak terbatas jika diperlukan.

```cpp
virtual bool System::Threading::Semaphore::WaitOne() override
```


### ReturnValue

Selalu mengembalikan true karena tidak kembali sampai semaphore terkunci.

## Lihat Juga

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Semaphore::WaitOne(int) method


Mengunci semaphore. Melakukan penunggu jika diperlukan.

```cpp
virtual bool System::Threading::Semaphore::WaitOne(int millisecondsTimeout) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| millisecondsTimeout | int | Batas waktu menunggu dalam milidetik. |

### ReturnValue

Mengembalikan true jika semaphore terkunci atau false jika batas waktu terlampaui.

## Lihat Juga

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
