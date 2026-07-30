---
title: "System::Security::Cryptography::RC2Managed classe"
linktitle: "RC2Managed"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::RC2Managed classe. Algoritmo RC2 gestito. Sono supportate solo le modalità di cifratura ECB, CFB e CBC. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 2800
url: /it/cpp/system.security.cryptography/rc2managed/
---
## RC2Managed class


Algoritmo [RC2](../rc2/) gestito. Sono supportate solo le modalità di cifratura ECB, CFB e CBC. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarla alle funzioni come argomento.

```cpp
class RC2Managed : public System::Security::Cryptography::RC2
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

* Class [RC2](../rc2/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
