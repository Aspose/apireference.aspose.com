---
title: "طريقة System::Delegate< ReturnType(ArgumentTypes...)>::Delegate"
linktitle: "Delegate"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Delegate< ReturnType(ArgumentTypes...)>::Delegate. المُنشئ الافتراضي. ينشئ كائن delegate لا يشير إلى أي شيء في C++."
type: docs
weight: 100
url: /ar/cpp/system/delegate_returntype(argumenttypes...)_/delegate/
---
## Delegate< ReturnType(ArgumentTypes...)>::Delegate() method


المنشئ الافتراضي. يُنشئ كائن التفويض الذي لا يشير إلى أي شيء.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate()=default
```

## انظر أيضًا

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(const Delegate\&) method




```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(const Delegate &)=default
```

## انظر أيضًا

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(Delegate\&&) method


منشئ النسخ المتنقل. يأخذ ملكية الكيان الذي يشير إليه التفويض المحدد.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(Delegate &&o) noexcept
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| o | Delegate\&& | كائن Delegate لنقل الكيان المشار إليه منه |

## انظر أيضًا

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(int, T\&) method


منشئ. يُنشئ تفويضًا من كائن الدالة المحدد.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(int functor_tag, T &functor)
```


| معامل | الوصف |
| --- | --- |
| T | نوع كائن الدالة الذي يقبله المُنشئ كوسيط |

| معامل | نوع | الوصف |
| --- | --- | --- |
| functor_tag | int | قيمة عددية وهمية؛ يُستخدم هذا الوسيط لحل الغموض |
| functor | T\& | كائن دالة سيشير إليه المفوض الجديد المُنشأ |

## انظر أيضًا

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(long, T\&&) method


منشئ متحرك. يُنشئ تفويضًا من كائن الدالة المحدد.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(long functor_tag, T &&functor)
```


| معامل | الوصف |
| --- | --- |
| T | نوع كائن الدالة الذي يقبله المُنشئ كوسيط |

| معامل | نوع | الوصف |
| --- | --- | --- |
| functor_tag | long | قيمة عددية وهمية؛ يُستخدم هذا الوسيط لحل الغموض |
| functor | T\&& | كائن دالة سيشير إليه المفوض الجديد المُنشأ |

## انظر أيضًا

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*, ClassType *) method


منشئ. يُنشئ تفويضًا يشير إلى الطريقة غير الثابتة المحددة للكائن المحدد.

```cpp
template<class MemberType,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*member, ClassType *obj)
```


| معامل | الوصف |
| --- | --- |
| MemberType | نوع الطريقة غير الساكنة التي يقبلها المُنشئ كمعامل |
| ClassType | نوع الكائن الذي يقبله المُنشئ كمعامل |

| معامل | نوع | الوصف |
| --- | --- | --- |
| عضو | MemberType ClassType::* | مؤشر إلى الطريقة غير الساكنة التي سيشير إليها المفوض الجديد المُنشأ |
| obj | ClassType * | مؤشر إلى طريقة عضو كائن سيشير إليها المفوض الجديد المُنشأ |

## انظر أيضًا

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) method


منشئ. يُنشئ تفويضًا يشير إلى الطريقة غير الثابتة المحددة للكائن المحدد.

```cpp
template<class MemberType,class MemberClass,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*member, const SharedPtr<ClassType> &obj)
```


| معامل | الوصف |
| --- | --- |
| MemberType | نوع الطريقة غير الساكنة التي يقبلها المُنشئ كمعامل |
| ClassType | نوع الكائن الذي يقبله المُنشئ كمعامل |

| معامل | نوع | الوصف |
| --- | --- | --- |
| عضو | MemberType MemberClass::* | مؤشر إلى الطريقة غير الساكنة التي سيشير إليها المفوض الجديد المُنشأ |
| obj | const SharedPtr\<ClassType\>\& | مؤشر مشترك إلى طريقة عضو كائن سيشير إليها المفوض الجديد المُنشأ |

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(std::function\<R(Args...)>) method


يُنشئ كائن تفويض يشير إلى كائن دالة std::function.

```cpp
template<class R,class...> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(std::function<R(Args...)> f)
```


| معامل | الوصف |
| --- | --- |
| R | نوع القيمة المرجعة لكائن الدالة الذي يقبله المُنشئ كمعامل |
| المعاملات | قائمة المعاملات لكائن الدالة الذي يقبله المُنشئ كمعامل |

| معامل | نوع | الوصف |
| --- | --- | --- |
| f | std::function\<R(Args...)> | كائن دالة سيُشير إليه كائن المفوض الجديد المُنشأ |

## انظر أيضًا

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) method


منشئ. يُنشئ تفويضًا من المؤشر المحدد إلى كائن الدالة الذي تم إنشاؤه بواسطة std::bind().

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<std::is_bind_expression<T>::value>::type *=0)
```


| معامل | الوصف |
| --- | --- |
| ال | نوع كائن الدالة الذي يولده std::bind() والذي يقبله المُنشئ كمعامل |

| معامل | نوع | الوصف |
| --- | --- | --- |
| دالة | T | مؤشر إلى "تعبير bind" - مؤشر دالة تم إنشاؤه بواسطة std::bind() - سيُشير إليه كائن Delegate الجديد المُنشأ |

## انظر أيضًا

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) method


منشئ. يُنشئ كائن تفويض من المؤشر المحدد إلى دالة حرة أو طريقة ثابتة.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<!std::is_bind_expression<T>::value &&std::is_pointer<T>::value &&std::is_function<typename std::remove_pointer<T>::type>::value>::type *=0)
```


| معامل | الوصف |
| --- | --- |
| ال | نوع مؤشر الدالة أو الطريقة الساكنة الذي يقبله المُنشئ كمعامل |

| معامل | نوع | الوصف |
| --- | --- | --- |
| دالة | T | مؤشر إلى دالة أو طريقة ساكنة سيُشير إليها كائن Delegate الجديد المُنشأ |

## انظر أيضًا

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
