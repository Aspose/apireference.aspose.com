---
title: "System::Net::Sockets::LingerOption 类"
linktitle: "LingerOption"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::LingerOption 类。指定套接字在调用 Close() 或 Close() 方法后是否保持连接。它还指定在数据发送持续时套接字保持连接的时间段。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 200
url: /zh/cpp/system.net.sockets/lingeroption/
---
## LingerOption class


指定套接字在调用 Close() 或 Close() 方法后是否保持连接。它还指定在数据发送持续时套接字保持连接的时间段。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class LingerOption : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Enabled](./get_enabled/)() | RTTI 信息。 |
| [get_LingerTime](./get_lingertime/)() | 获取以秒为单位的延迟超时时间。 |
| [LingerOption](./lingeroption/)(bool, int32_t) | 构造一个新实例。 |
| [set_Enabled](./set_enabled/)(bool) | 设置一个值，指示套接字是否会延迟关闭以尝试发送所有未完成的数据。 |
| [set_LingerTime](./set_lingertime/)(int32_t) | 设置以秒为单位的延迟超时时间。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
