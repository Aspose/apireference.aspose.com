---
title: "System::Xml::XmlImplementation class"
linktitle: "XmlImplementation"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlImplementation class. Definiert den Kontext für eine Menge von XmlDocument-Objekten in C++."
type: docs
weight: 2000
url: /de/cpp/system.xml/xmlimplementation/
---
## XmlImplementation class


Definiert den Kontext für eine Menge von [XmlDocument](../xmldocument/)-Objekten.

```cpp
class XmlImplementation : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [CreateDocument](./createdocument/)() | Erstellt ein neues [XmlDocument](../xmldocument/). |
| [HasFeature](./hasfeature/)(const String\&, const String\&) | Prüft, ob die Document-[Object](../../system/object/)-Modell (DOM)-Implementierung ein bestimmtes Merkmal implementiert. |
| [XmlImplementation](./xmlimplementation/)() | Initialisiert eine neue Instanz der [XmlImplementation](./)-Klasse. |
| [XmlImplementation](./xmlimplementation/)(const SharedPtr\<XmlNameTable\>\&) | Initialisiert eine neue Instanz der [XmlImplementation](./)-Klasse mit der angegebenen [XmlNameTable](../xmlnametable/). |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared-Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
