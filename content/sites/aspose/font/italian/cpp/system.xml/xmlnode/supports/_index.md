---
title: "System::Xml::XmlNode::Supports metodo"
linktitle: "Supports"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlNode::Supports metodo. Verifica se l'implementazione DOM supporta una funzionalità specifica in C++."
type: docs
weight: 4400
url: /it/cpp/system.xml/xmlnode/supports/
---
## XmlNode::Supports method


Verifica se l'implementazione DOM implementa una funzionalità specifica.

```cpp
virtual bool System::Xml::XmlNode::Supports(String feature, String version)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| funzionalità | Stringa | Il nome del pacchetto della funzionalità da testare. Questo nome non distingue tra maiuscole e minuscole. |
| versione | Stringa | Il numero di versione del nome del pacchetto da testare. Se la versione non è specificata (null), il supporto di qualsiasi versione della funzionalità fa sì che il metodo restituisca true. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## Osservazioni



La tabella seguente descrive le combinazioni che restituiscono **true**. |||
|-|-|
| Funzionalità | Versione |
| XML | 1.0 |
| XML | 2.0 |

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
