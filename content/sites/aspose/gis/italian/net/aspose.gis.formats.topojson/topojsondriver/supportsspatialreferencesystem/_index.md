---
title: TopoJsonDriver.SupportsSpatialReferenceSystem
second_title: Riferimento API Aspose.GIS per .NET
description: TopoJsonDriver metodo. Determina se il sistema di riferimento spaziale specificato è supportato dal driver.
type: docs
weight: 60
url: /it/net/aspose.gis.formats.topojson/topojsondriver/supportsspatialreferencesystem/
---
## TopoJsonDriver.SupportsSpatialReferenceSystem method

Determina se il sistema di riferimento spaziale specificato è supportato dal driver.

```csharp
public override bool SupportsSpatialReferenceSystem(SpatialReferenceSystem spatialReferenceSystem)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema di riferimento spaziale. |

### Valore di ritorno

Valore booleano, che indica se il sistema di riferimento spaziale specificato è supportato dal driver.

### Osservazioni

Per TopoJSON, l'unico sistema di riferimento spaziale supportato è 'null', poiché non è possibile archiviare informazioni sul sistema di riferimento spaziale nel file TopoJSON e la specifica TopoJSON non specifica quale è il sistema di riferimento spaziale delle geometrie nel file TopoJSON.

### Guarda anche

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [TopoJsonDriver](../)
* spazio dei nomi [Aspose.Gis.Formats.TopoJson](../../topojsondriver/)
* assemblea [Aspose.GIS](../../../)


