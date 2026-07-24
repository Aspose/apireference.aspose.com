---
title: "System::IO::BasicSTDIStreamWrapper classe"
linktitle: "BasicSTDIStreamWrapper"
second_title: "Aspose.Page per C++"
description: "System::IO::BasicSTDIStreamWrapper classe. Rappresenta un wrapper simile a System.IO.Stream per std::basic_istream e i suoi oggetti derivati. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 200
url: /it/cpp/system.io/basicstdistreamwrapper/
---
## BasicSTDIStreamWrapper class


Rappresenta un wrapper simile a [System.IO.Stream](../stream/) per std::basic_istream e i suoi oggetti derivati. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
template<typename T,typename>class BasicSTDIStreamWrapper : public virtual System::IO::STDIOStreamWrapperBase<T>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/)(std::basic_istream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) | Costruisce una nuova istanza di [BasicSTDIStreamWrapper](./). |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/)(const BasicSTDIStreamWrapper\&) | Costruttore di copia. Eliminato. |
| [Flush](./flush/)() override | Svuota i buffer di questo stream e scrive tutti i dati bufferizzati nello storage sottostante. Non supportato! |
| [operator=](./operator=/)(const BasicSTDIStreamWrapper\&) | Operatore di assegnazione di copia. Eliminato. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Se la modalità di wrapping è binaria, legge il numero specificato di byte dallo stream, altrimenti legge il numero specificato di caratteri e li converte al tipo uint8_t. Scrive il risultato della lettura nell'array di byte specificato. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Legge il numero specificato di byte dallo stream e li scrive nell'array di byte specificato. |
| [ReadByte](./readbyte/)() override | Se la modalità di wrapping è binaria, legge un singolo byte dall'ultimo buffer di caratteri decodificati, altrimenti legge un singolo carattere dallo stream e lo converte al tipo uint8_t. |
| [SetLength](./setlength/)(int64_t) override | Imposta la lunghezza dello stream rappresentato dall'oggetto corrente. Non supportato! |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Se la modalità di wrapping è binaria, scrive nello stream il sottointervallo specificato di byte dall'array di byte specificato, altrimenti converte il sottointervallo specificato di byte dall'array di byte specificato al tipo [char_type](./char_type/) e quindi scrive il risultato nello stream. Non supportato! |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Scrive l'intervallo specificato di byte dall'array di byte specificato nello stream. |
| [WriteByte](./writebyte/)(uint8_t) override | Se la modalità di wrapping è binaria, scrive nello stream il valore intero senza segno a 8 bit specificato, altrimenti lo converte al tipo [char_type](./char_type/) e quindi scrive il risultato nello stream. Non supportato! |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Null](../stream/null/) | Uno stream senza archiviazione sottostante. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | Informazioni RTTI. |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## Vedi anche

* Class [STDIOStreamWrapperBase](../stdiostreamwrapperbase/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
