---
title: VectorMapLayer.ImportSld
second_title: Aspose.GIS für .NET-API-Referenz
description: VectorMapLayer methode. Importiert den Stil aus der StilebenenDeskriptordatei die sich im angegebenen Pfad befindet.
type: docs
weight: 60
url: /de/net/aspose.gis.rendering/vectormaplayer/importsld/
---
## ImportSld(string, SldImportOptions) {#importsld_1}

Importiert den Stil aus der Stilebenen-Deskriptordatei, die sich im angegebenen Pfad befindet.

```csharp
public void ImportSld(string path, SldImportOptions options = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Pfad zur Stilebenen-Deskriptordatei. |
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

---

## ImportSld(AbstractPath, SldImportOptions) {#importsld}

Importiert den Stil aus der Stilebenen-Deskriptordatei, die sich im angegebenen Pfad befindet.

```csharp
public void ImportSld(AbstractPath path, SldImportOptions options = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | AbstractPath | Pfad zur Stilebenen-Deskriptordatei. |
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

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* namensraum [Aspose.Gis.Rendering](../../vectormaplayer/)
* Montage [Aspose.GIS](../../../)


