---
title: "System::Threading::Tasks::ResultValueTask::ResultValueTask yapıcı"
linktitle: "ResultValueTask"
second_title: "Aspose.Font için C++"
description: "System::Threading::Tasks::ResultValueTask::ResultValueTask yapıcı. Boş, başlatılmamış bir ResultValueTask oluşturur C++'da."
type: docs
weight: 100
url: /tr/cpp/system.threading.tasks/resultvaluetask/resultvaluetask/
---
## ResultValueTask::ResultValueTask() constructor


Boş, başlatılmamış bir [ResultValueTask](../) oluşturur.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask()
```

## Açıklamalar



Görev tamamlanmamış ve sonuç içermez. Sonucu almaya çalışmak bir istisna fırlatır.

## Ayrıca Bakınız

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultValueTask::ResultValueTask(const RTaskPtr\<T\>\&) constructor


Bir [ResultTask<T>](../../resulttask/) ortak işaretçisinden bir [ResultValueTask](../) oluşturur.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const RTaskPtr<T> &task)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| görev | const RTaskPtr\<T\>\& | Sarılanacak görev. Boş bir görev için null olabilir. |
## Açıklamalar



[ResultValueTask](../), sağlanan görevin durumunu ve sonucunu temsil edecektir.

## Ayrıca Bakınız

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultValueTask::ResultValueTask(const T\&) constructor


Belirtilen sonuçla tamamlanmış bir [ResultValueTask](../) oluşturur.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const T &result)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| result | const T\& | Tamamlanmış bir görevde sarılacak sonuç değeri. |
## Açıklamalar



Bu, değeri hemen döndüren başarılı bir şekilde tamamlanmış bir görev oluşturur.

## Ayrıca Bakınız

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
