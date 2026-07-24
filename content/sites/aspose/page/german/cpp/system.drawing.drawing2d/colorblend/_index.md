---
title: "System::Drawing::Drawing2D::ColorBlend class"
linktitle: "ColorBlend"
second_title: "Aspose.Page für C++"
description: "System::Drawing::Drawing2D::ColorBlend class. Enthält Arrays von Farben und Positionen, die für die Interpolation von Farbmischungen in einem mehrfarbigen Verlauf verwendet werden. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.drawing.drawing2d/colorblend/
---
## ColorBlend class


Enthält Arrays von Farben und Positionen, die für die Interpolation von Farbmischungen in einem mehrfarbigen Verlauf verwendet werden. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ColorBlend : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ColorBlend](./colorblend/)() | Konstruiert eine neue Instanz der Klasse [ColorBlend](./). |
| [ColorBlend](./colorblend/)(int) | Konstruiert eine neue Instanz der Klasse [Blend](../blend/). |
| [get_Colors](./get_colors/)() | Gibt ein Array von Farben zurück, das an den entsprechenden Positionen entlang eines Verlaufs verwendet wird. |
| [get_Positions](./get_positions/)() | Gibt das Array der Mischpositionen entlang eines Verlaufs zurück. |
| [set_Colors](./set_colors/)(const ArrayPtr\<Color\>\&) | Setzt ein Array von Farben, das an den entsprechenden Positionen entlang eines Verlaufs verwendet wird. |
| [set_Positions](./set_positions/)(const ArrayPtr\<float\>\&) | Setzt das Array der Mischpositionen entlang eines Verlaufs. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
