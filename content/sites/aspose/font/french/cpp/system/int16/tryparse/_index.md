---
title: "System::Int16::TryParse méthode"
linktitle: "TryParse"
second_title: "Aspose.Font pour C++"
description: "Comment utiliser la méthode TryParse de la classe System::Int16 en C++."
type: docs
weight: 200
url: /fr/cpp/system/int16/tryparse/
---
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int16_t &result)
```

## Voir aussi

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int16_t &result)
```

## Voir aussi

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int16_t\&) method


Convertit la chaîne spécifiée contenant la représentation sous forme de chaîne d'un nombre en l'entier signé 16 bits équivalent en utilisant les informations de formatage fournies et le style de nombre.

```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int16_t &result)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | const String\& | La chaîne à convertir. |
| styles | Globalization::NumberStyles | Une combinaison bit à bit des valeurs de l'énumération NumberStyles qui spécifie le style autorisé de la représentation sous forme de chaîne d'un nombre. |
| fournisseur | const SharedPtr\<IFormatProvider\>\& | Un pointeur vers un objet qui contient les informations de format de chaîne. |
| résultat | int16_t\& | La référence à une variable entier signé 16 bits où le résultat de la conversion est placé. |

### ReturnValue

Vrai si la conversion a réussi, sinon - faux.

## Voir aussi

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int16_t &result)
```

## Voir aussi

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int16::TryParse(const String\&, int16_t\&) method


Convertit la chaîne spécifiée contenant la représentation sous forme de chaîne d'un nombre en l'entier signé 16 bits équivalent.

```cpp
static bool System::Int16::TryParse(const String &value, int16_t &result)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | const String\& | La chaîne à convertir. |
| résultat | int16_t\& | La référence à une variable entier signé 16 bits où le résultat de la conversion est placé. |

### ReturnValue

Vrai si la conversion a réussi, sinon - faux.

## Voir aussi

* Class [String](../../string/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
