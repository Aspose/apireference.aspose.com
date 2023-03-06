---
title: VectorMapLayer.ImportSldFromString
second_title: Aspose.GIS för .NET API Referens
description: VectorMapLayer metod. Importerar stil från den angivna strängen för beskrivning av stillager.
type: docs
weight: 70
url: /sv/net/aspose.gis.rendering/vectormaplayer/importsldfromstring/
---
## VectorMapLayer.ImportSldFromString method

Importerar stil från den angivna strängen för beskrivning av stillager.

```csharp
public void ImportSldFromString(string sld, SldImportOptions options = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| sld | String | Utformad lagerbeskrivning. |
| options | SldImportOptions | Importalternativ. |

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argument är`null`. |
| XmlException | Ett fel uppstod vid analys av XML. |
| FormatException | Ingen SLD-stil hittades i XML. |

### Anmärkningar

Denna metod skriver över värdet på[`Symbolizer`](../symbolizer/) egenskap.

### Se även

* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* namnutrymme [Aspose.Gis.Rendering](../../vectormaplayer/)
* hopsättning [Aspose.GIS](../../../)


