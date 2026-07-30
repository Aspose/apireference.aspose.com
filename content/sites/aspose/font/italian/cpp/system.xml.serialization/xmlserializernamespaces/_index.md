---
title: "System::Xml::Serialization::XmlSerializerNamespaces class"
linktitle: "XmlSerializerNamespaces"
second_title: "Aspose.Font per C++"
description: "System::Xml::Serialization::XmlSerializerNamespaces class. Contiene gli spazi dei nomi XML e i prefissi che il Serialization::XmlSerializer utilizza per generare nomi qualificati in un'istanza di documento XML in C++."
type: docs
weight: 800
url: /it/cpp/system.xml.serialization/xmlserializernamespaces/
---
## XmlSerializerNamespaces class


Contiene gli spazi dei nomi XML e i prefissi che il [Serialization::XmlSerializer](../xmlserializer/) utilizza per generare nomi qualificati in un'istanza di documento XML.

```cpp
class XmlSerializerNamespaces : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | Aggiunge una coppia prefisso e spazio dei nomi a un oggetto [Serialization::XmlSerializerNamespaces](./). |
| [get_Count](./get_count/)() | Restituisce il numero di coppie prefisso e spazio dei nomi nella collezione. |
| [get_NamespaceList](./get_namespacelist/)() |  |
| [get_Namespaces](./get_namespaces/)() |  |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<Collections::Generic::Dictionary\<String, String\>\>\&) |  |
| [ToArray](./toarray/)() | Restituisce l'array di coppie prefisso e spazio dei nomi in un oggetto [Serialization::XmlSerializerNamespaces](./). |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)() | Inizializza una nuova istanza della classe [Serialization::XmlSerializerNamespaces](./). |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const SharedPtr\<XmlSerializerNamespaces\>\&) | Inizializza una nuova istanza della classe [Serialization::XmlSerializerNamespaces](./), utilizzando l'istanza specificata di **[XmlSerializerNamespaces](./)** che contiene la collezione di coppie prefisso e spazio dei nomi. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | Inizializza una nuova istanza della classe [Serialization::XmlSerializerNamespaces](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Font for C++](../../)
