---
title: FileDriver.OpenLayer
second_title: Aspose.GIS voor .NET API-referentie
description: FileDriver methode. Opent de laag om te lezen.
type: docs
weight: 90
url: /nl/net/aspose.gis/filedriver/openlayer/
---
## OpenLayer(string) {#openlayer_2}

Opent de laag om te lezen.

```csharp
public VectorLayer OpenLayer(string path)
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
| [GisException](../../gisexception/) | Fout bij het lezen van de functie uit het bestand. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Driver kan geen vectorlagen openen (zie[`CanOpenLayers`](../canopenlayers/)). |

### Zie ook

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* naamruimte [Aspose.Gis](../../filedriver/)
* montage [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath) {#openlayer}

Opent de laag om te lezen.

```csharp
public VectorLayer OpenLayer(AbstractPath path)
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
| [GisException](../../gisexception/) | Fout bij het lezen van de functie uit het bestand. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Driver kan geen vectorlagen openen (zie[`CanOpenLayers`](../canopenlayers/)). |

### Zie ook

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* naamruimte [Aspose.Gis](../../filedriver/)
* montage [Aspose.GIS](../../../)

---

## OpenLayer(string, DriverOptions) {#openlayer_3}

Opent de laag om te lezen.

```csharp
public VectorLayer OpenLayer(string path, DriverOptions options)
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
| ArgumentException | Het object Opties heeft een onjuist type voor dit stuurprogramma. |
| ArgumentNullException | Het pad is`null`. |
| [GisException](../../gisexception/) | Fout bij het lezen van de functie uit het bestand. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Driver kan geen vectorlagen openen (zie[`CanOpenLayers`](../canopenlayers/)). |

### Zie ook

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* naamruimte [Aspose.Gis](../../filedriver/)
* montage [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath, DriverOptions) {#openlayer_1}

Opent de laag om te lezen.

```csharp
public abstract VectorLayer OpenLayer(AbstractPath path, DriverOptions options)
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
| ArgumentException | Het object Opties heeft een onjuist type voor dit stuurprogramma. |
| ArgumentNullException | Het pad is`null`. |
| [GisException](../../gisexception/) | Fout bij het lezen van de functie uit het bestand. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Driver kan geen vectorlagen openen (zie[`CanOpenLayers`](../canopenlayers/)). |

### Zie ook

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* naamruimte [Aspose.Gis](../../filedriver/)
* montage [Aspose.GIS](../../../)


