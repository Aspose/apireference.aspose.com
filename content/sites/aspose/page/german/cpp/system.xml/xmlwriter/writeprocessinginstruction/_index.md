---
title: "System::Xml::XmlWriter::WriteProcessingInstruction Methode"
linktitle: "WriteProcessingInstruction"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlWriter::WriteProcessingInstruction Methode. Wenn sie in einer abgeleiteten Klasse überschrieben wird, schreibt sie eine Verarbeitungsanweisung mit einem Leerzeichen zwischen Name und Text wie folgt: <?name text?> in C++."
type: docs
weight: 2700
url: /de/cpp/system.xml/xmlwriter/writeprocessinginstruction/
---
## XmlWriter::WriteProcessingInstruction method


Wenn in einer abgeleiteten Klasse überschrieben, schreibt es eine Verarbeitungsanweisung mit einem Leerzeichen zwischen Name und Text wie folgt: **<?name text?>**.

```cpp
virtual void System::Xml::XmlWriter::WriteProcessingInstruction(String name, String text)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| name | String | Der Name der Verarbeitungsanweisung. |
| text | String | Der Text, der in die Verarbeitungsanweisung eingefügt werden soll. |
## Hinweise



Diese Methode wird verwendet, um eine XML-Deklaration zu erstellen, nachdem [XmlWriter::WriteStartDocument](../writestartdocument/) bereits aufgerufen wurde.
## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
