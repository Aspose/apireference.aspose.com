---
title: "System::IO::MemoryStream class"
linktitle: "MemoryStream"
second_title: "Aspose.Font per C++"
description: "System::IO::MemoryStream class. Rappresenta uno stream che legge e scrive in memoria. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1800
url: /it/cpp/system.io/memorystream/
---
## MemoryStream class


Rappresenta uno stream che legge e scrive in memoria. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class MemoryStream : public System::IO::Stream
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Close](./close/)() override | Chiude lo stream. |
| [Flush](./flush/)() override | Non fa nulla. |
| [get_CanRead](./get_canread/)() const override | Determina se il flusso è leggibile. |
| [get_CanSeek](./get_canseek/)() const override | Determina se il flusso supporta il posizionamento. |
| [get_CanWrite](./get_canwrite/)() const override | Determina se il flusso è scrivibile. |
| [get_Capacity](./get_capacity/)() | Restituisce la capacità corrente del buffer di memoria sottostante. |
| [get_Length](./get_length/)() const override | Restituisce la lunghezza del flusso in byte. |
| [get_Position](./get_position/)() const override | Restituisce la posizione corrente del flusso. |
| virtual [GetBuffer](./getbuffer/)() | Restituisce un puntatore al buffer sottostante. |
| [MemoryStream](./memorystream/)() | Crea una nuova istanza della classe [MemoryStream](./) con capacità iniziale pari a 0. |
| [MemoryStream](./memorystream/)(int) | Crea una nuova istanza della classe [MemoryStream](./) che rappresenta uno stream basato su un buffer di memoria della dimensione specificata. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, bool) | Crea una nuova istanza della classe [MemoryStream](./) che rappresenta uno stream di memoria collegato al buffer di memoria specificato. Un parametro indica se lo stream è scrivibile. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) | Crea una nuova istanza della classe [MemoryStream](./) che rappresenta un flusso di memoria collegato a un segmento del buffer di memoria specificato, a partire dall'indice specificato e includendo il numero specificato di elementi. Parameters specifica se il flusso è scrivibile e se il metodo GetBytes() può essere chiamato. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato. |
| [ReadByte](./readbyte/)() override | Legge un singolo byte dallo stream e restituisce un valore intero a 32 bit equivalente al valore del byte letto. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Imposta la posizione del flusso rappresentato dall'oggetto corrente. |
| [set_Capacity](./set_capacity/)(int) | Imposta la capacità del buffer di memoria sottostante. |
| [set_Position](./set_position/)(int64_t) override | Imposta la posizione del flusso. |
| [SetLength](./setlength/)(int64_t) override | Imposta la lunghezza del flusso rappresentato dall'oggetto corrente. |
| virtual [ToArray](./toarray/)() | Restituisce una copia del buffer di memoria sottostante come array di byte. |
| [TryGetBuffer](./trygetbuffer/)(ArraySegment\<uint8_t\>\&) | Restituisce l'array di byte senza segno da cui è stato creato questo flusso. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Scrive l'intervallo specificato di byte dall'array di byte specificato nel flusso. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Scrive l'intervallo specificato di byte dall'array di byte specificato nel flusso. |
| [WriteByte](./writebyte/)(uint8_t) override | Scrive il valore intero senza segno a 8 bit specificato nello stream. |
| virtual [WriteTo](./writeto/)(SharedPtr\<Stream\>) | Scrive il contenuto del buffer sottostante nello stream specificato. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Null](../stream/null/) | Un flusso senza storage sottostante. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a se stesso. |
## Vedi anche

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
