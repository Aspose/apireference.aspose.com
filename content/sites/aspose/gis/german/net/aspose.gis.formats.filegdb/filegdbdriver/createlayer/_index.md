---
title: FileGdbDriver.CreateLayer
second_title: Aspose.GIS für .NET-API-Referenz
description: FileGdbDriver methode. Erstellt einen Layer und öffnet ihn zum Hinzufügen neuer Features.
type: docs
weight: 60
url: /de/net/aspose.gis.formats.filegdb/filegdbdriver/createlayer/
---
## CreateLayer(string, FileGdbOptions) {#createlayer_8}

Erstellt einen Layer und öffnet ihn zum Hinzufügen neuer Features.

```csharp
public VectorLayer CreateLayer(string path, FileGdbOptions options)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Pfad zur Datei. |
| options | FileGdbOptions | Fahrerspezifische Optionen. |

### Rückgabewert

Eine Instanz von[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | Die Ebene ist bereits vorhanden. |

### Siehe auch

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* namensraum [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* Montage [Aspose.GIS](../../../)

---

## CreateLayer(string, FileGdbOptions, SpatialReferenceSystem) {#createlayer_9}

Erstellt eine Ebene und öffnet sie zum Anhängen.

```csharp
public VectorLayer CreateLayer(string path, FileGdbOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Pfad zur Datei. |
| options | FileGdbOptions | Fahrerspezifische Optionen. |
| spatialReferenceSystem | SpatialReferenceSystem | Räumliches Bezugssystem. |

### Rückgabewert

Eine Instanz von[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | Die Ebene ist bereits vorhanden. |
| NotSupportedException | Das räumliche Bezugssystem wird vom Treiber nicht unterstützt. |

### Siehe auch

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [FileGdbOptions](../../filegdboptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileGdbDriver](../)
* namensraum [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* Montage [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

Erstellt eine Ebene und öffnet sie zum Anhängen.

```csharp
public override VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | AbstractPath | Pfad zur Datei. |
| options | DriverOptions | Fahrerspezifische Optionen. |
| spatialReferenceSystem | SpatialReferenceSystem | Räumliches Bezugssystem. |

### Rückgabewert

Eine Instanz von[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | Die Ebene ist bereits vorhanden. |
| NotSupportedException | Das räumliche Bezugssystem wird vom Treiber nicht unterstützt. |

### Siehe auch

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileGdbDriver](../)
* namensraum [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* Montage [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, FileGdbOptions, SpatialReferenceSystem) {#createlayer_3}

Erstellt eine Ebene und öffnet sie zum Anhängen.

```csharp
public VectorLayer CreateLayer(AbstractPath path, FileGdbOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | AbstractPath | Pfad zur Datei. |
| options | FileGdbOptions | Fahrerspezifische Optionen. |
| spatialReferenceSystem | SpatialReferenceSystem | Räumliches Bezugssystem. |

### Rückgabewert

Eine Instanz von[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | Die Ebene ist bereits vorhanden. |
| NotSupportedException | Das räumliche Bezugssystem wird vom Treiber nicht unterstützt. |

### Siehe auch

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [FileGdbOptions](../../filegdboptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileGdbDriver](../)
* namensraum [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* Montage [Aspose.GIS](../../../)


