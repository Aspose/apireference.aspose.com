---
title: Enum XpsFillRule
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.XPS.XpsModel.XpsFillRule opsomming. Geldige waarden van de eigenschap FillRule van het PathGeometryelement.
type: docs
weight: 3070
url: /nl/net/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enumeration

Geldige waarden van de eigenschap FillRule van het PathGeometry-element.

```csharp
public enum XpsFillRule
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| EvenOdd | `0` | Deze regel bepaalt de "insideness" van een punt op het canvas door een straal van het punt naar oneindig in elke richting te tekenen en het aantal segmenten te tellen van de gegeven vorm die de straal doorkruist. Als dit getal oneven is, is het punt binnen; als het even is, ligt het punt buiten. |
| NonZero | `1` | Deze regel bepaalt de "insideness" van een punt op het canvas door een straal van het punt naar oneindig in elke richting te tekenen en vervolgens de plaatsen te onderzoeken waar een segment van de vorm de straal kruist. Beginnend met een telling van nul, tel er één op elke keer dat een segment de straal van links naar rechts kruist en trek er één af telkens een padsegment de straal van rechts naar links kruist. Na het tellen van de kruisingen, als het resultaat nul is, ligt het punt buiten het pad; anders is het binnen. |

### Zie ook

* naamruimte [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* montage [Aspose.Page](../../)


