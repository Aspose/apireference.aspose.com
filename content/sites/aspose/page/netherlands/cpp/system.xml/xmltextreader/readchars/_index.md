---
title: "System::Xml::XmlTextReader::ReadChars methode"
linktitle: "ReadChars"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlTextReader::ReadChars methode. Leest de tekstinhoud van een element in een tekenbuffer. Deze methode is ontworpen om grote stromen van ingesloten tekst te lezen door deze herhaaldelijk aan te roepen in C++."
type: docs
weight: 4600
url: /nl/cpp/system.xml/xmltextreader/readchars/
---
## XmlTextReader::ReadChars method


Leest de tekstinhoud van een element in een tekenbuffer. Deze methode is ontworpen om grote stromen van ingesloten tekst achtereenvolgens te lezen.

```cpp
int32_t System::Xml::XmlTextReader::ReadChars(const ArrayPtr<char16_t> &buffer, int32_t index, int32_t count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const ArrayPtr\<char16_t\>\& | De array van tekens die dient als de buffer waarin de tekstinhoud wordt geschreven. |
| index | int32_t | De positie binnen **buffer** waar de methode kan beginnen met het schrijven van tekstinhoud. |
| count | int32_t | Het aantal tekens dat in **buffer** moet worden geschreven. |

### ReturnValue

Het aantal gelezen tekens. Dit kan 0 zijn als de lezer niet op een element is gepositioneerd of als er geen verdere tekstinhoud meer is om terug te geven in de huidige context.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
