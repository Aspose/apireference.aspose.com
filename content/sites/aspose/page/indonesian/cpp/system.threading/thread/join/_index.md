---
title: "System::Threading::Thread::Join metode"
linktitle: "Join"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::Thread::Join metode. Menggabungkan thread yang dikelola. Melakukan penantian tak terbatas jika diperlukan dalam C++."
type: docs
weight: 1400
url: /id/cpp/system.threading/thread/join/
---
## Thread::Join() method


Menunggu thread terkelola. Melakukan penunggu tak terbatas jika diperlukan.

```cpp
void System::Threading::Thread::Join()
```

## Lihat Juga

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Thread::Join(int) method


Menunggu thread terkelola. Melakukan penunggu terbatas.

```cpp
bool System::Threading::Thread::Join(int millisecondsTimeout)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| millisecondsTimeout | int | Batas waktu menunggu dalam milidetik. |

### ReturnValue

True jika thread berhasil digabungkan, false jika batas waktu terlampaui.

## Lihat Juga

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Thread::Join(TimeSpan) method


Menunggu thread terkelola. Melakukan penunggu terbatas.

```cpp
bool System::Threading::Thread::Join(TimeSpan timeout)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| timeout | TimeSpan | Sebuah [TimeSpan](../../../system/timespan/) yang diatur ke jumlah waktu untuk menunggu thread berakhir. |

### ReturnValue

True jika thread berhasil digabungkan, false jika batas waktu terlampaui.

## Lihat Juga

* Class [TimeSpan](../../../system/timespan/)
* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
