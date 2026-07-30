---
title: "System::ForceStaticCast 方法"
linktitle: "强制静态转换"
second_title: "Aspose.Font 适用于 C++"
description: "System::ForceStaticCast 方法。 在 C++ 中对 SmartPtr 对象执行真实的 static_cast。"
type: docs
weight: 20500
url: /zh/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


对 [SmartPtr](../smartptr/) 对象执行真实的 static_cast。

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ForceStaticCast(SmartPtr<TFrom> const &obj)
```


| 参数 | 描述 |
| --- | --- |
| TTo | 目标指向对象的类型。 |
| TFrom | 源指向对象的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | 源指针。 |

### ReturnValue

如果允许转换则返回转换结果，否则行为未定义。

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
