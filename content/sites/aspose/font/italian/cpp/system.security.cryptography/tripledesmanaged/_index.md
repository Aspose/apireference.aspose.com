---
title: "Classe System::Security::Cryptography::TripleDESManaged"
linktitle: "TripleDESManaged"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::TripleDESManaged class. Implementazione gestita di TripleDES. Supporta solo le modalità ECB e CFB con padding None e la modalità CBC con padding None, Zeros e PKCS7. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 5200
url: /it/cpp/system.security.cryptography/tripledesmanaged/
---
## TripleDESManaged class


Implementazione gestita di [TripleDES](../tripledes/). Supporta solo le modalità ECB e CFB con padding None e la modalità CBC con padding None, Zeros e PKCS7. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarla alle funzioni come argomento.

```cpp
class TripleDESManaged : public System::Security::Cryptography::TripleDES
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Crea un oggetto decryptor con parametri espliciti. |
| virtual [CreateDecryptor](./createdecryptor/)() | Crea un oggetto decryptor con parametri definiti dall'oggetto algoritmo. |
| [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Crea un oggetto encryptor con parametri espliciti. |
| virtual [CreateEncryptor](./createencryptor/)() | Crea un oggetto encryptor con parametri definiti dall'oggetto algoritmo. |
| [GenerateIV](./generateiv/)() override | Crea un valore iniziale casuale e lo memorizza negli internali dell'algoritmo. |
| [GenerateKey](./generatekey/)() override | Crea una chiave casuale e la memorizza negli internali dell'algoritmo. |
## Vedi anche

* Class [TripleDES](../tripledes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
