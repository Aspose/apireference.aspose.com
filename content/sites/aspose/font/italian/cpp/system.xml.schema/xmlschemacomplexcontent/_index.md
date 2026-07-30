---
title: "System::Xml::Schema::XmlSchemaComplexContent class"
linktitle: "XmlSchemaComplexContent"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaComplexContent class. Rappresenta l'elemento complexContent da XML Schema come specificato dal World Wide Web Consortium (W3C). Questa classe rappresenta il modello di contenuto complesso per i tipi complessi. Contiene estensioni o restrizioni su un tipo complesso che ha solo elementi o contenuto misto in C++."
type: docs
weight: 1800
url: /it/cpp/system.xml.schema/xmlschemacomplexcontent/
---
## XmlSchemaComplexContent class


Rappresenta l'elemento **complexContent** da XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Questa classe rappresenta il modello di contenuto complesso per i tipi complessi. Contiene estensioni o restrizioni su un tipo complesso che ha solo elementi o contenuto misto.

```cpp
class XmlSchemaComplexContent : public System::Xml::Schema::XmlSchemaContentModel
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Content](./get_content/)() override | Restituisce il contenuto. |
| [get_IsMixed](./get_ismixed/)() | Restituisce informazioni che determinano se il tipo ha un modello di contenuto misto. |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | Imposta il contenuto. |
| [set_IsMixed](./set_ismixed/)(bool) | Imposta informazioni che determinano se il tipo ha un modello di contenuto misto. |
| [XmlSchemaComplexContent](./xmlschemacomplexcontent/)() | Inizializza una nuova istanza della classe [XmlSchemaComplexContent](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaContentModel](../xmlschemacontentmodel/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
