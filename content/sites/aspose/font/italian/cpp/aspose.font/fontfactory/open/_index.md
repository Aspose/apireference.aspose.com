---
title: "Aspose::Font::FontFactory::Open metodo"
linktitle: "Open"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::FontFactory::Open metodo. Apre un font, usando il tipo di font e l'array di byte dei dati del font in C++."
type: docs
weight: 200
url: /it/cpp/aspose.font/fontfactory/open/
---
## FontFactory::Open(FontType, System::ArrayPtr\<uint8_t\>) method


Apre un font, usando il tipo di font e l'array di byte dei dati del font.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::ArrayPtr<uint8_t> fontData)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) tipo. |
| fontData | System::ArrayPtr\<uint8_t\> | Array di byte da cui caricare il font. |

### ReturnValue

[Font](../../font/) loaded.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(FontType, System::SharedPtr\<Sources::StreamSource\>) method


Apre un font, usando il tipo di font e la sorgente di flusso.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::SharedPtr<Sources::StreamSource> fontStreamSource)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) tipo. |
| fontStreamSource | System::SharedPtr\<Sources::StreamSource\> | Sorgente di stream per il font. |

### ReturnValue

[Font](../../font/) loaded.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Class [StreamSource](../../../aspose.font.sources/streamsource/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(FontType, System::String) method


Apre un font, usando il tipo di font e il nome del file del font.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::String fileName)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) tipo. |
| fileName | System::String | [Font](../../font/) nome file. |

### ReturnValue

[Font](../../font/) loaded.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Class [String](../../../system/string/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(System::SharedPtr\<Sources::FontDefinition\>) method


Apre un font, usando l'oggetto FontDefinition.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(System::SharedPtr<Sources::FontDefinition> fontDefinition)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontDefinition | System::SharedPtr\<Sources::FontDefinition\> | [Font](../../font/) oggetto definizione. |

### ReturnValue

[Font](../../font/) loaded.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [FontDefinition](../../../aspose.font.sources/fontdefinition/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
