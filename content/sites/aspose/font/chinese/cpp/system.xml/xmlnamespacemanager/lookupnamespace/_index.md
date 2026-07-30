---
title: "System::Xml::XmlNamespaceManager::LookupNamespace method"
linktitle: "LookupNamespace"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNamespaceManager::LookupNamespace 方法。返回在 C++ 中指定前缀的命名空间 URI。"
type: docs
weight: 800
url: /zh/cpp/system.xml/xmlnamespacemanager/lookupnamespace/
---
## XmlNamespaceManager::LookupNamespace method


返回指定前缀的命名空间 URI。

```cpp
String System::Xml::XmlNamespaceManager::LookupNamespace(const String &prefix) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| prefix | const String\& | 要解析其命名空间 URI 的前缀。若要匹配默认命名空间，请传入 [String::Empty](../../../system/string/empty/)。 |

### ReturnValue

**prefix** 的命名空间 URI，若没有映射的命名空间则返回 **nullptr**。返回的字符串已原子化。有关原子化字符串的更多信息，请参阅 [XmlNameTable](../../xmlnametable/) 类。

## 另见

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
