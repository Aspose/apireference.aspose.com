---
title: "System::Xml::XmlWriter::WriteProcessingInstruction method"
linktitle: "WriteProcessingInstruction"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlWriter::WriteProcessingInstruction method. Quando sovrascritto in una classe derivata, scrive un'istruzione di elaborazione con uno spazio tra il nome e il testo come segue: <?name text?> in C++."
type: docs
weight: 2700
url: /it/cpp/system.xml/xmlwriter/writeprocessinginstruction/
---
## XmlWriter::WriteProcessingInstruction method


Quando sovrascritto in una classe derivata, scrive un'istruzione di elaborazione con uno spazio tra il nome e il testo come segue: **<?name text?>**.

```cpp
virtual void System::Xml::XmlWriter::WriteProcessingInstruction(String name, String text)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Il nome dell'istruzione di elaborazione. |
| testo | Stringa | Il testo da includere nell'istruzione di elaborazione. |
## Osservazioni



Questo metodo viene utilizzato per creare una dichiarazione XML dopo che [XmlWriter::WriteStartDocument](../writestartdocument/) è già stato chiamato.
## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
