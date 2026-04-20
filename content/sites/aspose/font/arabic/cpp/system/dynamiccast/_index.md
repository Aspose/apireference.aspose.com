---
title: "طريقة System::DynamicCast"
linktitle: "تحويل ديناميكي"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::DynamicCast. تُجري تحويلًا ديناميكيًا على كائنات Exception في C++."
type: docs
weight: 17000
url: /ar/cpp/system/dynamiccast/
---
## System::DynamicCast(const TFrom\&) method


تُجري تحويلًا ديناميكيًا على كائنات [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast(const TFrom &obj)
```


| معامل | الوصف |
| --- | --- |
| TTo | نوع [Exception](../exception/) الهدف. |
| TFrom | نوع [Exception](../exception/) المصدر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const TFrom\& | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا.

## Deprecated
متروك للتوافقية مع الإصدارات السابقة. استخدم ExplicitCast بدلاً من ذلك.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\> const\&) method


يُجري تحويلًا ديناميكيًا على كائنات [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_enum<TTo>::value &&!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast(SmartPtr<TFrom> const &obj)
```


| معامل | الوصف |
| --- | --- |
| TTo | نوع العنصر المستهدف. |
| TFrom | نوع العنصر المصدر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا.

## Deprecated
متروك للتوافقية مع الإصدارات السابقة. استخدم ExplicitCast بدلاً من ذلك.

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


يفك تغليف تعداد مُغَلَّف عبر التحويل.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_enum<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| معامل | الوصف |
| --- | --- |
| TTo | نوع التعداد الهدف. |
| TFrom | نوع العنصر المصدر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | مؤشر إلى الكائن الذي يتم استخراج البيانات منه. |

### ReturnValue

قيمة التعداد غير المستخرجة.

## Deprecated
متروك للتوافقية مع الإصدارات السابقة. استخدم ExplicitCast بدلاً من ذلك.

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


يُجري تحويلًا ديناميكيًا على الكائنات إلى كائنات [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| معامل | الوصف |
| --- | --- |
| TTo | نوع [Exception](../exception/) الهدف. |
| TFrom | نوع [Object](../object/). |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا.

## Deprecated
متروك للتوافقية مع الإصدارات السابقة. استخدم ExplicitCast بدلاً من ذلك.

## انظر أيضًا

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(std::nullptr_t) method


يقوم بإجراء تحويل ديناميكي للكائنات الفارغة.

```cpp
template<typename TTo> CastResult<TTo>::type System::DynamicCast(std::nullptr_t) noexcept
```


| معامل | الوصف |
| --- | --- |
| TTo | نوع العنصر المستهدف. |

### ReturnValue

nullptr.

## Deprecated
متروك للتوافقية مع الإصدارات السابقة. استخدم ExplicitCast بدلاً من ذلك.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(TFrom\&) method


يقوم بإجراء تحويل ديناميكي للكائنات غير المؤشرة.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&std::is_convertible<TTo, TFrom>::value, TTo>::type System::DynamicCast(TFrom &obj)
```


| معامل | الوصف |
| --- | --- |
| TTo | النوع الهدف. |
| TFrom | نوع المصدر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | TFrom\& | كائن المصدر. |

### ReturnValue

نتيجة التحويل.

## Deprecated
متروك للتوافقية مع الإصدارات السابقة. استخدم ExplicitCast بدلاً من ذلك.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(TFrom) method


يقوم بإجراء تحويل ديناميكي من IntPtr إلى مؤشر.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_pointer<TTo>::value &&std::is_same<IntPtr, TFrom>::value, TTo>::type System::DynamicCast(TFrom value) noexcept
```


| معامل | الوصف |
| --- | --- |
| TTo | النوع الهدف. |
| TFrom | نوع المصدر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | TFrom | قيمة IntPtr المصدر. |

### ReturnValue

نتيجة التحويل.

## Deprecated
متروك للتوافقية مع الإصدارات السابقة. استخدم ExplicitCast بدلاً من ذلك.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
