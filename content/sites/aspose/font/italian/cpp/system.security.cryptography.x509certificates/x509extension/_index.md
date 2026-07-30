---
title: "System::Security::Cryptography::X509Certificates::X509Extension classe"
linktitle: "X509Extension"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::X509Certificates::X509Extension class. Oggetto di estensione per conservare informazioni aggiuntive associate al certificato X.509. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1200
url: /it/cpp/system.security.cryptography.x509certificates/x509extension/
---
## X509Extension class


Oggetto di estensione per conservare informazioni aggiuntive associate al certificato X.509. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class X509Extension : public System::Security::Cryptography::AsnEncodedData
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | Copia i dati dell'estensione da un altro oggetto. |
| [get_Critical](./get_critical/)() const | Verifica se l'estensione è critica. |
| [set_Critical](./set_critical/)(bool) | Definisce se l'estensione è critica. |
| [X509Extension](./x509extension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | Informazioni RTTI. |
| [X509Extension](./x509extension/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&, bool) | Costruttore. |
| [X509Extension](./x509extension/)(const String\&, const ByteArrayPtr\&, bool) | Costruttore. |
## Vedi anche

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
