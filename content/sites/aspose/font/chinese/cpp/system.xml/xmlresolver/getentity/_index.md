---
title: "System::Xml::XmlResolver::GetEntity 方法"
linktitle: "GetEntity"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlResolver::GetEntity 方法。若在派生类中被重写，则在 C++ 中将 URI 映射到包含实际资源的对象。"
type: docs
weight: 100
url: /zh/cpp/system.xml/xmlresolver/getentity/
---
## XmlResolver::GetEntity method


在派生类中重写时，将 URI 映射到包含实际资源的对象。

```cpp
virtual SharedPtr<Object> System::Xml::XmlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | 从 [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/) 调用返回的 URI。 |
| role | String | 当前未使用。 |
| ofObjectToReturn | const TypeInfo\& | 要返回的对象类型。当前版本仅返回 Stream 对象。 |

### ReturnValue

流对象；如果指定的类型不是流，则返回 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
