---
title: "System::Runtime::Serialization 命名空间"
linktitle: "System::Runtime::Serialization"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::Runtime::Serialization 命名空间。"
type: docs
weight: 5700
url: /zh/cpp/system.runtime.serialization/
---



## 类

| 类 | 描述 |
| --- | --- |
| [FormatterConverter](./formatterconverter/) | 表示 [System::Runtime::Serialization::IFormatterConverter](./iformatterconverter/) 接口的基本实现。 |
| [IFormatterConverter](./iformatterconverter/) | 提供 [System::Runtime::Serialization::SerializationInfo](./serializationinfo/) 实例与格式化程序提供的最适合解析该 [System::Runtime::Serialization::SerializationInfo](./serializationinfo/) 中数据的类之间的连接。 |
| [ISerializable](./iserializable/) | 可序列化对象的接口。此类的对象应仅使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [SerializationInfo](./serializationinfo/) | 保存表示已序列化对象的命名字段集合。未实现。此类的对象应仅使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [StreamingContext](./streamingcontext/) | 虚拟类，用于使使用 StreamingContext 的已翻译类能够编译。不要通过 [SmartPtr](../system/smartptr/) 管理此类的实例，必须仅在栈上分配。 |
