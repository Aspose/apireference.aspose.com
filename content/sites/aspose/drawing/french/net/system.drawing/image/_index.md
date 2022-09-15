---
title: Image
second_title: Référence de l'API Aspose.Drawing pour .NET
description: Une classe de base abstraite qui fournit des fonctionnalités pour les classes descendantes Bitmap et Metafile.
type: docs
weight: 580
url: /fr/net/system.drawing/image/
---
## Image class

Une classe de base abstraite qui fournit des fonctionnalités pour les classes descendantes Bitmap et Metafile.

```csharp
public abstract class Image : IDisposable
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [Image](image)() | Initialise une nouvelle instance du[`Image`](../image) classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Obtient l'entier représentant une combinaison au niveau du bit de[`ImageFlags`](../../system.drawing.imaging/imageflags) pour cette image. |
| abstract [FrameDimensionsList](../../system.drawing/image/framedimensionslist) { get; } | Obtient un tableau de GUID qui représentent les dimensions des cadres dans ceImage . |
| abstract [Height](../../system.drawing/image/height) { get; } | Obtient la hauteur, en pixels, de ceImage . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Obtient la résolution horizontale, en pixels par pouce, de ceImage . |
| abstract [Palette](../../system.drawing/image/palette) { get; set; } | Obtient ou définit la palette de couleurs utilisée pour celaImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Obtient la largeur et la hauteur de cette image. |
| abstract [PixelFormat](../../system.drawing/image/pixelformat) { get; } | Obtient le format de pixel pour celaImage . |
| abstract [PropertyIdList](../../system.drawing/image/propertyidlist) { get; } | Obtient les ID des éléments de propriété stockés dans ceImage . |
| abstract [PropertyItems](../../system.drawing/image/propertyitems) { get; } | Obtient tous les éléments de propriété (morceaux de métadonnées) stockés dans ceImage . |
| abstract [RawFormat](../../system.drawing/image/rawformat) { get; } | Obtient le format de fichier de ceImage . |
| [Size](../../system.drawing/image/size) { get; } | Obtient la largeur et la hauteur, en pixels, de cette image. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Obtient ou définit un objet qui fournit des données supplémentaires sur l'image. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Obtient la résolution verticale, en pixels par pouce, de ceImage . |
| abstract [Width](../../system.drawing/image/width) { get; } | Obtient la largeur, en pixels, de ceImage . |

## Méthodes

| Nom | La description |
| --- | --- |
| static [FromFile](../../system.drawing/image/fromfile)(string) | Crée unImage à partir du fichier spécifié. |
| static [FromStream](../../system.drawing/image/fromstream#fromstream)(Stream) | Crée unImageà partir du flux de données spécifié. |
| static [FromStream](../../system.drawing/image/fromstream#fromstream_1)(Stream, bool) | Crée unImage à partir du flux de données spécifié, en utilisant éventuellement les informations de gestion des couleurs embedded dans ce flux. |
| [Clone](../../system.drawing/image/clone)() | Crée une copie exacte de ceciImage . |
| virtual [Dispose](../../system.drawing/image/dispose)() | Libère toutes les ressources utilisées par cette Image. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Obtient les limites de l'image dans l'unité spécifiée. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Renvoie le nombre d'images de la dimension spécifiée. |
| abstract [GetPropertyItem](../../system.drawing/image/getpropertyitem)(int) | Obtient l'élément de propriété spécifié à partir de ceImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Renvoie une vignette pour ceImage . |
| abstract [RemovePropertyItem](../../system.drawing/image/removepropertyitem)(int) | Supprime l'élément de propriété spécifié de ceImage . |
| abstract [RotateFlip](../../system.drawing/image/rotateflip)(RotateFlipType) | Cette méthode tourne, retourne ou tourne et retourne leImage . |
| [Save](../../system.drawing/image/save#save_2)(string) | Enregistre ceciImageau fichier ou au flux spécifié. |
| [Save](../../system.drawing/image/save#save_1)(Stream, ImageFormat) | Enregistre cette image dans le flux spécifié au format spécifié. |
| [Save](../../system.drawing/image/save#save_4)(string, ImageFormat) | Enregistre ceciImage au fichier spécifié dans le format spécifié. |
| [Save](../../system.drawing/image/save#save)(Stream, ImageCodecInfo, EncoderParameters) | Enregistre cette image dans le flux spécifié, avec les paramètres d'encodeur et d'encodeur d'image spécifiés. |
| [Save](../../system.drawing/image/save#save_3)(string, ImageCodecInfo, EncoderParameters) | Enregistre ceciImage au fichier spécifié, avec les paramètres d'encodeur et d'encodeur d'image spécifiés. |
| [SaveAdd](../../system.drawing/image/saveadd#saveadd_1)(EncoderParameters) | Ajoute un cadre au fichier ou au flux spécifié dans un appel précédent à l'une des méthodes Image.Save(...). Utilisez cette méthode pour enregistrer les cadres sélectionnés d'une image à plusieurs cadres vers une autre image à plusieurs cadres. |
| [SaveAdd](../../system.drawing/image/saveadd#saveadd)(Image, EncoderParameters) | Ajoute un cadre au fichier ou au flux spécifié lors d'un précédent appel à l'une des méthodes Image.Save(...) |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Sélectionne le cadre spécifié par la dimension et l'index. |
| abstract [SetPropertyItem](../../system.drawing/image/setpropertyitem)(PropertyItem) | Stocke un élément de propriété (morceau de métadonnées) dans ceImage . |
| static [FromHbitmap](../../system.drawing/image/fromhbitmap)(IntPtr) | Crée unBitmap d'un handle à un bitmap GDI. |
| static [GetPixelFormatSize](../../system.drawing/image/getpixelformatsize)(PixelFormat) | Renvoie la profondeur de couleur, en nombre de bits par pixel, du format de pixel spécifié. |
| static [IsAlphaPixelFormat](../../system.drawing/image/isalphapixelformat)(PixelFormat) | Renvoie une valeur qui indique si le format de pixel pour ceImage contient des informations alpha. |

## Autres membres

| Nom | La description |
| --- | --- |
| delegate [GetThumbnailImageAbort](image.getthumbnailimageabort) | Fournit une méthode de rappel pour déterminer quand le[`GetThumbnailImage`](./getthumbnailimage) la méthode doit annuler prématurément l'exécution. |

### Voir également

* espace de noms [System.Drawing](../../system.drawing)
* Assemblée [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
