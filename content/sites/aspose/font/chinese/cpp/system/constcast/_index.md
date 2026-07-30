---
title: "System::ConstCast 方法"
linktitle: "常量转换"
second_title: "Aspose.Font 适用于 C++"
description: "System::ConstCast 方法。C++ 中已弃用的转换已结束。"
type: docs
weight: 16200
url: /zh/cpp/system/constcast/
---
## System::ConstCast method


已弃用的转换已结束。

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| 参数 | 描述 |
| --- | --- |
| TTo | 目标指向对象的类型。 |
| TFrom | 源指向对象的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | 源指针。 |

### ReturnValue

如果允许转换则返回转换结果，否则返回 nullptr。
## 备注


对 [SmartPtr](../smartptr/) 对象执行 const 转换。
## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
