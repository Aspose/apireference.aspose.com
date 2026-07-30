---
title: "Aspose::Font::TtfTables::TtfCMapTable classe"
linktitle: "TtfCMapTable"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::TtfTables::TtfCMapTable classe. Représente la table \"cmap\" du fichier de police TTF en C++."
type: docs
weight: 200
url: /fr/cpp/aspose.font.ttftables/ttfcmaptable/
---
## TtfCMapTable class


Représente la table "cmap" du fichier [Font](../../aspose.font/font/) TTF.

```cpp
class TtfCMapTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [TtfCMapSubtableDescription](./ttfcmapsubtabledescription/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [FindUnicodeTable](./findunicodetable/)() | Recherche et renvoie la CMap unicode. si une CMap ucs-4 existe - la renvoie en premier ; sinon - renvoie toute CMap unicode qu'elle peut trouver. |
| static [get_Tag](./get_tag/)() | Obtient le tag de la table. |
| [GetAllSubtables](./getallsubtables/)() | Renvoie toutes les sous‑tables de la table CMap. |
| [GetPlatformTables](./getplatformtables/)(uint16_t, uint16_t) | Renvoie les sous‑tables CMap pour planformId et platformSpecificId. |
## Voir aussi

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
