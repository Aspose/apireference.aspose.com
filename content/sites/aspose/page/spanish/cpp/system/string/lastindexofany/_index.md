---
title: "System::String::LastIndexOfAny method"
linktitle: "LastIndexOfAny"
second_title: "Aspose.Page para C++"
description: "System::String::LastIndexOfAny method. Busca cualquiera de los caracteres pasados a lo largo de toda la cadena de forma inversa. Compara el último carácter de la cadena con todos los caracteres en anyOf, luego compara el anterior y así sucesivamente. Devuelve el índice de la primera coincidencia encontrada en C++."
type: docs
weight: 2500
url: /es/cpp/system/string/lastindexofany/
---
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&) const method


Busca cualquiera de los caracteres pasados en toda la cadena de forma inversa. Compara el último carácter de la cadena con todos los caracteres de anyOf, luego compara el anterior y así sucesivamente. Devuelve el índice de la primera coincidencia encontrada.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) de caracteres a buscar. El orden no importa. |

### ReturnValue

Índice del último carácter coincidente o -1 si no se encuentra.

## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


Busca cualquiera de los caracteres pasados en la subcadena de forma inversa. Compara el último carácter de la cadena con todos los caracteres de anyOf, luego compara el anterior y así sucesivamente. Devuelve el índice de la primera coincidencia encontrada.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) de caracteres a buscar. El orden no importa. |
| startindex | int32_t | Índice desde el cual iniciar la búsqueda. |

### ReturnValue

Índice del último carácter coincidente o -1 si no se encuentra.

## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


Busca cualquiera de los caracteres pasados en la subcadena de forma inversa. Compara el último carácter de la cadena con todos los caracteres de anyOf, luego compara el anterior y así sucesivamente. Devuelve el índice de la primera coincidencia encontrada.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) de caracteres a buscar. El orden no importa. |
| startindex | int32_t | Índice desde el cual iniciar la búsqueda. |
| count | int32_t | Número de caracteres a examinar. |

### ReturnValue

Índice del último carácter coincidente o -1 si no se encuentra.

## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
