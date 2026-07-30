---
title: "System::Threading::Tasks::WaitAny yöntemi"
linktitle: "WaitAny"
second_title: "Aspose.Font için C++"
description: "System::Threading::Tasks::WaitAny yöntemi. Sağlanan Task nesnelerinden herhangi birinin C++'ta yürütmeyi tamamlamasını bekler."
type: docs
weight: 2200
url: /tr/cpp/system.threading.tasks/waitany/
---
## System::Threading::Tasks::WaitAny(const ArrayPtr\<TaskPtr\>\&) method


Sağlanan [Task](../task/) nesnelerinden herhangi birinin yürütmeyi tamamlamasını bekler.

```cpp
int32_t System::Threading::Tasks::WaitAny(const ArrayPtr<TaskPtr> &tasks)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | Beklenecek [Task](../task/) örneklerinden oluşan bir dizi. |

### ReturnValue

Görevler dizisinde tamamlanan görevin indeksi.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WaitAny(const ArrayPtr\<TaskPtr\>\&, const CancellationToken\&) method


Sağlanan [Task](../task/) nesnelerinden herhangi birinin yürütmeyi tamamlamasını bekler.

```cpp
int32_t System::Threading::Tasks::WaitAny(const ArrayPtr<TaskPtr> &tasks, const CancellationToken &cancellationToken)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | Beklenecek [Task](../task/) örneklerinden oluşan bir dizi. |
| cancellationToken | const CancellationToken\& | Görevlerin tamamlanmasını beklerken gözlemlenecek bir [CancellationToken](../../system.threading/cancellationtoken/). |

### ReturnValue

Görevler dizisinde tamamlanan görevin indeksi.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
