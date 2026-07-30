---
title: "Classe System::BitConverter"
linktitle: "BitConverter"
second_title: "Aspose.Font per C++"
description: "Classe System::BitConverter. Contiene metodi che eseguono conversioni di sequenze di byte in un tipo valore e viceversa. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo in C++."
type: docs
weight: 500
url: /it/cpp/system/bitconverter/
---
## BitConverter class


Contiene metodi che eseguono conversioni di sequenze di byte in un tipo valore e viceversa. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo.

```cpp
class BitConverter
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [_IsLittleEndian](./_islittleendian/)() | Indica l'endianness dell'architettura corrente. |
| static [DoubleToInt64Bits](./doubletoint64bits/)(double) | Restituisce un valore intero a 64 bit la cui rappresentazione binaria è uguale alla rappresentazione binaria del valore a virgola mobile a doppia precisione specificato. |
| static [GetBytes](./getbytes/)(bool) | Converte il valore booleano specificato in un array di byte. |
| static [GetBytes](./getbytes/)(char_t) | Converte il valore char_t specificato in un array di byte. |
| static [GetBytes](./getbytes/)(int16_t) | Converte il valore intero a 16 bit specificato in un array di byte. |
| static [GetBytes](./getbytes/)(int) | Converte il valore intero a 32 bit specificato in un array di byte. |
| static [GetBytes](./getbytes/)(int64_t) | Converte il valore intero a 64 bit specificato in un array di byte. |
| static [GetBytes](./getbytes/)(uint16_t) | Converte il valore intero senza segno a 16 bit specificato in un array di byte. |
| static [GetBytes](./getbytes/)(uint32_t) | Converte il valore intero senza segno a 32 bit specificato in un array di byte. |
| static [GetBytes](./getbytes/)(uint64_t) | Converte il valore intero senza segno a 64 bit specificato in un array di byte. |
| static [GetBytes](./getbytes/)(float) | Converte il valore a virgola mobile a precisione singola specificato in un array di byte. |
| static [GetBytes](./getbytes/)(double) | Converte il valore a virgola mobile a doppia precisione specificato in un array di byte. |
| static [Int64BitsToDouble](./int64bitstodouble/)(int64_t) | Restituisce un valore a virgola mobile a doppia precisione il cui valore è equivalente a value. |
| static [ToBoolean](./toboolean/)(const System::ArrayPtr\<uint8_t\>\&, int) | Converte un byte dall'array specificato a partire dall'indice specificato in valore booleano. |
| static [ToBoolean](./toboolean/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Converte un byte dall'array specificato a partire dall'indice specificato in valore booleano. |
| static [ToChar](./tochar/)(const System::ArrayPtr\<uint8_t\>\&, int) | Converte due byte dall'array specificato a partire dall'indice specificato in valore char_t. |
| static [ToChar](./tochar/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Converte due byte dall'array specificato a partire dall'indice specificato in valore char_t. |
| static [ToDouble](./todouble/)(const System::ArrayPtr\<uint8_t\>\&, int) | Converte otto byte dall'array specificato a partire dall'indice specificato in valore a virgola mobile a doppia precisione. |
| static [ToDouble](./todouble/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Converte otto byte dall'array specificato a partire dall'indice specificato in valore a virgola mobile a doppia precisione. |
| static [ToInt16](./toint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | Converte due byte dall'array specificato a partire dall'indice specificato in valore intero a 16 bit. |
| static [ToInt16](./toint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Converte due byte dall'array specificato a partire dall'indice specificato in valore intero a 16 bit. |
| static [ToInt32](./toint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | Converte quattro byte dall'array specificato a partire dall'indice specificato in valore intero a 32 bit. |
| static [ToInt32](./toint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Converte quattro byte dall'array specificato a partire dall'indice specificato in valore intero a 32 bit. |
| static [ToInt64](./toint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | Converte otto byte dall'array specificato a partire dall'indice specificato in valore intero a 64 bit. |
| static [ToInt64](./toint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Converte otto byte dall'array specificato a partire dall'indice specificato in valore intero a 64 bit. |
| static [ToSingle](./tosingle/)(const System::ArrayPtr\<uint8_t\>\&, int) | Converte quattro byte dall'array specificato a partire dall'indice specificato in valore a virgola mobile a precisione singola. |
| static [ToSingle](./tosingle/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Converte quattro byte dall'array specificato a partire dall'indice specificato in valore a virgola mobile a precisione singola. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, bool, const String\&) | Converte tutti i valori dell'array di byte specificato nella loro rappresentazione stringa esadecimale. Il caso delle lettere da utilizzare nella notazione esadecimale e il separatore inserito tra ogni coppia di byte adiacenti sono specificati tramite gli argomenti corrispondenti. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int) | Converte i valori dell'array di byte specificato nella loro rappresentazione stringa esadecimale a partire dall'indice specificato. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int, int) | Converte un intervallo di valori dell'array di byte specificato nella loro rappresentazione stringa esadecimale. |
| static [ToUInt16](./touint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | Converte due byte dall'array specificato a partire dall'indice specificato in valore intero senza segno a 16 bit. |
| static [ToUInt16](./touint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Converte due byte dall'array specificato a partire dall'indice specificato in valore intero senza segno a 16 bit. |
| static [ToUInt32](./touint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | Converte quattro byte dall'array specificato a partire dall'indice specificato in valore intero senza segno a 32 bit. |
| static [ToUInt32](./touint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Converte quattro byte dall'array specificato a partire dall'indice specificato in valore intero senza segno a 32 bit. |
| static [ToUInt64](./touint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | Converte otto byte dall'array specificato a partire dall'indice specificato in valore intero senza segno a 64 bit. |
| static [ToUInt64](./touint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Converte otto byte dall'array specificato a partire dall'indice specificato in valore intero senza segno a 64 bit. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [IsLittleEndian](./islittleendian/) | Indica l'endianness dell'architettura corrente. true se l'architettura è little endian, false altrimenti. |
## Osservazioni



```cpp
#include <system/bit_converter.h>
#include <system/smart_ptr.h>

using namespace System;

template <typename T>
void Print(T arg)
{
  std::cout << arg << ' ';

  for (const auto byte: BitConverter::GetBytes(arg))
  {
    std::cout << std::hex << static_cast<int>(byte);
  }

  std::cout << std::endl;
}

int main()
{
  // Crea valori da stampare.
  int anInt = 1234567890;
  double aDouble = 0.123456789;

  // Stampa il valore e i suoi byte.
  Print(anInt);
  Print(aDouble);

  return 0;
}
/*
This code example produces the following output:
1234567890 d229649
0.123457 5f633937dd9abf3f
*/
```

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
