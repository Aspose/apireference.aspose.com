---
title: VectorMapLayer.ImportSldFromString
second_title: Aspose.GIS voor .NET API-referentie
description: VectorMapLayer methode. Importeert stijl uit de gespecificeerde Styled Layer Descriptor string.
type: docs
weight: 70
url: /nl/net/aspose.gis.rendering/vectormaplayer/importsldfromstring/
---
## VectorMapLayer.ImportSldFromString method

Importeert stijl uit de gespecificeerde Styled Layer Descriptor string.

```csharp
public void ImportSldFromString(string sld, SldImportOptions options = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sld | String | Gestileerde laagdescriptor. |
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


