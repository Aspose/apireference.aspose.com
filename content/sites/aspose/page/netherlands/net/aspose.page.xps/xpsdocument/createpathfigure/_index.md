---
title: XpsDocument.CreatePathFigure
second_title: Aspose.Page voor .NET API-referentie
description: XpsDocument methode. Creëert een nieuwe padfiguur.
type: docs
weight: 280
url: /nl/net/aspose.page.xps/xpsdocument/createpathfigure/
---
## CreatePathFigure(PointF, bool) {#createpathfigure}

Creëert een nieuwe padfiguur.

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, bool isClosed = false)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| startPoint | PointF | Het startpunt voor het eerste segment van de padfiguur. |
| isClosed | Boolean | Geeft aan of het pad gesloten is. Indien ingesteld op waar, wordt de lijn getekend "gesloten", dat wil zeggen, het laatste punt in het laatste segment van de padfiguur is verbonden met het punt dat is opgegeven in het StartPoint-attribuut, anders wordt de lijn "open" getekend en de laatste punt is niet verbonden met het startpunt. Alleen van toepassing als het padcijfer is wordt gebruikt in een {Path}-element dat een streek specificeert. |

### Winstwaarde

Nieuw pad figuur.

### Zie ook

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsDocument](../)
* naamruimte [Aspose.Page.XPS](../../xpsdocument/)
* montage [Aspose.Page](../../../)

---

## CreatePathFigure(PointF, List&lt;XpsPathSegment&gt;, bool) {#createpathfigure_1}

Creëert een nieuwe padfiguur.

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, List<XpsPathSegment> segments, 
    bool isClosed = false)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| startPoint | PointF | Het startpunt voor het eerste segment van de padfiguur. |
| segments | List`1 | Lijst met padsegmenten. |
| isClosed | Boolean | Geeft aan of het pad gesloten is. Indien ingesteld op waar, wordt de lijn getekend "gesloten", dat wil zeggen, het laatste punt in het laatste segment van de padfiguur is verbonden met het punt dat is opgegeven in het StartPoint-attribuut, anders wordt de lijn "open" getekend en de laatste punt is niet verbonden met het startpunt. Alleen van toepassing als het padcijfer is wordt gebruikt in een {Path}-element dat een streek specificeert. |

### Winstwaarde

Nieuw pad figuur.

### Zie ook

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* class [XpsDocument](../)
* naamruimte [Aspose.Page.XPS](../../xpsdocument/)
* montage [Aspose.Page](../../../)


