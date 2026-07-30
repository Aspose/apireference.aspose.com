---
title: "System::ValueType 类"
linktitle: "ValueType"
second_title: "Aspose.Font 适用于 C++"
description: "System::ValueType 类。用于值类型的基类，由于性能原因，Object 继承被截断。此类型应在栈上分配，并通过值或引用传递给函数。切勿在 C++ 中使用 System::SmartPtr 类来管理此类型的对象。"
type: docs
weight: 7200
url: /zh/cpp/system/valuetype/
---
## ValueType class


基类用于值类型，使用 [Object](../object/) 继承，但为提升性能已被截断。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../smartptr/) 类来管理此类型的对象。

```cpp
class ValueType
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Equals](./equals/)(const SharedPtr\<Object\>\&) | 支持值类型和引用类型的比较。 |
## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
