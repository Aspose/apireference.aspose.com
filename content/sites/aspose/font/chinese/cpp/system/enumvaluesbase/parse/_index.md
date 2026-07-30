---
title: "System::EnumValuesBase::Parse 方法"
linktitle: "解析"
second_title: "Aspose.Font 适用于 C++"
description: "System::EnumValuesBase::Parse 方法。返回一个对象，该对象表示具有指定名称的指定枚举类型的枚举常量的值（C++）。"
type: docs
weight: 400
url: /zh/cpp/system/enumvaluesbase/parse/
---
## EnumValuesBase::Parse method


返回一个对象，该对象表示具有指定名称的指定枚举类型的枚举常量值。

```cpp
static SharedPtr<Object> System::EnumValuesBase::Parse(const TypeInfo &type, const String &str, bool ignoreCase)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| type | const TypeInfo\& | 表示要返回的枚举值类型的 [TypeInfo](../../typeinfo/) 对象 |
| str | const String\& | 枚举常量的名称 |
| ignoreCase | bool | 指定在解释枚举常量名称时是否应忽略大小写。 |

### ReturnValue

一个对象，表示名称在 **str** 中指定的枚举常量的值。

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [EnumValuesBase](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
