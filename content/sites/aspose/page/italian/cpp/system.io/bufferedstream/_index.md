---
title: "System::IO::BufferedStream class"
linktitle: "BufferedStream"
second_title: "Aspose.Page per C++"
description: "Classe System::IO::BufferedStream. Aggiunge uno strato di buffering sopra un altro stream. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1000
url: /it/cpp/system.io/bufferedstream/
---
## BufferedStream class


Aggiunge uno strato di buffering sopra un altro stream. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class BufferedStream : public System::IO::Stream
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&) | Costruisce un oggetto [BufferedStream](./) che avvolge lo stream specificato e utilizza un buffer lungo 4096 byte. |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&, int) | Costruisce un oggetto [BufferedStream](./) che avvolge lo stream specificato e utilizza un buffer della dimensione specificata. |
| [Flush](./flush/)() override | Scrive il contenuto del buffer nello stream sottostante. |
| [get_CanRead](./get_canread/)() const override | Determina se lo stream è leggibile. |
| [get_CanSeek](./get_canseek/)() const override | Determina se lo stream supporta il posizionamento. |
| [get_CanWrite](./get_canwrite/)() const override | Determina se lo stream è scrivibile. |
| [get_Length](./get_length/)() const override | Restituisce la lunghezza dello stream. |
| [get_Position](./get_position/)() const override | Restituisce la posizione corrente dello stream. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Legge il numero specificato di byte dallo stream sottostante e li scrive nell'array di byte specificato. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Legge il numero specificato di byte dallo stream sottostante e li scrive nell'array di byte specificato. |
| [ReadByte](./readbyte/)() override | Legge un singolo byte dallo stream sottostante e restituisce un valore intero a 32 bit equivalente al valore del byte letto. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Imposta la posizione dello stream rappresentato dall'oggetto corrente. |
| [set_Position](./set_position/)(int64_t) override | Svuota il buffer nello stream sottostante e quindi imposta la posizione dello stream. |
| [SetLength](./setlength/)(int64_t) override | Imposta la lunghezza dello stream rappresentato dall'oggetto corrente. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Scrive il sottointervallo specificato di byte dall'array di byte specificato nello stream sottostante. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Scrive il sottointervallo specificato di byte dall'array di byte specificato nello stream sottostante. |
| [WriteByte](./writebyte/)(uint8_t) override | Scrive il valore intero senza segno a 8 bit specificato nello stream sottostante. |
| virtual [~BufferedStream](./~bufferedstream/)() | Distruttore. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Null](../stream/null/) | Uno stream senza archiviazione sottostante. |
## Vedi anche

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
