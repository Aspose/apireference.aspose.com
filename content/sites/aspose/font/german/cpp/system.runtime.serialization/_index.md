---
title: "System::Runtime::Serialization Namespace"
linktitle: "System::Runtime::Serialization"
second_title: "Aspose.Font für C++"
description: "Wie man das System::Runtime::Serialization Namespace in C++ verwendet."
type: docs
weight: 5700
url: /de/cpp/system.runtime.serialization/
---



## Klassen

| Klasse | Beschreibung |
| --- | --- |
| [FormatterConverter](./formatterconverter/) | Stellt eine Basisimplementierung des [System::Runtime::Serialization::IFormatterConverter](./iformatterconverter/) Interfaces dar. |
| [IFormatterConverter](./iformatterconverter/) | Stellt die Verbindung zwischen einer Instanz von [System::Runtime::Serialization::SerializationInfo](./serializationinfo/) und der vom Formatter bereitgestellten Klasse her, die am besten geeignet ist, die Daten innerhalb von [System::Runtime::Serialization::SerializationInfo](./serializationinfo/) zu analysieren. |
| [ISerializable](./iserializable/) | Schnittstelle für Objekte, die serialisiert werden können. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [SerializationInfo](./serializationinfo/) | Enthält einen Satz benannter Felder, die ein serialisiertes Objekt darstellen. Nicht implementiert. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [StreamingContext](./streamingcontext/) | Dummy-Klasse, um übersetzte Klassen, die StreamingContext verwenden, kompilierbar zu machen. Verwalten Sie Instanzen dieser Klasse nicht mit [SmartPtr](../system/smartptr/); sie müssen ausschließlich im Stack alloziert werden. |
