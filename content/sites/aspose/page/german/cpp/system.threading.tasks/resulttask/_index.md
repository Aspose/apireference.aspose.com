---
title: "System::Threading::Tasks::ResultTask-Klasse"
linktitle: "ResultTask"
second_title: "Aspose.Page für C++"
description: "System::Threading::Tasks::ResultTask-Klasse. Eine Task‑Spezialisierung, die bei Abschluss einen Ergebniswert zurückgibt in C++."
type: docs
weight: 100
url: /de/cpp/system.threading.tasks/resulttask/
---
## ResultTask class


Eine [Task](../task/)‑Spezialisierung, die bei Abschluss einen Ergebniswert zurückgibt.

```cpp
template<typename T>class ResultTask : public System::Threading::Tasks::Task
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ des von der Task zurückgegebenen Ergebniswerts. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ConfigureAwait](./configureawait/)(bool) const | Konfiguriert, wie Await‑Aufrufe auf dieser Ergebnis‑Task in Bezug auf die Kontextaufnahme sich verhalten sollen. |
| [ContinueWith](./continuewith/)(const Action\<RTaskPtr\<T\>\>\&) | Erstellt eine Fortsetzung, die ausgeführt wird, wenn die Ergebnis‑Task abgeschlossen ist. |
| [get_Result](./get_result/)() const | Liefert das Ergebnis der asynchronen Operation. |
| [GetAwaiter](./getawaiter/)() const | Liefert einen Awaiter für diese Ergebnis‑Task zur Verwendung mit Await. |
| [ResultTask](./resulttask/)(const Func\<T\>\&) | Konstruiert eine [ResultTask](./) mit einer Funktion, die einen Wert zurückgibt. |
| [ResultTask](./resulttask/)() | Interne Implementierung. Nicht für Benutzercode. |
| [ResultTask](./resulttask/)(const T\&) | Interner Konstruktor zum Erstellen von Ergebnis‑Tasks mit angegebenem Ergebnis. |
| [set_Result](./set_result/)(const T\&) | Setzt den Ergebniswert für die Task. |
## Hinweise



Stellt eine asynchrone Operation dar, die ein Ergebnis erzeugt, ähnlich wie [System.Threading.Tasks.Task<TResult>](../task/) in .NET.
## Siehe auch

* Class [Task](../task/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
