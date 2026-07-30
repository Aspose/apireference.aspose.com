---
title: "System::Xml::XPath::XPathNodeIterator Klasse"
linktitle: "XPathNodeIterator"
second_title: "Aspose.Font für C++"
description: "System::Xml::XPath::XPathNodeIterator Klasse. Stellt einen Iterator über eine ausgewählte Menge von Knoten in C++ bereit."
type: docs
weight: 600
url: /de/cpp/system.xml.xpath/xpathnodeiterator/
---
## XPathNodeIterator class


Stellt einen Iterator über einer ausgewählten Menge von Knoten bereit.

```cpp
class XPathNodeIterator : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XPath::XPathNavigator>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Clone](./clone/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt es eine Kopie dieses [XPathNodeIterator](./)-Objekts zurück. |
| virtual [get_Count](./get_count/)() | Gibt den Index des letzten Knotens in der ausgewählten Knotengruppe zurück. |
| virtual [get_Current](./get_current/)() | Wenn in einer abgeleiteten Klasse überschrieben, erhält es das [XPathNavigator](../xpathnavigator/)-Objekt für diesen [XPathNodeIterator](./), das auf dem aktuellen Kontextknoten positioniert ist. |
| virtual [get_CurrentPosition](./get_currentposition/)() | Wenn in einer abgeleiteten Klasse überschrieben, erhält es den Index der aktuellen Position in der ausgewählten Knotengruppe. |
| [GetEnumerator](./getenumerator/)() override | Gibt ein IEnumerator-Objekt zurück, um durch die ausgewählte Knotengruppe zu iterieren. |
| virtual [MoveNext](./movenext/)() | Wenn in einer abgeleiteten Klasse überschrieben, bewegt es das von der Methode [XPathNodeIterator::get_Current](./get_current/) zurückgegebene [XPathNavigator](../xpathnavigator/)-Objekt zum nächsten Knoten in der ausgewählten Knotengruppe. |
| [XPathNodeIterator](./xpathnodeiterator/)() | Initialisiert eine neue Instanz der [XPathNodeIterator](./)-Klasse. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Siehe auch

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
