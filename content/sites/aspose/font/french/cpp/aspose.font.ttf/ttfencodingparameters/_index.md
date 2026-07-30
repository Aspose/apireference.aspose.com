---
title: "Classe Aspose::Font::Ttf::TtfEncodingParameters"
linktitle: "TtfEncodingParameters"
second_title: "Aspose.Font pour C++"
description: "Classe Aspose::Font::Ttf::TtfEncodingParameters. Représente les paramètres d’encodage TTF en C++."
type: docs
weight: 500
url: /fr/cpp/aspose.font.ttf/ttfencodingparameters/
---
## TtfEncodingParameters class


Représente les paramètres de codage TTF.

```cpp
class TtfEncodingParameters : public Aspose::Font::IEncodingParameters
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_PlatformId](./get_platformid/)() const | Obtient la valeur PlatformId. |
| [get_PlatformSpecificId](./get_platformspecificid/)() const | Obtient la valeur PlatformSpecificId. |
| [set_PlatformId](./set_platformid/)(uint16_t) | Définit la valeur PlatformId. |
| [set_PlatformSpecificId](./set_platformspecificid/)(uint16_t) | Définit la valeur PlatformSpecificId. |
| [TtfEncodingParameters](./ttfencodingparameters/)(uint16_t, uint16_t) | Initialise une nouvelle instance de la classe [TtfEncodingParameters](./). Prend l’identifiant de plateforme (Platform Id) et l’identifiant d’encodage spécifique à la plateforme comme paramètres. Ces paramètres sont utilisés pour demander une sous‑table CMap spéciale à partir de la table CMap principale de la police, voir la table « CMap », « name » dans la spécification du fichier OpenType [Font](../../aspose.font/font/). |
## Remarques


Doit être utilisé pour demander un encodage spécifique à partir d’une [Font](../../aspose.font/font/) TTF.
## Voir aussi

* Class [IEncodingParameters](../../aspose.font/iencodingparameters/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
