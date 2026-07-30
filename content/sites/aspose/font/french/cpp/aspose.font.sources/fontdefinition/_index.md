---
title: "Classe Aspose::Font::Sources::FontDefinition"
linktitle: "FontDefinition"
second_title: "Aspose.Font pour C++"
description: "Classe Aspose::Font::Sources::FontDefinition. Représente la définition d'un ensemble de fichiers de police. Cette classe contient des champs qui ne sont pas liés aux données internes de la police. Ces champs décrivent le placement de la police et d'autres données nécessaires pour charger la police depuis une source de police (fichier, mémoire, etc.) en C++."
type: docs
weight: 300
url: /fr/cpp/aspose.font.sources/fontdefinition/
---
## FontDefinition class


Représente la définition d'un ensemble de fichiers [Font](../../aspose.font/font/). Cette classe contient des champs qui ne sont pas liés aux données internes de la police. Ces champs décrivent le placement de la police et d'autres données nécessaires pour charger la police depuis une source de police (fichier, mémoire, etc.).

```cpp
class FontDefinition : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::String, System::SharedPtr\<StreamSource\>) | Crée une définition [Font](../../aspose.font/font/) à fichier unique. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::SharedPtr\<StreamSource\>) | Crée une définition [Font](../../aspose.font/font/) à fichier unique. |
| [FontDefinition](./fontdefinition/)(System::String, Aspose::Font::FontType, System::String, System::SharedPtr\<StreamSource\>) | Crée une définition [Font](../../aspose.font/font/) à fichier unique. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Crée une définition [Font](../../aspose.font/font/) à fichier unique. |
| [FontDefinition](./fontdefinition/)(System::String, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Crée une définition [Font](../../aspose.font/font/) à fichier unique. |
| [FontDefinition](./fontdefinition/)(System::String, System::String, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Crée une définition [Font](../../aspose.font/font/) à fichier unique. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | Crée une définition [Font](../../aspose.font/font/) multi-fichiers. |
| [FontDefinition](./fontdefinition/)(System::String, System::String, Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | Crée une définition [Font](../../aspose.font/font/) multi-fichiers. |
| [FontDefinition](./fontdefinition/)(System::SharedPtr\<MultiLanguageString\>, System::SharedPtr\<MultiLanguageString\>, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Crée une définition [Font](../../aspose.font/font/) multi-fichiers. |
| [FontDefinition](./fontdefinition/)(System::SharedPtr\<MultiLanguageString\>, System::SharedPtr\<MultiLanguageString\>, Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | Crée une définition [Font](../../aspose.font/font/) multi-fichiers. |
| [get_FileDefinitions](./get_filedefinitions/)() const | Obtient la collection des définitions de fichiers. |
| virtual [get_FontName](./get_fontname/)() | Renvoie le nom [Font](../../aspose.font/font/). |
| virtual [get_FontNames](./get_fontnames/)() | Obtient les noms de la [Font](../../aspose.font/font/) sous forme de [MultiLanguageString](../../aspose.font/multilanguagestring/). |
| [get_FontType](./get_fonttype/)() const | Obtient le type de la [Font](../../aspose.font/font/). |
| virtual [get_PostscriptName](./get_postscriptname/)() | Obtient le nom PostScript de la [Font](../../aspose.font/font/). |
| [get_PostscriptNames](./get_postscriptnames/)() const | Obtient les noms PostScript de la [Font](../../aspose.font/font/) sous forme de [MultiLanguageString](../../aspose.font/multilanguagestring/). |
| static [Open](./open/)(System::String, Aspose::Font::FontType) | Renvoie le [FontDefinition](./) pour le fichier de police et le type de police. |
| static [Open](./open/)(System::SharedPtr\<StreamSource\>, Aspose::Font::FontType) | Renvoie le [FontDefinition](./) pour la source de flux de police et le type de police. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Sources](../)
* Library [Aspose.Font for C++](../../)
