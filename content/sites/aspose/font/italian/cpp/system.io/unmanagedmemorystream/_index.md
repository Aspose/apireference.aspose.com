---
title: "Classe System::IO::UnmanagedMemoryStream"
linktitle: "UnmanagedMemoryStream"
second_title: "Aspose.Font per C++"
description: "Classe System::IO::UnmanagedMemoryStream. Fornisce l'accesso alla memoria non gestita. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2800
url: /it/cpp/system.io/unmanagedmemorystream/
---
## UnmanagedMemoryStream class


Fornisce l'accesso alla memoria non gestita. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class UnmanagedMemoryStream : public System::IO::Stream
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Flush](./flush/)() override | Non fa nulla. |
| [get_CanRead](./get_canread/)() const override | Determina se il flusso è leggibile. |
| [get_CanSeek](./get_canseek/)() const override | Determina se il flusso supporta il posizionamento. |
| [get_CanWrite](./get_canwrite/)() const override | Determina se il flusso è scrivibile. |
| virtual [get_Capacity](./get_capacity/)() const | Restituisce la capacità corrente del buffer di memoria sottostante. |
| [get_Length](./get_length/)() const override | Restituisce la lunghezza del flusso in byte. |
| [get_Position](./get_position/)() const override | Restituisce la posizione corrente del flusso. |
| [get_PositionPointer](./get_positionpointer/)() | NON IMPLEMENTATO. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Imposta la posizione del flusso rappresentato dall'oggetto corrente. |
| [set_Position](./set_position/)(int64_t) override | Imposta la posizione del flusso. |
| [set_PositionPointer](./set_positionpointer/)(uint8_t *) | NON IMPLEMENTATO. |
| [SetLength](./setlength/)(int64_t) override | NON IMPLEMENTATO. |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t) | Crea una nuova istanza di [UnmanagedMemoryStream](./). |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t, int64_t, FileAccess) | Crea una nuova istanza di [UnmanagedMemoryStream](./). |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | NON IMPLEMENTATO. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | NON IMPLEMENTATO. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Null](../stream/null/) | Un flusso senza storage sottostante. |
## Vedi anche

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
