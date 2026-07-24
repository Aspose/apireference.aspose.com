---
title: "System::Xml::XmlCharacterData klasse"
linktitle: "XmlCharacterData"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlCharacterData klasse. Biedt tekstbewerkingsmethoden die door verschillende klassen in C++ worden gebruikt."
type: docs
weight: 900
url: /nl/cpp/system.xml/xmlcharacterdata/
---
## XmlCharacterData class


Biedt tekstbewerkingsmethoden die door verschillende klassen worden gebruikt.

```cpp
class XmlCharacterData : public System::Xml::XmlLinkedNode
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [AppendData](./appenddata/)(String) | Voegt de opgegeven tekenreeks toe aan het einde van de karaktergegevens van het knooppunt. |
| virtual [DeleteData](./deletedata/)(int32_t, int32_t) | Verwijdert een reeks tekens uit het knooppunt. |
| virtual [get_Data](./get_data/)() | Retourneert de gegevens van het knooppunt. |
| [get_InnerText](./get_innertext/)() override | Geeft de samengevoegde waarden van het knooppunt en alle kinderen van het knooppunt terug. |
| virtual [get_Length](./get_length/)() | Geeft de lengte van de gegevens, in tekens, terug. |
| [get_Value](./get_value/)() override | Geeft de waarde van het knooppunt terug. |
| virtual [InsertData](./insertdata/)(int32_t, String) | Voegt de opgegeven tekenreeks in op de opgegeven tekenoffset. |
| virtual [ReplaceData](./replacedata/)(int32_t, int32_t, String) | Vervangt het opgegeven aantal tekens beginnend bij de opgegeven offset door de opgegeven tekenreeks. |
| virtual [set_Data](./set_data/)(String) | Stelt de gegevens van het knooppunt in. |
| [set_InnerText](./set_innertext/)(String) override | Stelt de samengevoegde waarden van het knooppunt en alle kinderen van het knooppunt in. |
| [set_Value](./set_value/)(String) override | Stelt de waarde van het knooppunt in. |
| virtual [Substring](./substring/)(int32_t, int32_t) | Haalt een subreeks op van de volledige tekenreeks binnen het opgegeven bereik. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Zie ook

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
