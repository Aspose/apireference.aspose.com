---
title: "System::Xml::Schema::XmlSchemaSet::Schemas metodo"
linktitle: "Schemas"
second_title: "Aspose.Page per C++"
description: "Metodo System::Xml::Schema::XmlSchemaSet::Schemas. Restituisce una raccolta di tutti gli schemi del linguaggio di definizione XML Schema (XSD) presenti nell'XmlSchemaSet in C++."
type: docs
weight: 1600
url: /it/cpp/system.xml.schema/xmlschemaset/schemas/
---
## XmlSchemaSet::Schemas() method


Restituisce una raccolta di tutti gli schemi del linguaggio di definizione XML [Schema](../../) (XSD) presenti nel [XmlSchemaSet](../).

```cpp
SharedPtr<Collections::Generic::IList<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas()
```


### ReturnValue

Un oggetto IList contenente tutti gli schemi che sono stati aggiunti al [XmlSchemaSet](../). Se non sono stati aggiunti schemi al [XmlSchemaSet](../), viene restituita una raccolta vuota.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Schemas(String) method


Restituisce una raccolta di tutti gli schemi del linguaggio di definizione XML [Schema](../../) (XSD) nel [XmlSchemaSet](../) che appartengono allo spazio dei nomi specificato.

```cpp
SharedPtr<Collections::Generic::List<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas(String targetNamespace)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| targetNamespace | String | La proprietà **targetNamespace** dello schema. |

### ReturnValue

Un oggetto IList contenente tutti gli schemi che sono stati aggiunti al [XmlSchemaSet](../) e che appartengono allo spazio dei nomi specificato. Se non sono stati aggiunti schemi al [XmlSchemaSet](../), viene restituita una raccolta vuota.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
