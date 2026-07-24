---
title: "System::UriBuilder 类"
linktitle: "UriBuilder"
second_title: "Aspose.Page 适用于 C++"
description: "System::UriBuilder 类。提供构造和修改统一资源标识符（URI）的方法。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 6800
url: /zh/cpp/system/uribuilder/
---
## UriBuilder class


提供构造和修改统一资源标识符（URI）的方法。此类的对象只能使用 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class UriBuilder : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Scheme](./get_scheme/)() const | 返回当前对象构建的 URI 的方案（scheme）。 |
| [get_Uri](./get_uri/)() const | 返回当前对象构建的 [Uri](../uri/) 对象。 |
| [set_Port](./set_port/)(int) | 设置 URI 的端口号。 |
| [set_Scheme](./set_scheme/)(const String\&) | 将当前对象构建的 URI 的方案设置为指定的值。 |
| [ToString](./tostring/)() const override | 返回当前对象构建的 URI 的字符串表示。 |
| [UriBuilder](./uribuilder/)(const String\&) | 构造一个表示指定 URI 的 [UriBuilder](./) 对象。 |
| [UriBuilder](./uribuilder/)(const SharedPtr\<Uri\>\&) | 构造一个表示指定 URI 的 [UriBuilder](./) 对象。 |
## 另见

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
