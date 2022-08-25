---
title: CreateLayer
second_title: Aspose.GIS für .NET-API-Referenz
description: Erstellt die Ebene und öffnet sie zum Anhängen.
type: docs
weight: 60
url: /de/net/aspose.gis/filedriver/createlayer/
---
## CreateLayer(string) {#createlayer_4}

Erstellt die Ebene und öffnet sie zum Anhängen.

```csharp
public VectorLayer CreateLayer(string path)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Pfad zur Datei. |

### Rückgabewert

Eine Instanz von[`VectorLayer`](../../vectorlayer).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Weg ist`null`. |
| [GisException](../../gisexception) | Fehler beim Schreiben des Features in die Datei. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Der Treiber kann keine Vektorebenen erstellen (siehe[`CanCreateLayers`](../cancreatelayers)). |

### Siehe auch

* class [VectorLayer](../../vectorlayer)
* class [FileDriver](../../filedriver)
* namensraum [Aspose.Gis](../../filedriver)
* Montage [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath) {#createlayer}

Erstellt die Ebene und öffnet sie zum Anhängen.

```csharp
public VectorLayer CreateLayer(AbstractPath path)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | AbstractPath | Pfad zur Datei. |

### Rückgabewert

Eine Instanz von[`VectorLayer`](../../vectorlayer).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Weg ist`null`. |
| [GisException](../../gisexception) | Fehler beim Schreiben des Features in die Datei. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Der Treiber kann keine Vektorebenen erstellen (siehe[`CanCreateLayers`](../cancreatelayers)). |

### Siehe auch

* class [VectorLayer](../../vectorlayer)
* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* namensraum [Aspose.Gis](../../filedriver)
* Montage [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions) {#createlayer_5}

Erstellt die Ebene und öffnet sie zum Anhängen.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Pfad zur Datei. |
| options | DriverOptions | Fahrerspezifische Optionen. |

### Rückgabewert

Eine Instanz von[`VectorLayer`](../../vectorlayer).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Weg ist`null`. |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| [GisException](../../gisexception) | Fehler beim Schreiben des Features in die Datei. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Der Treiber kann keine Vektorebenen erstellen (siehe[`CanCreateLayers`](../cancreatelayers)). |

### Siehe auch

* class [VectorLayer](../../vectorlayer)
* class [DriverOptions](../../driveroptions)
* class [FileDriver](../../filedriver)
* namensraum [Aspose.Gis](../../filedriver)
* Montage [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions) {#createlayer_1}

Erstellt die Ebene und öffnet sie zum Anhängen.

```csharp
public VectorLayer CreateLayer(AbstractPath path, DriverOptions options)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | AbstractPath | Pfad zur Datei. |
| options | DriverOptions | Fahrerspezifische Optionen. |

### Rückgabewert

Eine Instanz von[`VectorLayer`](../../vectorlayer).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Weg ist`null`. |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| [GisException](../../gisexception) | Fehler beim Schreiben des Features in die Datei. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Der Treiber kann keine Vektorebenen erstellen (siehe[`CanCreateLayers`](../cancreatelayers)). |

### Siehe auch

* class [VectorLayer](../../vectorlayer)
* class [AbstractPath](../../abstractpath)
* class [DriverOptions](../../driveroptions)
* class [FileDriver](../../filedriver)
* namensraum [Aspose.Gis](../../filedriver)
* Montage [Aspose.GIS](../../../)

---

## CreateLayer(string, SpatialReferenceSystem) {#createlayer_7}

Erstellt die Ebene und öffnet sie zum Anhängen.

```csharp
public VectorLayer CreateLayer(string path, SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Pfad zur Datei. |
| spatialReferenceSystem | SpatialReferenceSystem | Räumliches Bezugssystem. |

### Rückgabewert

Eine Instanz von[`VectorLayer`](../../vectorlayer).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Weg ist`null`. |
| [GisException](../../gisexception) | Fehler beim Schreiben des Features in die Datei. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Raumbezugssystem wird vom Treiber nicht unterstützt. Verwendung[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem) um zu prüfen, ob das Raumbezugssystem unterstützt wird. |

### Siehe auch

* class [VectorLayer](../../vectorlayer)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [FileDriver](../../filedriver)
* namensraum [Aspose.Gis](../../filedriver)
* Montage [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, SpatialReferenceSystem) {#createlayer_3}

Erstellt die Ebene und öffnet sie zum Anhängen.

```csharp
public VectorLayer CreateLayer(AbstractPath path, SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | AbstractPath | Pfad zur Datei. |
| spatialReferenceSystem | SpatialReferenceSystem | Räumliches Bezugssystem. |

### Rückgabewert

Eine Instanz von[`VectorLayer`](../../vectorlayer).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Weg ist`null`. |
| [GisException](../../gisexception) | Fehler beim Schreiben des Features in die Datei. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Raumbezugssystem wird vom Treiber nicht unterstützt. Verwendung[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem) um zu prüfen, ob das Raumbezugssystem unterstützt wird. |

### Siehe auch

* class [VectorLayer](../../vectorlayer)
* class [AbstractPath](../../abstractpath)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [FileDriver](../../filedriver)
* namensraum [Aspose.Gis](../../filedriver)
* Montage [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions, SpatialReferenceSystem) {#createlayer_6}

Erstellt die Ebene und öffnet sie zum Anhängen.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Pfad zur Datei. |
| options | DriverOptions | Fahrerspezifische Optionen. |
| spatialReferenceSystem | SpatialReferenceSystem | Räumliches Bezugssystem. |

### Rückgabewert

Eine Instanz von[`VectorLayer`](../../vectorlayer).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Weg ist`null`. |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| [GisException](../../gisexception) | Fehler beim Schreiben des Features in die Datei. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Raumbezugssystem wird vom Treiber nicht unterstützt. Verwendung[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem) um zu prüfen, ob das Raumbezugssystem unterstützt wird. |
| NotSupportedException | Der Treiber kann keine Vektorebenen erstellen (siehe[`CanCreateLayers`](../cancreatelayers)). |

### Siehe auch

* class [VectorLayer](../../vectorlayer)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [FileDriver](../../filedriver)
* namensraum [Aspose.Gis](../../filedriver)
* Montage [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

Erstellt die Ebene und öffnet sie zum Anhängen.

```csharp
public abstract VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | AbstractPath | Pfad zur Datei. |
| options | DriverOptions | Fahrerspezifische Optionen. |
| spatialReferenceSystem | SpatialReferenceSystem | Räumliches Bezugssystem. |

### Rückgabewert

Eine Instanz von[`VectorLayer`](../../vectorlayer).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Weg ist`null`. |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| [GisException](../../gisexception) | Fehler beim Schreiben des Features in die Datei. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Raumbezugssystem wird vom Treiber nicht unterstützt. Verwendung[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem) um zu prüfen, ob das Raumbezugssystem unterstützt wird. |
| NotSupportedException | Der Treiber kann keine Vektorebenen erstellen (siehe[`CanCreateLayers`](../cancreatelayers)). |

### Siehe auch

* class [VectorLayer](../../vectorlayer)
* class [AbstractPath](../../abstractpath)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [FileDriver](../../filedriver)
* namensraum [Aspose.Gis](../../filedriver)
* Montage [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
