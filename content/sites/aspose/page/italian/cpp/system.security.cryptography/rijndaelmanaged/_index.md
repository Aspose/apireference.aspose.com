---
title: "Classe System::Security::Cryptography::RijndaelManaged"
linktitle: "RijndaelManaged"
second_title: "Aspose.Page per C++"
description: "Classe System::Security::Cryptography::RijndaelManaged. Algoritmo Rijndael gestito. Supporta solo le modalità ECB e CFB con padding None e la modalità CBC con padding None e Zeros. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 3100
url: /it/cpp/system.security.cryptography/rijndaelmanaged/
---
## RijndaelManaged class


Algoritmo [Rijndael](../rijndael/) gestito. Supporta solo le modalità ECB e CFB con padding None e la modalità CBC con padding None e Zeros. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class RijndaelManaged : public System::Security::Cryptography::Rijndael
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Crea un oggetto decryptor con parametri espliciti. |
| virtual [CreateDecryptor](./createdecryptor/)() | Crea un oggetto decryptor con parametri definiti dall'oggetto algoritmo. |
| [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Crea un oggetto encryptor con parametri espliciti. |
| virtual [CreateEncryptor](./createencryptor/)() | Crea un oggetto encryptor con parametri definiti dall'oggetto algoritmo. |
| [GenerateIV](./generateiv/)() override | Crea un valore iniziale casuale e lo memorizza negli interni dell'algoritmo. |
| [GenerateKey](./generatekey/)() override | Crea una chiave casuale e la memorizza negli interni dell'algoritmo. |
## Vedi anche

* Class [Rijndael](../rijndael/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
