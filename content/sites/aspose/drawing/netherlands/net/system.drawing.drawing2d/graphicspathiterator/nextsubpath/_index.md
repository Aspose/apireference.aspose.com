---
title: GraphicsPathIterator.NextSubpath
second_title: Aspose.Drawing voor .NET API-referentie
description: GraphicsPathIterator methode. Verplaatst deGraphicsPathIterator naar het volgende subpad in het pad. De startindex en eindindex van het volgende subpad zijn opgenomen in de out parameters.
type: docs
weight: 100
url: /nl/net/system.drawing.drawing2d/graphicspathiterator/nextsubpath/
---
## NextSubpath(out int, out int, out bool) {#nextsubpath}

Verplaatst de[`GraphicsPathIterator`](../) naar het volgende subpad in het pad. De startindex en eindindex van het volgende subpad zijn opgenomen in de [out] parameters.

```csharp
public int NextSubpath(out int startIndex, out int endIndex, out bool isClosed)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| startIndex | Int32& | [uit] Ontvangt de startindex van het volgende subpad. |
| endIndex | Int32& | [uit] Ontvangt de eindindex van het volgende subpad. |
| isClosed | Boolean& | [uit] Geeft aan of het subpad is afgesloten. |

### Winstwaarde

Het aantal gegevenspunten in de opgehaalde figuur (subpad). Als er geen cijfers meer zijn om op te halen, wordt nul geretourneerd.

### Zie ook

* class [GraphicsPathIterator](../)
* naamruimte [System.Drawing.Drawing2D](../../graphicspathiterator/)
* montage [Aspose.Drawing](../../../)

---

## NextSubpath(GraphicsPath, out bool) {#nextsubpath_1}

Haalt het volgende cijfer (subpad) uit het bijbehorende pad hiervan[`GraphicsPathIterator`](../) .

```csharp
public int NextSubpath(GraphicsPath path, out bool isClosed)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | GraphicsPath | A[`GraphicsPath`](../../graphicspath/) dat wil zeggen dat de gegevenspunten zo zijn ingesteld dat ze overeenkomen met de gegevenspunten van de opgehaalde figuur (subpad) voor deze iterator. |
| isClosed | Boolean& | [uit] Geeft aan of het huidige subpad is afgesloten. Het is waar als het cijfer gesloten is, anders is het onwaar. |

### Winstwaarde

Het aantal gegevenspunten in de opgehaalde figuur (subpad). Als er geen cijfers meer zijn om op te halen, wordt nul geretourneerd.

### Zie ook

* class [GraphicsPath](../../graphicspath/)
* class [GraphicsPathIterator](../)
* naamruimte [System.Drawing.Drawing2D](../../graphicspathiterator/)
* montage [Aspose.Drawing](../../../)


