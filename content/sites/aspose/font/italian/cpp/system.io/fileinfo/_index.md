---
title: "System::IO::FileInfo class"
linktitle: "FileInfo"
second_title: "Aspose.Font per C++"
description: "System::IO::FileInfo class. Rappresenta un percorso a un file e il file a cui si riferisce questo percorso e fornisce metodi per manipolarlo. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1400
url: /it/cpp/system.io/fileinfo/
---
## FileInfo class


Rappresenta un percorso a un file e il file a cui si riferisce questo percorso e fornisce metodi per manipolarlo. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class FileInfo : public System::IO::FileSystemInfo
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AppendText](./appendtext/)() | Apre un file rappresentato dall'oggetto corrente per scrivere testo usando la codifica UTF-8, in modalità 'Append' senza condivisione. |
| [CopyTo](./copyto/)(const String\&) | Copia il file rappresentato dall'oggetto corrente nella posizione specificata. Se il file di destinazione esiste già, la copia fallisce. |
| [CopyTo](./copyto/)(const String\&, bool) | Copia il file rappresentato dall'oggetto corrente nella posizione specificata. Un parametro specifica se il file di destinazione esistente deve essere sovrascritto. |
| [Create](./create/)() | Crea un file nella posizione specificata dal percorso rappresentato dall'oggetto corrente e lo apre per lettura e scrittura, in modalità truncate e senza condivisione. |
| [CreateText](./createtext/)() | Crea un file nella posizione specificata dal percorso rappresentato dall'oggetto corrente e lo apre per scrivere testo usando la codifica UTF-8 senza condivisione. |
| [Decrypt](./decrypt/)() | NON IMPLEMENTATO. |
| [Delete](./delete/)() override | Rimuove il file rappresentato dall'oggetto corrente. |
| [Encrypt](./encrypt/)() | NON IMPLEMENTATO. |
| [FileInfo](./fileinfo/)(const String\&) | Crea una nuova istanza della classe [FileInfo](./) che rappresenta il file specificato. |
| [get_Directory](./get_directory/)() | Restituisce un oggetto [DirectoryInfo](../directoryinfo/) che rappresenta la directory in cui si trova il file rappresentato dall'oggetto corrente. |
| [get_DirectoryName](./get_directoryname/)() | Restituisce il nome completo della directory in cui il file rappresentato dall'oggetto corrente è situato. |
| [get_Exists](./get_exists/)() override | Restituisce un valore che indica se il file esiste. |
| [get_IsReadOnly](./get_isreadonly/)() | Restituisce un valore che indica se l'attributo ReadOnly è impostato. |
| [get_Length](./get_length/)() | Restituisce la dimensione del file in byte. |
| [get_Name](./get_name/)() override | Restituisce il nome del file. |
| [MoveTo](./moveto/)(const String\&) | Sposta il file rappresentato dall'oggetto corrente nella posizione specificata. |
| [Open](./open/)(FileMode) | Apre il file rappresentato dall'oggetto corrente nella modalità specificata per lettura e scrittura senza condivisione. |
| [Open](./open/)(FileMode, FileAccess) | Apre il file rappresentato dall'oggetto corrente nella modalità specificata, con il tipo di accesso specificato e senza condivisione. |
| [Open](./open/)(FileMode, FileAccess, FileShare) | Apre il file rappresentato dall'oggetto corrente nella modalità specificata, con il tipo di accesso specificato e l'opzione di condivisione. |
| [OpenRead](./openread/)() | Apre un file rappresentato dall'oggetto corrente solo per lettura, in modalità 'Open' con accesso condiviso per lettura. |
| [OpenText](./opentext/)() | Apre il file esistente nella posizione specificata dal percorso rappresentato dall'oggetto corrente per leggere il testo usando la codifica UTF-8 senza condivisione. |
| [OpenWrite](./openwrite/)() | Apre un file rappresentato dall'oggetto corrente solo per scrittura, in modalità 'OpenOrCreate' senza condivisione. |
| [Replace](./replace/)(const String\&, const String\&) | Sostituisce il contenuto di un file di destinazione specificato con il file rappresentato dall'oggetto corrente [FileInfo](./) e crea una copia di backup del file sostituito. |
| [Replace](./replace/)(const String\&, const String\&, bool) | Sostituisce il contenuto di un file di destinazione specificato con il file rappresentato dall'oggetto corrente [FileInfo](./) e crea una copia di backup del file sostituito. |
| [set_IsReadOnly](./set_isreadonly/)(bool) | Imposta o rimuove l'attributo ReadOnly sul file. |
| [ToString](./tostring/)() const override | Restituisce un percorso rappresentato dall'oggetto corrente. |
## Vedi anche

* Class [FileSystemInfo](../filesysteminfo/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
