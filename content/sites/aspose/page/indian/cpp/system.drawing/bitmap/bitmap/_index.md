---
title: "System::Drawing::Bitmap::Bitmap कंस्ट्रक्टर"
linktitle: "Bitmap"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Bitmap::Bitmap कंस्ट्रक्टर। निर्दिष्ट मौजूदा छवि से एक नया Bitmap ऑब्जेक्ट C++ में बनाता है।"
type: docs
weight: 100
url: /hi/cpp/system.drawing/bitmap/bitmap/
---
## Bitmap::Bitmap(const SharedPtr\<Image\>\&) constructor


निर्दिष्ट मौजूदा छवि से एक नया [Bitmap](../) ऑब्जेक्ट बनाता है।

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मूल | const SharedPtr\<Image\>\& | बिटमैप छवि बनाने के लिए मौजूदा छवि |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, const Size\&) constructor


निर्दिष्ट मौजूदा छवि से एक नया [Bitmap](../) ऑब्जेक्ट बनाता है, जिसे निर्दिष्ट आकार में स्केल किया गया है।

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, const Size &size)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मूल | const SharedPtr\<Image\>\& | बिटमैप छवि बनाने के लिए मौजूदा छवि |
| size | const Size\& | नए चित्र का आकार |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Size](../../size/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, int, int) constructor


निर्दिष्ट मौजूदा छवि से एक नया [Bitmap](../) ऑब्जेक्ट बनाता है, जिसकी चौड़ाई और ऊँचाई को निर्दिष्ट मानों में स्केल किया गया है।

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, int width, int height)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मूल | const SharedPtr\<Image\>\& | बिटमैप छवि बनाने के लिए मौजूदा छवि |
| width | int | नए चित्र की चौड़ाई |
| height | int | नए चित्र की ऊँचाई |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<System::IO::Stream\>\&, bool) constructor


निर्दिष्ट स्ट्रीम से एक नया [Bitmap](../) ऑब्जेक्ट बनाता है।

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<System::IO::Stream> &stream, bool useIcm=false)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | const SharedPtr\<System::IO::Stream\>\& | एक स्ट्रीम जिसमें इमेज डेटा होता है |
| useIcm | bool | IGNORED |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const String\&) constructor


निर्दिष्ट फ़ाइल से एक नया [Bitmap](../) ऑब्जेक्ट बनाता है।

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| filename | const String\& | इमेज डेटा वाली फ़ाइल का नाम |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const String\&, bool) constructor


निर्दिष्ट फ़ाइल से एक नया [Bitmap](../) ऑब्जेक्ट बनाता है।

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename, bool useIcm)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| filename | const String\& | इमेज डेटा वाली फ़ाइल का नाम |
| useIcm | bool | IGNORED |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(int, int, Imaging::PixelFormat) constructor


निर्दिष्ट चौड़ाई, ऊँचाई, पिक्सेल फ़ॉर्मेट और पिक्सेल डेटा के साथ एक बिटमैप छवि का प्रतिनिधित्व करने वाला नया [Bitmap](../) ऑब्जेक्ट बनाता है।

```cpp
System::Drawing::Bitmap::Bitmap(int width, int height, Imaging::PixelFormat format=Imaging::PixelFormat::Format32bppArgb)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| width | int | छवि की चौड़ाई |
| height | int | छवि की ऊँचाई |
| फ़ॉर्मेट | Imaging::PixelFormat | छवि का पिक्सेल फ़ॉर्मेट |

## संबंधित देखें

* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
