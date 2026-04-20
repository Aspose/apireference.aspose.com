---
title: "System::Array::LastIndexOf method"
linktitle: "LastIndexOf"
second_title: "Aspose.Font لـ C++"
description: "System::Array::LastIndexOf method. يحدد فهرس آخر ظهور للعنصر المحدد في نطاق من عناصر المصفوفة المحدد بواسطة فهرس البداية وعدد العناصر في النطاق في C++."
type: docs
weight: 5500
url: /ar/cpp/system/array/lastindexof/
---
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


يحدد فهرس آخر ظهور للعنصر المحدد في نطاق من عناصر المصفوفة المحددة بواسطة فهرس البداية وعدد العناصر في النطاق.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
```


| معامل | الوصف |
| --- | --- |
| ArrayType | نوع العناصر في المصفوفة الهدف |
| ValueType | نوع العنصر للبحث عنه في المصفوفة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) للبحث عن العنصر المحدد في |
| قيمة | const ValueType\& | فهرس العنصر الذي يجب تحديده |
| startIndex | int | الفهرس الذي يبدأ عنده البحث |
| count | int | عدد العناصر في النطاق للبحث فيه |

### ReturnValue

فهرس آخر ظهور للعنصر المحدد إذا تم العثور على العنصر، وإلا -1

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


يحدد فهرس آخر ظهور للعنصر المحدد في المصفوفة.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value)
```


| معامل | الوصف |
| --- | --- |
| ArrayType | نوع العناصر في المصفوفة الهدف |
| ValueType | نوع العنصر للبحث عنه في المصفوفة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | [Array](../) للبحث عن العنصر المحدد في |
| قيمة | const ValueType\& | فهرس العنصر الذي يجب تحديده |

### ReturnValue

فهرس آخر ظهور للعنصر المحدد إذا تم العثور على العنصر، وإلا -1

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


يحدد فهرس آخر ظهور للعنصر المحدد في المصفوفة بدءًا من الفهرس المحدد.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value, int startIndex)
```


| معامل | الوصف |
| --- | --- |
| ArrayType | نوع العناصر في المصفوفة الهدف |
| ValueType | نوع العنصر للبحث عنه في المصفوفة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | [Array](../) للبحث عن العنصر المحدد في |
| قيمة | const ValueType\& | فهرس العنصر الذي يجب تحديده |
| startIndex | int | الفهرس الذي يبدأ عنده البحث |

### ReturnValue

فهرس آخر ظهور للعنصر المحدد إذا تم العثور على العنصر، وإلا -1

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
