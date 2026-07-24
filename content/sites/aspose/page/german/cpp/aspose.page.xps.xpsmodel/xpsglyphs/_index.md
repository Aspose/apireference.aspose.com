---
title: "Aspose::Page::XPS::XpsModel::XpsGlyphs Klasse"
linktitle: "XpsGlyphs"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsModel::XpsGlyphs Klasse. Klasse, die die Eigenschaften des Glyphen-Elements kapselt. Dieses Element stellt einen Lauf von einheitlich formatiertem Text aus einer einzigen Schriftart dar. Es liefert die für eine genaue Darstellung notwendigen Informationen und unterstützt Such- und Auswahlfunktionen in Anzeige‑Clients in C++."
type: docs
weight: 1500
url: /de/cpp/aspose.page.xps.xpsmodel/xpsglyphs/
---
## XpsGlyphs class


Klasse, die Glyphs-Elementeigenschaften kapselt. Dieses Element stellt einen Lauf von einheitlich formatiertem Text aus einer einzigen Schriftart dar. Es liefert die für eine genaue Darstellung notwendigen Informationen und unterstützt Such- und Auswahlfunktionen in Anzeige‑Clients.

```cpp
class XpsGlyphs : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() | Klonen Sie diese Glyphen. |
| [get_BidiLevel](./get_bidilevel/)() const | Gibt zurück/legt fest den Wert, der die bidirektionale Verschachtelungsebene des Unicode-Algorithmus angibt. Gerade Werte implizieren ein Layout von links nach rechts, ungerade Werte ein Layout von rechts nach links. Ein Layout von rechts nach links positioniert den Ursprung des Laufs an der rechten Seite des ersten Glyphen, wobei positive Vorwärtsbreiten (die Fortschritte nach links darstellen) nachfolgende Glyphen links vom vorherigen Glyphen platzieren. |
| [get_Fill](./get_fill/)() | Gibt zurück/legt fest den Pinsel, der zum Füllen der Form der gerenderten Glyphen verwendet wird. |
| [get_Font](./get_font/)() | Gibt die Schriftartressource für die **TrueType**‑Schrift zurück, die zum Setzen des Textes von Elementen verwendet wird. |
| [get_FontRenderingEmSize](./get_fontrenderingemsize/)() const | Gibt zurück/legt fest die Schriftgröße in Einheiten der Zeichenfläche, ausgedrückt als Fließkommazahl in Einheiten des effektiven Koordinatenraums. |
| [get_Indices](./get_indices/)() |  |
| [get_IsSideways](./get_issideways/)() const | Gibt den Wert zurück bzw. setzt ihn, der anzeigt, dass ein Glyph seitlich gedreht ist, wobei der Ursprung als obere Mitte des nicht gedrehten Glyphs definiert wird. |
| [get_OriginX](./get_originx/)() const | Gibt die x‑Koordinate des ersten Glyphs im Lauf zurück bzw. setzt sie, gemessen in Einheiten des effektiven Koordinatenraums. |
| [get_OriginY](./get_originy/)() const | Gibt die y‑Koordinate des ersten Glyphs im Lauf zurück bzw. setzt sie, gemessen in Einheiten des effektiven Koordinatenraums. |
| [get_StyleSimulations](./get_stylesimulations/)() const | Gibt den Wert zurück bzw. setzt ihn, der eine Stil‑Simulation angibt. |
| [get_UnicodeString](./get_unicodestring/)() const | Gibt die vom Glyphs‑Element gerenderte Textzeichenfolge zurück bzw. setzt sie. Der Text wird als Unicode‑Codepunkte angegeben. |
| [set_BidiLevel](./set_bidilevel/)(int32_t) | Gibt zurück/legt fest den Wert, der die bidirektionale Verschachtelungsebene des Unicode-Algorithmus angibt. Gerade Werte implizieren ein Layout von links nach rechts, ungerade Werte ein Layout von rechts nach links. Ein Layout von rechts nach links positioniert den Ursprung des Laufs an der rechten Seite des ersten Glyphen, wobei positive Vorwärtsbreiten (die Fortschritte nach links darstellen) nachfolgende Glyphen links vom vorherigen Glyphen platzieren. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | Gibt zurück/legt fest den Pinsel, der zum Füllen der Form der gerenderten Glyphen verwendet wird. |
| [set_FontRenderingEmSize](./set_fontrenderingemsize/)(float) | Gibt zurück/legt fest die Schriftgröße in Einheiten der Zeichenfläche, ausgedrückt als Fließkommazahl in Einheiten des effektiven Koordinatenraums. |
| [set_Indices](./set_indices/)(System::SharedPtr\<System::Collections::Generic::SortedList\<int32_t, System::SharedPtr\<XpsGlyphMapping\>\>\>) |  |
| [set_IsSideways](./set_issideways/)(bool) | Gibt den Wert zurück bzw. setzt ihn, der anzeigt, dass ein Glyph seitlich gedreht ist, wobei der Ursprung als obere Mitte des nicht gedrehten Glyphs definiert wird. |
| [set_OriginX](./set_originx/)(float) | Gibt die x‑Koordinate des ersten Glyphs im Lauf zurück bzw. setzt sie, gemessen in Einheiten des effektiven Koordinatenraums. |
| [set_OriginY](./set_originy/)(float) | Gibt die y‑Koordinate des ersten Glyphs im Lauf zurück bzw. setzt sie, gemessen in Einheiten des effektiven Koordinatenraums. |
| [set_StyleSimulations](./set_stylesimulations/)(XpsStyleSimulations) | Gibt den Wert zurück bzw. setzt ihn, der eine Stil‑Simulation angibt. |
| [set_UnicodeString](./set_unicodestring/)(System::String) | Gibt die vom Glyphs‑Element gerenderte Textzeichenfolge zurück bzw. setzt sie. Der Text wird als Unicode‑Codepunkte angegeben. |
## Siehe auch

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
