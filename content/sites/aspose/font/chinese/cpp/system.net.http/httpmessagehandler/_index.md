---
title: "System::Net::Http::HttpMessageHandler 类"
linktitle: "HttpMessageHandler"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::HttpMessageHandler 类。表示 HTTP 消息处理程序的基类型。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 500
url: /zh/cpp/system.net.http/httpmessagehandler/
---
## HttpMessageHandler class


表示 HTTP 消息处理程序的基类型。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HttpMessageHandler : public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Dispose](./dispose/)() override | 不执行任何操作。 |
| virtual [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) | RTTI 信息。 |
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
