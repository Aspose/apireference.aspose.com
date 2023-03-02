---
title: FeatureAttributeCollection.Item
second_title: Aspose.GIS voor .NET API-referentie
description: FeatureAttributeCollection eigendom. Haalt of stelt deFeatureAttribute op de opgegeven index.
type: docs
weight: 30
url: /nl/net/aspose.gis/featureattributecollection/item/
---
## FeatureAttributeCollection indexer (1 of 2)

Haalt of stelt de[`FeatureAttribute`](../../featureattribute/) op de opgegeven index.

```csharp
public FeatureAttribute this[int index] { get; set; }
```

| Parameter | Beschrijving |
| --- | --- |
| index | De op nul gebaseerde index van het kenmerk dat moet worden opgehaald of ingesteld. |

### Winstwaarde

Het attribuut bij de opgegeven index.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentOutOfRangeException | De index is buiten bereik. |
| InvalidOperationException | Poging om een vergrendelde verzameling te wijzigen. |

### Zie ook

* class [FeatureAttribute](../../featureattribute/)
* class [FeatureAttributeCollection](../)
* naamruimte [Aspose.Gis](../../featureattributecollection/)
* montage [Aspose.GIS](../../../)

---

## FeatureAttributeCollection indexer (2 of 2)

Haalt of stelt de[`FeatureAttribute`](../../featureattribute/) met een opgegeven naam.

```csharp
public FeatureAttribute this[string name] { get; }
```

| Parameter | Beschrijving |
| --- | --- |
| name | Naam van de attributen. |

### Winstwaarde

Het kenmerk met de opgegeven naam, of`null` als het niet gevonden wordt.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | De attribuutnaam is`null`. |

### Zie ook

* class [FeatureAttribute](../../featureattribute/)
* class [FeatureAttributeCollection](../)
* naamruimte [Aspose.Gis](../../featureattributecollection/)
* montage [Aspose.GIS](../../../)


