---
title: WarpOptions.Height
second_title: Riferimento API Aspose.GIS per .NET
description: WarpOptions proprietà. Specifica laltezza del raster di output in pixel e colonne. Se il valore è impostato su 0 laltezza viene calcolata automaticamente. Il valore predefinito è 0.
type: docs
weight: 50
url: /it/net/aspose.gis.raster/warpoptions/height/
---
## WarpOptions.Height property

Specifica l'altezza del raster di output in pixel e colonne. Se il valore è impostato su 0, l'altezza viene calcolata automaticamente. Il valore predefinito è "0".

```csharp
public int Height { get; set; }
```

### Osservazioni

Se l'altezza è impostata su 0, il valore verrà preso dall'altezza originale o calcolato da[`CellHeight`](../cellheight/) . Nota che`Height` non può essere utilizzato con[`CellHeight`](../cellheight/) .

### Guarda anche

* class [WarpOptions](../)
* spazio dei nomi [Aspose.Gis.Raster](../../warpoptions/)
* assemblea [Aspose.GIS](../../../)


