---
title: FeatureAttributeCollection.Item
second_title: Aspose.GIS für .NET-API-Referenz
description: FeatureAttributeCollection eigendom. Ruft ab oder setzt dieFeatureAttribute am angegebenen Index.
type: docs
weight: 30
url: /de/net/aspose.gis/featureattributecollection/item/
---
## FeatureAttributeCollection indexer (1 of 2)

Ruft ab oder setzt die[`FeatureAttribute`](../../featureattribute/) am angegebenen Index.

```csharp
public FeatureAttribute this[int index] { get; set; }
```

| Parameter | Beschreibung |
| --- | --- |
| index | Der nullbasierte Index des abzurufenden oder festzulegenden Attributs. |

### Rückgabewert

Das Attribut am angegebenen Index.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentOutOfRangeException | Der Index liegt außerhalb des zulässigen Bereichs. |
| InvalidOperationException | Versuch, eine gesperrte Sammlung zu ändern. |

### Siehe auch

* class [FeatureAttribute](../../featureattribute/)
* class [FeatureAttributeCollection](../)
* namensraum [Aspose.Gis](../../featureattributecollection/)
* Montage [Aspose.GIS](../../../)

---

## FeatureAttributeCollection indexer (2 of 2)

Ruft ab oder setzt die[`FeatureAttribute`](../../featureattribute/) mit einem bestimmten Namen.

```csharp
public FeatureAttribute this[string name] { get; }
```

| Parameter | Beschreibung |
| --- | --- |
| name | Name der Attribute. |

### Rückgabewert

Das Attribut mit dem angegebenen Namen oder`null` wenn es nicht gefunden wird.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Attributname ist`null`. |

### Siehe auch

* class [FeatureAttribute](../../featureattribute/)
* class [FeatureAttributeCollection](../)
* namensraum [Aspose.Gis](../../featureattributecollection/)
* Montage [Aspose.GIS](../../../)


