---
title: "Aspose::Font::TtfTables::TtfStatTable::AxisValueTableFlags énum"
linktitle: "AxisValueTableFlags"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::TtfTables::TtfStatTable::AxisValueTableFlags enum. Spécifie les indicateurs de la table de valeurs d'axe en C++."
type: docs
weight: 1200
url: /fr/cpp/aspose.font.ttftables/ttfstattable/axisvaluetableflags/
---
## AxisValueTableFlags enum


Spécifie les indicateurs de la table des valeurs d'axe.

```cpp
enum class AxisValueTableFlags : uint16_t
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| OlderSiblingFontAttribute | n/a | Si défini, cette table de valeurs d'axe fournit des informations de valeur d'axe applicables aux autres polices de la même famille de polices. Elle est utilisée si les autres polices ont été publiées plus tôt et n'incluaient pas d'informations sur les valeurs de certains axes. Si les versions plus récentes des autres polices incluent elles‑mêmes ces informations et sont présentes, alors cette table est ignorée. |
| ElidableAxisValueName | n/a | Si défini, il indique que la valeur d'axe représente la valeur « normale » de l'axe et peut être omise lors de la composition de chaînes de nom. |
| Réservé | n/a | Réservé pour une utilisation future. |

## Voir aussi

* Class [TtfStatTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
