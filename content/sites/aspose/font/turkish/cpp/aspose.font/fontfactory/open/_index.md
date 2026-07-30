---
title: "Aspose::Font::FontFactory::Open yöntemi"
linktitle: "Open"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::FontFactory::Open yöntemi. C++'ta font türü ve font veri bayt dizisini kullanarak bir font açar."
type: docs
weight: 200
url: /tr/cpp/aspose.font/fontfactory/open/
---
## FontFactory::Open(FontType, System::ArrayPtr\<uint8_t\>) method


Font tipini ve font veri bayt dizisini kullanarak bir font açar.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::ArrayPtr<uint8_t> fontData)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) türü. |
| fontData | System::ArrayPtr\<uint8_t\> | Fontu yüklemek için bayt dizisi. |

### ReturnValue

[Font](../../font/) loaded.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(FontType, System::SharedPtr\<Sources::StreamSource\>) method


Font tipini ve akış kaynağını kullanarak bir font açar.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::SharedPtr<Sources::StreamSource> fontStreamSource)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) türü. |
| fontStreamSource | System::SharedPtr\<Sources::StreamSource\> | Font için akış kaynağı. |

### ReturnValue

[Font](../../font/) loaded.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Class [StreamSource](../../../aspose.font.sources/streamsource/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(FontType, System::String) method


Font tipini ve font dosya adını kullanarak bir font açar.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::String fileName)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) türü. |
| fileName | System::String | [Font](../../font/) dosya adı. |

### ReturnValue

[Font](../../font/) loaded.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Class [String](../../../system/string/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(System::SharedPtr\<Sources::FontDefinition\>) method


FontDefinition nesnesi kullanarak bir font açar.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(System::SharedPtr<Sources::FontDefinition> fontDefinition)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| fontDefinition | System::SharedPtr\<Sources::FontDefinition\> | [Font](../../font/) tanım nesnesi. |

### ReturnValue

[Font](../../font/) loaded.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [FontDefinition](../../../aspose.font.sources/fontdefinition/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
