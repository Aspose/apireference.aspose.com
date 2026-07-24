---
title: "Classe System::Security::Cryptography::CryptoStream"
linktitle: "CryptoStream"
second_title: "Aspose.Page per C++"
description: "Classe System::Security::Cryptography::CryptoStream. Implementazione di stream che avvolge uno stream esistente con una funzione crittografica. Gli oggetti di questa classe devono essere allocati solo tramite la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 500
url: /it/cpp/system.security.cryptography/cryptostream/
---
## CryptoStream class


Implementazione di stream che avvolge uno stream esistente con una funzione crittografica. Gli oggetti di questa classe devono essere allocati solo tramite la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class CryptoStream : public System::IO::Stream
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Close](./close/)() override | Chiude la connessione. |
| [CryptoStream](./cryptostream/)(const SharedPtr\<System::IO::Stream\>\&, const SharedPtr\<ICryptoTransform\>\&, CryptoStreamMode) | Costruttore. |
| [Flush](./flush/)() override | Svuota il buffer nello stream avvolto. Non fa nulla poiché l'algoritmo di trasformazione può ancora attendere più dati. |
| [FlushFinalBlock](./flushfinalblock/)() | Scrive i dati ancora presenti nel buffer nello stream. |
| [get_CanRead](./get_canread/)() const override | Verifica se lo stream è leggibile. |
| [get_CanSeek](./get_canseek/)() const override | Verifica se lo stream è ricercabile. |
| [get_CanWrite](./get_canwrite/)() const override | Verifica se lo stream è scrivibile. |
| [get_Length](./get_length/)() const override | Ottiene la lunghezza dello stream. Non supportato. |
| [get_Position](./get_position/)() const override | Ottiene la posizione corrente nello stream. Non supportato. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Legge dati dallo stream. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Legge dati dallo stream. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Cerca la posizione nello stream. Non supportato. |
| [set_Position](./set_position/)(int64_t) override | Cerca la posizione nello stream. Non supportato. |
| [SetLength](./setlength/)(int64_t) override | Cerca la dimensione dello stream. Non supportato. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Scrive dati nello stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Scrive dati nello stream. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Uno stream senza archiviazione sottostante. |
## Vedi anche

* Class [Stream](../../system.io/stream/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
