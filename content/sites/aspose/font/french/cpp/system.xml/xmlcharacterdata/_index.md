---
title: "Classe System::Xml::XmlCharacterData"
linktitle: "XmlCharacterData"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlCharacterData. Fournit des méthodes de manipulation de texte utilisées par plusieurs classes en C++."
type: docs
weight: 900
url: /fr/cpp/system.xml/xmlcharacterdata/
---
## XmlCharacterData class


Fournit des méthodes de manipulation de texte utilisées par plusieurs classes.

```cpp
class XmlCharacterData : public System::Xml::XmlLinkedNode
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [AppendData](./appenddata/)(String) | Ajoute la chaîne spécifiée à la fin des données de caractères du nœud. |
| virtual [DeleteData](./deletedata/)(int32_t, int32_t) | Supprime une plage de caractères du nœud. |
| virtual [get_Data](./get_data/)() | Renvoie les données du nœud. |
| [get_InnerText](./get_innertext/)() override | Renvoie les valeurs concaténées du nœud et de tous ses enfants. |
| virtual [get_Length](./get_length/)() | Renvoie la longueur des données, en caractères. |
| [get_Value](./get_value/)() override | Renvoie la valeur du nœud. |
| virtual [InsertData](./insertdata/)(int32_t, String) | Insère la chaîne spécifiée à la position de caractère indiquée. |
| virtual [ReplaceData](./replacedata/)(int32_t, int32_t, String) | Remplace le nombre spécifié de caractères à partir de l'offset indiqué par la chaîne spécifiée. |
| virtual [set_Data](./set_data/)(String) | Définit les données du nœud. |
| [set_InnerText](./set_innertext/)(String) override | Définit les valeurs concaténées du nœud et de tous ses enfants. |
| [set_Value](./set_value/)(String) override | Définit la valeur du nœud. |
| virtual [Substring](./substring/)(int32_t, int32_t) | Récupère une sous-chaîne de la chaîne complète à partir de la plage spécifiée. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Voir aussi

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
