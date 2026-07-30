---
title: "System::Xml::Schema::XmlSchema::Compile metodo"
linktitle: "Compile"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchema::Compile metodo. Compila il modello XML SchemaObject (SOM) in informazioni di schema per la convalida. Utilizzato per verificare la struttura sintattica e semantica del SOM costruito programmaticamente. Il controllo di convalida semantica viene eseguito durante la compilazione in C++."
type: docs
weight: 200
url: /it/cpp/system.xml.schema/xmlschema/compile/
---
## XmlSchema::Compile(ValidationEventHandler) method


Compila il modello XML [Schema](../../)[Object](../../../system/object/) (SOM) in informazioni di schema per la convalida. Utilizzato per verificare la struttura sintattica e semantica del SOM costruito programmaticamente. Il controllo di convalida semantica viene eseguito durante la compilazione.

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
* Library [Aspose.Font for C++](../../../)
## XmlSchema::Compile(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) method


Compila il modello XML [Schema](../../)[Object](../../../system/object/) (SOM) in informazioni di schema per la convalida. Utilizzato per verificare la struttura sintattica e semantica del SOM costruito programmaticamente. Il controllo di convalida semantica viene eseguito durante la compilazione.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler, const SharedPtr<XmlResolver> &resolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | Il gestore dell'evento di convalida che riceve informazioni sugli errori di convalida del XML [Schema](../../). |
| resolver | const SharedPtr\<XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) usato per risolvere i namespace referenziati negli elementi **include** e **import**. |

## Vedi anche

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
