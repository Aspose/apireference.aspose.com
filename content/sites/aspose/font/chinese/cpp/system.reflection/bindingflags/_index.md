---
title: "System::Reflection::BindingFlags 枚举"
linktitle: "BindingFlags"
second_title: "Aspose.Font 适用于 C++"
description: "System::Reflection::BindingFlags 枚举。定义 C++ 中成员和类型的查找模式及绑定方式。"
type: docs
weight: 1100
url: /zh/cpp/system.reflection/bindingflags/
---
## BindingFlags enum


定义成员和类型的查找模式及绑定方式。

```cpp
enum class BindingFlags
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 默认 | 0 | 无特殊选项。 |
| IgnoreCase | 1 | 在查找项时忽略名称的大小写。 |
| DeclaredOnly | 2 | 仅查找在该类型中声明的成员，而非基类型中的成员。 |
| Instance | 4 | 遍历实例成员。 |
| 静态 | 8 | 遍历静态成员。 |
| 公共 | 16 | 遍历公共成员。 |
| NonPublic | 32 | 遍历非公共成员。 |
| FlattenHierarchy | 64 | 遍历基类型的公共和受保护的静态成员。 |
| InvokeMethod | 256 | 调用方法。 |
| CreateInstance | 512 | 创建反射类型的实例。 |
| GetField | 1024 | 获取字段值。 |
| SetField | 2048 | 设置字段值。 |
| GetProperty | 4096 | 获取属性值。 |
| SetProperty | 8192 | 设置属性值。 |
| PutDispProperty | 16384 | 设置 COM 属性。 |
| PutRefDispProperty | 32768 | 设置 COM 引用属性。 |
| ExactBinding | 65536 | 类型绑定必须精确，不能进行任何类型更改。 |
| SuppressChangeType | 131072 | 不支持。 |
| OptionalParamBinding | 262144 | 根据参数数量选择重载。 |
| IgnoreReturn | 16777216 | 忽略 COM 互操作返回值。 |

## 另见

* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
