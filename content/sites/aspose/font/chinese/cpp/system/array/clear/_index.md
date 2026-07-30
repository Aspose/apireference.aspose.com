---
title: "System::Array::Clear method"
linktitle: "清除"
second_title: "Aspose.Font 适用于 C++"
description: "System::Array::Clear 方法。不受支持，因为当前对象表示的数组在 C++ 中是只读的。"
type: docs
weight: 600
url: /zh/cpp/system/array/clear/
---
## Array::Clear() method


不支持，因为当前对象表示的数组是只读的。

```cpp
virtual void System::Array<T>::Clear() override
```


## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Clear(const ArrayPtr\<Type\>\&, int, int) method


将指定数组中从 **startIndex** 索引开始的 **count** 个值替换为默认值。

```cpp
template<typename Type> static void System::Array<T>::Clear(const ArrayPtr<Type> &arr, int startIndex, int count)
```


| 参数 | 描述 |
| --- | --- |
| 类型 | 目标数组中元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | 目标数组 |
| startIndex | int | 开始替换项目的索引 |
| count | int | 要替换的项目数量 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
