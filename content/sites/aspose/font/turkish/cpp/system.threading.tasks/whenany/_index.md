---
title: "System::Threading::Tasks::WhenAny method"
linktitle: "WhenAny"
second_title: "Aspose.Font için C++"
description: "System::Threading::Tasks::WhenAny yöntemi. Sağlanan görevlerden herhangi biri tamamlandığında tamamlanacak bir görev oluşturur (C++)."
type: docs
weight: 2800
url: /tr/cpp/system.threading.tasks/whenany/
---
## System::Threading::Tasks::WhenAny(const ArrayPtr\<RTaskPtr\<TResult\>\>\&) method


Sağlanan görevlerden herhangi biri tamamlandığında tamamlanacak bir görev oluşturur.

```cpp
template<typename TResult> RTaskPtr<RTaskPtr<TResult>> System::Threading::Tasks::WhenAny(const ArrayPtr<RTaskPtr<TResult>> &tasks)
```


| Parametre | Açıklama |
| --- | --- |
| TResult | Tamamlanan görevin sonucunun türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| görevler | const ArrayPtr\<RTaskPtr\<TResult\>\>\& | Tamamlanması için beklenen görevler. |

### ReturnValue

Herhangi bir görev tamamlandığında ilk tamamlanan görevi döndüren bir görev.

## Ayrıca Bakınız

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const ArrayPtr\<TaskPtr\>\&) method


Sağlanan görevlerden herhangi biri tamamlandığında tamamlanacak bir görev oluşturur.

```cpp
RTaskPtr<TaskPtr> System::Threading::Tasks::WhenAny(const ArrayPtr<TaskPtr> &tasks)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| görevler | const ArrayPtr\<TaskPtr\>\& | Tamamlanması için beklenen görevler. |

### ReturnValue

Sağlanan görevlerden birinin tamamlanmasını temsil eden bir görev.

## Ayrıca Bakınız

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\&) method


Sağlanan görevlerden herhangi biri tamamlandığında tamamlanacak bir görev oluşturur.

```cpp
template<typename TResult> RTaskPtr<RTaskPtr<TResult>> System::Threading::Tasks::WhenAny(const SharedPtr<Collections::Generic::IEnumerable<RTaskPtr<TResult>>> &tasks)
```


| Parametre | Açıklama |
| --- | --- |
| TResult | Tamamlanan görevin sonucunun türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| görevler | const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\& | Tamamlanması için beklenen görevler. |

### ReturnValue

Herhangi bir görev tamamlandığında ilk tamamlanan görevi döndüren bir görev.

## Ayrıca Bakınız

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\&) method


Sağlanan görevlerden herhangi biri tamamlandığında tamamlanacak bir görev oluşturur.

```cpp
RTaskPtr<TaskPtr> System::Threading::Tasks::WhenAny(const SharedPtr<Collections::Generic::IEnumerable<TaskPtr>> &tasks)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| görevler | const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\& | Tamamlanması için beklenen görevler. |

### ReturnValue

Sağlanan görevlerden birinin tamamlanmasını temsil eden bir görev.

## Ayrıca Bakınız

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
