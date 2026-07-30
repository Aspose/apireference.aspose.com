---
title: "System::Security::Cryptography::RSAPKCS1SignatureFormatter classe"
linktitle: "RSAPKCS1SignatureFormatter"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureFormatter classe. Firma i dati con una firma RSA PKCS #1 v1.5. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 3800
url: /it/cpp/system.security.cryptography/rsapkcs1signatureformatter/
---
## RSAPKCS1SignatureFormatter class


Firma i dati con una firma [RSA](../rsa/) PKCS # 1 v1.5. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class RSAPKCS1SignatureFormatter : public System::Security::Cryptography::AsymmetricSignatureFormatter
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) override | Firma i dati. |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)() | Informazioni RTTI. |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | Costruttore. |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | Imposta l'algoritmo hash da utilizzare. |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | Imposta il valore della chiave. Non implementato. |
| [~RSAPKCS1SignatureFormatter](./~rsapkcs1signatureformatter/)() | Distruttore. |
## Vedi anche

* Class [AsymmetricSignatureFormatter](../asymmetricsignatureformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
