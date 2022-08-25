---
title: Create
second_title: Aspose.GIS für .NET-API-Referenz
description: Erstellt den Layer und öffnet ihn zum Hinzufügen neuer Features.
type: docs
weight: 10
url: /de/net/aspose.gis/vectorlayer/create/
---
## Create(string, FileDriver) {#create_4}

Erstellt den Layer und öffnet ihn zum Hinzufügen neuer Features.

```csharp
public static VectorLayer Create(string path, FileDriver driver)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Pfad zur Datei. |
| driver | FileDriver | Treiber zu verwenden. |

### Rückgabewert

Eine Nur-Schreib-Schicht.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Weg ist`null`. |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| [GisException](../../gisexception) | Fehler beim Schreiben des Features in die Datei. |
| IOException | Ein E/A-Fehler ist aufgetreten. |

### Siehe auch

* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* namensraum [Aspose.Gis](../../vectorlayer)
* Montage [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions) {#create_5}

Erstellt den Layer und öffnet ihn zum Hinzufügen neuer Features.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Pfad zur Datei. |
| driver | FileDriver | Treiber zu verwenden. |
| options | DriverOptions | Fahrerspezifische Optionen. |

### Rückgabewert

Eine Nur-Schreib-Schicht.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Weg ist`null`. |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| [GisException](../../gisexception) | Fehler beim Schreiben des Features in die Datei. |
| IOException | Ein E/A-Fehler ist aufgetreten. |

### Siehe auch

* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [VectorLayer](../../vectorlayer)
* namensraum [Aspose.Gis](../../vectorlayer)
* Montage [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver) {#create}

Erstellt den Layer und öffnet ihn zum Hinzufügen neuer Features.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | AbstractPath | Pfad zur Datei. |
| driver | FileDriver | Treiber zu verwenden. |

### Rückgabewert

Eine Nur-Schreib-Schicht.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Weg ist`null`. |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| [GisException](../../gisexception) | Fehler beim Schreiben des Features in die Datei. |
| IOException | Ein E/A-Fehler ist aufgetreten. |

### Siehe auch

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* namensraum [Aspose.Gis](../../vectorlayer)
* Montage [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions) {#create_1}

Erstellt den Layer und öffnet ihn zum Hinzufügen neuer Features.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | AbstractPath | Pfad zur Datei. |
| driver | FileDriver | Treiber zu verwenden. |
| options | DriverOptions | Fahrerspezifische Optionen. |

### Rückgabewert

Eine Nur-Schreib-Schicht.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Weg ist`null`. |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| [GisException](../../gisexception) | Fehler beim Schreiben des Features in die Datei. |
| IOException | Ein E/A-Fehler ist aufgetreten. |

### Siehe auch

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [VectorLayer](../../vectorlayer)
* namensraum [Aspose.Gis](../../vectorlayer)
* Montage [Aspose.GIS](../../../)

---

## Create(string, FileDriver, SpatialReferenceSystem) {#create_7}

Erstellt die Ebene und öffnet sie zum Anhängen.

```csharp
public static VectorLayer Create(string path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Pfad zur Datei. |
| driver | FileDriver | Treiber zu verwenden. |
| spatialReferenceSystem | SpatialReferenceSystem | Räumliches Bezugssystem. |

### Rückgabewert

Eine Instanz von[`VectorLayer`](../../vectorlayer).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Weg ist`null`. |
| [GisException](../../gisexception) | Fehler beim Lesen oder Schreiben des Features in/aus der Datei. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Raumbezugssystem wird vom Treiber nicht unterstützt. Verwendung[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) um zu prüfen, ob das Raumbezugssystem unterstützt wird. |

### Siehe auch

* class [FileDriver](../../filedriver)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* namensraum [Aspose.Gis](../../vectorlayer)
* Montage [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, SpatialReferenceSystem) {#create_3}

Erstellt die Ebene und öffnet sie zum Anhängen.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | AbstractPath | Pfad zur Datei. |
| driver | FileDriver | Treiber zu verwenden. |
| spatialReferenceSystem | SpatialReferenceSystem | Räumliches Bezugssystem. |

### Rückgabewert

Eine Instanz von[`VectorLayer`](../../vectorlayer).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Weg ist`null`. |
| [GisException](../../gisexception) | Fehler beim Lesen oder Schreiben des Features in/aus der Datei. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Raumbezugssystem wird vom Treiber nicht unterstützt. Verwendung[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) um zu prüfen, ob das Raumbezugssystem unterstützt wird. |

### Siehe auch

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* namensraum [Aspose.Gis](../../vectorlayer)
* Montage [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_6}

Erstellt die Ebene und öffnet sie zum Anhängen.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Pfad zur Datei. |
| driver | FileDriver | Treiber zu verwenden. |
| options | DriverOptions | Fahrerspezifische Optionen. |
| spatialReferenceSystem | SpatialReferenceSystem | Räumliches Bezugssystem. |

### Rückgabewert

Eine Instanz von[`VectorLayer`](../../vectorlayer).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Weg ist`null`. |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| [GisException](../../gisexception) | Fehler beim Lesen oder Schreiben des Features in/aus der Datei. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Raumbezugssystem wird vom Treiber nicht unterstützt. Verwendung[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) um zu prüfen, ob das Raumbezugssystem unterstützt wird. |

### Siehe auch

* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* namensraum [Aspose.Gis](../../vectorlayer)
* Montage [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_2}

Erstellt die Ebene und öffnet sie zum Anhängen.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | AbstractPath | Pfad zur Datei. |
| driver | FileDriver | Treiber zu verwenden. |
| options | DriverOptions | Fahrerspezifische Optionen. |
| spatialReferenceSystem | SpatialReferenceSystem | Räumliches Bezugssystem. |

### Rückgabewert

Eine Instanz von[`VectorLayer`](../../vectorlayer).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Weg ist`null`. |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| [GisException](../../gisexception) | Fehler beim Lesen oder Schreiben des Features in/aus der Datei. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Raumbezugssystem wird vom Treiber nicht unterstützt. Verwendung[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) um zu prüfen, ob das Raumbezugssystem unterstützt wird. |

### Siehe auch

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* namensraum [Aspose.Gis](../../vectorlayer)
* Montage [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
