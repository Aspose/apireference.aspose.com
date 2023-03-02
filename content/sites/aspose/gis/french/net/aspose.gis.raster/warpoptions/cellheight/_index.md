---
title: WarpOptions.CellHeight
second_title: Référence de l'API Aspose.GIS pour .NET
description: WarpOptions propriété. Spécifie une nouvelle hauteur de la cellule raster en unités géoréférencées cibles. Si la valeur est définie sur 0 laCellHeight est calculé automatiquement. La valeur par défaut est 0.
type: docs
weight: 20
url: /fr/net/aspose.gis.raster/warpoptions/cellheight/
---
## WarpOptions.CellHeight property

Spécifie une nouvelle hauteur de la cellule raster (en unités géoréférencées cibles). Si la valeur est définie sur 0, la`CellHeight` est calculé automatiquement. La valeur par défaut est "0".

```csharp
public double CellHeight { get; set; }
```

### Remarques

Si la hauteur de cellule est définie sur 0, la valeur sera prise à partir de la hauteur de cellule d'origine ou calculée à partir de[`Height`](../height/) . Notez que`CellHeight` ne peut pas être utilisé avec[`Height`](../height/) .

### Voir également

* class [WarpOptions](../)
* espace de noms [Aspose.Gis.Raster](../../warpoptions/)
* Assemblée [Aspose.GIS](../../../)


