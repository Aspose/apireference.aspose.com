---
title: "System::Xml::XmlUrlResolver 类"
linktitle: "XmlUrlResolver"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlUrlResolver 类。解析 C++ 中由统一资源标识符（URI）命名的外部 XML 资源。"
type: docs
weight: 4100
url: /zh/cpp/system.xml/xmlurlresolver/
---
## XmlUrlResolver class


解析由统一资源标识符 (URI) 命名的外部 XML 资源。

```cpp
class XmlUrlResolver : public System::Xml::XmlResolver
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | 将 URI 映射到包含实际资源的对象。 |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | 从基准 URI 和相对 URI 解析出绝对 URI。 |
| [set_CachePolicy](./set_cachepolicy/)(const SharedPtr\<Net::Cache::RequestCachePolicy\>\&) | 设置底层 WebRequest 对象的缓存策略。 |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | 设置用于身份验证 Web 请求的凭据。 |
| [set_Proxy](./set_proxy/)(const SharedPtr\<Net::IWebProxy\>\&) | 设置底层 WebRequest 对象的网络代理。 |
| [XmlUrlResolver](./xmlurlresolver/)() | 初始化 [XmlUrlResolver](./) 类的新实例。 |
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
