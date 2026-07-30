---
title: "System::Net::WebResponse class"
linktitle: "WebResponse"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::WebResponse 类。表示一个 Web 响应。此类的对象应仅通过 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 4000
url: /zh/cpp/system.net/webresponse/
---
## WebResponse class


表示一个 Web 响应。此类的对象应仅通过 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class WebResponse : public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Close](./close/)() | 关闭响应流。 |
| [Dispose](./dispose/)() override | 不执行任何操作。 |
| virtual [get_ContentLength](./get_contentlength/)() | RTTI 信息。 |
| virtual [get_ContentType](./get_contenttype/)() | 返回资源的 MIME 类型。 |
| virtual [get_Headers](./get_headers/)() | 返回与当前响应关联的标头集合。 |
| virtual [get_ResponseUri](./get_responseuri/)() | 返回资源的 URI。 |
| virtual [get_SupportsHeaders](./get_supportsheaders/)() | 返回一个指示当前响应是否支持标头的值。 |
| virtual [GetResponseStream](./getresponsestream/)() | 返回响应流。 |
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
