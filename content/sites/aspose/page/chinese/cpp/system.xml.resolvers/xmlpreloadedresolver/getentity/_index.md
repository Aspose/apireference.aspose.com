---
title: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity 方法"
linktitle: "GetEntity"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity 方法。在 C++ 中将 URI 映射到包含实际资源的对象。"
type: docs
weight: 400
url: /zh/cpp/system.xml.resolvers/xmlpreloadedresolver/getentity/
---
## XmlPreloadedResolver::GetEntity method


将 URI 映射到包含实际资源的对象。

```cpp
SharedPtr<Object> System::Xml::Resolvers::XmlPreloadedResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | 从 [XmlResolver::ResolveUri(SharedPtr<Uri>,String)](../../../system.xml/xmlresolver/resolveuri/) 调用返回的 URI。 |
| 角色 | 字符串 | 当前未使用。 |
| ofObjectToReturn | const TypeInfo\& | 要返回的对象类型。 [XmlPreloadedResolver](../) 支持对以 [String](../../../system/string/) 添加的 URI 使用 Stream 对象和 TextReader 对象。如果解析器不支持请求的类型，将抛出异常。使用 XmlPreloadedResolver::SupportsType(SharedPtr<Uri>,TypeInfo) 方法来确定此解析器是否支持特定的 **Type**。 |

### ReturnValue

对应实际源的 Stream 或 TextReader 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
