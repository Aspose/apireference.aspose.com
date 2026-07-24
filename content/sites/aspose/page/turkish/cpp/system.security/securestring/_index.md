---
title: "System::Security::SecureString sınıfı"
linktitle: "SecureString"
second_title: "Aspose.Page için C++"
description: "System::Security::SecureString sınıfı. Güvenli dize, gizli tutulması gereken metni temsil eder. Bu sınıf iç verileri ŞİFRELEMEZ. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirin."
type: docs
weight: 100
url: /tr/cpp/system.security/securestring/
---
## SecureString class


Güvenli dize, gizli tutulması gereken metni temsil eder. Bu sınıf iç verileri ŞİFRELEMEZ. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class SecureString : public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AppendChar](./appendchar/)(char16_t) | Dizgenin sonuna bir karakter ekler. |
| [Clear](./clear/)() | Mevcut güvenli dizeden tüm karakterleri sil. |
| [Copy](./copy/)() const | Bu güvenli dizenin bir kopyasını oluşturur. |
| [Dispose](./dispose/)() override | Mevcut nesne tarafından kullanılan tüm kaynakları serbest bırakır. |
| [get_Length](./get_length/)() const | Bu güvenli dizedeki karakter sayısını alır. |
| [InsertAt](./insertat/)(int32_t, char16_t) | Belirtilen indeksde bir karakter ekler. |
| [IsReadOnly](./isreadonly/)() const | Bu nesnenin yalnızca okunur olarak işaretlenip işaretlenmediğini gösteren bayrağı alır. |
| [MakeReadOnly](./makereadonly/)() | Bu güvenli dizeyi yalnızca okunur yapar. |
| [operator=](./operator=/)(const SecureString\&) |  |
| [RemoveAt](./removeat/)(int32_t) | Belirtilen konumdaki karakteri kaldırır. |
| [SecureString](./securestring/)() | RTTI bilgisi. |
| [SecureString](./securestring/)(const char16_t *, int32_t) | Yapıcı. |
| [SecureString](./securestring/)(const SecureString\&) |  |
| [SetAt](./setat/)(int32_t, char16_t) | Belirtilen konumdaki mevcut karakteri değiştirir. |
| [ToUnsecureString](./tounsecurestring/)() const | Bu güvenli dizedeki içeriği güvensiz [String](../../system/string/) nesnesine kopyalar. Dikkatli kullanın. |
| [~SecureString](./~securestring/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security](../)
* Library [Aspose.Page for C++](../../)
