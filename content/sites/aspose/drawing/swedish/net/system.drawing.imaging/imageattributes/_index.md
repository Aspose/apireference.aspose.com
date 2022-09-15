---
title: ImageAttributes
second_title: Aspose.Drawing för .NET API Referens
description: Innehåller information om hur bitmapps och metafilfärger manipuleras under rendering.
type: docs
weight: 740
url: /sv/net/system.drawing.imaging/imageattributes/
---
## ImageAttributes class

Innehåller information om hur bitmapps- och metafilfärger manipuleras under rendering.

```csharp
public sealed class ImageAttributes : ICloneable, IDisposable
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [ImageAttributes](imageattributes)() | Initierar en ny instans av[`ImageAttributes`](../imageattributes) class. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [ClearBrushRemapTable](../../system.drawing.imaging/imageattributes/clearbrushremaptable)() | Rensar penselfärgombildningstabellen för dettaImageAttributes objekt. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey#clearcolorkey)() | Rensar färgnyckeln (transparensintervall) för standardkategorin. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey#clearcolorkey_1)(ColorAdjustType) | Rensar färgnyckeln (transparensintervall) för en angiven kategori. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix#clearcolormatrix)() | Rensar färgjusteringsmatrisen för standardkategorin. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix#clearcolormatrix_1)(ColorAdjustType) | Rensar färgjusteringsmatrisen för en angiven kategori. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma#cleargamma)() | Inaktiverar gammakorrigering för standardkategorin. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma#cleargamma_1)(ColorAdjustType) | Inaktiverar gammakorrigering för en angiven kategori. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop#clearnoop)() | Rensar NoOp-inställningen för standardkategorin. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop#clearnoop_1)(ColorAdjustType) | Rensar NoOp-inställningen för en angiven kategori. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel#clearoutputchannel)() | Rensar utgångskanalinställningen för CMYK (cyan-magenta-gul-svart) för standardkategorin. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel#clearoutputchannel_1)(ColorAdjustType) | Rensar utgångskanalinställningen (cyan-magenta-gul-svart) för en angiven kategori. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile#clearoutputchannelcolorprofile)() | Rensar utgångskanalens färgprofilinställning för standardkategorin. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile#clearoutputchannelcolorprofile_1)(ColorAdjustType) | Rensar utgångskanalens färgprofilinställning för en angiven kategori. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable#clearremaptable)() | Rensar färgombildningstabellen för standardkategorin. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable#clearremaptable_1)(ColorAdjustType) | Rensar färgombildningstabellen för en angiven kategori. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold#clearthreshold)() | Tar bort tröskelvärdet för standardkategorin. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold#clearthreshold_1)(ColorAdjustType) | Tar bort tröskelvärdet för en angiven kategori. |
| [Clone](../../system.drawing.imaging/imageattributes/clone)() | Skapar en exakt kopia av dettaImageAttributes objekt. |
| [Dispose](../../system.drawing.imaging/imageattributes/dispose)() | Frigör alla resurser som används av dettaImageAttributes objekt. |
| [GetAdjustedPalette](../../system.drawing.imaging/imageattributes/getadjustedpalette)(ColorPalette, ColorAdjustType) | Justerar färgerna i en palett enligt justeringsinställningarna för en angiven kategori. |
| [SetBrushRemapTable](../../system.drawing.imaging/imageattributes/setbrushremaptable)(ColorMap[]) | Ställer in färgombildningstabellen för penselkategorin. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey#setcolorkey)(Color, Color) | Ställer in färgnyckeln för standardkategorin. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey#setcolorkey_1)(Color, Color, ColorAdjustType) | Ställer in färgnyckeln (transparensintervall) för en angiven kategori. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices)(ColorMatrix, ColorMatrix) | Ställer in färgjusteringsmatrisen och gråskalejusteringsmatrisen för standardkategorin. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices_1)(ColorMatrix, ColorMatrix, ColorMatrixFlag) | Ställer in färgjusteringsmatrisen och gråskalejusteringsmatrisen för standardkategorin. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices_2)(ColorMatrix, ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Ställer in färgjusteringsmatrisen och gråskalejusteringsmatrisen för en angiven kategori. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix)(ColorMatrix) | Ställer in färgjusteringsmatrisen för standardkategorin. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix_1)(ColorMatrix, ColorMatrixFlag) | Ställer in färgjusteringsmatrisen för standardkategorin. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix_2)(ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Ställer in färgjusteringsmatrisen för en angiven kategori. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma#setgamma)(float) | Anger gammavärdet för standardkategorin. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma#setgamma_1)(float, ColorAdjustType) | Anger gammavärdet för en angiven kategori. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop#setnoop)() | Stänger av färgjustering för standardkategorin. Du kan ringa[`ClearNoOp`](./clearnoop) metod för att återställa färgjusteringsinställningarna som var på plats innan call till[`SetNoOp`](./setnoop) metod. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop#setnoop_1)(ColorAdjustType) | Stänger av färgjustering för en angiven kategori. Du kan ringa till[`ClearNoOp`](./clearnoop) metod för att återställa färgjusteringsinställningarna som var på plats innan call till[`SetNoOp`](./setnoop) metod. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel#setoutputchannel)(ColorChannelFlag) | Ställer in CMYK-utgångskanalen (cyan-magenta-gul-svart) för standardkategorin. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel#setoutputchannel_1)(ColorChannelFlag, ColorAdjustType) | Ställer in CMYK-utgångskanalen (cyan-magenta-gul-svart) för en angiven kategori. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile#setoutputchannelcolorprofile)(string) | Ställer in utgångskanalens färgprofilfil för standardkategorin. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile#setoutputchannelcolorprofile_1)(string, ColorAdjustType) | Ställer in utgångskanalens färgprofilfil för en angiven kategori. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable#setremaptable)(ColorMap[]) | Ställer in färgombildningstabellen för standardkategorin. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable#setremaptable_1)(ColorMap[], ColorAdjustType) | Ställer in färgombildningstabellen för en angiven kategori. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold#setthreshold)(float) | Ställer in tröskeln (transparensintervall) för standardkategorin. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold#setthreshold_1)(float, ColorAdjustType) | Ställer in tröskeln (transparensintervall) för en angiven kategori. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode)(WrapMode) | Ställer in lindningsläget som används för att bestämma hur en textur ska kaklas över en form, eller vid formgränser. En textur är sida vid sida över en form för att fylla i den när strukturen är mindre än formen den fyller. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode_1)(WrapMode, Color) | Ställer in lindningsläget och färgen som används för att bestämma hur en textur ska kaklas över en form, eller vid formgränser. En textur är sida vid sida över en form för att fylla i den när strukturen är mindre än formen den fyller. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode_2)(WrapMode, Color, bool) | Ställer in lindningsläget och färgen som används för att bestämma hur en textur ska kaklas över en form, eller vid formgränser. En textur är sida vid sida över en form för att fylla i den när strukturen är mindre än formen den fyller. |

### Se även

* namnutrymme [System.Drawing.Imaging](../../system.drawing.imaging)
* hopsättning [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
