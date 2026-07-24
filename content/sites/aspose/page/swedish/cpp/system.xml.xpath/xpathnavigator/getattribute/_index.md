---
title: "System::Xml::XPath::XPathNavigator::GetAttribute method"
linktitle: "GetAttribute"
second_title: "Aspose.Page för C++"
description: "System::Xml::XPath::XPathNavigator::GetAttribute method. Returnerar värdet på attributet med det angivna lokala namnet och namnrymdens URI i C++."
type: docs
weight: 3800
url: /sv/cpp/system.xml.xpath/xpathnavigator/getattribute/
---
## XPathNavigator::GetAttribute method


Returnerar värdet på attributet med det angivna lokala namnet och namnrymdens URI.

```cpp
virtual String System::Xml::XPath::XPathNavigator::GetAttribute(String localName, String namespaceURI)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| localName | String | Det lokala namnet på attributet. **localName** är skiftlägeskänsligt. |
| namespaceURI | String | Namnrymd‑URI:n för attributet. |

### ReturnValue

En [String](../../../system/string/) som innehåller värdet för det angivna attributet; [String::Empty](../../../system/string/empty/) om ett matchande attribut inte hittas, eller om [XPathNavigator](../) inte är placerad på ett elementnod.

## Se även

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
