---
title: "Aspose::Font::Font::Open метод"
linktitle: "Open"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Font::Open метод. Открывает шрифт, используя тип шрифта и массив байтов данных шрифта в C++."
type: docs
weight: 2400
url: /ru/cpp/aspose.font/font/open/
---
## Font::Open(Aspose::Font::FontType, System::ArrayPtr\<uint8_t\>) method


Открывает шрифт, используя тип шрифта и массив байтов данных шрифта.

```cpp
static System::SharedPtr<Font> Aspose::Font::Font::Open(Aspose::Font::FontType fontType, System::ArrayPtr<uint8_t> fontData)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| fontType | Aspose::Font::FontType | Тип [Font](../). |
| fontData | System::ArrayPtr\<uint8_t\> | Массив байтов для загрузки шрифта. |

### ReturnValue

[Font](../) loaded.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Enum [FontType](../../fonttype/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Open(Aspose::Font::FontType, System::SharedPtr\<Sources::StreamSource\>) method


Открывает шрифт, используя тип шрифта и источник потока.

```cpp
static System::SharedPtr<Font> Aspose::Font::Font::Open(Aspose::Font::FontType fontType, System::SharedPtr<Sources::StreamSource> fontStreamSource)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| fontType | Aspose::Font::FontType | Тип [Font](../). |
| fontStreamSource | System::SharedPtr\<Sources::StreamSource\> | Источник потока для шрифта. |

### ReturnValue

[Font](../) loaded.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Enum [FontType](../../fonttype/)
* Class [StreamSource](../../../aspose.font.sources/streamsource/)
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Open(Aspose::Font::FontType, System::String) method


Открывает шрифт, используя тип шрифта и имя файла шрифта.

```cpp
static System::SharedPtr<Font> Aspose::Font::Font::Open(Aspose::Font::FontType fontType, System::String fileName)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| fontType | Aspose::Font::FontType | Тип [Font](../). |
| fileName | System::String | Имя файла [Font](../). |

### ReturnValue

[Font](../) loaded.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Enum [FontType](../../fonttype/)
* Class [String](../../../system/string/)
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Open(System::SharedPtr\<Aspose::Font::Sources::FontDefinition\>) method


Открывает шрифт, используя объект FontDefinition.

```cpp
static System::SharedPtr<Font> Aspose::Font::Font::Open(System::SharedPtr<Aspose::Font::Sources::FontDefinition> fontDefinition)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| fontDefinition | System::SharedPtr\<Aspose::Font::Sources::FontDefinition\> | Объект определения [Font](../). |

### ReturnValue

[Font](../) loaded.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Class [FontDefinition](../../../aspose.font.sources/fontdefinition/)
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
