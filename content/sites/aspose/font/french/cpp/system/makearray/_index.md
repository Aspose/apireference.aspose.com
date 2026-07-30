---
title: "méthode System::MakeArray"
linktitle: "CréerTableau"
second_title: "Aspose.Font pour C++"
description: "Méthode System::MakeArray. Une fonction de fabrique qui construit un nouvel objet Array en transmettant les arguments spécifiés à son constructeur en C++."
type: docs
weight: 24100
url: /fr/cpp/system/makearray/
---
## System::MakeArray(Args\&&...) method


Une fonction de fabrique qui construit un nouvel objet [Array](../array/) en transmettant les arguments spécifiés à son constructeur.

```cpp
template<class T,class...> ArrayPtr<T> System::MakeArray(Args &&... args)
```


| Paramètre | Description |
| --- | --- |
| T | Le type des éléments de l'objet [Array](../array/) que la fonction construit |

| Paramètre | Type | Description |
| --- | --- | --- |
| args | Args\&&... | Les arguments qui sont passés au constructeur de l'objet [Array](../array/) en cours de construction |

### ReturnValue

Un pointeur intelligent pointant vers l'objet [Array](../array/) construit

## Voir aussi

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::MakeArray(Integral, Args\&&...) method


Une fonction de fabrique qui construit un nouvel objet [Array](../array/) en transmettant les arguments spécifiés à son constructeur.

```cpp
template<class T,class Integral,class...> std::enable_if<std::is_integral<Integral>::value, ArrayPtr<T>>::type System::MakeArray(Integral size, Args &&... args)
```


| Paramètre | Description |
| --- | --- |
| T | Le type des éléments de l'objet [Array](../array/) que la fonction construit |
| Entier | Type de la taille du tableau. |

| Paramètre | Type | Description |
| --- | --- | --- |
| taille | Entier | Taille du tableau en cours de création. |
| args | Args\&&... | Les arguments qui sont passés au constructeur de l'objet [Array](../array/) en cours de construction |

### ReturnValue

Un pointeur intelligent pointant vers l'objet [Array](../array/) construit

## Voir aussi

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::MakeArray(std::initializer_list\<T\>) method


Une fonction de fabrique qui construit un nouvel objet [Array](../array/), le remplit avec les éléments de la liste d'initialisation spécifiée et renvoie un pointeur intelligent pointant vers l'objet [Array](../array/).

```cpp
template<typename T> ArrayPtr<T> System::MakeArray(std::initializer_list<T> init)
```


| Paramètre | Description |
| --- | --- |
| T | Le type des éléments de l'objet [Array](../array/) que la fonction construit |

| Paramètre | Type | Description |
| --- | --- | --- |
| init | std::initializer_list\<T\> | La liste d'initialisation contenant les éléments avec lesquels remplir le tableau |

### ReturnValue

Un pointeur intelligent pointant vers l'objet [Array](../array/) construit

## Voir aussi

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
