---
title: "Classe System::Xml::Schema::XmlSchema"
linktitle: "XmlSchema"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::Schema::XmlSchema. Una rappresentazione in memoria di uno Schema XML, come specificato nel World Wide Web Consortium (W3C) e in C++."
type: docs
weight: 400
url: /it/cpp/system.xml.schema/xmlschema/
---
## XmlSchema class


Una rappresentazione in memoria di uno [Schema](../) XML, come specificato nel World Wide [Web](../../system.web/) Consortium (W3C) [XML Schema Part 1: Structures](https://www.w3.org/TR/xmlschema-1/) e [XML Schema Part 2: Datatypes](https://www.w3.org/TR/xmlschema-2/).

```cpp
class XmlSchema : public System::Xml::Schema::XmlSchemaObject
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Compile](./compile/)(ValidationEventHandler) | Compila il Modello (SOM) [Schema](../)[Object](../../system/object/) XML in informazioni di schema per la convalida. Utilizzato per verificare la struttura sintattica e semantica del SOM costruito programmaticamente. Il controllo di validazione semantica viene eseguito durante la compilazione. |
| [Compile](./compile/)(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) | Compila il Modello (SOM) [Schema](../)[Object](../../system/object/) XML in informazioni di schema per la convalida. Utilizzato per verificare la struttura sintattica e semantica del SOM costruito programmaticamente. Il controllo di validazione semantica viene eseguito durante la compilazione. |
| [get_AttributeFormDefault](./get_attributeformdefault/)() | Restituisce la forma per gli attributi dichiarati nello spazio dei nomi di destinazione dello schema. |
| [get_AttributeGroups](./get_attributegroups/)() | Restituisce il valore post-compilazione dello schema di tutti i gruppi di attributi globali nello schema. |
| [get_Attributes](./get_attributes/)() | Restituisce il valore post-compilazione dello schema per tutti gli attributi nello schema. |
| [get_BlockDefault](./get_blockdefault/)() | Restituisce l'attributo **blockDefault** che imposta il valore predefinito dell'attributo **block** su elementi e tipi complessi nello **targetNamespace** dello schema. |
| [get_ElementFormDefault](./get_elementformdefault/)() | Restituisce la forma per gli elementi dichiarati nello spazio dei nomi di destinazione dello schema. |
| [get_Elements](./get_elements/)() | Restituisce il valore post-compilazione dello schema per tutti gli elementi nello schema. |
| [get_FinalDefault](./get_finaldefault/)() | Restituisce l'attributo **finalDefault** che imposta il valore predefinito dell'attributo **final** su elementi e tipi complessi nello spazio dei nomi di destinazione dello schema. |
| [get_Groups](./get_groups/)() | Restituisce il valore post-compilazione dello schema di tutti i gruppi nello schema. |
| [get_Id](./get_id/)() | Restituisce l'ID stringa. |
| [get_Includes](./get_includes/)() | Restituisce la raccolta di schemi inclusi e importati. |
| [get_IsCompiled](./get_iscompiled/)() | Indica se lo schema è stato compilato. |
| [get_Items](./get_items/)() | Restituisce la raccolta di elementi dello schema nello schema ed è usata per aggiungere nuovi tipi di elemento a livello dell'elemento **schema**. |
| [get_LineNumber](../xmlschemaobject/get_linenumber/)() | Restituisce il numero di riga nel file a cui si riferisce l'elemento **schema**. |
| [get_LinePosition](../xmlschemaobject/get_lineposition/)() | Restituisce la posizione di colonna nel file a cui si riferisce l'elemento **schema**. |
| [get_Namespaces](../xmlschemaobject/get_namespaces/)() | Restituisce gli XmlSerializerNamespaces da utilizzare con questo oggetto schema. |
| [get_Notations](./get_notations/)() | Restituisce il valore post-compilazione dello schema per tutte le notazioni nello schema. |
| [get_Parent](../xmlschemaobject/get_parent/)() | Restituisce il genitore di questo [XmlSchemaObject](../xmlschemaobject/). |
| [get_SchemaTypes](./get_schematypes/)() | Restituisce il valore post-compilazione dello schema di tutti i tipi di schema nello schema. |
| [get_SourceUri](../xmlschemaobject/get_sourceuri/)() | Restituisce la posizione di origine del file che ha caricato lo schema. |
| [get_TargetNamespace](./get_targetnamespace/)() | Restituisce l'Identificatore Uniforme di Risorsa (URI) dello spazio dei nomi di destinazione dello schema. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Restituisce gli attributi qualificati che non appartengono allo spazio dei nomi di destinazione dello schema. |
| [get_Version](./get_version/)() | Restituisce la versione dello schema. |
| static [Read](./read/)(const SharedPtr\<IO::TextReader\>\&, ValidationEventHandler) | Legge un XML [Schema](../) dal [IO::TextReader](../../system.io/textreader/) fornito. |
| static [Read](./read/)(const SharedPtr\<IO::Stream\>\&, ValidationEventHandler) | Legge un XML [Schema](../) dal flusso fornito. |
| static [Read](./read/)(const SharedPtr\<XmlReader\>\&, ValidationEventHandler) | Legge un XML [Schema](../) dal [XmlReader](../../system.xml/xmlreader/) fornito. |
| [set_AttributeFormDefault](./set_attributeformdefault/)(XmlSchemaForm) | Imposta la forma per gli attributi dichiarati nello spazio dei nomi di destinazione dello schema. |
| [set_BlockDefault](./set_blockdefault/)(XmlSchemaDerivationMethod) | Imposta l'attributo **blockDefault** che imposta il valore predefinito dell'attributo **block** su elementi e tipi complessi nello **targetNamespace** dello schema. |
| [set_ElementFormDefault](./set_elementformdefault/)(XmlSchemaForm) | Imposta la forma per gli elementi dichiarati nello spazio dei nomi di destinazione dello schema. |
| [set_FinalDefault](./set_finaldefault/)(XmlSchemaDerivationMethod) | Imposta l'attributo **finalDefault** che imposta il valore predefinito dell'attributo **final** su elementi e tipi complessi nello spazio dei nomi di destinazione dello schema. |
| [set_Id](./set_id/)(const String\&) | Imposta l'ID stringa. |
| [set_LineNumber](../xmlschemaobject/set_linenumber/)(int32_t) | Imposta il numero di riga nel file a cui si riferisce l'elemento **schema**. |
| [set_LinePosition](../xmlschemaobject/set_lineposition/)(int32_t) | Imposta la posizione di colonna nel file a cui si riferisce l'elemento **schema**. |
| [set_Namespaces](../xmlschemaobject/set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | Imposta gli XmlSerializerNamespaces da utilizzare con questo oggetto schema. |
| [set_Parent](../xmlschemaobject/set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | Imposta il genitore di questo [XmlSchemaObject](../xmlschemaobject/). |
| [set_SourceUri](../xmlschemaobject/set_sourceuri/)(const String\&) | Imposta la posizione di origine del file che ha caricato lo schema. |
| [set_TargetNamespace](./set_targetnamespace/)(const String\&) | Imposta l'Identificatore Uniforme di Risorsa (URI) dello spazio dei nomi di destinazione dello schema. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Imposta gli attributi qualificati che non appartengono allo spazio dei nomi di destinazione dello schema. |
| [set_Version](./set_version/)(const String\&) | Imposta la versione dello schema. |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&) | Scrive l'XML [Schema](../) nel flusso di dati fornito. |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | Scrive l'XML [Schema](../) nel flusso fornito usando il [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) specificato. |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&) | Scrive l'XML [Schema](../) nel [IO::TextWriter](../../system.io/textwriter/) fornito. |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | Scrive l'XML [Schema](../) nel TextWriter fornito. |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&) | Scrive l'XML [Schema](../) nel [XmlWriter](../../system.xml/xmlwriter/) fornito. |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | Scrive l'XML [Schema](../) nel [XmlWriter](../../system.xml/xmlwriter/) fornito. |
| [XmlSchema](./xmlschema/)() | Inizializza una nuova istanza della classe [XmlSchema](./). |
| [XmlSchemaObject](../xmlschemaobject/xmlschemaobject/)() | Inizializza una nuova istanza della classe [XmlSchemaObject](../xmlschemaobject/). |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [InstanceNamespace](./instancenamespace/) | Lo spazio dei nomi dell'istanza XML schema. Questo campo è costante. |
| static [Namespace](./namespace/) | Lo spazio dei nomi XML schema. Questo campo è costante. |
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
