---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension classe"
linktitle: "X509KeyUsageExtension"
second_title: "Aspose.Page per C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension classe. Oggetto di estensione per conservare informazioni aggiuntive sull'uso di una chiave. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1600
url: /it/cpp/system.security.cryptography.x509certificates/x509keyusageextension/
---
## X509KeyUsageExtension class


Oggetto di estensione per conservare informazioni aggiuntive sull'uso di una chiave. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarla alle funzioni come argomento.

```cpp
class X509KeyUsageExtension : public System::Security::Cryptography::X509Certificates::X509Extension
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | Copia i dati dell'estensione da un altro oggetto. |
| [get_KeyUsages](./get_keyusages/)() | Ottiene gli usi della chiave. |
| [X509KeyUsageExtension](./x509keyusageextension/)() | Informazioni RTTI. |
| [X509KeyUsageExtension](./x509keyusageextension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | Costruttore. |
| [X509KeyUsageExtension](./x509keyusageextension/)(X509KeyUsageFlags, bool) | Costruttore. |
## Vedi anche

* Class [X509Extension](../x509extension/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
