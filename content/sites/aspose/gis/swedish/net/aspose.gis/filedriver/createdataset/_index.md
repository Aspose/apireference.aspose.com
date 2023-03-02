---
title: FileDriver.CreateDataset
second_title: Aspose.GIS för .NET API Referens
description: FileDriver metod. Skapar en datauppsättning.
type: docs
weight: 50
url: /sv/net/aspose.gis/filedriver/createdataset/
---
## CreateDataset(string) {#createdataset_2}

Skapar en datauppsättning.

```csharp
public Dataset CreateDataset(string path)
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
| [GisException](../../gisexception/) | Det gick inte att skapa datauppsättningen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Drivrutinen kan inte öppna datauppsättningar (se[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Datauppsättningen finns redan. |

### Se även

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath) {#createdataset}

Skapar en datauppsättning.

```csharp
public Dataset CreateDataset(AbstractPath path)
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
| [GisException](../../gisexception/) | Det gick inte att skapa datauppsättningen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Drivrutinen kan inte öppna datauppsättningar (se[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Datauppsättningen finns redan. |

### Se även

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)

---

## CreateDataset(string, DriverOptions) {#createdataset_3}

Skapar en datauppsättning.

```csharp
public Dataset CreateDataset(string path, DriverOptions options)
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
| [GisException](../../gisexception/) | Det gick inte att skapa datauppsättningen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Drivrutinen kan inte öppna datauppsättningar (se[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Datauppsättningen finns redan. |

### Se även

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath, DriverOptions) {#createdataset_1}

Skapar en datauppsättning.

```csharp
public virtual Dataset CreateDataset(AbstractPath path, DriverOptions options)
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
| [GisException](../../gisexception/) | Det gick inte att skapa datauppsättningen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Drivrutinen kan inte öppna datauppsättningar (se[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Datauppsättningen finns redan. |

### Se även

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)


