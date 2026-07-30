---
title: "System::Xml::XmlUrlResolver::GetEntity 方法"
linktitle: "GetEntity"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlUrlResolver::GetEntity 方法。将 URI 映射到包含实际资源的对象（在 C++ 中）。"
type: docs
weight: 200
url: /zh/cpp/system.xml/xmlurlresolver/getentity/
---
## XmlUrlResolver::GetEntity method


将 URI 映射到包含实际资源的对象。

```cpp
SharedPtr<Object> System::Xml::XmlUrlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | 从 [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../../xmlresolver/resolveuri/) 调用返回的 URI。 |
| role | String | 当前未使用。 |
| ofObjectToReturn | const TypeInfo\& | 要返回的对象类型。当前实现仅返回 Stream 对象。 |

### ReturnValue

流对象；如果指定的类型不是流，则返回 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
