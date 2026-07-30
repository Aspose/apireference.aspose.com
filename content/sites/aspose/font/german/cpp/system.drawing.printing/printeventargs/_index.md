---
title: "System::Drawing::Printing::PrintEventArgs Klasse"
linktitle: "PrintEventArgs"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Printing::PrintEventArgs Klasse. Stellt Daten für die BeginPrint- und EndPrint-Ereignisse bereit. Objekte dieser Klasse sollten nur über die System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 800
url: /de/cpp/system.drawing.printing/printeventargs/
---
## PrintEventArgs class


Stellt Daten für die BeginPrint- und EndPrint-Ereignisse bereit. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/) Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class PrintEventArgs : public System::ComponentModel::CancelEventArgs
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_PrintAction](./get_printaction/)() | Gibt einen Wert zurück, der eine Druckaktion angibt, die vom aktuellen Objekt repräsentiert wird. |
| [PrintEventArgs](./printeventargs/)() | Konstruiert eine neue Instanz des [PrintEventArgs](./) Objekts. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ein statisches Mitglied, das einen "leeren" [EventArgs](../../system/eventargs/) Shared Pointer (Nullzeiger) darstellt. |
## Siehe auch

* Class [CancelEventArgs](../../system.componentmodel/canceleventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Font for C++](../../)
