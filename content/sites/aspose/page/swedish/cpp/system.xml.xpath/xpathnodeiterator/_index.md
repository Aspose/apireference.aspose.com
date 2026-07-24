---
title: "System::Xml::XPath::XPathNodeIterator klass"
linktitle: "XPathNodeIterator"
second_title: "Aspose.Page för C++"
description: "System::Xml::XPath::XPathNodeIterator-klass. Tillhandahåller en iterator över en vald mängd noder i C++."
type: docs
weight: 600
url: /sv/cpp/system.xml.xpath/xpathnodeiterator/
---
## XPathNodeIterator class


Tillhandahåller en iterator över en utvald mängd noder.

```cpp
class XPathNodeIterator : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XPath::XPathNavigator>>
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| virtual [Clone](./clone/)() | När den åsidosätts i en avledd klass returneras en klon av detta [XPathNodeIterator](./)-objekt. |
| virtual [get_Count](./get_count/)() | Returnerar indexet för den sista noden i den valda mängden noder. |
| virtual [get_Current](./get_current/)() | När den åsidosätts i en avledd klass hämtas [XPathNavigator](../xpathnavigator/)-objektet för detta [XPathNodeIterator](./), placerat på den aktuella kontextnoden. |
| virtual [get_CurrentPosition](./get_currentposition/)() | När den åsidosätts i en avledd klass hämtas indexet för den aktuella positionen i den valda mängden noder. |
| [GetEnumerator](./getenumerator/)() override | Returnerar ett IEnumerator-objekt för att iterera genom den valda nodmängden. |
| virtual [MoveNext](./movenext/)() | När den åsidosätts i en avledd klass flyttas [XPathNavigator](../xpathnavigator/)-objektet som returneras av metoden [XPathNodeIterator::get_Current](./get_current/) till nästa nod i den valda nodmängden. |
| [XPathNodeIterator](./xpathnodeiterator/)() | Initierar en ny instans av klassen [XPathNodeIterator](./). |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [Ptr](./ptr/) | Ett alias för delad pekare till en instans av denna klass. |
## Se även

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
