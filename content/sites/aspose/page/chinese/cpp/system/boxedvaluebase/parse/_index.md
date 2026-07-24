---
title: "System::BoxedValueBase::Parse 方法"
linktitle: "解析"
second_title: "Aspose.Page 适用于 C++"
description: "System::BoxedValueBase::Parse 方法。在 C++ 中使用指定名称对指定枚举的枚举常量值进行装箱。"
type: docs
weight: 500
url: /zh/cpp/system/boxedvaluebase/parse/
---
## BoxedValueBase::Parse(const TypeInfo\&, const String\&) method


将指定枚举中具有指定名称的枚举常量的值装箱。

```cpp
static SharedPtr<Object> System::BoxedValueBase::Parse(const TypeInfo &type, const String &str)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 类型 | const TypeInfo\& | 指定枚举的类型 |
| str | const String\& | 要装箱的枚举常量的名称 |

### ReturnValue

表示指定枚举常量的装箱值的对象的共享指针

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [BoxedValueBase](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BoxedValueBase::Parse(const TypeInfo\&, const String\&, bool) method


将指定枚举中具有指定名称的枚举常量的值装箱。一个参数指定在解释指定枚举常量名称的字符串时是否应忽略大小写。

```cpp
static SharedPtr<Object> System::BoxedValueBase::Parse(const TypeInfo &type, const String &str, bool ignoreCase)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 类型 | const TypeInfo\& | 指定枚举的类型 |
| str | const String\& | 要装箱的枚举常量的名称 |
| ignoreCase | bool | 指定在解释表示枚举常量名称的字符串时是否应忽略大小写 |

### ReturnValue

表示指定枚举常量的装箱值的对象的共享指针

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [BoxedValueBase](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
