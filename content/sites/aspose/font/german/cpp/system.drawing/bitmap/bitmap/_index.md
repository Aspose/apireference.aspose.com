---
title: "System::Drawing::Bitmap::Bitmap-Konstruktor"
linktitle: "Bitmap"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Bitmap::Bitmap-Konstruktor. Erstellt ein neues Bitmap-Objekt aus dem angegebenen vorhandenen Bild in C++."
type: docs
weight: 100
url: /de/cpp/system.drawing/bitmap/bitmap/
---
## Bitmap::Bitmap(const SharedPtr\<Image\>\&) constructor


Erstellt ein neues [Bitmap](../)-Objekt aus dem angegebenen vorhandenen Bild.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| original | const SharedPtr\<Image\>\& | Das vorhandene Bild, aus dem das Bitmap-Bild erstellt werden soll |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, const Size\&) constructor


Erstellt ein neues [Bitmap](../)-Objekt aus dem angegebenen vorhandenen Bild, skaliert auf die angegebene Größe.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, const Size &size)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| original | const SharedPtr\<Image\>\& | Das vorhandene Bild, aus dem das Bitmap-Bild erstellt werden soll |
| size | const Size\& | Die Größe des neuen Bildes |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Size](../../size/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, int, int) constructor


Erstellt ein neues [Bitmap](../)-Objekt aus dem angegebenen vorhandenen Bild, wobei Breite und Höhe auf die angegebenen Werte skaliert werden.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, int width, int height)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| original | const SharedPtr\<Image\>\& | Das vorhandene Bild, aus dem das Bitmap-Bild erstellt werden soll |
| width | int | Breite des neuen Bildes |
| height | int | Höhe des neuen Bildes |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<System::IO::Stream\>\&, bool) constructor


Erstellt ein neues [Bitmap](../)-Objekt aus dem angegebenen Stream.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<System::IO::Stream> &stream, bool useIcm=false)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | const SharedPtr\<System::IO::Stream\>\& | Ein Stream, der Bilddaten enthält |
| useIcm | bool | IGNORED |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(const String\&) constructor


Erstellt ein neues [Bitmap](../)-Objekt aus der angegebenen Datei.

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| filename | const String\& | Ein Name der Datei, die Bilddaten enthält |

## Siehe auch

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(const String\&, bool) constructor


Erstellt ein neues [Bitmap](../)-Objekt aus der angegebenen Datei.

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename, bool useIcm)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| filename | const String\& | Ein Name der Datei, die Bilddaten enthält |
| useIcm | bool | IGNORED |

## Siehe auch

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(int, int, Imaging::PixelFormat) constructor


Erstellt ein neues [Bitmap](../)-Objekt, das ein Bitmap-Bild mit der angegebenen Breite, Höhe, dem Pixelformat und den Pixeldaten darstellt.

```cpp
System::Drawing::Bitmap::Bitmap(int width, int height, Imaging::PixelFormat format=Imaging::PixelFormat::Format32bppArgb)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| width | int | Die Breite des Bildes |
| height | int | Die Höhe des Bildes |
| Format | Imaging::PixelFormat | Das Pixelformat des Bildes |

## Siehe auch

* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
