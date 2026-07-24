---
title: "System::Xml::ValidationType enum"
linktitle: "ValidationType"
second_title: "Aspose.Page per C++"
description: "System::Xml::ValidationType enum. Specifica il tipo di convalida da eseguire in C++."
type: docs
weight: 5500
url: /it/cpp/system.xml/validationtype/
---
## ValidationType enum


Specifica il tipo di convalida da eseguire.

```cpp
enum class ValidationType
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| None | 0 | Non viene eseguita alcuna convalida e non vengono sollevati errori di convalida. Questa impostazione crea un parser non convalidante conforme a XML 1.0. |
| Auto | 1 | Convalida se vengono trovate informazioni DTD o di schema. |
| DTD | 2 | Convalida secondo il DTD. |
| XDR | 3 | Convalida secondo gli schemi XML-Data Reduced (XDR), inclusi gli schemi XDR inline. Gli schemi XDR sono riconosciuti usando il prefisso di namespace **x-schema** o il valore [XmlValidatingReader::get_Schemas](../xmlvalidatingreader/get_schemas/). |
| Schema | 4 | Convalida secondo gli schemi del linguaggio di definizione XML [Schema](../../system.xml.schema/) (XSD), inclusi gli schemi XML inline. Gli schemi XML sono associati a URI di namespace sia usando l'attributo **schemaLocation** sia tramite i **Schemas** forniti. |

## Vedi anche

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
