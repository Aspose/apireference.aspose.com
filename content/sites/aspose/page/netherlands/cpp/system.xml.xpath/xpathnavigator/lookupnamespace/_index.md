---
title: "System::Xml::XPath::XPathNavigator::LookupNamespace methode"
linktitle: "LookupNamespace"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XPath::XPathNavigator::LookupNamespace methode. Retourneert de namespace-URI voor het opgegeven voorvoegsel in C++."
type: docs
weight: 4700
url: /nl/cpp/system.xml.xpath/xpathnavigator/lookupnamespace/
---
## XPathNavigator::LookupNamespace method


Retourneert de namespace-URI voor de opgegeven prefix.

```cpp
String System::Xml::XPath::XPathNavigator::LookupNamespace(const String &prefix) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| prefix | const String\& | Het voorvoegsel waarvan u de namespace-URI wilt oplossen. Om de standaardnamespace te matchen, geeft u [String::Empty](../../../system/string/empty/) door. |

### ReturnValue

Een [String](../../../system/string/) die de aan het opgegeven namespace‑voorvoegsel toegewezen namespace‑URI bevat; **nullptr** als er geen namespace‑URI is toegewezen aan het opgegeven voorvoegsel. De geretourneerde [String](../../../system/string/) is geatomiseerd.

## Zie ook

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
