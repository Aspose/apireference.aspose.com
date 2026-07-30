---
title: "System::ObjectExt::BoxEnum 方法"
linktitle: "BoxEnum"
second_title: "Aspose.Font 适用于 C++"
description: "System::ObjectExt::BoxEnum 方法。将枚举类型装箱，以便在 C++ 中作为 Object 传播。"
type: docs
weight: 300
url: /zh/cpp/system/objectext/boxenum/
---
## ObjectExt::BoxEnum method


将枚举类型装箱，以便作为 [Object](../../object/) 传播。

```cpp
template<typename T> static SmartPtr<System::BoxedValueBase> System::ObjectExt::BoxEnum(T enumValue)
```


| 参数 | 描述 |
| --- | --- |
| T | [Enum](../../enum/) 类型进行装箱。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| enumValue | T | [Enum](../../enum/) 值进行装箱。 |

### ReturnValue

装箱的枚举值。

## 另见

* Class [SmartPtr](../../smartptr/)
* Class [BoxedValueBase](../../boxedvaluebase/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
