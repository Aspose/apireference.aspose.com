---
title: "System::IO::StreamReader class"
linktitle: "StreamReader"
second_title: "Aspose.Page voor C++"
description: "System::IO::StreamReader klasse. Vertegenwoordigt een lezer die tekens leest uit een byte‑stroom. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2200
url: /nl/cpp/system.io/streamreader/
---
## StreamReader class


Vertegenwoordigt een lezer die tekens leest uit een byte‑stroom. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class StreamReader : public System::IO::TextReader
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Close](./close/)() override | Sluit de huidige en onderliggende streams. |
| [Dispose](./dispose/)() override | Geeft alle door het huidige object gebruikte bronnen vrij en sluit de onderliggende stream. |
| [get_BaseStream](./get_basestream/)() const | Retourneert een gedeelde pointer naar een object dat de onderliggende stream vertegenwoordigt. |
| [get_CurrentEncoding](./get_currentencoding/)() | Retourneert de momenteel gebruikte codering. |
| [get_EndOfStream](./get_endofstream/)() | Retourneert een waarde die aangeeft of het einde van de stream is bereikt. |
| [Peek](./peek/)() override | Leest een enkel teken uit de stroom zonder de leescursor van de stroom te wijzigen. |
| [Read](./read/)() override | Leest een enkel teken uit de stroom. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | Leest het opgegeven aantal tekens uit de stream, zet ze om naar UTF-16‑codering en schrijft de resulterende UTF-16‑tekens naar de opgegeven tekenarray, beginnend op de opgegeven positie. |
| [ReadLine](./readline/)() override | Leest tekens uit de stream tot het einde van de huidige regel. |
| [ReadToEnd](./readtoend/)() override | Leest tekens uit de stream tot het einde van de stream. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&) | Construeert een instantie van het [StreamReader](./)‑object dat tekens leest uit de opgegeven onderliggende stream met UTF-8‑codering en een buffer met een standaardgrootte van 1024 bytes. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, bool) | Construeert een instantie van het [StreamReader](./)‑object dat tekens leest uit de opgegeven onderliggende stream met UTF-8‑codering en een buffer met een standaardgrootte van 1024 bytes. Een parameter geeft aan of byte‑order‑mark‑detectie moet worden ingeschakeld. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | Construeert een instantie van het [StreamReader](./)‑object dat tekens leest uit de opgegeven onderliggende stream met de opgegeven codering en een buffer met een standaardgrootte van 1024 bytes. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) | Construeert een instantie van het [StreamReader](./)‑object dat tekens leest uit de opgegeven onderliggende stream met de opgegeven codering en een buffer met een standaardgrootte van 1024 bytes. Een parameter geeft aan of byte‑order‑mark‑detectie moet worden ingeschakeld. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) | Construeert een instantie van het [StreamReader](./)‑object dat tekens leest uit de opgegeven onderliggende stream met de opgegeven codering en een buffer met de opgegeven grootte. Een parameter geeft aan of byte‑order‑mark‑detectie moet worden ingeschakeld. |
| [StreamReader](./streamreader/)(const System::String\&) | Construeert een instantie van het [StreamReader](./)‑object dat tekens leest uit het opgegeven bestand met UTF-8‑codering en een buffer met een standaardgrootte van 4096 bytes. |
| [StreamReader](./streamreader/)(const System::String\&, bool) | Construeert een instantie van het [StreamReader](./)‑object dat tekens leest uit het opgegeven bestand met UTF-8‑codering en een buffer met een standaardgrootte van 4096 bytes. Een parameter geeft aan of byte‑order‑mark‑detectie moet worden ingeschakeld. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&) | Construeert een instantie van het [StreamReader](./)‑object dat tekens leest uit het opgegeven bestand met de opgegeven codering en een buffer met een standaardgrootte van 4096 bytes. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool) | Construeert een instantie van het [StreamReader](./)‑object dat tekens leest uit de opgegeven onderliggende stream met de opgegeven codering en een buffer met een standaardgrootte van 4096 bytes. Een parameter geeft aan of byte‑order‑mark‑detectie moet worden ingeschakeld. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool, int) | Construeert een instantie van het [StreamReader](./)‑object dat tekens leest uit het opgegeven bestand met de opgegeven codering en een buffer met de opgegeven grootte. Een parameter geeft aan of byte‑order‑mark‑detectie moet worden ingeschakeld. |
| [~StreamReader](./~streamreader/)() | Destructor. |
## Zie ook

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
