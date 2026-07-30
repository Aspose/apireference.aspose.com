---
title: "Classe System::Drawing::Imaging::ImageCodecInfo"
linktitle: "ImageCodecInfo"
second_title: "Aspose.Font pour C++"
description: "Classe System::Drawing::Imaging::ImageCodecInfo. Fournit des informations sur un codec d'image. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1000
url: /fr/cpp/system.drawing.imaging/imagecodecinfo/
---
## ImageCodecInfo class


Fournit des informations sur un codec d'image. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class ImageCodecInfo : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_FormatID](./get_formatid/)() const | Renvoie un GUID associé au format du codec représenté par l'objet actuel. |
| [get_MimeType](./get_mimetype/)() | Renvoie le type Multipurpose Internet Mail Extensions (MIME) du codec représenté par l'objet actuel. |
| static [GetImageDecoders](./getimagedecoders/)() | Renvoie un tableau d'objets [ImageCodecInfo](./) qui représentent les décodeurs d'image pris en charge. |
| static [GetImageEncoders](./getimageencoders/)() | Renvoie un tableau d'objets [ImageCodecInfo](./) qui représentent les encodeurs d'image pris en charge. |
| [set_FormatID](./set_formatid/)(const Guid\&) | Définit un GUID associé au format du codec représenté par l'objet actuel. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
