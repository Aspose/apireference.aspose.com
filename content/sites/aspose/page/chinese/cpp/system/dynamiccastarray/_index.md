---
title: "System::DynamicCastArray 方法"
linktitle: "DynamicCastArray"
second_title: "Aspose.Page 适用于 C++"
description: "System::DynamicCastArray 方法。执行对指定数组的元素进行类型转换，以转换为 C++ 中的不同类型。"
type: docs
weight: 17900
url: /zh/cpp/system/dynamiccastarray/
---
## System::DynamicCastArray method


执行对指定数组的元素进行类型转换为不同的类型。

```cpp
template<class To,class From> SharedPtr<Array<To>> System::DynamicCastArray(const SharedPtr<Array<From>> &from)
```


| Parameter | 描述 |
| --- | --- |
| 至 | 要将指定数组的元素转换成的类型 |
| From | 要进行转换的数组元素的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 起始 | const SharedPtr\<Array\<From\>\>\& | 指向包含待转换元素的数组的共享指针 |

### ReturnValue

指向新数组的指针，该数组包含与 **from** 元素等价的 **To** 类型元素

## Deprecated
为向后兼容而添加。请改用 ExplicitCast。

## 另见

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
