---
title: WarpOptions.CellHeight
second_title: Riferimento API Aspose.GIS per .NET
description: WarpOptions proprietà. Specifica una nuova altezza della cella raster in unità georeferenziate di destinazione. Se il valore è impostato su 0 ilCellHeight viene calcolato automaticamente. Il valore predefinito è 0.
type: docs
weight: 20
url: /it/net/aspose.gis.raster/warpoptions/cellheight/
---
## WarpOptions.CellHeight property

Specifica una nuova altezza della cella raster (in unità georeferenziate di destinazione). Se il valore è impostato su 0, il`CellHeight` viene calcolato automaticamente. Il valore predefinito è "0".

```csharp
public double CellHeight { get; set; }
```

### Osservazioni

Se l'altezza della cella è impostata su 0, il valore verrà preso dall'altezza della cella originale o calcolato da[`Height`](../height/) . Nota che`CellHeight` non può essere utilizzato con[`Height`](../height/) .

### Guarda anche

* class [WarpOptions](../)
* spazio dei nomi [Aspose.Gis.Raster](../../warpoptions/)
* assemblea [Aspose.GIS](../../../)


