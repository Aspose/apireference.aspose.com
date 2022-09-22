---
title: ImageAttributes
second_title: Aspose.Drawing für .NET-API-Referenz
description: Enthält Informationen darüber wie Bitmap und Metadateifarben während des Renderns manipuliert werden.
type: docs
weight: 740
url: /de/net/system.drawing.imaging/imageattributes/
---
## ImageAttributes class

Enthält Informationen darüber, wie Bitmap- und Metadateifarben während des Renderns manipuliert werden.

```csharp
public sealed class ImageAttributes : ICloneable, IDisposable
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [ImageAttributes](imageattributes)() | Initialisiert eine neue Instanz von[`ImageAttributes`](../imageattributes) Klasse. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [ClearBrushRemapTable](../../system.drawing.imaging/imageattributes/clearbrushremaptable)() | Löscht die Pinselfarben-Neuzuordnungstabelle davonImageAttributes Objekt. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey#clearcolorkey)() | Löscht den Farbschlüssel (Transparenzbereich) für die Standardkategorie. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey#clearcolorkey_1)(ColorAdjustType) | Löscht den Farbschlüssel (Transparenzbereich) für eine bestimmte Kategorie. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix#clearcolormatrix)() | Löscht die Farbanpassungsmatrix für die Standardkategorie. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix#clearcolormatrix_1)(ColorAdjustType) | Löscht die Farbanpassungsmatrix für eine bestimmte Kategorie. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma#cleargamma)() | Deaktiviert die Gammakorrektur für die Standardkategorie. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma#cleargamma_1)(ColorAdjustType) | Deaktiviert die Gammakorrektur für eine bestimmte Kategorie. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop#clearnoop)() | Löscht die NoOp-Einstellung für die Standardkategorie. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop#clearnoop_1)(ColorAdjustType) | Löscht die NoOp-Einstellung für eine bestimmte Kategorie. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel#clearoutputchannel)() | Löscht die CMYK-Ausgabekanaleinstellung (Cyan-Magenta-Gelb-Schwarz) für die Standardkategorie. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel#clearoutputchannel_1)(ColorAdjustType) | Löscht die Ausgabekanaleinstellung (Cyan-Magenta-Gelb-Schwarz) für eine bestimmte Kategorie. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile#clearoutputchannelcolorprofile)() | Löscht die Farbprofileinstellung des Ausgangskanals für die Standardkategorie. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile#clearoutputchannelcolorprofile_1)(ColorAdjustType) | Löscht die Farbprofileinstellung des Ausgangskanals für eine bestimmte Kategorie. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable#clearremaptable)() | Löscht die Farbzuordnungstabelle für die Standardkategorie. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable#clearremaptable_1)(ColorAdjustType) | Löscht die Farbzuordnungstabelle für eine bestimmte Kategorie. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold#clearthreshold)() | Löscht den Schwellenwert für die Standardkategorie. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold#clearthreshold_1)(ColorAdjustType) | Löscht den Schwellenwert für eine bestimmte Kategorie. |
| [Clone](../../system.drawing.imaging/imageattributes/clone)() | Erstellt eine exakte Kopie davonImageAttributes Objekt. |
| [Dispose](../../system.drawing.imaging/imageattributes/dispose)() | Gibt alle von diesem verwendeten Ressourcen freiImageAttributes Objekt. |
| [GetAdjustedPalette](../../system.drawing.imaging/imageattributes/getadjustedpalette)(ColorPalette, ColorAdjustType) | Passt die Farben in einer Palette gemäß den Anpassungseinstellungen einer bestimmten Kategorie an. |
| [SetBrushRemapTable](../../system.drawing.imaging/imageattributes/setbrushremaptable)(ColorMap[]) | Legt die Farbneuzuordnungstabelle für die Pinselkategorie fest. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey#setcolorkey)(Color, Color) | Legt den Farbschlüssel für die Standardkategorie fest. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey#setcolorkey_1)(Color, Color, ColorAdjustType) | Legt den Farbschlüssel (Transparenzbereich) für eine bestimmte Kategorie fest. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices)(ColorMatrix, ColorMatrix) | Legt die Farbanpassungsmatrix und die Graustufenanpassungsmatrix für die Standardkategorie fest. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices_1)(ColorMatrix, ColorMatrix, ColorMatrixFlag) | Legt die Farbanpassungsmatrix und die Graustufenanpassungsmatrix für die Standardkategorie fest. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices_2)(ColorMatrix, ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Legt die Farbanpassungsmatrix und die Graustufenanpassungsmatrix für eine bestimmte Kategorie fest. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix)(ColorMatrix) | Legt die Farbanpassungsmatrix für die Standardkategorie fest. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix_1)(ColorMatrix, ColorMatrixFlag) | Legt die Farbanpassungsmatrix für die Standardkategorie fest. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix_2)(ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Legt die Farbanpassungsmatrix für eine bestimmte Kategorie fest. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma#setgamma)(float) | Legt den Gammawert für die Standardkategorie fest. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma#setgamma_1)(float, ColorAdjustType) | Legt den Gammawert für eine bestimmte Kategorie fest. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop#setnoop)() | Deaktiviert die Farbanpassung für die Standardkategorie. Sie können die aufrufen[`ClearNoOp`](./clearnoop) Methode zum Wiederherstellen der Farbanpassungseinstellungen, die vor dem Anruf an der Stelle vorhanden waren[`SetNoOp`](./setnoop) Methode. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop#setnoop_1)(ColorAdjustType) | Deaktiviert die Farbanpassung für eine bestimmte Kategorie. Sie können die anrufen[`ClearNoOp`](./clearnoop) -Methode, um die Farbanpassungseinstellungen wiederherzustellen, die vor dem Aufruf an die[`SetNoOp`](./setnoop) Methode. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel#setoutputchannel)(ColorChannelFlag) | Legt den CMYK-Ausgabekanal (Cyan-Magenta-Gelb-Schwarz) für die Standardkategorie fest. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel#setoutputchannel_1)(ColorChannelFlag, ColorAdjustType) | Legt den CMYK-Ausgabekanal (Cyan-Magenta-Gelb-Schwarz) für eine bestimmte Kategorie fest. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile#setoutputchannelcolorprofile)(string) | Legt die Farbprofildatei des Ausgabekanals für die Standardkategorie fest. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile#setoutputchannelcolorprofile_1)(string, ColorAdjustType) | Legt die Farbprofildatei des Ausgabekanals für eine bestimmte Kategorie fest. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable#setremaptable)(ColorMap[]) | Legt die Farbzuordnungstabelle für die Standardkategorie fest. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable#setremaptable_1)(ColorMap[], ColorAdjustType) | Legt die Farbumwandlungstabelle für eine bestimmte Kategorie fest. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold#setthreshold)(float) | Legt den Schwellenwert (Transparenzbereich) für die Standardkategorie fest. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold#setthreshold_1)(float, ColorAdjustType) | Legt den Schwellenwert (Transparenzbereich) für eine bestimmte Kategorie fest. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode)(WrapMode) | Legt den Umbruchmodus fest, der verwendet wird, um zu entscheiden, wie eine Textur über eine Form oder an Formgrenzen gekachelt wird. Eine Textur wird über eine Form gekachelt, um sie auszufüllen, wenn die Textur kleiner ist als die Form, die sie ausfüllt. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode_1)(WrapMode, Color) | Legt den Umbruchmodus und die Farbe fest, die verwendet werden, um zu entscheiden, wie eine Textur über eine Form oder an Formgrenzen gekachelt wird. Eine Textur wird über eine Form gekachelt, um sie auszufüllen, wenn die Textur kleiner ist als die Form, die sie ausfüllt. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode_2)(WrapMode, Color, bool) | Legt den Umbruchmodus und die Farbe fest, die verwendet werden, um zu entscheiden, wie eine Textur über eine Form oder an Formgrenzen gekachelt wird. Eine Textur wird über eine Form gekachelt, um sie auszufüllen, wenn die Textur kleiner ist als die Form, die sie ausfüllt. |

### Siehe auch

* namensraum [System.Drawing.Imaging](../../system.drawing.imaging)
* Montage [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
