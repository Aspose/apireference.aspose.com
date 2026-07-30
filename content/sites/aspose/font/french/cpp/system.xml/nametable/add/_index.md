---
title: "System::Xml::NameTable::Add méthode"
linktitle: "Add"
second_title: "Aspose.Font pour C++"
description: "System::Xml::NameTable::Add méthode. Atomise la chaîne spécifiée et l'ajoute à la NameTable en C++."
type: docs
weight: 200
url: /fr/cpp/system.xml/nametable/add/
---
## NameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Atomise la chaîne spécifiée et l'ajoute à la [NameTable](../).

```cpp
const String & System::Xml::NameTable::Add(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| clé | const ArrayPtr\<char16_t\>\& | Le tableau de caractères contenant la chaîne à ajouter. |
| début | int32_t | L'index basé sur zéro dans le tableau spécifiant le premier caractère de la chaîne. |
| len | int32_t | Le nombre de caractères dans la chaîne. |

### ReturnValue

La chaîne atomisée ou la chaîne existante si elle existe déjà dans la [NameTable](../). Si **len** vaut zéro, [String::Empty](../../../system/string/empty/) est retournée.

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## NameTable::Add(const String\&) method


Atomise la chaîne spécifiée et l'ajoute à la [NameTable](../).

```cpp
const String & System::Xml::NameTable::Add(const String &key) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| clé | const String\& | La chaîne à ajouter. |

### ReturnValue

La chaîne atomisée ou la chaîne existante si elle existe déjà dans la [NameTable](../).

## Voir aussi

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
