---
title: "System::IO::Stream class"
linktitle: "Stream"
second_title: "Aspose.Font per C++"
description: "System::IO::Stream class. Una classe base per una varietà di implementazioni di stream. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2100
url: /it/cpp/system.io/stream/
---
## Stream class


Una classe base per una varietà di implementazioni di stream. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Stream : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | Avvia un'operazione di lettura asincrona. |
| virtual [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | Avvia un'operazione di scrittura asincrona. |
| virtual [Close](./close/)() | Chiude lo stream. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&) | Copia i byte nello stream specificato. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&, int32_t) | Copia i byte nello stream specificato, usando la dimensione del buffer specificata. |
| [Dispose](./dispose/)() override | Rilascia tutte le risorse utilizzate dall'oggetto corrente e chiude lo stream. |
| virtual [EndRead](./endread/)(System::SharedPtr\<System::IAsyncResult\>) | Attende finché l'operazione di lettura asincrona specificata non è completata. |
| virtual [EndWrite](./endwrite/)(System::SharedPtr\<System::IAsyncResult\>) | Termina un'operazione di scrittura asincrona. Attende finché l'operazione di scrittura asincrona specificata non è completata. |
| virtual [Flush](./flush/)() | Svuota i buffer di questo flusso e scrive tutti i dati bufferizzati nello storage sottostante. |
| virtual [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) | Cancella in modo asincrono tutti i buffer per questo stream, fa sì che i dati bufferizzati vengano scritti sul dispositivo sottostante e monitora le richieste di annullamento. |
| [FlushAsync](./flushasync/)() | Cancella in modo asincrono tutti i buffer per questo stream, fa sì che i dati bufferizzati vengano scritti sul dispositivo sottostante e monitora le richieste di annullamento. |
| virtual [get_CanRead](./get_canread/)() const | Determina se il flusso è leggibile. |
| virtual [get_CanSeek](./get_canseek/)() const | Determina se il flusso supporta il posizionamento. |
| virtual [get_CanTimeout](./get_cantimeout/)() const | Ottiene un valore che determina se il flusso corrente può scadere. |
| virtual [get_CanWrite](./get_canwrite/)() const | Determina se il flusso è scrivibile. |
| virtual [get_Length](./get_length/)() const | Restituisce la lunghezza del flusso in byte. |
| virtual [get_Position](./get_position/)() const | Restituisce la posizione corrente del flusso. |
| virtual [get_ReadTimeout](./get_readtimeout/)() const | Ottiene un valore, in millisecondi, che determina per quanto tempo il flusso tenterà di leggere prima di scadere. |
| virtual [get_WriteTimeout](./get_writetimeout/)() const | Ottiene un valore, in millisecondi, che determina per quanto tempo il flusso tenterà di scrivere prima di scadere. |
| virtual [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato. |
| virtual [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato. |
| [Read](./read/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato. |
| virtual [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | Legge in modo asincrono una sequenza di byte dallo stream corrente, avanza la posizione nello stream del numero di byte letti e monitora le richieste di annullamento. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Legge in modo asincrono una sequenza di byte dallo stream corrente, avanza la posizione nello stream del numero di byte letti e monitora le richieste di annullamento. |
| virtual [ReadByte](./readbyte/)() | Legge un singolo byte dallo stream e restituisce un valore intero a 32 bit equivalente al valore del byte letto. |
| virtual [Seek](./seek/)(int64_t, SeekOrigin) | Imposta la posizione del flusso rappresentato dall'oggetto corrente. |
| virtual [set_Position](./set_position/)(int64_t) | Imposta la posizione del flusso. |
| virtual [set_ReadTimeout](./set_readtimeout/)(int) | Imposta un valore che determina se il flusso corrente può scadere. |
| virtual [set_WriteTimeout](./set_writetimeout/)(int) | Imposta un valore, in millisecondi, che determina per quanto tempo il flusso tenterà di leggere prima di scadere. |
| virtual [SetLength](./setlength/)(int64_t) | Imposta la lunghezza del flusso rappresentato dall'oggetto corrente. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Scrive l'intervallo specificato di byte dall'array di byte specificato nel flusso. |
| virtual [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | Scrive l'intervallo specificato di byte dall'array di byte specificato nel flusso. |
| [Write](./write/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | Scrive l'intervallo specificato di byte dall'array di byte specificato nel flusso. |
| virtual [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | Scrive in modo asincrono una sequenza di byte nello stream corrente, avanza la posizione corrente in questo stream del numero di byte scritti e monitora le richieste di annullamento. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Scrive in modo asincrono una sequenza di byte nello stream corrente, avanza la posizione corrente in questo stream del numero di byte scritti e monitora le richieste di annullamento. |
| virtual [WriteByte](./writebyte/)(uint8_t) | Scrive il valore intero senza segno a 8 bit specificato nello stream. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Null](./null/) | Un flusso senza storage sottostante. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a questa classe. |
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
