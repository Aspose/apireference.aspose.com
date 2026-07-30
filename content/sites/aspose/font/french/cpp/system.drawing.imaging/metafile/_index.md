---
title: "System::Drawing::Imaging::Metafile classe"
linktitle: "Metafile"
second_title: "Aspose.Font pour C++"
description: "System::Drawing::Imaging::Metafile class. Représente un métafichier graphique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1200
url: /fr/cpp/system.drawing.imaging/metafile/
---
## Metafile class


Représente un métafichier graphique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class Metafile : public System::Drawing::Image
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() override | Renvoie une copie de l'objet actuel. |
| [get_Height](./get_height/)() const override | Renvoie les hauteurs de l'image en pixels. |
| [get_PixelFormat](./get_pixelformat/)() const override | Renvoie une valeur qui indique le format des pixels. |
| [get_RawFormat](./get_rawformat/)() const override | Renvoie une valeur qui indique le format de l'image. |
| [get_Width](./get_width/)() const override | Renvoie la largeur de l'image en pixels. |
| [GetHenhmetafile](./gethenhmetafile/)() | NON IMPLEMENTÉ. |
| [GetMetafileHeader](./getmetafileheader/)() | Renvoie un en-tête associé à l'objet actuel. |
| [Metafile](./metafile/)(const System::String\&) | NON IMPLEMENTÉ. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&) | NON IMPLEMENTÉ. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, EmfType) | NON IMPLEMENTÉ. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr) | NON IMPLEMENTÉ. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, Rectangle, MetafileFrameUnit, EmfType) | NON IMPLEMENTÉ. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | NON IMPLEMENTÉ. |
| [Metafile](./metafile/)(IntPtr, EmfType) | NON IMPLEMENTÉ. |
| [PlayRecord](./playrecord/)(EmfPlusRecordType, int32_t, int32_t, System::ByteArrayPtr) | NON IMPLEMENTÉ. |
| virtual [~Metafile](./~metafile/)() | Destructeur. |
## Voir aussi

* Class [Image](../../system.drawing/image/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
