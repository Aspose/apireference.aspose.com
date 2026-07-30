---
title: "classe System::IO::FileStream"
linktitle: "FileStream"
second_title: "Aspose.Font per C++"
description: "classe System::IO::FileStream. Rappresenta un flusso di file che supporta operazioni di lettura e scrittura sincrone e asincrone. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1500
url: /it/cpp/system.io/filestream/
---
## FileStream class


Rappresenta un flusso di file che supporta operazioni di lettura e scrittura sincrone e asincrone. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class FileStream : public System::IO::Stream
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Close](./close/)() override | Chiude l'oggetto [FileStream](./) corrente. |
| [FileStream](./filestream/)(const String\&, FileMode) | Crea una nuova istanza della classe [FileStream](./) e la inizializza con i parametri specificati. |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) | Crea una nuova istanza della classe [FileStream](./) e la inizializza con i parametri specificati. |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) | Crea una nuova istanza della classe [FileStream](./) e la inizializza con i parametri specificati. |
| [FileStream](./filestream/)(const FileStream\&) |  |
| [Flush](./flush/)() override | Svuota i buffer di questo flusso e scrive tutti i dati bufferizzati sul file sottostante. |
| [Flush](./flush/)(bool) | Svuota i buffer di questo flusso e scrive tutti i dati bufferizzati sul file sottostante. Sinonimo del metodo [Flush()](./flush/). |
| [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) override | Cancella in modo asincrono tutti i buffer per questo stream, fa sì che i dati bufferizzati vengano scritti sul dispositivo sottostante e monitora le richieste di annullamento. |
| [get_CanRead](./get_canread/)() const override | Determina se il flusso è leggibile. |
| [get_CanSeek](./get_canseek/)() const override | Determina se il flusso supporta il posizionamento. |
| [get_CanWrite](./get_canwrite/)() const override | Determina se il flusso è scrivibile. |
| [get_Length](./get_length/)() const override | Restituisce la lunghezza del flusso in byte. |
| [get_Name](./get_name/)() const | Restituisce il nome del file incapsulato dall'oggetto [FileStream](./) corrente. |
| [get_Position](./get_position/)() const override | Restituisce la posizione corrente del flusso. |
| [operator=](./operator=/)(const FileStream\&) |  |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | Legge in modo asincrono una sequenza di byte dallo stream corrente, avanza la posizione nello stream del numero di byte letti e monitora le richieste di annullamento. |
| [ReadByte](./readbyte/)() override | Legge un singolo byte dallo stream e restituisce un valore intero a 32 bit equivalente al valore del byte letto. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Imposta la posizione del flusso rappresentato dall'oggetto corrente. |
| [set_Position](./set_position/)(int64_t) override | Esegue il flush del flusso e poi imposta la posizione del flusso. |
| [SetLength](./setlength/)(int64_t) override | Imposta la lunghezza del flusso rappresentato dall'oggetto corrente. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Scrive l'intervallo specificato di byte dall'array di byte specificato nel flusso. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Scrive l'intervallo specificato di byte dall'array di byte specificato nel flusso. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | Scrive in modo asincrono una sequenza di byte nello stream corrente, avanza la posizione corrente in questo stream del numero di byte scritti e monitora le richieste di annullamento. |
| [WriteByte](./writebyte/)(uint8_t) override | Scrive il valore intero senza segno a 8 bit specificato nello stream. |
| [~FileStream](./~filestream/)() | Distruttore. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static constexpr [DefaultBufferSize](./defaultbuffersize/) | Valore predefinito del numero di byte bufferizzati durante le operazioni di lettura e scrittura. |
| static [Null](../stream/null/) | Un flusso senza storage sottostante. |
## Vedi anche

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
