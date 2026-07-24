---
title: "System::Xml::Schema::XmlSchemaAttributeGroup klass"
linktitle: "XmlSchemaAttributeGroup"
second_title: "Aspose.Page för C++"
description: "System::Xml::Schema::XmlSchemaAttributeGroup klass. Representerar attributeGroup-elementet från XML Schema enligt World Wide Web Consortium (W3C). AttributesGroups tillhandahåller en mekanism för att gruppera en uppsättning attributdeklarationer så att de kan införlivas som en grupp i komplexa typdefinitioner i C++."
type: docs
weight: 1200
url: /sv/cpp/system.xml.schema/xmlschemaattributegroup/
---
## XmlSchemaAttributeGroup class


Representerar **attributeGroup**-elementet från XML [Schema](../) enligt World Wide [Web](../../system.web/) Consortium (W3C). AttributesGroups tillhandahåller en mekanism för att gruppera en uppsättning attributdeklarationer så att de kan införlivas som en grupp i komplexa typdefinitioner.

```cpp
class XmlSchemaAttributeGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Returnerar [XmlSchemaAnyAttribute](../xmlschemaanyattribute/)-komponenten för attributgruppen. |
| [get_Attributes](./get_attributes/)() | Returnerar samlingen av attribut för attributgruppen. Innehåller elementen [XmlSchemaAttribute](../xmlschemaattribute/) och [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_Name](./get_name/)() | Returnerar namnet på attributgruppen. |
| [get_QualifiedName](./get_qualifiedname/)() | Returnerar det kvalificerade namnet på attributgruppen. |
| [get_RedefinedAttributeGroup](./get_redefinedattributegroup/)() | Returnerar den omdefinierade egenskapen för attributgruppen från XML [Schema](../). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Ställer in [XmlSchemaAnyAttribute](../xmlschemaanyattribute/)-komponenten för attributgruppen. |
| [set_Name](./set_name/)(const String\&) | Ställer in namnet på attributgruppen. |
| [XmlSchemaAttributeGroup](./xmlschemaattributegroup/)() | Initierar en ny instans av klassen [XmlSchemaAttributeGroup](./). |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [Ptr](./ptr/) | Ett alias för delad pekare till en instans av denna klass. |
## Anmärkningar



Objekt av denna klass bör endast allokeras med funktionen [System::MakeObject()](../../system/makeobject/). Skapa aldrig instanser av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

## Se även

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
