---
title: "System::Threading::Tasks::TaskScheduler sınıfı"
linktitle: "TaskScheduler"
second_title: "Aspose.Page için C++"
description: "System::Threading::Tasks::TaskScheduler sınıfı. C++'ta görevleri iş parçacıklarına kuyruğa ekleme işleminin düşük seviyeli işini yöneten bir nesneyi temsil eder."
type: docs
weight: 400
url: /tr/cpp/system.threading.tasks/taskscheduler/
---
## TaskScheduler class


Görevleri iş parçacıklarına kuyruğa ekleme düşük seviyeli işini yöneten bir nesneyi temsil eder.

```cpp
class TaskScheduler : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [FromCurrentSynchronizationContext](./fromcurrentsynchronizationcontext/)() | Mevcut iş parçacığıyla ilişkili bir [TaskScheduler](./) oluşturur. |
| static [get_Current](./get_current/)() | Şu anda çalışan görevle ilişkili [TaskScheduler](./) öğesini alır. |
| static [get_Default](./get_default/)() | Çerçeve tarafından sağlanan varsayılan [TaskScheduler](./) örneğini alır. |
| [get_Id](./get_id/)() const | Bu [TaskScheduler](./) için benzersiz kimliği alır. |
| virtual [get_MaximumConcurrencyLevel](./get_maximumconcurrencylevel/)() const | Bu [TaskScheduler](./) tarafından desteklenebilecek maksimum eşzamanlılık seviyesini gösterir. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
