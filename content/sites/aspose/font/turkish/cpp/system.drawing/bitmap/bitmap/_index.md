---
title: "System::Drawing::Bitmap::Bitmap yapıcı"
linktitle: "Bitmap"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Bitmap::Bitmap yapıcı. Belirtilen mevcut görüntüden C++'da yeni bir Bitmap nesnesi oluşturur."
type: docs
weight: 100
url: /tr/cpp/system.drawing/bitmap/bitmap/
---
## Bitmap::Bitmap(const SharedPtr\<Image\>\&) constructor


Belirtilen mevcut görüntüden yeni bir [Bitmap](../) nesnesi oluşturur.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| orijinal | const SharedPtr\<Image\>\& | Bitmap görüntüsünün oluşturulacağı mevcut görüntü |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, const Size\&) constructor


Belirtilen mevcut görüntüden, belirtilen boyuta ölçeklendirilmiş yeni bir [Bitmap](../) nesnesi oluşturur.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, const Size &size)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| orijinal | const SharedPtr\<Image\>\& | Bitmap görüntüsünün oluşturulacağı mevcut görüntü |
| size | const Size\& | Yeni görüntünün boyutu |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Size](../../size/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, int, int) constructor


Belirtilen mevcut görüntüden, genişlik ve yükseklik belirtilen değerlere ölçeklendirilmiş yeni bir [Bitmap](../) nesnesi oluşturur.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, int width, int height)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| orijinal | const SharedPtr\<Image\>\& | Bitmap görüntüsünün oluşturulacağı mevcut görüntü |
| width | int | Yeni görüntünün genişliği |
| height | int | Yeni görüntünün yüksekliği |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<System::IO::Stream\>\&, bool) constructor


Belirtilen akıştan yeni bir [Bitmap](../) nesnesi oluşturur.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<System::IO::Stream> &stream, bool useIcm=false)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| akış | const SharedPtr\<System::IO::Stream\>\& | Görüntü verilerini içeren bir akış |
| useIcm | bool | IGNORED |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(const String\&) constructor


Belirtilen dosyadan yeni bir [Bitmap](../) nesnesi oluşturur.

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| filename | const String\& | Görüntü verisi içeren dosyanın adı |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(const String\&, bool) constructor


Belirtilen dosyadan yeni bir [Bitmap](../) nesnesi oluşturur.

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename, bool useIcm)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| filename | const String\& | Görüntü verisi içeren dosyanın adı |
| useIcm | bool | IGNORED |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(int, int, Imaging::PixelFormat) constructor


Belirtilen genişlik, yükseklik, piksel biçimi ve piksel verileriyle bir bitmap görüntüsünü temsil eden yeni bir [Bitmap](../) nesnesi oluşturur.

```cpp
System::Drawing::Bitmap::Bitmap(int width, int height, Imaging::PixelFormat format=Imaging::PixelFormat::Format32bppArgb)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| width | int | Görüntünün genişliği |
| height | int | Görüntünün yüksekliği |
| biçim | Imaging::PixelFormat | Görüntünün piksel biçimi |

## Ayrıca Bakınız

* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
