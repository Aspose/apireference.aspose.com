---
title: "System::Xml::Resolvers::XmlPreloadedResolver class"
linktitle: "XmlPreloadedResolver"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver 类。表示一个用于在 C++ 中预填充缓存（包含 DTD 或 XML 流）的类。"
type: docs
weight: 100
url: /zh/cpp/system.xml.resolvers/xmlpreloadedresolver/
---
## XmlPreloadedResolver class


表示用于使用 DTD 或 XML 流预填充缓存的类。

```cpp
class XmlPreloadedResolver : public System::Xml::XmlResolver
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&) | 向 [XmlPreloadedResolver](./) 存储添加字节数组并将其映射到 URI。如果存储已包含相同 URI 的映射，则覆盖现有映射。 |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | 向 [XmlPreloadedResolver](./) 存储添加字节数组并将其映射到 URI。如果存储已包含相同 URI 的映射，则覆盖现有映射。 |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const SharedPtr\<IO::Stream\>\&) | 向 [XmlPreloadedResolver](./) 存储添加流并将其映射到 URI。如果存储已包含相同 URI 的映射，则覆盖现有映射。 |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const String\&) | 向 [XmlPreloadedResolver](./) 存储添加包含预加载数据的字符串并将其映射到 URI。如果存储已包含相同 URI 的映射，则覆盖现有映射。 |
| [get_PreloadedUris](./get_preloadeduris/)() | 返回一个预加载 URI 的集合。 |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | 将 URI 映射到包含实际资源的对象。 |
| [Remove](./remove/)(const SharedPtr\<Uri\>\&) | 从 [XmlPreloadedResolver](./) 中移除与该 URI 对应的数据。 |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | 从基准 URI 和相对 URI 解析出绝对 URI。 |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | 设置用于验证底层 [Net::WebRequest](../../system.net/webrequest/) 的凭据。 |
| [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) override | 确定解析器是否支持除 Stream 之外的其他类型。 |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)() | 初始化 [XmlPreloadedResolver](./) 类的新实例。 |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(XmlKnownDtds) | 使用指定的预加载已知 DTD 初始化 [XmlPreloadedResolver](./) 类的新实例。 |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&) | 使用指定的回退解析器初始化 [XmlPreloadedResolver](./) 类的新实例。 |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds) | 使用指定的回退解析器和预加载已知 DTD 初始化 [XmlPreloadedResolver](./) 类的新实例。 |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds, const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\&) | 使用指定的回退解析器、预加载已知 DTD 和 URI 相等比较器初始化 [XmlPreloadedResolver](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlResolver](../../system.xml/xmlresolver/)
* Namespace [System::Xml::Resolvers](../)
* Library [Aspose.Font for C++](../../)
