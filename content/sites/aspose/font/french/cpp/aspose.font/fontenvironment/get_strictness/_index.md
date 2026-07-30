---
title: "Méthode Aspose::Font::FontEnvironment::get_Strictness"
linktitle: "get_Strictness"
second_title: "Aspose.Font pour C++"
description: "Méthode Aspose::Font::FontEnvironment::get_Strictness. Certaines polices peuvent contenir des données inattendues, des fonctionnalités non spécifiées, ou être partiellement tronquées en C++."
type: docs
weight: 500
url: /fr/cpp/aspose.font/fontenvironment/get_strictness/
---
## FontEnvironment::get_Strictness method


Certaines polices peuvent contenir des données inattendues, des fonctionnalités non spécifiées, ou être grossièrement rognées.

```cpp
FontEnvironment::ParsingStrictness Aspose::Font::FontEnvironment::get_Strictness() const
```

## Remarques


Le réglage tolérant est recommandé pour les consommateurs qui souhaitent ouvrir n'importe quelle police malgré les éventuelles insuffisances du [Font](../../font/). Les structures internes du [Font](../../font/) ne sont pas garanties d'être cohérentes. Le réglage strict est recommandé pour les consommateurs qui souhaitent ouvrir principalement des polices valides et solides.
## Voir aussi

* Enum [ParsingStrictness](../parsingstrictness/)
* Class [FontEnvironment](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
