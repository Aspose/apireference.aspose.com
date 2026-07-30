---
title: "System::Drawing::Text::PrivateFontCollection Klasse"
linktitle: "PrivateFontCollection"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Text::PrivateFontCollection Klasse. Stellt eine Sammlung von Schriftfamilien dar, die von der Client-Anwendung bereitgestellt werden. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.drawing.text/privatefontcollection/
---
## PrivateFontCollection class


Stellt eine Sammlung von Schriftfamilien dar, die von der Client-Anwendung bereitgestellt werden. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class PrivateFontCollection : public System::Drawing::Text::FontCollection
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddFont](./addfont/)(const System::ArrayPtr\<uint8_t\>\&, int) | Fügt die angegebene Schrift zur Sammlung hinzu. |
| [AddFontFile](./addfontfile/)(const String\&) | Fügt eine Schrift aus der angegebenen Datei zur Sammlung hinzu. |
| [get_Families](./get_families/)() override | Gibt ein Array von [FontFamily](../../system.drawing/fontfamily/) Objekten zurück, die mit der Schriftartsammlung verknüpft sind, die vom aktuellen Objekt dargestellt wird. |
## Siehe auch

* Class [FontCollection](../fontcollection/)
* Namespace [System::Drawing::Text](../)
* Library [Aspose.Font for C++](../../)
