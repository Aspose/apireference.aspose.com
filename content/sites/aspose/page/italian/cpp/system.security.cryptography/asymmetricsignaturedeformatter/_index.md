---
title: "System::Security::Cryptography::AsymmetricSignatureDeformatter class"
linktitle: "AsymmetricSignatureDeformatter"
second_title: "Aspose.Page per C++"
description: "System::Security::Cryptography::AsymmetricSignatureDeformatter class. Classe base per i deformatore di firme asimmetriche. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.security.cryptography/asymmetricsignaturedeformatter/
---
## AsymmetricSignatureDeformatter class


Classe base per i deformatore di firme asimmetriche. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarla alle funzioni come argomento.

```cpp
class AsymmetricSignatureDeformatter : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | Informazioni RTTI. |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | Imposta la chiave da utilizzare con l'algoritmo. |
| virtual [VerifySignature](./verifysignature/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Verifica la firma sui dati. |
| virtual [VerifySignature](./verifysignature/)(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) | Verifica la firma sui dati. Non implementato. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
