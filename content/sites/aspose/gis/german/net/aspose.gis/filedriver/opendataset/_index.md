---
title: FileDriver.OpenDataset
second_title: Aspose.GIS für .NET-API-Referenz
description: FileDriver methode. Öffnet den Datensatz.
type: docs
weight: 80
url: /de/net/aspose.gis/filedriver/opendataset/
---
## OpenDataset(string) {#opendataset_2}

Öffnet den Datensatz.

```csharp
public Dataset OpenDataset(string path)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Pfad zum Datensatz. |

### Rückgabewert

Eine Instanz von[`Dataset`](../../dataset/).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Weg ist`null`. |
| [GisException](../../gisexception/) | Fehler beim Lesen des Datensatzes. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Treiber kann Datensätze nicht öffnen (siehe[`CanOpenDatasets`](../canopendatasets/)). |

### Siehe auch

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* namensraum [Aspose.Gis](../../filedriver/)
* Montage [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath) {#opendataset}

Öffnet den Datensatz.

```csharp
public Dataset OpenDataset(AbstractPath path)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | AbstractPath | Pfad zum Datensatz. |

### Rückgabewert

Eine Instanz von[`Dataset`](../../dataset/).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Weg ist`null`. |
| [GisException](../../gisexception/) | Fehler beim Lesen des Datensatzes. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Treiber kann Datensätze nicht öffnen (siehe[`CanOpenDatasets`](../canopendatasets/)). |

### Siehe auch

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* namensraum [Aspose.Gis](../../filedriver/)
* Montage [Aspose.GIS](../../../)

---

## OpenDataset(string, DriverOptions) {#opendataset_3}

Öffnet den Datensatz.

```csharp
public Dataset OpenDataset(string path, DriverOptions options)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Pfad zum Datensatz. |
| options | DriverOptions | Fahrerspezifische Optionen. |

### Rückgabewert

Eine Instanz von[`Dataset`](../../dataset/).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| ArgumentNullException | Der Weg ist`null`. |
| [GisException](../../gisexception/) | Fehler beim Lesen des Datensatzes. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Treiber kann Datensätze nicht öffnen (siehe[`CanOpenDatasets`](../canopendatasets/)). |

### Siehe auch

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* namensraum [Aspose.Gis](../../filedriver/)
* Montage [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, DriverOptions) {#opendataset_1}

Öffnet den Datensatz.

```csharp
public virtual Dataset OpenDataset(AbstractPath path, DriverOptions options)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | AbstractPath | Pfad zum Datensatz. |
| options | DriverOptions | Fahrerspezifische Optionen. |

### Rückgabewert

Eine Instanz von[`Dataset`](../../dataset/).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| ArgumentNullException | Der Weg ist`null`. |
| [GisException](../../gisexception/) | Fehler beim Lesen des Datensatzes. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Treiber kann Datensätze nicht öffnen (siehe[`CanOpenDatasets`](../canopendatasets/)). |

### Siehe auch

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* namensraum [Aspose.Gis](../../filedriver/)
* Montage [Aspose.GIS](../../../)


