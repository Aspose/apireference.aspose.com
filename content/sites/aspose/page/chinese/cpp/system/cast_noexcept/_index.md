---
title: "System::Cast_noexcept 方法"
linktitle: "Cast_noexcept"
second_title: "Aspose.Page 适用于 C++"
description: "System::Cast_noexcept 方法。对 C++ 中的 SmartPtr 对象执行强制转换。"
type: docs
weight: 15400
url: /zh/cpp/system/cast_noexcept/
---
## System::Cast_noexcept method


对 [SmartPtr](../smartptr/) 对象执行强制转换。

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast_noexcept(SmartPtr<TFrom> const &obj)
```


| Parameter | 描述 |
| --- | --- |
| TTo | 目标指向类型。 |
| TFrom | 源指向类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | 源指针。 |

### ReturnValue

如果允许转换则返回转换结果，否则返回 nullptr。

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
