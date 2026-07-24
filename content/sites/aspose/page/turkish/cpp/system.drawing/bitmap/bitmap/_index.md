---
title: "System::Drawing::Bitmap::Bitmap yapıcı"
linktitle: "Bitmap"
second_title: "Aspose.Page için C++"
description: "System::Drawing::Bitmap::Bitmap yapıcı. Belirtilen mevcut görüntüden yeni bir Bitmap nesnesi oluşturur C++'da."
type: docs
weight: 100
url: /tr/cpp/system.drawing/bitmap/bitmap/
---
## Bitmap::Bitmap(const SharedPtr\<Image\>\&) constructor


Belirtilen mevcut görüntüden yeni bir [Bitmap](../) nesnesi oluşturur.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| orijinal | const SharedPtr\<Image\>\& | Bitmap görüntüsü oluşturulacak mevcut görüntü |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, const Size\&) constructor


Belirtilen mevcut görüntüden, belirtilen boyuta ölçeklendirilmiş yeni bir [Bitmap](../) nesnesi oluşturur.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, const Size &size)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| orijinal | const SharedPtr\<Image\>\& | Bitmap görüntüsü oluşturulacak mevcut görüntü |
| size | const Size\& | Yeni görüntünün boyutu |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Size](../../size/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, int, int) constructor


Belirtilen mevcut görüntüden, genişlik ve yükseklik belirtilen değerlere ölçeklendirilmiş yeni bir [Bitmap](../) nesnesi oluşturur.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, int width, int height)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| orijinal | const SharedPtr\<Image\>\& | Bitmap görüntüsü oluşturulacak mevcut görüntü |
| genişlik | int | Yeni görüntünün genişliği |
| yükseklik | int | Yeni görüntünün yüksekliği |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<System::IO::Stream\>\&, bool) constructor


Belirtilen akıştan yeni bir [Bitmap](../) nesnesi oluşturur.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<System::IO::Stream> &stream, bool useIcm=false)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| akış | const SharedPtr\<System::IO::Stream\>\& | Görüntü verisi içeren bir akış |
| useIcm | bool | IGNORED |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const String\&) constructor


Belirtilen dosyadan yeni bir [Bitmap](../) nesnesi oluşturur.

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| filename | const String\& | Görüntü verilerini içeren dosyanın adı |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const String\&, bool) constructor


Belirtilen dosyadan yeni bir [Bitmap](../) nesnesi oluşturur.

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename, bool useIcm)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| filename | const String\& | Görüntü verilerini içeren dosyanın adı |
| useIcm | bool | IGNORED |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(int, int, Imaging::PixelFormat) constructor


Belirtilen genişlik, yükseklik, piksel formatı ve piksel verileriyle bir bitmap görüntüsünü temsil eden yeni bir [Bitmap](../) nesnesi oluşturur.

```cpp
System::Drawing::Bitmap::Bitmap(int width, int height, Imaging::PixelFormat format=Imaging::PixelFormat::Format32bppArgb)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| genişlik | int | Görüntünün genişliği |
| yükseklik | int | Görüntünün yüksekliği |
| biçim | Imaging::PixelFormat | Görüntünün piksel formatı |

## Ayrıca Bakınız

* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
