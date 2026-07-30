---
title: "Metodo System::Threading::Tasks::WhenAll"
linktitle: "WhenAll"
second_title: "Aspose.Font per C++"
description: "Metodo System::Threading::Tasks::WhenAll. Crea un task che verrà completato quando tutti i task forniti saranno completati in C++."
type: docs
weight: 2400
url: /it/cpp/system.threading.tasks/whenall/
---
## System::Threading::Tasks::WhenAll(const ArrayPtr\<RTaskPtr\<TResult\>\>\&) method


Crea un task che verrà completato quando tutti i task forniti saranno completati.

```cpp
template<typename TResult> RTaskPtr<ArrayPtr<TResult>> System::Threading::Tasks::WhenAll(const ArrayPtr<RTaskPtr<TResult>> &tasks)
```


| Parametro | Descrizione |
| --- | --- |
| TResult | Il tipo dei risultati dei task completati. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| task | const ArrayPtr\<RTaskPtr\<TResult\>\>\& | I task su cui attendere per il completamento. |

### ReturnValue

Un task che restituisce un array di tutti i risultati quando tutti i task sono completati.

## Vedi anche

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const ArrayPtr\<TaskPtr\>\&) method


Crea un task che verrà completato quando tutti i task forniti saranno completati.

```cpp
TaskPtr System::Threading::Tasks::WhenAll(const ArrayPtr<TaskPtr> &tasks)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| task | const ArrayPtr\<TaskPtr\>\& | I task su cui attendere per il completamento. |

### ReturnValue

Un task che rappresenta il completamento di tutti i task forniti.

## Vedi anche

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\&) method


Crea un task che verrà completato quando tutti i task forniti saranno completati.

```cpp
template<typename TResult> RTaskPtr<ArrayPtr<TResult>> System::Threading::Tasks::WhenAll(const SharedPtr<Collections::Generic::IEnumerable<RTaskPtr<TResult>>> &tasks)
```


| Parametro | Descrizione |
| --- | --- |
| TResult | Il tipo dei risultati dei task completati. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| task | const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\& | I task su cui attendere per il completamento. |

### ReturnValue

Un task che restituisce un array di tutti i risultati quando tutti i task sono completati.

## Vedi anche

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\&) method


Crea un task che verrà completato quando tutti i task forniti saranno completati.

```cpp
TaskPtr System::Threading::Tasks::WhenAll(const SharedPtr<Collections::Generic::IEnumerable<TaskPtr>> &tasks)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| task | const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\& | I task su cui attendere per il completamento. |

### ReturnValue

Un task che rappresenta il completamento di tutti i task forniti.

## Vedi anche

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
