---
title: "Classe Aspose::Font::TtfTables::TtfStatTable"
linktitle: "TtfStatTable"
second_title: "Aspose.Font pour C++"
description: "Classe Aspose::Font::TtfTables::TtfStatTable. Représente la table des attributs de style (STAT) de la police OpenType en C++."
type: docs
weight: 1700
url: /fr/cpp/aspose.font.ttftables/ttfstattable/
---
## TtfStatTable class


Représente la table Style Attributes Table(STAT) de la police OpenType.

```cpp
class TtfStatTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [AxisRecord](./axisrecord/)
* Class [AxisValue](./axisvalue/)
* Class [AxisValueTableBase](./axisvaluetablebase/)
* Class [AxisValueTableFormat1](./axisvaluetableformat1/)
* Class [AxisValueTableFormat2](./axisvaluetableformat2/)
* Class [AxisValueTableFormat3](./axisvaluetableformat3/)
* Class [AxisValueTableFormat4](./axisvaluetableformat4/)
## Enums

| Énumération | Description |
| --- | --- |
| [AxisValueTableFlags](./axisvaluetableflags/) | Spécifie les indicateurs de la table des valeurs d'axe. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [AddAxisRecord](./addaxisrecord/)(System::SharedPtr\<TtfStatTable::AxisRecord\>) | Ajoute une structure Axis Record à la table. |
| [AddAxisValueTable](./addaxisvaluetable/)(System::SharedPtr\<TtfStatTable::AxisValueTableBase\>) | Ajoute une structure Axis Value Table à la table. |
| [ClearAxisRecords](./clearaxisrecords/)() | Supprime tous les enregistrements d'axe de la table. |
| [ClearAxisValueTables](./clearaxisvaluetables/)() | Supprime toutes les tables de valeurs d'axe de la table. |
| [get_AxisRecords](./get_axisrecords/)() | Renvoie le tableau des axes de conception. Le tableau d'axes est un tableau de structures de type Axis Record. Spec : l'enregistrement d'axe fournit des informations sur un seul axe de conception. |
| [get_AxisValueCount](./get_axisvaluecount/)() | Renvoie le nombre de tables de valeurs d'axe. |
| [get_AxisValueTables](./get_axisvaluetables/)() | Renvoie le tableau des Axis Value Tables. Spec : les Axis Value Tables fournissent des détails concernant une valeur d'attribut de style spécifique sur un axe de variation de conception particulier, ou une combinaison de valeurs d'axes de variation de conception, ainsi que la relation de ces valeurs avec les libellés utilisés comme éléments dans les noms de sous‑famille. |
| [get_DesignAxisCount](./get_designaxiscount/)() | Renvoie le nombre d'enregistrements d'axe. Spec : dans une police contenant une table 'fvar', cette valeur doit être supérieure ou égale à la valeur axisCount de la table 'fvar'. Dans toutes les polices, elle doit être supérieure à zéro si axisValueCount est supérieur à zéro. |
| [get_ElidedFallbackName](./get_elidedfallbackname/)() | Spec : Nom utilisé comme solution de secours lorsque la projection des noms dans un modèle de police particulier produit un nom de sous‑famille ne contenant que des éléments éligibles à l'ellipse. |
| [get_ElidedFallbackNameId](./get_elidedfallbacknameid/)() | Spec : ID de nom utilisé comme solution de secours lorsque la projection des noms dans un modèle de police particulier produit un nom de sous‑famille ne contenant que des éléments éligibles à l'ellipse. |
| static [get_Tag](./get_tag/)() | Obtient le tag de la table. |
## Voir aussi

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
