---
title: "Método System::IterateOver"
linktitle: "IterarSobre"
second_title: "Aspose.Page para C++"
description: "Método System::IterateOver. Esta propiedad de función envuelve un objeto enumerable (o iterable) para que pueda usarse con un bucle for basado en rangos. Esta sobrecarga para Enumerable this con tipo de destino predeterminado en C++."
type: docs
weight: 23100
url: /es/cpp/system/iterateover/
---
## System::IterateOver(const Enumerable *) method


Esta propiedad de función envuelve un objeto enumerable (o iterable) para que pueda ser usado con un bucle for basado en rangos Esta sobrecarga para Enumerable this con tipo de destino predeterminado.

```cpp
template<typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, Details::ValueTypeOfEnumerable<Enumerable>, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| Parámetro | Descripción |
| --- | --- |
| Enumerable | El tipo de un objeto envuelto |

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(const Enumerable *) method


This function property wraps enumerable (or iterable) object so it can be used with range-based for loop This overload for Enumerable without begin(), end() methods with target type argument for (auto& value : IterateOver<SomeType>(enumerable))

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| Parámetro | Descripción |
| --- | --- |
| T | The target type, it has to be returned from iterator |
| Enumerable | El tipo de un objeto envuelto |

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


This function property wraps enumerable (or iterable) object so it can be used with range-based for loop This overload for Enumerable without begin(), end() methods with target type argument for (auto& value : IterateOver<SomeType>(enumerable))

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parámetro | Descripción |
| --- | --- |
| T | The target type, it has to be returned from iterator |
| Enumerable | El tipo de un objeto envuelto |

## Ver también

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


This function property wraps enumerable (or iterable) object so it can be used with range-based for loop This overload for Enumerable without begin(), end() methods with default target type argument for (auto& value : IterateOver(enumerable)) analog to the following C# code foreach (var value in enumerable)

```cpp
template<typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parámetro | Descripción |
| --- | --- |
| Enumerable | El tipo de un objeto envuelto |

## Ver también

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Esta propiedad de función envuelve un objeto enumerable (o iterable) para que pueda usarse con un bucle for basado en rangos. Esta sobrecarga para Enumerable con los métodos begin(), end() utiliza el argumento de tipo de destino predeterminado para (auto& value : IterateOver(enumerable))

```cpp
template<typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parámetro | Descripción |
| --- | --- |
| Enumerable | El tipo de un objeto envuelto |

## Ver también

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Esta propiedad de función envuelve un objeto enumerable (o iterable) para que pueda usarse con un bucle for basado en rangos. Esta sobrecarga para Enumerable con los métodos begin(), end() utiliza un tipo de destino igual al value_type original del iterador.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parámetro | Descripción |
| --- | --- |
| Enumerable | El tipo de un objeto envuelto |
| T | El tipo de destino que debe devolverse del iterador |

## Ver también

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Esta propiedad de función envuelve un objeto enumerable (o iterable) para que pueda usarse con un bucle for basado en rangos. Esta sobrecarga para Enumerable con los métodos begin(), end() utiliza un tipo de destino diferente y el value_type original del iterador.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&!std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, Details::CppIteratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parámetro | Descripción |
| --- | --- |
| Enumerable | El tipo de un objeto envuelto |
| T | El tipo de destino que debe devolverse del iterador |

## Ver también

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
