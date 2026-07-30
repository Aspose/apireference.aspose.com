---
title: "Méthode Aspose::Font::TtfTables::TtfHeadTable::get_CheckSumAdjustment"
linktitle: "get_CheckSumAdjustment"
second_title: "Aspose.Font pour C++"
description: "Méthode Aspose::Font::TtfTables::TtfHeadTable::get_CheckSumAdjustment. Obtient le uint32 checkSumAdjustment. Pour le calculer : le définir à 0, calculer la somme de contrôle pour la table ''head'' et la placer dans le répertoire des tables, additionner l’ensemble de la police en uint32, puis stocker B1B0AFBA - somme. La somme de contrôle pour la table ''head'' ne sera pas erronée. Cela est correct en C++."
type: docs
weight: 200
url: /fr/cpp/aspose.font.ttftables/ttfheadtable/get_checksumadjustment/
---
## TtfHeadTable::get_CheckSumAdjustment method


Obtient uint32 checkSumAdjustment. Pour calculer : le définir à 0, calculer la somme de contrôle pour la table 'head' et la placer dans le répertoire des tables, sommer l’ensemble de la police en uint32, puis stocker B1B0AFBA - somme. La somme de contrôle pour la table 'head' ne sera pas incorrecte. C’est correct.

```cpp
uint32_t Aspose::Font::TtfTables::TtfHeadTable::get_CheckSumAdjustment() const
```

## Voir aussi

* Class [TtfHeadTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
