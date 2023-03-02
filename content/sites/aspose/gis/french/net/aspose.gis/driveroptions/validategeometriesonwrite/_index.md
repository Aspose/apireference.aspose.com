---
title: DriverOptions.ValidateGeometriesOnWrite
second_title: Référence de l'API Aspose.GIS pour .NET
description: DriverOptions propriété. Détermine si les géométries doivent être validées lorsquelles sont ajoutées au calque. Si défini surtrue IsValid est appelée pour chaque géométrie lorsquelle est ajoutée à la couche et si la validation échoue IsValid estfalse GisException est lancé.
type: docs
weight: 90
url: /fr/net/aspose.gis/driveroptions/validategeometriesonwrite/
---
## DriverOptions.ValidateGeometriesOnWrite property

Détermine si les géométries doivent être validées lorsqu'elles sont ajoutées au calque. Si défini sur`true` ,[`IsValid`](../../../aspose.gis.geometries/geometry/isvalid/) est appelée pour chaque géométrie lorsqu'elle est ajoutée à la couche, et si la validation échoue ([`IsValid`](../../../aspose.gis.geometries/geometry/isvalid/) est`false` ),[`GisException`](../../gisexception/) est lancé.

```csharp
public bool ValidateGeometriesOnWrite { get; set; }
```

### Remarques

Ceci est une option de création - cela n'affecte pas l'ouverture.

### Voir également

* class [DriverOptions](../)
* espace de noms [Aspose.Gis](../../driveroptions/)
* Assemblée [Aspose.GIS](../../../)


