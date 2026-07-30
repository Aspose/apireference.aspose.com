---
title: "System::Runtime::Serialization::SerializationInfo Klasse"
linktitle: "SerializationInfo"
second_title: "Aspose.Font für C++"
description: "System::Runtime::Serialization::SerializationInfo Klasse. Enthält eine Menge benannter Felder, die ein serialisiertes Objekt repräsentieren. Nicht implementiert. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system.runtime.serialization/serializationinfo/
---
## SerializationInfo class


Enthält eine Menge benannter Felder, die ein serialisiertes Objekt repräsentieren. Nicht implementiert. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class SerializationInfo : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddValue](./addvalue/)(const System::String\&, float) | Setzt float-Wert. Nicht implementiert. |
| [AddValue](./addvalue/)(const System::String\&, short) | Setzt short-Wert. Nicht implementiert. |
| [AddValue](./addvalue/)(const System::String\&, bool) | Setzt boolean-Wert. Nicht implementiert. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Setzt Objektwert. Nicht implementiert. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Setzt Objektwert mit angegebenem Typ. Nicht implementiert. |
| [GetValue](./getvalue/)(const System::String\&, const System::TypeInfo\&) | Ruft einen Wert aus dem [SerializationInfo](./)-Speicher ab. Nicht implementiert. |
| [SerializationInfo](./serializationinfo/)(const System::TypeInfo\&, const System::SharedPtr\<IFormatterConverter\>\&) | RTTI-Informationen. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Font for C++](../../)
