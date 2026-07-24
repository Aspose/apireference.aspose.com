---
title: "classe System::Security::Cryptography::RNGCryptoServiceProvider"
linktitle: "RNGCryptoServiceProvider"
second_title: "Aspose.Page per C++"
description: "classe System::Security::Cryptography::RNGCryptoServiceProvider. Generatore di numeri casuali che segue la nozione CSP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 3300
url: /it/cpp/system.security.cryptography/rngcryptoserviceprovider/
---
## RNGCryptoServiceProvider class


Generatore di numeri casuali che segue la nozione CSP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarla alle funzioni come argomento.

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
* Library [Aspose.Page for C++](../../)
