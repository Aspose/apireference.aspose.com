---
title: "System::Net::FileWebRequest 类"
linktitle: "FileWebRequest"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::FileWebRequest 类。提供 WebRequest 抽象类的实现，以便在文件系统上工作。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1000
url: /zh/cpp/system.net/filewebrequest/
---
## FileWebRequest class


提供对抽象类 [WebRequest](../webrequest/) 的实现，以在文件系统上工作。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class FileWebRequest : public System::Net::WebRequest
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Abort](./abort/)() override | 中止当前请求。 |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | 启动异步操作以获取用于向资源写入数据的流。 |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | 启动对资源的异步请求。 |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | 等待指定的获取流的异步操作完成。 |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | 等待指定的资源异步请求完成。 |
| [FileWebRequest](./filewebrequest/)(System::SharedPtr\<Uri\>) | 构造一个新实例。 |
| [get_ContentType](./get_contenttype/)() override | 获取请求的 MIME 类型。 |
| [get_Headers](./get_headers/)() override | 获取 HTTP 标头的集合。 |
| [get_Method](./get_method/)() override | 获取 HTTP 方法。 |
| [get_RequestUri](./get_requesturi/)() override | 返回请求的 URI。 |
| [GetResponse](./getresponse/)() override | 返回与当前 Web 请求关联的 Web 响应。 |
| [set_ContentType](./set_contenttype/)(String) override | 设置请求的 MIME 类型。 |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | 设置 HTTP 头的集合。 |
| [set_Method](./set_method/)(String) override | 设置 HTTP 方法。 |
| [set_Timeout](./set_timeout/)(int) override | RTTI 信息。 |
## 另见

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
