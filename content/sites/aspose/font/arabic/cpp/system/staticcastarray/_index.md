---
title: "طريقة System::StaticCastArray"
linktitle: "StaticCastArray"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::StaticCastArray. تقوم بتحويل عناصر المصفوفة المحددة إلى نوع مختلف. تجاوز للحالات التي يكون فيها From كائن SmartPtr في C++."
type: docs
weight: 39900
url: /ar/cpp/system/staticcastarray/
---
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


يقوم بتحويل عناصر المصفوفة المحددة إلى نوع مختلف. تجاوز للحالات التي يكون فيها From كائن [SmartPtr](../smartptr/).

```cpp
template<typename To,typename From> std::enable_if_t<System::IsSmartPtr<From>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| معامل | الوصف |
| --- | --- |
| إلى | النوع الذي سيتم تحويل عناصر المصفوفة المحددة إليه |
| From | نوع عناصر العناصر في المصفوفة التي سيتم تحويلها |

| معامل | نوع | الوصف |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | مؤشر مشترك إلى المصفوفة التي تحتوي على العناصر التي سيتم تحويلها |

### ReturnValue

مؤشر إلى مصفوفة جديدة تحتوي على عناصر من النوع **To** مكافئة لعناصر **from**

## Deprecated
مضاف للتوافق مع الإصدارات السابقة. استخدم ExplicitCast بدلاً من ذلك.

## انظر أيضًا

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


يقوم بتحويل عناصر المصفوفة المحددة إلى نوع مختلف. تجاوز للحالات التي يكون فيها From هو Boxable و To هو [Object](../object/).

```cpp
template<typename To,typename From> std::enable_if_t<!System::IsSmartPtr<From>::value &&System::IsBoxable<From>::value &&std::is_same<To, System::SharedPtr<Object>>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| معامل | الوصف |
| --- | --- |
| إلى | النوع الذي سيتم تحويل عناصر المصفوفة المحددة إليه |
| From | نوع عناصر العناصر في المصفوفة التي سيتم تحويلها |

| معامل | نوع | الوصف |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | مؤشر مشترك إلى المصفوفة التي تحتوي على العناصر التي سيتم تحويلها |

### ReturnValue

مؤشر إلى مصفوفة جديدة تحتوي على عناصر من النوع **To** مكافئة لعناصر **from**

## Deprecated
مضاف للتوافق مع الإصدارات السابقة. استخدم ExplicitCast بدلاً من ذلك.

## انظر أيضًا

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
