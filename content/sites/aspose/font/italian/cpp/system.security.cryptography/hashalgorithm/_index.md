---
title: "classe System::Security::Cryptography::HashAlgorithm"
linktitle: "HashAlgorithm"
second_title: "Aspose.Font per C++"
description: "classe System::Security::Cryptography::HashAlgorithm. Classe base per gli algoritmi di hashing. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo nello stack o usando l'operatore new, poiché causerà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1600
url: /it/cpp/system.security.cryptography/hashalgorithm/
---
## HashAlgorithm class


Classe base per gli algoritmi di hashing. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo nello stack o usando l'operatore new, poiché causerà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class HashAlgorithm : public System::Security::Cryptography::ICryptoTransform
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&) | Esegue l'hash del buffer. |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&, int, int) | Esegue l'hash di una porzione del buffer. |
| [ComputeHash](./computehash/)(SharedPtr\<IO::Stream\> const\&) | Legge lo stream fino alla fine e calcola l'hash per i dati letti. |
| static [Create](./create/)(const String\&) | Crea un algoritmo di hash basato sul nome. |
| virtual [get_Hash](./get_hash/)() | Ottiene il valore del codice hash calcolato. |
| virtual [get_HashSize](./get_hashsize/)() | Ottiene la dimensione del valore hash calcolato in byte. |
| [get_InputBlockSize](./get_inputblocksize/)() override | Dimensione del blocco di input. |
| [get_OutputBlockSize](./get_outputblocksize/)() override | Dimensione del blocco di output. |
| virtual [Initialize](./initialize/)() | Reimposta l'hash in stato iniziale. |
| [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | Elabora un blocco di dati e copia i dati nell'array di output. |
| [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) override | Elabora l'ultimo blocco di dati e calcola l'hash. |
| virtual [~HashAlgorithm](./~hashalgorithm/)() | Distruttore. |
## Vedi anche

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
