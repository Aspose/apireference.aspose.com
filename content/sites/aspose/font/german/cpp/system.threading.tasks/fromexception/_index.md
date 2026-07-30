---
title: "System::Threading::Tasks::FromException‑Methode"
linktitle: "FromException"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::FromException‑Methode. Erstellt eine Aufgabe, die in C++ mit einer angegebenen Ausnahme abgeschlossen wurde."
type: docs
weight: 1300
url: /de/cpp/system.threading.tasks/fromexception/
---
## System::Threading::Tasks::FromException(const Exception\&) method


Erstellt eine Aufgabe, die mit einer angegebenen Ausnahme abgeschlossen wurde.

```cpp
TaskPtr System::Threading::Tasks::FromException(const Exception &exception)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Ausnahme | const Exception\& | Die Ausnahme, mit der die Aufgabe abgeschlossen werden soll. |

### ReturnValue

Eine fehlerhafte Aufgabe.

## Siehe auch

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [Exception](../../system/exception/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::FromException(const Exception\&) method


Erstellt eine Aufgabe, die mit einer angegebenen Ausnahme und einem Ergebnis­typ abgeschlossen wurde.

```cpp
template<typename TResult> RTaskPtr<TResult> System::Threading::Tasks::FromException(const Exception &exception)
```


| Parameter | Beschreibung |
| --- | --- |
| TResult | Der Typ des Aufgabenergebnisses. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Ausnahme | const Exception\& | Die Ausnahme, mit der die Aufgabe abgeschlossen werden soll. |

### ReturnValue

Eine fehlerhafte Aufgabe mit dem angegebenen Ergebnis­typ.

## Siehe auch

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [Exception](../../system/exception/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
