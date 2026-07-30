---
title: "System::Threading::Tasks::ResultValueTask::operator== Methode"
linktitle: "operator=="
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::ResultValueTask::operator== Methode. Gleichheitsoperator für ResultValueTask in C++."
type: docs
weight: 1200
url: /de/cpp/system.threading.tasks/resultvaluetask/operator==/
---
## ResultValueTask::operator== method


Gleichheitsoperator für [ResultValueTask](../).

```cpp
bool System::Threading::Tasks::ResultValueTask<T>::operator==(const ResultValueTask &other) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | const ResultValueTask\& | Das andere [ResultValueTask](../), mit dem diese Instanz verglichen wird. |

### ReturnValue

bool True, wenn beide Aufgaben denselben Ergebniswert haben oder auf dieselbe zugrunde liegende Aufgabe verweisen; andernfalls false.
## Hinweise



Wenn eine der Instanzen einen direkten Ergebniswert enthält, werden die Ergebnisse direkt verglichen. Andernfalls werden die Zeiger auf die zugrunde liegende Aufgabe verglichen.
## Siehe auch

* Class [ResultValueTask](../)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
