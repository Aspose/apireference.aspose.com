---
title: "System::Drawing::Imaging::BitmapData class"
linktitle: "BitmapData"
second_title: "Aspose.Font pour C++"
description: "System::Drawing::Imaging::BitmapData class. Représente un ensemble d'attributs d'une image bitmap. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.drawing.imaging/bitmapdata/
---
## BitmapData class


Représente un ensemble d'attributs d'une image bitmap. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class BitmapData : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Height](./get_height/)() const | Renvoie la hauteur de l'image en pixels. |
| [get_PixelFormat](./get_pixelformat/)() const | Renvoie le format de pixel de l'image bitmap. |
| [get_Scan0](./get_scan0/)() const | Renvoie l'adresse des premières données de pixel dans le bitmap. |
| [get_Stride](./get_stride/)() const | Renvoie la largeur du pas (stride) de l'image en octets. |
| [get_Width](./get_width/)() const | Renvoie la largeur de l'image en pixels. |
| [set_Height](./set_height/)(int) | Définit la hauteur de l'image en pixels. |
| [set_PixelFormat](./set_pixelformat/)(PixelFormat) | Définit le format de pixel de l'image bitmap. |
| [set_Scan0](./set_scan0/)(IntPtr) | Définit l'adresse des premières données de pixel dans le bitmap. |
| [set_Stride](./set_stride/)(int) | Définit la largeur du pas (stride) de l'image en octets. |
| [set_Width](./set_width/)(int) | Définit la largeur de l'image en pixels. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
