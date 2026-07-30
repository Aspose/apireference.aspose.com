---
title: "System::Xml::Schema::XmlSchemaObjectCollection class"
linktitle: "XmlSchemaObjectCollection"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaObjectCollection class. Eine Sammlung von XmlSchemaObjects in C++."
type: docs
weight: 5100
url: /de/cpp/system.xml.schema/xmlschemaobjectcollection/
---
## XmlSchemaObjectCollection class


Eine Sammlung von XmlSchemaObjects.

```cpp
class XmlSchemaObjectCollection : public System::Collections::CollectionBase<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const SharedPtr\<XmlSchemaObject\>\&) | Fügt ein [XmlSchemaObject](../xmlschemaobject/) zur [XmlSchemaObjectCollection](./) hinzu. |
| [Contains](./contains/)(const SharedPtr\<XmlSchemaObject\>\&) | Gibt an, ob das angegebene [XmlSchemaObject](../xmlschemaobject/) in der [XmlSchemaObjectCollection](./) enthalten ist. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchemaObject\>\>\&, int32_t) | Kopiert alle XmlSchemaObjects aus der Sammlung in das angegebene Array, beginnend beim angegebenen Index. |
| [GetEnumerator](./getenumerator/)() override | Gibt einen Enumerator zurück, um durch die im [XmlSchemaObjectCollection](./) enthaltenen XmlSchemaObjects zu iterieren. |
| virtual [idx_get](./idx_get/)(int32_t) | Gibt das [XmlSchemaObject](../xmlschemaobject/) am angegebenen Index zurück. |
| virtual [idx_set](./idx_set/)(int32_t, SharedPtr\<XmlSchemaObject\>) | Setzt das [XmlSchemaObject](../xmlschemaobject/) am angegebenen Index. |
| [IndexOf](./indexof/)(const SharedPtr\<XmlSchemaObject\>\&) | Gibt den Sammlungsindex zurück, der dem angegebenen [XmlSchemaObject](../xmlschemaobject/) entspricht. |
| [Insert](./insert/)(int32_t, const SharedPtr\<XmlSchemaObject\>\&) | Fügt ein [XmlSchemaObject](../xmlschemaobject/) in die [XmlSchemaObjectCollection](./) ein. |
| [Remove](./remove/)(const SharedPtr\<XmlSchemaObject\>\&) | Entfernt ein [XmlSchemaObject](../xmlschemaobject/) aus der [XmlSchemaObjectCollection](./). |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Setzt das n‑te Template-Argument auf einen schwachen Zeiger (statt eines geteilten). Ermöglicht das Umschalten von Zeigern in Containern in den Weak‑Modus. |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaObjectCollection](./). |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)(const SharedPtr\<XmlSchemaObject\>\&) | Initialisiert eine neue Instanz der Klasse [XmlSchemaObjectCollection](./), die ein [XmlSchemaObject](../xmlschemaobject/) übernimmt. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [CollectionBase](../../system.collections/collectionbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
