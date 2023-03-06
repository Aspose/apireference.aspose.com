---
title: Feature.GetValuesList
second_title: Aspose.GIS voor .NET API-referentie
description: Feature methode. Haalt de waarden van een attributenreeks op als een lijst.
type: docs
weight: 70
url: /nl/net/aspose.gis/feature/getvalueslist/
---
## Feature.GetValuesList&lt;T&gt; method

Haalt de waarden van een attributenreeks op als een lijst.

```csharp
public List<T> GetValuesList<T>(string attributeName, string separator)
```

| Parameter | Beschrijving |
| --- | --- |
| T | Gewenst type voor de waarden. |
| attributeName | Naam van het attribuut. |
| separator | Een tekenreeks die wordt gebruikt om de kenmerknaam en de indexwaarde van de reeks te scheiden. |

### Winstwaarde

Lijst met waarden van de attributen waarvan de namen verschillen per sequentie-indexwaarde.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | De attribuutnaam is`null`. |
| ArgumentException | Het attribuut met deze naam bestaat niet in deze laag. |
| InvalidOperationException | Het attribuut is niet vergrendeld. |
| InvalidOperationException | De waarde van dit attribuut is niet ingesteld voor dit object. |
| InvalidCastException | Het aangevraagde type wordt niet geïmplementeerdIConvertible. |
| InvalidCastException | Waarde van het attribuut is`null`, maar het aangevraagde type is een waardetype. |
| FormatException | Conversie is mislukt omdat de waarde een onjuist formaat heeft. |
| OverflowException | Conversie mislukt vanwege overflow. |

### Opmerkingen

Dit gebruikt[`GetValue`](../getvalue/) om een enkele waarde te krijgen. Deze methode converteert de waarde dus automatisch naar het type dat wordt gevraagd in de generieke typeparameter.  Als attribuut met index 0 niet wordt gevonden, wordt het gegenereerdArgumentException .

### Zie ook

* class [Feature](../)
* naamruimte [Aspose.Gis](../../feature/)
* montage [Aspose.GIS](../../../)


