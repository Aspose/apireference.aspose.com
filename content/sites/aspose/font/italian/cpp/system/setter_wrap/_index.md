---
title: "Metodo System::setter_wrap"
linktitle: "setter_wrap"
second_title: "Aspose.Font per C++"
description: "Metodo System::setter_wrap. Sovraccarico per funzioni setter di istanza con conversione di tipo in C++."
type: docs
weight: 38300
url: /it/cpp/system/setter_wrap/
---
## System::setter_wrap(Host *const, void(HostSet::*)(T2), T) method


Sovraccarico per funzioni setter di istanza con conversione di tipo.

```cpp
template<typename T,typename T2,typename Host,typename HostSet> std::enable_if<std::is_base_of<HostSet, Host>::value, T>::type System::setter_wrap(Host *const host, void(HostSet::*pSetter)(T2), T value)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo valore. |
| T2 | Tipo atteso dalla funzione setter. |
| Host | Tipo di istanza. |
| HostSet | - L'host stesso, o il suo tipo base, dove è definito il setter della proprietà. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| host | Host *const | [Object](../object/) per chiamare la funzione setter per. |
| pSetter | void(HostSet::*)(T2) | Riferimento alla funzione setter. |
| valore | T | Valore da impostare. |

### ReturnValue

imposta valore.

## Vedi anche

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_wrap(void(*)(T2), T) method


Sovraccarico per funzioni setter statiche con conversione di tipo.

```cpp
template<typename T,typename T2> T System::setter_wrap(void(*pSetter)(T2), T value)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo valore. |
| T2 | Tipo atteso dalla funzione setter. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| pSetter | void(*)(T2) | Riferimento alla funzione setter statica. |
| valore | T | Valore da impostare. |

### ReturnValue

imposta valore.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
