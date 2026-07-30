---
title: "System::IterateOver yöntemi"
linktitle: "IterateOver"
second_title: "Aspose.Font için C++"
description: "System::IterateOver yöntemi. Bu işlev özelliği, enumerable (veya iterable) nesneyi, aralık tabanlı for döngüsüyle kullanılabilecek şekilde sarar. Bu aşırı yükleme, C++'da varsayılan hedef tip ile Enumerable için geçerlidir."
type: docs
weight: 23200
url: /tr/cpp/system/iterateover/
---
## System::IterateOver(const Enumerable *) method


Bu işlev özelliği, enumerable (veya iterable) nesneyi, aralık tabanlı for döngüsüyle kullanılabilecek şekilde sarar. Bu aşırı yükleme, varsayılan hedef tip ile Enumerable için geçerlidir.

```cpp
template<typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, Details::ValueTypeOfEnumerable<Enumerable>, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| Parametre | Açıklama |
| --- | --- |
| Enumerable | Sarılan nesnenin tipi |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(const Enumerable *) method


Bu işlev özelliği, enumerable (veya iterable) nesneyi, aralık tabanlı for döngüsüyle kullanılabilecek şekilde sarar. Bu aşırı yükleme, begin(), end() yöntemleri olmadan Enumerable için hedef tip argümanı ile (auto& value : IterateOver<SomeType>(enumerable)) şeklinde kullanılır.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef tip, yineleyiciden döndürülmesi gerekir |
| Enumerable | Sarılan nesnenin tipi |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Bu işlev özelliği, enumerable (veya iterable) nesneyi, aralık tabanlı for döngüsüyle kullanılabilecek şekilde sarar. Bu aşırı yükleme, begin(), end() yöntemleri olmadan Enumerable için hedef tip argümanı ile (auto& value : IterateOver<SomeType>(enumerable)) şeklinde kullanılır.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef tip, yineleyiciden döndürülmesi gerekir |
| Enumerable | Sarılan nesnenin tipi |

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Bu işlev özelliği, enumerable (veya iterable) nesneyi, aralık tabanlı for döngüsüyle kullanılabilecek şekilde sarar. Bu aşırı yükleme, begin(), end() yöntemleri olmadan Enumerable için varsayılan hedef tip argümanı ile (auto& value : IterateOver(enumerable)) şeklinde kullanılır; aşağıdaki C# koduna benzer: foreach (var value in enumerable)

```cpp
template<typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parametre | Açıklama |
| --- | --- |
| Enumerable | Sarılan nesnenin tipi |

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Bu işlev özelliği, enumerable (veya iterable) nesneyi, aralık tabanlı for döngüsüyle kullanılabilecek şekilde sarar. Bu aşırı yükleme, begin(), end() yöntemleriyle Enumerable için varsayılan hedef tip argümanı ile (auto& value : IterateOver(enumerable)) şeklinde kullanılır.

```cpp
template<typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parametre | Açıklama |
| --- | --- |
| Enumerable | Sarılan nesnenin tipi |

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Bu işlev özelliği, enumerable (veya iterable) nesneyi, aralık tabanlı for döngüsüyle kullanılabilecek şekilde sarar. Bu aşırı yükleme, begin(), end() yöntemleriyle Enumerable için hedef tip, yineleyicinin orijinal value_type'ı ile aynı olacak şekilde.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parametre | Açıklama |
| --- | --- |
| Enumerable | Sarılan nesnenin tipi |
| T | Hedef tip, yineleyiciden döndürülmesi gerekir |

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Bu işlev özelliği, enumerable (veya iterable) nesneyi, aralık tabanlı for döngüsüyle kullanılabilecek şekilde sarar. Bu aşırı yükleme, begin(), end() yöntemleriyle Enumerable için farklı bir hedef tip ve yineleyicinin orijinal value_type'ı ile birlikte.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&!std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, Details::CppIteratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parametre | Açıklama |
| --- | --- |
| Enumerable | Sarılan nesnenin tipi |
| T | Hedef tip, yineleyiciden döndürülmesi gerekir |

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
