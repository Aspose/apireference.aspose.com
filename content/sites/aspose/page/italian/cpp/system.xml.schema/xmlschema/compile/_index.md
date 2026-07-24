---
title: "System::Xml::Schema::XmlSchema::Compile method"
linktitle: "Compila"
second_title: "Aspose.Page per C++"
description: "System::Xml::Schema::XmlSchema::Compile method. Compila il modello XML SchemaObject (SOM) in informazioni di schema per la convalida. Utilizzato per verificare la struttura sintattica e semantica del SOM costruito programmaticamente. Il controllo di validazione semantica viene eseguito durante la compilazione in C++."
type: docs
weight: 200
url: /it/cpp/system.xml.schema/xmlschema/compile/
---
## XmlSchema::Compile(ValidationEventHandler) method


Compila il modello XML [Schema](../../)[Object](../../../system/object/) (SOM) in informazioni di schema per la convalida. Utilizzato per verificare la struttura sintattica e semantica del SOM costruito programmaticamente. Il controllo di validazione semantica viene eseguito durante la compilazione.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | Il gestore dell'evento di convalida che riceve informazioni sugli errori di convalida XML [Schema](../../). |

## Vedi anche

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchema::Compile(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) method


Compila il modello XML [Schema](../../)[Object](../../../system/object/) (SOM) in informazioni di schema per la convalida. Utilizzato per verificare la struttura sintattica e semantica del SOM costruito programmaticamente. Il controllo di validazione semantica viene eseguito durante la compilazione.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler, const SharedPtr<XmlResolver> &resolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | Il gestore dell'evento di convalida che riceve informazioni sugli errori di convalida del XML [Schema](../../). |
| resolver | const SharedPtr\<XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) utilizzato per risolvere gli spazi dei nomi referenziati negli elementi **include** e **import**. |

## Vedi anche

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
