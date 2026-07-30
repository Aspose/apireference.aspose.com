---
title: "System::Get méthode"
linktitle: "Get"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Get. Fonction pour obtenir le N-ième élément du tuple donné. Surcharge pour l'objet de base en C++."
type: docs
weight: 20800
url: /fr/cpp/system/get/
---
## System::Get(const SharedPtr\<Object\>\&) method


Fonction pour obtenir le N-ième élément du tuple donné. Surcharge pour l'objet de base.

```cpp
template<std::size_t> auto System::Get(const SharedPtr<Object> &object)
```


| Paramètre | Description |
| --- | --- |
| N | indice de l'élément. |

| Paramètre | Type | Description |
| --- | --- | --- |
| objet | const SharedPtr\<Object\>\& | objet à inspecter. |

### ReturnValue

valeur du N-ième élément du tuple convertie en objet.

## Voir aussi

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Get(const SharedPtr\<T\>\&) method


Fonction pour obtenir le N-ième élément du tuple donné. Surcharge pour les pointeurs partagés.

```cpp
template<std::size_t,typename T> auto System::Get(const SharedPtr<T> &pointer)
```


| Paramètre | Description |
| --- | --- |
| N | indice de l'élément. |
| T | type de l'objet inspecté. |

| Paramètre | Type | Description |
| --- | --- | --- |
| objet | const SharedPtr\<T\>\& | objet à inspecter. |

### ReturnValue

valeur du N-ième élément du tuple.

## Voir aussi

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Get(const T\&) method


Fonction pour obtenir le N-ième élément du tuple donné. Surcharge pour les objets avec la méthode Deconstruct.

```cpp
template<std::size_t,typename T> auto System::Get(const T &object)
```


| Paramètre | Description |
| --- | --- |
| N | indice de l'élément. |
| T | type de l'objet inspecté. |

| Paramètre | Type | Description |
| --- | --- | --- |
| objet | const T\& | objet à inspecter. |

### ReturnValue

valeur du N-ième élément du tuple.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Get(const ValueTuple\<Args...\>\&) method


Obtient le N-ième élément du tuple de valeurs.

```cpp
template<std::size_t,typename...> auto System::Get(const ValueTuple<Args...> &tuple)
```


| Paramètre | Description |
| --- | --- |
| N | indice de l'élément. |
| Args | éléments du tuple. |

| Paramètre | Type | Description |
| --- | --- | --- |
| tuple | const ValueTuple\<Args...\>\& | tuple dont on veut obtenir l'élément. |

### ReturnValue

valeur du N-ième élément du tuple.

## Voir aussi

* Class [ValueTuple](../valuetuple/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
