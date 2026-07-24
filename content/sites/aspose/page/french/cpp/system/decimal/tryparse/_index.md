---
title: "Méthode System::Decimal::TryParse"
linktitle: "TryParse"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Decimal::TryParse. Convertit la chaîne spécifiée contenant la représentation sous forme de chaîne d’un nombre en la valeur Decimal équivalente en C++."
type: docs
weight: 5800
url: /fr/cpp/system/decimal/tryparse/
---
## Decimal::TryParse(const String\&, Decimal\&) method


Convertit la chaîne spécifiée contenant la représentation sous forme de chaîne d’un nombre en la valeur [Decimal](../) équivalente.

```cpp
static bool System::Decimal::TryParse(const String &value, Decimal &result)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| value | const String\& | La chaîne à convertir |
| result | Decimal\& | La référence à une variable [Decimal](../) où le résultat de la conversion est placé |

### ReturnValue

Vrai si la conversion a réussi, sinon - false

## Voir aussi

* Class [String](../../string/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) method


Convertit la chaîne spécifiée contenant la représentation sous forme de chaîne d’un nombre en la valeur [Decimal](../) équivalente en utilisant les informations de formatage fournies et le style de nombre.

```cpp
static bool System::Decimal::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, Decimal &result)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| value | const String\& | La chaîne à convertir |
| styles | Globalization::NumberStyles | Une combinaison binaire des valeurs de l’énumération NumberStyles qui spécifie le style autorisé de la représentation sous forme de chaîne d’un nombre |
| fournisseur | const SharedPtr\<IFormatProvider\>\& | Un pointeur vers un objet contenant les informations de format de chaîne |
| résultat | Decimal\& | Un argument de sortie ; contient le résultat de la conversion |

### ReturnValue

Vrai si la conversion a réussi, sinon - false

## Voir aussi

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
