---
title: "metodo System::setter_decrement_wrap"
linktitle: "setter_decrement_wrap"
second_title: "Aspose.Font per C++"
description: "metodo System::setter_decrement_wrap. Il traduttore traduce le espressioni di pre‑decremento di C#''s che mirano alla proprietà dell'istanza'' con setter e getter definiti, in una chiamata a questa funzione (sovraccarico per getter const) in C++."
type: docs
weight: 37200
url: /it/cpp/system/setter_decrement_wrap/
---
## System::setter_decrement_wrap(Host *const, T(HostConstGet::*)() const, void(HostSet::*)(T)) method


Il traduttore traduce le espressioni di pre‑decremento di C#'s che mirano alla proprietà dell'istanza' con setter e getter definiti, in una chiamata a questa funzione (sovraccarico per getter const).

```cpp
template<typename T,typename Host,typename HostConstGet,typename HostSet> std::enable_if<std::is_base_of<HostConstGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_decrement_wrap(Host *const host, T(HostConstGet::*pGetter)() const, void(HostSet::*pSetter)(T))
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo della proprietà. |
| Host | - classe dell'istanza da modificare |
| HostConstGet | - L'host stesso, o il suo tipo base, dove è definito il getter della proprietà |
| HostSet | - L'host stesso, o il suo tipo base, dove è definito il setter della proprietà |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| host | Host *const | Istanza per la quale chiamare i getter e i setter. |
| pGetter | T(HostConstGet::*)() const | Puntatore a funzione che punta alla funzione getter della proprietà |
| pSetter | void(HostSet::*)(T) | Puntatore a funzione che punta alla funzione setter della proprietà |

### ReturnValue

Il valore della proprietà prima dell'incremento

## Vedi anche

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_decrement_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


Il traduttore traduce le espressioni di pre-decremento di C# che mirano alla proprietà dell'istanza con setter e getter definiti, in una chiamata a questa funzione (sovraccarico per getter non const).

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_decrement_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo della proprietà. |
| Host | - classe dell'istanza da modificare |
| HostGet | - L'host stesso, o il suo tipo base, dove è definito il getter della proprietà |
| HostSet | - L'host stesso, o il suo tipo base, dove è definito il setter della proprietà |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| host | Host *const | Istanza per la quale chiamare i getter e i setter. |
| pGetter | T(HostGet::*)() | Puntatore a funzione che punta alla funzione getter della proprietà |
| pSetter | void(HostSet::*)(T) | Puntatore a funzione che punta alla funzione setter della proprietà |

### ReturnValue

Il valore della proprietà prima dell'incremento

## Vedi anche

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_decrement_wrap(T(*)(), void(*)(T)) method


Il traduttore traduce le espressioni di pre-decremento di C# che mirano alla proprietà della classe con setter e getter definiti, in una chiamata a questa funzione.

```cpp
template<typename T> T System::setter_decrement_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo della proprietà |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| pGetter | T(*)() | Puntatore a funzione che punta alla funzione libera getter della proprietà |
| pSetter | void(*)(T) | Puntatore a funzione che punta alla funzione libera setter della proprietà |

### ReturnValue

Il valore della proprietà prima dell'incremento

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
