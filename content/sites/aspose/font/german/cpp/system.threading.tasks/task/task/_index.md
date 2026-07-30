---
title: "System::Threading::Tasks::Task::Task Konstruktor"
linktitle: "Task"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::Task::Task Konstruktor. Interner Konstruktor zum Erstellen nicht initialisierter Aufgaben in C++."
type: docs
weight: 100
url: /de/cpp/system.threading.tasks/task/task/
---
## Task::Task() constructor


Interner Konstruktor zum Erstellen nicht initialisierter Aufgaben.

```cpp
System::Threading::Tasks::Task::Task()
```

## Siehe auch

* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) constructor


Erstellt ein [Task](../) mit einer zustandsbehafteten Aktion und Zustandsobjekt.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Aktion | const Action\<SharedPtr\<Object\>\>\& | Die auszuführende Aktion (akzeptiert Zustandsobjekt) |
| Zustand | const SharedPtr\<Object\>\& | Benutzerdefiniertes Zustandsobjekt, das an die Aktion übergeben wird |

## Siehe auch

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) constructor


Erstellt ein [Task](../) mit zustandsbehafteter Aktion, Zustand und Abbruch-Token.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state, const CancellationToken &cancellationToken)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Aktion | const Action\<SharedPtr\<Object\>\>\& | Die auszuführende Aktion (akzeptiert Zustandsobjekt) |
| Zustand | const SharedPtr\<Object\>\& | Benutzerdefiniertes Zustandsobjekt, das an die Aktion übergeben wird |
| cancellationToken | const CancellationToken\& | Token zur Überwachung von Abbruchanforderungen |

## Siehe auch

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action<>\&) constructor


Erstellt ein [Task](../) mit einer auszuführenden Aktion.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Aktion | const Action<>\& | Die asynchron auszuführende Aktion |

## Siehe auch

* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action<>\&, const CancellationToken\&) constructor


Erstellt ein [Task](../) mit einer Aktion und einem Abbruch-Token.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action, const CancellationToken &cancellationToken)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Aktion | const Action<>\& | Die asynchron auszuführende Aktion |
| cancellationToken | const CancellationToken\& | Token zur Überwachung von Abbruchanforderungen |

## Siehe auch

* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
