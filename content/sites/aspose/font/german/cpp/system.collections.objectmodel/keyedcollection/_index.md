---
title: "System::Collections::ObjectModel::KeyedCollection class"
linktitle: "KeyedCollection"
second_title: "Aspose.Font für C++"
description: "System::Collections::ObjectModel::KeyedCollection class. Abstrakte Sammlung von Elementen mit eingebetteten Schlüsseln. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 200
url: /de/cpp/system.collections.objectmodel/keyedcollection/
---
## KeyedCollection class


Abstrakte Sammlung von Elementen mit eingebetteten Schlüsseln. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
template<typename TKey,typename TItem>class KeyedCollection : public System::Collections::ObjectModel::Collection<TItem>
```


| Parameter | Beschreibung |
| --- | --- |
| TKey | Schlüsseltyp. |
| TItem | Werttyp. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const TItem\&) override | Element am Ende des Containers hinzufügen. |
| [Contains](./contains/)(TKey) | Prüft, ob der Schlüssel im Container vorhanden ist. |
| [get_Comparer](./get_comparer/)() | Gibt den Vergleichsoperator zurück. |
| [idx_get](./idx_get/)(TKey) | Gibt das Element an einem bestimmten Index zurück. |
| [Remove](./remove/)(TKey) | Entfernt den Schlüssel aus dem Container. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Bewirkt, dass ein bestimmtes Template-Argument als schwacher Zeiger statt als gemeinsamer Zeiger behandelt wird (falls zutreffend). |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [defaultThreshold](./defaultthreshold/) | Schwellenwert für die Erstellung des Lookup-Wörterbuchs, Standard. |

## Siehe auch

* Class [Collection](../collection/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Font for C++](../../)
