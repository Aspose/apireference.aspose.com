---
title: "Classe System::Xml::Schema::XmlSchemaSet"
linktitle: "XmlSchemaSet"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::Schema::XmlSchemaSet. Contiene una cache di schemi XML Schema definition language (XSD) in C++."
type: docs
weight: 5800
url: /it/cpp/system.xml.schema/xmlschemaset/
---
## XmlSchemaSet class


Contiene una cache di schemi XML [Schema](../) definition language (XSD).

```cpp
class XmlSchemaSet : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(String, const String\&) | Aggiunge lo schema XML [Schema](../) definition language (XSD) all'URL specificato al [XmlSchemaSet](./). |
| [Add](./add/)(String, const SharedPtr\<XmlReader\>\&) | Aggiunge lo schema XML [Schema](../) definition language (XSD) contenuto nel [XmlReader](../../system.xml/xmlreader/) al [XmlSchemaSet](./). |
| [Add](./add/)(const SharedPtr\<XmlSchemaSet\>\&) | Aggiunge tutti gli schemi XML [Schema](../) definition language (XSD) nel [XmlSchemaSet](./) fornito al [XmlSchemaSet](./). |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | Aggiunge il [XmlSchema](../xmlschema/) fornito al [XmlSchemaSet](./). |
| [Compile](./compile/)() | Compila gli schemi XML [Schema](../) definition language (XSD) aggiunti al [XmlSchemaSet](./) in un unico schema logico. |
| [Contains](./contains/)(String) | Indica se uno schema XML [Schema](../) definition language (XSD) con lo spazio dei nomi di destinazione URI specificato è presente nel [XmlSchemaSet](./). |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | Indica se l'oggetto XML [Schema](../) definition language (XSD) [XmlSchema](../xmlschema/) specificato è presente nel [XmlSchemaSet](./). |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | Copia tutti gli oggetti [XmlSchema](../xmlschema/) dal [XmlSchemaSet](./) nell'array fornito, iniziando dall'indice specificato. |
| [get_CompilationSettings](./get_compilationsettings/)() | Restituisce le [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) per il [XmlSchemaSet](./). |
| [get_Count](./get_count/)() | Restituisce il numero di schemi XML [Schema](../) definition language (XSD) logici presenti nel [XmlSchemaSet](./). |
| [get_GlobalAttributes](./get_globalattributes/)() | Restituisce tutti gli attributi globali in tutti gli schemi XML [Schema](../) definition language (XSD) presenti nel [XmlSchemaSet](./). |
| [get_GlobalElements](./get_globalelements/)() | Restituisce tutti gli elementi globali in tutti gli schemi XML [Schema](../) definition language (XSD) presenti nel [XmlSchemaSet](./). |
| [get_GlobalTypes](./get_globaltypes/)() | Restituisce tutti i tipi semplici e complessi globali in tutti gli schemi XML [Schema](../) definition language (XSD) presenti nel [XmlSchemaSet](./). |
| [get_IsCompiled](./get_iscompiled/)() | Restituisce un valore che indica se gli schemi XML [Schema](../) definition language (XSD) nel [XmlSchemaSet](./) sono stati compilati. |
| [get_NameTable](./get_nametable/)() | Restituisce la [XmlNameTable](../../system.xml/xmlnametable/) predefinita usata dal [XmlSchemaSet](./) durante il caricamento di nuovi schemi XML [Schema](../) definition language (XSD). |
| [Remove](./remove/)(const SharedPtr\<XmlSchema\>\&) | Rimuove lo schema XML [Schema](../) definition language (XSD) specificato dal [XmlSchemaSet](./). |
| [RemoveRecursive](./removerecursive/)(const SharedPtr\<XmlSchema\>\&) | Rimuove lo schema XML [Schema](../) definition language (XSD) specificato e tutti gli schemi che importa dal [XmlSchemaSet](./). |
| [Reprocess](./reprocess/)(SharedPtr\<XmlSchema\>) | Riprocessa uno schema XML [Schema](../) definition language (XSD) già presente nel [XmlSchemaSet](./). |
| [Schemas](./schemas/)() | Restituisce una collezione di tutti gli schemi XML [Schema](../) definition language (XSD) presenti nel [XmlSchemaSet](./). |
| [Schemas](./schemas/)(String) | Restituisce una raccolta di tutti gli schemi XML [Schema](../) di definizione (XSD) presenti nel [XmlSchemaSet](./) che appartengono allo spazio dei nomi specificato. |
| [set_CompilationSettings](./set_compilationsettings/)(const SharedPtr\<XmlSchemaCompilationSettings\>\&) | Imposta le [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) per il [XmlSchemaSet](./). |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Imposta il [XmlResolver](../../system.xml/xmlresolver/) utilizzato per risolvere gli spazi dei nomi o le posizioni referenziate negli elementi include e import di uno schema. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | Aggiunge un gestore di eventi per ricevere informazioni sugli errori di convalida dello schema XML [Schema](../) di definizione (XSD). |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | Rimuove un gestore di eventi per ricevere informazioni sugli errori di convalida dello schema XML [Schema](../) di definizione (XSD). |
| [XmlSchemaSet](./xmlschemaset/)() | Inizializza una nuova istanza della classe [XmlSchemaSet](./). |
| [XmlSchemaSet](./xmlschemaset/)(const SharedPtr\<XmlNameTable\>\&) | Inizializza una nuova istanza della classe [XmlSchemaSet](./) con la [XmlNameTable](../../system.xml/xmlnametable/) specificata. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
