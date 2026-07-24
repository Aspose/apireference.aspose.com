---
title: "System::IO::Path klasse"
linktitle: "Path"
second_title: "Aspose.Page voor C++"
description: "System::IO::Path klasse. Biedt methoden voor het manipuleren van paden. Dit is een statisch type zonder instantie‑services. Je mag onder geen enkele omstandigheid instanties ervan maken in C++."
type: docs
weight: 1900
url: /nl/cpp/system.io/path/
---
## Path class


Biedt methoden voor het manipuleren van paden. Dit is een statisch type zonder instantie‑services. Je mag nooit op welke manier dan ook instanties ervan maken.

```cpp
class Path
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [ChangeExtension](./changeextension/)(const String\&, const String\&) | Wijzigt de extensie in het opgegeven bestandspad. |
| static [CheckPath](./checkpath/)(const String\&, const String\&, bool) | Bepaalt of het opgegeven pad geldig is door te controleren of het ongeldige tekens bevat. Er wordt een uitzondering gegooid als het pad ongeldige tekens bevat. |
| static [Combine](./combine/)(const ArrayPtr\<String\>\&) | Combineert de opgegeven padsegmenten tot één pad en voegt indien nodig directory‑scheidingsteken‑tekens tussen de segmenten in. |
| static [Combine](./combine/)(const String\&, const String\&) | Combineert twee opgegeven padsegmenten tot één pad en voegt indien nodig een directory‑scheidingsteken‑karakter tussen de segmenten in. |
| static [Combine](./combine/)(const String\&, const String\&, const String\&) | Combineert drie opgegeven padsegmenten tot één pad en voegt indien nodig directory‑scheidingsteken‑karakters tussen de segmenten in. |
| static [Combine](./combine/)(const String\&, const String\&, const String\&, const String\&) | Combineert vier opgegeven padsegmenten tot één pad en voegt indien nodig directory‑scheidingsteken‑karakters tussen de segmenten in. |
| static [GetDirectoryName](./getdirectoryname/)(const String\&) | Retourneert de naam van de directory waarnaar verwezen wordt door het opgegeven pad. |
| static [GetExtension](./getextension/)(const String\&) | Retourneert de extensie van het bestand waarnaar verwezen wordt door het opgegeven pad. |
| static [GetFileName](./getfilename/)(const String\&) | Retourneert de naam van het bestand waarnaar verwezen wordt door het opgegeven pad. |
| static [GetFileNameWithoutExtension](./getfilenamewithoutextension/)(const String\&) | Retourneert de naam zonder extensie van het bestand waarnaar verwezen wordt door het opgegeven pad. |
| static [GetFullPath](./getfullpath/)(const String\&) | Converteert het opgegeven pad naar een absoluut pad. |
| static [GetInvalidFileNameChars](./getinvalidfilenamechars/)() | Retourneert een array met tekens die niet zijn toegestaan in bestandsnamen. |
| static [GetInvalidPathChars](./getinvalidpathchars/)() | Retourneert een array met tekens die niet zijn toegestaan in padnamen. |
| static [GetPathRoot](./getpathroot/)(const String\&) | Retourneert de hoofdmap van het opgegeven pad. |
| static [GetRandomFileName](./getrandomfilename/)() | Retourneert een willekeurig gegenereerde bestandsnaam. |
| static [GetTempFileName_](./gettempfilename_/)() | Maakt een nieuw bestand met een unieke naam en retourneert een volledig pad ernaartoe. |
| static [GetTempFileNameSafe](./gettempfilenamesafe/)() | Maakt een nieuw bestand met een unieke naam en retourneert een volledig pad ernaartoe. Is een synoniem van de [GetTempFileName_()](./gettempfilename_/) methode. |
| static [GetTempPath](./gettemppath/)() | Retourneert het pad van de tijdelijke directory van de huidige gebruiker. |
| static [HasExtension](./hasextension/)(const String\&) | Bepaalt of het opgegeven pad verwijst naar een bestand met extensie. |
| static [IsPathRooted](./ispathrooted/)(const String\&) | Bepaalt of het opgegeven pad een root bevat. |
| static [NormalizePath](./normalizepath/)(const String\&) | Normaliseert het opgegeven pad. |
| static [ToBoost](./toboost/)(const String\&) | Retourneert een instantie van de boost::filesystem::path‑klasse die het opgegeven pad vertegenwoordigt. |
| static [ToString](./tostring/)(const boost::filesystem::path\&) | Retourneert een tekenreeksrepresentatie van het opgegeven Boost‑padobject. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [AltDirectorySeparatorChar](./altdirectoryseparatorchar/) | Een alternatief teken dat wordt gebruikt om directory‑niveaus in een pad te scheiden. |
| static [DirectorySeparatorChar](./directoryseparatorchar/) | Een teken dat wordt gebruikt om directory‑niveaus in een pad te scheiden. |
| static [PathSeparator](./pathseparator/) | Een scheidingsteken‑karakter dat wordt gebruikt om pad‑strings in omgevingsvariabelen te scheiden. |
| static [VolumeSeparatorChar](./volumeseparatorchar/) | Een volumeseparatorteken. |
## Opmerkingen



```cpp
#include "system/io/path.h"
#include <iostream>

int main()
{
  using namespace System::IO;

  // Genereer een willekeurige bestandsnaam.
  auto filename = Path::GetRandomFileName();

  // Print informatie over bestandsnaam.
  std::cout <<
    "Filename: " << Path::GetFileName(filename) << std::endl <<
    "Filename w/o an extension: " << Path::GetFileNameWithoutExtension(filename) << std::endl <<
    "Extension: " << Path::GetExtension(filename) << std::endl;

  return 0;
}
/*
This code example produces the following output:
Filename: qhuzkyqv.y6p
Filename w/o an extension: qhuzkyqv
Extension: .y6p
*/
```

## Zie ook

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
