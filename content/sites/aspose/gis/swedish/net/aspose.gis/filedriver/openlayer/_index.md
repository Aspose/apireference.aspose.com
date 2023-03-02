---
title: FileDriver.OpenLayer
second_title: Aspose.GIS för .NET API Referens
description: FileDriver metod. Öppnar lagret för läsning.
type: docs
weight: 90
url: /sv/net/aspose.gis/filedriver/openlayer/
---
## OpenLayer(string) {#openlayer_2}

Öppnar lagret för läsning.

```csharp
public VectorLayer OpenLayer(string path)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | String | Sökväg till filen. |

### Returvärde

Ett exempel på[`VectorLayer`](../../vectorlayer/).

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vägen är`null`. |
| [GisException](../../gisexception/) | Det gick inte att läsa funktionen från filen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Drivrutinen kan inte öppna vektorlager (se[`CanOpenLayers`](../canopenlayers/)). |

### Se även

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath) {#openlayer}

Öppnar lagret för läsning.

```csharp
public VectorLayer OpenLayer(AbstractPath path)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | AbstractPath | Sökväg till filen. |

### Returvärde

Ett exempel på[`VectorLayer`](../../vectorlayer/).

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vägen är`null`. |
| [GisException](../../gisexception/) | Det gick inte att läsa funktionen från filen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Drivrutinen kan inte öppna vektorlager (se[`CanOpenLayers`](../canopenlayers/)). |

### Se även

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)

---

## OpenLayer(string, DriverOptions) {#openlayer_3}

Öppnar lagret för läsning.

```csharp
public VectorLayer OpenLayer(string path, DriverOptions options)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | String | Sökväg till filen. |
| options | DriverOptions | Förarspecifika alternativ. |

### Returvärde

Ett exempel på[`VectorLayer`](../../vectorlayer/).

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentException | Options-objektet har en felaktig typ för den här drivrutinen. |
| ArgumentNullException | Vägen är`null`. |
| [GisException](../../gisexception/) | Det gick inte att läsa funktionen från filen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Drivrutinen kan inte öppna vektorlager (se[`CanOpenLayers`](../canopenlayers/)). |

### Se även

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath, DriverOptions) {#openlayer_1}

Öppnar lagret för läsning.

```csharp
public abstract VectorLayer OpenLayer(AbstractPath path, DriverOptions options)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | AbstractPath | Sökväg till filen. |
| options | DriverOptions | Förarspecifika alternativ. |

### Returvärde

Ett exempel på[`VectorLayer`](../../vectorlayer/).

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentException | Options-objektet har en felaktig typ för den här drivrutinen. |
| ArgumentNullException | Vägen är`null`. |
| [GisException](../../gisexception/) | Det gick inte att läsa funktionen från filen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Drivrutinen kan inte öppna vektorlager (se[`CanOpenLayers`](../canopenlayers/)). |

### Se även

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)


