---
title: SpatialReferenceSystem.IsCompound
second_title: Référence de l'API Aspose.GIS pour .NET
description: SpatialReferenceSystem propriété. Renvoie si ce SRS est composé une union de deux SRS. Les combinaisons suivantes de SRS dans un SRS composé sont considérées comme valides  SRS géographique  SRS vertical dans ce cas le type de SRS composé seraGeographic . SRS projeté  SRS vertical dans ce cas le type de SRS composé seraProjected . Si la combinaison de SRS diffère le type de SRS composé seraUnknown .
type: docs
weight: 130
url: /fr/net/aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/
---
## SpatialReferenceSystem.IsCompound property

Renvoie si ce SRS est composé (une union de deux SRS). Les combinaisons suivantes de SRS dans un SRS composé sont considérées comme valides : SRS géographique + SRS vertical, dans ce cas, le type de SRS composé seraGeographic . SRS projeté + SRS vertical, dans ce cas le type de SRS composé seraProjected . Si la combinaison de SRS diffère, le type de SRS composé seraUnknown .

```csharp
public virtual bool IsCompound { get; }
```

### Remarques

Dans WKT c'est COMPD_CS.

### Voir également

* class [SpatialReferenceSystem](../)
* espace de noms [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* Assemblée [Aspose.GIS](../../../)


