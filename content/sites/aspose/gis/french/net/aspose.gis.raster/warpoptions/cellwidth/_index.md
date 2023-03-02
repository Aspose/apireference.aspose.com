---
title: WarpOptions.CellWidth
second_title: Référence de l'API Aspose.GIS pour .NET
description: WarpOptions propriété. Spécifie une nouvelle largeur de cellule raster en unités géoréférencées cibles. Si la valeur est définie sur 0 laCellWidth est calculé automatiquement. La valeur par défaut est 0.
type: docs
weight: 30
url: /fr/net/aspose.gis.raster/warpoptions/cellwidth/
---
## WarpOptions.CellWidth property

Spécifie une nouvelle largeur de cellule raster (en unités géoréférencées cibles). Si la valeur est définie sur 0, la`CellWidth` est calculé automatiquement. La valeur par défaut est "0".

```csharp
public double CellWidth { get; set; }
```

### Remarques

Si la largeur de cellule est définie sur 0, la valeur sera prise à partir de la largeur de cellule d'origine ou calculée à partir de[`Width`](../width/) . Notez que`CellWidth` ne peut pas être utilisé avec[`Width`](../width/) .

### Voir également

* class [WarpOptions](../)
* espace de noms [Aspose.Gis.Raster](../../warpoptions/)
* Assemblée [Aspose.GIS](../../../)


