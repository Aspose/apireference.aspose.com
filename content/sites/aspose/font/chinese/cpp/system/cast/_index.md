---
title: "System::Cast 方法"
linktitle: "Cast"
second_title: "Aspose.Font 适用于 C++"
description: "System::Cast 方法。对 C++ 中的 SmartPtr 对象执行强制转换。"
type: docs
weight: 15400
url: /zh/cpp/system/cast/
---
## System::Cast method


对 [SmartPtr](../smartptr/) 对象执行强制转换。

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast(SmartPtr<TFrom> const &obj)
```


| 参数 | 描述 |
| --- | --- |
| TTo | 目标指向对象的类型。 |
| TFrom | 源指向对象的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | 源指针。 |

### ReturnValue

如果允许转换，则返回转换结果。

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
