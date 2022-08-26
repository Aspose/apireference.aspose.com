---
title: Create
second_title: Aspose.GIS för .NET API Referens
description: Skapar lagret och öppnar det för att lägga till nya funktioner.
type: docs
weight: 10
url: /sv/net/aspose.gis/vectorlayer/create/
---
## Create(string, FileDriver) {#create_4}

Skapar lagret och öppnar det för att lägga till nya funktioner.

```csharp
public static VectorLayer Create(string path, FileDriver driver)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | String | Sökväg till filen. |
| driver | FileDriver | Drivrutin att använda. |

### Returvärde

Ett skrivskyddslager.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vägen är`null`. |
| ArgumentException | Options-objektet har en felaktig typ för den här drivrutinen. |
| [GisException](../../gisexception) | Det gick inte att skriva funktionen till filen. |
| IOException | Ett I/O-fel uppstod. |

### Se även

* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* namnutrymme [Aspose.Gis](../../vectorlayer)
* hopsättning [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions) {#create_5}

Skapar lagret och öppnar det för att lägga till nya funktioner.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | String | Sökväg till filen. |
| driver | FileDriver | Drivrutin att använda. |
| options | DriverOptions | Förarspecifika alternativ. |

### Returvärde

Ett skrivskyddslager.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vägen är`null`. |
| ArgumentException | Options-objektet har en felaktig typ för den här drivrutinen. |
| [GisException](../../gisexception) | Det gick inte att skriva funktionen till filen. |
| IOException | Ett I/O-fel uppstod. |

### Se även

* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [VectorLayer](../../vectorlayer)
* namnutrymme [Aspose.Gis](../../vectorlayer)
* hopsättning [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver) {#create}

Skapar lagret och öppnar det för att lägga till nya funktioner.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | AbstractPath | Sökväg till filen. |
| driver | FileDriver | Drivrutin att använda. |

### Returvärde

Ett skrivskyddslager.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vägen är`null`. |
| ArgumentException | Options-objektet har en felaktig typ för den här drivrutinen. |
| [GisException](../../gisexception) | Det gick inte att skriva funktionen till filen. |
| IOException | Ett I/O-fel uppstod. |

### Se även

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* namnutrymme [Aspose.Gis](../../vectorlayer)
* hopsättning [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions) {#create_1}

Skapar lagret och öppnar det för att lägga till nya funktioner.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | AbstractPath | Sökväg till filen. |
| driver | FileDriver | Drivrutin att använda. |
| options | DriverOptions | Förarspecifika alternativ. |

### Returvärde

Ett skrivskyddslager.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vägen är`null`. |
| ArgumentException | Options-objektet har en felaktig typ för den här drivrutinen. |
| [GisException](../../gisexception) | Det gick inte att skriva funktionen till filen. |
| IOException | Ett I/O-fel uppstod. |

### Se även

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [VectorLayer](../../vectorlayer)
* namnutrymme [Aspose.Gis](../../vectorlayer)
* hopsättning [Aspose.GIS](../../../)

---

## Create(string, FileDriver, SpatialReferenceSystem) {#create_7}

Skapar lagret och öppnar det för att läggas till.

```csharp
public static VectorLayer Create(string path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | String | Sökväg till filen. |
| driver | FileDriver | Drivrutin att använda. |
| spatialReferenceSystem | SpatialReferenceSystem | Rumsligt referenssystem. |

### Returvärde

Ett exempel på[`VectorLayer`](../../vectorlayer).

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vägen är`null`. |
| [GisException](../../gisexception) | Det gick inte att läsa eller skriva funktionen till/från filen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Rumsligt referenssystem stöds inte av drivrutinen. Använd[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) för att kontrollera om det rumsliga referenssystemet stöds. |

### Se även

* class [FileDriver](../../filedriver)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* namnutrymme [Aspose.Gis](../../vectorlayer)
* hopsättning [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, SpatialReferenceSystem) {#create_3}

Skapar lagret och öppnar det för att läggas till.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | AbstractPath | Sökväg till filen. |
| driver | FileDriver | Drivrutin att använda. |
| spatialReferenceSystem | SpatialReferenceSystem | Rumsligt referenssystem. |

### Returvärde

Ett exempel på[`VectorLayer`](../../vectorlayer).

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vägen är`null`. |
| [GisException](../../gisexception) | Det gick inte att läsa eller skriva funktionen till/från filen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Rumsligt referenssystem stöds inte av drivrutinen. Använd[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) för att kontrollera om det rumsliga referenssystemet stöds. |

### Se även

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* namnutrymme [Aspose.Gis](../../vectorlayer)
* hopsättning [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_6}

Skapar lagret och öppnar det för att läggas till.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | String | Sökväg till filen. |
| driver | FileDriver | Drivrutin att använda. |
| options | DriverOptions | Förarspecifika alternativ. |
| spatialReferenceSystem | SpatialReferenceSystem | Rumsligt referenssystem. |

### Returvärde

Ett exempel på[`VectorLayer`](../../vectorlayer).

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vägen är`null`. |
| ArgumentException | Options-objektet har en felaktig typ för den här drivrutinen. |
| [GisException](../../gisexception) | Det gick inte att läsa eller skriva funktionen till/från filen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Rumsligt referenssystem stöds inte av drivrutinen. Använd[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) för att kontrollera om det rumsliga referenssystemet stöds. |

### Se även

* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* namnutrymme [Aspose.Gis](../../vectorlayer)
* hopsättning [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_2}

Skapar lagret och öppnar det för att läggas till.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | AbstractPath | Sökväg till filen. |
| driver | FileDriver | Drivrutin att använda. |
| options | DriverOptions | Förarspecifika alternativ. |
| spatialReferenceSystem | SpatialReferenceSystem | Rumsligt referenssystem. |

### Returvärde

Ett exempel på[`VectorLayer`](../../vectorlayer).

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vägen är`null`. |
| ArgumentException | Options-objektet har en felaktig typ för den här drivrutinen. |
| [GisException](../../gisexception) | Det gick inte att läsa eller skriva funktionen till/från filen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Rumsligt referenssystem stöds inte av drivrutinen. Använd[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) för att kontrollera om det rumsliga referenssystemet stöds. |

### Se även

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* namnutrymme [Aspose.Gis](../../vectorlayer)
* hopsättning [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
