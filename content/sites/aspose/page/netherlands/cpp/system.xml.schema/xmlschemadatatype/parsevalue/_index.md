---
title: "System::Xml::Schema::XmlSchemaDatatype::ParseValue methode"
linktitle: "ParseValue"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaDatatype::ParseValue methode. Wanneer overschreven in een afgeleide klasse, valideert het de opgegeven string tegen een ingebouwd of door de gebruiker gedefinieerd simpel type in C++."
type: docs
weight: 700
url: /nl/cpp/system.xml.schema/xmlschemadatatype/parsevalue/
---
## XmlSchemaDatatype::ParseValue method


Wanneer overschreven in een afgeleide klasse, valideert het de opgegeven **string** tegen een ingebouwd of door de gebruiker gedefinieerd eenvoudig type.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ParseValue(String s, SharedPtr<XmlNameTable> nameTable, SharedPtr<IXmlNamespaceResolver> nsmgr)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| s | String | De **string** om te valideren tegen het simpele type. |
| nameTable | SharedPtr\<XmlNameTable\> | De [XmlNameTable](../../../system.xml/xmlnametable/) die moet worden gebruikt voor atomisatie tijdens het parseren van de **string** als dit [XmlSchemaDatatype](../) object het **xs:NCName**‑type vertegenwoordigt. |
| nsmgr | SharedPtr\<IXmlNamespaceResolver\> | Het [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) object dat moet worden gebruikt tijdens het parseren van de **string** als dit [XmlSchemaDatatype](../) object het **xs:QName**‑type vertegenwoordigt. |

### ReturnValue

Een [Object](../../../system/object/) dat veilig kan worden gecast naar het type dat wordt geretourneerd door de [XmlSchemaDatatype::get_ValueType](../get_valuetype/) aanroep.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
