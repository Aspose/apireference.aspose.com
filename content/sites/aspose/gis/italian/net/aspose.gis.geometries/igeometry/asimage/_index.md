---
title: IGeometry.AsImage
second_title: Riferimento API Aspose.GIS per .NET
description: IGeometry metodo. Esporta questa geometria in una rappresentazione dellimmagine.
type: docs
weight: 110
url: /it/net/aspose.gis.geometries/igeometry/asimage/
---
## AsImage(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_1}

Esporta questa geometria in una rappresentazione dell'immagine.

```csharp
public void AsImage(AbstractPath outputPath, Measurement width, Measurement height, 
    Renderer renderer, VectorSymbolizer symbolizer = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outputPath | AbstractPath | Percorso dell'immagine di output. |
| width | Measurement | Larghezza della mappa. |
| height | Measurement | Altezza della mappa. |
| renderer | Renderer | Render da usare. |
| symbolizer | VectorSymbolizer | Un simbolo da utilizzare per il rendering. Se`null`, viene utilizzato il simbolo predefinito. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Qualsiasi argomento`null`. |
| IOException | Si è verificato un errore di I/O. |
| [GisException](../../../aspose.gis/gisexception/) | Un errore durante l'elaborazione o la lettura dei dati GIS. |
| ArgumentException | L'unità di larghezza o altezza è!:SpatialReferencing.Unit.MapUnits . |
| ArgumentOutOfRangeException | La larghezza o l'altezza è negativa o zero. |

### Guarda anche

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* interface [IGeometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../igeometry/)
* assemblea [Aspose.GIS](../../../)

---

## AsImage(string, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_2}

Esporta questa geometria in una rappresentazione dell'immagine.

```csharp
public void AsImage(string outputPath, Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outputPath | String | Percorso dell'immagine di output. |
| width | Measurement | Larghezza della mappa. |
| height | Measurement | Altezza della mappa. |
| renderer | Renderer | Render da usare. |
| symbolizer | VectorSymbolizer | Un simbolo da utilizzare per il rendering. Se`null`, viene utilizzato il simbolo predefinito. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Qualsiasi argomento`null`. |
| IOException | Si è verificato un errore di I/O. |
| [GisException](../../../aspose.gis/gisexception/) | Un errore durante l'elaborazione o la lettura dei dati GIS. |
| ArgumentException | L'unità di larghezza o altezza è!:SpatialReferencing.Unit.MapUnits . |
| ArgumentOutOfRangeException | La larghezza o l'altezza è negativa o zero. |

### Guarda anche

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* interface [IGeometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../igeometry/)
* assemblea [Aspose.GIS](../../../)

---

## AsImage(Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage}

Esporta questa geometria in una rappresentazione dell'immagine.

```csharp
public Stream AsImage(Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| width | Measurement | Larghezza della mappa. |
| height | Measurement | Altezza della mappa. |
| renderer | Renderer | Render da usare. |
| symbolizer | VectorSymbolizer | Un simbolo da utilizzare per il rendering. Se`null`, viene utilizzato il simbolo predefinito. |

### Valore di ritorno

L'immagine come flusso

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Qualsiasi argomento`null`. |
| IOException | Si è verificato un errore di I/O. |
| [GisException](../../../aspose.gis/gisexception/) | Un errore durante l'elaborazione o la lettura dei dati GIS. |
| ArgumentException | L'unità di larghezza o altezza è!:SpatialReferencing.Unit.MapUnits . |
| ArgumentOutOfRangeException | La larghezza o l'altezza è negativa o zero. |

### Guarda anche

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* interface [IGeometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../igeometry/)
* assemblea [Aspose.GIS](../../../)


