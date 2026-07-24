---
title: "System::Xml::Serialization::IXmlSerializable class"
linktitle: "IXmlSerializable"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Serialization::IXmlSerializable class. Biedt aangepaste opmaak voor XML-serialisatie en -deserialisatie. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 100
url: /nl/cpp/system.xml.serialization/ixmlserializable/
---
## IXmlSerializable class


Biedt aangepaste opmaak voor XML-serialisatie en -deserialisatie. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class IXmlSerializable : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [GetSchema](./getschema/)() | Een XmlSchema‑object dat de XML‑representatie beschrijft van het object dat wordt geretourneerd door de [WriteXml()](./writexml/)‑methode en geaccepteerd door de [ReadXml()](./readxml/)‑methode. |
| virtual [ReadXml](./readxml/)(System::SharedPtr\<System::Xml::XmlReader\>) | Deserialiseert een object vanuit zijn XML‑representatie. |
| virtual [WriteXml](./writexml/)(System::SharedPtr\<System::Xml::XmlWriter\>) | Serialiseert het huidige object naar XML‑representatie. |
| virtual [~IXmlSerializable](./~ixmlserializable/)() | Destructor. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
