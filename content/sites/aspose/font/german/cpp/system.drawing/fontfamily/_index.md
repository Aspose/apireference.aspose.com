---
title: "System::Drawing::FontFamily Klasse"
linktitle: "FontFamily"
second_title: "Aspose.Font für C++"
description: "System::Drawing::FontFamily Klasse. Stellt eine Gruppe von Schriftarten dar, die ein ähnliches Grunddesign teilen. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 900
url: /de/cpp/system.drawing/fontfamily/
---
## FontFamily class


Stellt eine Gruppe von Schriftarten dar, die ein ähnliches Grunddesign teilen. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class FontFamily : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() | Gibt eine Kopie des aktuellen [FontFamily](./)-Objekts zurück. |
| [Dispose](./dispose/)() | Gibt alle vom aktuellen Objekt erworbenen Betriebssystemressourcen frei. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Bestimmt, ob das aktuelle und das angegebene Objekt identisch sind. |
| [FontFamily](./fontfamily/)(const String\&) | Konstruiert eine neue Instanz der Klasse [FontFamily](./), die eine Schriftfamilie mit dem angegebenen Namen darstellt. |
| [FontFamily](./fontfamily/)(const String\&, const SharedPtr\<Text::FontCollection\>\&) | Konstruiert eine neue Instanz von [FontFamily](./) in der angegebenen FontCollection mit dem angegebenen Namen. |
| [FontFamily](./fontfamily/)(Text::GenericFontFamilies) | Konstruiert eine neue Instanz von [FontFamily](./) aus der angegebenen generischen Schriftfamilie. |
| static [get_Families](./get_families/)() | Gibt ein Array zurück, das alle [FontFamily](./)-Objekte enthält, die dem aktuellen Grafik‑Kontext zugeordnet sind. |
| static [get_GenericMonospace](./get_genericmonospace/)() | Gibt ein [FontFamily](./)-Objekt zurück, das eine generische Monospace‑Schriftfamilie darstellt. |
| static [get_GenericSansSerif](./get_genericsansserif/)() | Gibt ein [FontFamily](./)-Objekt zurück, das eine generische Sans‑Serif‑Schriftfamilie darstellt. |
| static [get_GenericSerif](./get_genericserif/)() | Gibt ein [FontFamily](./)-Objekt zurück, das eine generische Serif‑Schriftfamilie darstellt. |
| [get_Name](./get_name/)() const | Gibt den Namen der vom aktuellen Objekt dargestellten Schriftfamilie zurück. |
| [GetCellAscent](./getcellascent/)(FontStyle) | Gibt den Zellaufstieg der vom aktuellen Objekt dargestellten Schriftfamilie für den angegebenen Schriftsstil zurück. |
| [GetCellDescent](./getcelldescent/)(FontStyle) | Gibt den Zelltiefgang der vom aktuellen Objekt dargestellten Schriftfamilie für den angegebenen Schriftsstil zurück. |
| [GetEmHeight](./getemheight/)(FontStyle) | Gibt die Höhe des Em‑Quadrats in Schrift‑Design‑Einheiten für den angegebenen Stil zurück. |
| [GetLineSpacing](./getlinespacing/)(FontStyle) | Gibt den Zeilenabstand der vom aktuellen Objekt dargestellten Schriftfamilie für den angegebenen Schriftsstil zurück. |
| [GetName](./getname/)(int) const | Gibt den Namen der vom aktuellen Objekt dargestellten Schriftfamilie zurück. |
| [IsStyleAvailable](./isstyleavailable/)(FontStyle) | Bestimmt, ob der angegebene Schriftsstil verfügbar ist. |
| virtual [~FontFamily](./~fontfamily/)() | Destruktor. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
