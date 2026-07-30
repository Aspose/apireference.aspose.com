---
title: "System::Globalization::IdnMapping 类"
linktitle: "IdnMapping"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::IdnMapping 类。IdnMapping 用于将名称映射到 Punycode。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 1300
url: /zh/cpp/system.globalization/idnmapping/
---
## IdnMapping class


[IdnMapping](./) used to map names to Punycode. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class IdnMapping : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 比较两个 [IdnMapping](./) 对象。 |
| [get_AllowUnassigned](./get_allowunassigned/)() const | 获取指示操作中是否使用未分配代码点的标志。 |
| [get_UseStd3AsciiRules](./get_usestd3asciirules/)() const | 获取指示操作中是否使用标准命名约定的标志。 |
| [GetAscii](./getascii/)(const String\&) const | [Convert](../../system/convert/) 将 Unicode 域名转换为等效的 ASCII。 |
| [GetAscii](./getascii/)(const String\&, int) const | [Convert](../../system/convert/) 将 Unicode 域名转换为等效的 ASCII。 |
| [GetAscii](./getascii/)(const String\&, int, int) const | [Convert](../../system/convert/) 将 Unicode 域名转换为等效的 ASCII。 |
| [GetHashCode](./gethashcode/)() const override | 获取当前 [IdnMapping](./) 对象的哈希码。 |
| [GetUnicode](./getunicode/)(const String\&) const | [Convert](../../system/convert/) 将 ASCII 域名转换为等效的 Unicode。 |
| [GetUnicode](./getunicode/)(const String\&, int) const | [Convert](../../system/convert/) 将 ASCII 域名转换为等效的 Unicode。 |
| [GetUnicode](./getunicode/)(const String\&, int, int) const | [Convert](../../system/convert/) 将 ASCII 域名转换为等效的 Unicode。 |
| [IdnMapping](./idnmapping/)() | RTTI 信息。 |
| [IdnMapping](./idnmapping/)(const IdnMapping\&) |  |
| [operator=](./operator=/)(const IdnMapping\&) |  |
| [set_AllowUnassigned](./set_allowunassigned/)(bool) | 设置指示操作中是否使用未分配代码点的标志。 |
| [set_UseStd3AsciiRules](./set_usestd3asciirules/)(bool) | 设置指示操作中是否使用标准命名约定的标志。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
