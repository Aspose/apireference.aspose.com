---
title: "System::Xml::XmlNamespaceManager::LookupNamespace yöntemi"
linktitle: "LookupNamespace"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlNamespaceManager::LookupNamespace yöntemi. Belirtilen önek için ad alanı URI'sını C++'de döndürür."
type: docs
weight: 800
url: /tr/cpp/system.xml/xmlnamespacemanager/lookupnamespace/
---
## XmlNamespaceManager::LookupNamespace method


Belirtilen önek için ad alanı URI'sini döndürür.

```cpp
String System::Xml::XmlNamespaceManager::LookupNamespace(const String &prefix) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| prefix | const String\& | Ad alanı URI'sını çözmek istediğiniz önek. Varsayılan ad alanıyla eşleşmek için [String::Empty](../../../system/string/empty/) geçirin. |

### ReturnValue

Belirtilen **prefix** için ad alanı URI'sı veya eşlenmiş bir ad alanı yoksa **nullptr**. Döndürülen dize atomize edilmiştir. Atomize edilmiş dizeler hakkında daha fazla bilgi için [XmlNameTable](../../xmlnametable/) sınıfına bakın.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
