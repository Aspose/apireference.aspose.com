---
title: "System::Xml::XmlTextReader::get_Name metodo"
linktitle: "get_Name"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlTextReader::get_Name metodo. Restituisce il nome qualificato del nodo corrente in C++."
type: docs
weight: 1900
url: /it/cpp/system.xml/xmltextreader/get_name/
---
## XmlTextReader::get_Name method


Restituisce il nome qualificato del nodo corrente.

```cpp
String System::Xml::XmlTextReader::get_Name() override
```


### ReturnValue

Il nome qualificato del nodo corrente. Per esempio, **Name** è **bk:book** per l'elemento **<bk:book>**.
## Osservazioni



Il nome restituito dipende dal valore [XmlTextReader::get_NodeType](../get_nodetype/) del nodo. I seguenti tipi di nodo restituiscono i valori elencati. Tutti gli altri tipi di nodo restituiscono una stringa vuota. |||
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
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
