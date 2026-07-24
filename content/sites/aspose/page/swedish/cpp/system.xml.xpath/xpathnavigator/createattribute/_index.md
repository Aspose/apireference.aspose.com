---
title: "System::Xml::XPath::XPathNavigator::CreateAttribute metod"
linktitle: "CreateAttribute"
second_title: "Aspose.Page för C++"
description: "System::Xml::XPath::XPathNavigator::CreateAttribute metod. Skapar en attributnod på det aktuella elementnodet med hjälp av namnrymdsprefixet, det lokala namnet och namnrymd-URI:n som anges med det värde som anges i C++."
type: docs
weight: 700
url: /sv/cpp/system.xml.xpath/xpathnavigator/createattribute/
---
## XPathNavigator::CreateAttribute method


Skapar en attributnod på den aktuella elementnoden med det angivna namnrymdspr-prefixet, det lokala namnet och namnrymds‑URI:n samt det angivna värdet.

```cpp
virtual void System::Xml::XPath::XPathNavigator::CreateAttribute(String prefix, String localName, String namespaceURI, String value)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| prefix | String | Namnrymdsprefixet för den nya attributnoden (om någon). |
| localName | String | Det lokala namnet för den nya attributnoden som inte kan vara [String::Empty](../../../system/string/empty/) eller **nullptr**. |
| namespaceURI | String | Namnrymd-URI:n för den nya attributnoden (om någon). |
| value | String | Värdet för den nya attributnoden. Om [String::Empty](../../../system/string/empty/) eller **nullptr** skickas, skapas en tom attributnod. |

## Se även

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
