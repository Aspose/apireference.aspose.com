---
title: "System::SmartPtr::SmartPtr costruttore"
linktitle: "SmartPtr"
second_title: "Aspose.Font per C++"
description: "System::SmartPtr::SmartPtr costruttore. Converte il tipo dell'array referenziato creando un nuovo array di tipo diverso. Utile se in C# c'è un cast di tipo di array non supportato in C++."
type: docs
weight: 100
url: /it/cpp/system/smartptr/smartptr/
---
## SmartPtr::SmartPtr(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) constructor


Converte il tipo dell'array referenziato creando un nuovo array di tipo diverso. Utile se in C# esiste un cast di tipo array non supportato in C++.

```cpp
template<typename Y> System::SmartPtr<T>::SmartPtr(const SmartPtr<Array<Y>> &src, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parametro | Descrizione |
| --- | --- |
| Y | Tipo dell'array sorgente. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| src | const SmartPtr\<Array\<Y\>\>\& | Puntatore all'array di cui creare una copia, ma con tipo di elementi diverso. |
| mode | SmartPtrMode | Modalità puntatore. |

## Vedi anche

* Class [SmartPtr](../)
* Class [Array](../../array/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) constructor


Costruisce un [SmartPtr](../) che condivide le informazioni di proprietà con il valore iniziale di ptr, ma contiene un puntatore p non correlato e non gestito.

```cpp
template<typename P> System::SmartPtr<T>::SmartPtr(const SmartPtr<P> &ptr, Pointee_ *p, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| ptr | const SmartPtr\<P\>\& | Un altro smart pointer per condividere la proprietà con quella di. |
| p | Pointee_ * | Puntatore a un oggetto da gestire. |
| mode | SmartPtrMode | Modalità puntatore. |

## Vedi anche

* Class [SmartPtr](../)
* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<Q\>\&, SmartPtrMode) constructor


Costruisce una copia dell'oggetto [SmartPtr](../). Entrambi i puntatori puntano allo stesso oggetto successivamente. Esegue la conversione di tipo se consentita.

```cpp
template<class Q,typename> System::SmartPtr<T>::SmartPtr(const SmartPtr<Q> &x, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parametro | Descrizione |
| --- | --- |
| Q | Tipo dell'oggetto puntato da x. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | const SmartPtr\\<Q\\>\\& | Puntatore da copiare. |
| mode | SmartPtrMode | Modalità puntatore. |

## Vedi anche

* Class [SmartPtr](../)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr_\&, SmartPtrMode) constructor


Costruisce una copia dell'oggetto [SmartPtr](../). Entrambi i puntatori puntano allo stesso oggetto successivamente.

```cpp
System::SmartPtr<T>::SmartPtr(const SmartPtr_ &ptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| ptr | const SmartPtr_\\& | Puntatore da copiare. |
| mode | SmartPtrMode | Modalità puntatore. |

## Vedi anche

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const Y\&) constructor


Inizializza un array vuoto. Usato per tradurre alcune costruzioni di codice C#.

```cpp
template<typename Y,typename> System::SmartPtr<T>::SmartPtr(const Y &)
```


| Parametro | Descrizione |
| --- | --- |
| Y | Segnaposto del tipo EmptyArrayInitializer. |

## Vedi anche

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(Pointee_ *, SmartPtrMode) constructor


Crea un [SmartPtr](../) che punta all'oggetto specificato, o converte un puntatore grezzo in [SmartPtr](../).

```cpp
System::SmartPtr<T>::SmartPtr(Pointee_ *object, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| oggetto | Pointee_ * | Pointee. |
| mode | SmartPtrMode | Modalità puntatore. |

## Vedi anche

* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(SmartPtr_\&&, SmartPtrMode) constructor


Costruisce tramite spostamento l'oggetto [SmartPtr](../). Effettivamente, scambia due puntatori, se entrambi sono della stessa modalità. x potrebbe diventare inutilizzabile dopo la chiamata.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtr_ &&x, SmartPtrMode mode=SmartPtrMode::Shared) noexcept
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | SmartPtr_\&& | Puntatore da spostare. |
| mode | SmartPtrMode | Modalità puntatore. |

## Vedi anche

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(SmartPtrMode) constructor


Crea un oggetto [SmartPtr](../) della modalità richiesta.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtrMode mode)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| mode | SmartPtrMode | Modalità puntatore. |

## Vedi anche

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(std::nullptr_t, SmartPtrMode) constructor


Crea un oggetto [SmartPtr](../) null-pointer della modalità richiesta.

```cpp
System::SmartPtr<T>::SmartPtr(std::nullptr_t=nullptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| mode | std::nullptr_t | Modalità puntatore. |

## Vedi anche

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
