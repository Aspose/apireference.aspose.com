---
title: "System::Drawing::ColorTranslator Klasse"
linktitle: "ColorTranslator"
second_title: "Aspose.Page für C++"
description: "System::Drawing::ColorTranslator Klasse. Führt Farbumwandlungen durch. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 600
url: /de/cpp/system.drawing/colortranslator/
---
## ColorTranslator class


Führt Farbumwandlungen durch. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class ColorTranslator
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [FromHtml](./fromhtml/)(const System::String\&) | Konvertiert die angegebene HTML-Farbrepräsentation in das entsprechende [Color](../color/)-Objekt. |
| static [FromWin32](./fromwin32/)(int) | Konvertiert die angegebene [Windows](../../system.windows/)-Farbe in das entsprechende [Color](../color/)-Objekt. |
| static [ToHtml](./tohtml/)(const Color\&) | Konvertiert das angegebene [Color](../color/)-Objekt in die Zeichenkettenrepräsentation der entsprechenden HTML-Farbe. |
## Siehe auch

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
