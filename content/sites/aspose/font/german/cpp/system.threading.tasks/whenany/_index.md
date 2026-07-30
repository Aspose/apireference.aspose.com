---
title: "System::Threading::Tasks::WhenAny-Methode"
linktitle: "WhenAny"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::WhenAny-Methode. Erstellt eine Aufgabe, die abgeschlossen wird, sobald eine der bereitgestellten Aufgaben in C++ abgeschlossen ist."
type: docs
weight: 2800
url: /de/cpp/system.threading.tasks/whenany/
---
## System::Threading::Tasks::WhenAny(const ArrayPtr\<RTaskPtr\<TResult\>\>\&) method


Erstellt eine Aufgabe, die abgeschlossen wird, sobald eine der bereitgestellten Aufgaben abgeschlossen ist.

```cpp
template<typename TResult> RTaskPtr<RTaskPtr<TResult>> System::Threading::Tasks::WhenAny(const ArrayPtr<RTaskPtr<TResult>> &tasks)
```


| Parameter | Beschreibung |
| --- | --- |
| TResult | Der Typ des Ergebnisses der abgeschlossenen Aufgabe. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Aufgaben | const ArrayPtr\<RTaskPtr\<TResult\>\>\& | Die Tasks, auf die für den Abschluss gewartet wird. |

### ReturnValue

Eine Aufgabe, die die zuerst abgeschlossene Aufgabe zurückgibt, wenn irgendeine Aufgabe abgeschlossen wird.

## Siehe auch

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const ArrayPtr\<TaskPtr\>\&) method


Erstellt eine Aufgabe, die abgeschlossen wird, sobald eine der bereitgestellten Aufgaben abgeschlossen ist.

```cpp
RTaskPtr<TaskPtr> System::Threading::Tasks::WhenAny(const ArrayPtr<TaskPtr> &tasks)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Aufgaben | const ArrayPtr\<TaskPtr\>\& | Die Tasks, auf die für den Abschluss gewartet wird. |

### ReturnValue

Eine Aufgabe, die den Abschluss einer der bereitgestellten Aufgaben darstellt.

## Siehe auch

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\&) method


Erstellt eine Aufgabe, die abgeschlossen wird, sobald eine der bereitgestellten Aufgaben abgeschlossen ist.

```cpp
template<typename TResult> RTaskPtr<RTaskPtr<TResult>> System::Threading::Tasks::WhenAny(const SharedPtr<Collections::Generic::IEnumerable<RTaskPtr<TResult>>> &tasks)
```


| Parameter | Beschreibung |
| --- | --- |
| TResult | Der Typ des Ergebnisses der abgeschlossenen Aufgabe. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Aufgaben | const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\& | Die Tasks, auf die für den Abschluss gewartet wird. |

### ReturnValue

Eine Aufgabe, die die zuerst abgeschlossene Aufgabe zurückgibt, wenn irgendeine Aufgabe abgeschlossen wird.

## Siehe auch

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\&) method


Erstellt eine Aufgabe, die abgeschlossen wird, sobald eine der bereitgestellten Aufgaben abgeschlossen ist.

```cpp
RTaskPtr<TaskPtr> System::Threading::Tasks::WhenAny(const SharedPtr<Collections::Generic::IEnumerable<TaskPtr>> &tasks)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Aufgaben | const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\& | Die Tasks, auf die für den Abschluss gewartet wird. |

### ReturnValue

Eine Aufgabe, die den Abschluss einer der bereitgestellten Aufgaben darstellt.

## Siehe auch

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
