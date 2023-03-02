---
title: FileDriver.CreateLayer
second_title: Aspose.GIS för .NET API Referens
description: FileDriver metod. Skapar lagret och öppnar det för att läggas till.
type: docs
weight: 60
url: /sv/net/aspose.gis/filedriver/createlayer/
---
## CreateLayer(string) {#createlayer_4}

Skapar lagret och öppnar det för att läggas till.

```csharp
public VectorLayer CreateLayer(string path)
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
| [GisException](../../gisexception/) | Det gick inte att skriva funktionen till filen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Drivrutinen kan inte skapa vektorlager (se[`CanCreateLayers`](../cancreatelayers/)). |

### Se även

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath) {#createlayer}

Skapar lagret och öppnar det för att läggas till.

```csharp
public VectorLayer CreateLayer(AbstractPath path)
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
| [GisException](../../gisexception/) | Det gick inte att skriva funktionen till filen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Drivrutinen kan inte skapa vektorlager (se[`CanCreateLayers`](../cancreatelayers/)). |

### Se även

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions) {#createlayer_5}

Skapar lagret och öppnar det för att läggas till.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options)
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
| ArgumentNullException | Vägen är`null`. |
| ArgumentException | Options-objektet har en felaktig typ för den här drivrutinen. |
| [GisException](../../gisexception/) | Det gick inte att skriva funktionen till filen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Drivrutinen kan inte skapa vektorlager (se[`CanCreateLayers`](../cancreatelayers/)). |

### Se även

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions) {#createlayer_1}

Skapar lagret och öppnar det för att läggas till.

```csharp
public VectorLayer CreateLayer(AbstractPath path, DriverOptions options)
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
| ArgumentNullException | Vägen är`null`. |
| ArgumentException | Options-objektet har en felaktig typ för den här drivrutinen. |
| [GisException](../../gisexception/) | Det gick inte att skriva funktionen till filen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Drivrutinen kan inte skapa vektorlager (se[`CanCreateLayers`](../cancreatelayers/)). |

### Se även

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)

---

## CreateLayer(string, SpatialReferenceSystem) {#createlayer_7}

Skapar lagret och öppnar det för att läggas till.

```csharp
public VectorLayer CreateLayer(string path, SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | String | Sökväg till filen. |
| spatialReferenceSystem | SpatialReferenceSystem | Rumsligt referenssystem. |

### Returvärde

Ett exempel på[`VectorLayer`](../../vectorlayer/).

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vägen är`null`. |
| [GisException](../../gisexception/) | Det gick inte att skriva funktionen till filen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Rumsligt referenssystem stöds inte av drivrutinen. Använd[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) för att kontrollera om det rumsliga referenssystemet stöds. |

### Se även

* class [VectorLayer](../../vectorlayer/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, SpatialReferenceSystem) {#createlayer_3}

Skapar lagret och öppnar det för att läggas till.

```csharp
public VectorLayer CreateLayer(AbstractPath path, SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | AbstractPath | Sökväg till filen. |
| spatialReferenceSystem | SpatialReferenceSystem | Rumsligt referenssystem. |

### Returvärde

Ett exempel på[`VectorLayer`](../../vectorlayer/).

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vägen är`null`. |
| [GisException](../../gisexception/) | Det gick inte att skriva funktionen till filen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Rumsligt referenssystem stöds inte av drivrutinen. Använd[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) för att kontrollera om det rumsliga referenssystemet stöds. |

### Se även

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions, SpatialReferenceSystem) {#createlayer_6}

Skapar lagret och öppnar det för att läggas till.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | String | Sökväg till filen. |
| options | DriverOptions | Förarspecifika alternativ. |
| spatialReferenceSystem | SpatialReferenceSystem | Rumsligt referenssystem. |

### Returvärde

Ett exempel på[`VectorLayer`](../../vectorlayer/).

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vägen är`null`. |
| ArgumentException | Options-objektet har en felaktig typ för den här drivrutinen. |
| [GisException](../../gisexception/) | Det gick inte att skriva funktionen till filen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Rumsligt referenssystem stöds inte av drivrutinen. Använd[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) för att kontrollera om det rumsliga referenssystemet stöds. |
| NotSupportedException | Drivrutinen kan inte skapa vektorlager (se[`CanCreateLayers`](../cancreatelayers/)). |

### Se även

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

Skapar lagret och öppnar det för att läggas till.

```csharp
public abstract VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | AbstractPath | Sökväg till filen. |
| options | DriverOptions | Förarspecifika alternativ. |
| spatialReferenceSystem | SpatialReferenceSystem | Rumsligt referenssystem. |

### Returvärde

Ett exempel på[`VectorLayer`](../../vectorlayer/).

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vägen är`null`. |
| ArgumentException | Options-objektet har en felaktig typ för den här drivrutinen. |
| [GisException](../../gisexception/) | Det gick inte att skriva funktionen till filen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Rumsligt referenssystem stöds inte av drivrutinen. Använd[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) för att kontrollera om det rumsliga referenssystemet stöds. |
| NotSupportedException | Drivrutinen kan inte skapa vektorlager (se[`CanCreateLayers`](../cancreatelayers/)). |

### Se även

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)


