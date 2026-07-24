---
title: "System::Xml::XmlReader::ReadValueChunk methode"
linktitle: "ReadValueChunk"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReader::ReadValueChunk methode. Leest grote tekststromen die zijn ingebed in een XML-document in C++."
type: docs
weight: 7400
url: /nl/cpp/system.xml/xmlreader/readvaluechunk/
---
## XmlReader::ReadValueChunk method


Leest grote tekststromen die in een XML-document zijn ingebed.

```cpp
virtual int32_t System::Xml::XmlReader::ReadValueChunk(ArrayPtr<char16_t> buffer, int32_t index, int32_t count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | ArrayPtr\<char16_t\> | De array van tekens die dient als de buffer waarin de tekstinhoud wordt geschreven. Deze waarde mag niet **nullptr** zijn. |
| index | int32_t | De offset binnen de buffer waar de [XmlReader](../) kan beginnen met het kopiëren van de resultaten. |
| count | int32_t | Het maximale aantal tekens dat naar de buffer gekopieerd moet worden. Het werkelijke aantal gekopieerde tekens wordt geretourneerd door deze methode. |

### ReturnValue

Het aantal tekens dat in de buffer is gelezen. De waarde nul wordt geretourneerd wanneer er geen tekstinhoud meer is.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
