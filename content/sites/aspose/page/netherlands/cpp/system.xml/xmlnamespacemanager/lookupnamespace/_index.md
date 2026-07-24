---
title: "System::Xml::XmlNamespaceManager::LookupNamespace methode"
linktitle: "LookupNamespace"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNamespaceManager::LookupNamespace methode. Retourneert de namespace-URI voor het opgegeven voorvoegsel in C++."
type: docs
weight: 800
url: /nl/cpp/system.xml/xmlnamespacemanager/lookupnamespace/
---
## XmlNamespaceManager::LookupNamespace method


Retourneert de namespace-URI voor de opgegeven prefix.

```cpp
String System::Xml::XmlNamespaceManager::LookupNamespace(const String &prefix) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| prefix | const String\& | Het voorvoegsel waarvan u de namespace-URI wilt oplossen. Om de standaardnamespace te matchen, geeft u [String::Empty](../../../system/string/empty/) door. |

### ReturnValue

De namespace-URI voor **prefix** of **nullptr** als er geen toegewezen namespace is. De geretourneerde string is geatomiseerd. Voor meer informatie over geatomiseerde strings, zie de [XmlNameTable](../../xmlnametable/) klasse.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
