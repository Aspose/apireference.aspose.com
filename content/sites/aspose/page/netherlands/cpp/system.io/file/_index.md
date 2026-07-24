---
title: "System::IO::File klasse"
linktitle: "File"
second_title: "Aspose.Page voor C++"
description: "System::IO::File klasse. Biedt methoden voor het manipuleren van bestanden. Dit is een statisch type zonder instantie‑services. Je mag nooit instanties ervan maken, op welke manier dan ook in C++."
type: docs
weight: 1300
url: /nl/cpp/system.io/file/
---
## File class


Biedt methoden voor het manipuleren van bestanden. Dit is een statisch type zonder instantie‑services. Je mag onder geen enkele omstandigheid instanties ervan maken.

```cpp
class File
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [AppendAllLines](./appendalllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | Voegt strings uit de opgegeven collectie strings toe aan het opgegeven bestand met de opgegeven codering door elke string in een nieuwe regel te schrijven. Als het opgegeven bestand niet bestaat, wordt het aangemaakt. Het bestand wordt gesloten na het schrijven van alle strings. |
| static [AppendAllText](./appendalltext/)(const String\&, const String\&, const EncodingPtr\&) | Voegt de opgegeven string toe aan het opgegeven bestand met de opgegeven codering. |
| static [AppendText](./appendtext/)(const String\&) | Maakt een [StreamWriter](../streamwriter/) object dat tekst toevoegt aan het opgegeven bestand met UTF-8-codering. Als het opgegeven bestand niet bestaat, wordt het aangemaakt. |
| static [Copy](./copy/)(const String\&, const String\&, bool) | Kopieert het opgegeven bestand naar de opgegeven locatie. Als het bestemmingsbestand al bestaat, geeft een parameter aan of het moet worden overschreven. |
| static [Create](./create/)(const String\&, int32_t, FileOptions) | Maakt een nieuw bestand (of overschrijft een bestaand bestand) en opent het voor lees‑ en schrijftoegang met de opgegeven buffergrootte en opties. |
| static [CreateText](./createtext/)(const String\&) | Maakt een nieuw bestand of opent een bestaand bestand voor het schrijven van UTF-8‑gecodeerde tekst. |
| static [Decrypt](./decrypt/)(const String\&) | NOG NIET GEÏMPLENTEERD. |
| static [Delete](./delete/)(const String\&) | Verwijdert het opgegeven bestand of de opgegeven map. |
| static [Encrypt](./encrypt/)(const String\&) | NOG NIET GEÏMPLENTEERD. |
| static [Exists](./exists/)(const String\&) | Bepaalt of het opgegeven pad naar een bestaand bestand verwijst. |
| static [GetAttributes](./getattributes/)(const String\&) | Retourneert de attributen van de opgegeven entiteit. |
| static [GetCreationTime](./getcreationtime/)(const String\&) | Retourneert de creatietijd van de opgegeven entiteit als lokale tijd. |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | Retourneert de creatietijd van de opgegeven entiteit als UTC‑tijd. |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | Retourneert de laatste toegangstijd van de opgegeven entiteit als lokale tijd. |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | Retourneert de laatste toegangstijd van de opgegeven entiteit als UTC‑tijd. |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | Retourneert de laatste schrijftijd van de opgegeven entiteit als lokale tijd. |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | Retourneert de laatste schrijftijd van de opgegeven entiteit als UTC‑tijd. |
| static [Move](./move/)(const String\&, const String\&) | Verplaatst het opgegeven bestand naar de nieuwe locatie. |
| static [Open](./open/)(const String\&, FileMode) | Opent het opgegeven bestand in de opgegeven modus voor lezen en schrijven zonder delen. |
| static [Open](./open/)(const String\&, FileMode, FileAccess, FileShare) | Opent het opgegeven bestand in de opgegeven modus, met het opgegeven toegangstype en de deeloptie. |
| static [OpenRead](./openread/)(const String\&) | Opent het opgegeven bestand alleen voor lezen, in de modus 'Open' met gedeelde toegang voor lezen. |
| static [OpenText](./opentext/)(const String\&, const EncodingPtr\&) | Opent het opgegeven bestaande bestand voor het lezen van tekst met UTF-8‑codering zonder delen. |
| static [OpenWrite](./openwrite/)(const String\&) | Opent het opgegeven bestand alleen voor schrijven, in de modus 'OpenOrCreate' zonder delen. |
| static [ReadAllBytes](./readallbytes/)(const String\&) | Leest de inhoud van het opgegeven binaire bestand naar een byte‑array. |
| static [ReadAllLines](./readalllines/)(const String\&, const EncodingPtr\&) | Leest de inhoud van het opgegeven tekstbestand regel voor regel in een array van strings met behulp van de opgegeven tekencodering. |
| static [ReadAllText](./readalltext/)(const String\&, const EncodingPtr\&) | Leest de inhoud van het opgegeven tekstbestand naar een enkel [String](../../system/string/) object met behulp van de opgegeven tekencodering. |
| static [ReadLines](./readlines/)(const String\&, const EncodingPtr\&) | Leest de inhoud van het opgegeven tekstbestand regel voor regel met de opgegeven tekencodering en retourneert een enumerateerbare collectie van strings, waarbij elke string een enkele regel van de bestandsinhoud vertegenwoordigt. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, bool) | Vervangt de inhoud van één bestand door een ander en maakt een back-up van het vervangen bestand. |
| static [SetAttributes](./setattributes/)(const String\&, FileAttributes) | Stelt de opgegeven attributen in op het opgegeven bestand. |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | NOG NIET GEÏMPLENTEERD. |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | NOG NIET GEÏMPLENTEERD. |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | NOG NIET GEÏMPLENTEERD. |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | NOG NIET GEÏMPLENTEERD. |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | Stelt de laatste schrijftijd van de opgegeven entiteit in als lokale tijd. |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | Stelt de laatste schrijftijd van de opgegeven entiteit in als UTC-tijd. |
| static [WriteAllBytes](./writeallbytes/)(const String\&, const ArrayPtr\<uint8_t\>\&) | Overschrijft het opgegeven binaire bestand en schrijft de opgegeven bytes erin. |
| static [WriteAllLines](./writealllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | Maakt een nieuw tekstbestand aan of overschrijft het bestaande en schrijft alle strings uit de opgegeven enumerateerbare collectie van strings erin, elke string op een nieuwe regel, met de opgegeven codering. |
| static [WriteAllLines](./writealllines/)(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) | Maakt een nieuw tekstbestand aan of overschrijft het bestaande en schrijft alle strings uit de opgegeven array van strings erin, elke string op een nieuwe regel, met de opgegeven codering. |
| static [WriteAllText](./writealltext/)(const String\&, const String\&, const EncodingPtr\&) | Maakt een nieuw tekstbestand aan of overschrijft het bestaande en schrijft de inhoud van de opgegeven string erin met de opgegeven codering. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [DefaultBufferSize](./defaultbuffersize/) | Standaardwaarde van het aantal bytes dat gebufferd wordt tijdens het lezen van en schrijven naar een bestand. |
## Zie ook

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
