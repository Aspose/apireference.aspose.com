---
title: "System::Net::FileWebResponse class"
linktitle: "FileWebResponse"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::FileWebResponse 类。提供对 WebResponse 抽象类的实现，以在文件系统上工作。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 1100
url: /zh/cpp/system.net/filewebresponse/
---
## FileWebResponse class


提供对 [WebResponse](../webresponse/) 抽象类的实现，以在文件系统上工作。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class FileWebResponse : public System::Net::WebResponse
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Close](./close/)() override | 关闭响应流。 |
| [FileWebResponse](./filewebresponse/)(System::SharedPtr\<Uri\>) | 构造一个新实例。 |
| [get_ContentLength](./get_contentlength/)() override | RTTI 信息。 |
| [get_ContentType](./get_contenttype/)() override | 返回资源的 MIME 类型。 |
| [get_Headers](./get_headers/)() override | 返回与当前响应关联的标头集合。 |
| [get_ResponseUri](./get_responseuri/)() override | 返回资源的 URI。 |
| [get_SupportsHeaders](./get_supportsheaders/)() override | 返回一个指示当前响应是否支持标头的值。 |
| [GetResponseStream](./getresponsestream/)() override | 返回响应流。 |
## 另见

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
