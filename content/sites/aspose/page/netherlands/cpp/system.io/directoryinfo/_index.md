---
title: "System::IO::DirectoryInfo klasse"
linktitle: "DirectoryInfo"
second_title: "Aspose.Page voor C++"
description: "System::IO::DirectoryInfo klasse. Vertegenwoordigt een bestandssysteempad, een map die door dit pad wordt aangeduid en biedt instantie‑methoden voor het manipuleren van mappen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1200
url: /nl/cpp/system.io/directoryinfo/
---
## DirectoryInfo class


Vertegenwoordigt een bestandssysteempad, een map die door dit pad wordt aangeduid en biedt instantie‑methoden voor het manipuleren van mappen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class DirectoryInfo : public System::IO::FileSystemInfo
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Create](./create/)() | Maakt een map aan op het pad dat door het huidige object wordt vertegenwoordigd. |
| [CreateSubdirectory](./createsubdirectory/)(const String\&) | Maakt submappen aan op het opgegeven pad. |
| [Delete](./delete/)() override | Verwijdert de map die wordt aangeduid door het pad dat door het huidige object wordt vertegenwoordigd, als de map leeg is. |
| [Delete](./delete/)(bool) | Verwijdert de map die wordt aangeduid door het pad dat door het huidige object wordt vertegenwoordigd. Een parameter geeft aan of de inhoud van de map recursief moet worden verwijderd als de map niet leeg is. |
| [DirectoryInfo](./directoryinfo/)(const String\&) | Construeert een instantie van de [DirectoryInfo](./) klasse op het opgegeven pad. |
| [EnumerateDirectories](./enumeratedirectories/)() | Retourneert een doorzoekbare collectie met alle mappen die zich bevinden in de map die door het huidige object wordt vertegenwoordigd. |
| [EnumerateDirectories](./enumeratedirectories/)(const String\&) | Zoekt naar de mappen die voldoen aan de opgegeven zoekcriteria in de map die door het huidige object wordt vertegenwoordigd. |
| [EnumerateDirectories](./enumeratedirectories/)(const String\&, SearchOption) | Zoekt naar de mappen die voldoen aan de opgegeven zoekcriteria, hetzij in de map die door het huidige object wordt vertegenwoordigd, hetzij in de volledige mappenboom die is geworteld in de map die door het huidige object wordt vertegenwoordigd. |
| [EnumerateFiles](./enumeratefiles/)() | Retourneert een doorzoekbare collectie met alle bestanden die zich bevinden in de map die door het huidige object wordt vertegenwoordigd. |
| [EnumerateFiles](./enumeratefiles/)(const String\&) | Zoekt naar de bestanden die voldoen aan de opgegeven zoekcriteria in de map die door het huidige object wordt vertegenwoordigd. |
| [EnumerateFiles](./enumeratefiles/)(const String\&, SearchOption) | Zoekt naar de bestanden die voldoen aan de opgegeven zoekcriteria, hetzij in de map die door het huidige object wordt vertegenwoordigd, hetzij in de volledige mappenboom die is geworteld in de map die door het huidige object wordt vertegenwoordigd. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)() | Retourneert een doorzoekbare collectie met alle bestanden en mappen die zich bevinden in de map die door het huidige object wordt vertegenwoordigd. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)(const String\&) | Zoekt naar de bestanden en mappen die voldoen aan de opgegeven zoekcriteria in de map die door het huidige object wordt vertegenwoordigd. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)(const String\&, SearchOption) | Zoekt naar de bestanden en mappen die voldoen aan de opgegeven zoekcriteria, hetzij in de map die door het huidige object wordt vertegenwoordigd, hetzij in de volledige mappenboom die is geworteld in de map die door het huidige object wordt vertegenwoordigd. |
| [get_Exists](./get_exists/)() override | Bepaalt of het pad dat door het huidige object wordt vertegenwoordigd, verwijst naar een bestaande map. |
| [get_Name](./get_name/)() override | Retourneert de naam van de entiteit waarnaar het pad dat door het huidige object wordt vertegenwoordigd, verwijst. |
| [get_Parent](./get_parent/)() | Retourneert een gedeelde pointer naar een [DirectoryInfo](./) object dat een pad vertegenwoordigt dat verwijst naar de bovenliggende map van de map die door het huidige object wordt vertegenwoordigd. |
| [get_Root](./get_root/)() | Retourneert een gedeelde pointer naar een [DirectoryInfo](./) object dat een pad vertegenwoordigt dat verwijst naar de root‑map van de map die door het huidige object wordt vertegenwoordigd. |
| [GetDirectories](./getdirectories/)() | Retourneert een array met gedeelde pointers naar [DirectoryInfo](./) objecten die alle mappen vertegenwoordigen die zich bevinden in de map die door het huidige object wordt vertegenwoordigd. |
| [GetDirectories](./getdirectories/)(const String\&) | Zoekt naar de mappen die voldoen aan de opgegeven zoekcriteria in de map die door het huidige object wordt vertegenwoordigd. |
| [GetDirectories](./getdirectories/)(const String\&, SearchOption) | Zoekt naar de mappen die voldoen aan de opgegeven zoekcriteria, hetzij in de map die door het huidige object wordt vertegenwoordigd, hetzij in de volledige mappenboom die is geworteld in de map die door het huidige object wordt vertegenwoordigd. |
| [GetFiles](./getfiles/)() | Retourneert een array met gedeelde pointers naar [FileInfo](../fileinfo/) objecten die alle mappen vertegenwoordigen die zich bevinden in de map die door het huidige object wordt vertegenwoordigd. |
| [GetFiles](./getfiles/)(const String\&) | Zoekt naar de bestanden die voldoen aan de opgegeven zoekcriteria in de map die door het huidige object wordt vertegenwoordigd. |
| [GetFiles](./getfiles/)(const String\&, SearchOption) | Zoekt naar de bestanden die voldoen aan de opgegeven zoekcriteria, hetzij in de map die door het huidige object wordt vertegenwoordigd, hetzij in de volledige mappenboom die is geworteld in de map die door het huidige object wordt vertegenwoordigd. |
| [GetFileSystemInfos](./getfilesysteminfos/)() | Retourneert een array met gedeelde pointers naar [FileSystemInfo](../filesysteminfo/) objecten die alle bestanden en mappen vertegenwoordigen die zich bevinden in de map die door het huidige object wordt vertegenwoordigd. |
| [GetFileSystemInfos](./getfilesysteminfos/)(const String\&) | Zoekt naar de bestanden en mappen die voldoen aan de opgegeven zoekcriteria in de map die door het huidige object wordt vertegenwoordigd. |
| [GetFileSystemInfos](./getfilesysteminfos/)(const String\&, SearchOption) | Zoekt naar de bestanden en mappen die voldoen aan de opgegeven zoekcriteria, hetzij in de map die door het huidige object wordt vertegenwoordigd, hetzij in de volledige mappenboom die is geworteld in de map die door het huidige object wordt vertegenwoordigd. |
| [MoveTo](./moveto/)(const String\&) | Verplaatst de map die wordt vertegenwoordigd door het huidige object en al zijn inhoud naar de opgegeven locatie. |
| [ToString](./tostring/)() const override | Retourneert een string die het pad bevat dat wordt vertegenwoordigd door het huidige object. |
## Zie ook

* Class [FileSystemInfo](../filesysteminfo/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
