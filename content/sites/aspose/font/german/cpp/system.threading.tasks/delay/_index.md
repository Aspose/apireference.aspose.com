---
title: "Methode System::Threading::Tasks::Delay"
linktitle: "Verzögerung"
second_title: "Aspose.Font für C++"
description: "Methode System::Threading::Tasks::Delay. Erstellt eine Aufgabe, die nach einer Zeitverzögerung in C++ abgeschlossen wird."
type: docs
weight: 1000
url: /de/cpp/system.threading.tasks/delay/
---
## System::Threading::Tasks::Delay(int32_t) method


Erstellt eine Aufgabe, die nach einer Zeitverzögerung abgeschlossen wird.

```cpp
TaskPtr System::Threading::Tasks::Delay(int32_t millisecondsDelay)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| millisecondsDelay | int32_t | Die Anzahl der Millisekunden, die gewartet werden soll, bevor die zurückgegebene Aufgabe abgeschlossen wird, oder -1, um unbegrenzt zu warten. |

### ReturnValue

Eine Aufgabe, die die Zeitverzögerung darstellt.

## Siehe auch

* Typedef [TaskPtr](../../system/taskptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Delay(int32_t, const CancellationToken\&) method


Erstellt eine Aufgabe, die nach einer Zeitverzögerung abgeschlossen wird und abgebrochen werden kann.

```cpp
TaskPtr System::Threading::Tasks::Delay(int32_t millisecondsDelay, const CancellationToken &cancellationToken)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| millisecondsDelay | int32_t | Die Anzahl der Millisekunden, die gewartet werden soll, bevor die zurückgegebene Aufgabe abgeschlossen wird, oder -1, um unbegrenzt zu warten. |
| cancellationToken | const CancellationToken\& | Das CancellationToken, das verwendet werden kann, um die Verzögerung abzubrechen. |

### ReturnValue

Eine Aufgabe, die die Zeitverzögerung darstellt.

## Siehe auch

* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
