---
title: "classe System::IO::STDIOStreamWrapperBase"
linktitle: "STDIOStreamWrapperBase"
second_title: "Aspose.Font per C++"
description: "classe System::IO::STDIOStreamWrapperBase. Rappresenta una classe base per wrapper simili a System.IO.Stream. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2000
url: /it/cpp/system.io/stdiostreamwrapperbase/
---
## STDIOStreamWrapperBase class


Rappresenta una classe base per wrapper simili a [System.IO.Stream](../stream/). Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
template<typename T,typename>class STDIOStreamWrapperBase : public System::IO::Stream
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_CanRead](./get_canread/)() const override | Determina se il flusso supporta la lettura. |
| [get_CanSeek](./get_canseek/)() const override | Determina se il flusso supporta il posizionamento. |
| [get_CanWrite](./get_canwrite/)() const override | Determina se il flusso supporta la scrittura. |
| [get_Length](./get_length/)() const override | Restituisce la lunghezza del flusso. |
| [get_Position](./get_position/)() const override | Restituisce la posizione corrente del flusso. |
| [operator=](./operator=/)(const STDIOStreamWrapperBase\&) | Operatore di assegnazione di copia. Eliminato. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Imposta la posizione del flusso rappresentato dall'oggetto corrente. |
| [set_Position](./set_position/)(int64_t) override | Imposta la posizione del flusso. |
| [STDIOStreamWrapperBase](./stdiostreamwrapperbase/)(const STDIOStreamWrapperBase\&) | Costruttore di copia. Eliminato. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Null](../stream/null/) | Un flusso senza storage sottostante. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | Informazioni RTTI. |
| [int_type](./int_type/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## Vedi anche

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
