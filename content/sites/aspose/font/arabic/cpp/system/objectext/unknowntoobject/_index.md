---
title: "System::ObjectExt::UnknownToObject طريقة"
linktitle: "UnknownToObject"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::ObjectExt::UnknownToObject. يحول النوع غير المعروف إلى Object، مع معالجة كل من نوع المؤشر الذكي وحالات النوع القيمي في C++."
type: docs
weight: 1900
url: /ar/cpp/system/objectext/unknowntoobject/
---
## ObjectExt::UnknownToObject(const T\&) method


يحول النوع غير المعروف إلى [Object](../../object/)، مع معالجة كل من نوع المؤشر الذكي وحالات النوع القيمي.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(const T &obj)
```


| معامل | الوصف |
| --- | --- |
| T | النوع للتحويل إلى [Object](../../object/). |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) للتحويل. |

### ReturnValue

المؤشر الذكي إلى [Object](../../object/) يكون إما مؤشرًا محولًا أو قيمةً مُغَلَّفة.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::UnknownToObject(T) method


يحول النوع غير المعروف إلى [Object](../../object/)، مع معالجة كل من نوع المؤشر الذكي وحالات النوع القيمي.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(T obj)
```


| معامل | الوصف |
| --- | --- |
| T | النوع للتحويل إلى [Object](../../object/). |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | T | [Object](../../object/) للتحويل. |

### ReturnValue

المؤشر الذكي إلى [Object](../../object/) يكون إما مؤشرًا محولًا أو قيمةً مُغَلَّفة.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
