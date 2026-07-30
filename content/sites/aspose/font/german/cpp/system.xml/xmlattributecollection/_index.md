---
title: "System::Xml::XmlAttributeCollection‑Klasse"
linktitle: "XmlAttributeCollection"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlAttributeCollection‑Klasse. Stellt eine Sammlung von Attributen dar, auf die in C++ über Namen oder Index zugegriffen werden kann."
type: docs
weight: 700
url: /de/cpp/system.xml/xmlattributecollection/
---
## XmlAttributeCollection class


Stellt eine Sammlung von Attributen dar, die nach Name oder Index zugänglich sind.

```cpp
class XmlAttributeCollection : public System::Xml::XmlNamedNodeMap
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Append](./append/)(const SharedPtr\<XmlAttribute\>\&) | Fügt das angegebene Attribut als letztes Element in die Sammlung ein. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&, int32_t) | Kopiert alle [XmlAttribute](../xmlattribute/)-Objekte aus dieser Sammlung in das angegebene Array. |
| [idx_get](./idx_get/)(int32_t) | Gibt das Attribut mit dem angegebenen Index zurück. |
| [idx_get](./idx_get/)(const String\&) | Gibt das Attribut mit dem angegebenen Namen zurück. |
| [idx_get](./idx_get/)(const String\&, const String\&) | Gibt das Attribut mit dem angegebenen lokalen Namen und dem Namespace Uniform Resource Identifier (URI) zurück. |
| [InsertAfter](./insertafter/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | Fügt das angegebene Attribut unmittelbar nach dem angegebenen Referenzattribut ein. |
| [InsertBefore](./insertbefore/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | Fügt das angegebene Attribut unmittelbar vor dem angegebenen Referenzattribut ein. |
| [Prepend](./prepend/)(const SharedPtr\<XmlAttribute\>\&) | Fügt das angegebene Attribut als erstes Element in die Sammlung ein. |
| [Remove](./remove/)(const SharedPtr\<XmlAttribute\>\&) | Entfernt das angegebene Attribut aus der Sammlung. |
| [RemoveAll](./removeall/)() | Entfernt alle Attribute aus der Sammlung. |
| [RemoveAt](./removeat/)(int32_t) | Entfernt das Attribut, das dem angegebenen Index entspricht, aus der Sammlung. |
| [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) override | Fügt einen [XmlNode](../xmlnode/) hinzu, indem das Ergebnis von [XmlNode::get_Name](../xmlnode/get_name/) verwendet wird. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlNamedNodeMap](../xmlnamednodemap/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
