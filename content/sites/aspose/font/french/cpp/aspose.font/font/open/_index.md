---
title: "Aspose::Font::Font::Open méthode"
linktitle: "Ouvrir"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::Font::Open méthode. Ouvre une police, en utilisant le type de police et le tableau d'octets de données de police en C++."
type: docs
weight: 2400
url: /fr/cpp/aspose.font/font/open/
---
## Font::Open(Aspose::Font::FontType, System::ArrayPtr\<uint8_t\>) method


Ouvre une police en utilisant le type de police et le tableau d'octets de données de police.

```cpp
static System::SharedPtr<Font> Aspose::Font::Font::Open(Aspose::Font::FontType fontType, System::ArrayPtr<uint8_t> fontData)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| fontType | Aspose::Font::FontType | [Font](../) type. |
| fontData | System::ArrayPtr\<uint8_t\> | Tableau d'octets pour charger la police à partir de. |

### ReturnValue

[Font](../) loaded.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Enum [FontType](../../fonttype/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Open(Aspose::Font::FontType, System::SharedPtr\<Sources::StreamSource\>) method


Ouvre une police en utilisant le type de police et la source du flux.

```cpp
static System::SharedPtr<Font> Aspose::Font::Font::Open(Aspose::Font::FontType fontType, System::SharedPtr<Sources::StreamSource> fontStreamSource)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| fontType | Aspose::Font::FontType | [Font](../) type. |
| fontStreamSource | System::SharedPtr\<Sources::StreamSource\> | Source de flux pour la police. |

### ReturnValue

[Font](../) loaded.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Enum [FontType](../../fonttype/)
* Class [StreamSource](../../../aspose.font.sources/streamsource/)
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Open(Aspose::Font::FontType, System::String) method


Ouvre une police en utilisant le type de police et le nom du fichier de police.

```cpp
static System::SharedPtr<Font> Aspose::Font::Font::Open(Aspose::Font::FontType fontType, System::String fileName)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| fontType | Aspose::Font::FontType | [Font](../) type. |
| fileName | System::String | [Font](../) nom de fichier. |

### ReturnValue

[Font](../) loaded.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Enum [FontType](../../fonttype/)
* Class [String](../../../system/string/)
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Open(System::SharedPtr\<Aspose::Font::Sources::FontDefinition\>) method


Ouvre une police en utilisant l'objet FontDefinition.

```cpp
static System::SharedPtr<Font> Aspose::Font::Font::Open(System::SharedPtr<Aspose::Font::Sources::FontDefinition> fontDefinition)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| fontDefinition | System::SharedPtr\<Aspose::Font::Sources::FontDefinition\> | [Font](../) objet de définition. |

### ReturnValue

[Font](../) loaded.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Class [FontDefinition](../../../aspose.font.sources/fontdefinition/)
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
