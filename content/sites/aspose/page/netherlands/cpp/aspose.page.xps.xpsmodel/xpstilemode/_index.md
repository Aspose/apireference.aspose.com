---
title: "Aspose::Page::XPS::XpsModel::XpsTileMode enum"
linktitle: "XpsTileMode"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsModel::XpsTileMode enum. Geldige waarden van de TileMode‑eigenschap van tegel‑penseel in C++."
type: docs
weight: 5500
url: /nl/cpp/aspose.page.xps.xpsmodel/xpstilemode/
---
## XpsTileMode enum


Geldige waarden van de TileMode-eigenschap van tegelkwasten.

```cpp
enum class XpsTileMode
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| None | 0 | In deze modus wordt alleen de enkele basistegel getekend. Het resterende gebied blijft transparant. |
| Tile | 1 | In deze modus wordt de basistegel getekend en wordt het resterende gebied gevuld door de basistegel te herhalen zodat de rechterrand van elke tegel aansluit op de linkerrand van de volgende, en de onderrand van elke tegel aansluit op de bovenrand van de volgende. |
| FlipX | 2 | De tegelindeling is vergelijkbaar met de Tile tile-modus, maar afwisselende kolommen van tegels worden horizontaal gedraaid. De basistegel wordt gepositioneerd zoals gespecificeerd door de viewport. Tegels in de kolommen links en rechts van deze tegel worden horizontaal gedraaid. |
| FlipY | 3 | De tegelindeling is vergelijkbaar met de Tile tile-modus, maar afwisselende rijen van tegels worden verticaal gedraaid. De basistegel wordt gepositioneerd zoals gespecificeerd door de viewport. Rijen boven en onder worden verticaal gedraaid. |
| FlipXY | 4 | De tegelindeling is vergelijkbaar met de Tile tile-modus, maar afwisselende kolommen van tegels worden horizontaal gedraaid en afwisselende rijen van tegels worden verticaal gedraaid. De basistegel wordt gepositioneerd zoals gespecificeerd door de viewport. |

## Zie ook

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
