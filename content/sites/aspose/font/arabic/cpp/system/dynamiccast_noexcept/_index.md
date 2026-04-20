---
title: "System::DynamicCast_noexcept طريقة"
linktitle: "تحويل ديناميكي بدون استثناء"
second_title: "Aspose.Font لـ C++"
description: "System::DynamicCast_noexcept طريقة. عمليات تحويل قديمة ومهملة. سيتم إزالتها في إصدارات مستقبلية من C++."
type: docs
weight: 17700
url: /ar/cpp/system/dynamiccast_noexcept/
---
## System::DynamicCast_noexcept(const TFrom\&) method


عمليات التحويل القديمة والمهملة. سيتم إزالتها في الإصدارات المستقبلية.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast_noexcept(const TFrom &obj) noexcept
```


| معامل | الوصف |
| --- | --- |
| TTo | نوع [Exception](../exception/) الهدف. |
| TFrom | نوع [Exception](../exception/) المصدر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const TFrom\& | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا أو nullptr وإلا.
## ملاحظات


يُجري تحويلًا ديناميكيًا على كائنات [Exception](../exception/). ## مهمل
متروك للتوافقية الخلفية. استخدم AsCast بدلاً من ذلك.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\> const\&) method


يُجري تحويلًا ديناميكيًا على كائنات [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast_noexcept(SmartPtr<TFrom> const &obj) noexcept
```


| معامل | الوصف |
| --- | --- |
| TTo | نوع العنصر المستهدف. |
| TFrom | نوع العنصر المصدر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا أو nullptr وإلا.

## Deprecated
متروك للتوافقية الخلفية. استخدم AsCast بدلاً من ذلك.

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\>) method


يُجري تحويلًا ديناميكيًا على الكائنات إلى كائنات [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast_noexcept(SmartPtr<TFrom> obj) noexcept
```


| معامل | الوصف |
| --- | --- |
| TTo | نوع [Exception](../exception/) الهدف. |
| TFrom | نوع [Object](../object/). |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا أو nullptr وإلا.

## Deprecated
متروك للتوافقية الخلفية. استخدم AsCast بدلاً من ذلك.

## انظر أيضًا

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
