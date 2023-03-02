---
title: FileDriver.CreateDataset
second_title: Aspose.GIS voor .NET API-referentie
description: FileDriver methode. Creëert een dataset.
type: docs
weight: 50
url: /nl/net/aspose.gis/filedriver/createdataset/
---
## CreateDataset(string) {#createdataset_2}

Creëert een dataset.

```csharp
public Dataset CreateDataset(string path)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | String | Pad naar de gegevensset. |

### Winstwaarde

Een voorbeeld van[`Dataset`](../../dataset/).

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het pad is`null`. |
| [GisException](../../gisexception/) | Fout bij het maken van de dataset. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Driver kan datasets niet openen (zie[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Dataset bestaat al. |

### Zie ook

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* naamruimte [Aspose.Gis](../../filedriver/)
* montage [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath) {#createdataset}

Creëert een dataset.

```csharp
public Dataset CreateDataset(AbstractPath path)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | AbstractPath | Pad naar de gegevensset. |

### Winstwaarde

Een voorbeeld van[`Dataset`](../../dataset/).

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het pad is`null`. |
| [GisException](../../gisexception/) | Fout bij het maken van de dataset. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Driver kan datasets niet openen (zie[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Dataset bestaat al. |

### Zie ook

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* naamruimte [Aspose.Gis](../../filedriver/)
* montage [Aspose.GIS](../../../)

---

## CreateDataset(string, DriverOptions) {#createdataset_3}

Creëert een dataset.

```csharp
public Dataset CreateDataset(string path, DriverOptions options)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | String | Pad naar de gegevensset. |
| options | DriverOptions | Bestuurderspecifieke opties. |

### Winstwaarde

Een voorbeeld van[`Dataset`](../../dataset/).

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentException | Het object Opties heeft een onjuist type voor dit stuurprogramma. |
| ArgumentNullException | Het pad is`null`. |
| [GisException](../../gisexception/) | Fout bij het maken van de dataset. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Driver kan datasets niet openen (zie[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Dataset bestaat al. |

### Zie ook

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* naamruimte [Aspose.Gis](../../filedriver/)
* montage [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath, DriverOptions) {#createdataset_1}

Creëert een dataset.

```csharp
public virtual Dataset CreateDataset(AbstractPath path, DriverOptions options)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | AbstractPath | Pad naar de gegevensset. |
| options | DriverOptions | Bestuurderspecifieke opties. |

### Winstwaarde

Een voorbeeld van[`Dataset`](../../dataset/).

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentException | Het object Opties heeft een onjuist type voor dit stuurprogramma. |
| ArgumentNullException | Het pad is`null`. |
| [GisException](../../gisexception/) | Fout bij het maken van de dataset. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Driver kan datasets niet openen (zie[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Dataset bestaat al. |

### Zie ook

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* naamruimte [Aspose.Gis](../../filedriver/)
* montage [Aspose.GIS](../../../)


