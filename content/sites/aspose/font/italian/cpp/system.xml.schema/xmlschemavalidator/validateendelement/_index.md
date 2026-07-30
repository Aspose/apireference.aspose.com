---
title: "Metodo System::Xml::Schema::XmlSchemaValidator::ValidateEndElement"
linktitle: "ValidateEndElement"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::Schema::XmlSchemaValidator::ValidateEndElement. Verifica se il contenuto testuale dell'elemento è valido secondo il suo tipo di dato per gli elementi con contenuto semplice, e verifica se il contenuto dell'elemento corrente è completo per gli elementi con contenuto complesso in C++."
type: docs
weight: 1800
url: /it/cpp/system.xml.schema/xmlschemavalidator/validateendelement/
---
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&) method


Verifica se il contenuto testuale dell'elemento è valido in base al suo tipo di dati per gli elementi con contenuto semplice, e verifica se il contenuto dell'elemento corrente è completo per gli elementi con contenuto complesso.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Un oggetto [XmlSchemaInfo](../../xmlschemainfo/) le cui proprietà vengono impostate dopo una convalida riuscita dell'elemento. Questo parametro può essere **nullptr**. |

### ReturnValue

Il valore testuale analizzato e tipizzato dell'elemento se l'elemento ha contenuto semplice.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) method


Verifica se il contenuto testuale dell'elemento specificato è valido in base al suo tipo di dati.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo, const SharedPtr<Object> &typedValue)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Un oggetto [XmlSchemaInfo](../../xmlschemainfo/) le cui proprietà vengono impostate dopo una convalida riuscita del contenuto testuale dell'elemento. Questo parametro può essere **nullptr**. |
| typedValue | const SharedPtr\<Object\>\& | Il contenuto testuale tipizzato dell'elemento. |

### ReturnValue

Il contenuto semplice analizzato e tipizzato dell'elemento.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
