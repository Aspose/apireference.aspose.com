---
title: "Classe System::IO::Path"
linktitle: "Percorso"
second_title: "Aspose.Font per C++"
description: "Classe System::IO::Path. Fornisce metodi per manipolare i percorsi. È un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di essa in alcun modo in C++."
type: docs
weight: 1900
url: /it/cpp/system.io/path/
---
## Path class


Fornisce metodi per manipolare i percorsi. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo.

```cpp
class Path
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [ChangeExtension](./changeextension/)(const String\&, const String\&) | Modifica l'estensione nel percorso file specificato. |
| static [CheckPath](./checkpath/)(const String\&, const String\&, bool) | Determina se il percorso specificato è valido controllando se contiene caratteri non validi. Viene sollevata un'eccezione se il percorso contiene caratteri non validi. |
| static [Combine](./combine/)(const ArrayPtr\<String\>\&) | Combina i segmenti di percorso specificati in un unico percorso inserendo i caratteri separatori di directory tra i segmenti, se necessario. |
| static [Combine](./combine/)(const String\&, const String\&) | Combina due segmenti di percorso specificati in un unico percorso inserendo il carattere separatore di directory tra i segmenti, se necessario. |
| static [Combine](./combine/)(const String\&, const String\&, const String\&) | Combina tre segmenti di percorso specificati in un unico percorso inserendo i caratteri separatori di directory tra i segmenti, se necessario. |
| static [Combine](./combine/)(const String\&, const String\&, const String\&, const String\&) | Combina quattro segmenti di percorso specificati in un unico percorso inserendo i caratteri separatori di directory tra i segmenti, se necessario. |
| static [GetDirectoryName](./getdirectoryname/)(const String\&) | Restituisce il nome della directory a cui fa riferimento il percorso specificato. |
| static [GetExtension](./getextension/)(const String\&) | Restituisce l'estensione del file a cui fa riferimento il percorso specificato. |
| static [GetFileName](./getfilename/)(const String\&) | Restituisce il nome del file a cui fa riferimento il percorso specificato. |
| static [GetFileNameWithoutExtension](./getfilenamewithoutextension/)(const String\&) | Restituisce il nome senza estensione del file a cui fa riferimento il percorso specificato. |
| static [GetFullPath](./getfullpath/)(const String\&) | Converte il percorso specificato in un percorso assoluto. |
| static [GetInvalidFileNameChars](./getinvalidfilenamechars/)() | Restituisce un array contenente i caratteri non consentiti nei nomi dei file. |
| static [GetInvalidPathChars](./getinvalidpathchars/)() | Restituisce un array contenente i caratteri non consentiti nei nomi dei percorsi. |
| static [GetPathRoot](./getpathroot/)(const String\&) | Restituisce la directory radice del percorso specificato. |
| static [GetRandomFileName](./getrandomfilename/)() | Restituisce un nome file generato casualmente. |
| static [GetTempFileName_](./gettempfilename_/)() | Crea un nuovo file con un nome univoco e restituisce un percorso completo verso di esso. |
| static [GetTempFileNameSafe](./gettempfilenamesafe/)() | Crea un nuovo file con un nome univoco e restituisce un percorso completo verso di esso. È un sinonimo del metodo [GetTempFileName_()](./gettempfilename_/). |
| static [GetTempPath](./gettemppath/)() | Restituisce il percorso della directory temporanea dell'utente corrente. |
| static [HasExtension](./hasextension/)(const String\&) | Determina se il percorso specificato fa riferimento a un file con estensione. |
| static [IsPathRooted](./ispathrooted/)(const String\&) | Determina se il percorso specificato contiene una radice. |
| static [NormalizePath](./normalizepath/)(const String\&) | Normalizza il percorso specificato. |
| static [ToBoost](./toboost/)(const String\&) | Restituisce un'istanza della classe boost::filesystem::path che rappresenta il percorso specificato. |
| static [ToString](./tostring/)(const boost::filesystem::path\&) | Restituisce una rappresentazione stringa dell'oggetto path di Boost specificato. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [AltDirectorySeparatorChar](./altdirectoryseparatorchar/) | Un carattere alternativo usato per separare i livelli di directory in un percorso. |
| static [DirectorySeparatorChar](./directoryseparatorchar/) | Un carattere usato per separare i livelli di directory in un percorso. |
| static [PathSeparator](./pathseparator/) | Un carattere separatore usato per separare le stringhe di percorso nelle variabili d'ambiente. |
| static [VolumeSeparatorChar](./volumeseparatorchar/) | Un carattere separatore di volume. |
## Osservazioni



```cpp
#include "system/io/path.h"
#include <iostream>

int main()
{
  using namespace System::IO;

  // Genera un nome file casuale.
  auto filename = Path::GetRandomFileName();

  // Stampa informazioni sul nome del file.
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

## Vedi anche

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
