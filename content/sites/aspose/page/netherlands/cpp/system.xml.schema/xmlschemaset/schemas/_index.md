---
title: "System::Xml::Schema::XmlSchemaSet::Schemas methode"
linktitle: "Schema's"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaSet::Schemas-methode. Retourneert een verzameling van alle XML Schema-definitietaal (XSD) schema's in de XmlSchemaSet in C++."
type: docs
weight: 1600
url: /nl/cpp/system.xml.schema/xmlschemaset/schemas/
---
## XmlSchemaSet::Schemas() method


Retourneert een verzameling van alle XML [Schema](../../) definitietaal (XSD) schema's in de [XmlSchemaSet](../).

```cpp
SharedPtr<Collections::Generic::IList<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas()
```


### ReturnValue

Een IList-object dat alle schema's bevat die aan de [XmlSchemaSet](../) zijn toegevoegd. Als er geen schema's aan de [XmlSchemaSet](../) zijn toegevoegd, wordt een lege verzameling geretourneerd.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Schemas(String) method


Retourneert een verzameling van alle XML [Schema](../../) definitietaal (XSD) schema's in de [XmlSchemaSet](../) die tot de opgegeven namespace behoren.

```cpp
SharedPtr<Collections::Generic::List<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas(String targetNamespace)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| targetNamespace | String | De **targetNamespace**-eigenschap van het schema. |

### ReturnValue

Een IList-object dat alle schema's bevat die aan de [XmlSchemaSet](../) zijn toegevoegd en tot de opgegeven namespace behoren. Als er geen schema's aan de [XmlSchemaSet](../) zijn toegevoegd, wordt een lege verzameling geretourneerd.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
