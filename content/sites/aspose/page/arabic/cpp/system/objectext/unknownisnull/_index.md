---
title: "طريقة System::ObjectExt::UnknownIsNull"
linktitle: "UnknownIsNull"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::ObjectExt::UnknownIsNull. تتحقق مما إذا كان كائن من نوع غير معروف هو nullptr. تحميل زائد للأنواع غير العددية في C++."
type: docs
weight: 1700
url: /ar/cpp/system/objectext/unknownisnull/
---
## ObjectExt::UnknownIsNull(T) method


يفحص ما إذا كان كائن النوع غير المعروف هو nullptr. تحميل زائد للأنواع غير العددية.

```cpp
template<typename T> static std::enable_if<!std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع [Object](../../object/). |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | T | [Object](../../object/) للتحقق. |

### ReturnValue

صحيح إذا كان 'obj == nullptr' صحيحًا، وإلا خاطئ.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownIsNull(T) method


يفحص ما إذا كان كائن النوع غير المعروف هو nullptr. تحميل زائد للأنواع العددية.

```cpp
template<typename T> static std::enable_if<std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع [Object](../../object/). |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | T | [Object](../../object/) للتحقق. |

### ReturnValue

دائمًا ما تُعيد false.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
