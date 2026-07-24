---
title: "System::ConstCast 方法"
linktitle: "ConstCast"
second_title: "Aspose.Page 适用于 C++"
description: "System::ConstCast 方法。C++ 中已弃用的强制转换已结束。"
type: docs
weight: 16100
url: /zh/cpp/system/constcast/
---
## System::ConstCast method


已弃用的强制转换已结束。

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| Parameter | 描述 |
| --- | --- |
| TTo | 目标指向类型。 |
| TFrom | 源指向类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | 源指针。 |

### ReturnValue

如果允许转换则返回转换结果，否则返回 nullptr。
## 备注


对 [SmartPtr](../smartptr/) 对象执行 const 强制转换。
## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
