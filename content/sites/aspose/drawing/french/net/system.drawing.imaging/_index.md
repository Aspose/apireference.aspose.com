---
title: System.Drawing.Imaging
second_title: Référence de l'API Aspose.Drawing pour .NET
description: LeImaging lespace de noms fournit une fonctionnalité dimagerie GDI avancée. La fonctionnalité graphique de base est fournie par leDrawing espace de noms.
type: docs
weight: 40
url: /fr/net/system.drawing.imaging/
---
LeImaging l'espace de noms fournit une fonctionnalité d'imagerie GDI+ avancée. La fonctionnalité graphique de base est fournie par leDrawing espace de noms.

## Des classes

| Classer | La description |
| --- | --- |
| [BitmapData](./bitmapdata) | Spécifie les attributs d'une image bitmap. LaBitmapData la classe est utilisée par the LockBits etUnlockBits méthodes de laBitmap classer. Non héréditaire. |
| [ColorMap](./colormap) | Définit une carte pour convertir les couleurs. Plusieurs méthodes de laImageAttributes class adjust image colors en utilisant une table de remappage des couleurs, qui est un tableau deColorMap structures. Non héritables. |
| [ColorMatrix](./colormatrix) | Définit une matrice 5 x 5 qui contient les coordonnées de l'espace RGBA. Plusieurs méthodes deImageAttributes classe ajuste les couleurs de l'image à l'aide d'une matrice de couleurs. Cette classe ne peut pas être héritée. |
| [ColorPalette](./colorpalette) | Définit un tableau de couleurs qui composent une palette de couleurs. Les couleurs sont des couleurs ARGB 32 bits. Non héréditaire. |
| [Encoder](./encoder) | UnEncoder L'objet encapsule un identificateur global unique (GUID) qui identifie la catégorie d'un paramètre d'encodeur d'image. |
| [EncoderParameter](./encoderparameter) | Utilisé pour transmettre une valeur ou un tableau de valeurs à un encodeur d'image. |
| [EncoderParameters](./encoderparameters) | Encapsule un tableau deEncoderParameter objets. |
| [FrameDimension](./framedimension) | Fournit des propriétés qui obtiennent les dimensions du cadre d'une image. Non héréditaire. |
| [ImageAttributes](./imageattributes) | Contient des informations sur la façon dont les couleurs des bitmaps et des métafichiers sont manipulées lors du rendu. |
| [ImageCodecInfo](./imagecodecinfo) | LeImageCodecInfo fournit les membres et les méthodes de stockage nécessaires pour récupérer toutes les informations pertinentes sur les encodeurs et décodeurs d'images installés (appelés codecs). Non héréditaire. |
| [ImageFormat](./imageformat) | Spécifie le format de fichier de l'image. Non héréditaire. |
| [Metafile](./metafile) | Définit un métafichier graphique. Un métafichier contient des enregistrements qui décrivent une séquence d'opérations graphiques qui peuvent être enregistrées (construites) et lues (affichées). Cette classe n'est pas héritable. |
| [MetafileHeader](./metafileheader) | Contient les attributs d'unMetafile . Non héréditaire. |
| [MetaHeader](./metaheader) | Contient des informations sur un métafichier au format Windows (WMF). |
| [NamespaceDoc](./namespacedoc) | LeImaging l'espace de noms fournit une fonctionnalité d'imagerie GDI+ avancée. La fonctionnalité graphique de base est fournie par leDrawing espace de noms. |
| [PlayRecordCallback](./playrecordcallback) | Ce délégué n'est pas utilisé. Pour un exemple d'énumération des enregistrements d'un métafichier, voir[`EnumerateMetafile`](../system.drawing/graphics/enumeratemetafile) . |
| [PropertyItem](./propertyitem) | Encapsule une propriété de métadonnées à inclure dans un fichier image. Non héréditaire. |
| [WmfPlaceableFileHeader](./wmfplaceablefileheader) | Définit un métafichier transposable. Non héréditaire. |
## Énumération

| Énumération | La description |
| --- | --- |
| [ColorAdjustType](./coloradjusttype) | Spécifie quels objets GDI+ utilisent les informations de réglage des couleurs. |
| [ColorChannelFlag](./colorchannelflag) | Spécifie les canaux individuels dans l'espace colorimétrique CMJN (cyan, magenta, jaune, noir). Cette énumération est utilisée par le[`SetOutputChannel`](../system.drawing.imaging/imageattributes/setoutputchannel) méthodes. |
| [ColorMatrixFlag](./colormatrixflag) | Spécifie les types d'images et de couleurs qui seront affectés par les paramètres de réglage des couleurs et des niveaux de gris d'unImageAttributes . |
| [EmfPlusRecordType](./emfplusrecordtype) | Spécifie les méthodes disponibles pour une utilisation avec un métafichier pour lire et écrire des commandes graphiques. |
| [EmfType](./emftype) | Spécifie la nature des enregistrements qui sont placés dans un fichier Enhanced Metafile (EMF). Cette énumération est utilisée par plusieurs constructeurs dans leMetafile classe. |
| [EncoderValue](./encodervalue) | Utilisé pour spécifier la valeur du paramètre passé à un encodeur d'image JPEG ou TIFF lors de l'utilisation de EncoderParameters) ouEncoderParameters) méthodes. |
| [ImageFlags](./imageflags) | Spécifie les attributs des données de pixel contenues dans un[`Image`](../system.drawing/image) objet. La propriété Flags renvoie un membre de cette énumération. Cette énumération a un attribut FlagsAttribute qui permet une combinaison au niveau du bit de ses valeurs de membre. |
| [ImageLockMode](./imagelockmode) | Spécifie les drapeaux qui sont passés au paramètre flags du[`LockBits`](../system.drawing/bitmap/lockbits) méthode. La[`LockBits`](../system.drawing/bitmap/lockbits) verrouille une partie d'une image afin que vous puissiez lire ou écrire les données de pixel. |
| [MetafileFrameUnit](./metafileframeunit) | Spécifie l'unité de mesure du rectangle utilisé pour dimensionner et positionner un métafichier. Ceci est spécifié lors de la création duMetafile objet. |
| [MetafileType](./metafiletype) | Spécifie les types de métafichiers. |
| [PixelFormat](./pixelformat) | Spécifie le format des données de couleur pour chaque pixel de l'image. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
