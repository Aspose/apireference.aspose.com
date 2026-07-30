---
title: "System::Collections::Generic::Dictionary::Dictionary 构造函数"
linktitle: "Dictionary"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::Dictionary::Dictionary 构造函数. C++ 中创建空字典。"
type: docs
weight: 100
url: /zh/cpp/system.collections.generic/dictionary/dictionary/
---
## Dictionary::Dictionary() constructor


创建空字典。

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary()
```

## 另见

* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## Dictionary::Dictionary(const map_t\&) constructor


从映射复制数据。

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const map_t &map)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 映射 | const map_t\& | 要从中复制数据的映射。 |

## 另见

* Typedef [map_t](../map_t/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## Dictionary::Dictionary(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) constructor


拷贝构造函数。

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const SharedPtr<IDictionary<TKey, TValue>> &src)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| src | const SharedPtr\<IDictionary\<TKey, TValue\>\>\& | [Dictionary](../) 要从中复制数据。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../idictionary/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## Dictionary::Dictionary(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) constructor


拷贝构造函数。

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const SharedPtr<IDictionary<TKey, TValue>> &src, const SharedPtr<IEqualityComparer<TKey>> &comparer)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| src | const SharedPtr\<IDictionary\<TKey, TValue\>\>\& | 源字典。 |
| comparer | const SharedPtr\<IEqualityComparer\<TKey\>\>\& | [Comparer](../../comparer/) 要使用的对象。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../idictionary/)
* Class [IEqualityComparer](../../iequalitycomparer/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## Dictionary::Dictionary(const SharedPtr\<IEqualityComparer\<TKey\>\>\&) constructor


创建空字典。

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const SharedPtr<IEqualityComparer<TKey>> &comparer)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| comparer | const SharedPtr\<IEqualityComparer\<TKey\>\>\& | [Comparer](../../comparer/) 使用。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEqualityComparer](../../iequalitycomparer/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## Dictionary::Dictionary(int) constructor


对应创建预分配字典的重载；实际上不进行分配。

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(int capacity)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| capacity | int | 要分配的容量；已忽略。 |

## 另见

* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## Dictionary::Dictionary(int, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) constructor


创建空字典。

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(int capacity, const SharedPtr<IEqualityComparer<TKey>> &comparer)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| capacity | int | [Dictionary](../) 创建后的容量；已忽略。 |
| comparer | const SharedPtr\<IEqualityComparer\<TKey\>\>\& | [Comparer](../../comparer/) 使用。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEqualityComparer](../../iequalitycomparer/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
