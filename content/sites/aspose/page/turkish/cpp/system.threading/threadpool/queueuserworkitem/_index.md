---
title: "System::Threading::ThreadPool::QueueUserWorkItem yöntemi"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Page için C++"
description: "System::Threading::ThreadPool::QueueUserWorkItem yöntemi. C++'ta parametresiz bir geri arama ile mevcut olan iş öğesini kuyruğa ekler."
type: docs
weight: 600
url: /tr/cpp/system.threading/threadpool/queueuserworkitem/
---
## ThreadPool::QueueUserWorkItem(WaitCallback) method


Parametresiz geri çağırma ile mevcut olan iş öğesini kuyruğa ekler.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| geri çağırma | WaitCallback | İş olarak kullanılacak geri arama işlevi. |

### ReturnValue

Her zaman true döndürür.

## Ayrıca Bakınız

* Typedef [WaitCallback](../../waitcallback/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## ThreadPool::QueueUserWorkItem(WaitCallback, const System::SharedPtr\<System::Object\>\&) method


Parametresiz geri çağırma ile mevcut olan iş öğesini kuyruğa ekler.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| geri çağırma | WaitCallback | İş olarak kullanılacak geri arama işlevi. |
| durum | const System::SharedPtr\<System::Object\>\& | İş işlevi parametresi. |

### ReturnValue

Her zaman true döndürür.

## Ayrıca Bakınız

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
