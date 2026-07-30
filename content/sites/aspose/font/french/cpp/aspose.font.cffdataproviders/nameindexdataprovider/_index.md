---
title: "Classe Aspose::Font::CffDataProviders::NameIndexDataProvider"
linktitle: "NameIndexDataProvider"
second_title: "Aspose.Font pour C++"
description: "Classe Aspose::Font::CffDataProviders::NameIndexDataProvider. Déclare la fonctionnalité d'accès à la structure CFF Name INDEX en C++."
type: docs
weight: 500
url: /fr/cpp/aspose.font.cffdataproviders/nameindexdataprovider/
---
## NameIndexDataProvider class


Déclare la fonctionnalité d'accès à la structure INDEX Name de CFF.

```cpp
class NameIndexDataProvider : public Aspose::Font::CffDataProviders::ICffIndexDataProvider
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [AddName](./addname/)(System::String) | Ajoute un nom de police à la structure Name INDEX. Utilisez cette méthode avec prudence car chaque nom de police dans la structure CFF Name INDEX doit avoir une structure DICT correspondante dans l'index Top DICT selon la spécification CFF. |
| virtual [get_Count](./get_count/)() | Le nombre d'objets dans la structure CFF INDEX. |
| virtual [GetName](./getname/)(int32_t) | Obtient le nom de la police à l'index spécifié. |
| virtual [GetRawBytes](./getrawbytes/)() | Obtient tous les octets de la structure CFF INDEX. |
| virtual [idx_get](./idx_get/)(int32_t) | Obtient/definit le nom de la police à l'index spécifié. |
| virtual [idx_set](./idx_set/)(int32_t, System::String) | Obtient/definit le nom de la police à l'index spécifié. |
| virtual [RemoveName](./removename/)(int32_t) | Supprime le nom à l'index spécifié. Utilisez cette méthode avec prudence car chaque nom de police dans la structure CFF Name INDEX doit avoir une structure DICT correspondante dans l'index Top DICT selon la spécification CFF. |
| virtual [SetName](./setname/)(System::String, int32_t) | Définit le nom de la police à l'index spécifié. |
## Voir aussi

* Class [ICffIndexDataProvider](../icffindexdataprovider/)
* Namespace [Aspose::Font::CffDataProviders](../)
* Library [Aspose.Font for C++](../../)
