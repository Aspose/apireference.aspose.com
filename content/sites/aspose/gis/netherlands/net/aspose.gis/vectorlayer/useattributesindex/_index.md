---
title: VectorLayer.UseAttributesIndex
second_title: Aspose.GIS voor .NET API-referentie
description: VectorLayer methode. Laadt attribuutindex om het filteren op attribuutwaarde te versnellen in filtermethodes zoalsWhereGreater. Als de index niet bestaat wordt deze eerst gemaakt. GebruikforceRebuild indexrecreatie afdwingen.
type: docs
weight: 180
url: /nl/net/aspose.gis/vectorlayer/useattributesindex/
---
## UseAttributesIndex(string, string, bool) {#useattributesindex_1}

Laadt attribuutindex om het filteren op attribuutwaarde te versnellen in filtermethodes zoals[`WhereGreater`](../../featuressequence/wheregreater/). Als de index niet bestaat, wordt deze eerst gemaakt. Gebruik*forceRebuild* indexrecreatie afdwingen.

```csharp
public void UseAttributesIndex(string indexPath, string attributeName, bool forceRebuild = false)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| indexPath | String | Pad naar het indexbestand. |
| attributeName | String | Naam van het kenmerk waarop de index moet worden gebouwd. |
| forceRebuild | Boolean | Of de index opnieuw moet worden gemaakt, zelfs als deze al bestaat. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |
| ArgumentException | Attribuut met een dergelijke naam bestaat niet in de laag. |
| IOException | Er is een I/O-fout opgetreden. |
| InvalidOperationException | Index voor het opgegeven attribuut dat al is geladen voor deze laag. |
| [GisException](../../gisexception/) | Het bestand bestaat en het is geen attribuutindexbestand gemaakt door Aspose.GIS. |

### Zie ook

* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)

---

## UseAttributesIndex(AbstractPath, string, bool) {#useattributesindex}

Laadt attribuutindex om het filteren op attribuutwaarde te versnellen in filtermethodes zoals[`WhereGreater`](../../featuressequence/wheregreater/). Als de index niet bestaat, wordt deze eerst gemaakt. Gebruik*forceRebuild* indexrecreatie afdwingen.

```csharp
public virtual void UseAttributesIndex(AbstractPath indexPath, string attributeName, 
    bool forceRebuild = false)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| indexPath | AbstractPath | Pad naar het indexbestand. |
| attributeName | String | Naam van het kenmerk waarop de index moet worden gebouwd. |
| forceRebuild | Boolean | Of de index opnieuw moet worden gemaakt, zelfs als deze al bestaat. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |
| ArgumentException | Attribuut met een dergelijke naam bestaat niet in de laag. |
| IOException | Er is een I/O-fout opgetreden. |
| InvalidOperationException | Index voor het opgegeven attribuut dat al is geladen voor deze laag. |
| [GisException](../../gisexception/) | Het bestand bestaat en het is geen attribuutindexbestand gemaakt door Aspose.GIS. |

### Zie ook

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)


