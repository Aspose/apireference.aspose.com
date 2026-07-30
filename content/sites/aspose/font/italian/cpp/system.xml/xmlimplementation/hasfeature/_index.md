---
title: "Metodo System::Xml::XmlImplementation::HasFeature"
linktitle: "HasFeature"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlImplementation::HasFeature method. Verifica se l'implementazione del Document Object Model (DOM) implementa una funzionalità specifica in C++."
type: docs
weight: 300
url: /it/cpp/system.xml/xmlimplementation/hasfeature/
---
## XmlImplementation::HasFeature method


Verifica se l'implementazione del Document [Object](../../../system/object/) Model (DOM) implementa una funzionalità specifica.

```cpp
bool System::Xml::XmlImplementation::HasFeature(const String &strFeature, const String &strVersion)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| strFeature | const String\& | Il nome del pacchetto della funzionalità da testare. Questo nome non distingue tra maiuscole e minuscole. |
| strVersion | const String\& | Questo è il numero di versione del nome del pacchetto da testare. Se la versione non è specificata (**nullptr**), il supporto di qualsiasi versione della funzionalità fa sì che il metodo restituisca **true**. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## Osservazioni



La tabella seguente mostra le combinazioni che fanno restituire **true** a **HasFeature**. |||
|-|-|
| strFeature | strVersion |
| XML | 1.0 |
| XML | 2.0 |

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlImplementation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
