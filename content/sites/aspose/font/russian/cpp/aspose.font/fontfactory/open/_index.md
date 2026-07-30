---
title: "Aspose::Font::FontFactory::Open method"
linktitle: "Open"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::FontFactory::Open method. Открывает шрифт, используя тип шрифта и массив байтов данных шрифта в C++."
type: docs
weight: 200
url: /ru/cpp/aspose.font/fontfactory/open/
---
## FontFactory::Open(FontType, System::ArrayPtr\<uint8_t\>) method


Открывает шрифт, используя тип шрифта и массив байтов данных шрифта.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::ArrayPtr<uint8_t> fontData)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) тип. |
| fontData | System::ArrayPtr\<uint8_t\> | Массив байтов для загрузки шрифта. |

### ReturnValue

[Font](../../font/) loaded.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(FontType, System::SharedPtr\<Sources::StreamSource\>) method


Открывает шрифт, используя тип шрифта и источник потока.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::SharedPtr<Sources::StreamSource> fontStreamSource)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) тип. |
| fontStreamSource | System::SharedPtr\<Sources::StreamSource\> | Источник потока для шрифта. |

### ReturnValue

[Font](../../font/) loaded.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Class [StreamSource](../../../aspose.font.sources/streamsource/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(FontType, System::String) method


Открывает шрифт, используя тип шрифта и имя файла шрифта.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::String fileName)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) тип. |
| fileName | System::String | [Font](../../font/) имя файла. |

### ReturnValue

[Font](../../font/) loaded.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Class [String](../../../system/string/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(System::SharedPtr\<Sources::FontDefinition\>) method


Открывает шрифт, используя объект FontDefinition.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(System::SharedPtr<Sources::FontDefinition> fontDefinition)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| fontDefinition | System::SharedPtr\<Sources::FontDefinition\> | [Font](../../font/) объект определения. |

### ReturnValue

[Font](../../font/) loaded.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [FontDefinition](../../../aspose.font.sources/fontdefinition/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
