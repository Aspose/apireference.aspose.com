---
title: "System::Net::WebClient 类"
linktitle: "WebClient"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::WebClient 类。WebClient 提供用于发送和接收数据的通用方法。该类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 3500
url: /zh/cpp/system.net/webclient/
---
## WebClient class


[WebClient](./) provides common methods for sending and receiving data. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class WebClient : public System::ComponentModel::Component
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [DownloadData](./downloaddata/)(const String\&) const | 将指定资源下载为字节数组。 |
| [DownloadData](./downloaddata/)(const SharedPtr\<Uri\>\&) const | 将指定资源下载为字节数组。 |
| [DownloadString](./downloadstring/)(const String\&) const | 将指定资源下载为字符串。 |
| [DownloadString](./downloadstring/)(const SharedPtr\<Uri\>\&) const | 将指定资源下载为字符串。 |
| [get_Encoding](./get_encoding/)() const | 获取用于下载或上传字符串的编码。 |
| [set_Encoding](./set_encoding/)(const SharedPtr\<Text::Encoding\>\&) | 设置用于下载或上传字符串的编码。 |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | 未实现。 |
| [WebClient](./webclient/)() | RTTI 信息。 |
| [~WebClient](./~webclient/)() | 销毁当前实例。 |
## 另见

* Class [Component](../../system.componentmodel/component/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
