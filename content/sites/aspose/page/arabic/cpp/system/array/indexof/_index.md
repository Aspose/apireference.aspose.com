---
title: "طريقة System::Array::IndexOf"
linktitle: "IndexOf"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Array::IndexOf. تحدد فهرس أول ظهور للعنصر المحدد في المصفوفة في C++."
type: docs
weight: 2900
url: /ar/cpp/system/array/indexof/
---
## Array::IndexOf(const T\&) const method


يحدد فهرس أول ظهور للعنصر المحدد في المصفوفة.

```cpp
virtual int System::Array<T>::IndexOf(const T &item) const override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| العنصر | const T\& | فهرس العنصر الذي يجب تحديده |

### ReturnValue

فهرس أول ظهور للعنصر المحدد إذا تم العثور على العنصر، وإلا -1

## انظر أيضًا

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


يحدد فهرس أول ظهور للعنصر المحدد في المصفوفة.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value)
```


| Parameter | الوصف |
| --- | --- |
| ArrayType | نوع العناصر في المصفوفة المستهدفة |
| ValueType | نوع العنصر للبحث عنه في المصفوفة |

| Parameter | Type | الوصف |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) للبحث عن العنصر المحدد فيه |
| value | const ValueType\& | فهرس العنصر الذي يجب تحديده |

### ReturnValue

فهرس أول ظهور للعنصر المحدد إذا تم العثور على العنصر، وإلا -1

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


يحدد فهرس أول ظهور للعنصر المحدد في المصفوفة بدءًا من الفهرس المحدد.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex)
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

### ReturnValue

فهرس أول ظهور للعنصر المحدد إذا تم العثور على العنصر، وإلا -1

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


يحدد فهرس أول ظهور للعنصر المحدد في نطاق من عناصر المصفوفة المحدد بواسطة فهرس البداية وعدد العناصر في النطاق.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
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

فهرس أول ظهور للعنصر المحدد إذا تم العثور على العنصر، وإلا -1

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
