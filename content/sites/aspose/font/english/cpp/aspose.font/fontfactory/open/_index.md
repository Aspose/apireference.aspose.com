---
title: Aspose::Font::FontFactory::Open method
linktitle: Open
second_title: Aspose.Font for C++
description: 'Aspose::Font::FontFactory::Open method. Opens a font, using font type and font data byte array in C++.'
type: docs
weight: 200
url: /cpp/aspose.font/fontfactory/open/
---
## FontFactory::Open(FontType, System::ArrayPtr\<uint8_t\>) method


Opens a font, using font type and font data byte array.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::ArrayPtr<uint8_t> fontData)
```


| Parameter | Type | Description |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) type. |
| fontData | System::ArrayPtr\<uint8_t\> | Byte array to load font from. |

### ReturnValue

[Font](../../font/) loaded.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(FontType, System::SharedPtr\<Sources::StreamSource\>) method


Opens a font, using font type and stream source.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::SharedPtr<Sources::StreamSource> fontStreamSource)
```


| Parameter | Type | Description |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) type. |
| fontStreamSource | System::SharedPtr\<Sources::StreamSource\> | Stream source for font. |

### ReturnValue

[Font](../../font/) loaded.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Class [StreamSource](../../../aspose.font.sources/streamsource/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(FontType, System::String) method


Opens a font, using font type and font file name.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::String fileName)
```


| Parameter | Type | Description |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) type. |
| fileName | System::String | [Font](../../font/) file name. |

### ReturnValue

[Font](../../font/) loaded.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Class [String](../../../system/string/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(System::SharedPtr\<Sources::FontDefinition\>) method


Opens a font, using FontDefinition object.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(System::SharedPtr<Sources::FontDefinition> fontDefinition)
```


| Parameter | Type | Description |
| --- | --- | --- |
| fontDefinition | System::SharedPtr\<Sources::FontDefinition\> | [Font](../../font/) definition object. |

### ReturnValue

[Font](../../font/) loaded.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [FontDefinition](../../../aspose.font.sources/fontdefinition/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
