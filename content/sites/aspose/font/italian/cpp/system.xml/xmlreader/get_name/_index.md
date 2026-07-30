---
title: "System::Xml::XmlReader::get_Name metodo"
linktitle: "get_Name"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlReader::get_Name metodo. Quando sovrascritto in una classe derivata, ottiene il nome qualificato del nodo corrente in C++."
type: docs
weight: 1500
url: /it/cpp/system.xml/xmlreader/get_name/
---
## XmlReader::get_Name method


Quando sovrascritto in una classe derivata, ottiene il nome qualificato del nodo corrente.

```cpp
virtual String System::Xml::XmlReader::get_Name()
```


### ReturnValue

Il nome qualificato del nodo corrente. Per esempio, **Name** è **bk:book** per l'elemento **<bk:book>**.
## Osservazioni



Il nome restituito dipende dal valore [XmlReader::get_NodeType](../get_nodetype/) del nodo. I seguenti tipi di nodo restituiscono i valori elencati. Tutti gli altri tipi di nodo restituiscono una stringa vuota. |||
|-|-|
| Tipo di nodo | Nome |
| Attribute | Il nome dell'attributo. |
| DocumentType | Il nome del tipo di documento. |
| Element | Il nome del tag. |
| EntityReference | Il nome dell'entità referenziata. |
| ProcessingInstruction | Il target dell'istruzione di elaborazione. |
| XmlDeclaration | La stringa letterale xml. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
