---
title: "Metodo System::Xml::XmlDocument::CreateXmlDeclaration"
linktitle: "CreateXmlDeclaration"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::XmlDocument::CreateXmlDeclaration. Crea un nodo XmlDeclaration con i valori specificati in C++."
type: docs
weight: 1600
url: /it/cpp/system.xml/xmldocument/createxmldeclaration/
---
## XmlDocument::CreateXmlDeclaration method


Crea un nodo [XmlDeclaration](../../xmldeclaration/) con i valori specificati.

```cpp
virtual SharedPtr<XmlDeclaration> System::Xml::XmlDocument::CreateXmlDeclaration(const String &version, const String &encoding, const String &standalone)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| versione | const String\& | La versione deve essere "1.0". |
| encoding | const String\& | Il valore dell'attributo di codifica. Questa è la codifica utilizzata quando si salva il [XmlDocument](../) su un file o su uno stream; pertanto, deve essere impostata a una stringa supportata dalla classe [Text::Encoding](../../../system.text/encoding/), altrimenti "XmlDocument::Save(String)" fallisce. Se è **nullptr** o [String::Empty](../../../system/string/empty/), il metodo [XmlDocument::Save](../save/) non scrive un attributo di codifica nella dichiarazione XML e quindi viene utilizzata la codifica predefinita, UTF-8. |
| standalone | const String\& | Il valore deve essere "yes" o "no". Se è **nullptr** o [String::Empty](../../../system/string/empty/), il metodo [XmlDocument::Save](../save/) non scrive un attributo standalone nella dichiarazione XML. |

### ReturnValue

Il nuovo nodo [XmlDeclaration](../../xmldeclaration/).
## Osservazioni



Nota: se il [XmlDocument](../) viene salvato su un TextWriter o su un [XmlTextWriter](../../xmltextwriter/), questo valore di codifica viene scartato. Invece, viene utilizzata la codifica del TextWriter o del [XmlTextWriter](../../xmltextwriter/). Ciò garantisce che l'XML scritto possa essere letto nuovamente utilizzando la codifica corretta.
## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDeclaration](../../xmldeclaration/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
