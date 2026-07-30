---
title: "System::Xml::XPath::XPathNavigator::LookupNamespace-Methode"
linktitle: "LookupNamespace"
second_title: "Aspose.Font für C++"
description: "System::Xml::XPath::XPathNavigator::LookupNamespace-Methode. Gibt die Namespace-URI für das angegebene Präfix in C++ zurück."
type: docs
weight: 4700
url: /de/cpp/system.xml.xpath/xpathnavigator/lookupnamespace/
---
## XPathNavigator::LookupNamespace method


Gibt die Namespace‑URI für das angegebene Präfix zurück.

```cpp
String System::Xml::XPath::XPathNavigator::LookupNamespace(const String &prefix) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| prefix | const String\& | Das Präfix, dessen Namespace-URI Sie auflösen möchten. Um den Standard‑Namespace zu verwenden, übergeben Sie [String::Empty](../../../system/string/empty/). |

### ReturnValue

Ein [String](../../../system/string/), der die dem angegebenen Namespace-Präfix zugewiesene Namespace-URI enthält; **nullptr**, wenn dem angegebenen Präfix keine Namespace-URI zugewiesen ist. Der zurückgegebene [String](../../../system/string/) ist atomisiert.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
