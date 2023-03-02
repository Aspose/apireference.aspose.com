---
title: GmlDriver.CreateLayer
second_title: Aspose.GIS für .NET-API-Referenz
description: GmlDriver methode. Erstellt einen Layer und öffnet ihn zum Hinzufügen neuer Features.
type: docs
weight: 40
url: /de/net/aspose.gis.formats.gml/gmldriver/createlayer/
---
## CreateLayer(string, GmlOptions) {#createlayer_7}

Erstellt einen Layer und öffnet ihn zum Hinzufügen neuer Features.

```csharp
public VectorLayer CreateLayer(string path, GmlOptions options)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Pfad zur Datei. |
| options | GmlOptions | Fahrerspezifische Optionen. |

### Rückgabewert

Eine Instanz von[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | Die Ebene ist bereits vorhanden. |

### Siehe auch

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [GmlOptions](../../gmloptions/)
* class [GmlDriver](../)
* namensraum [Aspose.Gis.Formats.Gml](../../gmldriver/)
* Montage [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

Erstellt einen Layer und öffnet ihn zum Hinzufügen neuer Features.

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

### Siehe auch

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [GmlDriver](../)
* namensraum [Aspose.Gis.Formats.Gml](../../gmldriver/)
* Montage [Aspose.GIS](../../../)

---

## CreateLayer(string, GmlOptions, SpatialReferenceSystem) {#createlayer_8}

Erstellt einen Layer und öffnet ihn zum Hinzufügen neuer Features.

```csharp
public VectorLayer CreateLayer(string path, GmlOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Pfad zur Datei. |
| options | GmlOptions | Fahrerspezifische Optionen. |
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
* class [GmlOptions](../../gmloptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [GmlDriver](../)
* namensraum [Aspose.Gis.Formats.Gml](../../gmldriver/)
* Montage [Aspose.GIS](../../../)


