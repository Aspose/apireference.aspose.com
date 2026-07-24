---
title: "Classe System::IO::File"
linktitle: "File"
second_title: "Aspose.Page per C++"
description: "Classe System::IO::File. Fornisce metodi per manipolare i file. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo in C++."
type: docs
weight: 1300
url: /it/cpp/system.io/file/
---
## File class


Fornisce metodi per manipolare i file. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo.

```cpp
class File
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [AppendAllLines](./appendalllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | Aggiunge le stringhe dalla collezione di stringhe specificata al file specificato usando la codifica specificata, scrivendo ogni stringa in una nuova riga. Se il file specificato non esiste, viene creato. Il file viene chiuso dopo aver scritto tutte le stringhe. |
| static [AppendAllText](./appendalltext/)(const String\&, const String\&, const EncodingPtr\&) | Aggiunge la stringa specificata al file specificato usando la codifica specificata. |
| static [AppendText](./appendtext/)(const String\&) | Crea un oggetto [StreamWriter](../streamwriter/) che aggiunge testo al file specificato usando la codifica UTF-8. Se il file specificato non esiste, viene creato. |
| static [Copy](./copy/)(const String\&, const String\&, bool) | Copia il file specificato nella posizione specificata. Se il file di destinazione esiste già, un parametro indica se deve essere sovrascritto. |
| static [Create](./create/)(const String\&, int32_t, FileOptions) | Crea un nuovo file (o sovrascrive quello esistente) e lo apre per accesso in lettura e scrittura usando la dimensione del buffer e le opzioni specificate. |
| static [CreateText](./createtext/)(const String\&) | Crea un nuovo file o apre quello esistente per scrivere testo codificato in UTF-8. |
| static [Decrypt](./decrypt/)(const String\&) | NOT IMPLEMENTED. |
| static [Delete](./delete/)(const String\&) | Elimina il file o la directory specificati. |
| static [Encrypt](./encrypt/)(const String\&) | NOT IMPLEMENTED. |
| static [Exists](./exists/)(const String\&) | Determina se il percorso specificato fa riferimento a un file esistente. |
| static [GetAttributes](./getattributes/)(const String\&) | Restituisce gli attributi dell'entità specificata. |
| static [GetCreationTime](./getcreationtime/)(const String\&) | Restituisce l'ora di creazione dell'entità specificata come ora locale. |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | Restituisce l'ora di creazione dell'entità specificata come ora UTC. |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | Restituisce l'ora dell'ultimo accesso dell'entità specificata come ora locale. |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | Restituisce l'ora dell'ultimo accesso dell'entità specificata come ora UTC. |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | Restituisce l'ora dell'ultima scrittura dell'entità specificata come ora locale. |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | Restituisce l'ora dell'ultima scrittura dell'entità specificata come ora UTC. |
| static [Move](./move/)(const String\&, const String\&) | Sposta il file specificato nella nuova posizione. |
| static [Open](./open/)(const String\&, FileMode) | Apre il file specificato nella modalità specificata per lettura e scrittura senza condivisione. |
| static [Open](./open/)(const String\&, FileMode, FileAccess, FileShare) | Apre il file specificato nella modalità specificata, con il tipo di accesso specificato e l'opzione di condivisione. |
| static [OpenRead](./openread/)(const String\&) | Apre il file specificato solo per lettura, in modalità 'Open' con accesso condiviso per lettura. |
| static [OpenText](./opentext/)(const String\&, const EncodingPtr\&) | Apre il file esistente specificato per leggere testo usando la codifica UTF-8 senza condivisione. |
| static [OpenWrite](./openwrite/)(const String\&) | Apre il file specificato solo per scrittura, in modalità 'OpenOrCreate' senza condivisione. |
| static [ReadAllBytes](./readallbytes/)(const String\&) | Legge il contenuto del file binario specificato in un array di byte. |
| static [ReadAllLines](./readalllines/)(const String\&, const EncodingPtr\&) | Legge il contenuto del file di testo specificato riga per riga in un array di stringhe usando la codifica dei caratteri specificata. |
| static [ReadAllText](./readalltext/)(const String\&, const EncodingPtr\&) | Legge il contenuto del file di testo specificato in un unico oggetto [String](../../system/string/) usando la codifica dei caratteri specificata. |
| static [ReadLines](./readlines/)(const String\&, const EncodingPtr\&) | Legge il contenuto del file di testo specificato riga per riga usando la codifica dei caratteri specificata e restituisce una collezione enumerabile di stringhe, ognuna delle quali rappresenta una singola riga del contenuto del file. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, bool) | Sostituisce il contenuto di un file con quello di un altro e crea un backup del file sostituito. |
| static [SetAttributes](./setattributes/)(const String\&, FileAttributes) | Imposta gli attributi specificati sul file specificato. |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | NOT IMPLEMENTED. |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | NOT IMPLEMENTED. |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | NOT IMPLEMENTED. |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | NOT IMPLEMENTED. |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | Imposta l'ora dell'ultima scrittura dell'entità specificata come ora locale. |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | Imposta l'ora dell'ultima scrittura dell'entità specificata come ora UTC. |
| static [WriteAllBytes](./writeallbytes/)(const String\&, const ArrayPtr\<uint8_t\>\&) | Sovrascrive il file binario specificato e scrive i byte specificati al suo interno. |
| static [WriteAllLines](./writealllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | Crea un nuovo file di testo o sovrascrive quello esistente e scrive tutte le stringhe dalla collezione enumerabile di stringhe specificata al suo interno, ogni stringa su una nuova riga, usando la codifica specificata. |
| static [WriteAllLines](./writealllines/)(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) | Crea un nuovo file di testo o sovrascrive quello esistente e scrive tutte le stringhe dall'array di stringhe specificato al suo interno, ogni stringa su una nuova riga, usando la codifica specificata. |
| static [WriteAllText](./writealltext/)(const String\&, const String\&, const EncodingPtr\&) | Crea un nuovo file di testo o sovrascrive quello esistente e scrive il contenuto della stringa specificata al suo interno usando la codifica specificata. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [DefaultBufferSize](./defaultbuffersize/) | Valore predefinito del numero di byte bufferizzati durante la lettura da e la scrittura su un file. |
## Vedi anche

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
