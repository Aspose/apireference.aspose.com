---
title: Metafile
second_title: Référence de l'API Aspose.Drawing pour .NET
description: Définit un métafichier graphique. Un métafichier contient des enregistrements qui décrivent une séquence dopérations graphiques qui peuvent être enregistrées construites et lues affichées. Cette classe nest pas héritable.
type: docs
weight: 800
url: /fr/net/system.drawing.imaging/metafile/
---
## Metafile class

Définit un métafichier graphique. Un métafichier contient des enregistrements qui décrivent une séquence d'opérations graphiques qui peuvent être enregistrées (construites) et lues (affichées). Cette classe n'est pas héritable.

```csharp
public sealed class Metafile : Image
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [Metafile](metafile#constructor_2)(Stream) | Initialise une nouvelle instance du[`Metafile`](../metafile) classe du flux de données spécifié. |
| [Metafile](metafile#constructor_6)(string) | Initialise une nouvelle instance du[`Metafile`](../metafile) class à partir du nom de fichier spécifié. |
| [Metafile](metafile#constructor)(IntPtr, bool) | Initialise une nouvelle instance du[`Metafile`](../metafile) classe à partir du handle spécifié. |
| [Metafile](metafile#constructor_1)(IntPtr, EmfType) | Initialise une nouvelle instance du[`Metafile`](../metafile) classe du handle spécifié vers un contexte de périphérique et unEmfTypeénumération qui spécifie le format de laMetafile . |
| [Metafile](metafile#constructor_3)(Stream, IntPtr) | Initialise une nouvelle instance du[`Metafile`](../metafile) classe du flux de données specified et un handle Windows vers un contexte de périphérique. /&gt;. |
| [Metafile](metafile#constructor_7)(string, IntPtr) | Initialise une nouvelle instance du[`Metafile`](../metafile) class à partir du nom de fichier spécifié. |
| [Metafile](metafile#constructor_4)(Stream, IntPtr, EmfType) | Initialise une nouvelle instance du[`Metafile`](../metafile) classe du flux de données spécifié , un handle Windows vers un contexte de périphérique et unEmfType enumeration qui spécifie le format duMetafile . |
| [Metafile](metafile#constructor_5)(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | Initialise une nouvelle instance du[`Metafile`](../metafile) classe du flux de données spécifié , un handle Windows vers un contexte de périphérique et unEmfType enumeration qui spécifie le format duMetafile . |

## Propriétés

| Nom | La description |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Obtient l'entier représentant une combinaison au niveau du bit de[`ImageFlags`](../imageflags) pour cette image. |
| override [FrameDimensionsList](../../system.drawing.imaging/metafile/framedimensionslist) { get; } | Obtient un tableau de GUID qui représentent les dimensions des cadres dans ceImage . |
| override [Height](../../system.drawing.imaging/metafile/height) { get; } | Obtient la hauteur, en pixels, de ceMetafile . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Obtient la résolution horizontale, en pixels par pouce, de ceImage . |
| override [Palette](../../system.drawing.imaging/metafile/palette) { get; set; } | Obtient ou définit la palette de couleurs utilisée pour celaImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Obtient la largeur et la hauteur de cette image. |
| override [PixelFormat](../../system.drawing.imaging/metafile/pixelformat) { get; } | Obtient le format de pixel pour celaImage . |
| override [PropertyIdList](../../system.drawing.imaging/metafile/propertyidlist) { get; } | Obtient les ID des éléments de propriété stockés dans ceImage . |
| override [PropertyItems](../../system.drawing.imaging/metafile/propertyitems) { get; } | Obtient tous les éléments de propriété (morceaux de métadonnées) stockés dans ceImage . |
| override [RawFormat](../../system.drawing.imaging/metafile/rawformat) { get; } | Obtient le format de fichier de ceImage . |
| [Size](../../system.drawing/image/size) { get; } | Obtient la largeur et la hauteur, en pixels, de cette image. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Obtient ou définit un objet qui fournit des données supplémentaires sur l'image. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Obtient la résolution verticale, en pixels par pouce, de ceImage . |
| override [Width](../../system.drawing.imaging/metafile/width) { get; } | Obtient la largeur, en pixels, de ceMetafile . |

## Méthodes

| Nom | La description |
| --- | --- |
| [Clone](../../system.drawing/image/clone)() | Crée une copie exacte de ceciImage . |
| virtual [Dispose](../../system.drawing/image/dispose)() | Libère toutes les ressources utilisées par cette Image. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Obtient les limites de l'image dans l'unité spécifiée. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Renvoie le nombre d'images de la dimension spécifiée. |
| [GetHenhmetafile](../../system.drawing.imaging/metafile/gethenhmetafile)() | Renvoie un handle Windows vers une version amélioréeMetafile . |
| [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader)() | Renvoie leMetafileHeader associé à ceMetafile . |
| override [GetPropertyItem](../../system.drawing.imaging/metafile/getpropertyitem)(int) | Obtient l'élément de propriété spécifié à partir de ceImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Renvoie une vignette pour ceImage . |
| [PlayRecord](../../system.drawing.imaging/metafile/playrecord)(EmfPlusRecordType, int, int, byte[]) | Lit un enregistrement de métafichier individuel. |
| override [RemovePropertyItem](../../system.drawing.imaging/metafile/removepropertyitem)(int) | Supprime l'élément de propriété spécifié de ceImage . |
| override [RotateFlip](../../system.drawing.imaging/metafile/rotateflip)(RotateFlipType) | Cette méthode tourne, retourne ou tourne et retourne leImage . |
| [Save](../../system.drawing/image/save)(string) | Enregistre ceciImageau fichier ou au flux spécifié. |
| [Save](../../system.drawing/image/save)(Stream, ImageFormat) | Enregistre cette image dans le flux spécifié au format spécifié. |
| [Save](../../system.drawing/image/save)(string, ImageFormat) | Enregistre ceciImage au fichier spécifié dans le format spécifié. |
| [Save](../../system.drawing/image/save)(Stream, ImageCodecInfo, EncoderParameters) | Enregistre cette image dans le flux spécifié, avec les paramètres d'encodeur et d'encodeur d'image spécifiés. |
| [Save](../../system.drawing/image/save)(string, ImageCodecInfo, EncoderParameters) | Enregistre ceciImage au fichier spécifié, avec les paramètres d'encodeur et d'encodeur d'image spécifiés. |
| [SaveAdd](../../system.drawing/image/saveadd)(EncoderParameters) | Ajoute un cadre au fichier ou au flux spécifié dans un appel précédent à l'une des méthodes Image.Save(...). Utilisez cette méthode pour enregistrer les cadres sélectionnés d'une image à plusieurs cadres vers une autre image à plusieurs cadres. |
| [SaveAdd](../../system.drawing/image/saveadd)(Image, EncoderParameters) | Ajoute un cadre au fichier ou au flux spécifié lors d'un précédent appel à l'une des méthodes Image.Save(...) |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Sélectionne le cadre spécifié par la dimension et l'index. |
| override [SetPropertyItem](../../system.drawing.imaging/metafile/setpropertyitem)(PropertyItem) | Stocke un élément de propriété (morceau de métadonnées) dans ceImage . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader#getmetafileheader)(Stream) | Renvoie leMetafileHeader associé au spécifiéMetafile . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader#getmetafileheader_1)(string) | Renvoie leMetafileHeader associé au spécifiéMetafile . |

### Voir également

* class [Image](../../system.drawing/image)
* espace de noms [System.Drawing.Imaging](../../system.drawing.imaging)
* Assemblée [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
