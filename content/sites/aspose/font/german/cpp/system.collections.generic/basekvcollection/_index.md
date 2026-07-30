---
title: "System::Collections::Generic::BaseKVCollection Klasse"
linktitle: "BaseKVCollection"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::BaseKVCollection Klasse. Enthält gemeinsamen Code für Sammlungen von Schlüsseln oder Werten. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 700
url: /de/cpp/system.collections.generic/basekvcollection/
---
## BaseKVCollection class


Enthält gemeinsamen Code für Sammlungen von Schlüsseln oder Werten. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename Dict,typename KV>class BaseKVCollection : public System::Collections::Generic::IKVCollection<KV>
```


| Parameter | Beschreibung |
| --- | --- |
| Dict | [Dictionary](../dictionary/) Typ. |
| KV | Schlüssel- oder Werttyp, je nachdem, wofür die Schnittstelle verwendet wird. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [BaseKVCollection](./basekvcollection/)(const typename Dict::Ptr\&) | Erstellt Sammlung. |
| [CopyTo](./copyto/)(ArrayPtr\<KV\>, int) override | Kopiert Daten in vorhandene Array-Elemente. |
| [get_Count](./get_count/)() const override | Gibt die Anzahl der Elemente zurück. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Ermöglicht die Kompilierung, bewirkt jedoch nichts, da diese Struktur keine Daten besitzt. |

## Siehe auch

* Class [IKVCollection](../ikvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
