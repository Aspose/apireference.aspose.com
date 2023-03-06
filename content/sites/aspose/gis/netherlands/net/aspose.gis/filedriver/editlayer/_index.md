---
title: FileDriver.EditLayer
second_title: Aspose.GIS voor .NET API-referentie
description: FileDriver methode. Opent een laag om te bewerken.
type: docs
weight: 70
url: /nl/net/aspose.gis/filedriver/editlayer/
---
## EditLayer(string, DriverOptions) {#editlayer_1}

Opent een laag om te bewerken.

```csharp
public VectorLayer EditLayer(string path, DriverOptions options = null)
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

### Zie ook

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* naamruimte [Aspose.Gis](../../filedriver/)
* montage [Aspose.GIS](../../../)

---

## EditLayer(AbstractPath, DriverOptions) {#editlayer}

Opent een laag om te bewerken.

```csharp
public virtual VectorLayer EditLayer(AbstractPath path, DriverOptions options = null)
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
| NotSupportedException | Stuurprogramma kan geen lagen bewerken. |
| IOException | Er is een I/O-fout opgetreden. |

### Opmerkingen

De driver creëert een binnenlaag met alle features. Maar we hebben de optie om schijfruimte te gebruiken in plaats van RAM. Er zijn stuurprogramma's voor een meer optimaal gebruik van bronnen (zie de specifieke stuurprogrammadocumentatie). Ook kan het stuurprogramma een laag bewerken als het de lagen kan maken en openen.

### Zie ook

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* naamruimte [Aspose.Gis](../../filedriver/)
* montage [Aspose.GIS](../../../)


