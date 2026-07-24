---
title: "Classe System::IO::StreamWriter"
linktitle: "StreamWriter"
second_title: "Aspose.Page per C++"
description: "Classe System::IO::StreamWriter. Rappresenta un writer che scrive caratteri su un flusso di byte. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2300
url: /it/cpp/system.io/streamwriter/
---
## StreamWriter class


Rappresenta un writer che scrive caratteri su un flusso di byte. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class StreamWriter : public System::IO::TextWriter
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Close](./close/)() override | Chiude lo stream e rilascia le risorse acquisite. |
| [Dispose](./dispose/)() override | Rilascia tutte le risorse utilizzate dall'oggetto corrente e chiude lo stream sottostante. |
| [Flush](./flush/)() override | Svuota il contenuto del buffer nello stream sottostante e poi svuota lo stream sottostante. |
| [get_AutoFlush](./get_autoflush/)() const | Restituisce un valore che indica se il [StreamWriter](./) eseguirà il flush dei dati nello stream sottostante ogni volta che viene chiamato il metodo [StreamWriter::Write](./write/). |
| [get_BaseStream](./get_basestream/)() const | Restituisce un puntatore condiviso a un oggetto che rappresenta lo stream sottostante. |
| [get_Encoding](./get_encoding/)() override | Restituisce la codifica attualmente utilizzata. |
| [set_AutoFlush](./set_autoflush/)(bool) | Restituisce un valore che specifica se il [StreamWriter](./) deve eseguire il flush dei dati nello stream sottostante ogni volta che viene chiamato il metodo [StreamWriter::Write](./write/). |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&) | Crea un'istanza dell'oggetto [StreamWriter](./) che scrive caratteri sullo stream sottostante specificato usando la codifica UTF-8 e un buffer con dimensione predefinita di 1024 byte. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | Crea un'istanza dell'oggetto [StreamWriter](./) che scrive caratteri sullo stream sottostante specificato usando la codifica specificata e un buffer con dimensione predefinita di 1024 byte. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) | Crea un'istanza dell'oggetto [StreamWriter](./) che scrive caratteri sullo stream sottostante specificato usando la codifica specificata e un buffer della dimensione specificata. Un parametro specifica se lo stream sottostante deve essere chiuso quando l'oggetto [StreamWriter](./) viene eliminato. |
| [StreamWriter](./streamwriter/)(const String\&) | Crea un'istanza dell'oggetto [StreamWriter](./) che scrive caratteri sul file specificato usando la codifica UTF-8 e un buffer con dimensione predefinita di 1024 byte. |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&) | Crea un'istanza dell'oggetto [StreamWriter](./) che scrive caratteri sul file specificato usando la codifica specificata e un buffer con dimensione predefinita di 1024 byte. Un parametro specifica se i dati devono essere aggiunti al file o se il file deve essere sovrascritto. |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&, int) | Crea un'istanza dell'oggetto [StreamWriter](./) che scrive caratteri sul file specificato usando la codifica specificata e la dimensione del buffer. Un parametro specifica se i dati devono essere aggiunti al file o se il file deve essere sovrascritto. |
| [Write](./write/)(char_t) override | Scrive il carattere specificato sullo stream. |
| [Write](./write/)(const String\&) override | Scrive la stringa specificata sullo stream. |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | Scrive la rappresentazione testuale dell'oggetto specificato sullo stream. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | Scrive tutti i caratteri dall'array specificato sullo stream. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Scrive il sottointervallo specificato di caratteri UTF-16 dall'array di caratteri specificato sullo stream. |
| [Write](./write/)(const char_t *) override | Scrive la c-string specificata sullo stream. |
| [Write](./write/)(const System::SharedPtr\<T\>\&) | Scrive la rappresentazione testuale dell'oggetto specificato sullo stream. |
| [WriteLine](./writeline/)() override | Scrive i caratteri di terminazione di riga sullo stream. |
| [WriteLine](./writeline/)(const String\&) override | Scrive la stringa specificata seguita dai caratteri di terminazione di riga sullo stream. |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | Scrive la rappresentazione testuale dell'oggetto specificato seguita dai caratteri di terminazione di riga sullo stream. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | Scrive tutti i caratteri dall'array specificato, seguiti dai caratteri di terminazione di riga sullo stream. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Scrive il sottointervallo specificato di caratteri UTF-16 dall'array di caratteri specificato, seguiti dai caratteri di terminazione di riga sullo stream. |
| [WriteLine](./writeline/)(const char_t *) override | Scrive la c-string specificata seguita dai caratteri di terminazione di riga sullo stream. |
| [WriteLine](./writeline/)(const System::SharedPtr\<T\>\&) | Scrive la rappresentazione testuale dell'oggetto specificato seguita dai caratteri di terminazione di riga sullo stream. |
| [~StreamWriter](./~streamwriter/)() | Distruttore. |
## Vedi anche

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
