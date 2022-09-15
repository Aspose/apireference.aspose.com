---
title: Bitmap
second_title: Référence de l'API Aspose.Drawing pour .NET
description: Encapsule un bitmap qui se compose des données de pixels dune image graphique et de ses attributs. ABitmap./bitmap est un objet utilisé pour travailler avec des images définies par des données de pixels.
type: docs
weight: 40
url: /fr/net/system.drawing/bitmap/
---
## Bitmap class

Encapsule un bitmap, qui se compose des données de pixels d'une image graphique et de ses attributs. A[`Bitmap`](../bitmap) est un objet utilisé pour travailler avec des images définies par des données de pixels.

```csharp
public class Bitmap : Image
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [Bitmap](bitmap#constructor_3)(Image) | Initialise une nouvelle instance du[`Bitmap`](../bitmap) classe à partir de l'image existante spécifiée. |
| [Bitmap](bitmap#constructor_6)(Stream) | Initialise une nouvelle instance du[`Bitmap`](../bitmap) classe du flux de données spécifié. |
| [Bitmap](bitmap#constructor_8)(string) | Initialise une nouvelle instance du[`Bitmap`](../bitmap) classe du fichier spécifié. |
| [Bitmap](bitmap#constructor_5)(Image, Size) | Initialise une nouvelle instance du[`Bitmap`](../bitmap)classe à partir de l'image existante spécifiée, mise à l'échelle à la taille spécifiée. |
| [Bitmap](bitmap#constructor)(int, int) | Initialise une nouvelle instance du[`Bitmap`](../bitmap) classe avec la taille spécifiée. |
| [Bitmap](bitmap#constructor_7)(Stream, bool) | Initialise une nouvelle instance du[`Bitmap`](../bitmap) classe du flux de données spécifié. |
| [Bitmap](bitmap#constructor_9)(string, bool) | Initialise une nouvelle instance du[`Bitmap`](../bitmap) classe du fichier spécifié. |
| [Bitmap](bitmap#constructor_4)(Image, int, int) | Initialise une nouvelle instance du[`Bitmap`](../bitmap) classe à partir de l'image existante spécifiée, mise à l'échelle à la taille spécifiée. |
| [Bitmap](bitmap#constructor_2)(int, int, PixelFormat) | Initialise une nouvelle instance du[`Bitmap`](../bitmap) classe avec la taille et le format spécifiés. |
| [Bitmap](bitmap#constructor_1)(int, int, int, PixelFormat, int[]) | Initialise une nouvelle instance du[`Bitmap`](../bitmap) classe avec la taille et les données de pixel spécifiées. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Obtient l'entier représentant une combinaison au niveau du bit de[`ImageFlags`](../../system.drawing.imaging/imageflags) pour cette image. |
| override [FrameDimensionsList](../../system.drawing/bitmap/framedimensionslist) { get; } | Obtient un tableau de GUID qui représentent les dimensions des cadres dans ceImage . |
| override [Height](../../system.drawing/bitmap/height) { get; } | Obtient la hauteur, en pixels, de ce Bitmap. |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Obtient la résolution horizontale, en pixels par pouce, de ceImage . |
| override [Palette](../../system.drawing/bitmap/palette) { get; set; } | Obtient ou définit la palette de couleurs utilisée pour celaImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Obtient la largeur et la hauteur de cette image. |
| override [PixelFormat](../../system.drawing/bitmap/pixelformat) { get; } | Obtient le format de pixel pour celaImage . |
| override [PropertyIdList](../../system.drawing/bitmap/propertyidlist) { get; } | Obtient les ID des éléments de propriété stockés dans ceImage . |
| override [PropertyItems](../../system.drawing/bitmap/propertyitems) { get; } | Obtient tous les éléments de propriété (morceaux de métadonnées) stockés dans ceImage . |
| override [RawFormat](../../system.drawing/bitmap/rawformat) { get; } | Obtient le format de fichier de ceImage . |
| [Size](../../system.drawing/image/size) { get; } | Obtient la largeur et la hauteur, en pixels, de cette image. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Obtient ou définit un objet qui fournit des données supplémentaires sur l'image. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Obtient la résolution verticale, en pixels par pouce, de ceImage . |
| override [Width](../../system.drawing/bitmap/width) { get; } | Obtient la largeur, en pixels, de ce Bitmap. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Clone](../../system.drawing/image/clone)() | Crée une copie exacte de ceciImage . |
| [Clone](../../system.drawing/bitmap/clone#clone)(Rectangle, PixelFormat) | Crée une copie de la section de ceBitmap Défini parRectangle structure et avec un spécifiéPixelFormat énumération. |
| [Clone](../../system.drawing/bitmap/clone#clone_1)(RectangleF, PixelFormat) | Crée une copie de la section de ceBitmap défini avec un spécifiéPixelFormat énumération. |
| virtual [Dispose](../../system.drawing/image/dispose)() | Libère toutes les ressources utilisées par cette Image. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Obtient les limites de l'image dans l'unité spécifiée. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Renvoie le nombre d'images de la dimension spécifiée. |
| [GetPixel](../../system.drawing/bitmap/getpixel)(int, int) | Obtient la couleur du pixel spécifié dans ceBitmap . |
| override [GetPropertyItem](../../system.drawing/bitmap/getpropertyitem)(int) | Obtient l'élément de propriété spécifié à partir de ceImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Renvoie une vignette pour ceImage . |
| [LockBits](../../system.drawing/bitmap/lockbits)(Rectangle, ImageLockMode, PixelFormat) | Verrouille unBitmap dans la mémoire système. |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent#maketransparent)() | Rend la couleur spécifiée transparente pour cetteBitmap . |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent#maketransparent_1)(Color) | Rend la couleur spécifiée transparente pour cetteBitmap . |
| [ReadArgb32Pixels](../../system.drawing/bitmap/readargb32pixels)(int[]) | Lit les pixels bitmap au format ARGB32 dans un tableau donné. |
| override [RemovePropertyItem](../../system.drawing/bitmap/removepropertyitem)(int) | Supprime l'élément de propriété spécifié de ceImage . |
| override [RotateFlip](../../system.drawing/bitmap/rotateflip)(RotateFlipType) | Cette méthode tourne, retourne ou tourne et retourne leImage . |
| [Save](../../system.drawing/image/save)(string) | Enregistre ceciImageau fichier ou au flux spécifié. |
| [Save](../../system.drawing/image/save)(Stream, ImageFormat) | Enregistre cette image dans le flux spécifié au format spécifié. |
| [Save](../../system.drawing/image/save)(string, ImageFormat) | Enregistre ceciImage au fichier spécifié dans le format spécifié. |
| [Save](../../system.drawing/image/save)(Stream, ImageCodecInfo, EncoderParameters) | Enregistre cette image dans le flux spécifié, avec les paramètres d'encodeur et d'encodeur d'image spécifiés. |
| [Save](../../system.drawing/image/save)(string, ImageCodecInfo, EncoderParameters) | Enregistre ceciImage au fichier spécifié, avec les paramètres d'encodeur et d'encodeur d'image spécifiés. |
| [SaveAdd](../../system.drawing/image/saveadd)(EncoderParameters) | Ajoute un cadre au fichier ou au flux spécifié dans un appel précédent à l'une des méthodes Image.Save(...). Utilisez cette méthode pour enregistrer les cadres sélectionnés d'une image à plusieurs cadres vers une autre image à plusieurs cadres. |
| [SaveAdd](../../system.drawing/image/saveadd)(Image, EncoderParameters) | Ajoute un cadre au fichier ou au flux spécifié lors d'un précédent appel à l'une des méthodes Image.Save(...) |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Sélectionne le cadre spécifié par la dimension et l'index. |
| [SetPixel](../../system.drawing/bitmap/setpixel)(int, int, Color) | Définit la couleur du pixel spécifié dans ceBitmap . |
| override [SetPropertyItem](../../system.drawing/bitmap/setpropertyitem)(PropertyItem) | Stocke un élément de propriété (morceau de métadonnées) dans ceImage . |
| [SetResolution](../../system.drawing/bitmap/setresolution)(float, float) | Définit la résolution pour ceBitmap . |
| [UnlockBits](../../system.drawing/bitmap/unlockbits)(BitmapData) | Déverrouille ceciBitmap de la mémoire système. |
| [WriteArgb32Pixels](../../system.drawing/bitmap/writeargb32pixels)(int[]) | Écrit des pixels dans le bitmap. |

### Voir également

* class [Image](../image)
* espace de noms [System.Drawing](../../system.drawing)
* Assemblée [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
