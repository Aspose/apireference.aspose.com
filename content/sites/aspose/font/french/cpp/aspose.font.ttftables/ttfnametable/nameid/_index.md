---
title: "Aspose::Font::TtfTables::TtfNameTable::NameId énum"
linktitle: "NameId"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::TtfTables::TtfNameTable::NameId énum. Représente NameId en C++."
type: docs
weight: 1600
url: /fr/cpp/aspose.font.ttftables/ttfnametable/nameid/
---
## NameId enum


Représente [NameId](./).

```cpp
enum class NameId : uint16_t
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| CopyrightNotice | 0 | 0 Avis de droit d'auteur. |
| FontFamily | 1 | 1 [Font](../../../aspose.font/font/) Famille. Cette chaîne est le nom de famille du [Font](../../../aspose.font/font/) que l'utilisateur voit sur les plateformes Macintosh. |
| FontSubfamily | 2 | 2 [Font](../../../aspose.font/font/) Sous-famille. Cette chaîne est la famille du [Font](../../../aspose.font/font/) que l'utilisateur voit sur les plateformes Macintosh. |
| UniqueFontId | 3 | 3 Identification unique de sous-famille (spécification Apple). 3 Identifiant unique du [Font](../../../aspose.font/font/) (spécification MS). |
| FullName | 4 | 4 Nom complet du [Font](../../../aspose.font/font/). |
| Version | 5 | 5 Version de la table des noms. |
| PostScriptName | 6 | 6 Nom PostScript du [Font](../../../aspose.font/font/). Remarque : Un [Font](../../../aspose.font/font/) ne peut avoir qu'un seul nom PostScript et ce nom doit être en ASCII. |
| Avis de marque | 7 | 7 Avis de marque déposée. |
| Nom du fabricant | 8 | 8 Nom du fabricant. |
| Nom du concepteur | 9 | 9 Designer ; nom du designer de la police. |
| Description | 10 | 10 Description ; description de la police. Peut contenir des informations de révision, des recommandations d’utilisation, l’historique, les fonctionnalités, etc. |
| UrlVendor | 11 | 11 URL du fournisseur de la [Font](../../../aspose.font/font/) (avec protocole, p. ex., [http://](http://), [ftp://](ftp://)). Si un numéro de série unique est intégré dans l’URL, il peut être utilisé pour enregistrer la [Font](../../../aspose.font/font/). |
| UrlDesigner | 12 | 12 URL du designer de la [Font](../../../aspose.font/font/) (avec protocole, p. ex., [http://](http://), [ftp://](ftp://)) |
| LicenseDescription | 13 | 13 description de la [License](../../../aspose.font/license/) ; description de la manière dont la [Font](../../../aspose.font/font/) peut être utilisée légalement, ou différents scénarios d’utilisation sous licence. Ce champ doit être rédigé en langage clair, pas en jargon juridique. |
| LicenseInfoUrl | 14 | 14 URL d’informations de la [License](../../../aspose.font/license/), où des informations supplémentaires sur la licence peuvent être trouvées. |
| PreferredFamily | 16 | 15 Réservé 16 Famille préférée (Windows uniquement) ; sous Windows, le nom de la Famille est affiché dans le menu de la [Font](../../../aspose.font/font/); le nom de la Sous-famille est présenté comme le nom du Style. Pour des raisons historiques, les familles de [Font](../../../aspose.font/font/) ne contenaient que quatre styles au maximum, mais les concepteurs de [Font](../../../aspose.font/font/) peuvent regrouper plus de quatre polices dans une même famille. Les ID de Famille préférée et de Sous-famille préférée permettent aux concepteurs de [Font](../../../aspose.font/font/) d’inclure les groupements de famille/sous‑famille préférés. Ces ID ne sont présents que s’ils diffèrent des ID 1 et 2. |
| PreferredSubfamily | 17 | 17 Sous-famille préférée (Windows uniquement) ; sous Windows, le nom de la Famille est affiché dans le menu de la [Font](../../../aspose.font/font/); le nom de la Sous-famille est présenté comme le nom du Style. Pour des raisons historiques, les familles de [Font](../../../aspose.font/font/) ne contenaient que quatre styles au maximum, mais les concepteurs de [Font](../../../aspose.font/font/) peuvent regrouper plus de quatre polices dans une même famille. Les ID de Famille préférée et de Sous-famille préférée permettent aux concepteurs de [Font](../../../aspose.font/font/) d’inclure les groupements de famille/sous‑famille préférés. Ces ID ne sont présents que s’ils diffèrent des ID 1 et 2. |
| CompatibleFull | 18 | 18 Nom complet compatible (Macintosh uniquement) ; sur Macintosh, le nom du menu est construit à l’aide de la ressource de la [Font](../../../aspose.font/font/). Il correspond généralement au Nom complet. Si vous souhaitez que le nom de la [Font](../../../aspose.font/font/) apparaisse différemment du Nom complet, vous pouvez insérer le Nom complet compatible dans l’ID 18. Ce nom n’est pas utilisé par le système Mac OS lui‑même, mais peut être utilisé par les développeurs d’applications (p. ex., Adobe). |
| SampleText | 19 | 19 Texte d’exemple. Cela peut être le nom de la [Font](../../../aspose.font/font/), ou tout autre texte que le designer estime être le meilleur exemple pour montrer à quoi ressemble la [Font](../../../aspose.font/font/). |
| PostScriptCID | 20 | Sa présence dans une police signifie que le nameID 6 contient un nom de police PostScript destiné à être utilisé avec l’invocation « composefont » afin d’appeler la police dans un interpréteur PostScript. |
| WwsFamilyName | 21 | Utilisé pour fournir un nom de famille conforme au modèle WWS au cas où les entrées des ID 16 et 17 ne respecteraient pas le modèle WWS. |
| WwsSubfamilyName | 22 | Utilisé conjointement avec l’ID 21, cet ID fournit un nom de sous‑famille conforme au modèle WWS (reflétant uniquement les attributs de poids, de largeur et d’inclinaison) au cas où les entrées des ID 16 et 17 ne respecteraient pas le modèle WWS. |
| Arrière-plan clair | 23 | Cet ID, s’il est utilisé dans le tableau Palette Labels Array du CPAL, indique que la palette de couleurs correspondante dans le tableau CPAL est appropriée pour être utilisée avec la police lorsqu’elle est affichée sur un fond clair comme le blanc. |
| Arrière-plan sombre | 24 | Cet ID, s’il est utilisé dans le tableau Palette Labels Array du CPAL, indique que la palette de couleurs correspondante dans le tableau CPAL est appropriée pour être utilisée avec la police lorsqu’elle est affichée sur un fond sombre comme le noir. |
| PréfixeNomPostScriptVariations | 25 | Si présent dans une police variable, il peut être utilisé comme préfixe de famille dans l’algorithme de génération de nom PostScript pour les polices à variations. |

## Voir aussi

* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
