---
title: Feature.GetValues
second_title: Aspose.GIS voor .NET API-referentie
description: Feature methode. Retourneert de waarden voor alle attributen in een array.
type: docs
weight: 50
url: /nl/net/aspose.gis/feature/getvalues/
---
## Feature.GetValues method

Retourneert de waarden voor alle attributen in een array.

```csharp
public int GetValues(object[] values, object defaultValue = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| values | Object[] | De array waarnaar de kenmerkwaarden moeten worden gekopieerd. |
| defaultValue | Object | De waarde die moet worden geretourneerd als de kenmerkwaarde ontbreekt (niet ingesteld). Standaardwaarde is`null`. Overweeg om 'DBNull.Value' voor het scheiden van 'unset' en '`null` waarden. |

### Winstwaarde

Een aantal attributen gekopieerd.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het argument is`null`. |
| InvalidOperationException | Het attribuut is niet vergrendeld. |

### Opmerkingen

De waardenattributen van de functie worden gekopieerd naar de waardenmatrix die wordt doorgegeven als een parameter. Voor attributen met een niet ingestelde waarde wordt de opgegeven parameter 'unsetValue' geretourneerd.  De lengte van de waardenarray hoeft niet overeen te komen met het aantal attributen in het object. Als de arraylengte groter is dan het aantal attributen, worden alle attribuutwaarden naar de array gekopieerd; als deze kleiner is, alleen de arraylengte aantal attribuutwaarden wordt gekopieerd naar de array, beginnend bij de attribuutwaarde met ordinaal 0.

### Zie ook

* class [Feature](../)
* naamruimte [Aspose.Gis](../../feature/)
* montage [Aspose.GIS](../../../)


