---
title: "System::Threading::Tasks::Task::Task yapıcı"
linktitle: "Task"
second_title: "Aspose.Font için C++"
description: "System::Threading::Tasks::Task::Task yapıcı. C++'ta başlatılmamış görevler oluşturmak için dahili yapıcı."
type: docs
weight: 100
url: /tr/cpp/system.threading.tasks/task/task/
---
## Task::Task() constructor


Başlatılmamış görevler oluşturmak için iç yapıcı.

```cpp
System::Threading::Tasks::Task::Task()
```

## Ayrıca Bakınız

* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) constructor


Durumlu bir eylem ve durum nesnesi ile bir [Task](../) oluşturur.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | Yürütülecek eylem (durum nesnesini kabul eder) |
| durum | const SharedPtr\<Object\>\& | Eyleme geçirilen kullanıcı tanımlı durum nesnesi |

## Ayrıca Bakınız

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) constructor


Durumlu eylem, durum ve iptal belirteci ile bir [Task](../) oluşturur.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state, const CancellationToken &cancellationToken)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | Yürütülecek eylem (durum nesnesini kabul eder) |
| durum | const SharedPtr\<Object\>\& | Eyleme geçirilen kullanıcı tanımlı durum nesnesi |
| cancellationToken | const CancellationToken\& | İptal isteklerini izlemek için belirteç |

## Ayrıca Bakınız

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action<>\&) constructor


Yürütülecek bir eylem ile bir [Task](../) oluşturur.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| action | const Action<>\& | Asenkron olarak yürütülecek eylem |

## Ayrıca Bakınız

* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action<>\&, const CancellationToken\&) constructor


Bir eylem ve iptal belirteci ile bir [Task](../) oluşturur.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action, const CancellationToken &cancellationToken)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| action | const Action<>\& | Asenkron olarak yürütülecek eylem |
| cancellationToken | const CancellationToken\& | İptal isteklerini izlemek için belirteç |

## Ayrıca Bakınız

* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
