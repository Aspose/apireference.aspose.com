---
title: "System::Drawing::SolidBrush Klasse"
linktitle: "SolidBrush"
second_title: "Aspose.Font für C++"
description: "System::Drawing::SolidBrush Klasse. Stellt einen einfarbigen Pinsel dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2400
url: /de/cpp/system.drawing/solidbrush/
---
## SolidBrush class


Stellt einen einfarbigen Pinsel dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class SolidBrush : public System::Drawing::Brush
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() override | Erstellt eine Kopie des aktuellen Objekts. |
| [get_Color](./get_color/)() const | Gibt die Farbe dieses Pinsels zurück. |
| [set_Color](./set_color/)(Color) | Setzt die Farbe dieses Pinsels. |
| [SolidBrush](./solidbrush/)(const Color\&) | Erstellt ein neues [SolidBrush](./)-Objekt und initialisiert es mit der angegebenen Farbe. |
## Siehe auch

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
