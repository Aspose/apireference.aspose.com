---
title: "Aspose::Page::XPS::XpsModel::XpsFillRule enum"
linktitle: "XpsFillRule"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsModel::XpsFillRule enum. Geldige waarden van de FillRule‑eigenschap van het PathGeometry‑element in C++."
type: docs
weight: 4900
url: /nl/cpp/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enum


Geldige waarden van de FillRule-eigenschap van het PathGeometry-element.

```cpp
enum class XpsFillRule
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| EvenOdd | 0 | Deze regel bepaalt de “insideness” van een punt op het canvas door een straal van het punt naar oneindig te tekenen in een willekeurige richting en het aantal segmenten van de gegeven vorm te tellen dat de straal kruist. Als dit aantal oneven is, bevindt het punt zich binnen; als het even is, bevindt het punt zich buiten. |
| NonZero | 1 | Deze regel bepaalt de “insideness” van een punt op het canvas door een straal van het punt naar oneindig te tekenen in een willekeurige richting en vervolgens de plaatsen te onderzoeken waar een segment van de vorm de straal kruist. Beginnend met een teller van nul, voeg één toe elke keer dat een segment de straal van links naar rechts kruist en trek één af elke keer dat een padsegment de straal van rechts naar links kruist. Na het tellen van de kruisingen, als het resultaat nul is, bevindt het punt zich buiten het pad; anders bevindt het zich binnen. |

## Zie ook

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
