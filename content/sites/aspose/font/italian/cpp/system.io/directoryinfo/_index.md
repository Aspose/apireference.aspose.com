---
title: "Classe System::IO::DirectoryInfo"
linktitle: "DirectoryInfo"
second_title: "Aspose.Font per C++"
description: "Classe System::IO::DirectoryInfo. Rappresenta un percorso del file system, una directory a cui si riferisce questo percorso e fornisce metodi di istanza per manipolare le directory. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1200
url: /it/cpp/system.io/directoryinfo/
---
## DirectoryInfo class


Rappresenta un percorso del file system, una directory a cui si riferisce questo percorso e fornisce metodi di istanza per manipolare le directory. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class DirectoryInfo : public System::IO::FileSystemInfo
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Create](./create/)() | Crea una directory nel percorso rappresentato dall'oggetto corrente. |
| [CreateSubdirectory](./createsubdirectory/)(const String\&) | Crea sottodirectory nel percorso specificato. |
| [Delete](./delete/)() override | Rimuove la directory a cui si riferisce il percorso rappresentato dall'oggetto corrente se la directory è vuota. |
| [Delete](./delete/)(bool) | Rimuove la directory a cui si riferisce il percorso rappresentato dall'oggetto corrente. Un parametro specifica se il contenuto della directory deve essere rimosso ricorsivamente se la directory non è vuota. |
| [DirectoryInfo](./directoryinfo/)(const String\&) | Costruisce un'istanza della classe [DirectoryInfo](./) nel percorso specificato. |
| [EnumerateDirectories](./enumeratedirectories/)() | Restituisce una collezione enumerabile contenente tutte le directory situate nella directory rappresentata dall'oggetto corrente. |
| [EnumerateDirectories](./enumeratedirectories/)(const String\&) | Cerca le directory che soddisfano i criteri di ricerca specificati nella directory rappresentata dall'oggetto corrente. |
| [EnumerateDirectories](./enumeratedirectories/)(const String\&, SearchOption) | Cerca le directory che soddisfano i criteri di ricerca specificati sia nella directory rappresentata dall'oggetto corrente sia nell'intero albero delle directory radicato nella directory rappresentata dall'oggetto corrente. |
| [EnumerateFiles](./enumeratefiles/)() | Restituisce una collezione enumerabile contenente tutti i file situati nella directory rappresentata dall'oggetto corrente. |
| [EnumerateFiles](./enumeratefiles/)(const String\&) | Cerca i file che soddisfano i criteri di ricerca specificati nella directory rappresentata dall'oggetto corrente. |
| [EnumerateFiles](./enumeratefiles/)(const String\&, SearchOption) | Cerca i file che soddisfano i criteri di ricerca specificati sia nella directory rappresentata dall'oggetto corrente sia nell'intero albero delle directory radicato nella directory rappresentata dall'oggetto corrente. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)() | Restituisce una collezione enumerabile contenente tutti i file e le directory situati nella directory rappresentata dall'oggetto corrente. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)(const String\&) | Cerca i file e le directory che soddisfano i criteri di ricerca specificati nella directory rappresentata dall'oggetto corrente. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)(const String\&, SearchOption) | Cerca i file e le directory che soddisfano i criteri di ricerca specificati sia nella directory rappresentata dall'oggetto corrente sia nell'intero albero di directory radicato nella directory rappresentata dall'oggetto corrente. |
| [get_Exists](./get_exists/)() override | Determina se il percorso rappresentato dall'oggetto corrente si riferisce a una directory esistente. |
| [get_Name](./get_name/)() override | Restituisce il nome dell'entità a cui si riferisce il percorso rappresentato dall'oggetto corrente. |
| [get_Parent](./get_parent/)() | Restituisce un puntatore condiviso a un oggetto [DirectoryInfo](./) che rappresenta un percorso che fa riferimento alla directory padre della directory rappresentata dall'oggetto corrente. |
| [get_Root](./get_root/)() | Restituisce un puntatore condiviso a un oggetto [DirectoryInfo](./) che rappresenta un percorso che fa riferimento alla directory radice della directory rappresentata dall'oggetto corrente. |
| [GetDirectories](./getdirectories/)() | Restituisce un array contenente puntatori condivisi a oggetti [DirectoryInfo](./) che rappresentano tutte le directory situate nella directory rappresentata dall'oggetto corrente. |
| [GetDirectories](./getdirectories/)(const String\&) | Cerca le directory che soddisfano i criteri di ricerca specificati nella directory rappresentata dall'oggetto corrente. |
| [GetDirectories](./getdirectories/)(const String\&, SearchOption) | Cerca le directory che soddisfano i criteri di ricerca specificati sia nella directory rappresentata dall'oggetto corrente sia nell'intero albero delle directory radicato nella directory rappresentata dall'oggetto corrente. |
| [GetFiles](./getfiles/)() | Restituisce un array contenente puntatori condivisi a oggetti [FileInfo](../fileinfo/) che rappresentano tutte le directory situate nella directory rappresentata dall'oggetto corrente. |
| [GetFiles](./getfiles/)(const String\&) | Cerca i file che soddisfano i criteri di ricerca specificati nella directory rappresentata dall'oggetto corrente. |
| [GetFiles](./getfiles/)(const String\&, SearchOption) | Cerca i file che soddisfano i criteri di ricerca specificati sia nella directory rappresentata dall'oggetto corrente sia nell'intero albero delle directory radicato nella directory rappresentata dall'oggetto corrente. |
| [GetFileSystemInfos](./getfilesysteminfos/)() | Restituisce un array contenente puntatori condivisi a oggetti [FileSystemInfo](../filesysteminfo/) che rappresentano tutti i file e le directory situati nella directory rappresentata dall'oggetto corrente. |
| [GetFileSystemInfos](./getfilesysteminfos/)(const String\&) | Cerca i file e le directory che soddisfano i criteri di ricerca specificati nella directory rappresentata dall'oggetto corrente. |
| [GetFileSystemInfos](./getfilesysteminfos/)(const String\&, SearchOption) | Cerca i file e le directory che soddisfano i criteri di ricerca specificati sia nella directory rappresentata dall'oggetto corrente sia nell'intero albero di directory radicato nella directory rappresentata dall'oggetto corrente. |
| [MoveTo](./moveto/)(const String\&) | Sposta la directory rappresentata dall'oggetto corrente e tutto il suo contenuto nella posizione specificata. |
| [ToString](./tostring/)() const override | Restituisce una stringa contenente il percorso rappresentato dall'oggetto corrente. |
## Vedi anche

* Class [FileSystemInfo](../filesysteminfo/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
