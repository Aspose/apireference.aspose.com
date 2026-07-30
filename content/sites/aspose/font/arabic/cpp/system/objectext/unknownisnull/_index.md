---
title: "System::ObjectExt::UnknownIsNull method"
linktitle: "UnknownIsNull"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::ObjectExt::UnknownIsNull. تتحقق مما إذا كان كائن من نوع غير معروف هو nullptr. تحميل زائد للأنواع غير العددية في C++."
type: docs
weight: 1800
url: /ar/cpp/system/objectext/unknownisnull/
---
## ObjectExt::UnknownIsNull(T) method


يتحقق مما إذا كان كائن النوع غير المعروف يساوي nullptr. تحميل زائد للأنواع غير العددية.

```cpp
template<typename T> static std::enable_if<!std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| معامل | الوصف |
| --- | --- |
| T | [Object](../../object/) نوع. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | T | [Object](../../object/) للتحقق. |

### ReturnValue

صحيح إذا كان 'obj == nullptr' صحيحًا، وإلا خطأ.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::UnknownIsNull(T) method


يتحقق مما إذا كان كائن النوع غير المعروف يساوي nullptr. تحميل زائد للأنواع العددية.

```cpp
template<typename T> static std::enable_if<std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| معامل | الوصف |
| --- | --- |
| T | [Object](../../object/) نوع. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | T | [Object](../../object/) للتحقق. |

### ReturnValue

دائمًا تُعيد false.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
