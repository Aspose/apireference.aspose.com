---
title: "System::Drawing::Drawing2D::ColorBlend class"
linktitle: "ColorBlend"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Drawing2D::ColorBlend class. Enthält Arrays von Farben und Positionen, die zum Interpolieren von Farbmischungen in einem mehrfarbigen Verlauf verwendet werden. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.drawing.drawing2d/colorblend/
---
## ColorBlend class


Enthält Arrays von Farben und Positionen, die zum Interpolieren von Farbmischungen in einem mehrfarbigen Verlauf verwendet werden. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ColorBlend : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ColorBlend](./colorblend/)() | Konstruiert eine neue Instanz der Klasse [ColorBlend](./). |
| [ColorBlend](./colorblend/)(int) | Konstruiert eine neue Instanz der Klasse [Blend](../blend/). |
| [get_Colors](./get_colors/)() | Gibt ein Array von Farben zurück, das an den entsprechenden Positionen entlang eines Verlaufs verwendet wird. |
| [get_Positions](./get_positions/)() | Gibt das Array der Mischpositionen entlang eines Farbverlaufs zurück. |
| [set_Colors](./set_colors/)(const ArrayPtr\<Color\>\&) | Legt ein Array von Farben fest, das an den entsprechenden Positionen entlang eines Farbverlaufs verwendet wird. |
| [set_Positions](./set_positions/)(const ArrayPtr\<float\>\&) | Legt das Array der Mischpositionen entlang eines Farbverlaufs fest. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
