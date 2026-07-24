---
title: "System::Xml::Schema::XmlSchemaObjectTable class"
linktitle: "XmlSchemaObjectTable"
second_title: "Aspose.Page för C++"
description: "System::Xml::Schema::XmlSchemaObjectTable class. Tillhandahåller samlingarna för innehållande element i XmlSchema-klassen (till exempel Attributes, AttributeGroups, Elements och så vidare) i C++."
type: docs
weight: 5300
url: /sv/cpp/system.xml.schema/xmlschemaobjecttable/
---
## XmlSchemaObjectTable class


Tillhandahåller samlingarna för innehållande element i klassen [XmlSchema](../xmlschema/) (till exempel Attributes, AttributeGroups, Elements och så vidare).

```cpp
class XmlSchemaObjectTable : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<SharedPtr<System::Xml::XmlQualifiedName>, SharedPtr<System::Xml::Schema::XmlSchemaObject>>>
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Contains](./contains/)(const SharedPtr\<XmlQualifiedName\>\&) | Avgör om det angivna kvalificerade namnet finns i samlingen. |
| [get_Count](./get_count/)() | Returnerar antalet objekt som finns i [XmlSchemaObjectTable](./). |
| [get_Names](./get_names/)() | Returnerar en samling av alla namngivna element i [XmlSchemaObjectTable](./). |
| [get_Values](./get_values/)() | Returnerar en samling av alla värden för alla element i [XmlSchemaObjectTable](./). |
| [GetEnumerator](./getenumerator/)() override | Returnerar en enumerator som kan iterera igenom [XmlSchemaObjectTable](./). |
| [idx_get](./idx_get/)(const SharedPtr\<XmlQualifiedName\>\&) | Returnerar elementet i [XmlSchemaObjectTable](./) som specificeras av kvalificerat namn. |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [Ptr](./ptr/) | Ett alias för delad pekare till en instans av denna klass. |
## Anmärkningar



Objekt av denna klass bör endast allokeras med funktionen [System::MakeObject()](../../system/makeobject/). Skapa aldrig instanser av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

## Se även

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
