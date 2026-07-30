---
title: "طريقة System::ObjectExt::Box"
linktitle: "تغليف"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::ObjectExt::Box. يغلف قيم السلاسل في C++."
type: docs
weight: 200
url: /ar/cpp/system/objectext/box/
---
## ObjectExt::Box(const String\&) method


يعبئ قيم السلاسل.

```cpp
SmartPtr<Object> System::ObjectExt::Box(const String &value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const String\& | قيمة للتغليف. |

### ReturnValue

قيمة مُغَلَّفة أو null إذا كانت سلسلة المصدر null.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Box(const T\&) method


يغلف أنواع القيم للتحويل إلى [Object](../../object/). تنفيذ لأنواع التعداد.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| معامل | الوصف |
| --- | --- |
| T | نوع [Enum](../../enum/). |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const T\& | [Enum](../../enum/) قيمة للتغليف. |

### ReturnValue

مؤشر ذكي إلى كائن يحتفظ بالقيمة المغلفة.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Box(const T\&) method


يغلف أنواع القيم للتحويل إلى [Object](../../object/). تنفيذ للأنواع غير تعداد.

```cpp
template<typename T> static std::enable_if<!std::is_enum<T>::value &&!IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| معامل | الوصف |
| --- | --- |
| T | نوع القيمة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const T\& | قيمة للتغليف. |

### ReturnValue

مؤشر ذكي إلى كائن يحتفظ بالقيمة المغلفة.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Box(const T\&) method


يغلف أنواع [Nullable](../../nullable/) للتحويل إلى [Object](../../object/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| معامل | الوصف |
| --- | --- |
| T | نوع القيمة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const T\& | قيمة للتغليف. |

### ReturnValue

مؤشر ذكي إلى كائن يحتفظ بالقيمة المغلفة.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
