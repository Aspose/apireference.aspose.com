---
title: "System::DynamicCastArray 方法"
linktitle: "动态数组转换"
second_title: "Aspose.Font 适用于 C++"
description: "System::DynamicCastArray 方法。执行对指定数组的元素进行类型转换，以在 C++ 中转换为不同的类型。"
type: docs
weight: 18000
url: /zh/cpp/system/dynamiccastarray/
---
## System::DynamicCastArray method


执行对指定数组的元素进行类型转换为不同的类型。

```cpp
template<class To,class From> SharedPtr<Array<To>> System::DynamicCastArray(const SharedPtr<Array<From>> &from)
```


| 参数 | 描述 |
| --- | --- |
| To | 要将指定数组的元素转换成的类型 |
| From | 要进行转换的数组元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| from | const SharedPtr\<Array\<From\>\>\& | 指向包含待转换元素的数组的共享指针 |

### ReturnValue

指向新数组的指针，该数组包含类型为 **To** 的元素，这些元素等价于 **from** 的元素。

## Deprecated
为向后兼容而添加。请改用 ExplicitCast。

## 另见

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
