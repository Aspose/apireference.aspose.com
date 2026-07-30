---
title: "System::Drawing::Icon Klasse"
linktitle: "Icon"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Icon Klasse. Stellt ein Windows‑Symbol dar. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1100
url: /de/cpp/system.drawing/icon/
---
## Icon class


Stellt ein [Windows](../../system.windows/)-Symbol dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Icon : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Height](./get_height/)() const | Gibt die Höhe des Symbols zurück. |
| [get_Width](./get_width/)() const | Gibt die Breite des Symbols zurück. |
| [Icon](./icon/)(const String\&) | Konstruiert eine neue Instanz der [Icon](./)-Klasse, die ein Symbol aus der angegebenen Datei darstellt. |
| [ToBitmap](./tobitmap/)() | Konvertiert das aktuelle Objekt in ein [Bitmap](../bitmap/)-Objekt. |
| virtual [~Icon](./~icon/)() | Destruktor. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
