---
title: "System::Xml::Schema::XmlSchemaType-klass"
linktitle: "XmlSchemaType"
second_title: "Aspose.Page för C++"
description: "System::Xml::Schema::XmlSchemaType-klass. Bas‑klassen för alla enkla typer och komplexa typer i C++."
type: docs
weight: 6800
url: /sv/cpp/system.xml.schema/xmlschematype/
---
## XmlSchemaType class


Basklassen för alla enkla typer och komplexa typer.

```cpp
class XmlSchemaType : public System::Xml::Schema::XmlSchemaAnnotated
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_BaseSchemaType](./get_baseschematype/)() | Returnerar post‑kompileringens objekttyp eller den inbyggda XML [Schema](../) Definition Language (XSD)-datatypen, simpleType‑elementet eller complexType‑elementet. Detta är ett post‑schema‑kompilering‑infoset‑värde. |
| [get_BaseXmlSchemaType](./get_basexmlschematype/)() | Returnerar post‑kompileringens värde för bas‑typen av denna schematyp. |
| [get_Datatype](./get_datatype/)() | Returnerar post‑kompileringens värde för datatypen för den komplexa typen. |
| [get_DerivedBy](./get_derivedby/)() | Returnerar post‑kompileringens information om hur detta element härleddes från sin bas‑typ. |
| [get_Final](./get_final/)() | Returnerar det slutgiltiga attributet för typavledningen som indikerar om ytterligare avledningar är tillåtna. |
| [get_FinalResolved](./get_finalresolved/)() | Returnerar post‑kompileringens tolkning av värdet [XmlSchemaType::get_Final](./get_final/). |
| virtual [get_IsMixed](./get_ismixed/)() | Returnerar ett värde som indikerar om denna typ har en blandad innehållsmodell. Detta anrop är endast giltigt i en komplex typ. |
| [get_Name](./get_name/)() | Returnerar typens namn. |
| [get_QualifiedName](./get_qualifiedname/)() | Returnerar det kvalificerade namnet för typen som byggts från **Name**-attributet för denna typ. Detta är ett post-schema-kompileringvärde. |
| [get_TypeCode](./get_typecode/)() | Returnerar [XmlTypeCode](../xmltypecode/) för typen. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(XmlTypeCode) | Returnerar en [XmlSchemaComplexType](../xmlschemacomplextype/) som representerar den inbyggda komplexa typen för den angivna komplexa typen. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(const SharedPtr\<XmlQualifiedName\>\&) | Returnerar en [XmlSchemaComplexType](../xmlschemacomplextype/) som representerar den inbyggda komplexa typen för den komplexa typen som anges med kvalificerat namn. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(const SharedPtr\<XmlQualifiedName\>\&) | Returnerar en [XmlSchemaSimpleType](../xmlschemasimpletype/) som representerar den inbyggda enkla typen för den enkla typen som anges med kvalificerat namn. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(XmlTypeCode) | Returnerar en [XmlSchemaSimpleType](../xmlschemasimpletype/) som representerar den inbyggda enkla typen för den angivna enkla typen. |
| static [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaType\>, const SharedPtr\<XmlSchemaType\>\&, XmlSchemaDerivationMethod) | Returnerar ett värde som indikerar om den angivna härledda schematypen är härledd från den angivna baskschematypen. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | Ställer in det slutgiltiga attributet för typderivationen som indikerar om ytterligare derivationer är tillåtna. |
| virtual [set_IsMixed](./set_ismixed/)(bool) | Ställer in ett värde som indikerar om denna typ har en blandad innehållsmodell. Detta anrop är endast giltigt i en komplex typ. |
| [set_Name](./set_name/)(const String\&) | Ställer in namnet på typen. |
| [XmlSchemaType](./xmlschematype/)() | Initierar en ny instans av klassen [XmlSchemaType](./). |
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
