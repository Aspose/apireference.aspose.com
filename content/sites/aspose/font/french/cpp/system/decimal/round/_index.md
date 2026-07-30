---
title: "méthode System::Decimal::Round"
linktitle: "Arrondi"
second_title: "Aspose.Font pour C++"
description: "méthode System::Decimal::Round. Arrondit la valeur spécifiée au nombre le plus proche avec le nombre spécifié de chiffres fractionnels. Un paramètre spécifie le comportement de la fonction si la valeur spécifiée est également proche de deux nombres les plus proches en C++."
type: docs
weight: 4400
url: /fr/cpp/system/decimal/round/
---
## Decimal::Round(const Decimal\&, int, MidpointRounding) method


Arrondit la valeur spécifiée à la valeur la plus proche avec le nombre spécifié de chiffres fractionnels. Un paramètre indique le comportement de la fonction si la valeur spécifiée est également proche de deux valeurs les plus proches.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, int digits, MidpointRounding mode=MidpointRounding::ToEven)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| d | const Decimal\& | La valeur à arrondir |
| chiffres | int | Le nombre de chiffres fractionnels dans la valeur arrondie |
| mode | MidpointRounding | Spécifie comment effectuer l'arrondi si **value** est également proche de deux nombres les plus proches. |

### ReturnValue

Le nombre avec le nombre spécifié de chiffres le plus proche de **value**

## Voir aussi

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Decimal::Round(const Decimal\&, MidpointRounding) method


Arrondit la valeur spécifiée au nombre entier le plus proche. Un paramètre indique le comportement de la fonction si la valeur spécifiée est également proche de deux nombres les plus proches.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, MidpointRounding mode=MidpointRounding::ToEven)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| d | const Decimal\& | La valeur à arrondir |
| mode | MidpointRounding | Spécifie comment effectuer l'arrondi si **value** est également proche de deux nombres les plus proches. |

### ReturnValue

**d** rounded to the nearest integral value

## Voir aussi

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
