---
title: "Metodo System::Threading::Tasks::WhenAny"
linktitle: "WhenAny"
second_title: "Aspose.Font per C++"
description: "Metodo System::Threading::Tasks::WhenAny. Crea un'attività che si completerà quando una qualsiasi delle attività fornite sarà completata in C++."
type: docs
weight: 2800
url: /it/cpp/system.threading.tasks/whenany/
---
## System::Threading::Tasks::WhenAny(const ArrayPtr\<RTaskPtr\<TResult\>\>\&) method


Crea un'attività che si completerà quando una qualsiasi delle attività fornite sarà completata.

```cpp
template<typename TResult> RTaskPtr<RTaskPtr<TResult>> System::Threading::Tasks::WhenAny(const ArrayPtr<RTaskPtr<TResult>> &tasks)
```


| Parametro | Descrizione |
| --- | --- |
| TResult | Il tipo del risultato dell'attività completata. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| task | const ArrayPtr\<RTaskPtr\<TResult\>\>\& | I task su cui attendere per il completamento. |

### ReturnValue

Un'attività che restituisce la prima attività completata quando qualsiasi attività si completa.

## Vedi anche

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const ArrayPtr\<TaskPtr\>\&) method


Crea un'attività che si completerà quando una qualsiasi delle attività fornite sarà completata.

```cpp
RTaskPtr<TaskPtr> System::Threading::Tasks::WhenAny(const ArrayPtr<TaskPtr> &tasks)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| task | const ArrayPtr\<TaskPtr\>\& | I task su cui attendere per il completamento. |

### ReturnValue

Un'attività che rappresenta il completamento di una delle attività fornite.

## Vedi anche

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\&) method


Crea un'attività che si completerà quando una qualsiasi delle attività fornite sarà completata.

```cpp
template<typename TResult> RTaskPtr<RTaskPtr<TResult>> System::Threading::Tasks::WhenAny(const SharedPtr<Collections::Generic::IEnumerable<RTaskPtr<TResult>>> &tasks)
```


| Parametro | Descrizione |
| --- | --- |
| TResult | Il tipo del risultato dell'attività completata. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| task | const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\& | I task su cui attendere per il completamento. |

### ReturnValue

Un'attività che restituisce la prima attività completata quando qualsiasi attività si completa.

## Vedi anche

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\&) method


Crea un'attività che si completerà quando una qualsiasi delle attività fornite sarà completata.

```cpp
RTaskPtr<TaskPtr> System::Threading::Tasks::WhenAny(const SharedPtr<Collections::Generic::IEnumerable<TaskPtr>> &tasks)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| task | const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\& | I task su cui attendere per il completamento. |

### ReturnValue

Un'attività che rappresenta il completamento di una delle attività fornite.

## Vedi anche

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
