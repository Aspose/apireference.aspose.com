---
title: "System::Xml::Schema::XmlSchemaCollectionEnumerator Klasse"
linktitle: "XmlSchemaCollectionEnumerator"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaCollectionEnumerator Klasse. Unterstützt eine einfache Iteration über eine Sammlung. Diese Klasse kann in C++ nicht abgeleitet werden."
type: docs
weight: 1600
url: /de/cpp/system.xml.schema/xmlschemacollectionenumerator/
---
## XmlSchemaCollectionEnumerator class


Unterstützt eine einfache Iteration über eine Sammlung. Diese Klasse kann nicht abgeleitet werden.

```cpp
class XmlSchemaCollectionEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Klonen des aktuellen Iterators. |
| [Dispose](./dispose/)() override | Tut nichts. |
| [get_Current](./get_current/)() const override | Gibt das aktuelle [XmlSchema](../xmlschema/) in der Sammlung zurück. |
| [MoveNext](./movenext/)() override | Bewegt den Enumerator zum nächsten Schema in der Sammlung vor. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
