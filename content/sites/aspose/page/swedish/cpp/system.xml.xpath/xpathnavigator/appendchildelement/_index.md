---
title: "System::Xml::XPath::XPathNavigator::AppendChildElement metod"
linktitle: "AppendChildElement"
second_title: "Aspose.Page för C++"
description: "System::Xml::XPath::XPathNavigator::AppendChildElement metod. Skapar ett nytt barn‑elementnod i slutet av listan med barnnoder för den aktuella noden med hjälp av det angivna namespace‑prefixet, lokala namnet och namespace‑URI:n med det angivna värdet i C++."
type: docs
weight: 200
url: /sv/cpp/system.xml.xpath/xpathnavigator/appendchildelement/
---
## XPathNavigator::AppendChildElement method


Skapar en ny barn‑elementnod i slutet av listan med barnnoder för den aktuella noden med det angivna namnrymdspr-prefixet, det lokala namnet och namnrymds‑URI:n samt det angivna värdet.

```cpp
virtual void System::Xml::XPath::XPathNavigator::AppendChildElement(String prefix, String localName, String namespaceURI, String value)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| prefix | String | Namespace‑prefixet för det nya barn‑elementnoden (om något). |
| localName | String | Det lokala namnet för det nya barn‑elementnoden (om något). |
| namespaceURI | String | Namespace-URI för det nya underordnade elementnoden (om någon). [String::Empty](../../../system/string/empty/) och **nullptr** är ekvivalenta. |
| value | String | Värdet för den nya underordnade elementnoden. Om [String::Empty](../../../system/string/empty/) eller **nullptr** skickas, skapas ett tomt element. |

## Se även

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
