---
title: "Metodo System::Is"
linktitle: "È"
second_title: "Aspose.Font per C++"
description: "Metodo System::Is. Funzione di corrispondenza di livello superiore. Applica un modello a un valore in C++."
type: docs
weight: 22000
url: /it/cpp/system/is/
---
## System::Is(const E\&, const A\&) method


Funzione di corrispondenza di livello superiore. Applica un modello a un valore.

```cpp
template<typename A,typename E> std::enable_if_t<std::is_base_of<Details::Pattern, A>::value, bool> System::Is(const E &e, const A &a)
```


| Parametro | Descrizione |
| --- | --- |
| A | Tipo di modello (deve ereditare da Details::Pattern). |
| E | Tipo del valore da confrontare. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| e | const E\& | Valore contro cui confrontare. |
| a | const A\& | Modello da applicare. |

### ReturnValue

vero se il modello corrisponde al valore.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Is(const ExpressionT\&, const ConstantT\&) method


Implementa la traduzione del modello costante 'is'.

```cpp
template<class ExpressionT,class ConstantT> std::enable_if_t<!std::is_base_of<Details::Pattern, ConstantT>::value, bool> System::Is(const ExpressionT &left, const ConstantT &constant)
```


| Parametro | Descrizione |
| --- | --- |
| ExpressionT | tipo di espressione sinistra. |
| ConstantT | tipo di espressione costante. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| sinistra | const ExpressionT\& | espressione che sarà verificata. |
| costante | const ConstantT\& | espressione che sarà confrontata con quella di sinistra. |

### ReturnValue

vero se il controllo del tipo ha esito positivo, falso altrimenti.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Is(const ExpressionT\&, ResultT\&) method


Implementa la traduzione del modello di dichiarazione 'is'.

```cpp
template<class PatternT,class ExpressionT,class ResultT> bool System::Is(const ExpressionT &left, ResultT &result)
```


| Parametro | Descrizione |
| --- | --- |
| PatternT | tipo da verificare. |
| ExpressionT | tipo di espressione sinistra. |
| ResultT | tipo dell'espressione risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| sinistra | const ExpressionT\& | espressione che sarà verificata. |
| risultato | ResultT\& | variabile a cui verrà assegnato il tipo controllato. |

### ReturnValue

vero se il controllo del tipo ha esito positivo, falso altrimenti.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
