---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter classe"
linktitle: "RSAPKCS1SignatureDeformatter"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter classe. Classe per verificare la firma RSA PKCS #1 v1.5. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 3700
url: /it/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/
---
## RSAPKCS1SignatureDeformatter class


Classe per verificare la firma [RSA](../rsa/) PKCS # 1 v1.5. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarla alle funzioni come argomento.

```cpp
class RSAPKCS1SignatureDeformatter : public System::Security::Cryptography::AsymmetricSignatureDeformatter
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [RSAPKCS1SignatureDeformatter](./rsapkcs1signaturedeformatter/)() | Informazioni RTTI. |
| [RSAPKCS1SignatureDeformatter](./rsapkcs1signaturedeformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | Costruttore. |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | Imposta l'algoritmo hash da utilizzare. |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | Imposta il valore della chiave. Non implementato. |
| [VerifySignature](./verifysignature/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Verifica la firma dell'hash dei dati. |
## Vedi anche

* Class [AsymmetricSignatureDeformatter](../asymmetricsignaturedeformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
