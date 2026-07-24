---
title: "System::Xml::XmlValidatingReader::get_Name metodo"
linktitle: "get_Name"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlValidatingReader::get_Name metodo. Restituisce il nome qualificato del nodo corrente in C++."
type: docs
weight: 1700
url: /it/cpp/system.xml/xmlvalidatingreader/get_name/
---
## XmlValidatingReader::get_Name method


Restituisce il nome qualificato del nodo corrente.

```cpp
String System::Xml::XmlValidatingReader::get_Name() override
```


### ReturnValue

Il nome qualificato del nodo corrente. Per esempio, **Name** è **bk:book** per l'elemento **<bk:book>**.
## Osservazioni



Il nome restituito dipende dal XmlValidatingReader::NodeType del nodo. I seguenti tipi di nodo restituiscono i valori elencati. Tutti gli altri tipi di nodo restituiscono una stringa vuota. |||
|-|-|
| Tipo di nodo | Nome |
| Attributo | Il nome dell'attributo. |
| DocumentType | Il nome del tipo di documento. |
| Elemento | Il nome del tag. |
| EntityReference | Il nome dell'entità referenziata. |
| ProcessingInstruction | La destinazione dell'istruzione di elaborazione. |
| XmlDeclaration | La stringa letterale xml. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
