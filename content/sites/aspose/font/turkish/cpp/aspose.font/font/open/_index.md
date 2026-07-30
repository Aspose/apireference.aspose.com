---
title: "Aspose::Font::Font::Open metodu"
linktitle: "Open"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Font::Open metodu. C++'da font türü ve font veri bayt dizisi kullanarak bir font açar."
type: docs
weight: 2400
url: /tr/cpp/aspose.font/font/open/
---
## Font::Open(Aspose::Font::FontType, System::ArrayPtr\<uint8_t\>) method


Font tipini ve font veri bayt dizisini kullanarak bir font açar.

```cpp
static System::SharedPtr<Font> Aspose::Font::Font::Open(Aspose::Font::FontType fontType, System::ArrayPtr<uint8_t> fontData)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| fontType | Aspose::Font::FontType | [Font](../) türü. |
| fontData | System::ArrayPtr\<uint8_t\> | Fontu yüklemek için bayt dizisi. |

### ReturnValue

[Font](../) loaded.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Enum [FontType](../../fonttype/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Open(Aspose::Font::FontType, System::SharedPtr\<Sources::StreamSource\>) method


Font tipini ve akış kaynağını kullanarak bir font açar.

```cpp
static System::SharedPtr<Font> Aspose::Font::Font::Open(Aspose::Font::FontType fontType, System::SharedPtr<Sources::StreamSource> fontStreamSource)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| fontType | Aspose::Font::FontType | [Font](../) türü. |
| fontStreamSource | System::SharedPtr\<Sources::StreamSource\> | Font için akış kaynağı. |

### ReturnValue

[Font](../) loaded.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Enum [FontType](../../fonttype/)
* Class [StreamSource](../../../aspose.font.sources/streamsource/)
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Open(Aspose::Font::FontType, System::String) method


Font tipini ve font dosya adını kullanarak bir font açar.

```cpp
static System::SharedPtr<Font> Aspose::Font::Font::Open(Aspose::Font::FontType fontType, System::String fileName)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| fontType | Aspose::Font::FontType | [Font](../) türü. |
| fileName | System::String | [Font](../) dosya adı. |

### ReturnValue

[Font](../) loaded.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Enum [FontType](../../fonttype/)
* Class [String](../../../system/string/)
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Open(System::SharedPtr\<Aspose::Font::Sources::FontDefinition\>) method


FontDefinition nesnesi kullanarak bir font açar.

```cpp
static System::SharedPtr<Font> Aspose::Font::Font::Open(System::SharedPtr<Aspose::Font::Sources::FontDefinition> fontDefinition)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| fontDefinition | System::SharedPtr\<Aspose::Font::Sources::FontDefinition\> | [Font](../) tanım nesnesi. |

### ReturnValue

[Font](../) loaded.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Class [FontDefinition](../../../aspose.font.sources/fontdefinition/)
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
