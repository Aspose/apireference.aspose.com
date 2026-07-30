---
title: "System::Security::Cryptography::CryptoStream classe"
linktitle: "CryptoStream"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::CryptoStream classe. Implementazione di stream che avvolge uno stream esistente con una funzione crittografica. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 500
url: /it/cpp/system.security.cryptography/cryptostream/
---
## CryptoStream class


Implementazione di stream che avvolge uno stream esistente con una funzione crittografica. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class CryptoStream : public System::IO::Stream
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Close](./close/)() override | Chiude la connessione. |
| [CryptoStream](./cryptostream/)(const SharedPtr\<System::IO::Stream\>\&, const SharedPtr\<ICryptoTransform\>\&, CryptoStreamMode) | Costruttore. |
| [Flush](./flush/)() override | Svuota il buffer nello stream avvolto. Non fa nulla poiché l'algoritmo di trasformazione può essere ancora in attesa di più dati. |
| [FlushFinalBlock](./flushfinalblock/)() | Scrive i dati ancora presenti nel buffer nello stream. |
| [get_CanRead](./get_canread/)() const override | Verifica se lo stream è leggibile. |
| [get_CanSeek](./get_canseek/)() const override | Verifica se lo stream è ricercabile. |
| [get_CanWrite](./get_canwrite/)() const override | Verifica se lo stream è scrivibile. |
| [get_Length](./get_length/)() const override | Ottiene la lunghezza dello stream. Non supportato. |
| [get_Position](./get_position/)() const override | Ottiene la posizione corrente nello stream. Non supportato. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Legge i dati dallo stream. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Legge i dati dallo stream. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Cerca la posizione nello stream. Non supportato. |
| [set_Position](./set_position/)(int64_t) override | Cerca la posizione nello stream. Non supportato. |
| [SetLength](./setlength/)(int64_t) override | Cerca la dimensione dello stream. Non supportato. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Scrive i dati nello stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Scrive i dati nello stream. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Un flusso senza storage sottostante. |
## Vedi anche

* Class [Stream](../../system.io/stream/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
