---
title: "Méthode System::EnumValuesBase::Parse"
linktitle: "Analyser"
second_title: "Aspose.Page pour C++"
description: "Méthode System::EnumValuesBase::Parse. Retourne un objet qui représente la valeur d'une constante d'énumération du type d'énumération spécifié avec le nom spécifié en C++."
type: docs
weight: 400
url: /fr/cpp/system/enumvaluesbase/parse/
---
## EnumValuesBase::Parse method


Renvoie un objet qui représente la valeur d'une constante d'énumération du type d'énumération spécifié avec le nom spécifié.

```cpp
static SharedPtr<Object> System::EnumValuesBase::Parse(const TypeInfo &type, const String &str, bool ignoreCase)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| type | const TypeInfo\& | L'objet [TypeInfo](../../typeinfo/) représentant le type de la valeur d'énumération à retourner |
| str | const String\& | Le nom de la constante d'énumération |
| ignoreCase | bool | Spécifie si la casse doit être ignorée lors de l'interprétation du nom de la constante d'énumération |

### ReturnValue

Un objet qui représente la valeur de la constante d'énumération dont le nom est spécifié dans **str**.

## Voir aussi

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [EnumValuesBase](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
