---
title: "طريقة System::Delegate< ReturnType(ArgumentTypes...)>::Delegate"
linktitle: "Delegate"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Delegate< ReturnType(ArgumentTypes...)>::Delegate. المُنشئ الافتراضي. يُنشئ كائن delegate لا يشير إلى أي شيء في C++."
type: docs
weight: 100
url: /ar/cpp/system/delegate_returntype(argumenttypes...)_/delegate/
---
## Delegate< ReturnType(ArgumentTypes...)>::Delegate() method


المنشئ الافتراضي. يُنشئ كائن الـ delegate الذي لا يشير إلى أي شيء.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate()=default
```

## انظر أيضًا

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(const Delegate\&) method




```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(const Delegate &)=default
```

## انظر أيضًا

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(Delegate\&&) method


منشئ النسخ المتنقل. يأخذ ملكية الكيان الذي يشيره الـ delegate المحدد.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(Delegate &&o) noexcept
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| o | Delegate\&& | كائن Delegate لنقل الكيان المشار إليه منه |

## انظر أيضًا

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(int, T\&) method


المنشئ. يُنشئ delegate من كائن الدالة المحدد.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(int functor_tag, T &functor)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع كائن الدالة الذي يقبله المُنشئ كمعامل |

| Parameter | Type | الوصف |
| --- | --- | --- |
| functor_tag | int | قيمة عددية وهمية؛ يُستخدم هذا المعامل لحل الغموض |
| functor | T\& | كائن دالة سيشير إليه delegate المُنشأ حديثًا |

## انظر أيضًا

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(long, T\&&) method


منشئ النقل. يُنشئ delegate من كائن الدالة المحدد.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(long functor_tag, T &&functor)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع كائن الدالة الذي يقبله المُنشئ كمعامل |

| Parameter | Type | الوصف |
| --- | --- | --- |
| functor_tag | long | قيمة عددية وهمية؛ يُستخدم هذا المعامل لحل الغموض |
| functor | T\&& | كائن دالة سيشير إليه delegate المُنشأ حديثًا |

## انظر أيضًا

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*, ClassType *) method


المنشئ. يُنشئ delegate يشير إلى الطريقة غير الثابتة المحددة للكائن المحدد.

```cpp
template<class MemberType,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*member, ClassType *obj)
```


| Parameter | الوصف |
| --- | --- |
| MemberType | نوع الطريقة غير الساكنة التي يقبلها المُنشئ كمعامل |
| ClassType | نوع الكائن الذي يقبله المُنشئ كمعامل |

| Parameter | Type | الوصف |
| --- | --- | --- |
| عضو | MemberType ClassType::* | مؤشر إلى الطريقة غير الساكنة التي سيشير إليها المفوض المُنشأ حديثًا |
| obj | ClassType * | مؤشر إلى طريقة عضو كائن سيشير إليها المفوض المُنشأ حديثًا |

## انظر أيضًا

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) method


المنشئ. يُنشئ delegate يشير إلى الطريقة غير الثابتة المحددة للكائن المحدد.

```cpp
template<class MemberType,class MemberClass,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*member, const SharedPtr<ClassType> &obj)
```


| Parameter | الوصف |
| --- | --- |
| MemberType | نوع الطريقة غير الساكنة التي يقبلها المُنشئ كمعامل |
| ClassType | نوع الكائن الذي يقبله المُنشئ كمعامل |

| Parameter | Type | الوصف |
| --- | --- | --- |
| عضو | MemberType MemberClass::* | مؤشر إلى الطريقة غير الساكنة التي سيشير إليها المفوض المُنشأ حديثًا |
| obj | const SharedPtr\<ClassType\>\& | مؤشر مشترك إلى طريقة عضو كائن سيشير إليها المفوض المُنشأ حديثًا |

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(std::function\<R(Args...)>) method


يُنشئ كائن delegate يشير إلى كائن دالة std::function.

```cpp
template<class R,class...> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(std::function<R(Args...)> f)
```


| Parameter | الوصف |
| --- | --- |
| R | نوع القيمة المرجعة لكائن الدالة الذي يقبله المُنشئ كمعامل |
| المعلمات | قائمة المعاملات لكائن الدالة الذي يقبله المُنشئ كمعامل |

| Parameter | Type | الوصف |
| --- | --- | --- |
| f | std::function\<R(Args...)> | كائن دالة سيُشير إليه كائن المفوض المُنشأ حديثًا |

## انظر أيضًا

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) method


المنشئ. يُنشئ delegate من المؤشر المحدد إلى كائن الدالة الذي تم إنشاؤه بواسطة std::bind().

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<std::is_bind_expression<T>::value>::type *=0)
```


| Parameter | الوصف |
| --- | --- |
| ال | نوع كائن الدالة الذي يولده std::bind() والذي يقبله المُنشئ كمعامل |

| Parameter | Type | الوصف |
| --- | --- | --- |
| دالة | T | مؤشر إلى "bind expression" - مؤشر دالة تم إنشاؤه بواسطة std::bind() - سيُشير إليه كائن الـDelegate المُنشأ حديثًا |

## انظر أيضًا

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) method


المنشئ. يُنشئ كائن delegate من المؤشر المحدد إلى دالة حرة أو طريقة ثابتة.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<!std::is_bind_expression<T>::value &&std::is_pointer<T>::value &&std::is_function<typename std::remove_pointer<T>::type>::value>::type *=0)
```


| Parameter | الوصف |
| --- | --- |
| ال | نوع مؤشر الدالة أو الطريقة الساكنة الذي يقبله المُنشئ كمعامل |

| Parameter | Type | الوصف |
| --- | --- | --- |
| دالة | T | مؤشر إلى دالة أو طريقة ساكنة سيُشير إليه كائن الـDelegate المُنشأ حديثًا |

## انظر أيضًا

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
