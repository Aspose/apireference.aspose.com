---
title: "Méthode System::setter_post_decrement_wrap"
linktitle: "setter_post_decrement_wrap"
second_title: "Aspose.Font pour C++"
description: "Méthode System::setter_post_decrement_wrap. Le traducteur traduit les expressions post‑décrément de C# ciblant la propriété d'une instance qui possède un setter et un getter définis, en appel de cette fonction (surcharge pour le getter const) en C++."
type: docs
weight: 37700
url: /fr/cpp/system/setter_post_decrement_wrap/
---
## System::setter_post_decrement_wrap(Host *const, T(HostConstGet::*)() const, void(HostSet::*)(T)) method


Le traducteur traduit les expressions post‑décrément de C# ciblant la propriété d'une instance qui possède un setter et un getter définis, en appel de cette fonction (surcharge pour le getter const).

```cpp
template<typename T,typename Host,typename HostConstGet,typename HostSet> std::enable_if<std::is_base_of<HostConstGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_post_decrement_wrap(Host *const host, T(HostConstGet::*pGetter)() const, void(HostSet::*pSetter)(T))
```


| Paramètre | Description |
| --- | --- |
| T | Le type de la propriété. |
| Host | - classe de l’instance à modifier |
| HostConstGet | - L'hôte lui‑même, ou son type de base, où le getter de la propriété est défini |
| HostSet | - L'hôte lui‑même, ou son type de base, où le setter de la propriété est défini |

| Paramètre | Type | Description |
| --- | --- | --- |
| hôte | Host *const | Instance pour appeler les getters et setters. |
| pGetter | T(HostConstGet::*)() const | Pointeur de fonction pointant vers la fonction getter de la propriété |
| pSetter | void(HostSet::*)(T) | Pointeur de fonction pointant vers la fonction setter de la propriété |

### ReturnValue

La valeur de la propriété avant l'incrémentation

## Voir aussi

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_post_decrement_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


Le traducteur traduit les expressions post‑décrément de C# ciblant la propriété d'une instance qui possède un setter et un getter définis, en appel de cette fonction (surcharge pour le getter non‑const).

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_post_decrement_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Paramètre | Description |
| --- | --- |
| T | Le type de la propriété. |
| Host | - classe de l’instance à modifier |
| HostGet | - L'hôte lui‑même, ou son type de base, où le getter de la propriété est défini |
| HostSet | - L'hôte lui‑même, ou son type de base, où le setter de la propriété est défini |

| Paramètre | Type | Description |
| --- | --- | --- |
| hôte | Host *const | Instance pour appeler les getters et setters. |
| pGetter | T(HostGet::*)() | Pointeur de fonction pointant vers la fonction getter de la propriété |
| pSetter | void(HostSet::*)(T) | Pointeur de fonction pointant vers la fonction setter de la propriété |

### ReturnValue

La valeur de la propriété avant l'incrémentation

## Voir aussi

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_post_decrement_wrap(T(*)(), void(*)(T)) method


Le traducteur traduit les expressions post‑décrément de C# ciblant la propriété d'une classe qui possède un setter et un getter définis, en appel de cette fonction.

```cpp
template<typename T> T System::setter_post_decrement_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Paramètre | Description |
| --- | --- |
| T | Le type de la propriété |

| Paramètre | Type | Description |
| --- | --- | --- |
| pGetter | T(*)() | Pointeur de fonction pointant vers la fonction libre getter de la propriété |
| pSetter | void(*)(T) | Pointeur de fonction pointant vers la fonction libre setter de la propriété |

### ReturnValue

La valeur de la propriété avant l'incrémentation

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
