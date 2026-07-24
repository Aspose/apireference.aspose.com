---
title: "Aspose::Page::Metered classe"
linktitle: "Mesuré"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::Metered classe. Fournit des méthodes pour définir la clé mesurée en C++."
type: docs
weight: 1400
url: /fr/cpp/aspose.page/metered/
---
## Metered class


Fournit des méthodes pour définir la clé mesurée.

```cpp
class Metered : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [GetConsumptionCredit](./getconsumptioncredit/)() | Obtient le crédit de consommation. |
| static [GetConsumptionQuantity](./getconsumptionquantity/)() | Obtient la taille du fichier de consommation. |
| [Metered](./metered/)() | Initialise une nouvelle instance de cette classe. |
| [SetMeteredKey](./setmeteredkey/)(System::String, System::String) | Définit la clé publique et privée mesurée. Si vous achetez une licence mesurée, au démarrage de l'application, cette API doit être appelée, normalement cela suffit. Cependant, si le téléchargement des données de consommation échoue constamment et dépasse 24 heures, la licence sera mise en statut d'évaluation ; pour éviter ce cas, vous devez vérifier régulièrement le statut de la licence, et si elle est en statut d'évaluation, appeler à nouveau cette API. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
