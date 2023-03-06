---
title: VectorMapLayer.ImportSldFromString
second_title: Aspose.GIS für .NET-API-Referenz
description: VectorMapLayer methode. Importiert den Stil aus der angegebenen StilebenenDeskriptorzeichenfolge.
type: docs
weight: 70
url: /de/net/aspose.gis.rendering/vectormaplayer/importsldfromstring/
---
## VectorMapLayer.ImportSldFromString method

Importiert den Stil aus der angegebenen Stilebenen-Deskriptorzeichenfolge.

```csharp
public void ImportSldFromString(string sld, SldImportOptions options = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| sld | String | Gestylter Layer-Deskriptor. |
| options | SldImportOptions | Importoptionen. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |
| XmlException | Beim Analysieren des XML ist ein Fehler aufgetreten. |
| FormatException | Im XML wurde kein SLD-Stil gefunden. |

### Bemerkungen

Diese Methode überschreibt den Wert von[`Symbolizer`](../symbolizer/) Eigentum.

### Siehe auch

* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* namensraum [Aspose.Gis.Rendering](../../vectormaplayer/)
* Montage [Aspose.GIS](../../../)


