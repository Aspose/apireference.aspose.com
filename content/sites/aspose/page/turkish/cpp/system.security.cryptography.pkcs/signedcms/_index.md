---
title: "System::Security::Cryptography::Pkcs::SignedCms sınıfı"
linktitle: "SignedCms"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::Pkcs::SignedCms sınıfı. CMS/PKCS #7 standardına göre içeriği imzalar. Henüz uygulanmadı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 300
url: /tr/cpp/system.security.cryptography.pkcs/signedcms/
---
## SignedCms class


CMS/PKCS #7 standardına göre içeriği imzalar. Henüz uygulanmadı. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class SignedCms : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ComputeSignature](./computesignature/)(const SharedPtr\<CmsSigner\>\&, bool) | Bir imza oluşturur. |
| [Encode](./encode/)() | CMS/PKCS #7 mesajını kodlar. |
| [SignedCms](./signedcms/)(const SharedPtr\<ContentInfo\>\&, bool) | Yapıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Page for C++](../../)
