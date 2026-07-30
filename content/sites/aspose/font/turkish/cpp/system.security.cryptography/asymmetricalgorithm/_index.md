---
title: "System::Security::Cryptography::AsymmetricAlgorithm class"
linktitle: "AsymmetricAlgorithm"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::AsymmetricAlgorithm sınıfı. Asimetrik şifreleme algoritmaları için soyut temel sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tür bir örnek asla yığına (stack) ya da operator new ile oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 200
url: /tr/cpp/system.security.cryptography/asymmetricalgorithm/
---
## AsymmetricAlgorithm class


Asimetrik şifreleme algoritmaları için soyut temel sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tür bir örnek asla yığına (stack) ya da operator new ile oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class AsymmetricAlgorithm : public virtual System::Object,
                            public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clear](./clear/)() | Tüm kaynakları serbest bırakır. |
| static [Create](./create/)() | Varsayılan bir algoritma oluşturur. Henüz uygulanmadı. |
| static [Create](./create/)(const String\&) | İsme göre bir algoritma oluşturur. Henüz uygulanmadı. |
| [Dispose](./dispose/)() override | Geçerli nesnenin sahip olduğu kaynakları serbest bırakır. |
| virtual [FromXmlString](./fromxmlstring/)(String) | Algoritma parametrelerini XML dizesinden okur. |
| virtual [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() | Kullanılacak anahtar değişim algoritmasını alır. |
| virtual [get_KeySize](./get_keysize/)() | RTTI bilgisi. |
| virtual [get_LegalKeySizes](./get_legalkeysizes/)() | İzin verilen anahtar boyutlarının dizisini alır. |
| virtual [get_SignatureAlgorithm](./get_signaturealgorithm/)() | Kullanılacak imza algoritmasını alır. |
| virtual [set_KeySize](./set_keysize/)(int32_t) | Anahtar boyutunu ayarlar. |
| virtual [ToXmlString](./toxmlstring/)(bool) | Algoritma parametrelerini XML dizesine yazar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
