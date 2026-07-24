---
title: "System::Net::Sockets::NetworkStream classe"
linktitle: "NetworkStream"
second_title: "Aspose.Page per C++"
description: "System::Net::Sockets::NetworkStream classe. Fornisce lo stream sottostante dei dati per l'accesso di rete. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.net.sockets/networkstream/
---
## NetworkStream class


Fornisce lo stream sottostante dei dati per l'accesso di rete. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class NetworkStream : public System::IO::Stream
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Avvia un'operazione di lettura asincrona. |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Avvia un'operazione di scrittura asincrona. |
| [Close](./close/)(int) | Chiude l'istanza corrente dopo che il tempo specificato è scaduto. |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | Attende fino al completamento dell'operazione di lettura asincrona specificata. |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | Termina un'operazione di scrittura asincrona. Attende fino al completamento dell'operazione di scrittura asincrona specificata. |
| [Flush](./flush/)() override | Svuota i buffer di questo stream e scrive tutti i dati bufferizzati nello storage sottostante. |
| [get_CanRead](./get_canread/)() const override | Informazioni RTTI. |
| [get_CanSeek](./get_canseek/)() const override | Determina se lo stream supporta il posizionamento. |
| [get_CanTimeout](./get_cantimeout/)() const override | Ottiene un valore che determina se lo stream corrente può scadere. |
| [get_CanWrite](./get_canwrite/)() const override | Determina se lo stream è scrivibile. |
| [get_DataAvailable](./get_dataavailable/)() const | Restituisce un valore che indica se ci sono dati disponibili da leggere. |
| [get_Length](./get_length/)() const override | Restituisce la lunghezza dello stream in byte. |
| [get_Position](./get_position/)() const override | Restituisce la posizione corrente dello stream. |
| [get_ReadTimeout](./get_readtimeout/)() const override | Ottiene un valore, in millisecondi, che determina per quanto tempo lo stream tenterà di leggere prima di scadere. |
| [get_Socket](./get_socket/)() | Ottiene il [Socket](../socket/) sottostante. |
| [get_WriteTimeout](./get_writetimeout/)() const override | Ottiene un valore, in millisecondi, che determina per quanto tempo lo stream tenterà di scrivere prima di scadere. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>) | Crea una nuova istanza. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>, System::IO::FileAccess, bool) | Crea una nuova istanza. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>, bool) | Crea una nuova istanza. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Legge il numero specificato di byte dallo stream e li scrive nell'array di byte specificato. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Legge il numero specificato di byte dallo stream e li scrive nell'array di byte specificato. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Imposta la posizione dello stream rappresentato dall'oggetto corrente. |
| [set_Position](./set_position/)(int64_t) override | Imposta la posizione dello stream. |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | Imposta un valore che determina se lo stream corrente può scadere. |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | Imposta un valore, in millisecondi, che determina per quanto tempo lo stream tenterà di leggere prima di scadere. |
| [SetLength](./setlength/)(int64_t) override | Imposta la lunghezza dello stream rappresentato dall'oggetto corrente. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Scrive l'intervallo specificato di byte dall'array di byte specificato nello stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Scrive l'intervallo specificato di byte dall'array di byte specificato nello stream. |
| virtual [~NetworkStream](./~networkstream/)() | Distrugge l'istanza corrente. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Uno stream senza archiviazione sottostante. |
## Vedi anche

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
