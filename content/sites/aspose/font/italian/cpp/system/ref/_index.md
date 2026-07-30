---
title: "System::Ref metodo"
linktitle: "Ref"
second_title: "Aspose.Font per C++"
description: "System::Ref metodo. Wrapper per garantire che Ref(std::ref(DynamicWeakPtr)) funzioni in C++."
type: docs
weight: 36700
url: /it/cpp/system/ref/
---
## System::Ref(const std::reference_wrapper\<T\>\&) method


Wrapper per garantire che Ref(std::ref(DynamicWeakPtr)) funzioni.

```cpp
template<typename T> decltype(Ref(std::declval<T &>())) System::Ref(const std::reference_wrapper<T> &wrapper)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo referenziato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| wrapper | const std::reference_wrapper\<T\>\& | wrapper std per svelare. |

### ReturnValue

Tipo di riferimento definito in [System](../):: piuttosto che in std.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Ref(DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\&) method


Crea un riferimento all'oggetto [DynamicWeakPtr](../dynamicweakptr/). Utilizzato dal traduttore quando si passano argomenti di funzione per riferimento.

```cpp
template<typename T,SmartPtrMode,unsigned int ...> DynamicWeakPtr<T, trunkMode, weakLeafs...>::Reference System::Ref(DynamicWeakPtr<T, trunkMode, weakLeafs...> &ptr)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo puntato. |
| trunkMode | Modalità del puntatore intelligente stesso. |
| weakLeafs | Indici degli argomenti del modello per i quali deve essere chiamato il metodo SetTemplateWeakPtr. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| ptr | DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\& | Puntatore intelligente per creare un riferimento a. |

### ReturnValue

Riferimento al puntatore intelligente.

## Vedi anche

* Class [DynamicWeakPtr](../dynamicweakptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Ref(T\&) method


Funzione di supporto per acquisire riferimenti a oggetti. Utilizzata per garantire che [System::DynamicWeakPtr](../dynamicweakptr/) aggiorni l'oggetto referenziato dopo le assegnazioni.

```cpp
template<typename T> T & System::Ref(T &value)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo per creare un riferimento a. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | T\& | Valore per creare un riferimento a. |

### ReturnValue

Riferimento al valore passato a questa funzione.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
