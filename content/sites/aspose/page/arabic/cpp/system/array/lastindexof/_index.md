---
title: "طريقة System::Array::LastIndexOf"
linktitle: "LastIndexOf"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Array::LastIndexOf. تحدد فهرس آخر ظهور للعنصر المحدد ضمن نطاق من عناصر المصفوفة المحدد بواسطة فهرس البداية وعدد العناصر في النطاق في C++."
type: docs
weight: 5500
url: /ar/cpp/system/array/lastindexof/
---
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


يحدد فهرس آخر ظهور للعنصر المحدد في نطاق من عناصر المصفوفة المحدد بواسطة فهرس البداية وعدد العناصر في النطاق.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
```


| Parameter | الوصف |
| --- | --- |
| ArrayType | نوع العناصر في المصفوفة المستهدفة |
| ValueType | نوع العنصر للبحث عنه في المصفوفة |

| Parameter | Type | الوصف |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) للبحث عن العنصر المحدد فيه |
| value | const ValueType\& | فهرس العنصر الذي يجب تحديده |
| startIndex | int | الفهرس الذي يبدأ عنده البحث |
| count | int | عدد العناصر في النطاق للبحث فيه |

### ReturnValue

فهرس آخر ظهور للعنصر المحدد إذا تم العثور عليه، وإلا -1

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


يحدد فهرس آخر ظهور للعنصر المحدد في المصفوفة.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value)
```


| Parameter | الوصف |
| --- | --- |
| ArrayType | نوع العناصر في المصفوفة المستهدفة |
| ValueType | نوع العنصر للبحث عنه في المصفوفة |

| Parameter | Type | الوصف |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | [Array](../) للبحث عن العنصر المحدد فيه |
| value | const ValueType\& | فهرس العنصر الذي يجب تحديده |

### ReturnValue

فهرس آخر ظهور للعنصر المحدد إذا تم العثور عليه، وإلا -1

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


يحدد فهرس آخر ظهور للعنصر المحدد في المصفوفة بدءًا من الفهرس المحدد.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value, int startIndex)
```


| Parameter | الوصف |
| --- | --- |
| ArrayType | نوع العناصر في المصفوفة المستهدفة |
| ValueType | نوع العنصر للبحث عنه في المصفوفة |

| Parameter | Type | الوصف |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | [Array](../) للبحث عن العنصر المحدد فيه |
| value | const ValueType\& | فهرس العنصر الذي يجب تحديده |
| startIndex | int | الفهرس الذي يبدأ عنده البحث |

### ReturnValue

فهرس آخر ظهور للعنصر المحدد إذا تم العثور عليه، وإلا -1

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
