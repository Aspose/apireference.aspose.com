---
title: "System::setter_increment_wrap metodo"
linktitle: "setter_increment_wrap"
second_title: "Aspose.Page per C++"
description: "System::setter_increment_wrap metodo. Il traduttore traduce le espressioni di incremento di C#''s che mirano alla proprietà della classe'' che ha setter e getter definiti, in un'invocazione di questa funzione in C++."
type: docs
weight: 37400
url: /it/cpp/system/setter_increment_wrap/
---
## System::setter_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


Il traduttore traduce le espressioni di incremento di C#'s che mirano alla proprietà della classe' che ha setter e getter definiti, in un'invocazione di questa funzione.

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo della proprietà |
| Host | - classe dell'istanza da modificare |
| HostGet | - L'host stesso, o il suo tipo base, dove è definito il getter della proprietà |
| HostSet | - L'host stesso, o il suo tipo base, dove è definito il setter della proprietà |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| host | Host *const | Un puntatore a un oggetto la cui proprietà deve essere incrementata |
| pGetter | T(HostGet::*)() | Puntatore a funzione che punta al metodo getter della proprietà |
| pSetter | void(HostSet::*)(T) | Puntatore a funzione che punta al metodo setter della proprietà |

### ReturnValue

Il valore incrementato della proprietà

## Vedi anche

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_increment_wrap(T(*)(), void(*)(T)) method


Il traduttore traduce le espressioni di incremento di C#'s che mirano alla proprietà della classe' che ha setter e getter definiti, in un'invocazione di questa funzione.

```cpp
template<typename T> T System::setter_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo della proprietà |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| pGetter | T(*)() | Puntatore a funzione che punta alla funzione libera getter della proprietà |
| pSetter | void(*)(T) | Puntatore a funzione che punta alla funzione libera setter della proprietà |

### ReturnValue

Il valore incrementato della proprietà

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
