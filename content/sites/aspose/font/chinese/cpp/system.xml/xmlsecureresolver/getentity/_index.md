---
title: "System::Xml::XmlSecureResolver::GetEntity 方法"
linktitle: "GetEntity"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlSecureResolver::GetEntity 方法。在 C++ 中将 URI 映射到包含实际资源的对象。"
type: docs
weight: 200
url: /zh/cpp/system.xml/xmlsecureresolver/getentity/
---
## XmlSecureResolver::GetEntity method


将 URI 映射到包含实际资源的对象。

```cpp
SharedPtr<Object> System::Xml::XmlSecureResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | 从 [XmlSecureResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/) 调用返回的 URI。 |
| role | String | 当前未使用。 |
| ofObjectToReturn | const TypeInfo\& | 要返回的对象类型。当前版本仅返回 Stream 对象。 |

### ReturnValue

通过对底层 [XmlResolver](../../xmlresolver/) 调用 **GetEntity** 返回的流。如果指定的类型不是 Stream，则该方法返回 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
