---
title: "System::Xml::XmlReader::ReadElementContentAsObject metodo"
linktitle: "ReadElementContentAsObject"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlReader::ReadElementContentAsObject metodo. Legge l'elemento corrente e restituisce il contenuto come un Object in C++."
type: docs
weight: 6200
url: /it/cpp/system.xml/xmlreader/readelementcontentasobject/
---
## XmlReader::ReadElementContentAsObject() method


Legge l'elemento corrente e restituisce il contenuto come un [Object](../../../system/object/).

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject()
```


### ReturnValue

Un oggetto boxed del tipo più appropriato. Il valore [XmlReader::get_ValueType](../get_valuetype/) determina il tipo appropriato. Se il contenuto è tipizzato come un tipo di elenco, questo metodo restituisce un array di oggetti boxed del tipo appropriato.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementContentAsObject(String, String) method


Verifica che il nome locale e l'URI dello spazio dei nomi specificati corrispondano a quelli dell'elemento corrente, quindi legge l'elemento corrente e restituisce il contenuto come un [Object](../../../system/object/).

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject(String localName, String namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | String | Il nome locale dell'elemento. |
| namespaceURI | String | L'URI dello spazio dei nomi dell'elemento. |

### ReturnValue

Un oggetto boxed del tipo più appropriato. Il valore [XmlReader::get_ValueType](../get_valuetype/) determina il tipo appropriato. Se il contenuto è tipizzato come un tipo di elenco, questo metodo restituisce un array di oggetti boxed del tipo appropriato.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
