---
title: "System::Threading::ThreadPool::QueueUserWorkItem yöntemi"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Font için C++"
description: "System::Threading::ThreadPool::QueueUserWorkItem yöntemi. C++'da parametresiz bir geri çağırma ile mevcut olan iş öğesini kuyruğa ekler."
type: docs
weight: 600
url: /tr/cpp/system.threading/threadpool/queueuserworkitem/
---
## ThreadPool::QueueUserWorkItem(WaitCallback) method


Parametresiz geri arama ile mevcut olan iş öğesini kuyruğa ekler.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| geri arama | WaitCallback | İş olarak kullanılacak geri çağırma fonksiyonu. |

### ReturnValue

Her zaman true döndürür.

## Ayrıca Bakınız

* Typedef [WaitCallback](../../waitcallback/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## ThreadPool::QueueUserWorkItem(WaitCallback, const System::SharedPtr\<System::Object\>\&) method


Parametresiz geri arama ile mevcut olan iş öğesini kuyruğa ekler.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| geri arama | WaitCallback | İş olarak kullanılacak geri çağırma fonksiyonu. |
| durum | const System::SharedPtr\<System::Object\>\& | İş fonksiyonu parametresi. |

### ReturnValue

Her zaman true döndürür.

## Ayrıca Bakınız

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
