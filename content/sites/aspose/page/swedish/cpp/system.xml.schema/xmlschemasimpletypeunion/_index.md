---
title: "System::Xml::Schema::XmlSchemaSimpleTypeUnion klass"
linktitle: "XmlSchemaSimpleTypeUnion"
second_title: "Aspose.Page för C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeUnion klass. Representerar union-elementet för enkla typer från XML Schema enligt World Wide Web Consortium (W3C). En union-datatype kan användas för att specificera innehållet i en simpleType. Värdet på simpleType-elementet måste vara någon av en uppsättning alternativa datatyper som specificeras i unionen. Union-typer är alltid avledda typer och måste bestå av minst två alternativa datatyper i C++."
type: docs
weight: 6600
url: /sv/cpp/system.xml.schema/xmlschemasimpletypeunion/
---
## XmlSchemaSimpleTypeUnion class


Representerar **union**-elementet för enkla typer från XML [Schema](../) enligt World Wide [Web](../../system.web/) Consortium (W3C). En **union**-datatyp kan användas för att specificera innehållet i en **simpleType**. Värdet på **simpleType**-elementet måste vara någon av en uppsättning alternativa datatyper som specificeras i unionen. Union-typer är alltid avledda typer och måste bestå av minst två alternativa datatyper.

```cpp
class XmlSchemaSimpleTypeUnion : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_BaseMemberTypes](./get_basemembertypes/)() | Returnerar en array av [XmlSchemaSimpleType](../xmlschemasimpletype/)‑objekt som representerar typen av **simpleType**‑elementet baserat på värdena för [XmlSchemaSimpleTypeUnion::get_BaseTypes](./get_basetypes/) och [XmlSchemaSimpleTypeUnion::get_MemberTypes](./get_membertypes/) för den enkla typen. |
| [get_BaseTypes](./get_basetypes/)() | Returnerar samlingen av basstyper. |
| [get_MemberTypes](./get_membertypes/)() | Returnerar arrayen med kvalificerade medlemsnamn för inbyggda datatyper eller **simpleType**-element som definieras i detta schema (eller ett annat schema som anges av den specificerade namnrymden). |
| [set_MemberTypes](./set_membertypes/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | Ställer in arrayen med kvalificerade medlemsnamn för inbyggda datatyper eller **simpleType**-element som definieras i detta schema (eller ett annat schema som anges av den specificerade namnrymden). |
| [XmlSchemaSimpleTypeUnion](./xmlschemasimpletypeunion/)() | Initierar en ny instans av klassen [XmlSchemaSimpleTypeUnion](./). |
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
