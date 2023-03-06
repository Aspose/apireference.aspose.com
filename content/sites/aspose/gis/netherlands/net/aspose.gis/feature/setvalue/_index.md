---
title: Feature.SetValue
second_title: Aspose.GIS voor .NET API-referentie
description: Feature methode. Stelt een nieuwe waarde van een attribuut in.
type: docs
weight: 100
url: /nl/net/aspose.gis/feature/setvalue/
---
## Feature.SetValue&lt;T&gt; method

Stelt een nieuwe waarde van een attribuut in.

```csharp
public void SetValue<T>(string attributeName, T value)
```

| Parameter | Beschrijving |
| --- | --- |
| T | Het type van de waarde. |
| attributeName | De naam van het attribuut. |
| value | De waarde van het attribuut. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | De attribuutnaam is`null`. |
| ArgumentException | Het attribuut met deze naam bestaat niet in deze laag. |
| InvalidOperationException | Het attribuut is niet vergrendeld. |
| InvalidCastException | Het type waarde wordt niet geïmplementeerdIConvertible. |
| FormatException | Conversie is mislukt omdat de waarde een onjuist formaat heeft. |
| OverflowException | Conversie mislukt vanwege overflow. |

### Opmerkingen

Deze methode converteert de waarde automatisch naar het type attribuut.

### Zie ook

* class [Feature](../)
* naamruimte [Aspose.Gis](../../feature/)
* montage [Aspose.GIS](../../../)


