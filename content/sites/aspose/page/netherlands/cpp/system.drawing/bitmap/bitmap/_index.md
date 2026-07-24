---
title: "System::Drawing::Bitmap::Bitmap constructor"
linktitle: "Bitmap"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Bitmap::Bitmap constructor. Construeert een nieuw Bitmap-object van de opgegeven bestaande afbeelding in C++."
type: docs
weight: 100
url: /nl/cpp/system.drawing/bitmap/bitmap/
---
## Bitmap::Bitmap(const SharedPtr\<Image\>\&) constructor


Construeert een nieuw [Bitmap](../) object van de opgegeven bestaande afbeelding.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| origineel | const SharedPtr\<Image\>\& | De bestaande afbeelding waaruit het bitmap‑beeld wordt gemaakt |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, const Size\&) constructor


Construeert een nieuw [Bitmap](../) object van de opgegeven bestaande afbeelding, geschaald naar de opgegeven grootte.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, const Size &size)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| origineel | const SharedPtr\<Image\>\& | De bestaande afbeelding waaruit het bitmap‑beeld wordt gemaakt |
| size | const Size\& | De grootte van het nieuwe beeld |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Size](../../size/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, int, int) constructor


Construeert een nieuw [Bitmap](../) object van de opgegeven bestaande afbeelding met breedte en hoogte geschaald naar de opgegeven waarden.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, int width, int height)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| origineel | const SharedPtr\<Image\>\& | De bestaande afbeelding waaruit het bitmap‑beeld wordt gemaakt |
| width | int | Breedte van het nieuwe beeld |
| height | int | Hoogte van het nieuwe beeld |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<System::IO::Stream\>\&, bool) constructor


Construeert een nieuw [Bitmap](../) object van de opgegeven stream.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<System::IO::Stream> &stream, bool useIcm=false)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | const SharedPtr\<System::IO::Stream\>\& | Een stream die afbeeldingsgegevens bevat |
| useIcm | bool | IGNORED |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const String\&) constructor


Construeert een nieuw [Bitmap](../) object van het opgegeven bestand.

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| filename | const String\& | Een bestandsnaam die afbeeldingsgegevens bevat |

## Zie ook

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const String\&, bool) constructor


Construeert een nieuw [Bitmap](../) object van het opgegeven bestand.

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename, bool useIcm)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| filename | const String\& | Een bestandsnaam die afbeeldingsgegevens bevat |
| useIcm | bool | IGNORED |

## Zie ook

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(int, int, Imaging::PixelFormat) constructor


Construeert een nieuw [Bitmap](../) object dat een bitmap‑afbeelding vertegenwoordigt met de opgegeven breedte, hoogte, pixelindeling en pixelgegevens.

```cpp
System::Drawing::Bitmap::Bitmap(int width, int height, Imaging::PixelFormat format=Imaging::PixelFormat::Format32bppArgb)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| width | int | De breedte van de afbeelding |
| height | int | De hoogte van de afbeelding |
| formaat | Imaging::PixelFormat | De pixelindeling van de afbeelding |

## Zie ook

* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
