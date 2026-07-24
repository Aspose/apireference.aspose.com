---
title: "System::IterateOver method"
linktitle: "ÜzerindeDöngü"
second_title: "Aspose.Page için C++"
description: "System::IterateOver yöntemi. Bu işlev özelliği, enumerable (veya iterable) nesneyi sarmalar, böylece aralık tabanlı for döngüsüyle kullanılabilir. Bu, C++'da varsayılan hedef türüyle Enumerable için bir aşırı yüklemedir."
type: docs
weight: 23100
url: /tr/cpp/system/iterateover/
---
## System::IterateOver(const Enumerable *) method


Bu işlev özelliği, enumerable (veya iterable) nesneyi sarmalar, böylece aralık tabanlı for döngüsüyle kullanılabilir. Bu, Enumerable için varsayılan hedef türüyle bir aşırı yüklemedir.

```cpp
template<typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, Details::ValueTypeOfEnumerable<Enumerable>, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| Parameter | Açıklama |
| --- | --- |
| Enumerable | Sarmalanmış bir nesnenin türü |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(const Enumerable *) method


Bu işlev özelliği, enumerable (veya iterable) nesneyi sarmalar, böylece aralık tabanlı for döngüsüyle kullanılabilir. Bu, begin(), end() yöntemleri olmayan Enumerable için hedef tür argümanıyla (auto& value : IterateOver<SomeType>(enumerable)) şeklinde bir aşırı yüklemedir.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| Parameter | Açıklama |
| --- | --- |
| T | Hedef tür, yineleyiciden döndürülmesi gerekir |
| Enumerable | Sarmalanmış bir nesnenin türü |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Bu işlev özelliği, enumerable (veya iterable) nesneyi sarmalar, böylece aralık tabanlı for döngüsüyle kullanılabilir. Bu, begin(), end() yöntemleri olmayan Enumerable için hedef tür argümanıyla (auto& value : IterateOver<SomeType>(enumerable)) şeklinde bir aşırı yüklemedir.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Açıklama |
| --- | --- |
| T | Hedef tür, yineleyiciden döndürülmesi gerekir |
| Enumerable | Sarmalanmış bir nesnenin türü |

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Bu işlev özelliği, enumerable (veya iterable) nesneyi sarmalar, böylece aralık tabanlı for döngüsüyle kullanılabilir. Bu, begin(), end() yöntemleri olmayan Enumerable için varsayılan hedef türü argümanıyla (auto& value : IterateOver(enumerable)) şeklinde bir aşırı yüklemedir ve aşağıdaki C# koduna benzer: foreach (var value in enumerable)

```cpp
template<typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Açıklama |
| --- | --- |
| Enumerable | Sarmalanmış bir nesnenin türü |

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Bu işlev özelliği, enumerable (veya iterable) nesneyi sarmalar, böylece aralık tabanlı for döngüsüyle kullanılabilir. Bu, begin(), end() yöntemleri olan Enumerable için varsayılan hedef türü argümanıyla (auto& value : IterateOver(enumerable)) şeklinde bir aşırı yüklemedir.

```cpp
template<typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Açıklama |
| --- | --- |
| Enumerable | Sarmalanmış bir nesnenin türü |

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Bu işlev özelliği, enumerable (veya iterable) nesneyi sarmalar, böylece aralık tabanlı for döngüsüyle kullanılabilir. Bu, begin(), end() yöntemleri olan Enumerable için hedef türü, yineleyicinin orijinal value_type'ı ile aynı olan bir aşırı yüklemedir.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Açıklama |
| --- | --- |
| Enumerable | Sarmalanmış bir nesnenin türü |
| T | Yineleyiciden döndürülmesi gereken hedef tür. |

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Bu işlev özelliği, enumerable (veya iterable) nesneyi sarmalar, böylece aralık tabanlı for döngüsüyle kullanılabilir. Bu, begin(), end() yöntemleri olan Enumerable için farklı bir hedef tür ve yineleyicinin orijinal value_type'ı ile bir aşırı yüklemedir.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&!std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, Details::CppIteratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Açıklama |
| --- | --- |
| Enumerable | Sarmalanmış bir nesnenin türü |
| T | Yineleyiciden döndürülmesi gereken hedef tür. |

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
