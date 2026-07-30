---
title: "Classe System::Xml::XmlImplementation"
linktitle: "XmlImplementation"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlImplementation. Definisce il contesto per un insieme di oggetti XmlDocument in C++."
type: docs
weight: 2000
url: /it/cpp/system.xml/xmlimplementation/
---
## XmlImplementation class


Definisce il contesto per un insieme di oggetti [XmlDocument](../xmldocument/).

```cpp
class XmlImplementation : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [CreateDocument](./createdocument/)() | Crea un nuovo [XmlDocument](../xmldocument/). |
| [HasFeature](./hasfeature/)(const String\&, const String\&) | Verifica se l'implementazione del modello di oggetto [Object](../../system/object/) del documento (DOM) implementa una funzionalità specifica. |
| [XmlImplementation](./xmlimplementation/)() | Inizializza una nuova istanza della classe [XmlImplementation](./). |
| [XmlImplementation](./xmlimplementation/)(const SharedPtr\<XmlNameTable\>\&) | Inizializza una nuova istanza della classe [XmlImplementation](./) con la [XmlNameTable](../xmlnametable/) specificata. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
