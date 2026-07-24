---
title: "System::Xml::Schema::XmlSchemaSet::Schemas metod"
linktitle: "Schemas"
second_title: "Aspose.Page för C++"
description: "System::Xml::Schema::XmlSchemaSet::Schemas‑metod. Returnerar en samling av alla XML Schema‑definitionsspråk (XSD)‑scheman i XmlSchemaSet i C++."
type: docs
weight: 1600
url: /sv/cpp/system.xml.schema/xmlschemaset/schemas/
---
## XmlSchemaSet::Schemas() method


Returnerar en samling av alla XML [Schema](../../) definitionsspråk (XSD)‑scheman i [XmlSchemaSet](../).

```cpp
SharedPtr<Collections::Generic::IList<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas()
```


### ReturnValue

Ett IList‑objekt som innehåller alla scheman som har lagts till i [XmlSchemaSet](../). Om inga scheman har lagts till i [XmlSchemaSet](../) returneras en tom samling.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Schemas(String) method


Returnerar en samling av alla XML [Schema](../../) definitionsspråk (XSD)‑scheman i [XmlSchemaSet](../) som tillhör den angivna namnrymden.

```cpp
SharedPtr<Collections::Generic::List<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas(String targetNamespace)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| targetNamespace | String | Schemat **targetNamespace**‑egenskap. |

### ReturnValue

Ett IList‑objekt som innehåller alla scheman som har lagts till i [XmlSchemaSet](../) som tillhör den angivna namnrymden. Om inga scheman har lagts till i [XmlSchemaSet](../) returneras en tom samling.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
