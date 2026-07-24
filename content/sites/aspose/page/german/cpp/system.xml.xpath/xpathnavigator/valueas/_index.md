---
title: "System::Xml::XPath::XPathNavigator::ValueAs-Methode"
linktitle: "ValueAs"
second_title: "Aspose.Page für C++"
description: "System::Xml::XPath::XPathNavigator::ValueAs-Methode. Gibt den Wert des aktuellen Knotens als den angegebenen Typ zurück und verwendet das angegebene IXmlNamespaceResolver-Objekt, um Namespace-Präfixe in C++ aufzulösen."
type: docs
weight: 8100
url: /de/cpp/system.xml.xpath/xpathnavigator/valueas/
---
## XPathNavigator::ValueAs method


Gibt den Wert des aktuellen Knotens als den angegebenen Typ zurück und verwendet das angegebene [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)-Objekt, um Namespace-Präfixe aufzulösen.

```cpp
SharedPtr<Object> System::Xml::XPath::XPathNavigator::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| returnType | const TypeInfo\\& | Der Typ, in den der Wert des aktuellen Knotens zurückgegeben werden soll. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | Das [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)-Objekt, das zur Auflösung von Namensraumpräfixen verwendet wird. |

### ReturnValue

Der Wert des aktuellen Knotens als der angeforderte Typ.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
