---
title: "System::ObjectExt::UnboxToNullable 方法"
linktitle: "UnboxToNullable"
second_title: "Aspose.Font 适用于 C++"
description: "System::ObjectExt::UnboxToNullable 方法。将对象解箱为 C++ 中的可空类型。"
type: docs
weight: 1700
url: /zh/cpp/system/objectext/unboxtonullable/
---
## ObjectExt::UnboxToNullable method


将对象解箱为可空类型。

```cpp
template<class T> static Nullable<T> System::ObjectExt::UnboxToNullable(const SmartPtr<Object> &obj, bool safe=true)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) 用于解箱。 |
| 安全 | bool | 如果为 true，则在失败时返回 nullptr，否则抛出 InvalidCastException。 |

### ReturnValue

已解箱的可空值（可能为 null）。

## 另见

* Class [Nullable](../../nullable/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
