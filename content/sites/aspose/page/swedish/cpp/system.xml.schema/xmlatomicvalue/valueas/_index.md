---
title: "System::Xml::Schema::XmlAtomicValue::ValueAs method"
linktitle: "ValueAs"
second_title: "Aspose.Page för C++"
description: "System::Xml::Schema::XmlAtomicValue::ValueAs method. Returnerar det validerade XML-elementets eller attributets värde som den typ som anges med IXmlNamespaceResolver‑objektet som specificeras för att lösa namnrymdsprefix i C++."
type: docs
weight: 1300
url: /sv/cpp/system.xml.schema/xmlatomicvalue/valueas/
---
## XmlAtomicValue::ValueAs method


Returnerar det validerade XML-elementets eller attributets värde som den typ som anges med hjälp av [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)-objektet som specificeras för att lösa namnrymdsprefix.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlAtomicValue::ValueAs(const TypeInfo &type, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| typ | const TypeInfo\& | Typen att returnera det validerade XML-elementets eller attributets värde som. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | Det [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)-objekt som används för att lösa namnrymdsprefix. |

### ReturnValue

Värdet på det validerade XML-elementet eller attributet i den begärda typen.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlAtomicValue](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
