---
title: "System::Net::Http::Headers::ObjectCollection Klasse"
linktitle: "ObjectCollection"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::ObjectCollection Klasse. Stellt die Sammlung der Objekte in C++ dar."
type: docs
weight: 1600
url: /de/cpp/system.net.http.headers/objectcollection/
---
## ObjectCollection class


Stellt die Sammlung der Objekte dar.

```cpp
template<typename T>class ObjectCollection : public System::Collections::ObjectModel::Collection<T>
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Objekttyp. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ObjectCollection](./objectcollection/)() | RTTI-Informationen. |
| [ObjectCollection](./objectcollection/)(Action\<T\>) | Erstellt eine neue Instanz. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Setzt das n‑te Template-Argument auf einen schwachen Zeiger (statt eines geteilten). Ermöglicht das Umschalten von Zeigern in Containern in den Weak‑Modus. |

## Siehe auch

* Class [Collection](../../system.collections.objectmodel/collection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
