---
title: "Constructeur System::Drawing::Bitmap::Bitmap"
linktitle: "Bitmap"
second_title: "Aspose.Font pour C++"
description: "Constructeur System::Drawing::Bitmap::Bitmap. Construit un nouvel objet Bitmap à partir de l'image existante spécifiée en C++."
type: docs
weight: 100
url: /fr/cpp/system.drawing/bitmap/bitmap/
---
## Bitmap::Bitmap(const SharedPtr\<Image\>\&) constructor


Construit un nouvel objet [Bitmap](../) à partir de l'image existante spécifiée.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| original | const SharedPtr\<Image\>\& | L'image existante à partir de laquelle créer l'image bitmap |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, const Size\&) constructor


Construit un nouvel objet [Bitmap](../) à partir de l'image existante spécifiée, redimensionnée à la taille spécifiée.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, const Size &size)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| original | const SharedPtr\<Image\>\& | L'image existante à partir de laquelle créer l'image bitmap |
| taille | const Size\& | La taille de la nouvelle image |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Size](../../size/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, int, int) constructor


Construit un nouvel objet [Bitmap](../) à partir de l'image existante spécifiée avec la largeur et la hauteur redimensionnées aux valeurs spécifiées.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, int width, int height)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| original | const SharedPtr\<Image\>\& | L'image existante à partir de laquelle créer l'image bitmap |
| width | int | Largeur de la nouvelle image |
| height | int | Hauteur de la nouvelle image |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<System::IO::Stream\>\&, bool) constructor


Construit un nouvel objet [Bitmap](../) à partir du flux spécifié.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<System::IO::Stream> &stream, bool useIcm=false)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | const SharedPtr\<System::IO::Stream\>\& | Un flux qui contient des données d'image |
| useIcm | bool | IGNORED |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(const String\&) constructor


Construit un nouvel objet [Bitmap](../) à partir du fichier spécifié.

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| filename | const String\& | Le nom du fichier contenant les données d'image |

## Voir aussi

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(const String\&, bool) constructor


Construit un nouvel objet [Bitmap](../) à partir du fichier spécifié.

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename, bool useIcm)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| filename | const String\& | Le nom du fichier contenant les données d'image |
| useIcm | bool | IGNORED |

## Voir aussi

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(int, int, Imaging::PixelFormat) constructor


Construit un nouvel objet [Bitmap](../) qui représente une image bitmap avec la largeur, la hauteur, le format de pixel et les données de pixel spécifiés.

```cpp
System::Drawing::Bitmap::Bitmap(int width, int height, Imaging::PixelFormat format=Imaging::PixelFormat::Format32bppArgb)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| width | int | La largeur de l'image |
| height | int | La hauteur de l'image |
| format | Imagerie::FormatPixel | Le format de pixel de l'image |

## Voir aussi

* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
