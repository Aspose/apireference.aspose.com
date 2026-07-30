---
title: "System::Xml::XmlNameTable::Add méthode"
linktitle: "Add"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlNameTable::Add méthode. Lorsqu'elle est remplacée dans une classe dérivée, elle atomise la chaîne spécifiée et l'ajoute à l'XmlNameTable en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml/xmlnametable/add/
---
## XmlNameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Lorsqu'elle est remplacée dans une classe dérivée, elle atomise la chaîne spécifiée et l'ajoute à la [XmlNameTable](../).

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tableau | const ArrayPtr\<char16_t\>\& | Le tableau de caractères contenant le nom à ajouter. |
| décalage | int32_t | Indice basé sur zéro dans le tableau spécifiant le premier caractère du nom. |
| longueur | int32_t | Le nombre de caractères dans le nom. |

### ReturnValue

La nouvelle chaîne atomisée ou celle existante si elle existe déjà. Si la longueur est zéro, [String::Empty](../../../system/string/empty/) est renvoyée.

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNameTable::Add(const String\&) method


Lorsqu'elle est remplacée dans une classe dérivée, elle atomise la chaîne spécifiée et l'ajoute à la [XmlNameTable](../).

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const String &array)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tableau | const String\& | Le nom à ajouter. |

### ReturnValue

La nouvelle chaîne atomisée ou celle existante si elle existe déjà.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
