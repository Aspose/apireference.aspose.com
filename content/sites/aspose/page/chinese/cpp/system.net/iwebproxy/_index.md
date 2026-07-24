---
title: "System::Net::IWebProxy 类"
linktitle: "IWebProxy"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::IWebProxy 类。此接口用于实现对 WebRequest 类的代理访问。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 2700
url: /zh/cpp/system.net/iwebproxy/
---
## IWebProxy class


此接口用于实现对 [WebRequest](../webrequest/) 类的代理访问。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数中作为参数传递。

```cpp
class IWebProxy : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [get_Credentials](./get_credentials/)() | RTTI 信息。 |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | 返回代理 URI。 |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | 返回一个值，指示是否不应对指定的主机使用代理。 |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | 设置用于代理服务器身份验证的凭据。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
