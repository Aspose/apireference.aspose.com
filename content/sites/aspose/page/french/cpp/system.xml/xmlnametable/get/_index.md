---
title: "Méthode System::Xml::XmlNameTable::Get"
linktitle: "Obtenir"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Xml::XmlNameTable::Get. Lorsqu'elle est remplacée dans une classe dérivée, récupère la chaîne atomisée contenant les mêmes caractères que la plage spécifiée de caractères dans le tableau donné en C++."
type: docs
weight: 200
url: /fr/cpp/system.xml/xmlnametable/get/
---
## XmlNameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Lorsqu'elle est remplacée dans une classe dérivée, obtient la chaîne atomisée contenant les mêmes caractères que la plage de caractères spécifiée dans le tableau donné.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tableau | const ArrayPtr\<char16_t\>\& | Le tableau de caractères contenant le nom à rechercher. |
| offset | int32_t | L'indice basé sur zéro dans le tableau spécifiant le premier caractère du nom. |
| length | int32_t | Le nombre de caractères dans le nom. |

### ReturnValue

La chaîne atomisée ou **nullptr** si la chaîne n'a pas encore été atomisée. Si **length** est zéro, [String::Empty](../../../system/string/empty/) est retournée.

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNameTable::Get(const String\&) method


Lorsqu'elle est remplacée dans une classe dérivée, obtient la chaîne atomisée contenant la même valeur que la chaîne spécifiée.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const String &array)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tableau | const String\& | Le nom à rechercher. |

### ReturnValue

La chaîne atomisée ou **nullptr** si la chaîne n'a pas déjà été atomisée.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
