---
title: "System::Threading::Tasks::ResultValueTask::get_Result-Methode"
linktitle: "get_Result"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::ResultValueTask::get_Result-Methode. Gibt das Ergebnis der abgeschlossenen Aufgabe in C++ zurück."
type: docs
weight: 900
url: /de/cpp/system.threading.tasks/resultvaluetask/get_result/
---
## ResultValueTask::get_Result method


Liefert das Ergebnis der abgeschlossenen Aufgabe.

```cpp
T System::Threading::Tasks::ResultValueTask<T>::get_Result()
```


### ReturnValue

T Der Ergebniswert.
## Hinweise



Wenn die Aufgabe von einem [ResultTask<T>](../../resulttask/) unterstützt wird, wartet diese Methode das Ergebnis ab und speichert es im Cache. Nachfolgende Aufrufe geben den zwischengespeicherten Wert zurück, ohne zu warten.

## Siehe auch

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
