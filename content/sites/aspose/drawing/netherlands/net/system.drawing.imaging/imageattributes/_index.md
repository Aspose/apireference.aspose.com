---
title: Class ImageAttributes
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.Imaging.ImageAttributes klas. Bevat informatie over hoe bitmap en metabestandkleuren worden gemanipuleerd tijdens het renderen.
type: docs
weight: 740
url: /nl/net/system.drawing.imaging/imageattributes/
---
## ImageAttributes class

Bevat informatie over hoe bitmap- en metabestandkleuren worden gemanipuleerd tijdens het renderen.

```csharp
public sealed class ImageAttributes : ICloneable, IDisposable
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [ImageAttributes](imageattributes/)() | Initialiseert een nieuw exemplaar van het`ImageAttributes` klasse. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [ClearBrushRemapTable](../../system.drawing.imaging/imageattributes/clearbrushremaptable/)() | Hiermee wist u de tabel voor opnieuw toewijzen van penseelkleurenImageAttributes object. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey/#clearcolorkey)() | Wist de kleurtoets (transparantiebereik) voor de standaardcategorie. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey/#clearcolorkey_1)(ColorAdjustType) | Wist de kleurtoets (transparantiebereik) voor een opgegeven categorie. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix/#clearcolormatrix)() | Wist de kleuraanpassingsmatrix voor de standaardcategorie. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix/#clearcolormatrix_1)(ColorAdjustType) | Wist de kleuraanpassingsmatrix voor een opgegeven categorie. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma/#cleargamma)() | Schakelt gammacorrectie uit voor de standaardcategorie. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma/#cleargamma_1)(ColorAdjustType) | Schakelt gammacorrectie uit voor een opgegeven categorie. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop/#clearnoop)() | Wist de NoOp-instelling voor de standaardcategorie. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop/#clearnoop_1)(ColorAdjustType) | Wist de NoOp-instelling voor een opgegeven categorie. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel/#clearoutputchannel)() | Wist de instelling van het CMYK-uitvoerkanaal (cyaan-magenta-geel-zwart) voor de standaardcategorie. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel/#clearoutputchannel_1)(ColorAdjustType) | Wist de (cyaan-magenta-geel-zwart) uitvoerkanaalinstelling voor een gespecificeerde categorie. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile/#clearoutputchannelcolorprofile)() | Wist de instelling van het kleurprofiel van het uitvoerkanaal voor de standaardcategorie. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile/#clearoutputchannelcolorprofile_1)(ColorAdjustType) | Wist de kleurprofielinstelling van het uitvoerkanaal voor een opgegeven categorie. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable/#clearremaptable)() | Wist de tabel met opnieuw toewijzen van kleuren voor de standaardcategorie. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable/#clearremaptable_1)(ColorAdjustType) | Wist de kleur-hertoewijzingstabel voor een gespecificeerde categorie. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold/#clearthreshold)() | Wist de drempelwaarde voor de standaardcategorie. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold/#clearthreshold_1)(ColorAdjustType) | Wist de drempelwaarde voor een opgegeven categorie. |
| [Clone](../../system.drawing.imaging/imageattributes/clone/)() | Maakt hiervan een exacte kopieImageAttributes object. |
| [Dispose](../../system.drawing.imaging/imageattributes/dispose/)() | Geeft alle bronnen vrij die hierdoor worden gebruiktImageAttributes object. |
| [GetAdjustedPalette](../../system.drawing.imaging/imageattributes/getadjustedpalette/)(ColorPalette, ColorAdjustType) | Past de kleuren in een palet aan volgens de aanpassingsinstellingen van een opgegeven categorie. |
| [SetBrushRemapTable](../../system.drawing.imaging/imageattributes/setbrushremaptable/)(ColorMap[]) | Stelt de tabel voor opnieuw toewijzen van kleuren in voor de penseelcategorie. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey/#setcolorkey)(Color, Color) | Stelt de kleursleutel in voor de standaardcategorie. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey/#setcolorkey_1)(Color, Color, ColorAdjustType) | Stelt de kleursleutel (transparantiebereik) in voor een opgegeven categorie. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices/#setcolormatrices)(ColorMatrix, ColorMatrix) | Stelt de kleuraanpassingsmatrix en de grijswaardenaanpassingsmatrix in voor de standaardcategorie. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices/#setcolormatrices_1)(ColorMatrix, ColorMatrix, ColorMatrixFlag) | Stelt de kleuraanpassingsmatrix en de grijswaardenaanpassingsmatrix in voor de standaardcategorie. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices/#setcolormatrices_2)(ColorMatrix, ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Stelt de kleuraanpassingsmatrix en de grijswaardenaanpassingsmatrix in voor een gespecificeerde categorie. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix/#setcolormatrix)(ColorMatrix) | Stelt de kleuraanpassingsmatrix in voor de standaardcategorie. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix/#setcolormatrix_1)(ColorMatrix, ColorMatrixFlag) | Stelt de kleuraanpassingsmatrix in voor de standaardcategorie. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix/#setcolormatrix_2)(ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Stelt de kleuraanpassingsmatrix in voor een opgegeven categorie. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma/#setgamma)(float) | Stelt de gammawaarde in voor de standaardcategorie. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma/#setgamma_1)(float, ColorAdjustType) | Stelt de gammawaarde in voor een gespecificeerde categorie. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop/#setnoop)() | Schakelt kleuraanpassing uit voor de standaardcategorie. U kunt de[`ClearNoOp`](./clearnoop/) methode om de instellingen voor kleuraanpassing te herstellen die van kracht waren vóór call naar de[`SetNoOp`](./setnoop/) methode. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop/#setnoop_1)(ColorAdjustType) | Schakelt kleuraanpassing uit voor een opgegeven categorie. U kunt bellen naar de[`ClearNoOp`](./clearnoop/) methode om de instellingen voor kleuraanpassing die van kracht waren voor de call te herstellen naar de[`SetNoOp`](./setnoop/) methode. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel/#setoutputchannel)(ColorChannelFlag) | Stelt het CMYK-uitvoerkanaal (cyaan-magenta-geel-zwart) in voor de standaardcategorie. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel/#setoutputchannel_1)(ColorChannelFlag, ColorAdjustType) | Stelt het CMYK-uitvoerkanaal (cyaan-magenta-geel-zwart) in voor een opgegeven categorie. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile/#setoutputchannelcolorprofile)(string) | Stelt het kleurprofielbestand van het uitvoerkanaal in voor de standaardcategorie. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile/#setoutputchannelcolorprofile_1)(string, ColorAdjustType) | Stelt het kleurprofielbestand van het uitvoerkanaal in voor een opgegeven categorie. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable/#setremaptable)(ColorMap[]) | Stelt de tabel voor opnieuw toewijzen van kleuren in voor de standaardcategorie. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable/#setremaptable_1)(ColorMap[], ColorAdjustType) | Stelt de tabel voor opnieuw toewijzen van kleuren in voor een opgegeven categorie. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold/#setthreshold)(float) | Stelt de drempel (transparantiebereik) in voor de standaardcategorie. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold/#setthreshold_1)(float, ColorAdjustType) | Stelt de drempel (transparantiebereik) in voor een opgegeven categorie. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode/#setwrapmode)(WrapMode) | Stelt de omloopmodus in die wordt gebruikt om te bepalen hoe een textuur over een vorm of langs vormgrenzen moet worden weergegeven. Een textuur wordt over een vorm betegeld om deze te vullen wanneer de textuur kleiner is dan de vorm die deze vult. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode/#setwrapmode_1)(WrapMode, Color) | Stelt de omloopmodus en kleur in die worden gebruikt om te bepalen hoe een textuur over een vorm of bij vormgrenzen moet worden weergegeven. Een textuur wordt over een vorm betegeld om deze in te vullen wanneer de textuur kleiner is dan de vorm die deze vult. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode/#setwrapmode_2)(WrapMode, Color, bool) | Stelt de omloopmodus en kleur in die worden gebruikt om te bepalen hoe een textuur over een vorm of bij vormgrenzen moet worden weergegeven. Een textuur wordt over een vorm betegeld om deze in te vullen wanneer de textuur kleiner is dan de vorm die deze vult. |

### Zie ook

* naamruimte [System.Drawing.Imaging](../../system.drawing.imaging/)
* montage [Aspose.Drawing](../../)


