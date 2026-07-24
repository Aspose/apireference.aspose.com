---
title: "System::Get 方法"
linktitle: "获取"
second_title: "Aspose.Page 适用于 C++"
description: "System::Get 方法。函数用于获取给定元组的第 N 个元素。C++ 中针对基对象的重载。"
type: docs
weight: 20700
url: /zh/cpp/system/get/
---
## System::Get(const SharedPtr\<Object\>\&) method


函数用于获取给定元组的第 N 个元素。针对基对象的重载。

```cpp
template<std::size_t> auto System::Get(const SharedPtr<Object> &object)
```


| Parameter | 描述 |
| --- | --- |
| N | 元素索引。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 对象 | const SharedPtr\<Object\>\& | 要检查的对象。 |

### ReturnValue

第 N 个元组元素的值，转换为对象。

## 另见

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const SharedPtr\<T\>\&) method


函数用于获取给定元组的第 N 个元素。针对共享指针的重载。

```cpp
template<std::size_t,typename T> auto System::Get(const SharedPtr<T> &pointer)
```


| Parameter | 描述 |
| --- | --- |
| N | 元素索引。 |
| T | 被检查对象的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 对象 | const SharedPtr\<T\>\& | 要检查的对象。 |

### ReturnValue

第 N 个元组元素的值。

## 另见

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const T\&) method


函数用于获取给定元组的第 N 个元素。针对具有 Deconstruct 方法的对象的重载。

```cpp
template<std::size_t,typename T> auto System::Get(const T &object)
```


| Parameter | 描述 |
| --- | --- |
| N | 元素索引。 |
| T | 被检查对象的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 对象 | const T\& | 要检查的对象。 |

### ReturnValue

第 N 个元组元素的值。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const ValueTuple\<Args...\>\&) method


获取值元组的第 N 个元素。

```cpp
template<std::size_t,typename...> auto System::Get(const ValueTuple<Args...> &tuple)
```


| Parameter | 描述 |
| --- | --- |
| N | 元素索引。 |
| 参数 | 元组元素。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 元组 | const ValueTuple\<Args...\>\& | 用于获取元素的元组。 |

### ReturnValue

第 N 个元组元素的值。

## 另见

* Class [ValueTuple](../valuetuple/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
