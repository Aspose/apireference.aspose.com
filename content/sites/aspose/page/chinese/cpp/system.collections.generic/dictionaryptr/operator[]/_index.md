---
title: "System::Collections::Generic::DictionaryPtr::operator[] 方法"
linktitle: "operator[]"
second_title: "Aspose.Page 适用于 C++"
description: "System::Collections::Generic::DictionaryPtr::operator[] 方法。C++ 中的访问运算符。"
type: docs
weight: 200
url: /zh/cpp/system.collections.generic/dictionaryptr/operator[]/
---
## DictionaryPtr::operator[](const T\&) const method


访问运算符。

```cpp
V & System::Collections::Generic::DictionaryPtr<T, V>::operator[](const T &key) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| key | const T\& | [Dictionary](../../dictionary/) 键。 |

### ReturnValue

对传入键对应的值的引用，可能是已有的或新创建的。

## 另见

* Class [DictionaryPtr](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## DictionaryPtr::operator[](const X\&) const method


访问运算符，用于处理键类型转换。

```cpp
template<class X> V & System::Collections::Generic::DictionaryPtr<T, V>::operator[](const X &key) const
```


| Parameter | 描述 |
| --- | --- |
| X | 源键类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| key | const X\& | [Dictionary](../../dictionary/) 键。 |

### ReturnValue

对传入键对应的值的引用，可能是已有的或新创建的。

## 另见

* Class [DictionaryPtr](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
