---
title: "classe System::Drawing::Bitmap"
linktitle: "Bitmap"
second_title: "Aspose.Font pour C++"
description: "Classe System::Drawing::Bitmap. Représente une image bitmap GDI+. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.drawing/bitmap/
---
## Bitmap class


Représente une image bitmap GDI+. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument.

```cpp
class Bitmap : public System::Drawing::Image
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [BeginPixelProcessing](./beginpixelprocessing/)(bool) | Active le mode de traitement des pixels. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&) | Construit un nouvel objet [Bitmap](./) à partir de l'image existante spécifiée. |
| [Bitmap](./bitmap/)(const SharedPtr\<System::IO::Stream\>\&, bool) | Construit un nouvel objet [Bitmap](./) à partir du flux spécifié. |
| [Bitmap](./bitmap/)(const String\&) | Construit un nouvel objet [Bitmap](./) à partir du fichier spécifié. |
| [Bitmap](./bitmap/)(const String\&, bool) | Construit un nouvel objet [Bitmap](./) à partir du fichier spécifié. |
| [Bitmap](./bitmap/)(int, int, Imaging::PixelFormat) | Construit un nouvel objet [Bitmap](./) qui représente une image bitmap avec la largeur, la hauteur, le format de pixel et les données de pixel spécifiés. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, const Size\&) | Construit un nouvel objet [Bitmap](./) à partir de l'image existante spécifiée, redimensionnée à la taille spécifiée. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, int, int) | Construit un nouvel objet [Bitmap](./) à partir de l'image existante spécifiée avec la largeur et la hauteur redimensionnées aux valeurs spécifiées. |
| [Clone](./clone/)() override | Crée une copie de l'objet actuel. |
| [Clone](./clone/)(Rectangle, Imaging::PixelFormat) | Crée un objet [Bitmap](./) qui représente une copie d'une région de l'image bitmap représentée par l'objet actuel. |
| [Clone](./clone/)(RectangleF, Imaging::PixelFormat) | Crée un objet [Bitmap](./) qui représente une copie d'une région de l'image bitmap représentée par l'objet actuel. |
| [ComputeHash](./computehash/)() | Calcule la valeur de hachage SHA1. |
| static [ConvertToARGBImage](./converttoargbimage/)(const SharedPtr\<Bitmap\>\&) | Crée une copie de l'image bitmap spécifiée avec le format de pixel modifié en Format32bppArgb. |
| [EndPixelProcessing](./endpixelprocessing/)(bool) | Désactive le mode de traitement des pixels. |
| [get_Height](./get_height/)() const override | Renvoie la hauteur de l'image en pixels. |
| [get_Palette](./get_palette/)() const override | Renvoie la palette de couleurs utilisée par l'image représentée par l'objet actuel. |
| [get_PixelFormat](./get_pixelformat/)() const override | Renvoie le format de pixel de l'image représentée par l'objet actuel. |
| [get_RawFormat](./get_rawformat/)() const override | Renvoie le format de fichier de l'image représentée par l'objet actuel. |
| [get_Width](./get_width/)() const override | Renvoie la largeur de l'image en pixels. |
| [GetHbitmap](./gethbitmap/)() | Crée un objet bitmap GDI à partir du bitmap représenté par l'objet actuel. |
| [GetPixel](./getpixel/)(int, int) | Renvoie la couleur du pixel spécifié. |
| [GetSkBitmap](./getskbitmap/)() const override | Renvoie un pointeur brut vers l'objet SkBitmap sous-jacent. |
| [IsMultiImage](./ismultiimage/)() const override | Renvoie si le format original est une image multiple. |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) | Verrouille un [Bitmap](./) en mémoire système. |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) | Verrouille un [Bitmap](./) en mémoire système. |
| [MakeTransparent](./maketransparent/)(Color) | Change la couleur de tous les pixels de la couleur spécifiée en transparent. |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(Bitmap, CODEPORTING_ARGS(const SharedPtr\<Image\>\&original, int width, int height), CODEPORTING_ARGS(original, width, height)) |  |
| [PremultipleColors](./premultiplecolors/)() | Pré-multiplie les couleurs des pixels de l'image représentée par l'objet actuel. |
| [RotateFlip](./rotateflip/)(RotateFlipType) override | Fait pivoter l'image par multiples de 90 degrés et la renverse. |
| [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) override | Définit la palette de couleurs utilisée par l'image représentée par l'objet actuel. |
| [SetPixel](./setpixel/)(int, int, Color) | Définit la couleur du pixel spécifié dans l'image bitmap représentée par l'objet actuel. |
| [SetResolution](./setresolution/)(float, float) | Définit la résolution de l'image. |
| [UnlockBits](./unlockbits/)(const Imaging::BitmapDataPtr\&) | Déverrouille le bitmap spécifié de la mémoire système. |
## Voir aussi

* Class [Image](../image/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
