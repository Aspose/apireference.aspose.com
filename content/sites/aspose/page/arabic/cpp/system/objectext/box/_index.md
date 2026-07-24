---
title: "طريقة System::ObjectExt::Box"
linktitle: "Box"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::ObjectExt::Box. تقوم بعبور قيم السلاسل النصية في C++."
type: docs
weight: 200
url: /ar/cpp/system/objectext/box/
---
## ObjectExt::Box(const String\&) method


يُغلف قيم السلاسل.

```cpp
SmartPtr<Object> System::ObjectExt::Box(const String &value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const String\& | القيمة التي سيتم عبورها. |

### ReturnValue

القيمة المعبأة أو null إذا كانت السلسلة المصدرية null.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


يعبّر عن أنواع القيم لتحويلها إلى [Object](../../object/). تنفيذ لأنواع التعداد.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع [Enum](../../enum/). |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const T\& | قيمة [Enum](../../enum/) لتعبئتها. |

### ReturnValue

مؤشر ذكي إلى كائن يحتفظ بالقيمة المعبأة.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


يعبّر عن أنواع القيم لتحويلها إلى [Object](../../object/). تنفيذ لأنواع غير التعداد.

```cpp
template<typename T> static std::enable_if<!std::is_enum<T>::value &&!IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع القيمة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const T\& | القيمة التي سيتم عبورها. |

### ReturnValue

مؤشر ذكي إلى كائن يحتفظ بالقيمة المعبأة.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


يعبّر عن أنواع [Nullable](../../nullable/) لتحويلها إلى [Object](../../object/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع القيمة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const T\& | القيمة التي سيتم عبورها. |

### ReturnValue

مؤشر ذكي إلى كائن يحتفظ بالقيمة المعبأة.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
