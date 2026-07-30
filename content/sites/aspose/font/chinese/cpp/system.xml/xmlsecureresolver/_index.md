---
title: "System::Xml::XmlSecureResolver 类"
linktitle: "XmlSecureResolver"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlSecureResolver 类。通过包装 XmlResolver 对象并限制底层 XmlResolver 可访问的资源，帮助保护 XmlResolver 的另一实现，适用于 C++。"
type: docs
weight: 3600
url: /zh/cpp/system.xml/xmlsecureresolver/
---
## XmlSecureResolver class


通过包装 [XmlResolver](../xmlresolver/) 对象并限制底层 [XmlResolver](../xmlresolver/) 可访问的资源，帮助保护另一实现的 [XmlResolver](../xmlresolver/)。

```cpp
class XmlSecureResolver : public System::Xml::XmlResolver
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | 将 URI 映射到包含实际资源的对象。 |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | 通过在底层 [XmlResolver](../xmlresolver/) 上调用 **ResolveUri**，解析基 URI 和相对 URI 的绝对 URI。 |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | 设置用于身份验证 Web 请求的凭据。 |
| [XmlSecureResolver](./xmlsecureresolver/)(const SharedPtr\<XmlResolver\>\&, const String\&) | 使用提供的 [XmlResolver](../xmlresolver/) 和 URL 初始化 [XmlSecureResolver](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlResolver](../xmlresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
