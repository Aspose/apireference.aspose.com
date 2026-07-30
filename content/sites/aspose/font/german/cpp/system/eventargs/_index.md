---
title: "System::EventArgs Klasse"
linktitle: "EventArgs"
second_title: "Aspose.Font für C++"
description: "System::EventArgs class. Die Basisklasse für Klassen, die einen Kontext darstellen, der an die Ereignisabonnenten übergeben wird, wenn ein Ereignis ausgelöst wird. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2500
url: /de/cpp/system/eventargs/
---
## EventArgs class


Die Basisklasse für Klassen, die einen Kontext darstellen, der an die Ereignisabonnenten übergeben wird, wenn ein Ereignis ausgelöst wird. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class EventArgs : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [EventArgs](./eventargs/)() | Konstruktor. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](./empty/) | Ein statisches Mitglied, das einen „leeren“ [EventArgs](./) Shared‑Pointer (Null‑Pointer) darstellt. |
## Siehe auch

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
