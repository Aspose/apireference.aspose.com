---
title: "System::Net::HttpWebResponse 类"
linktitle: "HttpWebResponse"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::HttpWebResponse 类。表示 HTTP 网络响应。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 2100
url: /zh/cpp/system.net/httpwebresponse/
---
## HttpWebResponse class


表示 HTTP 网络响应。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HttpWebResponse : public System::Net::WebResponse
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Close](./close/)() override | 关闭响应流。 |
| [get_CharacterSet](./get_characterset/)() | 未实现。 |
| [get_ContentLength](./get_contentlength/)() override | RTTI 信息。 |
| [get_ContentType](./get_contenttype/)() override | 返回资源的 MIME 类型。 |
| virtual [get_Cookies](./get_cookies/)() | 返回与网络响应关联的 Cookie。 |
| [get_Headers](./get_headers/)() override | 返回与当前响应关联的标头集合。 |
| virtual [get_Method](./get_method/)() | 返回 HTTP 方法。 |
| [get_ResponseUri](./get_responseuri/)() override | 返回资源的 URI。 |
| virtual [get_StatusCode](./get_statuscode/)() | 返回与 Web 响应关联的 HTTP 状态码。 |
| virtual [get_StatusDescription](./get_statusdescription/)() | 返回状态码的字符串表示形式。 |
| [get_SupportsHeaders](./get_supportsheaders/)() override | 返回一个指示当前响应是否支持标头的值。 |
| [GetResponseHeader](./getresponseheader/)(String) | 返回指定标头名称对应的值。 |
| [GetResponseStream](./getresponsestream/)() override | 返回响应流。 |
| [HttpWebResponse](./httpwebresponse/)(System::SharedPtr\<Http::HttpResponseMessage\>, System::SharedPtr\<Uri\>, System::SharedPtr\<CookieContainer\>) | 构造一个新实例。 |
## 另见

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
