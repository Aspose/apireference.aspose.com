---
title: "System::Runtime::Serialization::SerializationInfo Klasse"
linktitle: "SerializationInfo"
second_title: "Aspose.Page für C++"
description: "System::Runtime::Serialization::SerializationInfo Klasse. Enthält eine Menge benannter Felder, die ein serialisiertes Objekt repräsentieren. Nicht implementiert. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system.runtime.serialization/serializationinfo/
---
## SerializationInfo class


Enthält eine Menge benannter Felder, die ein serialisiertes Objekt darstellen. Nicht implementiert. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class SerializationInfo : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddValue](./addvalue/)(const System::String\&, float) | Setzt einen Float-Wert. Nicht implementiert. |
| [AddValue](./addvalue/)(const System::String\&, short) | Setzt einen Short-Wert. Nicht implementiert. |
| [AddValue](./addvalue/)(const System::String\&, bool) | Setzt einen Booleschen Wert. Nicht implementiert. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Setzt einen Objektwert. Nicht implementiert. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Setzt einen Objektwert mit angegebenem Typ. Nicht implementiert. |
| [GetValue](./getvalue/)(const System::String\&, const System::TypeInfo\&) | Ruft einen Wert aus dem [SerializationInfo](./)-Speicher ab. Nicht implementiert. |
| [SerializationInfo](./serializationinfo/)(const System::TypeInfo\&, const System::SharedPtr\<IFormatterConverter\>\&) | RTTI-Informationen. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)
