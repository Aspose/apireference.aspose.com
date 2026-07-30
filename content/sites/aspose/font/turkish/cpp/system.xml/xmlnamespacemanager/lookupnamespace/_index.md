---
title: "System::Xml::XmlNamespaceManager::LookupNamespace metodu"
linktitle: "LookupNamespace"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNamespaceManager::LookupNamespace yöntemi. Belirtilen önek için ad alanı URI'sını C++'da döndürür."
type: docs
weight: 800
url: /tr/cpp/system.xml/xmlnamespacemanager/lookupnamespace/
---
## XmlNamespaceManager::LookupNamespace method


Belirtilen önek için ad alanı URI'sini döndürür.

```cpp
String System::Xml::XmlNamespaceManager::LookupNamespace(const String &prefix) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| prefix | const String\& | Ad alanı URI'sını çözmek istediğiniz önek. Varsayılan ad alanıyla eşleşmek için [String::Empty](../../../system/string/empty/) değerini geçirin. |

### ReturnValue

**prefix** için ad alanı URI'sı veya eşlenmiş bir ad alanı yoksa **nullptr**. Döndürülen dize atomiktir. Atomik dizeler hakkında daha fazla bilgi için [XmlNameTable](../../xmlnametable/) sınıfına bakın.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
