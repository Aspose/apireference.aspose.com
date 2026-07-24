---
title: "System::ComponentModel::AsyncCompletedEventArgs Klasse"
linktitle: "AsyncCompletedEventArgs"
second_title: "Aspose.Page für C++"
description: "System::ComponentModel::AsyncCompletedEventArgs Klasse. Eine Instanz dieser Klasse wird als Argument an den AsyncCompletedEventHandler-Delegaten übergeben. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.componentmodel/asynccompletedeventargs/
---
## AsyncCompletedEventArgs class


Eine Instanz dieser Klasse wird als Argument an den AsyncCompletedEventHandler-Delegaten übergeben. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class AsyncCompletedEventArgs : public System::EventArgs
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)() | Konstruktor. |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)(const System::Exception\&, bool, const System::SharedPtr\<System::Object\>\&) | Initialisiert eine neue Instanz der [System.ComponentModel.AsyncCompletedEventArgs](./) Klasse. |
| [get_Cancelled](./get_cancelled/)() const | Ermittelt einen Wert, der angibt, ob ein asynchroner Vorgang abgebrochen wurde. true, wenn der Hintergrundvorgang abgebrochen wurde; andernfalls false. Der Standardwert ist false. |
| [get_Error](./get_error/)() const | Ermittelt einen Wert, der angibt, welcher Fehler während eines asynchronen Vorgangs aufgetreten ist. |
| [get_UserState](./get_userstate/)() const | Ermittelt die eindeutige Kennung für die asynchrone Aufgabe. Eine Objektreferenz, die die asynchrone Aufgabe eindeutig identifiziert; andernfalls null, wenn kein Wert gesetzt wurde. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ein statisches Mitglied, das einen "leeren" [EventArgs](../../system/eventargs/) Shared-Pointer (Null-Pointer) darstellt. |
## Siehe auch

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
