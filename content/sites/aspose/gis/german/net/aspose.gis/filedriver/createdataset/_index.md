---
title: FileDriver.CreateDataset
second_title: Aspose.GIS für .NET-API-Referenz
description: FileDriver methode. Erstellt einen Datensatz.
type: docs
weight: 50
url: /de/net/aspose.gis/filedriver/createdataset/
---
## CreateDataset(string) {#createdataset_2}

Erstellt einen Datensatz.

```csharp
public Dataset CreateDataset(string path)
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
| [GisException](../../gisexception/) | Fehler beim Erstellen des Datensatzes. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Treiber kann Datensätze nicht öffnen (siehe[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Datensatz ist bereits vorhanden. |

### Siehe auch

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* namensraum [Aspose.Gis](../../filedriver/)
* Montage [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath) {#createdataset}

Erstellt einen Datensatz.

```csharp
public Dataset CreateDataset(AbstractPath path)
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
| [GisException](../../gisexception/) | Fehler beim Erstellen des Datensatzes. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Treiber kann Datensätze nicht öffnen (siehe[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Datensatz ist bereits vorhanden. |

### Siehe auch

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* namensraum [Aspose.Gis](../../filedriver/)
* Montage [Aspose.GIS](../../../)

---

## CreateDataset(string, DriverOptions) {#createdataset_3}

Erstellt einen Datensatz.

```csharp
public Dataset CreateDataset(string path, DriverOptions options)
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
| [GisException](../../gisexception/) | Fehler beim Erstellen des Datensatzes. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Treiber kann Datensätze nicht öffnen (siehe[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Datensatz ist bereits vorhanden. |

### Siehe auch

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* namensraum [Aspose.Gis](../../filedriver/)
* Montage [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath, DriverOptions) {#createdataset_1}

Erstellt einen Datensatz.

```csharp
public virtual Dataset CreateDataset(AbstractPath path, DriverOptions options)
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
| [GisException](../../gisexception/) | Fehler beim Erstellen des Datensatzes. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Treiber kann Datensätze nicht öffnen (siehe[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Datensatz ist bereits vorhanden. |

### Siehe auch

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* namensraum [Aspose.Gis](../../filedriver/)
* Montage [Aspose.GIS](../../../)


