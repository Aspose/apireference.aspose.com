---
title: "System::IO::FileInfo klasse"
linktitle: "FileInfo"
second_title: "Aspose.Page voor C++"
description: "System::IO::FileInfo klasse. Vertegenwoordigt een pad naar een bestand en een bestand waarnaar dit pad verwijst en biedt methoden voor het manipuleren ervan. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1400
url: /nl/cpp/system.io/fileinfo/
---
## FileInfo class


Vertegenwoordigt een pad naar een bestand en een bestand waarnaar dit pad verwijst en biedt methoden voor het manipuleren ervan. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class FileInfo : public System::IO::FileSystemInfo
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AppendText](./appendtext/)() | Opent een bestand dat wordt vertegenwoordigd door het huidige object voor het schrijven van tekst met UTF-8‑codering, in de modus 'Append' zonder delen. |
| [CopyTo](./copyto/)(const String\&) | Kopieert het bestand dat wordt vertegenwoordigd door het huidige object naar de opgegeven locatie. Als het doelbestand al bestaat, mislukt de kopie. |
| [CopyTo](./copyto/)(const String\&, bool) | Kopieert het bestand dat wordt vertegenwoordigd door het huidige object naar de opgegeven locatie. Een parameter geeft aan of een bestaand doelbestand moet worden overschreven. |
| [Create](./create/)() | Maakt een bestand op de locatie die wordt opgegeven door het pad dat wordt vertegenwoordigd door het huidige object en opent het voor lezen en schrijven, in truncate‑modus en zonder delen. |
| [CreateText](./createtext/)() | Maakt een bestand op de locatie die wordt opgegeven door het pad dat wordt vertegenwoordigd door het huidige object en opent het voor het schrijven van tekst met UTF-8‑codering zonder delen. |
| [Decrypt](./decrypt/)() | NOG NIET GEÏMPLENTEERD. |
| [Delete](./delete/)() override | Verwijdert het bestand dat wordt vertegenwoordigd door het huidige object. |
| [Encrypt](./encrypt/)() | NOG NIET GEÏMPLENTEERD. |
| [FileInfo](./fileinfo/)(const String\&) | Construeert een nieuwe instantie van de [FileInfo](./) klasse die het opgegeven bestand vertegenwoordigt. |
| [get_Directory](./get_directory/)() | Retourneert een [DirectoryInfo](../directoryinfo/) object dat een map vertegenwoordigt waarin het bestand dat door het huidige object wordt vertegenwoordigd zich bevindt. |
| [get_DirectoryName](./get_directoryname/)() | Retourneert de volledige naam van de map waarin het bestand dat door het huidige object wordt vertegenwoordigd zich bevindt. |
| [get_Exists](./get_exists/)() override | Retourneert een waarde die aangeeft of het bestand bestaat. |
| [get_IsReadOnly](./get_isreadonly/)() | Retourneert een waarde die aangeeft of het attribuut ReadOnly is ingesteld. |
| [get_Length](./get_length/)() | Retourneert de grootte van het bestand in bytes. |
| [get_Name](./get_name/)() override | Retourneert de naam van het bestand. |
| [MoveTo](./moveto/)(const String\&) | Verplaatst het bestand dat wordt vertegenwoordigd door het huidige object naar de opgegeven locatie. |
| [Open](./open/)(FileMode) | Opent het bestand dat wordt vertegenwoordigd door het huidige object in de opgegeven modus voor lezen en schrijven en zonder delen. |
| [Open](./open/)(FileMode, FileAccess) | Opent het bestand dat wordt vertegenwoordigd door het huidige object in de opgegeven modus, met het opgegeven toegangstype en zonder delen. |
| [Open](./open/)(FileMode, FileAccess, FileShare) | Opent het bestand dat wordt vertegenwoordigd door het huidige object in de opgegeven modus, met het opgegeven toegangstype en de deeloptie. |
| [OpenRead](./openread/)() | Opent een bestand dat wordt vertegenwoordigd door het huidige object alleen voor lezen, in de modus 'Open' met gedeelde toegang voor lezen. |
| [OpenText](./opentext/)() | Opent het bestaande bestand op de locatie die wordt opgegeven door het pad dat wordt vertegenwoordigd door het huidige object voor het lezen van tekst met UTF-8‑codering zonder delen. |
| [OpenWrite](./openwrite/)() | Opent een bestand dat wordt vertegenwoordigd door het huidige object alleen voor schrijven, in de modus 'OpenOrCreate' zonder delen. |
| [Replace](./replace/)(const String\&, const String\&) | Vervangt de inhoud van een opgegeven doelbestand door het bestand dat wordt vertegenwoordigd door het huidige [FileInfo](./) object en maakt een back‑up van het vervangen bestand. |
| [Replace](./replace/)(const String\&, const String\&, bool) | Vervangt de inhoud van een opgegeven doelbestand door het bestand dat wordt vertegenwoordigd door het huidige [FileInfo](./) object en maakt een back‑up van het vervangen bestand. |
| [set_IsReadOnly](./set_isreadonly/)(bool) | Stelt het ReadOnly-attribuut op het bestand in of schakelt het uit. |
| [ToString](./tostring/)() const override | Retourneert een pad dat wordt weergegeven door het huidige object. |
## Zie ook

* Class [FileSystemInfo](../filesysteminfo/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
