---
title: "System::Xml::Serialization::IXmlSerializable Klasse"
linktitle: "IXmlSerializable"
second_title: "Aspose.Page für C++"
description: "System::Xml::Serialization::IXmlSerializable Klasse. Bietet benutzerdefinierte Formatierung für XML‑Serialisierung und -Deserialisierung. Objekte dieser Klasse sollten nur über die System::MakeObject()‑Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.xml.serialization/ixmlserializable/
---
## IXmlSerializable class


Bietet benutzerdefinierte Formatierung für XML‑Serialisierung und -Deserialisierung. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class IXmlSerializable : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [GetSchema](./getschema/)() | Ein XmlSchema‑Objekt, das die XML‑Darstellung des Objekts beschreibt, das von der [WriteXml()](./writexml/)‑Methode zurückgegeben und von der [ReadXml()](./readxml/)‑Methode akzeptiert wird. |
| virtual [ReadXml](./readxml/)(System::SharedPtr\<System::Xml::XmlReader\>) | Deserialisiert das Objekt aus seiner XML‑Darstellung. |
| virtual [WriteXml](./writexml/)(System::SharedPtr\<System::Xml::XmlWriter\>) | Serialisiert das aktuelle Objekt in eine XML‑Darstellung. |
| virtual [~IXmlSerializable](./~ixmlserializable/)() | Destruktor. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
