---
title: "System::ComponentModel::PropertyChangedEventArgs Klasse"
linktitle: "PropertyChangedEventArgs"
second_title: "Aspose.Font für C++"
description: "System::ComponentModel::PropertyChangedEventArgs Klasse. Argumente des PropertyChanged-Ereignisses. Objekte dieser Klasse sollten nur über die System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1200
url: /de/cpp/system.componentmodel/propertychangedeventargs/
---
## PropertyChangedEventArgs class


Argumente des PropertyChanged-Ereignisses. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/) Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class PropertyChangedEventArgs : public System::EventArgs
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [get_PropertyName](./get_propertyname/)() | RTTI-Informationen. |
| [PropertyChangedEventArgs](./propertychangedeventargs/)(const String\&) | Initialisiert die Argumente des PropertyChanged-Ereignisses. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ein statisches Mitglied, das einen "leeren" [EventArgs](../../system/eventargs/) Shared Pointer (Nullzeiger) darstellt. |
## Siehe auch

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
