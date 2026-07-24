---
title: "System::IO::Stream classe"
linktitle: "Stream"
second_title: "Aspose.Page per C++"
description: "System::IO::Stream classe. Una classe base per una varietà di implementazioni di stream. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2100
url: /it/cpp/system.io/stream/
---
## Stream class


Una classe base per una varietà di implementazioni di stream. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Stream : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | Avvia un'operazione di lettura asincrona. |
| virtual [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | Avvia un'operazione di scrittura asincrona. |
| virtual [Close](./close/)() | Chiude il flusso. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&) | Copia byte nello stream specificato. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&, int32_t) | Copia byte nello stream specificato, usando la dimensione del buffer specificata. |
| [Dispose](./dispose/)() override | Rilascia tutte le risorse utilizzate dall'oggetto corrente e chiude il flusso. |
| virtual [EndRead](./endread/)(System::SharedPtr\<System::IAsyncResult\>) | Attende fino al completamento dell'operazione di lettura asincrona specificata. |
| virtual [EndWrite](./endwrite/)(System::SharedPtr\<System::IAsyncResult\>) | Termina un'operazione di scrittura asincrona. Attende fino al completamento dell'operazione di scrittura asincrona specificata. |
| virtual [Flush](./flush/)() | Svuota i buffer di questo stream e scrive tutti i dati bufferizzati nello storage sottostante. |
| virtual [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) | Cancella in modo asincrono tutti i buffer per questo stream, provoca la scrittura di tutti i dati bufferizzati sul dispositivo sottostante e monitora le richieste di annullamento. |
| [FlushAsync](./flushasync/)() | Cancella in modo asincrono tutti i buffer per questo stream, provoca la scrittura di tutti i dati bufferizzati sul dispositivo sottostante e monitora le richieste di annullamento. |
| virtual [get_CanRead](./get_canread/)() const | Determina se lo stream è leggibile. |
| virtual [get_CanSeek](./get_canseek/)() const | Determina se lo stream supporta il posizionamento. |
| virtual [get_CanTimeout](./get_cantimeout/)() const | Ottiene un valore che determina se lo stream corrente può scadere. |
| virtual [get_CanWrite](./get_canwrite/)() const | Determina se lo stream è scrivibile. |
| virtual [get_Length](./get_length/)() const | Restituisce la lunghezza dello stream in byte. |
| virtual [get_Position](./get_position/)() const | Restituisce la posizione corrente dello stream. |
| virtual [get_ReadTimeout](./get_readtimeout/)() const | Ottiene un valore, in millisecondi, che determina per quanto tempo lo stream tenterà di leggere prima di scadere. |
| virtual [get_WriteTimeout](./get_writetimeout/)() const | Ottiene un valore, in millisecondi, che determina per quanto tempo lo stream tenterà di scrivere prima di scadere. |
| virtual [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Legge il numero specificato di byte dallo stream e li scrive nell'array di byte specificato. |
| virtual [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | Legge il numero specificato di byte dallo stream e li scrive nell'array di byte specificato. |
| [Read](./read/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | Legge il numero specificato di byte dallo stream e li scrive nell'array di byte specificato. |
| virtual [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | Legge in modo asincrono una sequenza di byte dallo stream corrente, avanza la posizione nello stream del numero di byte letti e monitora le richieste di annullamento. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Legge in modo asincrono una sequenza di byte dallo stream corrente, avanza la posizione nello stream del numero di byte letti e monitora le richieste di annullamento. |
| virtual [ReadByte](./readbyte/)() | Legge un singolo byte dallo stream e restituisce un valore intero a 32 bit equivalente al valore del byte letto. |
| virtual [Seek](./seek/)(int64_t, SeekOrigin) | Imposta la posizione dello stream rappresentato dall'oggetto corrente. |
| virtual [set_Position](./set_position/)(int64_t) | Imposta la posizione dello stream. |
| virtual [set_ReadTimeout](./set_readtimeout/)(int) | Imposta un valore che determina se lo stream corrente può scadere. |
| virtual [set_WriteTimeout](./set_writetimeout/)(int) | Imposta un valore, in millisecondi, che determina per quanto tempo lo stream tenterà di leggere prima di scadere. |
| virtual [SetLength](./setlength/)(int64_t) | Imposta la lunghezza dello stream rappresentato dall'oggetto corrente. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Scrive l'intervallo specificato di byte dall'array di byte specificato nello stream. |
| virtual [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | Scrive l'intervallo specificato di byte dall'array di byte specificato nello stream. |
| [Write](./write/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | Scrive l'intervallo specificato di byte dall'array di byte specificato nello stream. |
| virtual [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | Scrive in modo asincrono una sequenza di byte nello stream corrente, avanza la posizione corrente nello stream del numero di byte scritti e monitora le richieste di annullamento. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Scrive in modo asincrono una sequenza di byte nello stream corrente, avanza la posizione corrente nello stream del numero di byte scritti e monitora le richieste di annullamento. |
| virtual [WriteByte](./writebyte/)(uint8_t) | Scrive il valore intero senza segno a 8 bit specificato nello stream. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Null](./null/) | Uno stream senza archiviazione sottostante. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a questa classe. |
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
