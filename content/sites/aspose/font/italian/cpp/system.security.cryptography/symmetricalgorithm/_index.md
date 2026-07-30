---
title: "System::Security::Cryptography::SymmetricAlgorithm classe"
linktitle: "SymmetricAlgorithm"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::SymmetricAlgorithm classe. Algoritmo simmetrico che utilizza la stessa chiave per la crittografia e la decrittografia, classe base. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando operator new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 4900
url: /it/cpp/system.security.cryptography/symmetricalgorithm/
---
## SymmetricAlgorithm class


Algoritmo simmetrico che utilizza la stessa chiave per la crittografia e la decrittografia, classe base. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando operator new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarla alle funzioni come argomento.

```cpp
class SymmetricAlgorithm : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [Create](./create/)(const String\&) | Crea un'istanza dell'algoritmo. |
| virtual [CreateDecryptor](./createdecryptor/)() | Crea un decryptor con i parametri associati all'oggetto algoritmo. |
| virtual [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Crea un decryptor con parametri espliciti. |
| virtual [CreateEncryptor](./createencryptor/)() | Crea un encryptor con i parametri associati all'oggetto algoritmo. |
| virtual [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Crea un encryptor con parametri espliciti. |
| virtual [GenerateIV](./generateiv/)() | Genera un valore iniziale casuale per l'algoritmo. Sovrascrive quello esistente (se presente). |
| virtual [GenerateKey](./generatekey/)() | Genera una chiave casuale per l'algoritmo. Sovrascrive quella esistente (se presente). |
| virtual [get_BlockSize](./get_blocksize/)() | Ottiene la dimensione del blocco dell'operazione crittografica. |
| virtual [get_FeedbackSize](./get_feedbacksize/)() | Ottiene la dimensione del feedback dell'operazione crittografica. |
| virtual [get_IV](./get_iv/)() | Ottiene il valore iniziale dell'operazione crittografica. Crea un nuovo valore se non è ancora stato creato. |
| virtual [get_Key](./get_key/)() | Ottiene la chiave dell'operazione crittografica. Crea una nuova chiave se non è ancora stata creata. |
| virtual [get_KeySize](./get_keysize/)() | Ottiene la dimensione della chiave dell'operazione crittografica. |
| virtual [get_Mode](./get_mode/)() | Ottiene la modalità dell'operazione crittografica. |
| virtual [get_Padding](./get_padding/)() | Ottiene il padding dell'operazione crittografica. |
| virtual [set_BlockSize](./set_blocksize/)(int) | Imposta la dimensione del blocco dell'operazione crittografica. |
| virtual [set_FeedbackSize](./set_feedbacksize/)(int) | Imposta la dimensione del feedback dell'operazione crittografica. |
| virtual [set_IV](./set_iv/)(System::ArrayPtr\<uint8_t\>) | Imposta il valore iniziale dell'operazione crittografica. |
| virtual [set_Key](./set_key/)(System::ArrayPtr\<uint8_t\>) | Imposta la chiave dell'operazione crittografica. |
| virtual [set_KeySize](./set_keysize/)(int) | Imposta la dimensione della chiave dell'operazione crittografica. |
| virtual [set_Mode](./set_mode/)(CipherMode) | Imposta la modalità dell'operazione crittografica. |
| virtual [set_Padding](./set_padding/)(PaddingMode) | Imposta il padding dell'operazione crittografica. |
| [ValidKeySize](./validkeysize/)(int) | Verifica se la dimensione della chiave è valida. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
