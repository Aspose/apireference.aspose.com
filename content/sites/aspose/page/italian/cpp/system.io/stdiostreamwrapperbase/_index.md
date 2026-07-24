---
title: "System::IO::STDIOStreamWrapperBase classe"
linktitle: "STDIOStreamWrapperBase"
second_title: "Aspose.Page per C++"
description: "Classe System::IO::STDIOStreamWrapperBase. Rappresenta una classe base per wrapper simili a System.IO.Stream. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2000
url: /it/cpp/system.io/stdiostreamwrapperbase/
---
## STDIOStreamWrapperBase class


Rappresenta una classe base per wrapper simili a [System.IO.Stream](../stream/). Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
template<typename T,typename>class STDIOStreamWrapperBase : public System::IO::Stream
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_CanRead](./get_canread/)() const override | Determina se lo stream supporta la lettura. |
| [get_CanSeek](./get_canseek/)() const override | Determina se lo stream supporta il posizionamento. |
| [get_CanWrite](./get_canwrite/)() const override | Determina se lo stream supporta la scrittura. |
| [get_Length](./get_length/)() const override | Restituisce la lunghezza dello stream. |
| [get_Position](./get_position/)() const override | Restituisce la posizione corrente dello stream. |
| [operator=](./operator=/)(const STDIOStreamWrapperBase\&) | Operatore di assegnazione di copia. Eliminato. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Imposta la posizione dello stream rappresentato dall'oggetto corrente. |
| [set_Position](./set_position/)(int64_t) override | Imposta la posizione dello stream. |
| [STDIOStreamWrapperBase](./stdiostreamwrapperbase/)(const STDIOStreamWrapperBase\&) | Costruttore di copia. Eliminato. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Null](../stream/null/) | Uno stream senza archiviazione sottostante. |
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
* Library [Aspose.Page for C++](../../)
