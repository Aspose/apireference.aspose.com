---
title: "Klasse System::Threading::Tasks::ResultValueTask"
linktitle: "ResultValueTask"
second_title: "Aspose.Page für C++"
description: "Klasse System::Threading::Tasks::ResultValueTask. Stellt einen hybriden, aufgabenähnlichen Typ dar, der entweder einen direkten Ergebniswert oder ein ResultTask<T> in C++ kapseln kann."
type: docs
weight: 200
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
| [AsTask](./astask/)() const | Konvertiert dieses [ResultValueTask](./) in einen gemeinsamen Zeiger auf [ResultTask<T>](../resulttask/). |
| [ConfigureAwait](./configureawait/)(bool) const | Konfiguriert einen Awaiter für diesen Task. |
| [Equals](./equals/)(ResultValueTask) override | Bestimmt, ob diese Instanz einer anderen [ResultValueTask](./)-Instanz entspricht. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Bestimmt, ob diese Instanz einem anderen Objekt entspricht. |
| [get_IsCanceled](./get_iscanceled/)() const | Gibt einen Wert zurück, der angibt, ob der Task aufgrund einer Stornierung abgeschlossen wurde. |
| [get_IsCompleted](./get_iscompleted/)() const | Gibt einen Wert zurück, der angibt, ob der Task abgeschlossen ist. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | Gibt einen Wert zurück, der angibt, ob der Task erfolgreich abgeschlossen wurde. |
| [get_IsFaulted](./get_isfaulted/)() const | Gibt einen Wert zurück, der angibt, ob der Task aufgrund einer nicht behandelten Ausnahme abgeschlossen wurde. |
| [get_Result](./get_result/)() const | Liefert das Ergebnis der abgeschlossenen Aufgabe. |
| [GetAwaiter](./getawaiter/)() const | Gibt einen Awaiter für diesen Task zurück, um await‑Ausdrücke zu unterstützen. |
| [operator!=](./operator!=/)(const ResultValueTask\&) const | Ungleichheitsoperator für [ResultValueTask](./). |
| [operator==](./operator==/)(const ResultValueTask\&) const | Gleichheitsoperator für [ResultValueTask](./). |
| [ResultValueTask](./resultvaluetask/)() | Konstruiert ein leeres, nicht initialisiertes [ResultValueTask](./). |
| [ResultValueTask](./resultvaluetask/)(const T\&) | Konstruiert ein abgeschlossenes [ResultValueTask](./) mit dem angegebenen Ergebnis. |
| [ResultValueTask](./resultvaluetask/)(const RTaskPtr\<T\>\&) | Konstruiert ein [ResultValueTask](./) aus einem gemeinsamen Zeiger auf ein [ResultTask<T>](../resulttask/). |
## Hinweise


[ResultValueTask](./) combines the benefits of [ValueTask](../valuetask/) (reduced allocations for synchronous results) with the ability to wrap existing [ResultTask<T>](../resulttask/) objects. It provides awaitable interface and various task status inspection methods. 
## Siehe auch

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
