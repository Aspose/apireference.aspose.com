---
title: "System::Net::WebRequest::HttpRequestCreator 类"
linktitle: "HttpRequestCreator"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::WebRequest::HttpRequestCreator 类。创建 WebRequest 类的实例。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 3900
url: /zh/cpp/system.net/webrequest/httprequestcreator/
---
## HttpRequestCreator class


创建 WebRequest 类的实例。此类的对象只能使用 [System::MakeObject()](../../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HttpRequestCreator : public System::Net::IWebRequestCreate
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Create](./create/)(System::SharedPtr\<Uri\>) | 使用指定的 URI 创建 WebRequest 类的新实例。 |
## 另见

* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
