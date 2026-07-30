---
title: "طريقة System::IterateOver"
linktitle: "IterateOver"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IterateOver. هذه الخاصية الدالية تغلف كائنًا قابلًا للتعداد (أو قابلًا للتكرار) بحيث يمكن استخدامه مع حلقة for القائمة على النطاق. هذا التحميل لـ Enumerable هذا مع نوع الهدف الافتراضي في C++."
type: docs
weight: 23200
url: /ar/cpp/system/iterateover/
---
## System::IterateOver(const Enumerable *) method


هذه الخاصية الدالية تغلف كائنًا قابلًا للتعداد (أو قابلًا للتكرار) بحيث يمكن استخدامه مع حلقة for القائمة على النطاق. هذا التحميل لـ Enumerable هذا مع نوع الهدف الافتراضي.

```cpp
template<typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, Details::ValueTypeOfEnumerable<Enumerable>, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| معامل | الوصف |
| --- | --- |
| Enumerable | نوع الكائن المغلف |

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(const Enumerable *) method


هذه الخاصية الدالية تغلف كائنًا قابلًا للتعداد (أو قابلًا للتكرار) بحيث يمكن استخدامه مع حلقة for القائمة على النطاق. هذا التحميل لـ Enumerable بدون طرق begin() و end() مع معامل نوع الهدف لـ (auto& value : IterateOver<SomeType>(enumerable))

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| معامل | الوصف |
| --- | --- |
| T | نوع الهدف، يجب إرجاعه من المكرّر |
| Enumerable | نوع الكائن المغلف |

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


هذه الخاصية الدالية تغلف كائنًا قابلًا للتعداد (أو قابلًا للتكرار) بحيث يمكن استخدامه مع حلقة for القائمة على النطاق. هذا التحميل لـ Enumerable بدون طرق begin() و end() مع معامل نوع الهدف لـ (auto& value : IterateOver<SomeType>(enumerable))

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| معامل | الوصف |
| --- | --- |
| T | نوع الهدف، يجب إرجاعه من المكرّر |
| Enumerable | نوع الكائن المغلف |

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


هذه الخاصية الدالية تغلف كائنًا قابلًا للتعداد (أو قابلًا للتكرار) بحيث يمكن استخدامه مع حلقة for القائمة على النطاق. هذا التحميل لـ Enumerable بدون طرق begin() و end() مع معامل نوع الهدف الافتراضي لـ (auto& value : IterateOver(enumerable)) مماثل للكود C# التالي foreach (var value in enumerable)

```cpp
template<typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| معامل | الوصف |
| --- | --- |
| Enumerable | نوع الكائن المغلف |

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


هذه الخاصية الدالية تغلف كائنًا قابلًا للتعداد (أو قابلًا للتكرار) بحيث يمكن استخدامه مع حلقة for القائمة على النطاق. هذا التحميل لـ Enumerable مع طرق begin() و end() مع معامل نوع الهدف الافتراضي لـ (auto& value : IterateOver(enumerable))

```cpp
template<typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| معامل | الوصف |
| --- | --- |
| Enumerable | نوع الكائن المغلف |

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


هذه الخاصية الدالية تغلف كائنًا قابلًا للتعداد (أو قابلًا للتكرار) بحيث يمكن استخدامه مع حلقة for القائمة على النطاق. هذا التحميل لـ Enumerable مع طرق begin() و end() مع نوع الهدف نفسه كنوع value_type الأصلي للمكرّر.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| معامل | الوصف |
| --- | --- |
| Enumerable | نوع الكائن المغلف |
| T | نوع الهدف الذي يجب إرجاعه من المكرّر |

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


هذه الخاصية الدالية تغلف كائنًا قابلًا للتعداد (أو قابلًا للتكرار) بحيث يمكن استخدامه مع حلقة for القائمة على النطاق. هذا التحميل لـ Enumerable مع طرق begin() و end() مع نوع هدف مختلف ونوع value_type الأصلي للمكرّر.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&!std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, Details::CppIteratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| معامل | الوصف |
| --- | --- |
| Enumerable | نوع الكائن المغلف |
| T | نوع الهدف الذي يجب إرجاعه من المكرّر |

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
