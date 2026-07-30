---
title: "System::Xml::XPath::XPathNavigator::LookupNamespace yöntemi"
linktitle: "LookupNamespace"
second_title: "Aspose.Font için C++"
description: "System::Xml::XPath::XPathNavigator::LookupNamespace yöntemi. Belirtilen önek için ad alanı URI'sını C++'da döndürür."
type: docs
weight: 4700
url: /tr/cpp/system.xml.xpath/xpathnavigator/lookupnamespace/
---
## XPathNavigator::LookupNamespace method


Belirtilen önek için ad alanı URI'sini döndürür.

```cpp
String System::Xml::XPath::XPathNavigator::LookupNamespace(const String &prefix) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| prefix | const String\& | Ad alanı URI'sını çözmek istediğiniz önek. Varsayılan ad alanıyla eşleşmek için [String::Empty](../../../system/string/empty/) değerini geçirin. |

### ReturnValue

Belirtilen ad alanı önekine atanmış ad alanı URI'sını içeren bir [String](../../../system/string/); **nullptr** eğer önek için ad alanı URI'sı atanmadıysa. Döndürülen [String](../../../system/string/) atomiktir.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
