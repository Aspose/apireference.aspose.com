---
title: "System::Collections::Specialized::StringDictionary Klasse"
linktitle: "StringDictionary"
second_title: "Aspose.Font für C++"
description: "System::Collections::Specialized::StringDictionary Klasse. String‑zu‑String‑Wörterbuch. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 500
url: /de/cpp/system.collections.specialized/stringdictionary/
---
## StringDictionary class


[String](../../system/string/) to string dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class StringDictionary : public System::Collections::Generic::Dictionary<String, String>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [idx_get](./idx_get/)(const String\&) const override | Liefert den Wert für einen bestimmten Schlüssel. |
## Siehe auch

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Font for C++](../../)
