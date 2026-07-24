---
title: "System::Drawing::Font::Font कन्स्ट्रक्टर"
linktitle: "Font"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Font::Font कन्स्ट्रक्टर। C++ में निर्दिष्ट मौजूदा फ़ॉन्ट को निर्दिष्ट फ़ॉन्ट शैली के साथ दर्शाने वाले Font क्लास का नया इंस्टेंस बनाता है।"
type: docs
weight: 100
url: /hi/cpp/system.drawing/font/font/
---
## Font::Font(const SharedPtr\<Font\>\&, FontStyle) constructor


निर्दिष्ट मौजूदा फ़ॉन्ट को निर्दिष्ट फ़ॉन्ट शैली के साथ दर्शाने वाले [Font](../) क्लास का नया इंस्टेंस बनाता है।

```cpp
System::Drawing::Font::Font(const SharedPtr<Font> &prototype, FontStyle new_style)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| प्रोटोटाइप | const SharedPtr\<Font\>\& | नए फ़ॉन्ट को बनाने के लिए मौजूदा फ़ॉन्ट |
| new_style | FontStyle | नए फ़ॉन्ट पर लागू करने के लिए फ़ॉन्ट शैली |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Enum [FontStyle](../../fontstyle/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::Font(const SharedPtr\<FontFamily\>\&, float, FontStyle, GraphicsUnit, uint8_t, bool) constructor


[Font](../) क्लास का नया इंस्टेंस बनाता है।

```cpp
System::Drawing::Font::Font(const SharedPtr<FontFamily> &family, float em_size, FontStyle style, GraphicsUnit unit=GraphicsUnit::Point, uint8_t gdi_charset=1, bool gdi_vertical_font=false)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| फ़ैमिली | const SharedPtr\<FontFamily\>\& | नए फ़ॉन्ट का फ़ॉन्ट फ़ैमिली |
| em_size | फ़्लोट | नए फ़ॉन्ट का em आकार, **unit** पैरामीटर द्वारा निर्दिष्ट इकाइयों में |
| style | FontStyle | नए फ़ॉन्ट की शैली |
| इकाई | GraphicsUnit | नए फ़ॉन्ट की माप इकाइयाँ |
| gdi_charset | uint8_t | नए फ़ॉन्ट के लिए उपयोग किया जाने वाला GDI charset |
| gdi_vertical_font | bool | सही यदि नया फ़ॉन्ट GDI वर्टिकल फ़ॉन्ट से व्युत्पन्न है |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontFamily](../../fontfamily/)
* Enum [FontStyle](../../fontstyle/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::Font(const SharedPtr\<FontFamily\>\&, float, GraphicsUnit) constructor


[Font](../) क्लास का नया इंस्टेंस बनाता है।

```cpp
System::Drawing::Font::Font(const SharedPtr<FontFamily> &family, float em_size, GraphicsUnit unit=GraphicsUnit::Point)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| फ़ैमिली | const SharedPtr\<FontFamily\>\& | नए फ़ॉन्ट का फ़ॉन्ट फ़ैमिली |
| em_size | फ़्लोट | नए फ़ॉन्ट का em आकार, **unit** पैरामीटर द्वारा निर्दिष्ट इकाइयों में |
| इकाई | GraphicsUnit | नए फ़ॉन्ट की माप इकाइयाँ |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontFamily](../../fontfamily/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::Font(const String\&, float, FontStyle, GraphicsUnit, uint8_t, bool) constructor


[Font](../) क्लास का नया इंस्टेंस बनाता है।

```cpp
System::Drawing::Font::Font(const String &family_name, float em_size, FontStyle style, GraphicsUnit unit=GraphicsUnit::Point, uint8_t gdi_charset=1, bool gdi_vertical_font=false)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| family_name | const String\& | नए फ़ॉन्ट के फ़ॉन्ट परिवार का नाम |
| em_size | फ़्लोट | नए फ़ॉन्ट का em आकार, **unit** पैरामीटर द्वारा निर्दिष्ट इकाइयों में |
| style | FontStyle | नए फ़ॉन्ट की शैली |
| इकाई | GraphicsUnit | नए फ़ॉन्ट की माप इकाइयाँ |
| gdi_charset | uint8_t | नए फ़ॉन्ट के लिए उपयोग किया जाने वाला GDI charset |
| gdi_vertical_font | bool | सही यदि नया फ़ॉन्ट GDI वर्टिकल फ़ॉन्ट से व्युत्पन्न है |

## संबंधित देखें

* Class [String](../../../system/string/)
* Enum [FontStyle](../../fontstyle/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::Font(const String\&, float, GraphicsUnit) constructor


[Font](../) क्लास का नया इंस्टेंस बनाता है।

```cpp
System::Drawing::Font::Font(const String &family_name, float em_size, GraphicsUnit unit=GraphicsUnit::Point)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| family_name | const String\& | नए फ़ॉन्ट के फ़ॉन्ट परिवार का नाम |
| em_size | फ़्लोट | नए फ़ॉन्ट का em आकार, **unit** पैरामीटर द्वारा निर्दिष्ट इकाइयों में |
| इकाई | GraphicsUnit | नए फ़ॉन्ट की माप इकाइयाँ |

## संबंधित देखें

* Class [String](../../../system/string/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
