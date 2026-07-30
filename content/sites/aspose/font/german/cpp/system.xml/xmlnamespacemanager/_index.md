---
title: "Klasse System::Xml::XmlNamespaceManager"
linktitle: "XmlNamespaceManager"
second_title: "Aspose.Font für C++"
description: "Klasse System::Xml::XmlNamespaceManager. Löst Namensräume auf, fügt sie einer Sammlung hinzu und entfernt sie und bietet eine Bereichsverwaltung für diese Namensräume in C++."
type: docs
weight: 2300
url: /de/cpp/system.xml/xmlnamespacemanager/
---
## XmlNamespaceManager class


Löst Namensräume auf, fügt sie hinzu und entfernt sie aus einer Sammlung und bietet eine Gültigkeitsbereichsverwaltung für diese Namensräume.

```cpp
class XmlNamespaceManager : public System::Xml::IXmlNamespaceResolver,
                            public System::Collections::Generic::IEnumerable<String>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [AddNamespace](./addnamespace/)(String, String) | Fügt den angegebenen Namensraum zur Sammlung hinzu. |
| virtual [get_DefaultNamespace](./get_defaultnamespace/)() | Gibt die Namespace‑URI für den Standard‑Namensraum zurück. |
| virtual [get_NameTable](./get_nametable/)() | Gibt die mit diesem Objekt verknüpfte [XmlNameTable](../xmlnametable/) zurück. |
| [GetEnumerator](./getenumerator/)() override | Gibt einen Enumerator zurück, der zum Durchlaufen der Namensräume im [XmlNamespaceManager](./) verwendet werden kann. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Gibt eine Sammlung von Namensräumen zurück, die nach Präfix indiziert sind und zum Aufzählen der derzeit im Geltungsbereich befindlichen Namensräume verwendet werden kann. |
| virtual [HasNamespace](./hasnamespace/)(String) | Gibt einen Wert zurück, der angibt, ob das angegebene Präfix für den aktuell gepushten Bereich einen definierten Namensraum hat. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Gibt die Namespace‑URI für das angegebene Präfix zurück. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | Findet das für die angegebene Namespace‑URI deklarierte Präfix. |
| virtual [PopScope](./popscope/)() | Entfernt einen Namensraum‑Bereich vom Stapel. |
| virtual [PushScope](./pushscope/)() | Schiebt einen Namensraum‑Bereich auf den Stapel. |
| virtual [RemoveNamespace](./removenamespace/)(String, String) | Entfernt den angegebenen Namespace für das angegebene Präfix. |
| [XmlNamespaceManager](./xmlnamespacemanager/)(const SharedPtr\<XmlNameTable\>\&) | Initialisiert eine neue Instanz der Klasse [XmlNamespaceManager](./) mit der angegebenen [XmlNameTable](../xmlnametable/). |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
