---
title: "System::Xml::XmlNotation Klasse"
linktitle: "XmlNotation"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNotation Klasse. Stellt eine Notationsdeklaration dar, wie <!NOTATION... > in C++."
type: docs
weight: 2900
url: /de/cpp/system.xml/xmlnotation/
---
## XmlNotation class


Stellt eine Notationsdeklaration dar, wie **<!NOTATION... >**.

```cpp
class XmlNotation : public System::Xml::XmlNode
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Erstellt ein Duplikat dieses Knotens. Notationsknoten können nicht geklont werden. Der Aufruf dieser Methode auf einem [XmlNotation](./)-Objekt löst eine Ausnahme aus. |
| [get_InnerXml](./get_innerxml/)() override | Gibt das Markup zurück, das die Kinder dieses Knotens darstellt. |
| [get_IsReadOnly](./get_isreadonly/)() override | Gibt einen Wert zurück, der angibt, ob der Knoten schreibgeschützt ist. |
| [get_LocalName](./get_localname/)() override | Gibt den Namen des aktuellen Knotens ohne den Namensraum-Präfix zurück. |
| [get_Name](./get_name/)() override | Gibt den Namen des aktuellen Knotens zurück. |
| [get_NodeType](./get_nodetype/)() override | Gibt den Typ des aktuellen Knotens zurück. |
| [get_OuterXml](./get_outerxml/)() override | Gibt das Markup zurück, das diesen Knoten und alle seine Kinder darstellt. |
| [get_PublicId](./get_publicid/)() | Gibt den Wert des öffentlichen Identifikators in der Notationsdeklaration zurück. |
| [get_SystemId](./get_systemid/)() | Gibt den Wert des Systemidentifikators in der Notationsdeklaration zurück. |
| [set_InnerXml](./set_innerxml/)(String) override | Setzt das Markup, das die Kinder dieses Knotens darstellt. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Speichert die Kinder des Knotens im angegebenen [XmlWriter](../xmlwriter/). Diese Methode hat keine Wirkung auf [XmlNotation](./)-Knoten. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Speichert den Knoten im angegebenen [XmlWriter](../xmlwriter/). Diese Methode hat keine Wirkung auf [XmlNotation](./)-Knoten. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
