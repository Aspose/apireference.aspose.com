---
title: Feature.SetValues
second_title: Aspose.GIS voor .NET API-referentie
description: Feature methode. Stelt nieuwe waarden in voor alle attributen. Overweeg ook omCopyValues methode om instellingswaarden in één oproep te stroomlijnen.
type: docs
weight: 120
url: /nl/net/aspose.gis/feature/setvalues/
---
## Feature.SetValues method

Stelt nieuwe waarden in voor alle attributen. Overweeg ook om[`CopyValues`](../copyvalues/) methode om instellingswaarden in één oproep te stroomlijnen.

```csharp
public int SetValues(object[] values)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| values | Object[] | De reeks nieuwe waarden. |

### Winstwaarde

Het aantal ingestelde attribuutwaarden.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argumenten kunnen niet`null`. |
| ArgumentException | Het attribuut met deze naam bestaat niet in deze laag. |
| InvalidOperationException | Het attribuut is niet vergrendeld. |
| InvalidCastException | Het type waarde wordt niet geïmplementeerdIConvertible. |
| FormatException | Conversie is mislukt omdat de waarde een onjuist formaat heeft. |
| OverflowException | Conversie mislukt vanwege overflow. |

### Opmerkingen

Deze methode converteert elke waarde automatisch naar het type van het attribuut.  De lengte van de waardenarray hoeft niet overeen te komen met het aantal attributen in het object. Als de arraylengte groter is dan het aantal attributen, worden alle arraywaarden gekopieerd naar de attributen; als deze kleiner is, alleen het aantal waarden van de arraylengte wordt gekopieerd naar de attributen, beginnend bij de attribuutwaarde met rangtelwoord 0.

### Zie ook

* class [Feature](../)
* naamruimte [Aspose.Gis](../../feature/)
* montage [Aspose.GIS](../../../)


