---
title: "System::Drawing::Printing::PrintEventArgs class"
linktitle: "PrintEventArgs"
second_title: "Aspose.Page für C++"
description: "System::Drawing::Printing::PrintEventArgs class. Stellt Daten für die BeginPrint- und EndPrint-Ereignisse bereit. Objekte dieser Klasse dürfen nur mit der Funktion System::MakeObject() erstellt werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 800
url: /de/cpp/system.drawing.printing/printeventargs/
---
## PrintEventArgs class


Stellt Daten für die BeginPrint- und EndPrint-Ereignisse bereit. Objekte dieser Klasse dürfen nur mit der Funktion [System::MakeObject()](../../system/makeobject/) erstellt werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class PrintEventArgs : public System::ComponentModel::CancelEventArgs
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_PrintAction](./get_printaction/)() | Gibt einen Wert zurück, der die vom aktuellen Objekt dargestellte Druckaktion angibt. |
| [PrintEventArgs](./printeventargs/)() | Konstruiert eine neue Instanz des [PrintEventArgs](./)-Objekts. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ein statisches Mitglied, das einen "leeren" [EventArgs](../../system/eventargs/) Shared-Pointer (Null-Pointer) darstellt. |
## Siehe auch

* Class [CancelEventArgs](../../system.componentmodel/canceleventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Page for C++](../../)
