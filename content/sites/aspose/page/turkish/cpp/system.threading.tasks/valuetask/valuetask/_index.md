---
title: "System::Threading::Tasks::ValueTask::ValueTask yapıcı"
linktitle: "ValueTask"
second_title: "Aspose.Page için C++"
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



Görev tamamlanmadı ve sonuç içermiyor. Sonucu almaya çalışmak bir istisna fırlatır.

## Ayrıca Bakınız

* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ValueTask::ValueTask(const TaskPtr\&) constructor


Bir [Task](../../task/) paylaşımlı işaretçisinden bir [ValueTask](../) oluşturur.

```cpp
System::Threading::Tasks::ValueTask::ValueTask(const TaskPtr &task)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| görev | const TaskPtr\& | Sarılanacak görev. Boş bir görev için null olabilir. |
## Açıklamalar



Bu [ValueTask](../) sağlanan görevin durumunu temsil eder.

## Ayrıca Bakınız

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
