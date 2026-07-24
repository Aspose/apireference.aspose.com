---
title: "System::IterateOver 메서드"
linktitle: "반복_대상"
second_title: "C++용 Aspose.Page"
description: "System::IterateOver 메서드. 이 함수 속성은 enumerable(또는 iterable) 객체를 래핑하여 range-based for 루프에서 사용할 수 있게 합니다. C++에서 기본 대상 타입을 가진 Enumerable에 대한 이 오버로드."
type: docs
weight: 23100
url: /ko/cpp/system/iterateover/
---
## System::IterateOver(const Enumerable *) method


이 함수 속성은 enumerable(또는 iterable) 객체를 래핑하여 range-based for 루프에서 사용할 수 있게 합니다. 기본 대상 타입을 가진 Enumerable에 대한 이 오버로드.

```cpp
template<typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, Details::ValueTypeOfEnumerable<Enumerable>, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| 매개변수 | 설명 |
| --- | --- |
| Enumerable | 래핑된 객체의 타입 |

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(const Enumerable *) method


이 함수 속성은 enumerable(또는 iterable) 객체를 래핑하여 range-based for 루프에서 사용할 수 있게 합니다. begin(), end() 메서드가 없는 Enumerable에 대해 대상 타입 인수를 사용한 이 오버로드는 (auto& value : IterateOver<SomeType>(enumerable))와 같이 사용됩니다.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 타입이며, iterator에서 반환되어야 합니다. |
| Enumerable | 래핑된 객체의 타입 |

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


이 함수 속성은 enumerable(또는 iterable) 객체를 래핑하여 range-based for 루프에서 사용할 수 있게 합니다. begin(), end() 메서드가 없는 Enumerable에 대해 대상 타입 인수를 사용한 이 오버로드는 (auto& value : IterateOver<SomeType>(enumerable))와 같이 사용됩니다.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 타입이며, iterator에서 반환되어야 합니다. |
| Enumerable | 래핑된 객체의 타입 |

## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


이 함수 속성은 enumerable(또는 iterable) 객체를 래핑하여 range-based for 루프에서 사용할 수 있게 합니다. begin(), end() 메서드가 없는 Enumerable에 대해 기본 대상 타입 인수를 사용한 이 오버로드는 (auto& value : IterateOver(enumerable))와 같이 사용되며, 다음 C# 코드 foreach (var value in enumerable)와 유사합니다.

```cpp
template<typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| 매개변수 | 설명 |
| --- | --- |
| Enumerable | 래핑된 객체의 타입 |

## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


이 함수 속성은 enumerable(또는 iterable) 객체를 래핑하여 range-based for 루프에서 사용할 수 있게 합니다. begin(), end() 메서드가 있는 Enumerable에 대해 기본 대상 타입 인수를 사용한 이 오버로드는 (auto& value : IterateOver(enumerable))와 같이 사용됩니다.

```cpp
template<typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| 매개변수 | 설명 |
| --- | --- |
| Enumerable | 래핑된 객체의 타입 |

## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


이 함수 속성은 enumerable(또는 iterable) 객체를 래핑하여 range-based for 루프에서 사용할 수 있게 합니다. begin(), end() 메서드가 있는 Enumerable에 대해 대상 타입을 iterator의 원래 value_type과 동일하게 하는 이 오버로드.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| 매개변수 | 설명 |
| --- | --- |
| Enumerable | 래핑된 객체의 타입 |
| T | iterator에서 반환되어야 하는 대상 타입 |

## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


이 함수 속성은 enumerable(또는 iterable) 객체를 래핑하여 range-based for 루프에서 사용할 수 있게 합니다. begin(), end() 메서드가 있는 Enumerable에 대해 대상 타입이 iterator의 원래 value_type과 다르게 설정된 이 오버로드.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&!std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, Details::CppIteratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| 매개변수 | 설명 |
| --- | --- |
| Enumerable | 래핑된 객체의 타입 |
| T | iterator에서 반환되어야 하는 대상 타입 |

## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
