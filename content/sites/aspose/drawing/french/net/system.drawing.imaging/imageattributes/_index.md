---
title: ImageAttributes
second_title: Référence de l'API Aspose.Drawing pour .NET
description: Contient des informations sur la façon dont les couleurs des bitmaps et des métafichiers sont manipulées lors du rendu.
type: docs
weight: 740
url: /fr/net/system.drawing.imaging/imageattributes/
---
## ImageAttributes class

Contient des informations sur la façon dont les couleurs des bitmaps et des métafichiers sont manipulées lors du rendu.

```csharp
public sealed class ImageAttributes : ICloneable, IDisposable
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [ImageAttributes](imageattributes)() | Initialise une nouvelle instance du[`ImageAttributes`](../imageattributes) classe. |

## Méthodes

| Nom | La description |
| --- | --- |
| [ClearBrushRemapTable](../../system.drawing.imaging/imageattributes/clearbrushremaptable)() | Efface la table de remappage des couleurs du pinceau de ceImageAttributes objet. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey#clearcolorkey)() | Efface la clé de couleur (plage de transparence) pour la catégorie par défaut. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey#clearcolorkey_1)(ColorAdjustType) | Efface la clé de couleur (plage de transparence) pour une catégorie spécifiée. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix#clearcolormatrix)() | Efface la matrice de réglage des couleurs pour la catégorie par défaut. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix#clearcolormatrix_1)(ColorAdjustType) | Efface la matrice de réglage des couleurs pour une catégorie spécifiée. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma#cleargamma)() | Désactive la correction gamma pour la catégorie par défaut. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma#cleargamma_1)(ColorAdjustType) | Désactive la correction gamma pour une catégorie spécifiée. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop#clearnoop)() | Efface le paramètre NoOp pour la catégorie par défaut. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop#clearnoop_1)(ColorAdjustType) | Efface le paramètre NoOp pour une catégorie spécifiée. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel#clearoutputchannel)() | Efface le paramètre du canal de sortie CMJN (cyan-magenta-jaune-noir) pour la catégorie par défaut. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel#clearoutputchannel_1)(ColorAdjustType) | Efface le paramètre de canal de sortie (cyan-magenta-jaune-noir) pour une catégorie spécifiée. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile#clearoutputchannelcolorprofile)() | Efface le paramètre de profil de couleur du canal de sortie pour la catégorie par défaut. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile#clearoutputchannelcolorprofile_1)(ColorAdjustType) | Efface le paramètre de profil de couleur du canal de sortie pour une catégorie spécifiée. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable#clearremaptable)() | Efface la table de remappage des couleurs pour la catégorie par défaut. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable#clearremaptable_1)(ColorAdjustType) | Efface la table de remappage des couleurs pour une catégorie spécifiée. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold#clearthreshold)() | Efface la valeur de seuil pour la catégorie par défaut. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold#clearthreshold_1)(ColorAdjustType) | Efface la valeur de seuil pour une catégorie spécifiée. |
| [Clone](../../system.drawing.imaging/imageattributes/clone)() | Crée une copie exacte de ceciImageAttributes objet. |
| [Dispose](../../system.drawing.imaging/imageattributes/dispose)() | Libère toutes les ressources utilisées par ceImageAttributes objet. |
| [GetAdjustedPalette](../../system.drawing.imaging/imageattributes/getadjustedpalette)(ColorPalette, ColorAdjustType) | Ajuste les couleurs d'une palette en fonction des paramètres d'ajustement d'une catégorie spécifiée. |
| [SetBrushRemapTable](../../system.drawing.imaging/imageattributes/setbrushremaptable)(ColorMap[]) | Définit la table de remappage des couleurs pour la catégorie de pinceaux. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey#setcolorkey)(Color, Color) | Définit la clé de couleur pour la catégorie par défaut. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey#setcolorkey_1)(Color, Color, ColorAdjustType) | Définit la clé de couleur (plage de transparence) pour une catégorie spécifiée. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices)(ColorMatrix, ColorMatrix) | Définit la matrice de réglage des couleurs et la matrice de réglage des niveaux de gris pour la catégorie par défaut. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices_1)(ColorMatrix, ColorMatrix, ColorMatrixFlag) | Définit la matrice de réglage des couleurs et la matrice de réglage des niveaux de gris pour la catégorie par défaut. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices_2)(ColorMatrix, ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Définit la matrice de réglage des couleurs et la matrice de réglage des niveaux de gris pour une catégorie spécifiée. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix)(ColorMatrix) | Définit la matrice de réglage des couleurs pour la catégorie par défaut. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix_1)(ColorMatrix, ColorMatrixFlag) | Définit la matrice de réglage des couleurs pour la catégorie par défaut. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix_2)(ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Définit la matrice de réglage des couleurs pour une catégorie spécifiée. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma#setgamma)(float) | Définit la valeur gamma pour la catégorie par défaut. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma#setgamma_1)(float, ColorAdjustType) | Définit la valeur gamma pour une catégorie spécifiée. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop#setnoop)() | Désactive le réglage des couleurs pour la catégorie par défaut. Vous pouvez appeler le[`ClearNoOp`](./clearnoop) méthode pour rétablir les paramètres d'ajustement des couleurs qui étaient en place avant l'appel au[`SetNoOp`](./setnoop) méthode. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop#setnoop_1)(ColorAdjustType) | Désactive le réglage des couleurs pour une catégorie spécifiée. Vous pouvez appeler le[`ClearNoOp`](./clearnoop) méthode pour rétablir les paramètres d'ajustement des couleurs qui étaient en place avant l'appel au[`SetNoOp`](./setnoop) méthode. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel#setoutputchannel)(ColorChannelFlag) | Définit le canal de sortie CMJN (cyan-magenta-jaune-noir) pour la catégorie par défaut. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel#setoutputchannel_1)(ColorChannelFlag, ColorAdjustType) | Définit le canal de sortie CMJN (cyan-magenta-jaune-noir) pour une catégorie spécifiée. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile#setoutputchannelcolorprofile)(string) | Définit le fichier de profil de couleur du canal de sortie pour la catégorie par défaut. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile#setoutputchannelcolorprofile_1)(string, ColorAdjustType) | Définit le fichier de profil de couleur du canal de sortie pour une catégorie spécifiée. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable#setremaptable)(ColorMap[]) | Définit la table de remappage des couleurs pour la catégorie par défaut. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable#setremaptable_1)(ColorMap[], ColorAdjustType) | Définit la table de remappage des couleurs pour une catégorie spécifiée. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold#setthreshold)(float) | Définit le seuil (plage de transparence) pour la catégorie par défaut. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold#setthreshold_1)(float, ColorAdjustType) | Définit le seuil (plage de transparence) pour une catégorie spécifiée. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode)(WrapMode) | Définit le mode d'habillage qui est utilisé pour décider comment disposer une texture en mosaïque sur une forme ou aux limites de la forme. Une texture est en mosaïque sur une forme pour la remplir lorsque la texture est plus petite que la forme qu'elle remplit. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode_1)(WrapMode, Color) | Définit le mode d'habillage et la couleur utilisés pour décider comment mosaïquer une texture sur une forme ou aux limites de la forme. Une texture est mosaïque sur une forme pour la remplir lorsque la texture est plus petite que la forme qu'elle remplit. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode_2)(WrapMode, Color, bool) | Définit le mode d'habillage et la couleur utilisés pour décider comment mosaïquer une texture sur une forme ou aux limites de la forme. Une texture est mosaïque sur une forme pour la remplir lorsque la texture est plus petite que la forme qu'elle remplit. |

### Voir également

* espace de noms [System.Drawing.Imaging](../../system.drawing.imaging)
* Assemblée [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
