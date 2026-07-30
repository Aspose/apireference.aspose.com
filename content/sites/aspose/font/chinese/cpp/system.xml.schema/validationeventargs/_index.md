---
title: "System::Xml::Schema::ValidationEventArgs 类"
linktitle: "ValidationEventArgs"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::ValidationEventArgs 类。返回与 C++ 中的 ValidationEventHandler 相关的详细信息。"
type: docs
weight: 200
url: /zh/cpp/system.xml.schema/validationeventargs/
---
## ValidationEventArgs class


返回与 [ValidationEventHandler](../validationeventhandler/) 相关的详细信息。

```cpp
class ValidationEventArgs : public System::EventArgs
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Exception](./get_exception/)() | 返回与验证事件关联的 [XmlSchemaException](../xmlschemaexception/)。 |
| [get_Message](./get_message/)() | 返回对应于验证事件的文本描述。 |
| [get_Severity](./get_severity/)() | 返回验证事件的严重程度。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 一个静态成员，表示一个 "empty" [EventArgs](../../system/eventargs/) 共享指针（空指针）。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
