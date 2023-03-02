---
title: VectorMapLayer.ImportSld
second_title: Aspose.GIS för .NET API Referens
description: VectorMapLayer metod. Importerar stil från Styled Layer Descriptorfil som finns på den angivna sökvägen.
type: docs
weight: 60
url: /sv/net/aspose.gis.rendering/vectormaplayer/importsld/
---
## ImportSld(string, SldImportOptions) {#importsld_1}

Importerar stil från Styled Layer Descriptor-fil som finns på den angivna sökvägen.

```csharp
public void ImportSld(string path, SldImportOptions options = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | String | Sökväg till Styled Layer Descriptor-filen. |
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

---

## ImportSld(AbstractPath, SldImportOptions) {#importsld}

Importerar stil från Styled Layer Descriptor-fil som finns på den angivna sökvägen.

```csharp
public void ImportSld(AbstractPath path, SldImportOptions options = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | AbstractPath | Sökväg till Styled Layer Descriptor-filen. |
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

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* namnutrymme [Aspose.Gis.Rendering](../../vectormaplayer/)
* hopsättning [Aspose.GIS](../../../)


