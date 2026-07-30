---
title: "System::Net::Http::Headers::HttpContentHeaders 类"
linktitle: "HttpContentHeaders"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::HttpContentHeaders 类。表示 “Content” 头的集合。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 600
url: /zh/cpp/system.net.http.headers/httpcontentheaders/
---
## HttpContentHeaders class


表示 'Content' 头的集合。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HttpContentHeaders : public System::Net::Http::Headers::HttpHeaders
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | 将已知的标头添加到指定的集合中。 |
| [get_Allow](./get_allow/)() | RTTI 信息。 |
| [get_ContentDisposition](./get_contentdisposition/)() | 获取 'Content-Disposition' 头的值。 |
| [get_ContentEncoding](./get_contentencoding/)() | 获取 'Content-Encoding' 头的值。 |
| [get_ContentLanguage](./get_contentlanguage/)() | 获取 'Content-Language' 头的值。 |
| [get_ContentLength](./get_contentlength/)() | 获取 'Content-Length' 头的值。 |
| [get_ContentLocation](./get_contentlocation/)() | 获取 'Content-Location' 头的值。 |
| [get_ContentMD5](./get_contentmd5/)() | 获取 'Content-MD5' 标头的值。 |
| [get_ContentRange](./get_contentrange/)() | 获取 'Content-Range' 标头的值。 |
| [get_ContentType](./get_contenttype/)() | 获取 'Content-Type' 标头的值。 |
| [get_Expires](./get_expires/)() | 获取 'Expires' 标头的值。 |
| [get_LastModified](./get_lastmodified/)() | 获取 'Last-Modified' 标头的值。 |
| [HttpContentHeaders](./httpcontentheaders/)(HeaderFunc\<Nullable\<int64_t\>\>) | 构造一个新实例。 |
| [set_ContentDisposition](./set_contentdisposition/)(System::SharedPtr\<ContentDispositionHeaderValue\>) | 设置 'Content-Disposition' 标头的值。 |
| [set_ContentLength](./set_contentlength/)(Nullable\<int64_t\>) | 设置 'Content-Length' 标头的值。 |
| [set_ContentLocation](./set_contentlocation/)(System::SharedPtr\<Uri\>) | 设置 'Content-Location' 标头的值。 |
| [set_ContentMD5](./set_contentmd5/)(System::ArrayPtr\<uint8_t\>) | 设置 'Content-MD5' 标头的值。 |
| [set_ContentRange](./set_contentrange/)(System::SharedPtr\<ContentRangeHeaderValue\>) | 设置 'Content-Range' 标头的值。 |
| [set_ContentType](./set_contenttype/)(System::SharedPtr\<MediaTypeHeaderValue\>) | 设置 'Content-Type' 标头的值。 |
| [set_Expires](./set_expires/)(Nullable\<DateTimeOffset\>) | 设置 'Expires' 标头的值。 |
| [set_LastModified](./set_lastmodified/)(Nullable\<DateTimeOffset\>) | 设置 'Last-Modified' 标头的值。 |
## 另见

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
