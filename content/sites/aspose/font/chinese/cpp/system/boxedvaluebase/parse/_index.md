---
title: "System::BoxedValueBase::Parse 方法"
linktitle: "解析"
second_title: "Aspose.Font 适用于 C++"
description: "System::BoxedValueBase::Parse 方法。在 C++ 中将指定枚举的具有指定名称的枚举常量的值装箱。"
type: docs
weight: 500
url: /zh/cpp/system/boxedvaluebase/parse/
---
## BoxedValueBase::Parse(const TypeInfo\&, const String\&) method


将指定枚举中具有指定名称的枚举常量的值装箱。

```cpp
static SharedPtr<Object> System::BoxedValueBase::Parse(const TypeInfo &type, const String &str)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 类型 | const TypeInfo\& | 指定枚举的类型 |
| str | const String\& | 要装箱的枚举常量的名称 |

### ReturnValue

指向表示指定枚举常量装箱值的对象的共享指针

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [BoxedValueBase](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## BoxedValueBase::Parse(const TypeInfo\&, const String\&, bool) method


将指定枚举中具有指定名称的枚举常量的值装箱。一个参数指定在解释指定枚举常量名称的字符串时是否应忽略大小写。

```cpp
static SharedPtr<Object> System::BoxedValueBase::Parse(const TypeInfo &type, const String &str, bool ignoreCase)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 类型 | const TypeInfo\& | 指定枚举的类型 |
| str | const String\& | 要装箱的枚举常量的名称 |
| ignoreCase | bool | 指定在解释表示枚举常量名称的字符串时是否应忽略大小写 |

### ReturnValue

指向表示指定枚举常量装箱值的对象的共享指针

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [BoxedValueBase](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
