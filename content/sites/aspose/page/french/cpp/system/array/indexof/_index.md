---
title: "System::Array::IndexOf méthode"
linktitle: "IndexOf"
second_title: "Aspose.Page pour C++"
description: "System::Array::IndexOf méthode. Détermine l'index de la première occurrence de l'élément spécifié dans le tableau en C++."
type: docs
weight: 2900
url: /fr/cpp/system/array/indexof/
---
## Array::IndexOf(const T\&) const method


Détermine l'index de la première occurrence de l'élément spécifié dans le tableau.

```cpp
virtual int System::Array<T>::IndexOf(const T &item) const override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| item | const T\& | Indice de l'élément dont l'indice doit être déterminé |

### ReturnValue

Indice de la première occurrence de l'élément spécifié si l'élément est trouvé, sinon -1

## Voir aussi

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


Détermine l'index de la première occurrence de l'élément spécifié dans le tableau.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value)
```


| Paramètre | Description |
| --- | --- |
| ArrayType | Type des éléments dans le tableau cible |
| ValueType | type de l'élément à rechercher dans le tableau |

| Paramètre | Type | Description |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) pour rechercher l'élément spécifié |
| value | const ValueType\& | Indice de l'élément dont l'indice doit être déterminé |

### ReturnValue

Indice de la première occurrence de l'élément spécifié si l'élément est trouvé, sinon -1

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


Détermine l'index de la première occurrence de l'élément spécifié dans le tableau en commençant à l'index spécifié.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex)
```


| Paramètre | Description |
| --- | --- |
| ArrayType | Type des éléments dans le tableau cible |
| ValueType | type de l'élément à rechercher dans le tableau |

| Paramètre | Type | Description |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) pour rechercher l'élément spécifié |
| value | const ValueType\& | Indice de l'élément dont l'indice doit être déterminé |
| startIndex | int | Indice à partir duquel la recherche commence |

### ReturnValue

Indice de la première occurrence de l'élément spécifié si l'élément est trouvé, sinon -1

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


Détermine l'index de la première occurrence de l'élément spécifié dans une plage d'éléments du tableau définie par l'index de départ et le nombre d'éléments dans la plage.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
```


| Paramètre | Description |
| --- | --- |
| ArrayType | Type des éléments dans le tableau cible |
| ValueType | type de l'élément à rechercher dans le tableau |

| Paramètre | Type | Description |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) pour rechercher l'élément spécifié |
| value | const ValueType\& | Indice de l'élément dont l'indice doit être déterminé |
| startIndex | int | Indice à partir duquel la recherche commence |
| count | int | Nombre d'éléments de la plage dans laquelle rechercher |

### ReturnValue

Indice de la première occurrence de l'élément spécifié si l'élément est trouvé, sinon -1

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
