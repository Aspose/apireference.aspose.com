---
title: "طريقة System::ObjectExt::UnknownToObject"
linktitle: "UnknownToObject"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::ObjectExt::UnknownToObject. تحول النوع غير المعروف إلى Object، مع معالجة كل من حالات نوع المؤشر الذكي والنوع القيمي في C++."
type: docs
weight: 1800
url: /ar/cpp/system/objectext/unknowntoobject/
---
## ObjectExt::UnknownToObject(const T\&) method


تحول النوع غير المعروف إلى [Object](../../object/)، مع معالجة كل من حالات نوع المؤشر الذكي والنوع القيمي.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(const T &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | النوع للتحويل إلى [Object](../../object/). |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) للتحويل. |

### ReturnValue

المؤشر الذكي إلى [Object](../../object/) يكون إما مؤشرًا محولًا أو قيمةً مُعبأة.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownToObject(T) method


تحول النوع غير المعروف إلى [Object](../../object/)، مع معالجة كل من حالات نوع المؤشر الذكي والنوع القيمي.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(T obj)
```


| Parameter | الوصف |
| --- | --- |
| T | النوع للتحويل إلى [Object](../../object/). |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | T | [Object](../../object/) للتحويل. |

### ReturnValue

المؤشر الذكي إلى [Object](../../object/) يكون إما مؤشرًا محولًا أو قيمةً مُعبأة.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
