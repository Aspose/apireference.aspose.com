---
title: "Méthode System::Byte::TryParse"
linktitle: "TryParse"
second_title: "Aspose.Font pour C++"
description: "Comment utiliser la méthode TryParse de la classe System::Byte en C++?"
type: docs
weight: 200
url: /fr/cpp/system/byte/tryparse/
---
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, uint8_t &result)
```

## Voir aussi

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, uint8_t &result)
```

## Voir aussi

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, uint8_t\&) method


Convertit la chaîne spécifiée contenant la représentation sous forme de chaîne d'un nombre en l'entier non signé équivalent de 8 bits en utilisant les informations de formatage fournies et le style numérique.

```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, uint8_t &result)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | const String\& | La chaîne à convertir. |
| styles | Globalization::NumberStyles | Une combinaison bit à bit des valeurs de l'énumération NumberStyles qui spécifie le style autorisé de la représentation sous forme de chaîne d'un nombre. |
| fournisseur | const SharedPtr\<IFormatProvider\>\& | Un pointeur vers un objet qui contient les informations de format de chaîne. |
| résultat | uint8_t\& | La référence à une variable entier non signé de 8 bits où le résultat de la conversion est placé. |

### ReturnValue

Vrai si la conversion a réussi, sinon - faux.

## Voir aussi

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, uint8_t &result)
```

## Voir aussi

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::TryParse(const String\&, uint8_t\&) method


Convertit la chaîne spécifiée contenant la représentation sous forme de chaîne d'un nombre en l'entier non signé équivalent de 8 bits.

```cpp
static bool System::Byte::TryParse(const String &value, uint8_t &result)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | const String\& | La chaîne à convertir. |
| résultat | uint8_t\& | La référence à une variable entier non signé de 8 bits où le résultat de la conversion est placé. |

### ReturnValue

Vrai si la conversion a réussi, sinon - faux.

## Voir aussi

* Class [String](../../string/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
