---
title: "System::Security::Cryptography::AsnEncodedData classe"
linktitle: "AsnEncodedData"
second_title: "Aspose.Font per C++"
description: "Classe System::Security::Cryptography::AsnEncodedData. Dati codificati ASN.1. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 100
url: /it/cpp/system.security.cryptography/asnencodeddata/
---
## AsnEncodedData class


Dati codificati ASN.1. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

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
* Library [Aspose.Font for C++](../../)
