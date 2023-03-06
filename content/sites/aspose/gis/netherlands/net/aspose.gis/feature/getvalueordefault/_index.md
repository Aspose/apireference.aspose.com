---
title: Feature.GetValueOrDefault
second_title: Aspose.GIS voor .NET API-referentie
description: Feature methode. Krijgt de waarde van een attribuut ofDefaultValue als de waarde niet is ingesteld ofnul .
type: docs
weight: 40
url: /nl/net/aspose.gis/feature/getvalueordefault/
---
## GetValueOrDefault&lt;T&gt;(string) {#getvalueordefault_1}

Krijgt de waarde van een attribuut, of[`DefaultValue`](../../featureattribute/defaultvalue/) als de waarde niet is ingesteld of`nul` .

```csharp
public T GetValueOrDefault<T>(string attributeName)
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

Deze methode converteert de waarde automatisch naar het type dat wordt gevraagd in de generieke typeparameter.

### Zie ook

* class [Feature](../)
* naamruimte [Aspose.Gis](../../feature/)
* montage [Aspose.GIS](../../../)

---

## GetValueOrDefault(string, object) {#getvalueordefault}

Krijgt de waarde van een attribuut, of[`DefaultValue`](../../featureattribute/defaultvalue/) als de waarde niet is ingesteld of`nul` .

```csharp
public object GetValueOrDefault(string attributeName, object defaultValue = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| attributeName | String | Naam van het attribuut. |
| defaultValue | Object | De waarde die moet worden geretourneerd als de kenmerkwaarde ontbreekt. Standaardwaarde is`null` . |

### Winstwaarde

Waarde van het attribuut.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | De attribuutnaam is`null`. |
| ArgumentException | Het attribuut met deze naam bestaat niet in deze laag. |
| InvalidOperationException | Het attribuut is niet vergrendeld. |
| InvalidOperationException | De waarde van dit attribuut is niet ingesteld voor dit object. |

### Zie ook

* class [Feature](../)
* naamruimte [Aspose.Gis](../../feature/)
* montage [Aspose.GIS](../../../)

---

## GetValueOrDefault&lt;T&gt;(string, object) {#getvalueordefault_2}

Krijgt de waarde van een attribuut, of[`DefaultValue`](../../featureattribute/defaultvalue/) als de waarde niet is ingesteld of`nul` .

```csharp
public T GetValueOrDefault<T>(string attributeName, object defaultValue)
```

| Parameter | Beschrijving |
| --- | --- |
| T | Gewenst type voor de waarde. |
| attributeName | Naam van het attribuut. |
| defaultValue | De waarde die moet worden geretourneerd als de kenmerkwaarde ontbreekt. |

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

Deze methode converteert de waarde automatisch naar het type dat wordt gevraagd in de generieke typeparameter.

### Zie ook

* class [Feature](../)
* naamruimte [Aspose.Gis](../../feature/)
* montage [Aspose.GIS](../../../)


