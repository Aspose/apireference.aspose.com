---
title: "System::Runtime::Serialization Namensraum"
linktitle: "System::Runtime::Serialization"
second_title: "Aspose.Page für C++"
description: "Wie man den System::Runtime::Serialization Namensraum in C++ verwendet."
type: docs
weight: 5300
url: /de/cpp/system.runtime.serialization/
---



## Klassen

| Klasse | Beschreibung |
| --- | --- |
| [FormatterConverter](./formatterconverter/) | Stellt eine Basisimplementierung des [System::Runtime::Serialization::IFormatterConverter](./iformatterconverter/) Interfaces dar. |
| [IFormatterConverter](./iformatterconverter/) | Stellt die Verbindung zwischen einer Instanz von [System::Runtime::Serialization::SerializationInfo](./serializationinfo/) und der vom Formatter bereitgestellten Klasse her, die am besten geeignet ist, die Daten innerhalb des [System::Runtime::Serialization::SerializationInfo](./serializationinfo/) zu analysieren. |
| [ISerializable](./iserializable/) | Schnittstelle eines Objekts, das serialisiert werden kann. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben. |
| [SerializationInfo](./serializationinfo/) | Enthält eine Menge benannter Felder, die ein serialisiertes Objekt repräsentieren. Nicht implementiert. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben. |
| [StreamingContext](./streamingcontext/) | Dummy-Klasse, um übersetzte Klassen, die StreamingContext verwenden, kompilierbar zu machen. Verwalten Sie Instanzen dieser Klasse nicht über [SmartPtr](../system/smartptr/), sie müssen ausschließlich auf dem Stack alloziert werden. |
