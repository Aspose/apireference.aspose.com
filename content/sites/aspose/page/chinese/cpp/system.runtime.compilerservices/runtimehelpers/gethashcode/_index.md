---
title: "System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode 方法"
linktitle: "获取哈希码"
second_title: "Aspose.Page 适用于 C++"
description: "System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode 方法。获取任意类型的哈希码。在 C++ 中调用 Object::GetHashCode() 来实现。"
type: docs
weight: 100
url: /zh/cpp/system.runtime.compilerservices/runtimehelpers/gethashcode/
---
## RuntimeHelpers::GetHashCode method


获取任意类型的哈希码。调用 [Object::GetHashCode()](../../../system/object/gethashcode/) 来实现。

```cpp
template<typename T> static int System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode(SmartPtr<T> const &obj)
```


| Parameter | 描述 |
| --- | --- |
| T | 要获取哈希码的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| obj | SmartPtr\<T\> const\& | [Object](../../../system/object/) 用于获取信息。 |

### ReturnValue

由目标实现计算的哈希码值。

## 另见

* Class [SmartPtr](../../../system/smartptr/)
* Class [RuntimeHelpers](../)
* Namespace [System::Runtime::CompilerServices](../../)
* Library [Aspose.Page for C++](../../../)
