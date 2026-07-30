---
title: "Classe System::ConsoleOutput"
linktitle: "ConsoleOutput"
second_title: "Aspose.Font per C++"
description: "Classe System::ConsoleOutput. Rappresenta lo stream di output standard. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1500
url: /it/cpp/system/consoleoutput/
---
## ConsoleOutput class


Rappresenta lo stream di output standard. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class ConsoleOutput : public System::IO::TextWriter
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | Restituisce sempre la codifica ASCII. |
| [Write](./write/)(bool) override | Emette la rappresentazione stringa del valore bool specificato sullo stream di output rappresentato dall'oggetto corrente. |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | Emette la rappresentazione stringa dell'oggetto specificato sullo stream di output rappresentato dall'oggetto corrente. |
| [Write](./write/)(char_t) override | Emette il valore del carattere specificato sullo stream di output rappresentato dall'oggetto corrente. |
| [Write](./write/)(Decimal) override | Emette la rappresentazione stringa del valore [Decimal](../decimal/) sullo stream di output rappresentato dall'oggetto corrente. |
| [Write](./write/)(double) override | Emette la rappresentazione stringa del valore a virgola mobile a doppia precisione sullo stream di output rappresentato dall'oggetto corrente. |
| [Write](./write/)(int32_t) override | Scrive la rappresentazione stringa del valore intero a 32 bit nel flusso di output rappresentato dall'oggetto corrente. |
| [Write](./write/)(int64_t) override | Scrive la rappresentazione stringa del valore intero a 64 bit nel flusso di output rappresentato dall'oggetto corrente. |
| [Write](./write/)(float) override | Scrive la rappresentazione stringa del valore a virgola mobile a precisione singola nel flusso di output rappresentato dall'oggetto corrente. |
| [Write](./write/)(const String\&) override | Scrive l'oggetto stringa specificato nel flusso di output rappresentato dall'oggetto corrente. |
| [Write](./write/)(uint32_t) override | Scrive la rappresentazione stringa del valore intero senza segno a 32 bit nel flusso di output rappresentato dall'oggetto corrente. |
| [Write](./write/)(uint64_t) override | Scrive la rappresentazione stringa del valore intero senza segno a 64 bit nel flusso di output rappresentato dall'oggetto corrente. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | Scrive la rappresentazione stringa dell'array di caratteri specificato nel flusso di output rappresentato dall'oggetto corrente. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Scrive la rappresentazione stringa di un intervallo di valori dell'array di caratteri specificato nel flusso di output rappresentato dall'oggetto corrente. |
| [Write](./write/)(const char_t *) override | Scrive la c-string specificata nel flusso di output rappresentato dall'oggetto corrente. |
| [Write](./write/)(const TypeInfo\&) override | Scrive la rappresentazione stringa dell'oggetto [TypeInfo](../typeinfo/) specificato nel flusso di output rappresentato dall'oggetto corrente. |
| [Write](./write/)(const char *) |  |
| [WriteLine](./writeline/)() override | Scrive il terminatore di riga corrente nel flusso di output rappresentato dall'oggetto corrente. |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | Scrive la rappresentazione stringa dell'oggetto specificato seguita dal terminatore di riga corrente nel flusso di output rappresentato dall'oggetto corrente. |
| [WriteLine](./writeline/)(bool) override | Scrive la rappresentazione stringa del valore bool specificato seguita dal terminatore di riga corrente nel flusso di output rappresentato dall'oggetto corrente. |
| [WriteLine](./writeline/)(char_t) override | Scrive il valore carattere specificato seguito dal terminatore di riga corrente nel flusso di output rappresentato dall'oggetto corrente. |
| [WriteLine](./writeline/)(Decimal) override | Scrive la rappresentazione stringa del valore [Decimal](../decimal/) seguita dal terminatore di riga corrente nel flusso di output rappresentato dall'oggetto corrente. |
| [WriteLine](./writeline/)(double) override | Scrive la rappresentazione stringa del valore a virgola mobile a doppia precisione seguita dal terminatore di riga corrente nel flusso di output rappresentato dall'oggetto corrente. |
| [WriteLine](./writeline/)(int) override | Scrive la rappresentazione stringa del valore intero a 32 bit seguita dal terminatore di riga corrente nel flusso di output rappresentato dall'oggetto corrente. |
| [WriteLine](./writeline/)(int64_t) override | Scrive la rappresentazione stringa del valore intero a 64 bit seguita dal terminatore di riga corrente nel flusso di output rappresentato dall'oggetto corrente. |
| [WriteLine](./writeline/)(float) override | Scrive la rappresentazione stringa del valore a virgola mobile a precisione singola seguita dal terminatore di riga corrente nel flusso di output rappresentato dall'oggetto corrente. |
| [WriteLine](./writeline/)(const String\&) override | Scrive l'oggetto stringa specificato seguito dal terminatore di riga corrente nel flusso di output rappresentato dall'oggetto corrente. |
| [WriteLine](./writeline/)(uint32_t) override | Scrive la rappresentazione stringa del valore intero senza segno a 32 bit seguita dal terminatore di riga corrente nel flusso di output rappresentato dall'oggetto corrente. |
| [WriteLine](./writeline/)(uint64_t) override | Scrive la rappresentazione stringa del valore intero senza segno a 64 bit seguita dal terminatore di riga corrente nel flusso di output rappresentato dall'oggetto corrente. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | Scrive la rappresentazione stringa dell'array di caratteri specificato seguita dal terminatore di riga corrente nel flusso di output rappresentato dall'oggetto corrente. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Scrive la rappresentazione stringa di un intervallo di valori dell'array di caratteri specificato seguita dal terminatore di riga corrente nel flusso di output rappresentato dall'oggetto corrente. |
| [WriteLine](./writeline/)(const char_t *) override | Scrive la c-string specificata seguita dal terminatore di riga corrente nel flusso di output rappresentato dall'oggetto corrente. |
| [WriteLine](./writeline/)(const TypeInfo\&) override | Restituisce la rappresentazione stringa dell'oggetto [TypeInfo](../typeinfo/) specificato, seguita dal terminatore di riga corrente, allo stream di output rappresentato dall'oggetto corrente. |
| [WriteLine](./writeline/)(const char *) |  |
## Vedi anche

* Class [TextWriter](../../system.io/textwriter/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
