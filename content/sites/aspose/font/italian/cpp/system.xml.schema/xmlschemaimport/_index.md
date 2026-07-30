---
title: "Classe System::Xml::Schema::XmlSchemaImport"
linktitle: "XmlSchemaImport"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::Schema::XmlSchemaImport. Rappresenta l'elemento import dello XML Schema come specificato dal World Wide Web Consortium (W3C). Questa classe è usata per importare componenti di schema da altri schemi in C++."
type: docs
weight: 3500
url: /it/cpp/system.xml.schema/xmlschemaimport/
---
## XmlSchemaImport class


Rappresenta l'elemento **import** dallo XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Questa classe è usata per importare componenti di schema da altri schemi.

```cpp
class XmlSchemaImport : public System::Xml::Schema::XmlSchemaExternal
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Annotation](./get_annotation/)() | Restituisce il valore **annotation**. |
| [get_Namespace](./get_namespace/)() | Restituisce lo spazio dei nomi di destinazione per lo schema importato come riferimento Uniform Resource Identifier (URI). |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | Imposta il valore **annotation**. |
| [set_Namespace](./set_namespace/)(const String\&) | Imposta lo spazio dei nomi di destinazione per lo schema importato come riferimento Uniform Resource Identifier (URI). |
| [XmlSchemaImport](./xmlschemaimport/)() | Inizializza una nuova istanza della classe [XmlSchemaImport](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
