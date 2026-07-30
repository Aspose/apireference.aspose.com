---
title: "classe System::Drawing::Image"
linktitle: "Image"
second_title: "Aspose.Font pour C++"
description: "classe System::Drawing::Image. Une classe de base pour les classes System::Drawing::Bitmap et System::Drawing::Metafile fournissant des fonctionnalités de base. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en argument en C++."
type: docs
weight: 1200
url: /fr/cpp/system.drawing/image/
---
## Image class


Une classe de base pour [System::Drawing::Bitmap](../bitmap/) et les classes System::Drawing::Metafile fournissant des fonctionnalités de base. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en argument.

```cpp
class Image : public virtual System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Clone](./clone/)() | Crée une copie de l'objet actuel. |
| [Dispose](./dispose/)() override | Libère toutes les ressources acquises par l'objet actuel. |
| static [FromFile](./fromfile/)(const String\&, bool) | Crée un objet [Image](./) à partir du fichier spécifié. |
| static [FromHbitmap](./fromhbitmap/)(IntPtr) | Construit un objet [Bitmap](../bitmap/) à partir du bitmap GDI spécifié. |
| static [FromStream](./fromstream/)(const SharedPtr\<System::IO::Stream\>\&, bool, bool) | Crée un objet [Image](./) à partir du flux spécifié. |
| virtual [get_Flags](./get_flags/)() const | Renvoie une combinaison bit à bit des valeurs d'énumération ImageFlags qui représente les attributs de l'image. |
| [get_FrameDimensionsList](./get_framedimensionslist/)() const | Renvoie un tableau de GUID qui représentent les dimensions des cadres dans l'image représentée par l'objet actuel. |
| virtual [get_Height](./get_height/)() const | Renvoie la hauteur de l'image en pixels. |
| [get_HorizontalResolution](./get_horizontalresolution/)() const | Renvoie la résolution horizontale de l'image représentée par l'objet actuel en pixels par pouce. |
| virtual [get_Palette](./get_palette/)() const | Renvoie la palette de couleurs utilisée par l'image représentée par l'objet actuel. |
| virtual [get_PixelFormat](./get_pixelformat/)() const | Renvoie le format de pixel de l'image représentée par l'objet actuel. |
| virtual [get_PropertyIdList](./get_propertyidlist/)() const | Obtient les ID des éléments de propriété stockés dans cette image. |
| virtual [get_PropertyItems](./get_propertyitems/)() const | Obtient tous les éléments de propriété (fragments de métadonnées) stockés dans cette image. |
| virtual [get_RawFormat](./get_rawformat/)() const | Renvoie le format de fichier de l'image représentée par l'objet actuel. |
| [get_Size](./get_size/)() const | Renvoie un objet [Size](../size/) qui représente la largeur et la hauteur de l'image en pixels. |
| virtual [get_Tag](./get_tag/)() const | Obtient un objet qui fournit des données supplémentaires sur l'image. |
| [get_VerticalResolution](./get_verticalresolution/)() const | Renvoie la résolution verticale de l'image représentée par l'objet actuel en pixels par pouce. |
| virtual [get_Width](./get_width/)() const | Renvoie la largeur de l'image en pixels. |
| [GetBounds](./getbounds/)(GraphicsUnit\&) | Renvoie les limites de l'image dans les unités de mesure spécifiées. |
| [GetFrameCount](./getframecount/)(const Imaging::FrameDimensionPtr\&) | Renvoie le nombre de cadres de la dimension de cadre spécifiée. |
| static [GetPixelFormatSize](./getpixelformatsize/)(Imaging::PixelFormat) | Renvoie le nombre de bits utilisés pour représenter la profondeur de couleur dans le format de pixel spécifié. |
| virtual [GetSkBitmap](./getskbitmap/)() const | Renvoie un objet SkBitmap sous-jacent. |
| [GetThumbnailImage](./getthumbnailimage/)(int, int, Image::GetThumbnailImageAbort, IntPtr) | Obtient une vignette pour cet objet [System::Drawing::Image](./). |
| static [IsAlphaPixelFormat](./isalphapixelformat/)(Imaging::PixelFormat) | Détermine si le format de pixel spécifié contient des informations alpha. |
| virtual [IsMultiImage](./ismultiimage/)() const | Renvoie si le format original est une image multiple. |
| virtual [RotateFlip](./rotateflip/)(RotateFlipType) | Faire pivoter l'image à un multiple de 90 degrés et la retourner. |
| [Save](./save/)(const String\&) | Enregistre l'image représentée par l'objet actuel dans le fichier spécifié au format PNG. |
| [Save](./save/)(const String\&, const Imaging::ImageFormatPtr\&) | Enregistre l'image représentée par l'objet actuel dans le fichier spécifié au format indiqué. |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageFormatPtr\&) | Enregistre l'image représentée par l'objet actuel dans le flux spécifié au format indiqué. |
| [Save](./save/)(const String\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | Enregistre l'image représentée par l'objet actuel dans le fichier spécifié en utilisant l'encodeur et les paramètres d'encodeur spécifiés. |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | Enregistre l'image représentée par l'objet actuel dans le flux spécifié en utilisant l'encodeur spécifié et ses paramètres. |
| [SaveAdd](./saveadd/)(const Imaging::EncoderParametersPtr\&) | Ajoute une trame au fichier ou au flux spécifié lors d'un appel précédent à la méthode [Save()](./save/). |
| [SaveAdd](./saveadd/)(const SharedPtr\<Image\>\&, const Imaging::EncoderParametersPtr\&) | Ajoute une trame au fichier ou au flux spécifié lors d'un appel précédent à la méthode [Save()](./save/). |
| [SelectActiveFrame](./selectactiveframe/)(const Imaging::FrameDimensionPtr\&, int) | Sélectionne la trame spécifiée. |
| virtual [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) | Définit la palette de couleurs utilisée par l'image représentée par l'objet actuel. |
| virtual [set_Tag](./set_tag/)(const System::SharedPtr\<System::Object\>) | Définit un objet qui fournit des données supplémentaires sur l'image. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [GetThumbnailImageAbort](./getthumbnailimageabort/) | Un rappel pour annuler l'exécution de GetThumbnailImage. |
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
