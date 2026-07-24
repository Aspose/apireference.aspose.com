---
title: "Método System::Is"
linktitle: "Es"
second_title: "Aspose.Page para C++"
description: "Método System::Is. Función de coincidencia de nivel superior. Aplica un patrón a un valor en C++."
type: docs
weight: 21900
url: /es/cpp/system/is/
---
## System::Is(const E\&, const A\&) method


Función de coincidencia de nivel superior. Aplica un patrón a un valor.

```cpp
template<typename A,typename E> std::enable_if_t<std::is_base_of<Details::Pattern, A>::value, bool> System::Is(const E &e, const A &a)
```


| Parámetro | Descripción |
| --- | --- |
| A | Tipo de patrón (debe heredar de Details::Pattern). |
| E | Tipo del valor a coincidir. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| e | const E\& | Valor contra el cual coincidir. |
| a | const A\& | Patrón a aplicar. |

### ReturnValue

true si el patrón coincide con el valor.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, const ConstantT\&) method


Implementa la traducción del patrón constante 'is'.

```cpp
template<class ExpressionT,class ConstantT> std::enable_if_t<!std::is_base_of<Details::Pattern, ConstantT>::value, bool> System::Is(const ExpressionT &left, const ConstantT &constant)
```


| Parámetro | Descripción |
| --- | --- |
| ExpressionT | tipo de expresión izquierda. |
| ConstantT | tipo de expresión constante. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| izquierda | const ExpressionT\& | expresión que será verificada. |
| constante | const ConstantT\& | expresión que será comparada con la de la izquierda. |

### ReturnValue

true si la verificación de tipo es exitosa, false de lo contrario.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, ResultT\&) method


Implementa la traducción del patrón de declaración 'is'.

```cpp
template<class PatternT,class ExpressionT,class ResultT> bool System::Is(const ExpressionT &left, ResultT &result)
```


| Parámetro | Descripción |
| --- | --- |
| PatternT | tipo a comprobar. |
| ExpressionT | tipo de expresión izquierda. |
| ResultT | tipo de expresión de resultado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| izquierda | const ExpressionT\& | expresión que será verificada. |
| resultado | ResultT\& | variable que será asignada al tipo verificado. |

### ReturnValue

true si la verificación de tipo es exitosa, false de lo contrario.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
