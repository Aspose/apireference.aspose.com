---
title: "Método System::Equals< float, float >"
linktitle: "Igual< float, float >"
second_title: "Aspose.Page para C++"
description: "Método System::Equals< float, float >. Especialización para valores de punto flotante de precisión simple. Aunque dos NaN de punto flotante están definidos por IEC 60559:1989 para compararse siempre como desiguales, el contrato de System.Object.Equals requiere que las sobrescrituras cumplan los requisitos de un operador de equivalencia. Por lo tanto, System.Double.Equals y System.Single.Equals devuelven True al comparar dos NaN, mientras que el operador de igualdad devuelve False en ese caso, según lo exigido por el estándar en C++."
type: docs
weight: 18400
url: /es/cpp/system/equals_float,float_/
---
## System::Equals< float, float > method


Especialización para valores de punto flotante de precisión simple. Aunque dos NaN de punto flotante están definidos por IEC 60559:1989 para compararse siempre como desiguales, el contrato de [System.Object.Equals](../object/equals/) requiere que las sobrescrituras cumplan los requisitos de un operador de equivalencia. Por lo tanto, System.Double.Equals y System.Single.Equals devuelven True al comparar dos NaN, mientras que el operador de igualdad devuelve False en ese caso, según lo exigido por el estándar.

```cpp
bool System::Equals<float, float>(const float &a, const float &b)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| a | const float\& | El primer comparando |
| b | const float\& | El segundo comparando |

### ReturnValue

Verdadero si ambos valores son NaN o son iguales, de lo contrario - falso

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
