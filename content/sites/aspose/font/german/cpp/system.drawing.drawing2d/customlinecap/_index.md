---
title: "System::Drawing::Drawing2D::CustomLineCap Klasse"
linktitle: "CustomLineCap"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Drawing2D::CustomLineCap Klasse. Stellt eine benutzerdefinierte Linienabschlussform dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system.drawing.drawing2d/customlinecap/
---
## CustomLineCap class


Stellt eine benutzerdefinierte Linienabschlussform dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class CustomLineCap : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Clone](./clone/)() | Gibt eine Kopie des aktuellen Objekts zurück. |
| [CustomLineCap](./customlinecap/)(const SharedPtr\<GraphicsPath\>\&, const SharedPtr\<GraphicsPath\>\&, LineCap, float) | Konstruiert eine neue Instanz der Klasse [CustomLineCap](./), die eine benutzerdefinierte Linienabschlussform mit den angegebenen Eigenschaften darstellt. |
| [Dispose](./dispose/)() | Gibt alle vom aktuellen Objekt erworbenen Betriebssystemressourcen frei. |
| [get_BaseCap](./get_basecap/)() const | Gibt den Basislinienabschluss zurück, aus dem dieser benutzerdefinierte Abschluss erstellt wird. |
| [get_BaseInset](./get_baseinset/)() const | Gibt den Abstand zwischen der Linie und dem Abschluss zurück. |
| [get_StrokeJoin](./get_strokejoin/)() const | Gibt den Wert [LineJoin](../linejoin/) zurück, der bestimmt, wie die Linien dieses benutzerdefinierten Abschlusses verbunden werden. |
| [get_WidthScale](./get_widthscale/)() const | Gibt die Skalierung dieses benutzerdefinierten Abschlusses zurück. |
| [GetStrokeCaps](./getstrokecaps/)(LineCap\&, LineCap\&) | Ermittelt die Anfangs- und Endlinienabschlüsse des durch das aktuelle Objekt dargestellten benutzerdefinierten Abschlusses. |
| [set_BaseCap](./set_basecap/)(LineCap) | Setzt den Basislinienabschlusswert für diesen benutzerdefinierten Abschluss. |
| [set_BaseInset](./set_baseinset/)(float) | Setzt den Abstand zwischen der Linie und dem Abschluss. |
| [set_StrokeJoin](./set_strokejoin/)(LineJoin) | Setzt den Wert [LineJoin](../linejoin/), der bestimmt, wie die Linien dieses benutzerdefinierten Abschlusses verbunden werden. |
| [set_WidthScale](./set_widthscale/)(float) | Setzt den Skalierungswert dieses benutzerdefinierten Abschlusses. |
| [SetStrokeCaps](./setstrokecaps/)(LineCap, LineCap) | Setzt die Anfangs- und Endlinienabschlüsse des durch das aktuelle Objekt dargestellten benutzerdefinierten Abschlusses. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
