---
title: "System::Threading::Tasks::Task::Task costruttore"
linktitle: "Task"
second_title: "Aspose.Font per C++"
description: "System::Threading::Tasks::Task::Task costruttore. Costruttore interno per creare task non inizializzati in C++."
type: docs
weight: 100
url: /it/cpp/system.threading.tasks/task/task/
---
## Task::Task() constructor


Costruttore interno per creare task non inizializzati.

```cpp
System::Threading::Tasks::Task::Task()
```

## Vedi anche

* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) constructor


Costruisce un [Task](../) con un'azione con stato e oggetto di stato.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | L'azione da eseguire (accetta oggetto di stato) |
| stato | const SharedPtr\<Object\>\& | Oggetto di stato definito dall'utente passato all'azione |

## Vedi anche

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) constructor


Costruisce un [Task](../) con un'azione con stato, stato e token di cancellazione.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state, const CancellationToken &cancellationToken)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | L'azione da eseguire (accetta oggetto di stato) |
| stato | const SharedPtr\<Object\>\& | Oggetto di stato definito dall'utente passato all'azione |
| cancellationToken | const CancellationToken\& | Token per monitorare le richieste di cancellazione |

## Vedi anche

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action<>\&) constructor


Costruisce un [Task](../) con un'azione da eseguire.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| action | const Action<>\& | L'azione da eseguire in modo asincrono |

## Vedi anche

* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action<>\&, const CancellationToken\&) constructor


Costruisce un [Task](../) con un'azione e token di cancellazione.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action, const CancellationToken &cancellationToken)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| action | const Action<>\& | L'azione da eseguire in modo asincrono |
| cancellationToken | const CancellationToken\& | Token per monitorare le richieste di cancellazione |

## Vedi anche

* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
