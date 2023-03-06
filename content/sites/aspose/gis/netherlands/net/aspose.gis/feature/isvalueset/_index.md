---
title: Feature.IsValueSet
second_title: Aspose.GIS voor .NET API-referentie
description: Feature methode. Controleert of de attribuutwaarde is ingesteld in deze feature.
type: docs
weight: 90
url: /nl/net/aspose.gis/feature/isvalueset/
---
## Feature.IsValueSet method

Controleert of de attribuutwaarde is ingesteld in deze feature.

```csharp
public bool IsValueSet(string attributeName)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| attributeName | String | Naam van het attribuut. |

### Winstwaarde

`true`als de waarde voor het opgegeven attribuut is ingesteld; anders,`false` .

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| InvalidOperationException | Het attribuut is niet vergrendeld. |
| ArgumentException | Het attribuut met deze naam bestaat niet in deze laag. |
| ArgumentNullException | De attribuutnaam is`null`. |

### Zie ook

* class [Feature](../)
* naamruimte [Aspose.Gis](../../feature/)
* montage [Aspose.GIS](../../../)


