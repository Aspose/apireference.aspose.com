---
title: "méthode System::Equals< float, float >"
linktitle: "Equals< float, float >"
second_title: "Aspose.Font pour C++"
description: "méthode System::Equals< float, float >. Spécialisation pour les valeurs à virgule flottante simple précision. Bien que deux NaN à virgule flottante soient définis par IEC 60559:1989 comme étant toujours différents, le contrat pour System.Object.Equals exige que les surcharges respectent les exigences d'un opérateur d'équivalence. Ainsi, System.Double.Equals et System.Single.Equals renvoient True lors de la comparaison de deux NaN, tandis que l'opérateur d'égalité renvoie False dans ce cas, comme l'exige la norme en C++."
type: docs
weight: 18500
url: /fr/cpp/system/equals_float,float_/
---
## System::Equals< float, float > method


Spécialisation pour les valeurs à virgule flottante simple précision. Bien que deux NaN à virgule flottante soient définis par IEC 60559:1989 comme étant toujours différents, le contrat pour [System.Object.Equals](../object/equals/), exige que les surcharges respectent les exigences d'un opérateur d'équivalence. Ainsi, System.Double.Equals et System.Single.Equals renvoient True lors de la comparaison de deux NaN, tandis que l'opérateur d'égalité renvoie False dans ce cas, comme l'exige la norme.

```cpp
bool System::Equals<float, float>(const float &a, const float &b)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| a | const float\& | Le premier comparande |
| b | const float\& | Le deuxième comparande |

### ReturnValue

True si les deux valeurs sont NaN ou égales, sinon - false

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
