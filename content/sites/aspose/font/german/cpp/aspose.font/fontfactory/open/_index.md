---
title: "Methode Aspose::Font::FontFactory::Open"
linktitle: "Open"
second_title: "Aspose.Font für C++"
description: "Methode Aspose::Font::FontFactory::Open. Öffnet eine Schriftart, wobei der Schrifttyp und das Schriftartdaten-Byte-Array in C++ verwendet werden."
type: docs
weight: 200
url: /de/cpp/aspose.font/fontfactory/open/
---
## FontFactory::Open(FontType, System::ArrayPtr\<uint8_t\>) method


Öffnet eine Schriftart unter Verwendung von Schriftarttyp und Schriftartdaten-Byte-Array.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::ArrayPtr<uint8_t> fontData)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) Typ. |
| fontData | System::ArrayPtr\<uint8_t\> | Byte-Array, aus dem die Schriftart geladen wird. |

### ReturnValue

[Font](../../font/) loaded.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(FontType, System::SharedPtr\<Sources::StreamSource\>) method


Öffnet eine Schriftart unter Verwendung von Schriftarttyp und Stream-Quelle.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::SharedPtr<Sources::StreamSource> fontStreamSource)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) Typ. |
| fontStreamSource | System::SharedPtr\<Sources::StreamSource\> | Datenstromquelle für die Schriftart. |

### ReturnValue

[Font](../../font/) loaded.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Class [StreamSource](../../../aspose.font.sources/streamsource/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(FontType, System::String) method


Öffnet eine Schriftart unter Verwendung von Schriftarttyp und Schriftartdateinamen.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::String fileName)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) Typ. |
| fileName | System::String | [Font](../../font/) Dateiname. |

### ReturnValue

[Font](../../font/) loaded.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Class [String](../../../system/string/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(System::SharedPtr\<Sources::FontDefinition\>) method


Öffnet eine Schriftart unter Verwendung eines FontDefinition-Objekts.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(System::SharedPtr<Sources::FontDefinition> fontDefinition)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontDefinition | System::SharedPtr\<Sources::FontDefinition\> | [Font](../../font/) Definitionsobjekt. |

### ReturnValue

[Font](../../font/) loaded.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [FontDefinition](../../../aspose.font.sources/fontdefinition/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
