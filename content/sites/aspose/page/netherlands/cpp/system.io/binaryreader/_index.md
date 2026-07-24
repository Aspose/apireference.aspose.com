---
title: "System::IO::BinaryReader class"
linktitle: "BinaryReader"
second_title: "Aspose.Page voor C++"
description: "System::IO::BinaryReader class. Vertegenwoordigt een lezer die primitieve gegevenstypen leest als binaire gegevens in een specifieke codering. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime-fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 800
url: /nl/cpp/system.io/binaryreader/
---
## BinaryReader class


Vertegenwoordigt een lezer die primitieve gegevenstypen leest als binaire gegevens in een specifieke codering. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime-fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class BinaryReader : public System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&) | Construeert een instantie van de [BinaryReader](./) klasse die gegevens leest van de opgegeven stream met UTF-8-codering. |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | Construeert een instantie van de [BinaryReader](./) klasse die gegevens leest van de opgegeven stream met de opgegeven codering. |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&, bool) | Construeert een instantie van de [BinaryReader](./) klasse die gegevens leest van de opgegeven stream met de opgegeven codering. |
| virtual [Close](./close/)() | Sluit het huidige [BinaryReader](./)-object en de onderliggende invoerstroom. |
| [Dispose](./dispose/)() override | Geeft alle door het huidige object gebruikte bronnen vrij en sluit de onderliggende stream. |
| virtual [get_BaseStream](./get_basestream/)() | Retourneert de invoerstroom. |
| virtual [PeekChar](./peekchar/)() | Leest één teken van de invoerstroom zonder de leescursor van de stroom te wijzigen. |
| virtual [Read](./read/)() | Leest één teken van de invoerstroom. |
| virtual [Read](./read/)(ArrayPtr\<uint8_t\>, int, int) | Leest het opgegeven aantal bytes van de invoerstroom en schrijft ze naar de opgegeven byte-array. |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | Leest het opgegeven aantal tekens van de invoerstroom, zet ze om naar UTF-16-codering en schrijft de resulterende UTF-16-tekens naar de opgegeven tekenarray, beginnend op de opgegeven positie. |
| virtual [ReadBoolean](./readboolean/)() | Leest één byte van de invoerstroom en retourneert de booleaanse representatie ervan. |
| virtual [ReadByte](./readbyte/)() | Leest één byte van de invoerstroom. |
| virtual [ReadBytes](./readbytes/)(int) | Leest het opgegeven aantal bytes van de invoerstroom. |
| virtual [ReadChar](./readchar/)() | Leest één teken van de invoerstroom. |
| virtual [ReadChars](./readchars/)(int) | Leest het opgegeven aantal tekens van de invoerstroom en retourneert ze in UTF-16-codering. |
| virtual [ReadDecimal](./readdecimal/)() | NOG NIET GEÏMPLENTEERD. |
| virtual [ReadDouble](./readdouble/)() | Leest 8 bytes van de invoerstroom en retourneert ze als een double-precision floating point-waarde. |
| virtual [ReadInt16](./readint16/)() | Leest 2 bytes van de invoerstroom en retourneert ze als een 16-bit integerwaarde. |
| virtual [ReadInt32](./readint32/)() | Leest 4 bytes van de invoerstroom en retourneert ze als een 32-bit integerwaarde. |
| virtual [ReadInt64](./readint64/)() | Leest 8 bytes van de invoerstroom en retourneert ze als een 64-bit integerwaarde. |
| virtual [ReadSByte](./readsbyte/)() | Leest één byte van de invoerstroom en retourneert deze als een ondertekende 8-bit integerwaarde. |
| virtual [ReadSingle](./readsingle/)() | Leest 4 bytes van de invoerstroom en retourneert ze als een single-precision floating point-waarde. |
| virtual [ReadString](./readstring/)() | Leest een string van de huidige stroom. De string wordt voorafgegaan door de lengte, gecodeerd als een integer van zeven bits per keer. |
| virtual [ReadUInt16](./readuint16/)() | Leest 2 bytes van de invoerstroom en retourneert ze als een onondertekende 16-bit integerwaarde. |
| virtual [ReadUInt32](./readuint32/)() | Leest 4 bytes van de invoerstroom en retourneert ze als een onondertekende 32-bit integerwaarde. |
| virtual [ReadUInt64](./readuint64/)() | Leest 8 bytes van de invoerstroom en retourneert ze als een onondertekende 64-bit integerwaarde. |
| virtual [~BinaryReader](./~binaryreader/)() | Destructor. |
## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
