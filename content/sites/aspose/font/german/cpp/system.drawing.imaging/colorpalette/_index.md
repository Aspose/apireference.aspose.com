---
title: "System::Drawing::Imaging::ColorPalette class"
linktitle: "ColorPalette"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Imaging::ColorPalette class. Stellt ein Set von 32‑Bit‑ARGB‑Farben dar, das eine Farbpalette bildet. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system.drawing.imaging/colorpalette/
---
## ColorPalette class


Stellt ein Set von 32‑Bit‑ARGB‑Farben dar, das eine Farbpalette bildet. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ColorPalette : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Entries](./get_entries/)() const | Gibt ein Array von [Color](../../system.drawing/color/)‑Objekten zurück, die das aktuelle Objekt repräsentieren. |
| [get_Flags](./get_flags/)() const | Gibt einen Wert zurück, der angibt, wie die Farbwerte im Farbarray interpretiert werden sollen. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
