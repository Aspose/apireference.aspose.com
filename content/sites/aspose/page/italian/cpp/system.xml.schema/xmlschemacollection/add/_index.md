---
title: "System::Xml::Schema::XmlSchemaCollection::Add metodo"
linktitle: "Add"
second_title: "Aspose.Page per C++"
description: "System::Xml::Schema::XmlSchemaCollection::Add metodo. Aggiunge l'XmlSchema alla collezione in C++."
type: docs
weight: 200
url: /it/cpp/system.xml.schema/xmlschemacollection/add/
---
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&) method


Aggiunge l'[XmlSchema](../../xmlschema/) alla collezione.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | L'[XmlSchema](../../xmlschema/) da aggiungere alla collezione. |

### ReturnValue

L'oggetto [XmlSchema](../../xmlschema/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Aggiunge l'[XmlSchema](../../xmlschema/) alla collezione. Il [XmlResolver](../../../system.xml/xmlresolver/) specificato viene utilizzato per risolvere eventuali riferimenti esterni.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | L'[XmlSchema](../../xmlschema/) da aggiungere alla collezione. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) usato per risolvere gli spazi dei nomi referenziati negli elementi **include** e **import**. Se è **nullptr**, i riferimenti esterni non vengono risolti. |

### ReturnValue

L'[XmlSchema](../../xmlschema/) aggiunto alla collezione di schemi.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchemaCollection\>\&) method


Aggiunge tutti gli spazi dei nomi definiti nella collezione fornita (incluse le relative schemi) a questa collezione.

```cpp
void System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchemaCollection> &schema)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchemaCollection\>\& | La [XmlSchemaCollection](../) che vuoi aggiungere a questa collezione. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaCollection](../)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&) method


Aggiunge lo schema contenuto nel [XmlReader](../../../system.xml/xmlreader/) alla collezione di schemi.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| ns | const String\& | L'URI dello spazio dei nomi associato allo schema. Per gli XML Schema, questo sarà tipicamente il **targetNamespace**. |
| reader | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) contenente lo schema da aggiungere. |

### ReturnValue

L'[XmlSchema](../../xmlschema/) aggiunto alla collezione di schemi; **nullptr** se lo schema aggiunto è uno schema XDR o se ci sono errori di compilazione nello schema.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Aggiunge lo schema contenuto nel [XmlReader](../../../system.xml/xmlreader/) alla collezione di schemi. Il [XmlResolver](../../../system.xml/xmlresolver/) specificato viene utilizzato per risolvere eventuali risorse esterne.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| ns | const String\& | L'URI dello spazio dei nomi associato allo schema. Per gli XML Schema, questo sarà tipicamente il **targetNamespace**. |
| reader | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) contenente lo schema da aggiungere. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) utilizzato per risolvere gli spazi dei nomi referenziati negli elementi **include** e **import** o nell'attributo **x-schema** (schemi XDR). Se è **nullptr**, i riferimenti esterni non vengono risolti. |

### ReturnValue

L'[XmlSchema](../../xmlschema/) aggiunto alla collezione di schemi; **nullptr** se lo schema aggiunto è uno schema XDR o se ci sono errori di compilazione nello schema.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const String\&) method


Aggiunge lo schema individuato dall'URL fornito nella collezione di schemi.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const String &uri)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| ns | const String\& | L'URI dello spazio dei nomi associato allo schema. Per gli XML Schema, questo sarà tipicamente il **targetNamespace**. |
| uri | const String\& | L'URL che specifica lo schema da caricare. |

### ReturnValue

L'[XmlSchema](../../xmlschema/) aggiunto alla collezione di schemi; **nullptr** se lo schema aggiunto è uno schema XDR o se ci sono errori di compilazione nello schema.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
