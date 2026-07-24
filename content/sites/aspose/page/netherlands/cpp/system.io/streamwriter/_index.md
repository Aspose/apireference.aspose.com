---
title: "System::IO::StreamWriter klasse"
linktitle: "StreamWriter"
second_title: "Aspose.Page voor C++"
description: "System::IO::StreamWriter klasse. Vertegenwoordigt een schrijver die tekens naar een byte-stream schrijft. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2300
url: /nl/cpp/system.io/streamwriter/
---
## StreamWriter class


Vertegenwoordigt een schrijver die tekens naar een byte-stream schrijft. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)-pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class StreamWriter : public System::IO::TextWriter
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Close](./close/)() override | Sluit de stream en geeft verkregen bronnen vrij. |
| [Dispose](./dispose/)() override | Geeft alle door het huidige object gebruikte bronnen vrij en sluit de onderliggende stream. |
| [Flush](./flush/)() override | Leegt de inhoud van de buffer naar de onderliggende stream en leegt vervolgens de onderliggende stream. |
| [get_AutoFlush](./get_autoflush/)() const | Retourneert een waarde die aangeeft of de [StreamWriter](./) de gegevens naar de onderliggende stream zal flushen elke keer dat de methode [StreamWriter::Write](./write/) wordt aangeroepen. |
| [get_BaseStream](./get_basestream/)() const | Retourneert een gedeelde pointer naar een object dat de onderliggende stream vertegenwoordigt. |
| [get_Encoding](./get_encoding/)() override | Retourneert de momenteel gebruikte codering. |
| [set_AutoFlush](./set_autoflush/)(bool) | Retourneert een waarde die specificeert of de [StreamWriter](./) de gegevens naar de onderliggende stream moet flushen elke keer dat de methode [StreamWriter::Write](./write/) wordt aangeroepen. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&) | Construeert een instantie van het [StreamWriter](./)-object dat tekens naar de opgegeven onderliggende stream schrijft met UTF-8-codering en een buffer met een standaardgrootte van 1024 bytes. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | Construeert een instantie van het [StreamWriter](./)-object dat tekens naar de opgegeven onderliggende stream schrijft met de opgegeven codering en een buffer met een standaardgrootte van 1024 bytes. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) | Construeert een instantie van het [StreamWriter](./)-object dat tekens naar de opgegeven onderliggende stream schrijft met de opgegeven codering en een buffer van de opgegeven grootte. Een parameter geeft aan of de onderliggende stream moet worden gesloten wanneer het [StreamWriter](./)-object wordt afgevoerd. |
| [StreamWriter](./streamwriter/)(const String\&) | Construeert een instantie van het [StreamWriter](./)-object dat tekens naar het opgegeven bestand schrijft met UTF-8-codering en een buffer met een standaardgrootte van 1024 bytes. |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&) | Construeert een instantie van het [StreamWriter](./)-object dat tekens naar het opgegeven bestand schrijft met de opgegeven codering en een buffer met een standaardgrootte van 1024 bytes. Een parameter geeft aan of de gegevens aan het bestand moeten worden toegevoegd of dat het bestand moet worden overschreven. |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&, int) | Construeert een instantie van het [StreamWriter](./)-object dat tekens naar het opgegeven bestand schrijft met de opgegeven codering en buffergrootte. Een parameter geeft aan of de gegevens aan het bestand moeten worden toegevoegd of dat het bestand moet worden overschreven. |
| [Write](./write/)(char_t) override | Schrijft het opgegeven teken naar de stream. |
| [Write](./write/)(const String\&) override | Schrijft de opgegeven tekenreeks naar de stream. |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | Schrijft de tekenreeksrepresentatie van het opgegeven object naar de stream. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | Schrijft alle tekens van de opgegeven array naar de stream. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Schrijft het opgegeven subbereik van UTF-16-tekens van de opgegeven tekenarray naar de stream. |
| [Write](./write/)(const char_t *) override | Schrijft de opgegeven c-string naar de stream. |
| [Write](./write/)(const System::SharedPtr\<T\>\&) | Schrijft de tekenreeksrepresentatie van het opgegeven object naar de stream. |
| [WriteLine](./writeline/)() override | Schrijft regeleinde-tekens naar de stream. |
| [WriteLine](./writeline/)(const String\&) override | Schrijft de opgegeven tekenreeks, gevolgd door de regeleinde-tekens, naar de stream. |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | Schrijft de tekenreeksrepresentatie van het opgegeven object, gevolgd door de regeleinde-tekens, naar de stream. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | Schrijft alle tekens van de opgegeven array, gevolgd door de regeleinde-tekens, naar de stream. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Schrijft het opgegeven subbereik van UTF-16-tekens van de opgegeven tekenarray, gevolgd door de regeleinde-tekens, naar de stream. |
| [WriteLine](./writeline/)(const char_t *) override | Schrijft de opgegeven c-string, gevolgd door de regeleinde-tekens, naar de stream. |
| [WriteLine](./writeline/)(const System::SharedPtr\<T\>\&) | Schrijft de tekenreeksrepresentatie van het opgegeven object, gevolgd door de regeleinde-tekens, naar de stream. |
| [~StreamWriter](./~streamwriter/)() | Destructor. |
## Zie ook

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
