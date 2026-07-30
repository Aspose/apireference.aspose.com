---
title: "System::Xml::XPath::XPathNamespaceScope 枚举"
linktitle: "XPathNamespaceScope"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathNamespaceScope 枚举。定义了 C++ 中的命名空间范围。"
type: docs
weight: 1000
url: /zh/cpp/system.xml.xpath/xpathnamespacescope/
---
## XPathNamespaceScope enum


定义命名空间范围。

```cpp
enum class XPathNamespaceScope
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 全部 | 0 | 返回在当前节点范围内定义的所有命名空间。这包括始终隐式声明的 **xmlns:xml** 命名空间。返回的命名空间顺序未定义。 |
| ExcludeXml | 1 | 返回在当前节点范围内定义的所有命名空间，但不包括 **xmlns:xml** 命名空间。**xmlns:xml** 命名空间始终隐式声明。返回的命名空间顺序未定义。 |
| Local | 2 | 返回在当前节点本地定义的所有命名空间。 |

## 另见

* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
