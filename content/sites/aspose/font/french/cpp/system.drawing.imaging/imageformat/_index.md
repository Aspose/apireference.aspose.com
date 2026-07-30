---
title: "classe System::Drawing::Imaging::ImageFormat"
linktitle: "ImageFormat"
second_title: "Aspose.Font pour C++"
description: "Classe System::Drawing::Imaging::ImageFormat. Représente le format de fichier d'une image. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1100
url: /fr/cpp/system.drawing.imaging/imageformat/
---
## ImageFormat class


Représente le format de fichier d'une image. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class ImageFormat : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(ImageFormatPtr) const | Détermine si les formats d'image représentés par les objets actuel et spécifié sont égaux. |
| static [get_Bmp](./get_bmp/)() | Renvoie un pointeur partagé vers un objet [ImageFormat](./) qui représente le format d'image bitmap. |
| static [get_Emf](./get_emf/)() | Renvoie un pointeur partagé vers un objet [ImageFormat](./) qui représente le format de métafichier amélioré. |
| static [get_Exif](./get_exif/)() | Renvoie un pointeur partagé vers un objet [ImageFormat](./) qui représente le format Exchangeable [Image](../../system.drawing/image/) File (Exif). |
| static [get_Gif](./get_gif/)() | Renvoie un pointeur partagé vers un objet [ImageFormat](./) qui représente le format d'image [Graphics](../../system.drawing/graphics/) Interchange Format (GIF). |
| [get_Guid](./get_guid/)() const | Renvoie le GUID associé au format d'image représenté par l'objet actuel. |
| static [get_Icon](./get_icon/)() | Renvoie un pointeur partagé vers un objet [ImageFormat](./) qui représente le format d'image icône [Windows](../../system.windows/). |
| static [get_Jpeg](./get_jpeg/)() | Renvoie un pointeur partagé vers un objet [ImageFormat](./) qui représente le format d'image Joint Photographic Experts Group (JPEG). |
| static [get_MemoryBmp](./get_memorybmp/)() | Renvoie un pointeur partagé vers un objet [ImageFormat](./) qui représente le format d'un bitmap en mémoire. |
| static [get_Png](./get_png/)() | Renvoie un pointeur partagé vers un objet [ImageFormat](./) qui représente le format d'image W3C Portable Network [Graphics](../../system.drawing/graphics/) (PNG). |
| static [get_Tiff](./get_tiff/)() | Renvoie un pointeur partagé vers un objet [ImageFormat](./) qui représente le format d'image Tagged [Image](../../system.drawing/image/) File Format (TIFF). |
| static [get_Wmf](./get_wmf/)() | Renvoie un pointeur partagé vers un objet [ImageFormat](./) qui représente le format d'image métafichier [Windows](../../system.windows/) (WMF). |
| [ImageFormat](./imageformat/)(const System::Guid\&) | Construit une instance de la classe [ImageFormat](./) qui représente un format d'image associé au GUID spécifié. |
| virtual [ToString](./tostring/)() const | Convertit cet objet [ImageFormat](./) en une chaîne lisible par l'homme. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
