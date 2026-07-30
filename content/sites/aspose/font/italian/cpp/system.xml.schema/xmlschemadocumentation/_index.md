---
title: "System::Xml::Schema::XmlSchemaDocumentation classe"
linktitle: "XmlSchemaDocumentation"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaDocumentation classe. Rappresenta l'elemento di documentazione dello XML Schema come specificato dal World Wide Web Consortium (W3C). Questa classe specifica le informazioni da leggere o utilizzare da parte degli esseri umani all'interno di un'annotazione in C++."
type: docs
weight: 2500
url: /it/cpp/system.xml.schema/xmlschemadocumentation/
---
## XmlSchemaDocumentation class


Rappresenta l'elemento **documentation** dello XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Questa classe specifica le informazioni da leggere o utilizzare da parte degli esseri umani all'interno di un'**annotation**.

```cpp
class XmlSchemaDocumentation : public System::Xml::Schema::XmlSchemaObject
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Language](./get_language/)() | Restituisce l'attributo **xml:lang**. Questo serve come indicatore della lingua utilizzata nei contenuti. |
| [get_Markup](./get_markup/)() | Restituisce un array di oggetti [XmlNode](../../system.xml/xmlnode/) che rappresentano i nodi figlio della documentazione. |
| [get_Source](./get_source/)() | Restituisce la sorgente Uniform Resource Identifier (URI) delle informazioni. |
| [set_Language](./set_language/)(const String\&) | Imposta l'attributo **xml:lang**. Questo serve come indicatore della lingua utilizzata nei contenuti. |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | Imposta un array di oggetti [XmlNode](../../system.xml/xmlnode/) che rappresentano i nodi figlio della documentazione. |
| [set_Source](./set_source/)(const String\&) | Imposta la sorgente Uniform Resource Identifier (URI) delle informazioni. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
