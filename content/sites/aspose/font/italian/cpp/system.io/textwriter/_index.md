---
title: "Classe System::IO::TextWriter"
linktitle: "TextWriter"
second_title: "Aspose.Font per C++"
description: "Classe System::IO::TextWriter. Una classe base per le classi che rappresentano scrittori che scrivono sequenze di caratteri verso destinazioni diverse. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2700
url: /it/cpp/system.io/textwriter/
---
## TextWriter class


Una classe base per le classi che rappresentano scrittori che scrivono sequenze di caratteri verso destinazioni diverse. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class TextWriter : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Close](./close/)() | Chiude lo stream e rilascia le risorse acquisite. |
| [Dispose](./dispose/)() override | Rilascia tutte le risorse utilizzate dall'oggetto corrente e chiude lo stream sottostante. |
| virtual [Flush](./flush/)() | Svuota il contenuto del buffer nello stream sottostante. |
| virtual [get_Encoding](./get_encoding/)() | Restituisce la codifica attualmente utilizzata. |
| virtual [get_FormatProvider](./get_formatprovider/)() const | Restituisce l'oggetto [IFormatProvider](../../system/iformatprovider/) attualmente utilizzato. |
| [get_FormatProvider](./get_formatprovider/)() | Restituisce l'oggetto [IFormatProvider](../../system/iformatprovider/) attualmente utilizzato. |
| virtual [get_NewLine](./get_newline/)() const | Restituisce una stringa terminatore di riga. |
| [get_NewLine](./get_newline/)() | Restituisce una stringa terminatore di riga. |
| virtual [set_NewLine](./set_newline/)(const System::String\&) | Imposta una stringa terminatore di riga. |
| virtual [Write](./write/)(const SharedPtr\<Object\>\&) | Scrive la rappresentazione stringa dell'oggetto specificato nello stream. |
| virtual [Write](./write/)(bool) | Scrive la rappresentazione stringa del valore booleano specificato nello stream. |
| virtual [Write](./write/)(char_t) | Scrive il carattere specificato nello stream. |
| virtual [Write](./write/)(Decimal) | Scrive la rappresentazione stringa dell'oggetto [Decimal](../../system/decimal/) specificato nel flusso. |
| virtual [Write](./write/)(double) | Scrive la rappresentazione stringa del valore a virgola mobile a doppia precisione specificato nel flusso. |
| virtual [Write](./write/)(int) | Scrive la rappresentazione stringa del valore intero a 32 bit specificato nel flusso. |
| virtual [Write](./write/)(int64_t) | Scrive la rappresentazione stringa del valore intero a 64 bit specificato nel flusso. |
| virtual [Write](./write/)(float) | Scrive la rappresentazione stringa del valore a virgola mobile a precisione singola specificato nel flusso. |
| virtual [Write](./write/)(const String\&) | Scrive la stringa specificata nel flusso. |
| virtual [Write](./write/)(uint32_t) | Scrive la rappresentazione stringa del valore intero senza segno a 32 bit specificato nel flusso. |
| virtual [Write](./write/)(uint64_t) | Scrive la rappresentazione stringa del valore intero senza segno a 64 bit specificato nel flusso. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&) | Scrive tutti i caratteri dell'array specificato nel flusso. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | Scrive l'intervallo specificato di caratteri UTF-16 dall'array di caratteri specificato nel flusso. |
| virtual [Write](./write/)(const char_t *) | Scrive la c-string specificata nel flusso. |
| virtual [Write](./write/)(const TypeInfo\&) | Scrive la rappresentazione stringa dell'oggetto [TypeInfo](../../system/typeinfo/) specificato nel flusso. |
| [Write](./write/)(const String\&, const TArgs\&...) | Scrive i valori specificati formattati secondo il formato specificato nel flusso. |
| virtual [WriteLine](./writeline/)() | Scrive i caratteri di terminazione di riga nel flusso. |
| virtual [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) | Scrive la rappresentazione stringa dell'oggetto specificato seguita dai caratteri di terminazione di riga nel flusso. |
| virtual [WriteLine](./writeline/)(bool) | Scrive la rappresentazione stringa del valore booleano specificato seguita dai caratteri di terminazione di riga nel flusso. |
| virtual [WriteLine](./writeline/)(char_t) | Scrive il carattere specificato seguito dai caratteri di terminazione di riga nel flusso. |
| virtual [WriteLine](./writeline/)(Decimal) | Scrive la rappresentazione stringa dell'oggetto [Decimal](../../system/decimal/) specificato seguita dai caratteri di terminazione di riga nel flusso. |
| virtual [WriteLine](./writeline/)(double) | Scrive la rappresentazione stringa del valore a virgola mobile a doppia precisione specificato seguita dai caratteri di terminazione di riga nel flusso. |
| virtual [WriteLine](./writeline/)(int) | Scrive la rappresentazione stringa del valore intero a 32 bit specificato seguita dai caratteri di terminazione di riga nel flusso. |
| virtual [WriteLine](./writeline/)(int64_t) | Scrive la rappresentazione stringa del valore intero a 64 bit specificato seguita dai caratteri di terminazione di riga nel flusso. |
| virtual [WriteLine](./writeline/)(float) | Scrive la rappresentazione stringa del valore a virgola mobile a precisione singola specificato seguita dai caratteri di terminazione di riga nel flusso. |
| virtual [WriteLine](./writeline/)(const String\&) | Scrive la stringa specificata seguita dai caratteri di terminazione di riga nel flusso. |
| virtual [WriteLine](./writeline/)(uint32_t) | Scrive la rappresentazione stringa del valore intero senza segno a 32 bit specificato seguita dai caratteri di terminazione di riga nel flusso. |
| virtual [WriteLine](./writeline/)(uint64_t) | Scrive la rappresentazione stringa del valore intero senza segno a 64 bit specificato seguita dai caratteri di terminazione di riga nel flusso. |
| virtual [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | Scrive tutti i caratteri dall'array specificato, seguiti dai caratteri di terminazione di riga, nel flusso. |
| virtual [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | Scrive l'intervallo specificato di caratteri UTF-16 dall'array di caratteri specificato, seguito dai caratteri di terminazione di riga, nel flusso. |
| virtual [WriteLine](./writeline/)(const char_t *) | Scrive la c-string specificata, seguita dai caratteri di terminazione di riga, nel flusso. |
| virtual [WriteLine](./writeline/)(const TypeInfo\&) | Scrive la rappresentazione stringa dell'oggetto [TypeInfo](../../system/typeinfo/) specificato, seguita dai caratteri di terminazione di riga, nel flusso. |
| [WriteLine](./writeline/)(const String\&, const TArgs\&...) | Scrive i valori specificati formattati secondo il formato specificato, seguiti dai caratteri nel flusso. |
| virtual [~TextWriter](./~textwriter/)() | Distruttore. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a questa classe. |
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
