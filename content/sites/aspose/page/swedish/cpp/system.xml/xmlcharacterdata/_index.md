---
title: "System::Xml::XmlCharacterData-klass"
linktitle: "XmlCharacterData"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlCharacterData-klass. Tillhandahåller textmanipuleringsmetoder som används av flera klasser i C++."
type: docs
weight: 900
url: /sv/cpp/system.xml/xmlcharacterdata/
---
## XmlCharacterData class


Tillhandahåller textmanipuleringsmetoder som används av flera klasser.

```cpp
class XmlCharacterData : public System::Xml::XmlLinkedNode
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| virtual [AppendData](./appenddata/)(String) | Lägger till den angivna strängen i slutet av teckendata för noden. |
| virtual [DeleteData](./deletedata/)(int32_t, int32_t) | Tar bort ett intervall av tecken från noden. |
| virtual [get_Data](./get_data/)() | Returnerar nodens data. |
| [get_InnerText](./get_innertext/)() override | Returnerar de sammanslagna värdena för noden och alla nodens barn. |
| virtual [get_Length](./get_length/)() | Returnerar längden på data, i tecken. |
| [get_Value](./get_value/)() override | Returnerar värdet på noden. |
| virtual [InsertData](./insertdata/)(int32_t, String) | Infogar den angivna strängen vid den angivna teckenoffseten. |
| virtual [ReplaceData](./replacedata/)(int32_t, int32_t, String) | Ersätter det angivna antalet tecken som börjar vid den angivna offseten med den angivna strängen. |
| virtual [set_Data](./set_data/)(String) | Ställer in data för noden. |
| [set_InnerText](./set_innertext/)(String) override | Ställer in de sammanslagna värdena för noden och alla nodens barn. |
| [set_Value](./set_value/)(String) override | Ställer in värdet på noden. |
| virtual [Substring](./substring/)(int32_t, int32_t) | Hämtar en delsträng av hela strängen från det angivna intervallet. |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [Ptr](./ptr/) | Ett alias för delad pekare till en instans av denna klass. |
## Se även

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
