---
title: "System::Collections::Generic::BaseDictionary Klasse"
linktitle: "BaseDictionary"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::BaseDictionary Klasse. Implementiert gemeinsamen Code für verschiedene wörterbuchähnliche Datenstrukturen (z. B. Dictionary, SortedDictionary). Sollte nicht direkt verwendet werden, außer bei Vererbung beim Definieren von Containern. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 500
url: /de/cpp/system.collections.generic/basedictionary/
---
## BaseDictionary class


Implementiert gemeinsamen Code für verschiedene wörterbuchähnliche Datenstrukturen (z. B. [Dictionary](../dictionary/), [SortedDictionary](../sorteddictionary/)). Sollte nicht direkt verwendet werden, außer bei Vererbung beim Definieren von Containern. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename Map>class BaseDictionary : public System::Collections::Generic::IDictionary<Map::key_type, Map::mapped_type>
```


| Parameter | Beschreibung |
| --- | --- |
| Map | Zugrunde liegender Map-Typ. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<typename Map::value_type\>) | C++-spezifisch. |
| [Add](./add/)(const key_t\&, const mapped_t\&) override | Fügt ein Schlüssel-Wert-Paar zum Wörterbuch hinzu. |
| [BaseDictionary](./basedictionary/)() | Erstellt eine leere Datenstruktur. |
| [BaseDictionary](./basedictionary/)(int, const Args\&...) | Weiterleitender Konstruktor, um Argumente an den zugrunde liegenden Map-Konstruktor zu übergeben. |
| [BaseDictionary](./basedictionary/)(BaseType *, const Args\&...) | Kopierkonstruktor. |
| [BaseDictionary](./basedictionary/)(BaseType *) | Kopierkonstruktor. |
| [begin](./begin/)() const | Gibt einen Iterator zum KVPair-Wrapper für das Schlüssel-Wert-Element des Containers zurück. Implementiert im C#‑Stil – der Iterator sollte das KVPair‑Objekt mit den Schnittstellen get_Key() und get_Value() zurückgeben. Wenn der Container leer ist, ist der zurückgegebene Iterator gleich [end()](../ienumerable/end/). |
| [cbegin](./cbegin/)() const | Gibt einen Iterator auf das erste Element des Containers zurück. Implementiert im STL‑Stil. Wenn der Container leer ist, ist der zurückgegebene Iterator gleich [end()](../ienumerable/end/). |
| [cend](./cend/)() const | Gibt einen Iterator auf das Element zurück, das dem letzten Element des Containers folgt. Implementiert im STL‑Stil. Dieses Element dient als Platzhalter; ein Zugriff darauf führt zu undefiniertem Verhalten. |
| [Clear](./clear/)() override | Löscht alle Elemente. |
| [ContainsKey](./containskey/)(const key_t\&) const override | Prüft, ob ein Schlüssel im Wörterbuch vorhanden ist. |
| [ContainsValue](./containsvalue/)(const mapped_t\&) | Prüft, ob ein Wert im Wörterbuch vorhanden ist. Verwendet den Operator == zum Vergleich der Werte. |
| [data](./data/)() | Zugriff auf die zugrunde liegende Datenspeicherung. |
| [data](./data/)() const | Zugriff auf die zugrunde liegende Datenspeicherung. |
| [end](./end/)() const | Gibt einen Iterator zum KVPair-Wrapper für das Schlüssel-Wert-Element zurück, das dem letzten Element des Containers folgt. Implementiert im C#‑Stil – der Iterator sollte das KVPair‑Objekt mit den Schnittstellen get_Key() und get_Value() zurückgeben. Dieses Element dient als Platzhalter; ein Zugriff darauf führt zu undefiniertem Verhalten. |
| [get_Count](./get_count/)() const override | Gibt die Anzahl der Elemente zurück. |
| virtual [GetEnumerator](./getenumerator/)() | Erstellt eine Enumerator-Instanz, die von einer Unterklasse implementiert werden sollte. |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&) const override | Gibt den Wert zurück, falls gefunden; sonst **Value()**. |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&, const mapped_t\&) const override | Gibt den Wert zurück, falls gefunden; sonst **defaultValue**. |
| [GetValueOrNull](./getvalueornull/)(const key_t\&) const override | Gibt den Wert zurück, wenn er gefunden wird; sonst **null**. Sinnvoll nur für Referenztypen. |
| [idx_get](./idx_get/)(const key_t\&) const override | Schlüsselbasierte Getter-Funktion. |
| [idx_set](./idx_set/)(const key_t\&, mapped_t) override | Schlüsselbasierte Setter-Funktion. Ändert oder erstellt ein Element. |
| virtual [operator[]](./operator[]/)(const key_t\&) | Accessor‑Funktion. |
| [Remove](./remove/)(const key_t\&) override | Entfernt einen bestimmten Schlüssel aus dem Wörterbuch. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(unsigned int) override |  |
| [TryGetValue](./trygetvalue/)(const key_t\&, mapped_t\&) const override | Sucht nach dem Schlüsselwert und gibt ihn zurück, falls gefunden. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Liefert die Implementierung des begin‑const‑Iterators für den aktuellen Container. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Liefert die Implementierung des begin‑Iterators für den aktuellen Container. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Liefert die Implementierung des end‑const‑Iterators für den aktuellen Container. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Liefert die Implementierung des end‑Iterators für den aktuellen Container. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [BaseType](./basetype/) | Implementierte Schnittstelle. |
| [const_iterator](./const_iterator/) | Typ des konstanten Iterators. |
| [iterator](./iterator/) | Iteratortyp. |
| [KeyCollection](./keycollection/) | Stellen Sie sicher, dass wir den richtigen Allocator mit dem zugrunde liegenden Speichertyp verwenden. |
| [KVPair](./kvpair/) | Typ für Schlüssel‑Wert‑Paar. |
| [map_t](./map_t/) | Interner Map-Typ. |
| [ValueCollection](./valuecollection/) | Sammlung von Werten. |

## Siehe auch

* Class [IDictionary](../idictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
