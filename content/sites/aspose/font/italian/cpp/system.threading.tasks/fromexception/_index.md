---
title: "Metodo System::Threading::Tasks::FromException"
linktitle: "FromException"
second_title: "Aspose.Font per C++"
description: "Metodo System::Threading::Tasks::FromException. Crea un'attività che è stata completata con un'eccezione specificata in C++."
type: docs
weight: 1300
url: /it/cpp/system.threading.tasks/fromexception/
---
## System::Threading::Tasks::FromException(const Exception\&) method


Crea un'attività che è stata completata con un'eccezione specificata.

```cpp
TaskPtr System::Threading::Tasks::FromException(const Exception &exception)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| eccezione | const Exception\& | L'eccezione con cui completare l'attività. |

### ReturnValue

Un'attività in errore.

## Vedi anche

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [Exception](../../system/exception/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::FromException(const Exception\&) method


Crea un'attività che è stata completata con un'eccezione specificata e un tipo di risultato.

```cpp
template<typename TResult> RTaskPtr<TResult> System::Threading::Tasks::FromException(const Exception &exception)
```


| Parametro | Descrizione |
| --- | --- |
| TResult | Il tipo del risultato del task. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| eccezione | const Exception\& | L'eccezione con cui completare l'attività. |

### ReturnValue

Un'attività in errore con il tipo di risultato specificato.

## Vedi anche

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [Exception](../../system/exception/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
