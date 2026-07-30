---
title: "Méthode System::setter_wrap"
linktitle: "setter_wrap"
second_title: "Aspose.Font pour C++"
description: "Méthode System::setter_wrap. Surcharge pour les fonctions setter d'instance avec conversion de type en C++."
type: docs
weight: 38300
url: /fr/cpp/system/setter_wrap/
---
## System::setter_wrap(Host *const, void(HostSet::*)(T2), T) method


Surcharge pour les fonctions setter d'instance avec conversion de type.

```cpp
template<typename T,typename T2,typename Host,typename HostSet> std::enable_if<std::is_base_of<HostSet, Host>::value, T>::type System::setter_wrap(Host *const host, void(HostSet::*pSetter)(T2), T value)
```


| Paramètre | Description |
| --- | --- |
| T | Type valeur. |
| T2 | Type attendu par la fonction setter. |
| Host | Type d'instance. |
| HostSet | - L'hôte lui-même, ou son type de base, où le setter de la propriété est défini. |

| Paramètre | Type | Description |
| --- | --- | --- |
| host | Host *const | [Object](../object/) pour appeler la fonction setter. |
| pSetter | void(HostSet::*)(T2) | Référence de la fonction setter. |
| valeur | T | Valeur à définir. |

### ReturnValue

définir la valeur.

## Voir aussi

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_wrap(void(*)(T2), T) method


Surcharge pour les fonctions setter statiques avec conversion de type.

```cpp
template<typename T,typename T2> T System::setter_wrap(void(*pSetter)(T2), T value)
```


| Paramètre | Description |
| --- | --- |
| T | Type valeur. |
| T2 | Type attendu par la fonction setter. |

| Paramètre | Type | Description |
| --- | --- | --- |
| pSetter | void(*)(T2) | Référence de la fonction setter statique. |
| valeur | T | Valeur à définir. |

### ReturnValue

définir la valeur.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
