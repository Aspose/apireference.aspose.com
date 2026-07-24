---
title: "System::Xml::XPath::XPathNavigator::ValueAs methode"
linktitle: "ValueAs"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XPath::XPathNavigator::ValueAs methode. Retourneert de waarde van het huidige knooppunt als het opgegeven Type, met gebruik van het opgegeven IXmlNamespaceResolver-object om naamruimteprefixen op te lossen in C++."
type: docs
weight: 8100
url: /nl/cpp/system.xml.xpath/xpathnavigator/valueas/
---
## XPathNavigator::ValueAs method


Retourneert de waarde van het huidige knooppunt als het opgegeven Type, met gebruik van het opgegeven [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) object om naamruimteprefixen op te lossen.

```cpp
SharedPtr<Object> System::Xml::XPath::XPathNavigator::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| returnType | const TypeInfo\& | Het Type waarin de waarde van het huidige knooppunt moet worden geretourneerd. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | Het [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)-object dat wordt gebruikt om namespace‑prefixen op te lossen. |

### ReturnValue

De waarde van het huidige knooppunt als het aangevraagde Type.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
