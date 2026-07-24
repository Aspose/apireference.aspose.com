---
title: "Método System::Collections::Generic::operator=="
linktitle: "operator=="
second_title: "Aspose.Page para C++"
description: "Método System::Collections::Generic::operator==. Compara dos pares clave-valor usando la semántica de ''equals''. Utiliza el operador == o el método EqualsTo para ambas claves y valores, según esté definido en C++."
type: docs
weight: 5600
url: /es/cpp/system.collections.generic/operator==/
---
## System::Collections::Generic::operator== method


Compara dos pares clave-valor usando la semántica de 'equals'. Utiliza el operador == o el método EqualsTo para ambas claves y valores, según esté definido.

```cpp
template<typename TKey,typename TValue> bool System::Collections::Generic::operator==(const KeyValuePair<TKey, TValue> &left, const KeyValuePair<TKey, TValue> &right)
```


| Parámetro | Descripción |
| --- | --- |
| TKey | Tipo de clave. |
| TValue | Tipo de valor. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| izquierda | const KeyValuePair\<TKey, TValue\>\& | Operando LHS. |
| derecha | const KeyValuePair\<TKey, TValue\>\& | Operando RHS. |

### ReturnValue

Verdadero si ambas claves y valores coinciden, falso en caso contrario.

## Ver también

* Class [KeyValuePair](../keyvaluepair/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
