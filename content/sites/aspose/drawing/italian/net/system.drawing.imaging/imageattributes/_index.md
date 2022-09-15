---
title: ImageAttributes
second_title: Aspose.Drawing per .NET API Reference
description: Contiene informazioni su come vengono manipolati i colori bitmap e metafile durante il rendering.
type: docs
weight: 740
url: /it/net/system.drawing.imaging/imageattributes/
---
## ImageAttributes class

Contiene informazioni su come vengono manipolati i colori bitmap e metafile durante il rendering.

```csharp
public sealed class ImageAttributes : ICloneable, IDisposable
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [ImageAttributes](imageattributes)() | Inizializza una nuova istanza di[`ImageAttributes`](../imageattributes) classe. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [ClearBrushRemapTable](../../system.drawing.imaging/imageattributes/clearbrushremaptable)() | Cancella la tabella di rimappatura del colore del pennelloImageAttributes oggetto. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey#clearcolorkey)() | Cancella la chiave colore (intervallo di trasparenza) per la categoria predefinita. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey#clearcolorkey_1)(ColorAdjustType) | Cancella la chiave del colore (intervallo di trasparenza) per una categoria specificata. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix#clearcolormatrix)() | Cancella la matrice di regolazione del colore per la categoria predefinita. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix#clearcolormatrix_1)(ColorAdjustType) | Cancella la matrice di regolazione del colore per una categoria specificata. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma#cleargamma)() | Disabilita la correzione gamma per la categoria predefinita. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma#cleargamma_1)(ColorAdjustType) | Disabilita la correzione gamma per una categoria specificata. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop#clearnoop)() | Cancella l'impostazione NoOp per la categoria predefinita. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop#clearnoop_1)(ColorAdjustType) | Cancella l'impostazione NoOp per una categoria specificata. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel#clearoutputchannel)() | Cancella l'impostazione del canale di output CMYK (ciano-magenta-giallo-nero) per la categoria predefinita. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel#clearoutputchannel_1)(ColorAdjustType) | Cancella l'impostazione del canale di uscita (ciano-magenta-giallo-nero) per una categoria specificata. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile#clearoutputchannelcolorprofile)() | Cancella l'impostazione del profilo colore del canale di output per la categoria predefinita. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile#clearoutputchannelcolorprofile_1)(ColorAdjustType) | Cancella l'impostazione del profilo colore del canale di output per una categoria specificata. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable#clearremaptable)() | Cancella la tabella di rimappatura dei colori per la categoria predefinita. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable#clearremaptable_1)(ColorAdjustType) | Cancella la tabella di rimappatura dei colori per una categoria specificata. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold#clearthreshold)() | Cancella il valore di soglia per la categoria predefinita. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold#clearthreshold_1)(ColorAdjustType) | Cancella il valore di soglia per una categoria specificata. |
| [Clone](../../system.drawing.imaging/imageattributes/clone)() | Crea una copia esatta di questoImageAttributes oggetto. |
| [Dispose](../../system.drawing.imaging/imageattributes/dispose)() | Rilascia tutte le risorse utilizzate da questoImageAttributes oggetto. |
| [GetAdjustedPalette](../../system.drawing.imaging/imageattributes/getadjustedpalette)(ColorPalette, ColorAdjustType) | Regola i colori in una tavolozza in base alle impostazioni di regolazione di una categoria specificata. |
| [SetBrushRemapTable](../../system.drawing.imaging/imageattributes/setbrushremaptable)(ColorMap[]) | Imposta la tabella di rimappatura dei colori per la categoria del pennello. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey#setcolorkey)(Color, Color) | Imposta la chiave colore per la categoria predefinita. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey#setcolorkey_1)(Color, Color, ColorAdjustType) | Imposta la chiave colore (intervallo di trasparenza) per una categoria specificata. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices)(ColorMatrix, ColorMatrix) | Imposta la matrice di regolazione del colore e la matrice di regolazione della scala di grigi per la categoria predefinita. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices_1)(ColorMatrix, ColorMatrix, ColorMatrixFlag) | Imposta la matrice di regolazione del colore e la matrice di regolazione della scala di grigi per la categoria predefinita. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices_2)(ColorMatrix, ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Imposta la matrice di regolazione del colore e la matrice di regolazione della scala di grigi per una categoria specificata. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix)(ColorMatrix) | Imposta la matrice di regolazione del colore per la categoria predefinita. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix_1)(ColorMatrix, ColorMatrixFlag) | Imposta la matrice di regolazione del colore per la categoria predefinita. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix_2)(ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Imposta la matrice di regolazione del colore per una categoria specificata. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma#setgamma)(float) | Imposta il valore gamma per la categoria predefinita. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma#setgamma_1)(float, ColorAdjustType) | Imposta il valore gamma per una categoria specificata. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop#setnoop)() | Disattiva la regolazione del colore per la categoria predefinita. Puoi chiamare il[`ClearNoOp`](./clearnoop) metodo per ripristinare le impostazioni di regolazione del colore che erano in vigore prima della chiamata al[`SetNoOp`](./setnoop) metodo. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop#setnoop_1)(ColorAdjustType) | Disattiva la regolazione del colore per una categoria specificata. Puoi chiamare il[`ClearNoOp`](./clearnoop) per ripristinare le impostazioni di regolazione del colore che erano in vigore prima della chiamata al[`SetNoOp`](./setnoop) metodo. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel#setoutputchannel)(ColorChannelFlag) | Imposta il canale di output CMYK (ciano-magenta-giallo-nero) per la categoria predefinita. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel#setoutputchannel_1)(ColorChannelFlag, ColorAdjustType) | Imposta il canale di uscita CMYK (ciano-magenta-giallo-nero) per una categoria specificata. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile#setoutputchannelcolorprofile)(string) | Imposta il file del profilo colore del canale di output per la categoria predefinita. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile#setoutputchannelcolorprofile_1)(string, ColorAdjustType) | Imposta il file del profilo colore del canale di output per una categoria specificata. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable#setremaptable)(ColorMap[]) | Imposta la tabella di rimappatura dei colori per la categoria predefinita. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable#setremaptable_1)(ColorMap[], ColorAdjustType) | Imposta la tabella di rimappatura dei colori per una categoria specificata. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold#setthreshold)(float) | Imposta la soglia (intervallo di trasparenza) per la categoria predefinita. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold#setthreshold_1)(float, ColorAdjustType) | Imposta la soglia (intervallo di trasparenza) per una categoria specificata. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode)(WrapMode) | Imposta la modalità di avvolgimento utilizzata per decidere come affiancare una trama su una forma o ai limiti della forma. Una trama viene affiancata su una forma per riempirla quando la trama è più piccola della forma che sta riempiendo. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode_1)(WrapMode, Color) | Imposta la modalità di avvolgimento e il colore utilizzati per decidere come affiancare una trama su una forma o ai limiti della forma. Una trama viene affiancata su una forma per riempirla quando la trama è più piccola della forma che sta riempiendo. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode_2)(WrapMode, Color, bool) | Imposta la modalità di avvolgimento e il colore utilizzati per decidere come affiancare una trama su una forma o ai limiti della forma. Una trama viene affiancata su una forma per riempirla quando la trama è più piccola della forma che sta riempiendo. |

### Guarda anche

* spazio dei nomi [System.Drawing.Imaging](../../system.drawing.imaging)
* assemblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
