---
title: "Metodo System::Xml::XmlReader::get_LocalName"
linktitle: "get_LocalName"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::XmlReader::get_LocalName. Quando sovrascritto in una classe derivata, ottiene il nome locale del nodo corrente in C++."
type: docs
weight: 1400
url: /it/cpp/system.xml/xmlreader/get_localname/
---
## XmlReader::get_LocalName method


Quando sovrascritto in una classe derivata, ottiene il nome locale del nodo corrente.

```cpp
virtual String System::Xml::XmlReader::get_LocalName()=0
```


### ReturnValue

Il nome del nodo corrente con il prefisso rimosso. Per esempio, **LocalName** è **book** per l'elemento **<bk:book>**. Per i tipi di nodo che non hanno un nome (come **[Text](../../../system.text/)**, **Comment**, ecc.), questo metodo restituisce [String::Empty](../../../system/string/empty/).

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
