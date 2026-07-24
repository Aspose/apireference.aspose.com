---
title: "System::Security::Cryptography::AsnEncodedData classe"
linktitle: "AsnEncodedData"
second_title: "Aspose.Page per C++"
description: "Classe System::Security::Cryptography::AsnEncodedData. Dati codificati ASN.1. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.security.cryptography/asnencodeddata/
---
## AsnEncodedData class


Dati codificati ASN.1. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class AsnEncodedData : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<AsnEncodedData\>\&) | Informazioni RTTI. |
| [AsnEncodedData](./asnencodeddata/)(const ByteArrayPtr\&) | Costruttore. |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&) | Costruttore. |
| [AsnEncodedData](./asnencodeddata/)(const String\&, const ByteArrayPtr\&) | Costruttore. |
| virtual [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) | Copia i dati da un oggetto diverso. |
| virtual [Format](./format/)(bool) const | Formatta i dati in forma leggibile dall'uomo. |
| [get_Oid](./get_oid/)() const | Ottiene l'identificatore dell'oggetto dei dati codificati. |
| [get_RawData](./get_rawdata/)() const | Ottiene i dati codificati grezzi. |
| [set_Oid](./set_oid/)(const SharedPtr\<Oid\>\&) | Imposta l'identificatore dell'oggetto dei dati codificati. |
| [set_RawData](./set_rawdata/)(const ByteArrayPtr\&) | Imposta i dati codificati grezzi. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
