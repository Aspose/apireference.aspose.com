---
title: "System::Xml::NameTable::Get méthode"
linktitle: "Get"
second_title: "Aspose.Font pour C++"
description: "System::Xml::NameTable::Get méthode. Retourne la chaîne atomisée contenant les mêmes caractères que la plage spécifiée de caractères dans le tableau donné en C++."
type: docs
weight: 300
url: /fr/cpp/system.xml/nametable/get/
---
## NameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Retourne la chaîne atomisée contenant les mêmes caractères que la plage spécifiée de caractères dans le tableau fourni.

```cpp
const String & System::Xml::NameTable::Get(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| clé | const ArrayPtr\<char16_t\>\& | Le tableau de caractères contenant le nom à rechercher. |
| début | int32_t | L'index basé sur zéro dans le tableau indiquant le premier caractère du nom. |
| len | int32_t | Le nombre de caractères dans le nom. |

### ReturnValue

La chaîne atomisée ou **nullptr** si la chaîne n'a pas encore été atomisée. Si **len** vaut zéro, [String::Empty](../../../system/string/empty/) est retournée.

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## NameTable::Get(const String\&) method


Retourne la chaîne atomisée avec la valeur spécifiée.

```cpp
const String & System::Xml::NameTable::Get(const String &value) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | const String\& | Le nom à rechercher. |

### ReturnValue

L'objet chaîne atomisée ou **nullptr** si la chaîne n'a pas encore été atomisée.

## Voir aussi

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
