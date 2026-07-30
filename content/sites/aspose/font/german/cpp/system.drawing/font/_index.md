---
title: "System::Drawing::Font Klasse"
linktitle: "Font"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Font Klasse. Stellt ein bestimmtes Format für Text dar, einschließlich Schriftart, Größe und Stil. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 700
url: /de/cpp/system.drawing/font/
---
## Font class


Stellt ein bestimmtes Format für Text dar, einschließlich Schriftart, Größe und Stil. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Font : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() | Gibt eine Kopie der aktuellen Schrift zurück. |
| [Dispose](./dispose/)() | Gibt alle vom aktuellen Objekt erworbenen Betriebssystemressourcen frei. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Bestimmt, ob das aktuelle und das angegebene Objekt identisch sind. |
| [Font](./font/)(const SharedPtr\<Font\>\&, FontStyle) | Konstruiert eine neue Instanz der [Font](./)-Klasse, die die angegebene vorhandene Schrift mit dem angegebenen Schriftstil darstellt. |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | Konstruiert eine neue Instanz der [Font](./)-Klasse. |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, GraphicsUnit) | Konstruiert eine neue Instanz der [Font](./)-Klasse. |
| [Font](./font/)(const String\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | Konstruiert eine neue Instanz der [Font](./)-Klasse. |
| [Font](./font/)(const String\&, float, GraphicsUnit) | Konstruiert eine neue Instanz der [Font](./)-Klasse. |
| static [FromLogFont](./fromlogfont/)(const SharedPtr\<Object\>\&) | NICHT IMPLEMENTIERT. |
| [get_Bold](./get_bold/)() | Bestimmt, ob die vom aktuellen Objekt dargestellte Schrift den Fettdruckstil angewendet hat. |
| [get_FontFamily](./get_fontfamily/)() | Gibt die Schriftfamilie der vom aktuellen Objekt dargestellten Schrift zurück. |
| [get_FontStyle](./get_fontstyle/)() | Gibt den Schriftstil der vom aktuellen Objekt dargestellten Schrift zurück. |
| [get_GdiCharSet](./get_gdicharset/)() | Gibt einen Wert zurück, der den von der vom aktuellen Objekt dargestellten Schrift verwendeten GDI-Zeichensatz angibt. |
| [get_Height](./get_height/)() | Gibt den Zeilenabstand der vom aktuellen Objekt dargestellten Schrift in Pixeln zurück. |
| [get_Italic](./get_italic/)() | Bestimmt, ob die vom aktuellen Objekt dargestellte Schrift den Kursivstil angewendet hat. |
| [get_Name](./get_name/)() | Gibt den Schriftartnamen der vom aktuellen Objekt dargestellten Schrift zurück. |
| [get_OriginalFontName](./get_originalfontname/)() | Gibt den ursprünglich angegebenen Namen der Schrift zurück. |
| [get_Size](./get_size/)() | Gibt die Em-Größe der vom aktuellen Objekt dargestellten Schrift zurück, gemessen in den durch die Unit‑Eigenschaft angegebenen Einheiten. |
| [get_SizeInPoints](./get_sizeinpoints/)() | Gibt die Em-Größe der vom aktuellen Objekt dargestellten Schriftart in Punkten zurück. |
| [get_Strikeout](./get_strikeout/)() | Bestimmt, ob die vom aktuellen Objekt dargestellte Schriftart den Durchgestrichen-Stil angewendet hat. |
| [get_Style](./get_style/)() | Gibt den Schriftstil der vom aktuellen Objekt dargestellten Schriftart zurück. |
| [get_Underline](./get_underline/)() | Bestimmt, ob die vom aktuellen Objekt dargestellte Schriftart den Unterstrichen-Stil angewendet hat. |
| [get_Unit](./get_unit/)() | Gibt die Maßeinheit für die vom aktuellen Objekt dargestellte Schriftart zurück. |
| [GetHeight](./getheight/)(const SharedPtr\<Graphics\>\&) | Gibt den Zeilenabstand der vom aktuellen Objekt dargestellten Schriftart zurück, in der aktuellen Einheit eines angegebenen [Graphics](../graphics/)-Objekts. |
| [GetHeight](./getheight/)(float) | Gibt die Höhe der vom aktuellen Objekt dargestellten Schriftart zurück, wenn sie auf einem Anzeigegerät mit der angegebenen vertikalen Auflösung gezeichnet wird. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
