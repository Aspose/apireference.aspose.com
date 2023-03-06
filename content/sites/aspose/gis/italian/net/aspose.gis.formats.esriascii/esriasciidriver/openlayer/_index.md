---
title: EsriAsciiDriver.OpenLayer
second_title: Riferimento API Aspose.GIS per .NET
description: EsriAsciiDriver metodo. Apre il livello per la lettura.
type: docs
weight: 20
url: /it/net/aspose.gis.formats.esriascii/esriasciidriver/openlayer/
---
## OpenLayer(AbstractPath, RasterDriverOptions) {#openlayer_2}

Apre il livello per la lettura.

```csharp
public override RasterLayer OpenLayer(AbstractPath path, RasterDriverOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | AbstractPath | Percorso del file. |
| options | RasterDriverOptions | Opzioni specifiche del conducente. |

### Valore di ritorno

Un'istanza di[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentException | L'oggetto Opzioni ha un tipo non corretto per questo driver. |
| ArgumentNullException | Il percorso è`null`. |
| IOException | Si è verificato un errore di I/O. |
| NotSupportedException | Il driver non può aprire i livelli raster (vedi[`CanOpenLayers`](../canopenlayers/)). |

### Guarda anche

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [RasterDriverOptions](../../../aspose.gis/rasterdriveroptions/)
* class [EsriAsciiDriver](../)
* spazio dei nomi [Aspose.Gis.Formats.EsriAscii](../../esriasciidriver/)
* assemblea [Aspose.GIS](../../../)

---

## OpenLayer(string, EsriAsciiOptions) {#openlayer_4}

Apre un livello per la lettura.

```csharp
public RasterLayer OpenLayer(string path, EsriAsciiOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | String | Percorso del file. |
| options | EsriAsciiOptions | Opzioni specifiche del conducente. |

### Valore di ritorno

Un'istanza di[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Guarda anche

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [EsriAsciiOptions](../../esriasciioptions/)
* class [EsriAsciiDriver](../)
* spazio dei nomi [Aspose.Gis.Formats.EsriAscii](../../esriasciidriver/)
* assemblea [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath, EsriAsciiOptions) {#openlayer_1}

Apre un livello per la lettura.

```csharp
public RasterLayer OpenLayer(AbstractPath path, EsriAsciiOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | AbstractPath | Percorso del file. |
| options | EsriAsciiOptions | Opzioni specifiche del conducente. |

### Valore di ritorno

Un'istanza di[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Guarda anche

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [EsriAsciiOptions](../../esriasciioptions/)
* class [EsriAsciiDriver](../)
* spazio dei nomi [Aspose.Gis.Formats.EsriAscii](../../esriasciidriver/)
* assemblea [Aspose.GIS](../../../)


