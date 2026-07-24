---
title: "System::Threading::Tasks::Task::Task constructor"
linktitle: "Task"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Tasks::Task::Task constructor. Interne constructor voor het maken van niet-geïnitieerde taken in C++."
type: docs
weight: 100
url: /nl/cpp/system.threading.tasks/task/task/
---
## Task::Task() constructor


Interne constructor voor het maken van niet-geïnitieerde taken.

```cpp
System::Threading::Tasks::Task::Task()
```

## Zie ook

* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) constructor


Construeert een [Task](../) met een stateful actie en statusobject.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | De actie om uit te voeren (accepteert statusobject) |
| state | const SharedPtr\<Object\>\& | Door de gebruiker gedefinieerd statusobject dat aan de actie wordt doorgegeven |

## Zie ook

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) constructor


Construeert een [Task](../) met stateful actie, status en annulerings-token.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state, const CancellationToken &cancellationToken)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | De actie om uit te voeren (accepteert statusobject) |
| state | const SharedPtr\<Object\>\& | Door de gebruiker gedefinieerd statusobject dat aan de actie wordt doorgegeven |
| cancellationToken | const CancellationToken\& | Token om te monitoren op annuleringsverzoeken |

## Zie ook

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action<>\&) constructor


Construeert een [Task](../) met een actie om uit te voeren.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| action | const Action<>\& | De actie om asynchroon uit te voeren |

## Zie ook

* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action<>\&, const CancellationToken\&) constructor


Construeert een [Task](../) met een actie en annulerings-token.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action, const CancellationToken &cancellationToken)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| action | const Action<>\& | De actie om asynchroon uit te voeren |
| cancellationToken | const CancellationToken\& | Token om te monitoren op annuleringsverzoeken |

## Zie ook

* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
