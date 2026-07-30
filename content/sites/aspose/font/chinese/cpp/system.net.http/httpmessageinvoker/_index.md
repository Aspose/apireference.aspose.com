---
title: "System::Net::Http::HttpMessageInvoker 类"
linktitle: "HttpMessageInvoker"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::HttpMessageInvoker 类。允许应用程序在 HTTP 处理程序链上调用 Send 方法。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 600
url: /zh/cpp/system.net.http/httpmessageinvoker/
---
## HttpMessageInvoker class


允许应用程序在 HTTP 处理程序链上调用 Send 方法。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HttpMessageInvoker : public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Dispose](./dispose/)() override | 释放当前实例。如果需要，此方法还会释放处理程序。 |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>) | RTTI 信息。 |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>, bool) | 构造一个新实例。 |
| virtual [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) | 发送指定的请求。 |
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
