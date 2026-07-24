---
title: "System::Threading::Tasks::Task::Task konstruktor"
linktitle: "Task"
second_title: "Aspose.Page för C++"
description: "System::Threading::Tasks::Task::Task konstruktor. Intern konstruktor för att skapa oinitialiserade uppdrag i C++."
type: docs
weight: 100
url: /sv/cpp/system.threading.tasks/task/task/
---
## Task::Task() constructor


Intern konstruktor för att skapa oinitialiserade uppgifter.

```cpp
System::Threading::Tasks::Task::Task()
```

## Se även

* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) constructor


Skapar ett [Task](../) med en tillståndsbaserad åtgärd och tillståndsobjekt.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| åtgärd | const Action\<SharedPtr\<Object\>\>\& | Åtgärden att utföra (accepterar tillståndsobjekt) |
| tillstånd | const SharedPtr\<Object\>\& | Användardefinierat tillståndsobjekt som skickas till åtgärden |

## Se även

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) constructor


Skapar ett [Task](../) med tillståndsbaserad åtgärd, tillstånd och avbokningstoken.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state, const CancellationToken &cancellationToken)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| åtgärd | const Action\<SharedPtr\<Object\>\>\& | Åtgärden att utföra (accepterar tillståndsobjekt) |
| tillstånd | const SharedPtr\<Object\>\& | Användardefinierat tillståndsobjekt som skickas till åtgärden |
| cancellationToken | const CancellationToken\& | Token för att övervaka avbokningsförfrågningar |

## Se även

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action<>\&) constructor


Skapar ett [Task](../) med en åtgärd att utföra.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| åtgärd | const Action<>\& | Åtgärden att utföra asynkront |

## Se även

* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action<>\&, const CancellationToken\&) constructor


Skapar ett [Task](../) med en åtgärd och avbokningstoken.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action, const CancellationToken &cancellationToken)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| åtgärd | const Action<>\& | Åtgärden att utföra asynkront |
| cancellationToken | const CancellationToken\& | Token för att övervaka avbokningsförfrågningar |

## Se även

* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
