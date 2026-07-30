---
title: "System::Xml::XmlResolver 类"
linktitle: "XmlResolver"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlResolver 类。解析 C++ 中由统一资源标识符（URI）命名的外部 XML 资源。"
type: docs
weight: 3500
url: /zh/cpp/system.xml/xmlresolver/
---
## XmlResolver class


解析由统一资源标识符 (URI) 命名的外部 XML 资源。

```cpp
class XmlResolver : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) | 在派生类中重写时，将 URI 映射到包含实际资源的对象。 |
| virtual [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) | 在派生类中重写时，从基 URI 和相对 URI 解析出绝对 URI。 |
| virtual [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) | 在派生类中重写时，设置用于验证网络请求的凭据。 |
| virtual [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) | 使解析器能够返回除 Stream 之外的其他类型。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
