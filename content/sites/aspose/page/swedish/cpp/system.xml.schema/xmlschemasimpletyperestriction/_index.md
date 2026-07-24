---
title: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction klass"
linktitle: "XmlSchemaSimpleTypeRestriction"
second_title: "Aspose.Page för C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction class. Representerar restriktionselementet för enkla typer från XML Schema enligt World Wide Web Consortium (W3C). Denna klass kan användas för att begränsa simpleType-element i C++."
type: docs
weight: 6500
url: /sv/cpp/system.xml.schema/xmlschemasimpletyperestriction/
---
## XmlSchemaSimpleTypeRestriction class


Representerar **restriction**-elementet för enkla typer från XML [Schema](../) enligt World Wide [Web](../../system.web/) Consortium (W3C). Denna klass kan användas för att begränsa **simpleType**-element.

```cpp
class XmlSchemaSimpleTypeRestriction : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_BaseType](./get_basetype/)() | Returnerar information om basstypen. |
| [get_BaseTypeName](./get_basetypename/)() | Returnerar namnet på den kvalificerade basstypen. |
| [get_Facets](./get_facets/)() | Returnerar en [Xml](../../system.xml/)[Schema](../) fasett. |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Ställer in information om basstypen. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Ställer in namnet på den kvalificerade basstypen. |
| [XmlSchemaSimpleTypeRestriction](./xmlschemasimpletyperestriction/)() | Initierar en ny instans av klassen [XmlSchemaSimpleTypeRestriction](./). |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [Ptr](./ptr/) | Ett alias för delad pekare till en instans av denna klass. |
## Anmärkningar



Objekt av denna klass bör endast allokeras med funktionen [System::MakeObject()](../../system/makeobject/). Skapa aldrig instanser av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

## Se även

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
