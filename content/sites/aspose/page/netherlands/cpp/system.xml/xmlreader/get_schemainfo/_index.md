---
title: "System::Xml::XmlReader::get_SchemaInfo methode"
linktitle: "get_SchemaInfo"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReader::get_SchemaInfo methode. Retourneert de schemainformatie die aan het huidige knooppunt is toegewezen als gevolg van schema‑validatie in C++."
type: docs
weight: 2200
url: /nl/cpp/system.xml/xmlreader/get_schemainfo/
---
## XmlReader::get_SchemaInfo method


Retourneert de schemainformatie die aan het huidige knooppunt is toegewezen als resultaat van schemavalidatie.

```cpp
virtual SharedPtr<Schema::IXmlSchemaInfo> System::Xml::XmlReader::get_SchemaInfo()
```


### ReturnValue

Een IXmlSchemaInfo-object dat de schemainformatie voor het huidige knooppunt bevat. [Schema](../../../system.xml.schema/) informatie kan worden ingesteld op elementen, attributen of op tekstknooppunten met een niet‑null [XmlReader::get_ValueType](../get_valuetype/) waarde. Als het huidige knooppunt geen van de bovenstaande knooppunt‑types is, of als de [XmlReader](../) instantie geen schemainformatie rapporteert, retourneert deze methode **nullptr**. Als deze methode wordt aangeroepen vanuit een [XmlTextReader](../../xmltextreader/) of een [XmlValidatingReader](../../xmlvalidatingreader/) object, retourneert deze methode altijd **nullptr**. Deze [XmlReader](../) implementaties onthullen geen schemainformatie via de get_SchemaInfo-methode.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXmlSchemaInfo](../../../system.xml.schema/ixmlschemainfo/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
