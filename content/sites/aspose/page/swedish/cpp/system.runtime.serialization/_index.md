---
title: "System::Runtime::Serialization namnrymd"
linktitle: "System::Runtime::Serialization"
second_title: "Aspose.Page för C++"
description: "Hur man använder System::Runtime::Serialization namnrymd i C++."
type: docs
weight: 5300
url: /sv/cpp/system.runtime.serialization/
---



## Klasser

| Klass | Beskrivning |
| --- | --- |
| [FormatterConverter](./formatterconverter/) | Representerar en grundläggande implementation av gränssnittet [System::Runtime::Serialization::IFormatterConverter](./iformatterconverter/). |
| [IFormatterConverter](./iformatterconverter/) | Tillhandahåller anslutningen mellan en instans av [System::Runtime::Serialization::SerializationInfo](./serializationinfo/) och den formatteringslevererade klassen som är bäst lämpad att tolka data i [System::Runtime::Serialization::SerializationInfo](./serializationinfo/). |
| [ISerializable](./iserializable/) | Gränssnitt för objekt som kan serialiseras. Objekt av denna klass bör endast allokeras med hjälp av funktionen [System::MakeObject()](../system/makeobject/). Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kommer att leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument. |
| [SerializationInfo](./serializationinfo/) | Innehåller en uppsättning namngivna fält som representerar ett serialiserat objekt. Inte implementerad. Objekt av denna klass bör endast allokeras med hjälp av funktionen [System::MakeObject()](../system/makeobject/). Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kommer att leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument. |
| [StreamingContext](./streamingcontext/) | Dummy-klass för att få klasser som använder StreamingContext att kompilera. Hantera inte instanser av denna klass med [SmartPtr](../system/smartptr/), de måste allokeras på stacken endast. |
