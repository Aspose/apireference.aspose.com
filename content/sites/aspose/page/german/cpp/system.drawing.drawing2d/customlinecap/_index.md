---
title: "System::Drawing::Drawing2D::CustomLineCap Klasse"
linktitle: "CustomLineCap"
second_title: "Aspose.Page für C++"
description: "System::Drawing::Drawing2D::CustomLineCap Klasse. Stellt eine benutzerdefinierte Linienkappe dar. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system.drawing.drawing2d/customlinecap/
---
## CustomLineCap class


Stellt eine benutzerdefinierte Linienkappe dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class CustomLineCap : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Clone](./clone/)() | Gibt eine Kopie des aktuellen Objekts zurück. |
| [CustomLineCap](./customlinecap/)(const SharedPtr\<GraphicsPath\>\&, const SharedPtr\<GraphicsPath\>\&, LineCap, float) | Konstruiert eine neue Instanz der Klasse [CustomLineCap](./), die eine benutzerdefinierte Linienkappe mit den angegebenen Eigenschaften darstellt. |
| [Dispose](./dispose/)() | Gibt alle vom aktuellen Objekt erworbenen Betriebssystemressourcen frei. |
| [get_BaseCap](./get_basecap/)() const | Gibt die Basis-Linienkappe zurück, aus der diese benutzerdefinierte Kappe erstellt wird. |
| [get_BaseInset](./get_baseinset/)() const | Gibt den Abstand zwischen der Linie und der Kappe zurück. |
| [get_StrokeJoin](./get_strokejoin/)() const | Gibt den [LineJoin](../linejoin/)-Wert zurück, der bestimmt, wie die Linien dieser benutzerdefinierten Kappe verbunden werden. |
| [get_WidthScale](./get_widthscale/)() const | Gibt die Skalierung dieser benutzerdefinierten Kappe zurück. |
| [GetStrokeCaps](./getstrokecaps/)(LineCap\&, LineCap\&) | Liest die Anfangs- und Endlinienkappen der vom aktuellen Objekt dargestellten benutzerdefinierten Kappe. |
| [set_BaseCap](./set_basecap/)(LineCap) | Setzt den Basis-Linienkappenwert für diese benutzerdefinierte Kappe. |
| [set_BaseInset](./set_baseinset/)(float) | Setzt den Abstand zwischen der Linie und der Kappe. |
| [set_StrokeJoin](./set_strokejoin/)(LineJoin) | Setzt den [LineJoin](../linejoin/)-Wert, der bestimmt, wie die Linien dieser benutzerdefinierten Kappe verbunden werden. |
| [set_WidthScale](./set_widthscale/)(float) | Setzt den Skalierungswert dieser benutzerdefinierten Kappe. |
| [SetStrokeCaps](./setstrokecaps/)(LineCap, LineCap) | Setzt die Anfangs- und Endlinienkappen der vom aktuellen Objekt dargestellten benutzerdefinierten Kappe. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
