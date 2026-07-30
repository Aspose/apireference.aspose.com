---
title: "Méthode Aspose::Font::FontFactory::Open"
linktitle: "Ouvrir"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::FontFactory::Open method. Ouvre une police, en utilisant le type de police et le tableau d'octets de données de police en C++."
type: docs
weight: 200
url: /fr/cpp/aspose.font/fontfactory/open/
---
## FontFactory::Open(FontType, System::ArrayPtr\<uint8_t\>) method


Ouvre une police en utilisant le type de police et le tableau d'octets de données de police.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::ArrayPtr<uint8_t> fontData)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) type. |
| fontData | System::ArrayPtr\<uint8_t\> | Tableau d'octets pour charger la police à partir de. |

### ReturnValue

[Font](../../font/) loaded.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(FontType, System::SharedPtr\<Sources::StreamSource\>) method


Ouvre une police en utilisant le type de police et la source du flux.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::SharedPtr<Sources::StreamSource> fontStreamSource)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) type. |
| fontStreamSource | System::SharedPtr\<Sources::StreamSource\> | Source de flux pour la police. |

### ReturnValue

[Font](../../font/) loaded.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Class [StreamSource](../../../aspose.font.sources/streamsource/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(FontType, System::String) method


Ouvre une police en utilisant le type de police et le nom du fichier de police.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::String fileName)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) type. |
| fileName | System::String | [Font](../../font/) nom de fichier. |

### ReturnValue

[Font](../../font/) loaded.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Class [String](../../../system/string/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(System::SharedPtr\<Sources::FontDefinition\>) method


Ouvre une police en utilisant l'objet FontDefinition.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(System::SharedPtr<Sources::FontDefinition> fontDefinition)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| fontDefinition | System::SharedPtr\<Sources::FontDefinition\> | [Font](../../font/) objet de définition. |

### ReturnValue

[Font](../../font/) loaded.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [FontDefinition](../../../aspose.font.sources/fontdefinition/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
