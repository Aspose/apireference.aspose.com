---
title: "System::Threading::Tasks::WhenAll yöntemi"
linktitle: "WhenAll"
second_title: "Aspose.Font için C++"
description: "System::Threading::Tasks::WhenAll yöntemi. Sağlanan tüm görevler tamamlandığında C++'ta tamamlanacak bir görev oluşturur."
type: docs
weight: 2400
url: /tr/cpp/system.threading.tasks/whenall/
---
## System::Threading::Tasks::WhenAll(const ArrayPtr\<RTaskPtr\<TResult\>\>\&) method


Sağlanan tüm görevler tamamlandığında tamamlanacak bir görev oluşturur.

```cpp
template<typename TResult> RTaskPtr<ArrayPtr<TResult>> System::Threading::Tasks::WhenAll(const ArrayPtr<RTaskPtr<TResult>> &tasks)
```


| Parametre | Açıklama |
| --- | --- |
| TResult | Tamamlanmış görevlerin sonuçlarının türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| görevler | const ArrayPtr\<RTaskPtr\<TResult\>\>\& | Tamamlanması için beklenen görevler. |

### ReturnValue

Tüm görevler tamamlandığında tüm sonuçların bir dizisini döndüren bir görev.

## Ayrıca Bakınız

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const ArrayPtr\<TaskPtr\>\&) method


Sağlanan tüm görevler tamamlandığında tamamlanacak bir görev oluşturur.

```cpp
TaskPtr System::Threading::Tasks::WhenAll(const ArrayPtr<TaskPtr> &tasks)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| görevler | const ArrayPtr\<TaskPtr\>\& | Tamamlanması için beklenen görevler. |

### ReturnValue

Sağlanan tüm görevlerin tamamlanmasını temsil eden bir görev.

## Ayrıca Bakınız

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\&) method


Sağlanan tüm görevler tamamlandığında tamamlanacak bir görev oluşturur.

```cpp
template<typename TResult> RTaskPtr<ArrayPtr<TResult>> System::Threading::Tasks::WhenAll(const SharedPtr<Collections::Generic::IEnumerable<RTaskPtr<TResult>>> &tasks)
```


| Parametre | Açıklama |
| --- | --- |
| TResult | Tamamlanmış görevlerin sonuçlarının türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| görevler | const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\& | Tamamlanması için beklenen görevler. |

### ReturnValue

Tüm görevler tamamlandığında tüm sonuçların bir dizisini döndüren bir görev.

## Ayrıca Bakınız

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\&) method


Sağlanan tüm görevler tamamlandığında tamamlanacak bir görev oluşturur.

```cpp
TaskPtr System::Threading::Tasks::WhenAll(const SharedPtr<Collections::Generic::IEnumerable<TaskPtr>> &tasks)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| görevler | const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\& | Tamamlanması için beklenen görevler. |

### ReturnValue

Sağlanan tüm görevlerin tamamlanmasını temsil eden bir görev.

## Ayrıca Bakınız

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
