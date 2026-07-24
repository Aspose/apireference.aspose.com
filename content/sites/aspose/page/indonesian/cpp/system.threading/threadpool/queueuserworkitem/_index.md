---
title: "Metode System::Threading::ThreadPool::QueueUserWorkItem"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Threading::ThreadPool::QueueUserWorkItem. Menempatkan item kerja ke dalam antrian yang hadir dengan callback tanpa parameter dalam C++."
type: docs
weight: 600
url: /id/cpp/system.threading/threadpool/queueuserworkitem/
---
## ThreadPool::QueueUserWorkItem(WaitCallback) method


Menempatkan item kerja ke dalam antrean yang hadir dengan callback tanpa parameter.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| callback | WaitCallback | Fungsi callback yang akan digunakan sebagai pekerjaan. |

### ReturnValue

Selalu mengembalikan true.

## Lihat Juga

* Typedef [WaitCallback](../../waitcallback/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## ThreadPool::QueueUserWorkItem(WaitCallback, const System::SharedPtr\<System::Object\>\&) method


Menempatkan item kerja ke dalam antrean yang hadir dengan callback tanpa parameter.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| callback | WaitCallback | Fungsi callback yang akan digunakan sebagai pekerjaan. |
| state | const System::SharedPtr\<System::Object\>\& | Parameter fungsi pekerjaan. |

### ReturnValue

Selalu mengembalikan true.

## Lihat Juga

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
