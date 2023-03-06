---
title: Identifier.Epsg
second_title: Aspose.GIS voor .NET API-referentie
description: Identifier methode. Creëert een nieuwe identificatie die de EPSGidentificatie met code vertegenwoordigtepsgCode .
type: docs
weight: 20
url: /nl/net/aspose.gis.spatialreferencing/identifier/epsg/
---
## Identifier.Epsg method

Creëert een nieuwe identificatie die de EPSG-identificatie met code vertegenwoordigt*epsgCode* .

```csharp
public static Identifier Epsg(int epsgCode)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| epsgCode | Int32 | Epsg-code. |

### Winstwaarde

Nieuwe identificatie met[`AuthorityName`](../authorityname/) "EPSG" en[`AuthorityUniqueIdentifier`](../authorityuniqueidentifier/)*epsgCode* . Als*epsgCode* is kleiner dan 0 - retour`null` ;

### Zie ook

* class [Identifier](../)
* naamruimte [Aspose.Gis.SpatialReferencing](../../identifier/)
* montage [Aspose.GIS](../../../)


