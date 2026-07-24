---
title: "System::Drawing::Drawing2D::AdjustableArrowCap class"
linktitle: "AdjustableArrowCap"
second_title: "Aspose.Page für C++"
description: "System::Drawing::Drawing2D::AdjustableArrowCap class. Stellt einen verstellbaren, pfeilförmigen Linienabschluss dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.drawing.drawing2d/adjustablearrowcap/
---
## AdjustableArrowCap class


Stellt eine verstellbare, pfeilförmige Linienkappe dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class AdjustableArrowCap : public System::Drawing::Drawing2D::CustomLineCap
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AdjustableArrowCap](./adjustablearrowcap/)(float, float, bool) | Erstellt eine neue Instanz von [AdjustableArrowCap](./) mit der angegebenen Breite und Höhe. |
| [get_Filled](./get_filled/)() const | Gibt einen Wert zurück, der angibt, ob der vom aktuellen Objekt dargestellte Pfeil ausgefüllt ist. |
| [get_Height](./get_height/)() const | Gibt die Höhe des vom aktuellen Objekt dargestellten Pfeils zurück. |
| [get_MiddleInset](./get_middleinset/)() const | Legt den Abstand zwischen der Linie und der vom aktuellen Objekt dargestellten Kappe fest. |
| [get_Width](./get_width/)() const | Gibt die Breite des vom aktuellen Objekt dargestellten Pfeils zurück. |
| [set_Filled](./set_filled/)(bool) | Legt einen Wert fest, der angibt, ob der vom aktuellen Objekt dargestellte Pfeil ausgefüllt ist. |
| [set_Height](./set_height/)(float) | Legt die Höhe des vom aktuellen Objekt dargestellten Pfeils fest. |
| [set_MiddleInset](./set_middleinset/)(float) | Legt den Abstand zwischen der Linie und der vom aktuellen Objekt dargestellten Kappe fest. |
| [set_Width](./set_width/)(float) | Legt die Breite des vom aktuellen Objekt dargestellten Pfeils fest. |
## Siehe auch

* Class [CustomLineCap](../customlinecap/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
