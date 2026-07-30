---
title: "System::Collections::Generic::Dictionary::Dictionary constructor"
linktitle: "Dictionary"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::Generic::Dictionary::Dictionary constructor. ينشئ قاموسًا فارغًا في C++."
type: docs
weight: 100
url: /ar/cpp/system.collections.generic/dictionary/dictionary/
---
## Dictionary::Dictionary() constructor


ينشئ قاموسًا فارغًا.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary()
```

## انظر أيضًا

* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## Dictionary::Dictionary(const map_t\&) constructor


ينسخ البيانات من الخريطة.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const map_t &map)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| خريطة | const map_t\& | خريطة لنسخ البيانات منها. |

## انظر أيضًا

* Typedef [map_t](../map_t/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## Dictionary::Dictionary(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) constructor


منشئ النسخ.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const SharedPtr<IDictionary<TKey, TValue>> &src)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| src | const SharedPtr\<IDictionary\<TKey, TValue\>\>\& | [Dictionary](../) لنسخ البيانات منها. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../idictionary/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## Dictionary::Dictionary(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) constructor


منشئ النسخ.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const SharedPtr<IDictionary<TKey, TValue>> &src, const SharedPtr<IEqualityComparer<TKey>> &comparer)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| src | const SharedPtr\<IDictionary\<TKey, TValue\>\>\& | القاموس المصدر. |
| comparer | const SharedPtr\<IEqualityComparer\<TKey\>\>\& | [Comparer](../../comparer/) كائن للاستخدام. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../idictionary/)
* Class [IEqualityComparer](../../iequalitycomparer/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## Dictionary::Dictionary(const SharedPtr\<IEqualityComparer\<TKey\>\>\&) constructor


ينشئ قاموسًا فارغًا.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const SharedPtr<IEqualityComparer<TKey>> &comparer)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| comparer | const SharedPtr\<IEqualityComparer\<TKey\>\>\& | [Comparer](../../comparer/) للاستخدام. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEqualityComparer](../../iequalitycomparer/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## Dictionary::Dictionary(int) constructor


تجاوز الذي يتCorrespond إلى إنشاء قاموس مُخصص مسبقًا؛ لا يقوم بأي تخصيص فعليًا.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(int capacity)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| السعة | int | السعة للتخصيص؛ يتم تجاهلها. |

## انظر أيضًا

* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## Dictionary::Dictionary(int, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) constructor


ينشئ قاموسًا فارغًا.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(int capacity, const SharedPtr<IEqualityComparer<TKey>> &comparer)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| capacity | int | [Dictionary](../) السعة بعد الإنشاء؛ يتم تجاهلها. |
| comparer | const SharedPtr\<IEqualityComparer\<TKey\>\>\& | [Comparer](../../comparer/) للاستخدام. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEqualityComparer](../../iequalitycomparer/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
