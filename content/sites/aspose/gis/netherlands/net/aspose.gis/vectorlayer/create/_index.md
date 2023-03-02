---
title: VectorLayer.Create
second_title: Aspose.GIS voor .NET API-referentie
description: VectorLayer methode. Maakt de laag aan en opent deze om nieuwe objecten toe te voegen.
type: docs
weight: 10
url: /nl/net/aspose.gis/vectorlayer/create/
---
## Create(string, FileDriver) {#create_4}

Maakt de laag aan en opent deze om nieuwe objecten toe te voegen.

```csharp
public static VectorLayer Create(string path, FileDriver driver)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | String | Pad naar het bestand. |
| driver | FileDriver | Bestuurder te gebruiken. |

### Winstwaarde

Een alleen-schrijven-laag.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het pad is`null`. |
| ArgumentException | Het object Opties heeft een onjuist type voor dit stuurprogramma. |
| [GisException](../../gisexception/) | Fout bij het schrijven van de functie naar het bestand. |
| IOException | Er is een I/O-fout opgetreden. |

### Zie ook

* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions) {#create_5}

Maakt de laag aan en opent deze om nieuwe objecten toe te voegen.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | String | Pad naar het bestand. |
| driver | FileDriver | Bestuurder te gebruiken. |
| options | DriverOptions | Bestuurderspecifieke opties. |

### Winstwaarde

Een alleen-schrijven-laag.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het pad is`null`. |
| ArgumentException | Het object Opties heeft een onjuist type voor dit stuurprogramma. |
| [GisException](../../gisexception/) | Fout bij het schrijven van de functie naar het bestand. |
| IOException | Er is een I/O-fout opgetreden. |

### Zie ook

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver) {#create}

Maakt de laag aan en opent deze om nieuwe objecten toe te voegen.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | AbstractPath | Pad naar het bestand. |
| driver | FileDriver | Bestuurder te gebruiken. |

### Winstwaarde

Een alleen-schrijven-laag.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het pad is`null`. |
| ArgumentException | Het object Opties heeft een onjuist type voor dit stuurprogramma. |
| [GisException](../../gisexception/) | Fout bij het schrijven van de functie naar het bestand. |
| IOException | Er is een I/O-fout opgetreden. |

### Zie ook

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions) {#create_1}

Maakt de laag aan en opent deze om nieuwe objecten toe te voegen.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | AbstractPath | Pad naar het bestand. |
| driver | FileDriver | Bestuurder te gebruiken. |
| options | DriverOptions | Bestuurderspecifieke opties. |

### Winstwaarde

Een alleen-schrijven-laag.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het pad is`null`. |
| ArgumentException | Het object Opties heeft een onjuist type voor dit stuurprogramma. |
| [GisException](../../gisexception/) | Fout bij het schrijven van de functie naar het bestand. |
| IOException | Er is een I/O-fout opgetreden. |

### Zie ook

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)

---

## Create(string, FileDriver, SpatialReferenceSystem) {#create_7}

Maakt de laag en opent deze om toe te voegen.

```csharp
public static VectorLayer Create(string path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | String | Pad naar het bestand. |
| driver | FileDriver | Bestuurder te gebruiken. |
| spatialReferenceSystem | SpatialReferenceSystem | Ruimtelijk referentiesysteem. |

### Winstwaarde

Een voorbeeld van[`VectorLayer`](../).

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het pad is`null`. |
| [GisException](../../gisexception/) | Fout bij het lezen of schrijven van de functie naar/van het bestand. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Ruimtelijk referentiesysteem wordt niet ondersteund door de bestuurder. Gebruiken[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/) om te controleren of ruimtelijk referentiesysteem wordt ondersteund. |

### Zie ook

* class [FileDriver](../../filedriver/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, SpatialReferenceSystem) {#create_3}

Maakt de laag en opent deze om toe te voegen.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | AbstractPath | Pad naar het bestand. |
| driver | FileDriver | Bestuurder te gebruiken. |
| spatialReferenceSystem | SpatialReferenceSystem | Ruimtelijk referentiesysteem. |

### Winstwaarde

Een voorbeeld van[`VectorLayer`](../).

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het pad is`null`. |
| [GisException](../../gisexception/) | Fout bij het lezen of schrijven van de functie naar/van het bestand. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Ruimtelijk referentiesysteem wordt niet ondersteund door de bestuurder. Gebruiken[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/) om te controleren of ruimtelijk referentiesysteem wordt ondersteund. |

### Zie ook

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_6}

Maakt de laag en opent deze om toe te voegen.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | String | Pad naar het bestand. |
| driver | FileDriver | Bestuurder te gebruiken. |
| options | DriverOptions | Bestuurderspecifieke opties. |
| spatialReferenceSystem | SpatialReferenceSystem | Ruimtelijk referentiesysteem. |

### Winstwaarde

Een voorbeeld van[`VectorLayer`](../).

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het pad is`null`. |
| ArgumentException | Het object Opties heeft een onjuist type voor dit stuurprogramma. |
| [GisException](../../gisexception/) | Fout bij het lezen of schrijven van de functie naar/van het bestand. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Ruimtelijk referentiesysteem wordt niet ondersteund door de bestuurder. Gebruiken[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/) om te controleren of ruimtelijk referentiesysteem wordt ondersteund. |

### Zie ook

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_2}

Maakt de laag en opent deze om toe te voegen.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | AbstractPath | Pad naar het bestand. |
| driver | FileDriver | Bestuurder te gebruiken. |
| options | DriverOptions | Bestuurderspecifieke opties. |
| spatialReferenceSystem | SpatialReferenceSystem | Ruimtelijk referentiesysteem. |

### Winstwaarde

Een voorbeeld van[`VectorLayer`](../).

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Het pad is`null`. |
| ArgumentException | Het object Opties heeft een onjuist type voor dit stuurprogramma. |
| [GisException](../../gisexception/) | Fout bij het lezen of schrijven van de functie naar/van het bestand. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Ruimtelijk referentiesysteem wordt niet ondersteund door de bestuurder. Gebruiken[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/) om te controleren of ruimtelijk referentiesysteem wordt ondersteund. |

### Zie ook

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)


