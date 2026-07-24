---
title: "System::Runtime::Serialization namespace"
linktitle: "System::Runtime::Serialization"
second_title: "Aspose.Page voor C++"
description: "Hoe gebruik je de System::Runtime::Serialization namespace in C++."
type: docs
weight: 5300
url: /nl/cpp/system.runtime.serialization/
---



## Klassen

| Klasse | Beschrijving |
| --- | --- |
| [FormatterConverter](./formatterconverter/) | Stelt een basisimplementatie van de [System::Runtime::Serialization::IFormatterConverter](./iformatterconverter/) interface voor. |
| [IFormatterConverter](./iformatterconverter/) | Biedt de verbinding tussen een instantie van [System::Runtime::Serialization::SerializationInfo](./serializationinfo/) en de door de formatter geleverde klasse die het beste geschikt is om de gegevens binnen de [System::Runtime::Serialization::SerializationInfo](./serializationinfo/) te parseren. |
| [ISerializable](./iserializable/) | Interface van een object dat kan worden geserialiseerd. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/)-pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [SerializationInfo](./serializationinfo/) | Bevat een set benoemde velden die een geserialiseerd object vertegenwoordigen. Niet geïmplementeerd. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/)-pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [StreamingContext](./streamingcontext/) | Dummy‑klasse om vertaalde klassen die StreamingContext gebruiken te laten compileren. Beheer geen instanties van deze klasse met [SmartPtr](../system/smartptr/); ze moeten alleen op de stack worden gealloceerd. |
