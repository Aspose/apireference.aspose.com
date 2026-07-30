---
title: "System::Xml::XmlText class"
linktitle: "XmlText"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlText class. Stellt den Textinhalt eines Elements oder Attributs in C++ dar."
type: docs
weight: 3800
url: /de/cpp/system.xml/xmltext/
---
## XmlText class


Stellt den Textinhalt eines Elements oder Attributs dar.

```cpp
class XmlText : public System::Xml::XmlCharacterData
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Erstellt ein Duplikat dieses Knotens. |
| [get_LocalName](./get_localname/)() override | Gibt den lokalen Namen des Knotens zurück. |
| [get_Name](./get_name/)() override | Gibt den qualifizierten Namen des Knotens zurück. |
| [get_NodeType](./get_nodetype/)() override | Gibt den Typ des aktuellen Knotens zurück. |
| [get_PreviousText](./get_previoustext/)() override | Gibt den Textknoten zurück, der diesem Knoten unmittelbar vorausgeht. |
| [get_Value](./get_value/)() override | Gibt den Wert des Knotens zurück. |
| [set_Value](./set_value/)(String) override | Setzt den Wert des Knotens. |
| virtual [SplitText](./splittext/)(int32_t) | Teilt den Knoten an der angegebenen Position in zwei Knoten und lässt beide als Geschwister im Baum erhalten. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Speichert alle Kindknoten des Knotens in den angegebenen [XmlWriter](../xmlwriter/). [XmlText](./)-Knoten haben keine Kinder, daher hat diese Methode keine Wirkung. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Speichert den Knoten im angegebenen [XmlWriter](../xmlwriter/). |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlCharacterData](../xmlcharacterdata/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
