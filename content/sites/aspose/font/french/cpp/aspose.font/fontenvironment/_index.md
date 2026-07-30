---
title: "classe Aspose::Font::FontEnvironment"
linktitle: "FontEnvironment"
second_title: "Aspose.Font pour C++"
description: "classe Aspose::Font::FontEnvironment. Fournit des informations sur l'environnement et la plateforme actuels en C++."
type: docs
weight: 600
url: /fr/cpp/aspose.font/fontenvironment/
---
## FontEnvironment class


Fournit des informations sur l'environnement et la plateforme actuels.

```cpp
class FontEnvironment : public System::Object
```

## Enums

| Énumération | Description |
| --- | --- |
| [ParsingStrictness](./parsingstrictness/) | Types de rigueur d'analyse. |
## Méthodes

| Méthode | Description |
| --- | --- |
| static [get_CffCommonFontsSettings](./get_cffcommonfontssettings/)() | Paramètres communs aux polices CFF. |
| static [get_Current](./get_current/)() | Obtient l'environnement actuel. |
| [get_CurrentPlatformId](./get_currentplatformid/)() | Obtient l'identifiant de la plateforme actuelle. |
| [get_FontSpecificEncodings](./get_fontspecificencodings/)() const | Stocke des encodages spécifiques pour les polices sensibles au consommateur. Par exemple, les documents PDF utilisent les encodages spécifiques Adobe Symbol et ZapfDingbats. |
| [get_Strictness](./get_strictness/)() const | Certaines polices peuvent contenir des données inattendues, des fonctionnalités non spécifiées, ou être grossièrement rognées. |
| [set_Strictness](./set_strictness/)(FontEnvironment::ParsingStrictness) | Certaines polices peuvent contenir des données inattendues, des fonctionnalités non spécifiées, ou être grossièrement rognées. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
