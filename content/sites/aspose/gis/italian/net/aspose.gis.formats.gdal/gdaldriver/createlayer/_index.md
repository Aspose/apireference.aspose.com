---
title: GdalDriver.CreateLayer
second_title: Riferimento API Aspose.GIS per .NET
description: GdalDriver metodo. Crea un livello e lo apre per laggiunta di nuove funzionalità.
type: docs
weight: 40
url: /it/net/aspose.gis.formats.gdal/gdaldriver/createlayer/
---
## GdalDriver.CreateLayer method

Crea un livello e lo apre per l'aggiunta di nuove funzionalità.

```csharp
public override VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | AbstractPath | Percorso del file. |
| options | DriverOptions | Opzioni specifiche del conducente. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema di riferimento spaziale. |

### Valore di ritorno

Un'istanza di[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| InvalidOperationException | Il livello esiste già. |
| NotSupportedException | Il sistema di riferimento spaziale non è supportato dal driver. |

### Guarda anche

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [GdalDriver](../)
* spazio dei nomi [Aspose.Gis.Formats.GDAL](../../gdaldriver/)
* assemblea [Aspose.GIS](../../../)


