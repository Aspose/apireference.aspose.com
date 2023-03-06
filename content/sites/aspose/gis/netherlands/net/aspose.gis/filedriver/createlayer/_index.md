---
title: FileDriver.CreateLayer
second_title: Aspose.GIS voor .NET API-referentie
description: FileDriver methode. Maakt de laag en opent deze om toe te voegen.
type: docs
weight: 60
url: /nl/net/aspose.gis/filedriver/createlayer/
---
## CreateLayer(string) {#createlayer_4}

Maakt de laag en opent deze om toe te voegen.

```csharp
public VectorLayer CreateLayer(string path)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | String | Pad naar het bestand. |

### Winstwaarde

Een voorbeeld van[`VectorLayer`](../../vectorlayer/).

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het pad is`null`. |
| [GisException](../../gisexception/) | Fout bij het schrijven van de functie naar het bestand. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Driver kan geen vectorlagen maken (zie[`CanCreateLayers`](../cancreatelayers/)). |

### Zie ook

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* naamruimte [Aspose.Gis](../../filedriver/)
* montage [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath) {#createlayer}

Maakt de laag en opent deze om toe te voegen.

```csharp
public VectorLayer CreateLayer(AbstractPath path)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | AbstractPath | Pad naar het bestand. |

### Winstwaarde

Een voorbeeld van[`VectorLayer`](../../vectorlayer/).

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het pad is`null`. |
| [GisException](../../gisexception/) | Fout bij het schrijven van de functie naar het bestand. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Driver kan geen vectorlagen maken (zie[`CanCreateLayers`](../cancreatelayers/)). |

### Zie ook

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* naamruimte [Aspose.Gis](../../filedriver/)
* montage [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions) {#createlayer_5}

Maakt de laag en opent deze om toe te voegen.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | String | Pad naar het bestand. |
| options | DriverOptions | Bestuurderspecifieke opties. |

### Winstwaarde

Een voorbeeld van[`VectorLayer`](../../vectorlayer/).

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het pad is`null`. |
| ArgumentException | Het object Opties heeft een onjuist type voor dit stuurprogramma. |
| [GisException](../../gisexception/) | Fout bij het schrijven van de functie naar het bestand. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Driver kan geen vectorlagen maken (zie[`CanCreateLayers`](../cancreatelayers/)). |

### Zie ook

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* naamruimte [Aspose.Gis](../../filedriver/)
* montage [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions) {#createlayer_1}

Maakt de laag en opent deze om toe te voegen.

```csharp
public VectorLayer CreateLayer(AbstractPath path, DriverOptions options)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | AbstractPath | Pad naar het bestand. |
| options | DriverOptions | Bestuurderspecifieke opties. |

### Winstwaarde

Een voorbeeld van[`VectorLayer`](../../vectorlayer/).

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het pad is`null`. |
| ArgumentException | Het object Opties heeft een onjuist type voor dit stuurprogramma. |
| [GisException](../../gisexception/) | Fout bij het schrijven van de functie naar het bestand. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Driver kan geen vectorlagen maken (zie[`CanCreateLayers`](../cancreatelayers/)). |

### Zie ook

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* naamruimte [Aspose.Gis](../../filedriver/)
* montage [Aspose.GIS](../../../)

---

## CreateLayer(string, SpatialReferenceSystem) {#createlayer_7}

Maakt de laag en opent deze om toe te voegen.

```csharp
public VectorLayer CreateLayer(string path, SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | String | Pad naar het bestand. |
| spatialReferenceSystem | SpatialReferenceSystem | Ruimtelijk referentiesysteem. |

### Winstwaarde

Een voorbeeld van[`VectorLayer`](../../vectorlayer/).

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het pad is`null`. |
| [GisException](../../gisexception/) | Fout bij het schrijven van de functie naar het bestand. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Ruimtelijk referentiesysteem wordt niet ondersteund door de bestuurder. Gebruiken[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) om te controleren of ruimtelijk referentiesysteem wordt ondersteund. |

### Zie ook

* class [VectorLayer](../../vectorlayer/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* naamruimte [Aspose.Gis](../../filedriver/)
* montage [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, SpatialReferenceSystem) {#createlayer_3}

Maakt de laag en opent deze om toe te voegen.

```csharp
public VectorLayer CreateLayer(AbstractPath path, SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | AbstractPath | Pad naar het bestand. |
| spatialReferenceSystem | SpatialReferenceSystem | Ruimtelijk referentiesysteem. |

### Winstwaarde

Een voorbeeld van[`VectorLayer`](../../vectorlayer/).

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het pad is`null`. |
| [GisException](../../gisexception/) | Fout bij het schrijven van de functie naar het bestand. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Ruimtelijk referentiesysteem wordt niet ondersteund door de bestuurder. Gebruiken[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) om te controleren of ruimtelijk referentiesysteem wordt ondersteund. |

### Zie ook

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* naamruimte [Aspose.Gis](../../filedriver/)
* montage [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions, SpatialReferenceSystem) {#createlayer_6}

Maakt de laag en opent deze om toe te voegen.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | String | Pad naar het bestand. |
| options | DriverOptions | Bestuurderspecifieke opties. |
| spatialReferenceSystem | SpatialReferenceSystem | Ruimtelijk referentiesysteem. |

### Winstwaarde

Een voorbeeld van[`VectorLayer`](../../vectorlayer/).

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het pad is`null`. |
| ArgumentException | Het object Opties heeft een onjuist type voor dit stuurprogramma. |
| [GisException](../../gisexception/) | Fout bij het schrijven van de functie naar het bestand. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Ruimtelijk referentiesysteem wordt niet ondersteund door de bestuurder. Gebruiken[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) om te controleren of ruimtelijk referentiesysteem wordt ondersteund. |
| NotSupportedException | Driver kan geen vectorlagen maken (zie[`CanCreateLayers`](../cancreatelayers/)). |

### Zie ook

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* naamruimte [Aspose.Gis](../../filedriver/)
* montage [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

Maakt de laag en opent deze om toe te voegen.

```csharp
public abstract VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | AbstractPath | Pad naar het bestand. |
| options | DriverOptions | Bestuurderspecifieke opties. |
| spatialReferenceSystem | SpatialReferenceSystem | Ruimtelijk referentiesysteem. |

### Winstwaarde

Een voorbeeld van[`VectorLayer`](../../vectorlayer/).

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het pad is`null`. |
| ArgumentException | Het object Opties heeft een onjuist type voor dit stuurprogramma. |
| [GisException](../../gisexception/) | Fout bij het schrijven van de functie naar het bestand. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Ruimtelijk referentiesysteem wordt niet ondersteund door de bestuurder. Gebruiken[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) om te controleren of ruimtelijk referentiesysteem wordt ondersteund. |
| NotSupportedException | Driver kan geen vectorlagen maken (zie[`CanCreateLayers`](../cancreatelayers/)). |

### Zie ook

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* naamruimte [Aspose.Gis](../../filedriver/)
* montage [Aspose.GIS](../../../)


