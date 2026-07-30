---
title: "System::Threading::Tasks::ValueTask Klasse"
linktitle: "ValueTask"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::ValueTask Klasse. Stellt ein abwartbares Ergebnis einer asynchronen Operation in C++ bereit."
type: docs
weight: 800
url: /de/cpp/system.threading.tasks/valuetask/
---
## ValueTask class


Bietet ein abwartbares Ergebnis einer asynchronen Operation.

```cpp
class ValueTask : public System::IEquatable<ValueTask>,
                  public System::Details::BoxableObjectBase
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AsTask](./astask/)() const | Konvertiert dieses [ValueTask](./) in einen gemeinsamen Zeiger auf [Task](../task/). |
| [ConfigureAwait](./configureawait/)(bool) const | Konfiguriert einen Awaiter für diese Aufgabe. |
| [Equals](./equals/)(ValueTask) override | Bestimmt, ob diese Instanz einer anderen [ValueTask](./)-Instanz entspricht. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Bestimmt, ob diese Instanz einem anderen Objekt entspricht. |
| [get_IsCanceled](./get_iscanceled/)() const | Gibt einen Wert zurück, der angibt, ob die Aufgabe wegen Abbruch beendet wurde. |
| [get_IsCompleted](./get_iscompleted/)() const | Gibt einen Wert zurück, der angibt, ob die Aufgabe abgeschlossen ist. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | Gibt einen Wert zurück, der angibt, ob die Aufgabe erfolgreich abgeschlossen wurde. |
| [get_IsFaulted](./get_isfaulted/)() const | Gibt einen Wert zurück, der angibt, ob die Aufgabe aufgrund einer nicht behandelten Ausnahme beendet wurde. |
| [GetAwaiter](./getawaiter/)() const | Gibt einen Awaiter für diese Aufgabe zurück, um await-Ausdrücke zu unterstützen. |
| [operator!=](./operator!=/)(const ValueTask\&) const | Ungleichheitsoperator für [ValueTask](./). |
| [operator==](./operator==/)(const ValueTask\&) const | Gleichheitsoperator für [ValueTask](./). |
| [ValueTask](./valuetask/)() | Konstruiert ein leeres, nicht initialisiertes [ValueTask](./). |
| [ValueTask](./valuetask/)(const TaskPtr\&) | Konstruiert ein [ValueTask](./) aus einem Shared Pointer zu einem [Task](../task/). |
## Siehe auch

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
