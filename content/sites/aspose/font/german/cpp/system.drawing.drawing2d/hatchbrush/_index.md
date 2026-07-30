---
title: "System::Drawing::Drawing2D::HatchBrush class"
linktitle: "HatchBrush"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Drawing2D::HatchBrush class. Stellt einen rechteckigen Pinsel mit einem Schraffurstil, einer Vordergrundfarbe und einer Hintergrundfarbe dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 800
url: /de/cpp/system.drawing.drawing2d/hatchbrush/
---
## HatchBrush class


Stellt einen rechteckigen Pinsel mit einem Schraffurstil, einer Vordergrundfarbe und einer Hintergrundfarbe dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HatchBrush : public System::Drawing::Brush
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() override | Erstellt eine exakte Kopie des aktuellen Objekts. |
| [get_BackgroundColor](./get_backgroundcolor/)() const | Gibt einen Wert zurück, der die Hintergrundfarbe dieses Pinsels angibt. |
| [get_ForegroundColor](./get_foregroundcolor/)() const | Gibt einen Wert zurück, der die Vordergrundfarbe dieses Pinsels angibt. |
| [get_HatchStyle](./get_hatchstyle/)() const | Gibt einen Wert zurück, der den Schraffurstil dieses Pinsels angibt. |
| [HatchBrush](./hatchbrush/)(HatchStyle, Color, Color) | RTTI-Informationen. |
## Siehe auch

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
