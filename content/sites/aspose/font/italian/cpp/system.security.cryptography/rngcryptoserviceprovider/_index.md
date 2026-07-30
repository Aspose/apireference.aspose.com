---
title: "System::Security::Cryptography::RNGCryptoServiceProvider class"
linktitle: "RNGCryptoServiceProvider"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::RNGCryptoServiceProvider class. Generatore di numeri casuali che segue la nozione CSP. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 3300
url: /it/cpp/system.security.cryptography/rngcryptoserviceprovider/
---
## RNGCryptoServiceProvider class


Generatore di numeri casuali che segue la nozione CSP. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class RNGCryptoServiceProvider : public System::Security::Cryptography::RandomNumberGenerator
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) override | Riempie gli elementi dell'array esistente con byte casuali. |
| [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) override | Riempie gli elementi della vista dell'array esistente con byte casuali. |
| [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) override | Riempie gli elementi dell'array esistente con byte casuali diversi da zero. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) override | Riempie gli elementi della vista dell'array esistente con byte casuali diversi da zero. |
| [RNGCryptoServiceProvider](./rngcryptoserviceprovider/)() | Costruttore. |
| virtual [~RNGCryptoServiceProvider](./~rngcryptoserviceprovider/)() | Distruttore. |
## Vedi anche

* Class [RandomNumberGenerator](../randomnumbergenerator/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
