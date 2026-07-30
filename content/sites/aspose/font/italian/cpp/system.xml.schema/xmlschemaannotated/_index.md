---
title: "classe System::Xml::Schema::XmlSchemaAnnotated"
linktitle: "XmlSchemaAnnotated"
second_title: "Aspose.Font per C++"
description: "classe System::Xml::Schema::XmlSchemaAnnotated. La classe base per qualsiasi elemento che può contenere elementi di annotazione in C++."
type: docs
weight: 600
url: /it/cpp/system.xml.schema/xmlschemaannotated/
---
## XmlSchemaAnnotated class


La classe base per qualsiasi elemento che può contenere elementi di annotazione.

```cpp
class XmlSchemaAnnotated : public System::Xml::Schema::XmlSchemaObject
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Annotation](./get_annotation/)() | Restituisce la proprietà **annotation**. |
| [get_Id](./get_id/)() | Restituisce l'ID della stringa. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Restituisce gli attributi qualificati che non appartengono allo spazio dei nomi di destinazione dello schema corrente. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | Imposta la proprietà **annotation**. |
| [set_Id](./set_id/)(const String\&) | Imposta l'ID della stringa. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Imposta gli attributi qualificati che non appartengono allo spazio dei nomi di destinazione dello schema corrente. |
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
