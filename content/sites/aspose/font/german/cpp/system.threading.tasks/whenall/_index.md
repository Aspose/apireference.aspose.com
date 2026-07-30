---
title: "System::Threading::Tasks::WhenAll Methode"
linktitle: "WhenAll"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::WhenAll Methode. Erstellt einen Task, der abgeschlossen wird, sobald alle bereitgestellten Tasks in C++ abgeschlossen sind."
type: docs
weight: 2400
url: /de/cpp/system.threading.tasks/whenall/
---
## System::Threading::Tasks::WhenAll(const ArrayPtr\<RTaskPtr\<TResult\>\>\&) method


Erstellt einen Task, der abgeschlossen wird, sobald alle bereitgestellten Tasks abgeschlossen sind.

```cpp
template<typename TResult> RTaskPtr<ArrayPtr<TResult>> System::Threading::Tasks::WhenAll(const ArrayPtr<RTaskPtr<TResult>> &tasks)
```


| Parameter | Beschreibung |
| --- | --- |
| TResult | Der Typ der Ergebnisse der abgeschlossenen Tasks. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Aufgaben | const ArrayPtr\<RTaskPtr\<TResult\>\>\& | Die Tasks, auf die für den Abschluss gewartet wird. |

### ReturnValue

Ein Task, der ein Array aller Ergebnisse zurückgibt, wenn alle Tasks abgeschlossen sind.

## Siehe auch

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const ArrayPtr\<TaskPtr\>\&) method


Erstellt einen Task, der abgeschlossen wird, sobald alle bereitgestellten Tasks abgeschlossen sind.

```cpp
TaskPtr System::Threading::Tasks::WhenAll(const ArrayPtr<TaskPtr> &tasks)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Aufgaben | const ArrayPtr\<TaskPtr\>\& | Die Tasks, auf die für den Abschluss gewartet wird. |

### ReturnValue

Ein Task, der den Abschluss aller bereitgestellten Tasks repräsentiert.

## Siehe auch

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\&) method


Erstellt einen Task, der abgeschlossen wird, sobald alle bereitgestellten Tasks abgeschlossen sind.

```cpp
template<typename TResult> RTaskPtr<ArrayPtr<TResult>> System::Threading::Tasks::WhenAll(const SharedPtr<Collections::Generic::IEnumerable<RTaskPtr<TResult>>> &tasks)
```


| Parameter | Beschreibung |
| --- | --- |
| TResult | Der Typ der Ergebnisse der abgeschlossenen Tasks. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Aufgaben | const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\& | Die Tasks, auf die für den Abschluss gewartet wird. |

### ReturnValue

Ein Task, der ein Array aller Ergebnisse zurückgibt, wenn alle Tasks abgeschlossen sind.

## Siehe auch

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\&) method


Erstellt einen Task, der abgeschlossen wird, sobald alle bereitgestellten Tasks abgeschlossen sind.

```cpp
TaskPtr System::Threading::Tasks::WhenAll(const SharedPtr<Collections::Generic::IEnumerable<TaskPtr>> &tasks)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Aufgaben | const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\& | Die Tasks, auf die für den Abschluss gewartet wird. |

### ReturnValue

Ein Task, der den Abschluss aller bereitgestellten Tasks repräsentiert.

## Siehe auch

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
