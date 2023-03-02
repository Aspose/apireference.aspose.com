---
title: FileDriver.OpenDataset
second_title: Aspose.GIS för .NET API Referens
description: FileDriver metod. Öppnar datasetet.
type: docs
weight: 80
url: /sv/net/aspose.gis/filedriver/opendataset/
---
## OpenDataset(string) {#opendataset_2}

Öppnar datasetet.

```csharp
public Dataset OpenDataset(string path)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | String | Sökväg till datasetet. |

### Returvärde

Ett exempel på[`Dataset`](../../dataset/).

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vägen är`null`. |
| [GisException](../../gisexception/) | Det gick inte att läsa datauppsättningen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Drivrutinen kan inte öppna datauppsättningar (se[`CanOpenDatasets`](../canopendatasets/)). |

### Se även

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath) {#opendataset}

Öppnar datasetet.

```csharp
public Dataset OpenDataset(AbstractPath path)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | AbstractPath | Sökväg till datasetet. |

### Returvärde

Ett exempel på[`Dataset`](../../dataset/).

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vägen är`null`. |
| [GisException](../../gisexception/) | Det gick inte att läsa datauppsättningen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Drivrutinen kan inte öppna datauppsättningar (se[`CanOpenDatasets`](../canopendatasets/)). |

### Se även

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)

---

## OpenDataset(string, DriverOptions) {#opendataset_3}

Öppnar datasetet.

```csharp
public Dataset OpenDataset(string path, DriverOptions options)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | String | Sökväg till datasetet. |
| options | DriverOptions | Förarspecifika alternativ. |

### Returvärde

Ett exempel på[`Dataset`](../../dataset/).

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentException | Options-objektet har en felaktig typ för den här drivrutinen. |
| ArgumentNullException | Vägen är`null`. |
| [GisException](../../gisexception/) | Det gick inte att läsa datauppsättningen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Drivrutinen kan inte öppna datauppsättningar (se[`CanOpenDatasets`](../canopendatasets/)). |

### Se även

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, DriverOptions) {#opendataset_1}

Öppnar datasetet.

```csharp
public virtual Dataset OpenDataset(AbstractPath path, DriverOptions options)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | AbstractPath | Sökväg till datasetet. |
| options | DriverOptions | Förarspecifika alternativ. |

### Returvärde

Ett exempel på[`Dataset`](../../dataset/).

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentException | Options-objektet har en felaktig typ för den här drivrutinen. |
| ArgumentNullException | Vägen är`null`. |
| [GisException](../../gisexception/) | Det gick inte att läsa datauppsättningen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Drivrutinen kan inte öppna datauppsättningar (se[`CanOpenDatasets`](../canopendatasets/)). |

### Se även

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)


