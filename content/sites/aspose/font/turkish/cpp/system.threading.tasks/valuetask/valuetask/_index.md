---
title: "System::Threading::Tasks::ValueTask::ValueTask yapıcı"
linktitle: "ValueTask"
second_title: "Aspose.Font için C++"
description: "System::Threading::Tasks::ValueTask::ValueTask yapıcı. C++'ta boş, başlatılmamış bir ValueTask oluşturur."
type: docs
weight: 100
url: /tr/cpp/system.threading.tasks/valuetask/valuetask/
---
## ValueTask::ValueTask() constructor


Boş, başlatılmamış bir [ValueTask](../) oluşturur.

```cpp
System::Threading::Tasks::ValueTask::ValueTask()
```

## Açıklamalar



Görev tamamlanmamış ve sonuç içermez. Sonucu almaya çalışmak bir istisna fırlatır.

## Ayrıca Bakınız

* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ValueTask::ValueTask(const TaskPtr\&) constructor


Bir [Task](../../task/) ortak işaretçisinden bir [ValueTask](../) oluşturur.

```cpp
System::Threading::Tasks::ValueTask::ValueTask(const TaskPtr &task)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| görev | const TaskPtr\& | Sarılanacak görev. Boş bir görev için null olabilir. |
## Açıklamalar



[ValueTask](../) sağlanan görevin durumunu temsil edecektir.

## Ayrıca Bakınız

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
