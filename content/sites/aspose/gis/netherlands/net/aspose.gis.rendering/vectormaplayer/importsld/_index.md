---
title: VectorMapLayer.ImportSld
second_title: Aspose.GIS voor .NET API-referentie
description: VectorMapLayer methode. Importeert stijl uit Styled Layer Descriptorbestand dat zich op het opgegeven pad bevindt.
type: docs
weight: 60
url: /nl/net/aspose.gis.rendering/vectormaplayer/importsld/
---
## ImportSld(string, SldImportOptions) {#importsld_1}

Importeert stijl uit Styled Layer Descriptor-bestand dat zich op het opgegeven pad bevindt.

```csharp
public void ImportSld(string path, SldImportOptions options = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | String | Pad naar het Styled Layer Descriptor-bestand. |
| options | SldImportOptions | Importeer opties. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |
| XmlException | Er is een fout opgetreden tijdens het parseren van de XML. |
| FormatException | Er is geen SLD-stijl gevonden in de XML. |

### Opmerkingen

Deze methode overschrijft de waarde van de[`Symbolizer`](../symbolizer/) eigenschap.

### Zie ook

* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* naamruimte [Aspose.Gis.Rendering](../../vectormaplayer/)
* montage [Aspose.GIS](../../../)

---

## ImportSld(AbstractPath, SldImportOptions) {#importsld}

Importeert stijl uit Styled Layer Descriptor-bestand dat zich op het opgegeven pad bevindt.

```csharp
public void ImportSld(AbstractPath path, SldImportOptions options = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | AbstractPath | Pad naar het Styled Layer Descriptor-bestand. |
| options | SldImportOptions | Importeer opties. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |
| XmlException | Er is een fout opgetreden tijdens het parseren van de XML. |
| FormatException | Er is geen SLD-stijl gevonden in de XML. |

### Opmerkingen

Deze methode overschrijft de waarde van de[`Symbolizer`](../symbolizer/) eigenschap.

### Zie ook

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* naamruimte [Aspose.Gis.Rendering](../../vectormaplayer/)
* montage [Aspose.GIS](../../../)


