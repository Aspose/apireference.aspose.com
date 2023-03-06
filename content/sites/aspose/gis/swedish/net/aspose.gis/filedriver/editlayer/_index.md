---
title: FileDriver.EditLayer
second_title: Aspose.GIS för .NET API Referens
description: FileDriver metod. Öppnar ett lager för redigering.
type: docs
weight: 70
url: /sv/net/aspose.gis/filedriver/editlayer/
---
## EditLayer(string, DriverOptions) {#editlayer_1}

Öppnar ett lager för redigering.

```csharp
public VectorLayer EditLayer(string path, DriverOptions options = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | String | Sökväg till filen. |
| options | DriverOptions | Förarspecifika alternativ. |

### Returvärde

Ett exempel på[`VectorLayer`](../../vectorlayer/).

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentException | Options-objektet har en felaktig typ för den här drivrutinen. |
| ArgumentNullException | Vägen är`null`. |
| [GisException](../../gisexception/) | Det gick inte att läsa funktionen från filen. |
| IOException | Ett I/O-fel uppstod. |

### Se även

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)

---

## EditLayer(AbstractPath, DriverOptions) {#editlayer}

Öppnar ett lager för redigering.

```csharp
public virtual VectorLayer EditLayer(AbstractPath path, DriverOptions options = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | AbstractPath | Sökväg till filen. |
| options | DriverOptions | Förarspecifika alternativ. |

### Returvärde

Ett exempel på[`VectorLayer`](../../vectorlayer/).

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentException | Options-objektet har en felaktig typ för den här drivrutinen. |
| ArgumentNullException | Vägen är`null`. |
| [GisException](../../gisexception/) | Det gick inte att läsa funktionen från filen. |
| NotSupportedException | Drivrutinen kan inte redigera lager. |
| IOException | Ett I/O-fel uppstod. |

### Anmärkningar

Föraren skapar ett inre lager med alla funktioner. Men vi har möjlighet att använda diskutrymme istället RAM. Det finns drivrutiner för mer optimal användning av resurser (se den specifika drivrutinsdokumentationen). Även drivrutinen kan redigera ett lager om den kan skapa och öppna lagren.

### Se även

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* namnutrymme [Aspose.Gis](../../filedriver/)
* hopsättning [Aspose.GIS](../../../)


