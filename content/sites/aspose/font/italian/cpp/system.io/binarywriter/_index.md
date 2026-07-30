---
title: "Classe System::IO::BinaryWriter"
linktitle: "BinaryWriter"
second_title: "Aspose.Font per C++"
description: "Classe System::IO::BinaryWriter. Rappresenta uno scrittore che scrive valori di tipi primitivi in un flusso di byte. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 900
url: /it/cpp/system.io/binarywriter/
---
## BinaryWriter class


Rappresenta uno scrittore che scrive valori di tipi primitivi in un flusso di byte. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class BinaryWriter : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [BinaryWriter](./binarywriter/)(const StreamPtr\&, const EncodingPtr\&, bool) | Crea un'istanza della classe [BinaryWriter](./) che scrive dati nello stream specificato usando la codifica specificata. |
| [Close](./close/)() | Chiude l'oggetto [BinaryWriter](./) corrente e lo stream di output sottostante. |
| [Dispose](./dispose/)() override | Rilascia tutte le risorse utilizzate dall'oggetto corrente e chiude lo stream sottostante. |
| [Flush](./flush/)() | Esegue il flush dello stream di output. |
| [get_BaseStream](./get_basestream/)() | Restituisce lo stream di output. |
| [Seek](./seek/)(int, System::IO::SeekOrigin) | Imposta la posizione del flusso rappresentato dall'oggetto corrente. |
| virtual [Write](./write/)(uint8_t) | Scrive il valore intero senza segno a 8 bit specificato nello stream di output. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int, int) | Scrive l'intervallo specificato di byte dall'array di byte specificato nello stream di output. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int, int) | Scrive l'intervallo specificato di caratteri UTF-16 dall'array di caratteri specificato nello stream di output. |
| virtual [Write](./write/)(bool) | Scrive un byte singolo con valore 0 se **value** è 'true' e 1 se **value** è 'false' nello stream di output. |
| virtual [Write](./write/)(char16_t) | Scrive il valore del carattere a larghezza 16 bit specificato nello stream di output. |
| virtual [Write](./write/)(int16_t) | Scrive il valore intero a 16 bit specificato nello stream di output. |
| virtual [Write](./write/)(int) | Scrive il valore intero a 32 bit specificato nello stream di output. |
| virtual [Write](./write/)(int64_t) | Scrive il valore intero a 64 bit specificato nello stream di output. |
| virtual [Write](./write/)(uint16_t) | Scrive il valore intero senza segno a 16 bit specificato nello stream di output. |
| virtual [Write](./write/)(uint32_t) | Scrive il valore intero senza segno a 32 bit specificato nello stream di output. |
| virtual [Write](./write/)(uint64_t) | Scrive il valore intero senza segno a 64 bit specificato nello stream di output. |
| virtual [Write](./write/)(float) | Scrive il valore in virgola mobile a precisione singola specificato nello stream di output. |
| virtual [Write](./write/)(double) | Scrive il valore in virgola mobile a doppia precisione specificato nello stream di output. |
| virtual [Write](./write/)(const Decimal\&) | Scrive la rappresentazione in byte del valore [Decimal](../../system/decimal/) specificato nello stream di output. |
| virtual [Write](./write/)(const String\&) | Scrive una stringa con prefisso di lunghezza nella codifica corrente nello stream di output. |
| virtual [Write](./write/)(const char_t *) | Scrive una stringa con prefisso di lunghezza nella codifica corrente nello stream di output. |
| [~BinaryWriter](./~binarywriter/)() | Distruttore. |
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
