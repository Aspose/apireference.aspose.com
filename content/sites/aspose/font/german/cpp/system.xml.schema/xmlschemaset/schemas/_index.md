---
title: "System::Xml::Schema::XmlSchemaSet::Schemas-Methode"
linktitle: "Schemas"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaSet::Schemas-Methode. Gibt eine Sammlung aller XML Schema Definition Language (XSD)-Schemata im XmlSchemaSet in C++ zurück."
type: docs
weight: 1600
url: /de/cpp/system.xml.schema/xmlschemaset/schemas/
---
## XmlSchemaSet::Schemas() method


Gibt eine Sammlung aller XML [Schema](../../) Definition Language (XSD)-Schemata im [XmlSchemaSet](../) zurück.

```cpp
SharedPtr<Collections::Generic::IList<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas()
```


### ReturnValue

Ein IList-Objekt, das alle Schemata enthält, die zum [XmlSchemaSet](../) hinzugefügt wurden. Wenn dem [XmlSchemaSet](../) keine Schemata hinzugefügt wurden, wird eine leere Sammlung zurückgegeben.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Schemas(String) method


Gibt eine Sammlung aller XML [Schema](../../) Definition Language (XSD)-Schemata im [XmlSchemaSet](../) zurück, die zum angegebenen Namespace gehören.

```cpp
SharedPtr<Collections::Generic::List<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas(String targetNamespace)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| targetNamespace | String | Die **targetNamespace**-Eigenschaft des Schemas. |

### ReturnValue

Ein IList-Objekt, das alle Schemata enthält, die zum [XmlSchemaSet](../) hinzugefügt wurden und zum angegebenen Namespace gehören. Wenn dem [XmlSchemaSet](../) keine Schemata hinzugefügt wurden, wird eine leere Sammlung zurückgegeben.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
