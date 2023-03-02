---
title: Feature.GetValuesDump
second_title: Aspose.GIS voor .NET API-referentie
description: Feature methode. Retourneert de waarden voor alle attributen in een array. Overweeg om te gebruikenGetValues methode om extra geheugentoewijzing te vermijden.
type: docs
weight: 60
url: /nl/net/aspose.gis/feature/getvaluesdump/
---
## Feature.GetValuesDump method

Retourneert de waarden voor alle attributen in een array. Overweeg om te gebruiken[`GetValues`](../getvalues/) methode om extra geheugentoewijzing te vermijden.

```csharp
public object[] GetValuesDump(object defaultValue = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| defaultValue | Object | De waarde die moet worden geretourneerd als de kenmerkwaarde ontbreekt (niet ingesteld). Standaardwaarde is`null`. Overweeg om 'DBNull.Value' voor het scheiden van 'unset' en '`null` waarden. |

### Winstwaarde

Een nieuwe array waarnaar de kenmerkwaarden moeten worden gekopieerd.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het argument is`null`. |
| InvalidOperationException | Het attribuut is niet vergrendeld. |

### Opmerkingen

De waardenattributen van de functie worden gekopieerd naar de waardenmatrix die wordt doorgegeven als een parameter. Voor attributen met een niet ingestelde waarde wordt de opgegeven parameter 'unsetValue' geretourneerd.

### Zie ook

* class [Feature](../)
* naamruimte [Aspose.Gis](../../feature/)
* montage [Aspose.GIS](../../../)


