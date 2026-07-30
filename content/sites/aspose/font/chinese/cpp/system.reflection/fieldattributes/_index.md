---
title: "System::Reflection::FieldAttributes 枚举"
linktitle: "字段属性"
second_title: "Aspose.Font 适用于 C++"
description: "System::Reflection::FieldAttributes 枚举。C++ 中的反射字段属性。"
type: docs
weight: 1200
url: /zh/cpp/system.reflection/fieldattributes/
---
## FieldAttributes enum


反射字段属性。

```cpp
enum class FieldAttributes
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 字段访问掩码 | 7 | 成员访问掩码。使用此掩码检索可访问性信息。 |
| 私有作用域 | 0 | 不可引用的成员。 |
| 私有 | 1 | 私有成员。 |
| FamANDAssem | 2 | 私有且程序集范围的成员。 |
| 程序集 | 3 | 程序集范围的成员。 |
| Family | 4 | 类型及其子类型可访问的成员。 |
| FamORAssem | 5 | 类型、子类型及程序集可访问的成员。 |
| 公共 | 6 | 任何人都可访问的成员。 |
| 静态 | 16 | 静态成员，与实例成员相对。 |
| 仅初始化 | 32 | 只能初始化且不可更改的常量成员。 |
| Literal | 64 | 编译时常量成员。 |
| 未序列化 | 128 | 未序列化的成员。 |
| 特殊名称 | 512 | 以下名称之一的特殊字段。 |
| PinvokeImpl | 8192 | Interop 转发实现。 |
| ReservedMask | 38144 | 仅供运行时使用的保留标志。 |
| RTSpecialName | 1024 | 运行时应检查名称编码。 |
| HasFieldMarshal | 4096 | 存在封送信息。 |
| HasDefault | 32768 | 存在默认值。 |
| HasFieldRVA | 256 | 存在 RVA。 |

## 另见

* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
