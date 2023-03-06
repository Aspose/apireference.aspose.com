---
title: WarpOptions.Height
second_title: Référence de l'API Aspose.GIS pour .NET
description: WarpOptions propriété. Spécifie la hauteur du raster en sortie en pixels et en colonnes. Si la valeur est définie sur 0 la hauteur est automatiquement calculée. La valeur par défaut est 0.
type: docs
weight: 50
url: /fr/net/aspose.gis.raster/warpoptions/height/
---
## WarpOptions.Height property

Spécifie la hauteur du raster en sortie en pixels et en colonnes. Si la valeur est définie sur 0, la hauteur est automatiquement calculée. La valeur par défaut est "0".

```csharp
public int Height { get; set; }
```

### Remarques

Si la hauteur est définie sur 0, la valeur sera prise à partir de la hauteur d'origine ou calculée à partir de[`CellHeight`](../cellheight/) . Notez que`Height` ne peut pas être utilisé avec[`CellHeight`](../cellheight/) .

### Voir également

* class [WarpOptions](../)
* espace de noms [Aspose.Gis.Raster](../../warpoptions/)
* Assemblée [Aspose.GIS](../../../)


