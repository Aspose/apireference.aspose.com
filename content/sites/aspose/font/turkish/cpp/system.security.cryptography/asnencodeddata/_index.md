---
title: "System::Security::Cryptography::AsnEncodedData class"
linktitle: "AsnEncodedData"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::AsnEncodedData sınıfı. ASN.1 kodlu veri. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın C++'ta."
type: docs
weight: 100
url: /tr/cpp/system.security.cryptography/asnencodeddata/
---
## AsnEncodedData class


ASN.1 kodlu veri. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class AsnEncodedData : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<AsnEncodedData\>\&) | RTTI bilgisi. |
| [AsnEncodedData](./asnencodeddata/)(const ByteArrayPtr\&) | Yapıcı. |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&) | Yapıcı. |
| [AsnEncodedData](./asnencodeddata/)(const String\&, const ByteArrayPtr\&) | Yapıcı. |
| virtual [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) | Farklı nesneden veri kopyalar. |
| virtual [Format](./format/)(bool) const | Veriyi insan tarafından okunabilir biçimde biçimlendirir. |
| [get_Oid](./get_oid/)() const | Kodlanmış verinin nesne tanımlayıcısını alır. |
| [get_RawData](./get_rawdata/)() const | Ham kodlanmış veriyi alır. |
| [set_Oid](./set_oid/)(const SharedPtr\<Oid\>\&) | Kodlanmış verinin nesne tanımlayıcısını ayarlar. |
| [set_RawData](./set_rawdata/)(const ByteArrayPtr\&) | Ham kodlanmış veriyi ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
