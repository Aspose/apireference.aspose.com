---
title: HtmlSaveOptions.RasterImagesSavingModes
second_title: Aspose.PDF für .NET-API-Referenz
description: Konvertiertes PDF kann Rasterbilder enthalten .png .jpeg usw. Diese Aufzählung definiert Methoden zur Behandlung von Rasterbildern während der Konvertierung von PDF nach HTML
type: docs
weight: 3590
url: /de/net/aspose.pdf/htmlsaveoptions.rasterimagessavingmodes/
---
## HtmlSaveOptions.RasterImagesSavingModes enumeration

Konvertiertes PDF kann Rasterbilder enthalten (.png, *.jpeg usw.) Diese Aufzählung definiert Methoden zur Behandlung von Rasterbildern während der Konvertierung von PDF nach HTML

```csharp
public enum RasterImagesSavingModes
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| AsPngImagesEmbeddedIntoSvg | `0` | für jede einzelne Rasterdatei wird ein Wrapper-SVG-Bild generiert, und das Rasterbild wird als Base64-codierte Zeichenfolgen in dieses SVG-Bild eingebettet |
| AsExternalPngFilesReferencedViaSvg | `1` | unterschiedliche Rasterbilder werden als PNG-Dateien getrennt, aber durch Umschließen von SVG-Bildern referenziert, dh es wird eine PNG-Datei und eine SVG für jedes Rasterbild generiert, und jedes dieser SVGs enthält Links zu relevanten PNG-Dateien |
| AsEmbeddedPartsOfPngPageBackground | `2` | Für jede Ergebnisseite wird eine große PNG-Hintergrunddatei generiert. Rasterbilder werden in diese Datei eingebettet und als Regionen dieses Bildes gerendert. Es werden keine externen PNG-Dateien für jedes Bild generiert, nur eine PNG-Datei pro Seite wird im Konvertierungsergebnissatz von Dateien vorhanden sein. |

### Siehe auch

* class [HtmlSaveOptions](../htmlsaveoptions)
* namensraum [Aspose.Pdf](../../aspose.pdf)
* Montage [Aspose.PDF](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
