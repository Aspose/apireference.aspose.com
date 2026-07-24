---
title: "System::Security::Cryptography::Pkcs::CmsSigner sınıfı"
linktitle: "CmsSigner"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::Pkcs::CmsSigner sınıfı. CMS kullanarak nesneleri imzalamak için API sağlar. Kendisi nesneleri imzalamaz, bunun için SignedCMS sınıfını kullanın. Uygulanmamıştır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin C++'de."
type: docs
weight: 100
url: /tr/cpp/system.security.cryptography.pkcs/cmssigner/
---
## CmsSigner class


CMS kullanarak nesneleri imzalamak için API sağlar. Kendisi nesneleri imzalamaz, bunun için SignedCMS sınıfını kullanın. Uygulanmamıştır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class CmsSigner : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CmsSigner](./cmssigner/)(const SharedPtr\<X509Certificates::X509Certificate2\>\&) | İmzacıyı X509 sertifikasıyla başlatır. |
| [get_DigestAlgorithm](./get_digestalgorithm/)() const | İmza ile kullanılan hash algoritmasını alır. |
| [get_IncludeOption](./get_includeoption/)() const | Zincirdeki hangi sertifikaların imzaya dahil edileceğini kontrol eder. |
| [set_DigestAlgorithm](./set_digestalgorithm/)(const SharedPtr\<Oid\>\&) | İmza ile kullanılan hash algoritmasını ayarlar. |
| [set_IncludeOption](./set_includeoption/)(X509Certificates::X509IncludeOption) | İmzaya zincirden hangi sertifikaların dahil edileceğini belirtir. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Page for C++](../../)
