---
title: "Metodo System::Threading::Tasks::Run"
linktitle: "Run"
second_title: "Aspose.Font per C++"
description: "Metodo System::Threading::Tasks::Run. Accoda il lavoro specificato per l'esecuzione nel pool di thread e restituisce un handle Task per quel lavoro in C++."
type: docs
weight: 1600
url: /it/cpp/system.threading.tasks/run/
---
## System::Threading::Tasks::Run(const Action<>\&) method


Accoda il lavoro specificato per l'esecuzione nel pool di thread e restituisce un handle [Task](../task/) per quel lavoro.

```cpp
TaskPtr System::Threading::Tasks::Run(const Action<> &action)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| action | const Action<>\& | Il lavoro da eseguire in modo asincrono. |

### ReturnValue

Un [Task](../task/) che rappresenta il lavoro accodato per l'esecuzione nel pool di thread.

## Vedi anche

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [Action](../../system/action/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Run(const Action<>\&, const CancellationToken\&) method


Accoda il lavoro specificato per l'esecuzione nel pool di thread e restituisce un handle [Task](../task/) per quel lavoro.

```cpp
TaskPtr System::Threading::Tasks::Run(const Action<> &action, const CancellationToken &cancellationToken)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| action | const Action<>\& | Il lavoro da eseguire in modo asincrono. |
| cancellationToken | const CancellationToken\& | Un token di cancellazione che può essere usato per annullare il lavoro se non è ancora iniziato. |

### ReturnValue

Un [Task](../task/) che rappresenta il lavoro accodato per l'esecuzione nel pool di thread.

## Vedi anche

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [Action](../../system/action/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Run(const Func\<TaskPtr\>\&) method


Accoda il lavoro specificato per l'esecuzione nel pool di thread e restituisce un proxy per il [Task](../task/) restituito dalla funzione.

```cpp
TaskPtr System::Threading::Tasks::Run(const Func<TaskPtr> &function)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| function | const Func\<TaskPtr\>\& | Il lavoro da eseguire in modo asincrono, che restituisce un [Task](../task/). |

### ReturnValue

Un [Task](../task/) che rappresenta un proxy per il [Task](../task/) restituito dalla funzione.

## Vedi anche

* Typedef [TaskPtr](../../system/taskptr/)
* Class [Func](../../system/func/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Run(const Func\<TResult\>\&) method


Accoda il lavoro specificato per l'esecuzione nel pool di thread e restituisce un handle [Task<TResult>](../task/) per quel lavoro.

```cpp
template<typename TResult> RTaskPtr<TResult> System::Threading::Tasks::Run(const Func<TResult> &function)
```


| Parametro | Descrizione |
| --- | --- |
| TResult | Il tipo del risultato restituito dal task. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| funzione | const Func\<TResult\>\& | Il lavoro da eseguire in modo asincrono. |

### ReturnValue

Un [Task<TResult>](../task/) che rappresenta il lavoro accodato per l'esecuzione nel pool di thread.

## Vedi anche

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Class [Func](../../system/func/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
