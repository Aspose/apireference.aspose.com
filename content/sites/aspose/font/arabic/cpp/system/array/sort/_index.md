---
title: "System::Array::Sort طريقة"
linktitle: "فرز"
second_title: "Aspose.Font لـ C++"
description: "System::Array::Sort طريقة. تقوم بفرز مصفوفتين إحداهما تحتوي على المفاتيح والأخرى على العناصر المقابلة، بناءً على قيم المصفوفة التي تحتوي على المفاتيح، حيث يتم مقارنة عناصرها باستخدام operator< في C++."
type: docs
weight: 5800
url: /ar/cpp/system/array/sort/
---
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) method


يرتب مصفوفتين إحداهما تحتوي على المفاتيح والأخرى على العناصر المقابلة، بناءً على قيم المصفوفة التي تحتوي على المفاتيح، حيث يتم مقارنة عناصرها باستخدام operator<.

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items)
```


| معامل | الوصف |
| --- | --- |
| TKey | نوع العناصر في مصفوفة **keys** |
| TValue | نوع العناصر في مصفوفة **items** |

| معامل | نوع | الوصف |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../) التي تحتوي على قيم المفاتيح |
| items | const ArrayPtr\<TValue\>\& | [Array](../) التي تحتوي على العناصر التي تم ربطها بقيم المفاتيح في مصفوفة **keys** |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) method


يرتب مصفوفتين إحداهما تحتوي على المفاتيح والأخرى على العناصر المقابلة، بناءً على قيم المصفوفة التي تحتوي على المفاتيح، حيث يتم مقارنة عناصرها باستخدام المقارن الافتراضي.

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items, int index, int length)
```


| معامل | الوصف |
| --- | --- |
| TKey | نوع العناصر في مصفوفة **keys** |
| TValue | نوع العناصر في مصفوفة **items** |

| معامل | نوع | الوصف |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../) التي تحتوي على قيم المفاتيح |
| items | const ArrayPtr\<TValue\>\& | [Array](../) التي تحتوي على العناصر التي تم ربطها بقيم المفاتيح في مصفوفة **keys** |
| الفهرس | int | الفهرس الذي يحدد بداية النطاق للفرز |
| الطول | int | عدد العناصر في النطاق المراد فرزه |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&) method


يرتب العناصر في المصفوفة المحددة باستخدام المقارن الافتراضي.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | المصفوفة المستهدفة |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


يرتب العناصر في المصفوفة المحددة باستخدام المقارن المحدد.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparator)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | المصفوفة المستهدفة |
| مقارن | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | كائن IComparer<T> يُستخدم لمقارنة عناصر المصفوفة |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) method


غير مُنفّذ.

```cpp
template<typename Type,typename Y> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<Y>> &comparator)
```


## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, int, int) method


يرتب نطاقًا من العناصر في المصفوفة المحددة باستخدام المقارن الافتراضي.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, int startIndex, int count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | المصفوفة المستهدفة |
| startIndex | int | الفهرس الذي يحدد بداية النطاق المراد فرزه |
| count | int | حجم النطاق المراد فرزه |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
