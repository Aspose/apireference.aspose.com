---
title: "Méthode Aspose::Font::FontEnvironment::set_Strictness"
linktitle: "set_Strictness"
second_title: "Aspose.Font pour C++"
description: "Méthode Aspose::Font::FontEnvironment::set_Strictness. Certaines polices peuvent contenir des données inattendues, des fonctionnalités non spécifiées, ou être partiellement tronquées en C++."
type: docs
weight: 600
url: /fr/cpp/aspose.font/fontenvironment/set_strictness/
---
## FontEnvironment::set_Strictness method


Certaines polices peuvent contenir des données inattendues, des fonctionnalités non spécifiées, ou être grossièrement rognées.

```cpp
void Aspose::Font::FontEnvironment::set_Strictness(FontEnvironment::ParsingStrictness value)
```

## Remarques


Le réglage tolérant est recommandé pour les consommateurs qui souhaitent ouvrir n'importe quelle police malgré les éventuelles insuffisances du [Font](../../font/). Les structures internes du [Font](../../font/) ne sont pas garanties d'être cohérentes. Le réglage strict est recommandé pour les consommateurs qui souhaitent ouvrir principalement des polices valides et solides.
## Voir aussi

* Enum [ParsingStrictness](../parsingstrictness/)
* Class [FontEnvironment](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
