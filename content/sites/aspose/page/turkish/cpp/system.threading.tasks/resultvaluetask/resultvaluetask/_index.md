---
title: "System::Threading::Tasks::ResultValueTask::ResultValueTask yapıcı"
linktitle: "ResultValueTask"
second_title: "Aspose.Page için C++"
description: "System::Threading::Tasks::ResultValueTask::ResultValueTask yapıcı. C++'ta boş ve başlatılmamış bir ResultValueTask oluşturur."
type: docs
weight: 100
url: /tr/cpp/system.threading.tasks/resultvaluetask/resultvaluetask/
---
## ResultValueTask::ResultValueTask() constructor


Boş ve başlatılmamış bir [ResultValueTask](../) oluşturur.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask()
```

## Açıklamalar



Görev tamamlanmadı ve sonuç içermiyor. Sonucu almaya çalışmak bir istisna fırlatır.

## Ayrıca Bakınız

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ResultValueTask::ResultValueTask(const RTaskPtr\<T\>\&) constructor


Bir [ResultTask<T>](../../resulttask/) ortak işaretçisinden bir [ResultValueTask](../) oluşturur.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const RTaskPtr<T> &task)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| görev | const RTaskPtr\<T\>\& | Sarılanacak görev. Boş bir görev için null olabilir. |
## Açıklamalar



Bu [ResultValueTask](../) sağlanan görevin durumunu ve sonucunu temsil edecektir.

## Ayrıca Bakınız

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ResultValueTask::ResultValueTask(const T\&) constructor


Belirtilen sonuçla tamamlanmış bir [ResultValueTask](../) oluşturur.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const T &result)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| sonuç | const T\& | Tamamlanmış bir görevde sarılacak sonuç değeri. |
## Açıklamalar



Bu, değeri hemen döndüren başarılı bir şekilde tamamlanmış bir görev oluşturur.

## Ayrıca Bakınız

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
