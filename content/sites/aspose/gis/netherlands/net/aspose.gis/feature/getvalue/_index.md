---
title: Feature.GetValue
second_title: Aspose.GIS voor .NET API-referentie
description: Feature methode. Krijgt de waarde van een attribuut.
type: docs
weight: 30
url: /nl/net/aspose.gis/feature/getvalue/
---
## GetValue&lt;T&gt;(string) {#getvalue_1}

Krijgt de waarde van een attribuut.

```csharp
public T GetValue<T>(string attributeName)
```

| Parameter | Beschrijving |
| --- | --- |
| T | Gewenst type voor de waarde. |
| attributeName | Naam van het attribuut. |

### Winstwaarde

Waarde van het attribuut.

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

Deze methode converteert de waarde automatisch naar het type dat wordt gevraagd in de generieke typeparameter.  Als de laag niet vereist dat de objecten waarden hebben voor alle attributen die voor de laag zijn gedefinieerd, kan deze methode mislukken metInvalidOperationException wanneer een ontbrekende waarde wordt aangevraagd. Overweeg het gebruik van[`GetValueOrDefault`](../getvalueordefault/) .

### Zie ook

* class [Feature](../)
* naamruimte [Aspose.Gis](../../feature/)
* montage [Aspose.GIS](../../../)

---

## GetValue(string) {#getvalue}

Krijgt de waarde van een attribuut.

```csharp
public object GetValue(string attributeName)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| attributeName | String | Naam van het attribuut. |

### Winstwaarde

Waarde van het attribuut.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | De attribuutnaam is`null`. |
| ArgumentException | Het attribuut met deze naam bestaat niet in deze laag. |
| InvalidOperationException | Het attribuut is niet vergrendeld. |
| InvalidOperationException | De waarde van dit attribuut is niet ingesteld voor dit object. |

### Opmerkingen

Als de laag niet vereist dat de objecten waarden hebben voor alle attributen die voor de laag zijn gedefinieerd, kan deze methode mislukken metInvalidOperationException wanneer een ontbrekende waarde wordt aangevraagd. Overweeg het gebruik van[`GetValueOrDefault`](../getvalueordefault/) .

### Zie ook

* class [Feature](../)
* naamruimte [Aspose.Gis](../../feature/)
* montage [Aspose.GIS](../../../)


