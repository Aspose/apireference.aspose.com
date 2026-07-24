---
title: "System::IterateOver methode"
linktitle: "ItereerOver"
second_title: "Aspose.Page voor C++"
description: "System::IterateOver methode. Deze functiereeigenschap wikkelt een enumerable (of iterable) object zodat het kan worden gebruikt met een range‑based for‑loop. Deze overload voor Enumerable met de standaard doeltype in C++."
type: docs
weight: 23100
url: /nl/cpp/system/iterateover/
---
## System::IterateOver(const Enumerable *) method


Deze functiereeigenschap wikkelt een enumerable (of iterable) object zodat het kan worden gebruikt met een range‑based for‑loop. Deze overload voor Enumerable met het standaard doeltype.

```cpp
template<typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, Details::ValueTypeOfEnumerable<Enumerable>, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| Parameter | Beschrijving |
| --- | --- |
| Enumerable | Het type van een gewikkeld object |

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(const Enumerable *) method


Deze functiereigenschap wikkelt een enumerable (of iterable) object zodat het kan worden gebruikt met een range‑based for‑loop. Deze overload voor Enumerable zonder begin(), end() methoden met doeltype‑argument voor (auto& value : IterateOver<SomeType>(enumerable))

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het doeltype, moet worden geretourneerd door de iterator |
| Enumerable | Het type van een gewikkeld object |

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Deze functiereigenschap wikkelt een enumerable (of iterable) object zodat het kan worden gebruikt met een range‑based for‑loop. Deze overload voor Enumerable zonder begin(), end() methoden met doeltype‑argument voor (auto& value : IterateOver<SomeType>(enumerable))

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het doeltype, moet worden geretourneerd door de iterator |
| Enumerable | Het type van een gewikkeld object |

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Deze functiereeigenschap wikkelt een enumerateerbaar (of iterabel) object zodat het kan worden gebruikt met een range-gebaseerde for-lus. Deze overload voor Enumerable zonder begin(), end() methoden met een standaard doeltype-argument voor (auto& value : IterateOver(enumerable)) analoog aan de volgende C#-code foreach (var value in enumerable)

```cpp
template<typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Beschrijving |
| --- | --- |
| Enumerable | Het type van een gewikkeld object |

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Deze functiereeigenschap wikkelt een enumerateerbaar (of iterabel) object zodat het kan worden gebruikt met een range-gebaseerde for-lus. Deze overload voor Enumerable met begin(), end() methoden met een standaard doeltype-argument voor (auto& value : IterateOver(enumerable))

```cpp
template<typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Beschrijving |
| --- | --- |
| Enumerable | Het type van een gewikkeld object |

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Deze functiereeigenschap wikkelt een enumerateerbaar (of iterabel) object zodat het kan worden gebruikt met een range-gebaseerde for-lus. Deze overload voor Enumerable met begin(), end() methoden waarbij het doeltype gelijk is aan het oorspronkelijke value_type van de iterator.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Beschrijving |
| --- | --- |
| Enumerable | Het type van een gewikkeld object |
| T | Het doeltype dat door de iterator moet worden geretourneerd |

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Deze functiereeigenschap wikkelt een enumerateerbaar (of iterabel) object zodat het kan worden gebruikt met een range-gebaseerde for-lus. Deze overload voor Enumerable met begin(), end() methoden met een ander doeltype en het oorspronkelijke value_type van de iterator.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&!std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, Details::CppIteratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Beschrijving |
| --- | --- |
| Enumerable | Het type van een gewikkeld object |
| T | Het doeltype dat door de iterator moet worden geretourneerd |

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
