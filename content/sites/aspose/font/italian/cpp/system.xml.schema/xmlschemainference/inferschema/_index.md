---
title: "Metodo System::Xml::Schema::XmlSchemaInference::InferSchema"
linktitle: "InferSchema"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaInference::InferSchema metodo. Inferisce uno schema XML Schema Definition Language (XSD) dal documento XML contenuto nell'oggetto XmlReader specificato in C++."
type: docs
weight: 400
url: /it/cpp/system.xml.schema/xmlschemainference/inferschema/
---
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&) method


Inferisce uno schema XML [Schema](../../) Definition Language (XSD) dal documento XML contenuto nell'oggetto [XmlReader](../../../system.xml/xmlreader/) specificato.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | Un oggetto [XmlReader](../../../system.xml/xmlreader/) contenente il documento XML da cui inferire uno schema. |

### ReturnValue

Un oggetto [XmlSchemaSet](../../xmlschemaset/) contenente gli schemi inferiti.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) method


Inferisce uno schema XML [Schema](../../) Definition Language (XSD) dal documento XML contenuto nell'oggetto [XmlReader](../../../system.xml/xmlreader/) specificato, e perfeziona lo schema inferito utilizzando uno schema esistente nell'oggetto [XmlSchemaSet](../../xmlschemaset/) specificato con lo stesso namespace di destinazione.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument, SharedPtr<XmlSchemaSet> schemas)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | Un oggetto [XmlReader](../../../system.xml/xmlreader/) contenente il documento XML da cui inferire uno schema. |
| schemas | SharedPtr\<XmlSchemaSet\> | Un oggetto [XmlSchemaSet](../../xmlschemaset/) contenente uno schema esistente usato per perfezionare lo schema inferito. |

### ReturnValue

Un oggetto [XmlSchemaSet](../../xmlschemaset/) contenente gli schemi inferiti.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
