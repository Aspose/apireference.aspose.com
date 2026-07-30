---
title: "System::Xml::IXmlNamespaceResolver 类"
linktitle: "IXmlNamespaceResolver"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::IXmlNamespaceResolver 类。提供对 C++ 中一组前缀和命名空间映射的只读访问。"
type: docs
weight: 400
url: /zh/cpp/system.xml/ixmlnamespaceresolver/
---
## IXmlNamespaceResolver class


提供对一组前缀和命名空间映射的只读访问。

```cpp
class IXmlNamespaceResolver : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) | 返回当前作用域中已定义的前缀-命名空间映射集合。 |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | 返回映射到指定前缀的命名空间 URI。 |
| virtual [LookupPrefix](./lookupprefix/)(const String\&) | 返回映射到指定命名空间 URI 的前缀。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
