---
title: "System::IterateOver method"
linktitle: "IteraSu"
second_title: "Aspose.Page per C++"
description: "System::IterateOver method. Questa proprietà di funzione avvolge un oggetto enumerable (o iterable) in modo che possa essere utilizzato con il ciclo for basato su intervalli. Questa sovraccarico per Enumerable con tipo di destinazione predefinito in C++."
type: docs
weight: 23100
url: /it/cpp/system/iterateover/
---
## System::IterateOver(const Enumerable *) method


Questa proprietà di funzione avvolge un oggetto enumerable (o iterable) in modo che possa essere utilizzato con il ciclo for basato su intervalli. Questa sovraccarico per Enumerable con tipo di destinazione predefinito.

```cpp
template<typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, Details::ValueTypeOfEnumerable<Enumerable>, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| Parametro | Descrizione |
| --- | --- |
| Enumerable | Il tipo di un oggetto avvolto |

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(const Enumerable *) method


Questa proprietà di funzione avvolge un oggetto enumerable (o iterable) in modo che possa essere utilizzato con il ciclo for basato su intervalli. Questa sovraccarico per Enumerable senza metodi begin(), end() con argomento di tipo di destinazione per (auto& value : IterateOver<SomeType>(enumerable))

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo di destinazione, deve essere restituito dall'iteratore |
| Enumerable | Il tipo di un oggetto avvolto |

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Questa proprietà di funzione avvolge un oggetto enumerable (o iterable) in modo che possa essere utilizzato con il ciclo for basato su intervalli. Questa sovraccarico per Enumerable senza metodi begin(), end() con argomento di tipo di destinazione per (auto& value : IterateOver<SomeType>(enumerable))

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo di destinazione, deve essere restituito dall'iteratore |
| Enumerable | Il tipo di un oggetto avvolto |

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Questa proprietà di funzione avvolge un oggetto enumerable (o iterable) in modo che possa essere utilizzato con il ciclo for basato su intervalli. Questa sovraccarico per Enumerable senza metodi begin(), end() con tipo di destinazione predefinito per (auto& value : IterateOver(enumerable)) analogamente al seguente codice C# foreach (var value in enumerable)

```cpp
template<typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parametro | Descrizione |
| --- | --- |
| Enumerable | Il tipo di un oggetto avvolto |

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Questa proprietà di funzione avvolge un oggetto enumerable (o iterable) in modo che possa essere utilizzato con il ciclo for basato su intervalli. Questa sovraccarico per Enumerable con metodi begin(), end() con tipo di destinazione predefinito per (auto& value : IterateOver(enumerable))

```cpp
template<typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parametro | Descrizione |
| --- | --- |
| Enumerable | Il tipo di un oggetto avvolto |

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Questa proprietà di funzione avvolge un oggetto enumerable (o iterable) in modo che possa essere utilizzato con il ciclo for basato su intervalli. Questa sovraccarico per Enumerable con metodi begin(), end() con tipo di destinazione uguale al value_type originale dell'iteratore.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parametro | Descrizione |
| --- | --- |
| Enumerable | Il tipo di un oggetto avvolto |
| T | Il tipo di destinazione che deve essere restituito dall'iteratore |

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Questa proprietà di funzione avvolge un oggetto enumerable (o iterable) in modo che possa essere utilizzato con il ciclo for basato su intervalli. Questa sovraccarico per Enumerable con metodi begin(), end() con tipo di destinazione diverso e value_type originale dell'iteratore.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&!std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, Details::CppIteratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parametro | Descrizione |
| --- | --- |
| Enumerable | Il tipo di un oggetto avvolto |
| T | Il tipo di destinazione che deve essere restituito dall'iteratore |

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
