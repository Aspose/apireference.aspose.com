---
title: "System::Xml::Schema::XmlSchemaAppInfo classe"
linktitle: "XmlSchemaAppInfo"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaAppInfo classe. Rappresenta l'elemento appinfo del World Wide Web Consortium (W3C) in C++."
type: docs
weight: 1000
url: /it/cpp/system.xml.schema/xmlschemaappinfo/
---
## XmlSchemaAppInfo class


Rappresenta l'elemento **appinfo** del World Wide [Web](../../system.web/) Consortium (W3C).

```cpp
class XmlSchemaAppInfo : public System::Xml::Schema::XmlSchemaObject
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Markup](./get_markup/)() | Restituisce un array di oggetti [XmlNode](../../system.xml/xmlnode/) che rappresentano i nodi figlio **appinfo**. |
| [get_Source](./get_source/)() | Restituisce la sorgente delle informazioni dell'applicazione. |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | Imposta un array di oggetti [XmlNode](../../system.xml/xmlnode/) che rappresentano i nodi figlio **appinfo**. |
| [set_Source](./set_source/)(const String\&) | Imposta la sorgente delle informazioni dell'applicazione. |
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
