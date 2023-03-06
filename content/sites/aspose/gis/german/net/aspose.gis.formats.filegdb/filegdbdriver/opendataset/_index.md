---
title: FileGdbDriver.OpenDataset
second_title: Aspose.GIS für .NET-API-Referenz
description: FileGdbDriver methode. Öffnet den Datensatz.
type: docs
weight: 70
url: /de/net/aspose.gis.formats.filegdb/filegdbdriver/opendataset/
---
## OpenDataset(string, FileGdbOptions) {#opendataset_5}

Öffnet den Datensatz.

```csharp
public Dataset OpenDataset(string path, FileGdbOptions options)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Pfad zum Datensatz. |
| options | FileGdbOptions | Fahrerspezifische Optionen. |

### Rückgabewert

Eine Instanz von[`Dataset`](../../../aspose.gis/dataset/).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| ArgumentNullException | Der Weg ist`null`. |
| [GisException](../../../aspose.gis/gisexception/) | Fehler beim Lesen des Layers aus dem Dataset. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Treiber kann Datensätze nicht öffnen (siehe[`CanOpenDatasets`](../canopendatasets/)). |

### Siehe auch

* class [Dataset](../../../aspose.gis/dataset/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* namensraum [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* Montage [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, DriverOptions) {#opendataset_1}

Öffnet den Datensatz.

```csharp
public override Dataset OpenDataset(AbstractPath path, DriverOptions options)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | AbstractPath | Pfad zum Datensatz. |
| options | DriverOptions | Fahrerspezifische Optionen. |

### Rückgabewert

Eine Instanz von[`Dataset`](../../../aspose.gis/dataset/).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| ArgumentNullException | Der Weg ist`null`. |
| [GisException](../../../aspose.gis/gisexception/) | Fehler beim Lesen des Layers aus dem Dataset. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Treiber kann Datensätze nicht öffnen (siehe[`CanOpenDatasets`](../canopendatasets/)). |

### Siehe auch

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [FileGdbDriver](../)
* namensraum [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* Montage [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, FileGdbOptions) {#opendataset_2}

Öffnet den Datensatz.

```csharp
public Dataset OpenDataset(AbstractPath path, FileGdbOptions options)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | AbstractPath | Pfad zum Datensatz. |
| options | FileGdbOptions | Fahrerspezifische Optionen. |

### Rückgabewert

Eine Instanz von[`Dataset`](../../../aspose.gis/dataset/).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| ArgumentNullException | Der Weg ist`null`. |
| [GisException](../../../aspose.gis/gisexception/) | Fehler beim Lesen des Layers aus dem Dataset. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Treiber kann Datensätze nicht öffnen (siehe[`CanOpenDatasets`](../canopendatasets/)). |

### Siehe auch

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* namensraum [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* Montage [Aspose.GIS](../../../)


