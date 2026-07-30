---
title: "System::Threading::Tasks::ResultValueTask‑Klasse"
linktitle: "ResultValueTask"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::ResultValueTask‑Klasse. Stellt einen hybriden, aufgabenähnlichen Typ dar, der entweder einen direkten Ergebniswert oder ein ResultTask<T> in C++ kapseln kann."
type: docs
weight: 500
url: /de/cpp/system.threading.tasks/resultvaluetask/
---
## ResultValueTask class


Stellt einen hybriden, aufgabenähnlichen Typ dar, der entweder einen direkten Ergebniswert oder ein [ResultTask<T>](../resulttask/) kapseln kann.

```cpp
template<typename T>class ResultValueTask : public System::IEquatable<ResultValueTask<T>>,
                                            public System::Details::BoxableObjectBase
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ des von der Aufgabe erzeugten Ergebnisses. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AsTask](./astask/)() const | Konvertiert dieses [ResultValueTask](./) in einen Shared‑Pointer zu [ResultTask<T>](../resulttask/). |
| [ConfigureAwait](./configureawait/)(bool) const | Konfiguriert einen Awaiter für diese Aufgabe. |
| [Equals](./equals/)(ResultValueTask) override | Bestimmt, ob diese Instanz einer anderen [ResultValueTask](./)‑Instanz entspricht. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Bestimmt, ob diese Instanz einem anderen Objekt entspricht. |
| [get_IsCanceled](./get_iscanceled/)() const | Gibt einen Wert zurück, der angibt, ob die Aufgabe wegen Abbruch beendet wurde. |
| [get_IsCompleted](./get_iscompleted/)() const | Gibt einen Wert zurück, der angibt, ob die Aufgabe abgeschlossen ist. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | Gibt einen Wert zurück, der angibt, ob die Aufgabe erfolgreich abgeschlossen wurde. |
| [get_IsFaulted](./get_isfaulted/)() const | Gibt einen Wert zurück, der angibt, ob die Aufgabe aufgrund einer nicht behandelten Ausnahme beendet wurde. |
| [get_Result](./get_result/)() | Liefert das Ergebnis der abgeschlossenen Aufgabe. |
| [GetAwaiter](./getawaiter/)() const | Gibt einen Awaiter für diese Aufgabe zurück, um await-Ausdrücke zu unterstützen. |
| [operator!=](./operator!=/)(const ResultValueTask\&) const | Ungleichheitsoperator für [ResultValueTask](./). |
| [operator==](./operator==/)(const ResultValueTask\&) const | Gleichheitsoperator für [ResultValueTask](./). |
| [ResultValueTask](./resultvaluetask/)() | Konstruiert ein leeres, nicht initialisiertes [ResultValueTask](./). |
| [ResultValueTask](./resultvaluetask/)(const T\&) | Konstruiert ein abgeschlossenes [ResultValueTask](./) mit dem angegebenen Ergebnis. |
| [ResultValueTask](./resultvaluetask/)(const RTaskPtr\<T\>\&) | Konstruiert ein [ResultValueTask](./) aus einem Shared Pointer zu einem [ResultTask<T>](../resulttask/). |
## Hinweise


[ResultValueTask](./) combines the benefits of [ValueTask](../valuetask/) (reduced allocations for synchronous results) with the ability to wrap existing [ResultTask<T>](../resulttask/) objects. It provides awaitable interface and various task status inspection methods. 
## Siehe auch

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
