---
title: Dataset.Open
second_title: Aspose.GIS für .NET-API-Referenz
description: Dataset methode. Öffnet den Datensatz.
type: docs
weight: 20
url: /de/net/aspose.gis/dataset/open/
---
## Open(string, FileDriver) {#open_3}

Öffnet den Datensatz.

```csharp
public static Dataset Open(string path, FileDriver driver)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Pfad zum Datensatz. |
| driver | FileDriver | Treiber zu verwenden. |

### Rückgabewert

Eine Instanz von[`Dataset`](../).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Weg ist`null`. |
| [GisException](../../gisexception/) | Fehler beim Lesen des Datensatzes. |
| IOException | Ein E/A-Fehler ist aufgetreten. |

### Siehe auch

* class [FileDriver](../../filedriver/)
* class [Dataset](../)
* namensraum [Aspose.Gis](../../dataset/)
* Montage [Aspose.GIS](../../../)

---

## Open(AbstractPath, FileDriver) {#open}

Öffnet den Datensatz.

```csharp
public static Dataset Open(AbstractPath path, FileDriver driver)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | AbstractPath | Pfad zum Datensatz. |
| driver | FileDriver | Treiber zu verwenden. |

### Rückgabewert

Eine Instanz von[`Dataset`](../).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Weg ist`null`. |
| [GisException](../../gisexception/) | Fehler beim Lesen des Datensatzes. |
| IOException | Ein E/A-Fehler ist aufgetreten. |

### Siehe auch

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [Dataset](../)
* namensraum [Aspose.Gis](../../dataset/)
* Montage [Aspose.GIS](../../../)

---

## Open(string, FileDriver, DriverOptions) {#open_4}

Öffnet den Datensatz.

```csharp
public static Dataset Open(string path, FileDriver driver, DriverOptions options)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Pfad zum Datensatz. |
| driver | FileDriver | Treiber zu verwenden. |
| options | DriverOptions | Fahrerspezifische Optionen. |

### Rückgabewert

Eine Instanz von[`Dataset`](../).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| ArgumentNullException | Der Weg ist`null`. |
| [GisException](../../gisexception/) | Fehler beim Lesen des Datensatzes. |
| IOException | Ein E/A-Fehler ist aufgetreten. |

### Siehe auch

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* namensraum [Aspose.Gis](../../dataset/)
* Montage [Aspose.GIS](../../../)

---

## Open(AbstractPath, FileDriver, DriverOptions) {#open_1}

Öffnet den Datensatz.

```csharp
public static Dataset Open(AbstractPath path, FileDriver driver, DriverOptions options)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | AbstractPath | Pfad zum Datensatz. |
| driver | FileDriver | Treiber zu verwenden. |
| options | DriverOptions | Fahrerspezifische Optionen. |

### Rückgabewert

Eine Instanz von[`Dataset`](../).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| ArgumentNullException | Der Weg ist`null`. |
| [GisException](../../gisexception/) | Fehler beim Lesen des Datensatzes. |
| IOException | Ein E/A-Fehler ist aufgetreten. |

### Siehe auch

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* namensraum [Aspose.Gis](../../dataset/)
* Montage [Aspose.GIS](../../../)

---

## Open(IDbConnection, DatabaseDriver) {#open_2}

Öffnet den Datensatz.

```csharp
public static Dataset Open(IDbConnection connection, DatabaseDriver driver)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| connection | IDbConnection | Geöffnete Verbindung zur Datenbank. |
| driver | DatabaseDriver | Treiber zu verwenden. |

### Rückgabewert

Eine Instanz von[`Dataset`](../).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| ArgumentNullException | Der Weg ist`null`. |
| [GisException](../../gisexception/) | Fehler beim Lesen des Datensatzes. |
| IOException | Ein E/A-Fehler ist aufgetreten. |

### Siehe auch

* class [DatabaseDriver](../../databasedriver/)
* class [Dataset](../)
* namensraum [Aspose.Gis](../../dataset/)
* Montage [Aspose.GIS](../../../)


