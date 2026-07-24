---
title: "طريقة System::DynamicCast_noexcept"
linktitle: "DynamicCast_noexcept"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::DynamicCast_noexcept. عمليات تحويل قديمة مهجورة. سيتم إزالتها في الإصدارات المستقبلية في C++."
type: docs
weight: 17600
url: /ar/cpp/system/dynamiccast_noexcept/
---
## System::DynamicCast_noexcept(const TFrom\&) method


عمليات التحويل القديمة والمهجورة. سيتم إزالتها في الإصدارات المستقبلية.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast_noexcept(const TFrom &obj) noexcept
```


| Parameter | الوصف |
| --- | --- |
| TTo | نوع [Exception](../exception/) المستهدف. |
| TFrom | نوع [Exception](../exception/) المصدر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const TFrom\& | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا أو nullptr وإلا.
## ملاحظات


يُجري تحويلًا ديناميكيًا على كائنات [Exception](../exception/). ## مهجور
متروكة لتوافق الإصدارات السابقة. استخدم AsCast بدلاً من ذلك.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\> const\&) method


يُجري تحويلًا ديناميكيًا على كائنات [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast_noexcept(SmartPtr<TFrom> const &obj) noexcept
```


| Parameter | الوصف |
| --- | --- |
| TTo | نوع العنصر المستهدف. |
| TFrom | نوع العنصر المصدر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا أو nullptr وإلا.

## Deprecated
متروكة لتوافق الإصدارات السابقة. استخدم AsCast بدلاً من ذلك.

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\>) method


يُجري تحويلًا ديناميكيًا على الكائنات إلى كائنات [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast_noexcept(SmartPtr<TFrom> obj) noexcept
```


| Parameter | الوصف |
| --- | --- |
| TTo | نوع [Exception](../exception/) المستهدف. |
| TFrom | نوع [Object](../object/). |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا أو nullptr وإلا.

## Deprecated
متروكة لتوافق الإصدارات السابقة. استخدم AsCast بدلاً من ذلك.

## انظر أيضًا

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
