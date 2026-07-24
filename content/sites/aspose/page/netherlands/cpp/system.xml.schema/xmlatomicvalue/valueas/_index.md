---
title: "System::Xml::Schema::XmlAtomicValue::ValueAs method"
linktitle: "ValueAs"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlAtomicValue::ValueAs method. Retourneert de waarde van het gevalideerde XML-element of attribuut''s als het type gespecificeerd met behulp van het IXmlNamespaceResolver-object dat is opgegeven om namespace‑prefixen op te lossen in C++."
type: docs
weight: 1300
url: /nl/cpp/system.xml.schema/xmlatomicvalue/valueas/
---
## XmlAtomicValue::ValueAs method


Retourneert de waarde van het gevalideerde XML-element of attribuut als het type gespecificeerd met behulp van het [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)-object dat is opgegeven om namespace‑prefixen op te lossen.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlAtomicValue::ValueAs(const TypeInfo &type, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| type | const TypeInfo\& | Het type waarin de waarde van het gevalideerde XML-element of attribuut moet worden geretourneerd. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | Het [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)-object dat wordt gebruikt om namespace‑prefixen op te lossen. |

### ReturnValue

De waarde van het gevalideerde XML-element of attribuut als het aangevraagde type.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlAtomicValue](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
