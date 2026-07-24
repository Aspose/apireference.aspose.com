---
title: "System::Xml::Schema::XmlSchemaCollection::Add methode"
linktitle: "Add"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaCollection::Add methode. Voegt de XmlSchema toe aan de collectie in C++."
type: docs
weight: 200
url: /nl/cpp/system.xml.schema/xmlschemacollection/add/
---
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&) method


Voegt de [XmlSchema](../../xmlschema/) toe aan de collectie.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | De [XmlSchema](../../xmlschema/) om toe te voegen aan de collectie. |

### ReturnValue

Het [XmlSchema](../../xmlschema/) object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Voegt de [XmlSchema](../../xmlschema/) toe aan de collectie. De opgegeven [XmlResolver](../../../system.xml/xmlresolver/) wordt gebruikt om externe referenties op te lossen.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | De [XmlSchema](../../xmlschema/) om toe te voegen aan de collectie. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | De [XmlResolver](../../../system.xml/xmlresolver/) die wordt gebruikt om namenruimtes te resolven die worden gerefereerd in **include**- en **import**-elementen. Als dit **nullptr** is, worden externe referenties niet opgelost. |

### ReturnValue

De [XmlSchema](../../xmlschema/) die aan de schemacollectie is toegevoegd.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchemaCollection\>\&) method


Voegt alle namespaces die in de opgegeven collectie zijn gedefinieerd (inclusief hun bijbehorende schema's) toe aan deze collectie.

```cpp
void System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchemaCollection> &schema)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchemaCollection\>\& | De [XmlSchemaCollection](../) die u aan deze collectie wilt toevoegen. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaCollection](../)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&) method


Voegt het schema toe dat zich bevindt in de [XmlReader](../../../system.xml/xmlreader/) aan de schemacollectie.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| ns | const String\& | De namespace-URI die aan het schema is gekoppeld. Voor XML-schema's is dit doorgaans de **targetNamespace**. |
| reader | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) die het toe te voegen schema bevat. |

### ReturnValue

De [XmlSchema](../../xmlschema/) die aan de schemacollectie is toegevoegd; **nullptr** als het toegevoegde schema een XDR-schema is of als er compilatiefouten in het schema zijn.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Voegt het schema toe dat zich bevindt in de [XmlReader](../../../system.xml/xmlreader/) aan de schemacollectie. De opgegeven [XmlResolver](../../../system.xml/xmlresolver/) wordt gebruikt om externe bronnen op te lossen.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| ns | const String\& | De namespace-URI die aan het schema is gekoppeld. Voor XML-schema's is dit doorgaans de **targetNamespace**. |
| reader | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) die het toe te voegen schema bevat. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | De [XmlResolver](../../../system.xml/xmlresolver/) die wordt gebruikt om namespaces te resolven die worden vermeld in **include**- en **import**-elementen of het **x-schema**-attribuut (XDR-schema's). Als dit **nullptr** is, worden externe verwijzingen niet opgelost. |

### ReturnValue

De [XmlSchema](../../xmlschema/) die aan de schemacollectie is toegevoegd; **nullptr** als het toegevoegde schema een XDR-schema is of als er compilatiefouten in het schema zijn.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const String\&) method


Voegt het schema dat zich op de opgegeven URL bevindt toe aan de schemacollectie.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const String &uri)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| ns | const String\& | De namespace-URI die aan het schema is gekoppeld. Voor XML-schema's is dit doorgaans de **targetNamespace**. |
| uri | const String\& | De URL die het te laden schema specificeert. |

### ReturnValue

De [XmlSchema](../../xmlschema/) die aan de schemacollectie is toegevoegd; **nullptr** als het toegevoegde schema een XDR-schema is of als er compilatiefouten in het schema zijn.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
