---
title: "System::Xml::Schema::XmlSchemaObjectEnumerator Klasse"
linktitle: "XmlSchemaObjectEnumerator"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaObjectEnumerator Klasse. Stellt den Enumerator für die XmlSchemaObjectCollection in C++ dar."
type: docs
weight: 5200
url: /de/cpp/system.xml.schema/xmlschemaobjectenumerator/
---
## XmlSchemaObjectEnumerator class


Stellt den Enumerator für die [XmlSchemaObjectCollection](../xmlschemaobjectcollection/) dar.

```cpp
class XmlSchemaObjectEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Klonen des aktuellen Iterators. |
| [Dispose](./dispose/)() override | Tut nichts. |
| [get_Current](./get_current/)() const override | Gibt das aktuelle [XmlSchemaObject](../xmlschemaobject/) in der Sammlung zurück. |
| [MoveNext](./movenext/)() override | Wechselt zum nächsten Element in der Sammlung. |
| [Reset](./reset/)() override | Setzt den Enumerator auf den Anfang der Sammlung zurück. |
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
