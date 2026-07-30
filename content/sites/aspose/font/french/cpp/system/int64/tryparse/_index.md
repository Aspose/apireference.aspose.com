---
title: "Méthode System::Int64::TryParse"
linktitle: "TryParse"
second_title: "Aspose.Font pour C++"
description: "Comment utiliser la méthode TryParse de la classe System::Int64 en C++."
type: docs
weight: 200
url: /fr/cpp/system/int64/tryparse/
---
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int64_t &result)
```

## Voir aussi

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int64_t &result)
```

## Voir aussi

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int64_t\&) method


Convertit la chaîne spécifiée contenant la représentation textuelle d'un nombre en l'entier signé 64 bits équivalent en utilisant les informations de formatage fournies et le style numérique.

```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int64_t &result)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | const String\& | La chaîne à convertir. |
| styles | Globalization::NumberStyles | Une combinaison bit à bit des valeurs de l'énumération NumberStyles qui spécifie le style autorisé de la représentation sous forme de chaîne d'un nombre. |
| fournisseur | const SharedPtr\<IFormatProvider\>\& | Un pointeur vers un objet qui contient les informations de format de chaîne. |
| résultat | int64_t\& | La référence à une variable d’entier signé 64 bits où le résultat de la conversion est placé. |

### ReturnValue

Vrai si la conversion a réussi, sinon - faux.

## Voir aussi

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int64_t &result)
```

## Voir aussi

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int64::TryParse(const String\&, int64_t\&) method


Convertit la chaîne spécifiée contenant la représentation textuelle d'un nombre en l'entier signé 64 bits équivalent.

```cpp
static bool System::Int64::TryParse(const String &value, int64_t &result)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | const String\& | La chaîne à convertir. |
| résultat | int64_t\& | La référence à une variable d’entier signé 64 bits où le résultat de la conversion est placé. |

### ReturnValue

Vrai si la conversion a réussi, sinon - faux.

## Voir aussi

* Class [String](../../string/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
