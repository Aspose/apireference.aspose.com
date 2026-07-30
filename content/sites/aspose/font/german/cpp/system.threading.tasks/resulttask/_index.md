---
title: "System::Threading::Tasks::ResultTask Klasse"
linktitle: "ResultTask"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::ResultTask Klasse. Eine Task‑Spezialisierung, die bei Abschluss in C++ einen Ergebniswert zurückgibt."
type: docs
weight: 400
url: /de/cpp/system.threading.tasks/resulttask/
---
## ResultTask class


Eine [Task](../task/)‑Spezialisierung, die bei Abschluss einen Ergebniswert zurückgibt.

```cpp
template<typename T>class ResultTask : public System::Threading::Tasks::Task
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ des von dem Task zurückgegebenen Ergebniswerts. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Complete](./complete/)(const T\&) | Setzt den Ergebniswert für den Task und schließt ihn ab. |
| [ConfigureAwait](./configureawait/)(bool) const | Konfiguriert, wie Await‑Aufrufe auf diesem Ergebnis‑Task sich in Bezug auf die Kontext‑Erfassung verhalten sollen. |
| [ContinueWith](./continuewith/)(const Action\<RTaskPtr\<T\>\>\&) | Erstellt eine Fortsetzung, die ausgeführt wird, wenn der Ergebnis‑Task abgeschlossen ist. |
| [ContinueWith](./continuewith/)(const Func\<RTaskPtr\<T\>, TNewResult\>\&) | Erstellt eine Fortsetzung, die ausgeführt wird, wenn der Ergebnis‑Task abgeschlossen ist. |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | Erstellt eine Fortsetzung, die ausgeführt wird, wenn der Task abgeschlossen ist. |
| [ContinueWith](./continuewith/)(const Func\<TaskPtr, TResult\>\&) | Erstellt eine Fortsetzung, die ausgeführt wird, wenn der Task abgeschlossen ist. |
| [get_Result](./get_result/)() | Liefert das Ergebnis der asynchronen Operation. |
| [GetAwaiter](./getawaiter/)() const | Liefert einen Awaiter für diesen Ergebnis‑Task zur Verwendung mit Await. |
| [ResultTask](./resulttask/)(const Func\<T\>\&) | Konstruiert einen [ResultTask](./) mit einer Funktion, die einen Wert zurückgibt. |
| [ResultTask](./resulttask/)() | Interne Implementierung. Nicht für Benutzercode. |
| [ResultTask](./resulttask/)(const T\&) | Interner Konstruktor zum Erstellen von Ergebnis‑Tasks mit angegebenem Ergebnis. |
| [set_Result](./set_result/)(const T\&) | Setzt den Ergebniswert für den Task. |
## Hinweise



Stellt eine asynchrone Operation dar, die ein Ergebnis erzeugt, ähnlich wie [System.Threading.Tasks.Task<TResult>](../task/) in .NET.
## Siehe auch

* Class [Task](../task/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
