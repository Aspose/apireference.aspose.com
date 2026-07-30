---
title: "System::ComponentModel::AsyncCompletedEventArgs Klasse"
linktitle: "AsyncCompletedEventArgs"
second_title: "Aspose.Font für C++"
description: "System::ComponentModel::AsyncCompletedEventArgs Klasse. Eine Instanz dieser Klasse wird als Argument an den AsyncCompletedEventHandler‑Delegate übergeben. Objekte dieser Klasse sollten nur über die System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.componentmodel/asynccompletedeventargs/
---
## AsyncCompletedEventArgs class


Eine Instanz dieser Klasse wird als Argument an den AsyncCompletedEventHandler‑Delegate übergeben. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/) Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class AsyncCompletedEventArgs : public System::EventArgs
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)() | Konstruktor. |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)(const System::Exception\&, bool, const System::SharedPtr\<System::Object\>\&) | Initialisiert eine neue Instanz der Klasse [System.ComponentModel.AsyncCompletedEventArgs](./). |
| [get_Cancelled](./get_cancelled/)() const | Gibt einen Wert zurück, der angibt, ob ein asynchroner Vorgang abgebrochen wurde. true, wenn der Hintergrundvorgang abgebrochen wurde; andernfalls false. Der Standardwert ist false. |
| [get_Error](./get_error/)() const | Gibt einen Wert zurück, der angibt, welcher Fehler während eines asynchronen Vorgangs aufgetreten ist. |
| [get_UserState](./get_userstate/)() const | Gibt den eindeutigen Bezeichner für die asynchrone Aufgabe zurück. Eine Objektreferenz, die die asynchrone Aufgabe eindeutig identifiziert; andernfalls null, wenn kein Wert gesetzt wurde. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ein statisches Mitglied, das einen "leeren" [EventArgs](../../system/eventargs/) Shared Pointer (Nullzeiger) darstellt. |
## Siehe auch

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
