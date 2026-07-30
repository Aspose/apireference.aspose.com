---
title: "Classe System::Xml::XmlReaderSettings"
linktitle: "XmlReaderSettings"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlReaderSettings. Specifica un insieme di funzionalità da supportare sull'oggetto XmlReader creato dal metodo XmlReader::Create in C++."
type: docs
weight: 3400
url: /it/cpp/system.xml/xmlreadersettings/
---
## XmlReaderSettings class


Specifica un insieme di funzionalità da supportare sull'oggetto [XmlReader](../xmlreader/) creato dal metodo [XmlReader::Create](../xmlreader/create/).

```cpp
class XmlReaderSettings : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CheckReadOnly](./checkreadonly/)(const String\&) |  |
| [Clone](./clone/)() | Crea una copia dell'istanza di [XmlReaderSettings](./). |
| [get_CheckCharacters](./get_checkcharacters/)() | Restituisce un valore che indica se eseguire il controllo dei caratteri. |
| [get_CloseInput](./get_closeinput/)() | Restituisce un valore che indica se lo stream sottostante o il TextReader debbano essere chiusi quando il lettore è chiuso. |
| [get_ConformanceLevel](./get_conformancelevel/)() | Restituisce il livello di conformità a cui il [XmlReader](../xmlreader/) si adeguerà. |
| [get_DtdProcessing](./get_dtdprocessing/)() | Restituisce un valore che determina l'elaborazione delle DTD. |
| [get_IgnoreComments](./get_ignorecomments/)() | Restituisce un valore che indica se ignorare i commenti. |
| [get_IgnoreProcessingInstructions](./get_ignoreprocessinginstructions/)() | Restituisce un valore che indica se ignorare le istruzioni di elaborazione. |
| [get_IgnoreWhitespace](./get_ignorewhitespace/)() | Restituisce un valore che indica se ignorare gli spazi bianchi insignificanti. |
| [get_LineNumberOffset](./get_linenumberoffset/)() | Restituisce l'offset del numero di riga dell'oggetto [XmlReader](../xmlreader/). |
| [get_LinePositionOffset](./get_linepositionoffset/)() | Restituisce l'offset della posizione di riga dell'oggetto [XmlReader](../xmlreader/). |
| [get_MaxCharactersFromEntities](./get_maxcharactersfromentities/)() | Restituisce un valore che indica il numero massimo consentito di caratteri in un documento derivante dall'espansione delle entità. |
| [get_MaxCharactersInDocument](./get_maxcharactersindocument/)() | Restituisce un valore che indica il numero massimo consentito di caratteri in un documento XML. Un valore zero (0) significa nessun limite alla dimensione del documento XML. Un valore diverso da zero specifica la dimensione massima, in caratteri. |
| [get_NameTable](./get_nametable/)() | Restituisce il [XmlNameTable](../xmlnametable/) utilizzato per i confronti di stringhe atomizzate. |
| [get_ProhibitDtd](./get_prohibitdtd/)() | Restituisce un valore che indica se proibire l'elaborazione della definizione del tipo di documento (DTD). |
| [get_Schemas](./get_schemas/)() | Restituisce l'XmlSchemaSet da utilizzare durante la convalida dello schema. |
| [get_ValidationFlags](./get_validationflags/)() | Restituisce un valore che indica le impostazioni di convalida dello schema. Questa impostazione si applica agli oggetti [XmlReader](../xmlreader/) che convalidano gli schemi (il valore di [XmlReaderSettings::get_ValidationType](./get_validationtype/) è [ValidationType::Schema](../validationtype/)). |
| [get_ValidationType](./get_validationtype/)() | Restituisce un valore che indica se il [XmlReader](../xmlreader/) eseguirà la convalida o l'assegnazione del tipo durante la lettura. |
| [Reset](./reset/)() | Ripristina i membri della classe delle impostazioni ai loro valori predefiniti. |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | Imposta un valore che indica se eseguire il controllo dei caratteri. |
| [set_CloseInput](./set_closeinput/)(bool) | Imposta un valore che indica se lo stream sottostante o il TextReader debbano essere chiusi quando il lettore è chiuso. |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | Imposta il livello di conformità a cui il [XmlReader](../xmlreader/) si adeguerà. |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | Imposta un valore che determina l'elaborazione delle DTD. |
| [set_IgnoreComments](./set_ignorecomments/)(bool) | Imposta un valore che indica se ignorare i commenti. |
| [set_IgnoreProcessingInstructions](./set_ignoreprocessinginstructions/)(bool) | Imposta un valore che indica se ignorare le istruzioni di elaborazione. |
| [set_IgnoreWhitespace](./set_ignorewhitespace/)(bool) | Imposta un valore che indica se ignorare gli spazi bianchi insignificanti. |
| [set_LineNumberOffset](./set_linenumberoffset/)(int32_t) | Imposta l'offset del numero di riga dell'oggetto [XmlReader](../xmlreader/). |
| [set_LinePositionOffset](./set_linepositionoffset/)(int32_t) | Imposta lo spostamento della posizione di riga dell'oggetto [XmlReader](../xmlreader/). |
| [set_MaxCharactersFromEntities](./set_maxcharactersfromentities/)(int64_t) | Imposta un valore che indica il numero massimo consentito di caratteri in un documento risultante dall'espansione delle entità. |
| [set_MaxCharactersInDocument](./set_maxcharactersindocument/)(int64_t) | Imposta un valore che indica il numero massimo consentito di caratteri in un documento XML. Un valore zero (0) significa nessun limite alla dimensione del documento XML. Un valore diverso da zero specifica la dimensione massima, in caratteri. |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | Imposta il [XmlNameTable](../xmlnametable/) utilizzato per i confronti di stringhe atomizzate. |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | Imposta un valore che indica se vietare l'elaborazione della definizione del tipo di documento (DTD). |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | Imposta il XmlSchemaSet da utilizzare durante la convalida dello schema. |
| [set_ValidationFlags](./set_validationflags/)(Schema::XmlSchemaValidationFlags) | Imposta un valore che indica le impostazioni di convalida dello schema. Questa impostazione si applica agli oggetti [XmlReader](../xmlreader/) che convalidano gli schemi (il valore di [XmlReaderSettings::get_ValidationType](./get_validationtype/) è [ValidationType::Schema](../validationtype/)). |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | Imposta un valore che indica se il [XmlReader](../xmlreader/) eseguirà la convalida o l'assegnazione del tipo durante la lettura. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Imposta il [XmlResolver](../xmlresolver/) utilizzato per accedere ai documenti esterni. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | Aggiunge un gestore di eventi che si verifica quando il lettore incontra errori di convalida. |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | Rimuove un gestore di eventi che si verifica quando il lettore incontra errori di convalida. |
| [XmlReaderSettings](./xmlreadersettings/)() | Inizializza una nuova istanza della classe [XmlReaderSettings](./). |
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
