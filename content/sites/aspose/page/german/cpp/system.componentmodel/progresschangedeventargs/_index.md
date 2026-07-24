---
title: "System::ComponentModel::ProgressChangedEventArgs Klasse"
linktitle: "ProgressChangedEventArgs"
second_title: "Aspose.Page für C++"
description: "System::ComponentModel::ProgressChangedEventArgs Klasse. Eine Instanz dieser Klasse wird als Argument an den ProgressChangedEventHandler-Delegaten übergeben. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1100
url: /de/cpp/system.componentmodel/progresschangedeventargs/
---
## ProgressChangedEventArgs class


Eine Instanz dieser Klasse wird als Argument an den ProgressChangedEventHandler-Delegaten übergeben. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ProgressChangedEventArgs : public System::EventArgs
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_ProgressPercentage](./get_progresspercentage/)() const | Gibt den Fortschrittsprozentsatz der asynchronen Aufgabe zurück. |
| [get_UserState](./get_userstate/)() const | Gibt einen eindeutigen Benutzerzustand zurück. |
| [ProgressChangedEventArgs](./progresschangedeventargs/)(int, System::SharedPtr\<System::Object\>) | Konstruktor. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ein statisches Mitglied, das einen "leeren" [EventArgs](../../system/eventargs/) Shared-Pointer (Null-Pointer) darstellt. |
## Siehe auch

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
