---
title: "طريقة System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect"
linktitle: "ربط"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect. يضيف المفوض المحدد إلى المجموعة في C++."
type: docs
weight: 400
url: /ar/cpp/system/multicastdelegate_returntype(argumenttypes...)_/connect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(Callback) method


يضيف المفوض المحدد إلى المجموعة.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(Callback callback)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| استدعاء رد | Callback | المفوض لإضافته إلى المجموعة |

### ReturnValue

مرجع إلى الذات

## انظر أيضًا

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, ClassType *) method


يضيف الطريقة غير الثابتة المحددة للكائن المحدد إلى مجموعة المفوضين.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, ClassType *obj)
```


| معامل | الوصف |
| --- | --- |
| MemberType | نوع الطريقة غير الساكنة التي سيتم إضافتها إلى مجموعة المفوضين |
| ClassType | نوع طريقة الكائن التي سيتم إضافتها إلى المفوض |

| معامل | نوع | الوصف |
| --- | --- | --- |
| عضو | MemberType ClassType::* | مؤشر إلى الطريقة غير الساكنة للكائن المحدد |
| obj | ClassType * | مؤشر إلى طريقة عضو كائن التي سيتم إضافتها إلى مجموعة المفوضين |

### ReturnValue

مرجع إلى الذات

## انظر أيضًا

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


يضيف الطريقة غير الثابتة المحددة للكائن المحدد إلى مجموعة المفوضين.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| معامل | الوصف |
| --- | --- |
| MemberType | نوع الطريقة غير الساكنة التي سيتم إضافتها إلى مجموعة المفوضين |
| ClassType | نوع طريقة كائن التي سيتم إضافتها إلى مجموعة المفوضين |

| معامل | نوع | الوصف |
| --- | --- | --- |
| عضو | MemberType ClassType::* | مؤشر إلى الطريقة غير الساكنة للكائن المحدد |
| obj | const SharedPtr\<ClassType\>\& | مؤشر مشترك إلى طريقة عضو كائن التي سيتم إضافتها إلى مجموعة المفوضين |

### ReturnValue

مرجع إلى الذات

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MulticastDelegate\&) method


يضيف كائن MulticastDelegate المحدد إلى مجموعة المفوضين.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MulticastDelegate &other)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| أخرى | MulticastDelegate\& | مثال من فئة MulticastDelegate لإضافته إلى مجموعة المفوضين |

### ReturnValue

مرجع إلى الذات

## انظر أيضًا

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(std::function\<R(Args...)>) method


يضيف كائن الدالة المحدد إلى مجموعة المفوضين. يتم تحويل كائن الدالة إلى نوع المفوض [Callback](../callback/) قبل إضافته إلى المجموعة.

```cpp
template<class R,class...> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(std::function<R(Args...)> f)
```


| معامل | الوصف |
| --- | --- |
| R | نوع القيمة المرجعة لكائن الدالة لإضافته إلى المجموعة |
| المعاملات | قائمة المعاملات لكائن الدالة لإضافته إلى المجموعة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| f | std::function\<R(Args...)> | كائن الدالة لإضافته إلى المجموعة |

### ReturnValue

مرجع إلى الذات

## انظر أيضًا

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
