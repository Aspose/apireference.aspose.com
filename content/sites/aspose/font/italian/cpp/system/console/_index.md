---
title: "System::Console classe"
linktitle: "Console"
second_title: "Aspose.Font per C++"
description: "System::Console classe. Fornisce metodi per l'emissione di dati sullo stream di output standard. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo in C++."
type: docs
weight: 1400
url: /it/cpp/system/console/
---
## Console class


Fornisce metodi per l'output di dati sullo stream di output standard. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo.

```cpp
class Console
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [Beep](./beep/)() | NON IMPLEMENTATO. |
| static [get_Error](./get_error/)() | Restituisce un puntatore condiviso che punta all'oggetto che rappresenta lo stream di errore standard. |
| static [get_In](./get_in/)() | Restituisce un puntatore condiviso che punta all'oggetto che rappresenta lo stream di input standard. |
| static [get_Out](./get_out/)() | Restituisce un puntatore condiviso che punta all'oggetto che rappresenta lo stream di output standard. |
| static [Mute](./mute/)(bool) | Silenzia o riattiva lo stream di output standard. |
| static [ReadKey](./readkey/)() | NON IMPLEMENTATO. |
| static [SetError](./seterror/)(const SharedPtr\<System::IO::TextWriter\>\&) | Assegna l'oggetto specificato alla proprietà Error della classe. |
| static [SetIn](./setin/)(const SharedPtr\<System::IO::TextReader\>\&) | Imposta la proprietà In sull'oggetto TextReader specificato. |
| static [SetOut](./setout/)(const SharedPtr\<System::IO::TextWriter\>\&) | Assegna l'oggetto specificato alla proprietà Out della classe. |
| static [Write](./write/)(const SharedPtr\<T\>\&) | Emette la rappresentazione stringa dell'oggetto specificato sullo stream di output standard. |
| static [Write](./write/)(bool) | Emette la rappresentazione stringa del valore bool sullo stream di output standard. |
| static [Write](./write/)(char_t) | Stampa il valore carattere specificato sullo stream di output standard. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&) | Stampa la rappresentazione stringa dell'array di caratteri specificato sullo stream di output standard. |
| static [Write](./write/)(const Decimal\&) | Stampa la rappresentazione stringa del valore [Decimal](../decimal/) sullo stream di output standard. |
| static [Write](./write/)(double) | Stampa la rappresentazione stringa del valore a virgola mobile a doppia precisione sullo stream di output standard. |
| static [Write](./write/)(float) | Stampa la rappresentazione stringa del valore a virgola mobile a precisione singola sullo stream di output standard. |
| static [Write](./write/)(int32_t) | Stampa la rappresentazione stringa del valore intero a 32 bit sullo stream di output standard. |
| static [Write](./write/)(int64_t) | Stampa la rappresentazione stringa del valore intero a 64 bit sullo stream di output standard. |
| static [Write](./write/)(const String\&) | Stampa l'oggetto stringa specificato sullo stream di output standard. |
| static [Write](./write/)(const char_t *) | Stampa la c-string specificata sullo stream di output standard. |
| static [Write](./write/)(const TypeInfo\&) | Stampa la rappresentazione stringa del valore [TypeInfo](../typeinfo/) sullo stream di output standard. |
| static [Write](./write/)(uint32_t) | Stampa la rappresentazione stringa del valore intero senza segno a 32 bit sullo stream di output standard. |
| static [Write](./write/)(uint64_t) | Stampa la rappresentazione stringa del valore intero senza segno a 64 bit sullo stream di output standard. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | Stampa la rappresentazione stringa dell'intervallo specificato dell'array di caratteri specificato sullo stream di output standard. |
| static [Write](./write/)(const String\&, Args\&&...) | Stampa la rappresentazione stringa degli argomenti specificati formattati secondo il formato specificato sullo stream di output standard. |
| static [Write](./write/)(const char *) |  |
| static [WriteLine](./writeline/)() | Stampa il terminatore di riga corrente sullo stream di output standard. |
| static [WriteLine](./writeline/)(const SharedPtr\<T\>\&) | Stampa la rappresentazione stringa dell'oggetto specificato seguita dal terminatore di riga corrente sullo stream di output standard. |
| static [WriteLine](./writeline/)(bool) | Stampa la rappresentazione stringa del valore bool seguita dal terminatore di riga corrente sullo stream di output standard. |
| static [WriteLine](./writeline/)(char_t) | Stampa il valore carattere specificato seguito dal terminatore di riga corrente sullo stream di output standard. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | Stampa la rappresentazione stringa dell'array di caratteri specificato seguita dal terminatore di riga corrente sullo stream di output standard. |
| static [WriteLine](./writeline/)(const Decimal\&) | Stampa la rappresentazione stringa del valore [Decimal](../decimal/) seguita dal terminatore di riga corrente sullo stream di output standard. |
| static [WriteLine](./writeline/)(double) | Stampa la rappresentazione stringa del valore a virgola mobile a doppia precisione seguita dal terminatore di riga corrente sullo stream di output standard. |
| static [WriteLine](./writeline/)(float) | Stampa la rappresentazione stringa del valore a virgola mobile a precisione singola seguita dal terminatore di riga corrente sullo stream di output standard. |
| static [WriteLine](./writeline/)(int32_t) | Stampa la rappresentazione stringa del valore intero a 32 bit seguita dal terminatore di riga corrente sullo stream di output standard. |
| static [WriteLine](./writeline/)(int64_t) | Stampa la rappresentazione stringa del valore intero a 64 bit seguita dal terminatore di riga corrente sullo stream di output standard. |
| static [WriteLine](./writeline/)(const String\&) | Stampa l'oggetto stringa specificato seguito dal terminatore di riga corrente sullo stream di output standard. |
| static [WriteLine](./writeline/)(const char_t *) | Restituisce la c-string specificata seguita dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(const TypeInfo\&) | Restituisce la rappresentazione stringa del valore [TypeInfo](../typeinfo/) seguita dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(uint32_t) | Restituisce la rappresentazione stringa del valore intero senza segno a 32 bit seguita dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(uint64_t) | Restituisce la rappresentazione stringa del valore intero senza segno a 64 bit seguita dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int, int) | Restituisce la rappresentazione stringa dell'intervallo specificato dell'array di caratteri specificato seguita dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(const Exception\&) | Restituisce la rappresentazione stringa dell'oggetto [Exception](../exception/) specificato seguita dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(const String\&, Args\&&...) | Restituisce la rappresentazione stringa degli argomenti specificati formattati secondo il formato specificato seguita dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(const char *) |  |
## Osservazioni



```cpp
#include "system/console.h"
#include <array>

int main()
{
  using namespace System;

  // Stampa il messaggio di benvenuto.
  Console::WriteLine(u"Hello, world!");

  // Crea un'istanza della classe 'std::array'.
  std::array<int, 5> arr = {1, 2, 3, 4, 5};

  // Stampa gli elementi dell'array.
  for (auto el: arr)
  {
    Console::Write(u"{0} ", el);
  }
  Console::WriteLine();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
1 2 3 4 5
*/
```

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
