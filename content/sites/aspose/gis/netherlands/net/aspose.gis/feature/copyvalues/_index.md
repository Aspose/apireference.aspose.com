---
title: Feature.CopyValues
second_title: Aspose.GIS voor .NET API-referentie
description: Feature methode. Kopieert waarden van attributen van een ander object.
type: docs
weight: 20
url: /nl/net/aspose.gis/feature/copyvalues/
---
## Feature.CopyValues method

Kopieert waarden van attributen van een ander object.

```csharp
public void CopyValues(Feature inputFeature)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| inputFeature | Feature | De functie om waarden van te kopiëren. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het argument is`null`. |
| ArgumentException | Het attribuut met deze naam bestaat niet in deze laag. |
| InvalidOperationException | Het attribuut is niet vergrendeld. |
| InvalidOperationException | De invoerwaarde is null en het attribuut in deze functie kan niet null zijn. |
| [GisException](../../gisexception/) | Een attribuut heeft dezelfde naam maar verschillende datatypes in de features. |

### Opmerkingen

Deze methode kopieert alleen attributen met overeenkomende namen.

### Zie ook

* class [Feature](../)
* naamruimte [Aspose.Gis](../../feature/)
* montage [Aspose.GIS](../../../)


