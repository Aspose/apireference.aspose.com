---
title: "System::IO::FileStream classe"
linktitle: "FileStream"
second_title: "Aspose.Page per C++"
description: "System::IO::FileStream classe. Rappresenta un flusso di file che supporta operazioni di lettura e scrittura sincrone e asincrone. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1500
url: /it/cpp/system.io/filestream/
---
## FileStream class


Rappresenta un flusso di file che supporta operazioni di lettura e scrittura sincrone e asincrone. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class FileStream : public System::IO::Stream
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Close](./close/)() override | Chiude l'oggetto [FileStream](./) corrente. |
| [FileStream](./filestream/)(const String\&, FileMode) | Costruisce una nuova istanza di [FileStream](./) classe e la inizializza con i parametri specificati. |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) | Costruisce una nuova istanza di [FileStream](./) classe e la inizializza con i parametri specificati. |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) | Costruisce una nuova istanza di [FileStream](./) classe e la inizializza con i parametri specificati. |
| [FileStream](./filestream/)(const FileStream\&) |  |
| [Flush](./flush/)() override | Svuota i buffer di questo flusso e scrive tutti i dati bufferizzati nel file sottostante. |
| [Flush](./flush/)(bool) | Svuota i buffer di questo flusso e scrive tutti i dati bufferizzati nel file sottostante. Sinonimo del metodo [Flush()](./flush/). |
| [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) override | Cancella in modo asincrono tutti i buffer per questo stream, provoca la scrittura di tutti i dati bufferizzati sul dispositivo sottostante e monitora le richieste di annullamento. |
| [get_CanRead](./get_canread/)() const override | Determina se lo stream è leggibile. |
| [get_CanSeek](./get_canseek/)() const override | Determina se lo stream supporta il posizionamento. |
| [get_CanWrite](./get_canwrite/)() const override | Determina se lo stream è scrivibile. |
| [get_Length](./get_length/)() const override | Restituisce la lunghezza dello stream in byte. |
| [get_Name](./get_name/)() const | Restituisce il nome del file incapsulato dall'oggetto [FileStream](./) corrente. |
| [get_Position](./get_position/)() const override | Restituisce la posizione corrente dello stream. |
| [operator=](./operator=/)(const FileStream\&) |  |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Legge il numero specificato di byte dallo stream e li scrive nell'array di byte specificato. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Legge il numero specificato di byte dallo stream e li scrive nell'array di byte specificato. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | Legge in modo asincrono una sequenza di byte dallo stream corrente, avanza la posizione nello stream del numero di byte letti e monitora le richieste di annullamento. |
| [ReadByte](./readbyte/)() override | Legge un singolo byte dallo stream e restituisce un valore intero a 32 bit equivalente al valore del byte letto. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Imposta la posizione dello stream rappresentato dall'oggetto corrente. |
| [set_Position](./set_position/)(int64_t) override | Esegue il flush del flusso e poi imposta la posizione del flusso. |
| [SetLength](./setlength/)(int64_t) override | Imposta la lunghezza dello stream rappresentato dall'oggetto corrente. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Scrive l'intervallo specificato di byte dall'array di byte specificato nello stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Scrive l'intervallo specificato di byte dall'array di byte specificato nello stream. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | Scrive in modo asincrono una sequenza di byte nello stream corrente, avanza la posizione corrente nello stream del numero di byte scritti e monitora le richieste di annullamento. |
| [WriteByte](./writebyte/)(uint8_t) override | Scrive il valore intero senza segno a 8 bit specificato nello stream. |
| [~FileStream](./~filestream/)() | Distruttore. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static constexpr [DefaultBufferSize](./defaultbuffersize/) | Valore predefinito del numero di byte bufferizzati durante le operazioni di lettura e scrittura. |
| static [Null](../stream/null/) | Uno stream senza archiviazione sottostante. |
## Vedi anche

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
