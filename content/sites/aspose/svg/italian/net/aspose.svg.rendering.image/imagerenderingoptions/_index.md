---
title: Class ImageRenderingOptions
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.Rendering.Image.ImageRenderingOptions classe. Rappresenta le opzioni di rendering perImageDevice . Questa opzione viene utilizzata per specificare il formato dellimmagine di output la compressione la risoluzione ecc.
type: docs
weight: 2860
url: /it/net/aspose.svg.rendering.image/imagerenderingoptions/
---
## ImageRenderingOptions class

Rappresenta le opzioni di rendering per[`ImageDevice`](../imagedevice/) . Questa opzione viene utilizzata per specificare il formato dell'immagine di output, la compressione, la risoluzione ecc.

```csharp
public class ImageRenderingOptions : RenderingOptions
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [ImageRenderingOptions](imagerenderingoptions/#constructor)() | Inizializza una nuova istanza di`ImageRenderingOptions` classe;Png verrà utilizzato come formato immagine predefinito. |
| [ImageRenderingOptions](imagerenderingoptions/#constructor_1)(ImageFormat) | Inizializza una nuova istanza di`ImageRenderingOptions` classe con formato immagine specificato. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [BackgroundColor](../../aspose.svg.rendering/renderingoptions/backgroundcolor/) { get; set; } | Ottiene o impostaColor che riempirà lo sfondo di ogni pagina. Il valore predefinito èTransparent . |
| [Compression](../../aspose.svg.rendering.image/imagerenderingoptions/compression/) { get; set; } | Imposta o ottiene Tagged Image File Format (TIFF)[`Compression`](../compression/) . Per impostazione predefinita questa proprietà èLZW . |
| [Css](../../aspose.svg.rendering/renderingoptions/css/) { get; } | Ottiene a[`CssOptions`](../../aspose.svg.rendering/cssoptions/) oggetto utilizzato per la configurazione dell'elaborazione delle proprietà css. |
| [Format](../../aspose.svg.rendering.image/imagerenderingoptions/format/) { get; set; } | Imposta o ottiene[`ImageFormat`](../imageformat/) . Per impostazione predefinita questa proprietà èPng . |
| override [HorizontalResolution](../../aspose.svg.rendering.image/imagerenderingoptions/horizontalresolution/) { get; set; } | Imposta o ottiene la risoluzione orizzontale per le immagini di output e interne (utilizzate durante l'elaborazione dei filtri), in pixel per pollice. Per impostazione predefinita questa proprietà è 300 dpi. |
| [PageSetup](../../aspose.svg.rendering/renderingoptions/pagesetup/) { get; } | Ottiene un oggetto di configurazione della pagina utilizzato per il set di pagine di output della configurazione. |
| [SmoothingMode](../../aspose.svg.rendering.image/imagerenderingoptions/smoothingmode/) { get; set; } | Ottiene o imposta la qualità di rendering per questa grafica. |
| [Text](../../aspose.svg.rendering.image/imagerenderingoptions/text/) { get; } | Ottiene a[`TextOptions`](../textoptions/) oggetto utilizzato per la configurazione del rendering del testo. |
| override [VerticalResolution](../../aspose.svg.rendering.image/imagerenderingoptions/verticalresolution/) { get; set; } | Imposta o ottiene la risoluzione verticale per le immagini di output e interne (utilizzate durante l'elaborazione dei filtri), in pixel per pollice. Per impostazione predefinita questa proprietà è 300 dpi. |

### Guarda anche

* class [RenderingOptions](../../aspose.svg.rendering/renderingoptions/)
* spazio dei nomi [Aspose.Svg.Rendering.Image](../../aspose.svg.rendering.image/)
* assemblea [Aspose.SVG](../../)


