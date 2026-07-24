---
title: "System::IterateOver-Methode"
linktitle: "IteriereÜber"
second_title: "Aspose.Page für C++"
description: "System::IterateOver-Methode. Diese Funktions-Eigenschaft umschließt ein enumerable (oder iterable) Objekt, sodass es mit einer range-based for-Schleife verwendet werden kann. Diese Überladung für Enumerable mit Standard-Zieltyp in C++."
type: docs
weight: 23100
url: /de/cpp/system/iterateover/
---
## System::IterateOver(const Enumerable *) method


Diese Funktions-Eigenschaft umschließt ein enumerable (oder iterable) Objekt, sodass es mit einer range-based for-Schleife verwendet werden kann. Diese Überladung für Enumerable mit Standard-Zieltyp.

```cpp
template<typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, Details::ValueTypeOfEnumerable<Enumerable>, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| Parameter | Beschreibung |
| --- | --- |
| Enumerable | Der Typ eines umschlossenen Objekts |

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(const Enumerable *) method


Diese Funktions-Eigenschaft umschließt ein enumerable (oder iterable) Objekt, sodass es mit einer range-based for-Schleife verwendet werden kann. Diese Überladung für Enumerable ohne begin()- und end()-Methoden mit Zieltyp-Argument für (auto& value : IterateOver<SomeType>(enumerable))

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Zieltyp, der vom Iterator zurückgegeben werden muss |
| Enumerable | Der Typ eines umschlossenen Objekts |

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Diese Funktions-Eigenschaft umschließt ein enumerable (oder iterable) Objekt, sodass es mit einer range-based for-Schleife verwendet werden kann. Diese Überladung für Enumerable ohne begin()- und end()-Methoden mit Zieltyp-Argument für (auto& value : IterateOver<SomeType>(enumerable))

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Zieltyp, der vom Iterator zurückgegeben werden muss |
| Enumerable | Der Typ eines umschlossenen Objekts |

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Diese Funktions-Eigenschaft umschließt ein enumerable (oder iterable) Objekt, sodass es mit einer range-based for-Schleife verwendet werden kann. Diese Überladung für Enumerable ohne begin()- und end()-Methoden mit Standard-Zieltyp-Argument für (auto& value : IterateOver(enumerable)) analog zu folgendem C#-Code foreach (var value in enumerable)

```cpp
template<typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Beschreibung |
| --- | --- |
| Enumerable | Der Typ eines umschlossenen Objekts |

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Diese Funktions-Eigenschaft umschließt ein enumerable (oder iterable) Objekt, sodass es mit einer range-based for-Schleife verwendet werden kann. Diese Überladung für Enumerable mit begin()- und end()-Methoden mit Standard-Zieltyp-Argument für (auto& value : IterateOver(enumerable))

```cpp
template<typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Beschreibung |
| --- | --- |
| Enumerable | Der Typ eines umschlossenen Objekts |

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Diese Funktions-Eigenschaft umschließt ein enumerable (oder iterable) Objekt, sodass es mit einer range-based for-Schleife verwendet werden kann. Diese Überladung für Enumerable mit begin()- und end()-Methoden, wobei der Zieltyp dem ursprünglichen value_type des Iterators entspricht.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Beschreibung |
| --- | --- |
| Enumerable | Der Typ eines umschlossenen Objekts |
| T | Der Zieltyp, der vom Iterator zurückgegeben werden muss |

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Diese Funktions-Eigenschaft umschließt ein enumerable (oder iterable) Objekt, sodass es mit einer range-based for-Schleife verwendet werden kann. Diese Überladung für Enumerable mit begin()- und end()-Methoden mit unterschiedlichem Zieltyp und ursprünglichem value_type des Iterators.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&!std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, Details::CppIteratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Beschreibung |
| --- | --- |
| Enumerable | Der Typ eines umschlossenen Objekts |
| T | Der Zieltyp, der vom Iterator zurückgegeben werden muss |

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
