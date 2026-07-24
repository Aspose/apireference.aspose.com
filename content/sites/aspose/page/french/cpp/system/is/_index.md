---
title: "Méthode System::Is"
linktitle: "Est"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Is. Fonction de correspondance de haut niveau. Applique un motif à une valeur en C++."
type: docs
weight: 21900
url: /fr/cpp/system/is/
---
## System::Is(const E\&, const A\&) method


Fonction de correspondance de haut niveau. Applique un motif à une valeur.

```cpp
template<typename A,typename E> std::enable_if_t<std::is_base_of<Details::Pattern, A>::value, bool> System::Is(const E &e, const A &a)
```


| Paramètre | Description |
| --- | --- |
| A | Type de motif (doit hériter de Details::Pattern). |
| E | Type de la valeur à faire correspondre. |

| Paramètre | Type | Description |
| --- | --- | --- |
| e | const E\& | Valeur à comparer. |
| a | const A\& | Motif à appliquer. |

### ReturnValue

true si le motif correspond à la valeur.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, const ConstantT\&) method


Implémente la traduction du motif constant 'is'.

```cpp
template<class ExpressionT,class ConstantT> std::enable_if_t<!std::is_base_of<Details::Pattern, ConstantT>::value, bool> System::Is(const ExpressionT &left, const ConstantT &constant)
```


| Paramètre | Description |
| --- | --- |
| ExpressionT | type d'expression gauche. |
| ConstantT | type d'expression constante. |

| Paramètre | Type | Description |
| --- | --- | --- |
| gauche | const ExpressionT\& | expression qui sera vérifiée. |
| constante | const ConstantT\& | expression qui sera comparée avec celle de gauche. |

### ReturnValue

vrai si la vérification du type réussit, faux sinon.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, ResultT\&) method


Implémente la traduction du motif de déclaration 'is'.

```cpp
template<class PatternT,class ExpressionT,class ResultT> bool System::Is(const ExpressionT &left, ResultT &result)
```


| Paramètre | Description |
| --- | --- |
| PatternT | type à vérifier. |
| ExpressionT | type d'expression gauche. |
| ResultT | type de l'expression de résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| gauche | const ExpressionT\& | expression qui sera vérifiée. |
| résultat | ResultT\& | variable qui sera assignée au type vérifié. |

### ReturnValue

vrai si la vérification du type réussit, faux sinon.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
